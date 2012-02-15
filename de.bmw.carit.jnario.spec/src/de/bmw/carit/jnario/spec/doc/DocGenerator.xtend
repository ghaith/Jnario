package de.bmw.carit.jnario.spec.doc

import com.google.inject.Inject
import de.bmw.carit.jnario.common.ExampleTable
import de.bmw.carit.jnario.common.jvmmodel.ExtendedJvmTypesBuilder
import de.bmw.carit.jnario.spec.naming.ExampleNameProvider
import de.bmw.carit.jnario.spec.spec.Example
import de.bmw.carit.jnario.spec.spec.ExampleGroup
import de.bmw.carit.jnario.spec.spec.SpecFile
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.serializer.ISerializer
import org.eclipse.xtext.xbase.XBlockExpression
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xtend2.xtend2.XtendMember
import org.pegdown.PegDownProcessor

import static de.bmw.carit.jnario.spec.util.Strings.*

import static extension org.eclipse.xtext.util.Strings.*

class DocGenerator implements IGenerator {
	
	@Inject extension ExampleNameProvider 
	@Inject extension ExtendedJvmTypesBuilder
	@Inject extension ISerializer
	@Inject extension WhiteSpaceNormalizer
	@Inject extension PegDownProcessor
	
	List<String> cssFiles = newArrayList("bootstrap.min.css", "bootstrap-responsive.min.css", "custom.css", "prettify.css")
	List<String> jsFiles = newArrayList("lang-xtend.js", "prettify.js")

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		fsa.copy("css", cssFiles)
		fsa.copy("js", jsFiles)
		for(spec : input.contents.filter(typeof(SpecFile))){
			val exampleGroup = spec.xtendClass as ExampleGroup
			if(exampleGroup != null){
				fsa.generateFile(fileName(exampleGroup), DocOutputConfigurationProvider::DOC_OUTPUT, generate(exampleGroup))
			}
			
		}
	}
	
	def fileName(ExampleGroup exampleGroup){
		val fileName = "/" + exampleGroup.toJavaClassName + ".html"
		if(exampleGroup.packageName == null){
			return fileName
		}
		return "/" + exampleGroup.packageName.replaceAll("\\.", "/") + fileName
	}
	
	def copy(IFileSystemAccess fsa, String targetFolder, Iterable<String> files){
		for(file : files){
			fsa.generateFile("/" + targetFolder + "/" + file, DocOutputConfigurationProvider::DOC_OUTPUT, load(file)) 
		}
	}
	
	def load(String file){
		val inputStream = getClass().getResourceAsStream(file)
		return convertStreamToString(inputStream)
	}	
	
	def folder(String name, ExampleGroup context){
		return root(context) + name
	}
	
	def root(ExampleGroup exampleGroup){
		val specFile = EcoreUtil2::getContainerOfType(exampleGroup, typeof(SpecFile))
		val packageName= specFile.xtendClass.packageName
		if(packageName == null){
			return ""
		}
		val fragments = packageName.split("\\.")
		val path = fragments.map(String s | "../")
		return path.join("")
	}

	def generate(ExampleGroup exampleGroup)'''
		<!DOCTYPE html>
		<html lang="en">
		<head>
		<meta charset="utf-8">
		<title>�exampleGroup.asTitle�</title>
		<meta name="description" content="">
		<meta name="author" content="Jnario">
		<meta HTTP-EQUIV="Refresh" CONTENT="5">
		
		<!-- Le HTML5 shim, for IE6-8 support of HTML elements -->
		<!--[if lt IE 9]>
		      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
		    <![endif]-->
		
		<!-- Le styles -->
		�FOR cssFile : cssFiles�
		<link rel="stylesheet" href="�folder("css", exampleGroup)�/�cssFile�">
		�ENDFOR�
		�FOR jsFile : jsFiles�
		<script type="text/javascript" src="�folder("js", exampleGroup)�/�jsFile�"></script>
		�ENDFOR�
		</head>
		
		<body onload="prettyPrint()">
			<div class="container">
				<div class="content">
					<div class="page-header">
						<h1>�exampleGroup.asTitle�</h1>
					</div>
					<div class="row">
						<div class="span12">
							<p>�exampleGroup.generateDoc()�</p>
							�FOR member : exampleGroup.members�
�generate(member, 1)�
							�ENDFOR�
						</div>
					</div>
				</div> <!-- /content -->
				<footer>
					<p><small>Generated by Jnario.</small></p>
				</footer>
		
			</div>
			<!-- /container -->
		
		</body>
		</html>
	'''
	
	def generateDoc(EObject eObject)'''
		�IF eObject.documentation != null�
			�eObject.documentation.markdownToHtml�
		�ENDIF�
	'''
	def dispatch generate(XtendMember member, int level)'''
	'''
	
	def dispatch generate(Example example, int level)'''
		<h4>�example.describe.asTitle�</h4>
		<p>
		�example.generateDoc()�
		�IF !example.pending�
		<pre class="prettyprint">
		�example.body.toXtendCode()�</pre>
		</p>
		�ENDIF�
	'''
	
	def dispatch generate(ExampleTable table, int level)'''
		<h4>�table.toFieldName.asTitle�</h4>
		<table class="table table-striped table-bordered table-condensed">
			<thead>
				<tr>
				�FOR headingCell : table.columns�
					<th>�headingCell.name�</th>
				�ENDFOR�
				</tr>
			</thead>
			<tbody>
			�FOR row : table.rows�
			<tr>
				�FOR cell : row.cells�
				<td>�toXtendCode(cell)�</td>
				�ENDFOR�
			</tr>
		  	�ENDFOR�
			</tbody>
		</table>
	'''
	
	def dispatch generate(ExampleGroup exampleGroup, int level)'''
���		�IF level > 1�
���		�ENDIF�
		<�level.heading�>�exampleGroup.asTitle�</�level.heading�>
		<div class="level">
		<p>�exampleGroup.generateDoc()�</p>
		�FOR member : exampleGroup.members�
�generate(member, level + 1)�
		�ENDFOR�
���		�IF level > 1�
		</div>
���		�ENDIF�
	'''

	def dispatch toXtendCode(XExpression expr){
		return expr.serialize().trim
	}
	
	def dispatch toXtendCode(XBlockExpression expr){
		var code = expr.serialize().trim()
		code = code.substring(1, code.length-2) 
		return code.normalize()
	}
	
	def heading(int level){
		//"h" + (if (level <= 5) level else 5)
		"h3" 
	}
	
	def dispatch asTitle(ExampleGroup exampleGroup){
		exampleGroup.describe.asTitle
	}
	
	def dispatch asTitle(Example example){
		example.describe.asTitle
	}
	
	def asTitle(String string){
		string.convertFromJavaString(true).toFirstUpper
	}
}

