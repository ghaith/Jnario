package org.jnario.jnario.tests.unit.jvmmodel;

import com.google.inject.Inject;
import com.google.inject.Provider;
import java.util.NoSuchElementException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.jvmmodel.JUnit3RuntimeSupport;
import org.jnario.jvmmodel.JUnit4RuntimeSupport;
import org.jnario.jvmmodel.TestRuntimeProvider;
import org.jnario.jvmmodel.TestRuntimeSupport;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.stubbing.OngoingStubbing;

@CreateWith(SpecTestCreator.class)
@Named("TestRuntimeProvider")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class TestRuntimeProviderSpec {
  public TestRuntimeProvider subject;
  
  @Inject
  Provider<JUnit3RuntimeSupport> junit3Support;
  
  @Inject
  Provider<JUnit4RuntimeSupport> junit4Support;
  
  final JvmType resultingType = Mockito.<JvmType>mock(JvmType.class);
  
  final TypeReferences typeReferences = Mockito.<TypeReferences>mock(TypeReferences.class);
  
  final EObject anyNotifier = Mockito.<EObject>mock(EObject.class);
  
  @Before
  public void before() throws Exception {
    TestRuntimeProvider _testRuntimeProvider = new TestRuntimeProvider(this.typeReferences, this.junit3Support, this.junit4Support);
    this.subject = _testRuntimeProvider;
  }
  
  @Test
  @Named("returns JUnit3 runtime provider if JUnit4 is not on classpath")
  @Order(1)
  public void _returnsJUnit3RuntimeProviderIfJUnit4IsNotOnClasspath() throws Exception {
    TestRuntimeProvider _testRuntimeProvider = new TestRuntimeProvider(this.typeReferences, this.junit3Support, this.junit4Support);
    this.subject = _testRuntimeProvider;
    JvmType _findDeclaredType = this.typeReferences.findDeclaredType("junit.framework.TestCase", this.anyNotifier);
    OngoingStubbing<JvmType> _when = Mockito.<JvmType>when(_findDeclaredType);
    _when.thenReturn(this.resultingType);
    TestRuntimeSupport _get = this.subject.get(this.anyNotifier);
    Assert.assertTrue("\nExpected subject.get(anyNotifier) => typeof(JUnit3RuntimeSupport) but"
     + "\n     subject.get(anyNotifier) is " + new org.hamcrest.StringDescription().appendValue(_get).toString()
     + "\n     subject is " + new org.hamcrest.StringDescription().appendValue(this.subject).toString()
     + "\n     anyNotifier is " + new org.hamcrest.StringDescription().appendValue(this.anyNotifier).toString() + "\n", Should.operator_doubleArrow(_get, JUnit3RuntimeSupport.class));
    
  }
  
  @Test
  @Named("returns JUnit4 runtime provider if JUnit4 is on classpath")
  @Order(2)
  public void _returnsJUnit4RuntimeProviderIfJUnit4IsOnClasspath() throws Exception {
    JvmType _findDeclaredType = this.typeReferences.findDeclaredType("org.junit.rules.TestRule", this.anyNotifier);
    OngoingStubbing<JvmType> _when = Mockito.<JvmType>when(_findDeclaredType);
    _when.thenReturn(this.resultingType);
    TestRuntimeSupport _get = this.subject.get(this.anyNotifier);
    Assert.assertTrue("\nExpected subject.get(anyNotifier) => typeof(JUnit4RuntimeSupport) but"
     + "\n     subject.get(anyNotifier) is " + new org.hamcrest.StringDescription().appendValue(_get).toString()
     + "\n     subject is " + new org.hamcrest.StringDescription().appendValue(this.subject).toString()
     + "\n     anyNotifier is " + new org.hamcrest.StringDescription().appendValue(this.anyNotifier).toString() + "\n", Should.operator_doubleArrow(_get, JUnit4RuntimeSupport.class));
    
  }
  
  @Test
  @Named("throws NoSuchElementException if JUnit is not on classpath")
  @Order(3)
  public void _throwsNoSuchElementExceptionIfJUnitIsNotOnClasspath() throws Exception {
    boolean expectedException = false;
    String message = "";
    try{
      this.subject.get(this.anyNotifier);
      message = "Expected " + NoSuchElementException.class.getName() + " for \n     subject.get(anyNotifier)\n with:"
       + "\n     subject is " + new org.hamcrest.StringDescription().appendValue(this.subject).toString()
       + "\n     anyNotifier is " + new org.hamcrest.StringDescription().appendValue(this.anyNotifier).toString();
    }catch(NoSuchElementException e){
      expectedException = true;
    }
    Assert.assertTrue(message, expectedException);
  }
}
