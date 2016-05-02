package org.jnario.suite.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.jnario.suite.services.SuiteGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSuiteParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SUITE_NAME", "RULE_PATTERN", "RULE_STRING", "RULE_TEXT", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'-'", "'.'", "'@'", "'('", "','", "')'", "'='", "'#'", "'['", "']'", "'+='", "'-='", "'*='", "'/='", "'%='", "'<'", "'>'", "'>='", "'||'", "'&&'", "'=='", "'!='", "'==='", "'!=='", "'instanceof'", "'->'", "'..<'", "'..'", "'=>'", "'<>'", "'?:'", "'+'", "'*'", "'**'", "'/'", "'%'", "'!'", "'as'", "'++'", "'--'", "'::'", "'?.'", "'{'", "'}'", "'|'", "'if'", "'else'", "'switch'", "':'", "'default'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'extends'", "'static'", "'import'", "'extension'", "'super'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'synchronized'", "'catch'", "'?'", "'&'"
    };
    public static final int RULE_ID=11;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_PATTERN=5;
    public static final int T__19=19;
    public static final int T__91=91;
    public static final int RULE_HEX=8;
    public static final int T__16=16;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_DECIMAL=10;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_TEXT=7;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=12;
    public static final int RULE_STRING=6;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int RULE_SUITE_NAME=4;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int RULE_INT=9;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=14;

    // delegates
    // delegators


        public InternalSuiteParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSuiteParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSuiteParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSuite.g"; }



     	private SuiteGrammarAccess grammarAccess;
     	
        public InternalSuiteParser(TokenStream input, SuiteGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "SuiteFile";	
       	}
       	
       	@Override
       	protected SuiteGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSuiteFile"
    // InternalSuite.g:67:1: entryRuleSuiteFile returns [EObject current=null] : iv_ruleSuiteFile= ruleSuiteFile EOF ;
    public final EObject entryRuleSuiteFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuiteFile = null;


        try {
            // InternalSuite.g:68:2: (iv_ruleSuiteFile= ruleSuiteFile EOF )
            // InternalSuite.g:69:2: iv_ruleSuiteFile= ruleSuiteFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSuiteFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSuiteFile=ruleSuiteFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSuiteFile; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSuiteFile"


    // $ANTLR start "ruleSuiteFile"
    // InternalSuite.g:76:1: ruleSuiteFile returns [EObject current=null] : ( () (otherlv_1= 'package' ( (lv_package_2_0= ruleQualifiedName ) ) (otherlv_3= ';' )? )? ( (lv_importSection_4_0= ruleXImportSection ) )? ( (lv_xtendTypes_5_0= ruleSuite ) )* ) ;
    public final EObject ruleSuiteFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_package_2_0 = null;

        EObject lv_importSection_4_0 = null;

        EObject lv_xtendTypes_5_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:79:28: ( ( () (otherlv_1= 'package' ( (lv_package_2_0= ruleQualifiedName ) ) (otherlv_3= ';' )? )? ( (lv_importSection_4_0= ruleXImportSection ) )? ( (lv_xtendTypes_5_0= ruleSuite ) )* ) )
            // InternalSuite.g:80:1: ( () (otherlv_1= 'package' ( (lv_package_2_0= ruleQualifiedName ) ) (otherlv_3= ';' )? )? ( (lv_importSection_4_0= ruleXImportSection ) )? ( (lv_xtendTypes_5_0= ruleSuite ) )* )
            {
            // InternalSuite.g:80:1: ( () (otherlv_1= 'package' ( (lv_package_2_0= ruleQualifiedName ) ) (otherlv_3= ';' )? )? ( (lv_importSection_4_0= ruleXImportSection ) )? ( (lv_xtendTypes_5_0= ruleSuite ) )* )
            // InternalSuite.g:80:2: () (otherlv_1= 'package' ( (lv_package_2_0= ruleQualifiedName ) ) (otherlv_3= ';' )? )? ( (lv_importSection_4_0= ruleXImportSection ) )? ( (lv_xtendTypes_5_0= ruleSuite ) )*
            {
            // InternalSuite.g:80:2: ()
            // InternalSuite.g:81:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSuiteFileAccess().getSuiteFileAction_0(),
                          current);
                  
            }

            }

            // InternalSuite.g:86:2: (otherlv_1= 'package' ( (lv_package_2_0= ruleQualifiedName ) ) (otherlv_3= ';' )? )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSuite.g:86:4: otherlv_1= 'package' ( (lv_package_2_0= ruleQualifiedName ) ) (otherlv_3= ';' )?
                    {
                    otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getSuiteFileAccess().getPackageKeyword_1_0());
                          
                    }
                    // InternalSuite.g:90:1: ( (lv_package_2_0= ruleQualifiedName ) )
                    // InternalSuite.g:91:1: (lv_package_2_0= ruleQualifiedName )
                    {
                    // InternalSuite.g:91:1: (lv_package_2_0= ruleQualifiedName )
                    // InternalSuite.g:92:3: lv_package_2_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSuiteFileAccess().getPackageQualifiedNameParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_package_2_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSuiteFileRule());
                      	        }
                             		set(
                             			current, 
                             			"package",
                              		lv_package_2_0, 
                              		"org.jnario.suite.Suite.QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSuite.g:108:2: (otherlv_3= ';' )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==17) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // InternalSuite.g:108:4: otherlv_3= ';'
                            {
                            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_5); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getSuiteFileAccess().getSemicolonKeyword_1_2());
                                  
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalSuite.g:112:5: ( (lv_importSection_4_0= ruleXImportSection ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==76) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSuite.g:113:1: (lv_importSection_4_0= ruleXImportSection )
                    {
                    // InternalSuite.g:113:1: (lv_importSection_4_0= ruleXImportSection )
                    // InternalSuite.g:114:3: lv_importSection_4_0= ruleXImportSection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSuiteFileAccess().getImportSectionXImportSectionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_importSection_4_0=ruleXImportSection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSuiteFileRule());
                      	        }
                             		set(
                             			current, 
                             			"importSection",
                              		lv_importSection_4_0, 
                              		"org.eclipse.xtext.xbase.Xtype.XImportSection");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalSuite.g:130:3: ( (lv_xtendTypes_5_0= ruleSuite ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_SUITE_NAME||LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSuite.g:131:1: (lv_xtendTypes_5_0= ruleSuite )
            	    {
            	    // InternalSuite.g:131:1: (lv_xtendTypes_5_0= ruleSuite )
            	    // InternalSuite.g:132:3: lv_xtendTypes_5_0= ruleSuite
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSuiteFileAccess().getXtendTypesSuiteParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_xtendTypes_5_0=ruleSuite();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSuiteFileRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"xtendTypes",
            	              		lv_xtendTypes_5_0, 
            	              		"org.jnario.suite.Suite.Suite");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSuiteFile"


    // $ANTLR start "entryRuleSuite"
    // InternalSuite.g:158:1: entryRuleSuite returns [EObject current=null] : iv_ruleSuite= ruleSuite EOF ;
    public final EObject entryRuleSuite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuite = null;


        try {
            // InternalSuite.g:159:2: (iv_ruleSuite= ruleSuite EOF )
            // InternalSuite.g:160:2: iv_ruleSuite= ruleSuite EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSuiteRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSuite=ruleSuite();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSuite; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSuite"


    // $ANTLR start "ruleSuite"
    // InternalSuite.g:167:1: ruleSuite returns [EObject current=null] : ( () ( (lv_annotations_1_0= ruleXAnnotation ) )* ( (lv_name_2_0= RULE_SUITE_NAME ) ) ( (lv_elements_3_0= ruleReference ) )* ) ;
    public final EObject ruleSuite() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_annotations_1_0 = null;

        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:170:28: ( ( () ( (lv_annotations_1_0= ruleXAnnotation ) )* ( (lv_name_2_0= RULE_SUITE_NAME ) ) ( (lv_elements_3_0= ruleReference ) )* ) )
            // InternalSuite.g:171:1: ( () ( (lv_annotations_1_0= ruleXAnnotation ) )* ( (lv_name_2_0= RULE_SUITE_NAME ) ) ( (lv_elements_3_0= ruleReference ) )* )
            {
            // InternalSuite.g:171:1: ( () ( (lv_annotations_1_0= ruleXAnnotation ) )* ( (lv_name_2_0= RULE_SUITE_NAME ) ) ( (lv_elements_3_0= ruleReference ) )* )
            // InternalSuite.g:171:2: () ( (lv_annotations_1_0= ruleXAnnotation ) )* ( (lv_name_2_0= RULE_SUITE_NAME ) ) ( (lv_elements_3_0= ruleReference ) )*
            {
            // InternalSuite.g:171:2: ()
            // InternalSuite.g:172:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSuiteAccess().getSuiteAction_0(),
                          current);
                  
            }

            }

            // InternalSuite.g:177:2: ( (lv_annotations_1_0= ruleXAnnotation ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSuite.g:178:1: (lv_annotations_1_0= ruleXAnnotation )
            	    {
            	    // InternalSuite.g:178:1: (lv_annotations_1_0= ruleXAnnotation )
            	    // InternalSuite.g:179:3: lv_annotations_1_0= ruleXAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSuiteAccess().getAnnotationsXAnnotationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    lv_annotations_1_0=ruleXAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSuiteRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_1_0, 
            	              		"org.eclipse.xtext.xbase.annotations.XbaseWithAnnotations.XAnnotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalSuite.g:195:3: ( (lv_name_2_0= RULE_SUITE_NAME ) )
            // InternalSuite.g:196:1: (lv_name_2_0= RULE_SUITE_NAME )
            {
            // InternalSuite.g:196:1: (lv_name_2_0= RULE_SUITE_NAME )
            // InternalSuite.g:197:3: lv_name_2_0= RULE_SUITE_NAME
            {
            lv_name_2_0=(Token)match(input,RULE_SUITE_NAME,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getSuiteAccess().getNameSUITE_NAMETerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSuiteRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"org.jnario.suite.Suite.SUITE_NAME");
              	    
            }

            }


            }

            // InternalSuite.g:213:2: ( (lv_elements_3_0= ruleReference ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSuite.g:214:1: (lv_elements_3_0= ruleReference )
            	    {
            	    // InternalSuite.g:214:1: (lv_elements_3_0= ruleReference )
            	    // InternalSuite.g:215:3: lv_elements_3_0= ruleReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSuiteAccess().getElementsReferenceParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    lv_elements_3_0=ruleReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSuiteRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_3_0, 
            	              		"org.jnario.suite.Suite.Reference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSuite"


    // $ANTLR start "entryRulePatternReference"
    // InternalSuite.g:239:1: entryRulePatternReference returns [EObject current=null] : iv_rulePatternReference= rulePatternReference EOF ;
    public final EObject entryRulePatternReference() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternReference = null;


        try {
            // InternalSuite.g:240:2: (iv_rulePatternReference= rulePatternReference EOF )
            // InternalSuite.g:241:2: iv_rulePatternReference= rulePatternReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPatternReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePatternReference=rulePatternReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePatternReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePatternReference"


    // $ANTLR start "rulePatternReference"
    // InternalSuite.g:248:1: rulePatternReference returns [EObject current=null] : (otherlv_0= '-' ( (lv_pattern_1_0= RULE_PATTERN ) ) ) ;
    public final EObject rulePatternReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_pattern_1_0=null;

         enterRule(); 
            
        try {
            // InternalSuite.g:251:28: ( (otherlv_0= '-' ( (lv_pattern_1_0= RULE_PATTERN ) ) ) )
            // InternalSuite.g:252:1: (otherlv_0= '-' ( (lv_pattern_1_0= RULE_PATTERN ) ) )
            {
            // InternalSuite.g:252:1: (otherlv_0= '-' ( (lv_pattern_1_0= RULE_PATTERN ) ) )
            // InternalSuite.g:252:3: otherlv_0= '-' ( (lv_pattern_1_0= RULE_PATTERN ) )
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPatternReferenceAccess().getHyphenMinusKeyword_0());
                  
            }
            // InternalSuite.g:256:1: ( (lv_pattern_1_0= RULE_PATTERN ) )
            // InternalSuite.g:257:1: (lv_pattern_1_0= RULE_PATTERN )
            {
            // InternalSuite.g:257:1: (lv_pattern_1_0= RULE_PATTERN )
            // InternalSuite.g:258:3: lv_pattern_1_0= RULE_PATTERN
            {
            lv_pattern_1_0=(Token)match(input,RULE_PATTERN,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_pattern_1_0, grammarAccess.getPatternReferenceAccess().getPatternPATTERNTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPatternReferenceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"pattern",
                      		lv_pattern_1_0, 
                      		"org.jnario.suite.Suite.PATTERN");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePatternReference"


    // $ANTLR start "entryRuleReference"
    // InternalSuite.g:282:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalSuite.g:283:2: (iv_ruleReference= ruleReference EOF )
            // InternalSuite.g:284:2: iv_ruleReference= ruleReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleReference=ruleReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalSuite.g:291:1: ruleReference returns [EObject current=null] : (this_SpecReference_0= ruleSpecReference | this_PatternReference_1= rulePatternReference ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        EObject this_SpecReference_0 = null;

        EObject this_PatternReference_1 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:294:28: ( (this_SpecReference_0= ruleSpecReference | this_PatternReference_1= rulePatternReference ) )
            // InternalSuite.g:295:1: (this_SpecReference_0= ruleSpecReference | this_PatternReference_1= rulePatternReference )
            {
            // InternalSuite.g:295:1: (this_SpecReference_0= ruleSpecReference | this_PatternReference_1= rulePatternReference )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_PATTERN) ) {
                    alt7=2;
                }
                else if ( (LA7_1==RULE_STRING) ) {
                    alt7=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSuite.g:296:5: this_SpecReference_0= ruleSpecReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getReferenceAccess().getSpecReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_SpecReference_0=ruleSpecReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SpecReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSuite.g:306:5: this_PatternReference_1= rulePatternReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getReferenceAccess().getPatternReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PatternReference_1=rulePatternReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PatternReference_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleSpecReference"
    // InternalSuite.g:322:1: entryRuleSpecReference returns [EObject current=null] : iv_ruleSpecReference= ruleSpecReference EOF ;
    public final EObject entryRuleSpecReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecReference = null;


        try {
            // InternalSuite.g:323:2: (iv_ruleSpecReference= ruleSpecReference EOF )
            // InternalSuite.g:324:2: iv_ruleSpecReference= ruleSpecReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSpecReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSpecReference=ruleSpecReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSpecReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpecReference"


    // $ANTLR start "ruleSpecReference"
    // InternalSuite.g:331:1: ruleSpecReference returns [EObject current=null] : (otherlv_0= '-' ( (otherlv_1= RULE_STRING ) ) ( (lv_text_2_0= RULE_TEXT ) )? ) ;
    public final EObject ruleSpecReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_text_2_0=null;

         enterRule(); 
            
        try {
            // InternalSuite.g:334:28: ( (otherlv_0= '-' ( (otherlv_1= RULE_STRING ) ) ( (lv_text_2_0= RULE_TEXT ) )? ) )
            // InternalSuite.g:335:1: (otherlv_0= '-' ( (otherlv_1= RULE_STRING ) ) ( (lv_text_2_0= RULE_TEXT ) )? )
            {
            // InternalSuite.g:335:1: (otherlv_0= '-' ( (otherlv_1= RULE_STRING ) ) ( (lv_text_2_0= RULE_TEXT ) )? )
            // InternalSuite.g:335:3: otherlv_0= '-' ( (otherlv_1= RULE_STRING ) ) ( (lv_text_2_0= RULE_TEXT ) )?
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSpecReferenceAccess().getHyphenMinusKeyword_0());
                  
            }
            // InternalSuite.g:339:1: ( (otherlv_1= RULE_STRING ) )
            // InternalSuite.g:340:1: (otherlv_1= RULE_STRING )
            {
            // InternalSuite.g:340:1: (otherlv_1= RULE_STRING )
            // InternalSuite.g:341:3: otherlv_1= RULE_STRING
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSpecReferenceRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getSpecReferenceAccess().getSpecSpecificationCrossReference_1_0()); 
              	
            }

            }


            }

            // InternalSuite.g:352:2: ( (lv_text_2_0= RULE_TEXT ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_TEXT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSuite.g:353:1: (lv_text_2_0= RULE_TEXT )
                    {
                    // InternalSuite.g:353:1: (lv_text_2_0= RULE_TEXT )
                    // InternalSuite.g:354:3: lv_text_2_0= RULE_TEXT
                    {
                    lv_text_2_0=(Token)match(input,RULE_TEXT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_text_2_0, grammarAccess.getSpecReferenceAccess().getTextTEXTTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSpecReferenceRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"text",
                              		lv_text_2_0, 
                              		"org.jnario.suite.Suite.TEXT");
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpecReference"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalSuite.g:378:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalSuite.g:379:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalSuite.g:380:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalSuite.g:387:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:390:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // InternalSuite.g:391:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // InternalSuite.g:391:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // InternalSuite.g:392:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_12);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSuite.g:402:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    int LA9_2 = input.LA(2);

                    if ( (LA9_2==RULE_ID) ) {
                        int LA9_3 = input.LA(3);

                        if ( (synpred1_InternalSuite()) ) {
                            alt9=1;
                        }


                    }


                }


                switch (alt9) {
            	case 1 :
            	    // InternalSuite.g:402:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // InternalSuite.g:402:2: ( ( '.' )=>kw= '.' )
            	    // InternalSuite.g:402:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,19,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FollowSets000.FOLLOW_12);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleXAnnotation"
    // InternalSuite.g:431:1: entryRuleXAnnotation returns [EObject current=null] : iv_ruleXAnnotation= ruleXAnnotation EOF ;
    public final EObject entryRuleXAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAnnotation = null;


        try {
            // InternalSuite.g:432:2: (iv_ruleXAnnotation= ruleXAnnotation EOF )
            // InternalSuite.g:433:2: iv_ruleXAnnotation= ruleXAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXAnnotation=ruleXAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAnnotation"


    // $ANTLR start "ruleXAnnotation"
    // InternalSuite.g:440:1: ruleXAnnotation returns [EObject current=null] : ( () otherlv_1= '@' ( ( ruleQualifiedName ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair ) ) )* ) | ( (lv_value_7_0= ruleXAnnotationElementValueOrCommaList ) ) )? otherlv_8= ')' )? ) ;
    public final EObject ruleXAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_elementValuePairs_4_0 = null;

        EObject lv_elementValuePairs_6_0 = null;

        EObject lv_value_7_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:443:28: ( ( () otherlv_1= '@' ( ( ruleQualifiedName ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair ) ) )* ) | ( (lv_value_7_0= ruleXAnnotationElementValueOrCommaList ) ) )? otherlv_8= ')' )? ) )
            // InternalSuite.g:444:1: ( () otherlv_1= '@' ( ( ruleQualifiedName ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair ) ) )* ) | ( (lv_value_7_0= ruleXAnnotationElementValueOrCommaList ) ) )? otherlv_8= ')' )? )
            {
            // InternalSuite.g:444:1: ( () otherlv_1= '@' ( ( ruleQualifiedName ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair ) ) )* ) | ( (lv_value_7_0= ruleXAnnotationElementValueOrCommaList ) ) )? otherlv_8= ')' )? )
            // InternalSuite.g:444:2: () otherlv_1= '@' ( ( ruleQualifiedName ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair ) ) )* ) | ( (lv_value_7_0= ruleXAnnotationElementValueOrCommaList ) ) )? otherlv_8= ')' )?
            {
            // InternalSuite.g:444:2: ()
            // InternalSuite.g:445:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXAnnotationAccess().getXAnnotationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXAnnotationAccess().getCommercialAtKeyword_1());
                  
            }
            // InternalSuite.g:454:1: ( ( ruleQualifiedName ) )
            // InternalSuite.g:455:1: ( ruleQualifiedName )
            {
            // InternalSuite.g:455:1: ( ruleQualifiedName )
            // InternalSuite.g:456:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXAnnotationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXAnnotationAccess().getAnnotationTypeJvmAnnotationTypeCrossReference_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_13);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSuite.g:469:2: ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair ) ) )* ) | ( (lv_value_7_0= ruleXAnnotationElementValueOrCommaList ) ) )? otherlv_8= ')' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) && (synpred2_InternalSuite())) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSuite.g:469:3: ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair ) ) )* ) | ( (lv_value_7_0= ruleXAnnotationElementValueOrCommaList ) ) )? otherlv_8= ')'
                    {
                    // InternalSuite.g:469:3: ( ( '(' )=>otherlv_3= '(' )
                    // InternalSuite.g:469:4: ( '(' )=>otherlv_3= '('
                    {
                    otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXAnnotationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }

                    }

                    // InternalSuite.g:474:2: ( ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair ) ) )* ) | ( (lv_value_7_0= ruleXAnnotationElementValueOrCommaList ) ) )?
                    int alt11=3;
                    alt11 = dfa11.predict(input);
                    switch (alt11) {
                        case 1 :
                            // InternalSuite.g:474:3: ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair ) ) )* )
                            {
                            // InternalSuite.g:474:3: ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair ) ) )* )
                            // InternalSuite.g:474:4: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair ) ) )*
                            {
                            // InternalSuite.g:474:4: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair ) )
                            // InternalSuite.g:474:5: ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair )
                            {
                            // InternalSuite.g:480:1: (lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair )
                            // InternalSuite.g:481:3: lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAnnotationAccess().getElementValuePairsXAnnotationElementValuePairParserRuleCall_3_1_0_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_15);
                            lv_elementValuePairs_4_0=ruleXAnnotationElementValuePair();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXAnnotationRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"elementValuePairs",
                                      		lv_elementValuePairs_4_0, 
                                      		"org.eclipse.xtext.xbase.annotations.XbaseWithAnnotations.XAnnotationElementValuePair");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // InternalSuite.g:497:2: (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair ) ) )*
                            loop10:
                            do {
                                int alt10=2;
                                int LA10_0 = input.LA(1);

                                if ( (LA10_0==22) ) {
                                    alt10=1;
                                }


                                switch (alt10) {
                            	case 1 :
                            	    // InternalSuite.g:497:4: otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair ) )
                            	    {
                            	    otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_3); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_5, grammarAccess.getXAnnotationAccess().getCommaKeyword_3_1_0_1_0());
                            	          
                            	    }
                            	    // InternalSuite.g:501:1: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair ) )
                            	    // InternalSuite.g:501:2: ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair )
                            	    {
                            	    // InternalSuite.g:507:1: (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair )
                            	    // InternalSuite.g:508:3: lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXAnnotationAccess().getElementValuePairsXAnnotationElementValuePairParserRuleCall_3_1_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_15);
                            	    lv_elementValuePairs_6_0=ruleXAnnotationElementValuePair();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXAnnotationRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"elementValuePairs",
                            	              		lv_elementValuePairs_6_0, 
                            	              		"org.eclipse.xtext.xbase.annotations.XbaseWithAnnotations.XAnnotationElementValuePair");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop10;
                                }
                            } while (true);


                            }


                            }
                            break;
                        case 2 :
                            // InternalSuite.g:525:6: ( (lv_value_7_0= ruleXAnnotationElementValueOrCommaList ) )
                            {
                            // InternalSuite.g:525:6: ( (lv_value_7_0= ruleXAnnotationElementValueOrCommaList ) )
                            // InternalSuite.g:526:1: (lv_value_7_0= ruleXAnnotationElementValueOrCommaList )
                            {
                            // InternalSuite.g:526:1: (lv_value_7_0= ruleXAnnotationElementValueOrCommaList )
                            // InternalSuite.g:527:3: lv_value_7_0= ruleXAnnotationElementValueOrCommaList
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAnnotationAccess().getValueXAnnotationElementValueOrCommaListParserRuleCall_3_1_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_16);
                            lv_value_7_0=ruleXAnnotationElementValueOrCommaList();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXAnnotationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"value",
                                      		lv_value_7_0, 
                                      		"org.eclipse.xtext.xbase.annotations.XbaseWithAnnotations.XAnnotationElementValueOrCommaList");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXAnnotationAccess().getRightParenthesisKeyword_3_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAnnotation"


    // $ANTLR start "entryRuleXAnnotationElementValuePair"
    // InternalSuite.g:555:1: entryRuleXAnnotationElementValuePair returns [EObject current=null] : iv_ruleXAnnotationElementValuePair= ruleXAnnotationElementValuePair EOF ;
    public final EObject entryRuleXAnnotationElementValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAnnotationElementValuePair = null;


        try {
            // InternalSuite.g:556:2: (iv_ruleXAnnotationElementValuePair= ruleXAnnotationElementValuePair EOF )
            // InternalSuite.g:557:2: iv_ruleXAnnotationElementValuePair= ruleXAnnotationElementValuePair EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAnnotationElementValuePairRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXAnnotationElementValuePair=ruleXAnnotationElementValuePair();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAnnotationElementValuePair; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAnnotationElementValuePair"


    // $ANTLR start "ruleXAnnotationElementValuePair"
    // InternalSuite.g:564:1: ruleXAnnotationElementValuePair returns [EObject current=null] : ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> ( ( ( ruleValidID ) ) otherlv_1= '=' ) ) ( (lv_value_2_0= ruleXAnnotationElementValue ) ) ) ;
    public final EObject ruleXAnnotationElementValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:567:28: ( ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> ( ( ( ruleValidID ) ) otherlv_1= '=' ) ) ( (lv_value_2_0= ruleXAnnotationElementValue ) ) ) )
            // InternalSuite.g:568:1: ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> ( ( ( ruleValidID ) ) otherlv_1= '=' ) ) ( (lv_value_2_0= ruleXAnnotationElementValue ) ) )
            {
            // InternalSuite.g:568:1: ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> ( ( ( ruleValidID ) ) otherlv_1= '=' ) ) ( (lv_value_2_0= ruleXAnnotationElementValue ) ) )
            // InternalSuite.g:568:2: ( ( ( ( ( ruleValidID ) ) '=' ) )=> ( ( ( ruleValidID ) ) otherlv_1= '=' ) ) ( (lv_value_2_0= ruleXAnnotationElementValue ) )
            {
            // InternalSuite.g:568:2: ( ( ( ( ( ruleValidID ) ) '=' ) )=> ( ( ( ruleValidID ) ) otherlv_1= '=' ) )
            // InternalSuite.g:568:3: ( ( ( ( ruleValidID ) ) '=' ) )=> ( ( ( ruleValidID ) ) otherlv_1= '=' )
            {
            // InternalSuite.g:573:5: ( ( ( ruleValidID ) ) otherlv_1= '=' )
            // InternalSuite.g:573:6: ( ( ruleValidID ) ) otherlv_1= '='
            {
            // InternalSuite.g:573:6: ( ( ruleValidID ) )
            // InternalSuite.g:574:1: ( ruleValidID )
            {
            // InternalSuite.g:574:1: ( ruleValidID )
            // InternalSuite.g:575:3: ruleValidID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXAnnotationElementValuePairRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXAnnotationElementValuePairAccess().getElementJvmOperationCrossReference_0_0_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_17);
            ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXAnnotationElementValuePairAccess().getEqualsSignKeyword_0_0_1());
                  
            }

            }


            }

            // InternalSuite.g:592:3: ( (lv_value_2_0= ruleXAnnotationElementValue ) )
            // InternalSuite.g:593:1: (lv_value_2_0= ruleXAnnotationElementValue )
            {
            // InternalSuite.g:593:1: (lv_value_2_0= ruleXAnnotationElementValue )
            // InternalSuite.g:594:3: lv_value_2_0= ruleXAnnotationElementValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXAnnotationElementValuePairAccess().getValueXAnnotationElementValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_2_0=ruleXAnnotationElementValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXAnnotationElementValuePairRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"org.eclipse.xtext.xbase.annotations.XbaseWithAnnotations.XAnnotationElementValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAnnotationElementValuePair"


    // $ANTLR start "entryRuleXAnnotationElementValueOrCommaList"
    // InternalSuite.g:618:1: entryRuleXAnnotationElementValueOrCommaList returns [EObject current=null] : iv_ruleXAnnotationElementValueOrCommaList= ruleXAnnotationElementValueOrCommaList EOF ;
    public final EObject entryRuleXAnnotationElementValueOrCommaList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAnnotationElementValueOrCommaList = null;


        try {
            // InternalSuite.g:619:2: (iv_ruleXAnnotationElementValueOrCommaList= ruleXAnnotationElementValueOrCommaList EOF )
            // InternalSuite.g:620:2: iv_ruleXAnnotationElementValueOrCommaList= ruleXAnnotationElementValueOrCommaList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAnnotationElementValueOrCommaListRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXAnnotationElementValueOrCommaList=ruleXAnnotationElementValueOrCommaList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAnnotationElementValueOrCommaList; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAnnotationElementValueOrCommaList"


    // $ANTLR start "ruleXAnnotationElementValueOrCommaList"
    // InternalSuite.g:627:1: ruleXAnnotationElementValueOrCommaList returns [EObject current=null] : ( ( ( ( ( () '#' '[' ) )=> ( () otherlv_1= '#' otherlv_2= '[' ) ) ( ( (lv_elements_3_0= ruleXAnnotationOrExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXAnnotationOrExpression ) ) )* )? otherlv_6= ']' ) | (this_XAnnotationOrExpression_7= ruleXAnnotationOrExpression ( () (otherlv_9= ',' ( (lv_elements_10_0= ruleXAnnotationOrExpression ) ) )+ )? ) ) ;
    public final EObject ruleXAnnotationElementValueOrCommaList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_elements_3_0 = null;

        EObject lv_elements_5_0 = null;

        EObject this_XAnnotationOrExpression_7 = null;

        EObject lv_elements_10_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:630:28: ( ( ( ( ( ( () '#' '[' ) )=> ( () otherlv_1= '#' otherlv_2= '[' ) ) ( ( (lv_elements_3_0= ruleXAnnotationOrExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXAnnotationOrExpression ) ) )* )? otherlv_6= ']' ) | (this_XAnnotationOrExpression_7= ruleXAnnotationOrExpression ( () (otherlv_9= ',' ( (lv_elements_10_0= ruleXAnnotationOrExpression ) ) )+ )? ) ) )
            // InternalSuite.g:631:1: ( ( ( ( ( () '#' '[' ) )=> ( () otherlv_1= '#' otherlv_2= '[' ) ) ( ( (lv_elements_3_0= ruleXAnnotationOrExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXAnnotationOrExpression ) ) )* )? otherlv_6= ']' ) | (this_XAnnotationOrExpression_7= ruleXAnnotationOrExpression ( () (otherlv_9= ',' ( (lv_elements_10_0= ruleXAnnotationOrExpression ) ) )+ )? ) )
            {
            // InternalSuite.g:631:1: ( ( ( ( ( () '#' '[' ) )=> ( () otherlv_1= '#' otherlv_2= '[' ) ) ( ( (lv_elements_3_0= ruleXAnnotationOrExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXAnnotationOrExpression ) ) )* )? otherlv_6= ']' ) | (this_XAnnotationOrExpression_7= ruleXAnnotationOrExpression ( () (otherlv_9= ',' ( (lv_elements_10_0= ruleXAnnotationOrExpression ) ) )+ )? ) )
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalSuite.g:631:2: ( ( ( ( () '#' '[' ) )=> ( () otherlv_1= '#' otherlv_2= '[' ) ) ( ( (lv_elements_3_0= ruleXAnnotationOrExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXAnnotationOrExpression ) ) )* )? otherlv_6= ']' )
                    {
                    // InternalSuite.g:631:2: ( ( ( ( () '#' '[' ) )=> ( () otherlv_1= '#' otherlv_2= '[' ) ) ( ( (lv_elements_3_0= ruleXAnnotationOrExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXAnnotationOrExpression ) ) )* )? otherlv_6= ']' )
                    // InternalSuite.g:631:3: ( ( ( () '#' '[' ) )=> ( () otherlv_1= '#' otherlv_2= '[' ) ) ( ( (lv_elements_3_0= ruleXAnnotationOrExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXAnnotationOrExpression ) ) )* )? otherlv_6= ']'
                    {
                    // InternalSuite.g:631:3: ( ( ( () '#' '[' ) )=> ( () otherlv_1= '#' otherlv_2= '[' ) )
                    // InternalSuite.g:631:4: ( ( () '#' '[' ) )=> ( () otherlv_1= '#' otherlv_2= '[' )
                    {
                    // InternalSuite.g:634:5: ( () otherlv_1= '#' otherlv_2= '[' )
                    // InternalSuite.g:634:6: () otherlv_1= '#' otherlv_2= '['
                    {
                    // InternalSuite.g:634:6: ()
                    // InternalSuite.g:635:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAnnotationElementValueOrCommaListAccess().getXListLiteralAction_0_0_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXAnnotationElementValueOrCommaListAccess().getNumberSignKeyword_0_0_0_1());
                          
                    }
                    otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXAnnotationElementValueOrCommaListAccess().getLeftSquareBracketKeyword_0_0_0_2());
                          
                    }

                    }


                    }

                    // InternalSuite.g:648:3: ( ( (lv_elements_3_0= ruleXAnnotationOrExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXAnnotationOrExpression ) ) )* )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_STRING||(LA14_0>=RULE_HEX && LA14_0<=RULE_ID)||LA14_0==18||(LA14_0>=20 && LA14_0<=21)||(LA14_0>=25 && LA14_0<=26)||LA14_0==33||LA14_0==49||LA14_0==54||LA14_0==60||LA14_0==63||LA14_0==65||(LA14_0>=69 && LA14_0<=71)||(LA14_0>=74 && LA14_0<=86)||LA14_0==88) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalSuite.g:648:4: ( (lv_elements_3_0= ruleXAnnotationOrExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXAnnotationOrExpression ) ) )*
                            {
                            // InternalSuite.g:648:4: ( (lv_elements_3_0= ruleXAnnotationOrExpression ) )
                            // InternalSuite.g:649:1: (lv_elements_3_0= ruleXAnnotationOrExpression )
                            {
                            // InternalSuite.g:649:1: (lv_elements_3_0= ruleXAnnotationOrExpression )
                            // InternalSuite.g:650:3: lv_elements_3_0= ruleXAnnotationOrExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAnnotationElementValueOrCommaListAccess().getElementsXAnnotationOrExpressionParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_21);
                            lv_elements_3_0=ruleXAnnotationOrExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXAnnotationElementValueOrCommaListRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"elements",
                                      		lv_elements_3_0, 
                                      		"org.eclipse.xtext.xbase.annotations.XbaseWithAnnotations.XAnnotationOrExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // InternalSuite.g:666:2: (otherlv_4= ',' ( (lv_elements_5_0= ruleXAnnotationOrExpression ) ) )*
                            loop13:
                            do {
                                int alt13=2;
                                int LA13_0 = input.LA(1);

                                if ( (LA13_0==22) ) {
                                    alt13=1;
                                }


                                switch (alt13) {
                            	case 1 :
                            	    // InternalSuite.g:666:4: otherlv_4= ',' ( (lv_elements_5_0= ruleXAnnotationOrExpression ) )
                            	    {
                            	    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_18); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getXAnnotationElementValueOrCommaListAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // InternalSuite.g:670:1: ( (lv_elements_5_0= ruleXAnnotationOrExpression ) )
                            	    // InternalSuite.g:671:1: (lv_elements_5_0= ruleXAnnotationOrExpression )
                            	    {
                            	    // InternalSuite.g:671:1: (lv_elements_5_0= ruleXAnnotationOrExpression )
                            	    // InternalSuite.g:672:3: lv_elements_5_0= ruleXAnnotationOrExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXAnnotationElementValueOrCommaListAccess().getElementsXAnnotationOrExpressionParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_21);
                            	    lv_elements_5_0=ruleXAnnotationOrExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXAnnotationElementValueOrCommaListRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"elements",
                            	              		lv_elements_5_0, 
                            	              		"org.eclipse.xtext.xbase.annotations.XbaseWithAnnotations.XAnnotationOrExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop13;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXAnnotationElementValueOrCommaListAccess().getRightSquareBracketKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSuite.g:693:6: (this_XAnnotationOrExpression_7= ruleXAnnotationOrExpression ( () (otherlv_9= ',' ( (lv_elements_10_0= ruleXAnnotationOrExpression ) ) )+ )? )
                    {
                    // InternalSuite.g:693:6: (this_XAnnotationOrExpression_7= ruleXAnnotationOrExpression ( () (otherlv_9= ',' ( (lv_elements_10_0= ruleXAnnotationOrExpression ) ) )+ )? )
                    // InternalSuite.g:694:5: this_XAnnotationOrExpression_7= ruleXAnnotationOrExpression ( () (otherlv_9= ',' ( (lv_elements_10_0= ruleXAnnotationOrExpression ) ) )+ )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAnnotationElementValueOrCommaListAccess().getXAnnotationOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_22);
                    this_XAnnotationOrExpression_7=ruleXAnnotationOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XAnnotationOrExpression_7; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // InternalSuite.g:702:1: ( () (otherlv_9= ',' ( (lv_elements_10_0= ruleXAnnotationOrExpression ) ) )+ )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==22) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalSuite.g:702:2: () (otherlv_9= ',' ( (lv_elements_10_0= ruleXAnnotationOrExpression ) ) )+
                            {
                            // InternalSuite.g:702:2: ()
                            // InternalSuite.g:703:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndAdd(
                                          grammarAccess.getXAnnotationElementValueOrCommaListAccess().getXListLiteralElementsAction_1_1_0(),
                                          current);
                                  
                            }

                            }

                            // InternalSuite.g:708:2: (otherlv_9= ',' ( (lv_elements_10_0= ruleXAnnotationOrExpression ) ) )+
                            int cnt15=0;
                            loop15:
                            do {
                                int alt15=2;
                                int LA15_0 = input.LA(1);

                                if ( (LA15_0==22) ) {
                                    alt15=1;
                                }


                                switch (alt15) {
                            	case 1 :
                            	    // InternalSuite.g:708:4: otherlv_9= ',' ( (lv_elements_10_0= ruleXAnnotationOrExpression ) )
                            	    {
                            	    otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_18); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_9, grammarAccess.getXAnnotationElementValueOrCommaListAccess().getCommaKeyword_1_1_1_0());
                            	          
                            	    }
                            	    // InternalSuite.g:712:1: ( (lv_elements_10_0= ruleXAnnotationOrExpression ) )
                            	    // InternalSuite.g:713:1: (lv_elements_10_0= ruleXAnnotationOrExpression )
                            	    {
                            	    // InternalSuite.g:713:1: (lv_elements_10_0= ruleXAnnotationOrExpression )
                            	    // InternalSuite.g:714:3: lv_elements_10_0= ruleXAnnotationOrExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXAnnotationElementValueOrCommaListAccess().getElementsXAnnotationOrExpressionParserRuleCall_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_22);
                            	    lv_elements_10_0=ruleXAnnotationOrExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXAnnotationElementValueOrCommaListRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"elements",
                            	              		lv_elements_10_0, 
                            	              		"org.eclipse.xtext.xbase.annotations.XbaseWithAnnotations.XAnnotationOrExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt15 >= 1 ) break loop15;
                            	    if (state.backtracking>0) {state.failed=true; return current;}
                                        EarlyExitException eee =
                                            new EarlyExitException(15, input);
                                        throw eee;
                                }
                                cnt15++;
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAnnotationElementValueOrCommaList"


    // $ANTLR start "entryRuleXAnnotationElementValue"
    // InternalSuite.g:738:1: entryRuleXAnnotationElementValue returns [EObject current=null] : iv_ruleXAnnotationElementValue= ruleXAnnotationElementValue EOF ;
    public final EObject entryRuleXAnnotationElementValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAnnotationElementValue = null;


        try {
            // InternalSuite.g:739:2: (iv_ruleXAnnotationElementValue= ruleXAnnotationElementValue EOF )
            // InternalSuite.g:740:2: iv_ruleXAnnotationElementValue= ruleXAnnotationElementValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAnnotationElementValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXAnnotationElementValue=ruleXAnnotationElementValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAnnotationElementValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAnnotationElementValue"


    // $ANTLR start "ruleXAnnotationElementValue"
    // InternalSuite.g:747:1: ruleXAnnotationElementValue returns [EObject current=null] : ( ( ( ( ( () '#' '[' ) )=> ( () otherlv_1= '#' otherlv_2= '[' ) ) ( ( (lv_elements_3_0= ruleXAnnotationOrExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXAnnotationOrExpression ) ) )* )? otherlv_6= ']' ) | this_XAnnotationOrExpression_7= ruleXAnnotationOrExpression ) ;
    public final EObject ruleXAnnotationElementValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_elements_3_0 = null;

        EObject lv_elements_5_0 = null;

        EObject this_XAnnotationOrExpression_7 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:750:28: ( ( ( ( ( ( () '#' '[' ) )=> ( () otherlv_1= '#' otherlv_2= '[' ) ) ( ( (lv_elements_3_0= ruleXAnnotationOrExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXAnnotationOrExpression ) ) )* )? otherlv_6= ']' ) | this_XAnnotationOrExpression_7= ruleXAnnotationOrExpression ) )
            // InternalSuite.g:751:1: ( ( ( ( ( () '#' '[' ) )=> ( () otherlv_1= '#' otherlv_2= '[' ) ) ( ( (lv_elements_3_0= ruleXAnnotationOrExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXAnnotationOrExpression ) ) )* )? otherlv_6= ']' ) | this_XAnnotationOrExpression_7= ruleXAnnotationOrExpression )
            {
            // InternalSuite.g:751:1: ( ( ( ( ( () '#' '[' ) )=> ( () otherlv_1= '#' otherlv_2= '[' ) ) ( ( (lv_elements_3_0= ruleXAnnotationOrExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXAnnotationOrExpression ) ) )* )? otherlv_6= ']' ) | this_XAnnotationOrExpression_7= ruleXAnnotationOrExpression )
            int alt20=2;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalSuite.g:751:2: ( ( ( ( () '#' '[' ) )=> ( () otherlv_1= '#' otherlv_2= '[' ) ) ( ( (lv_elements_3_0= ruleXAnnotationOrExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXAnnotationOrExpression ) ) )* )? otherlv_6= ']' )
                    {
                    // InternalSuite.g:751:2: ( ( ( ( () '#' '[' ) )=> ( () otherlv_1= '#' otherlv_2= '[' ) ) ( ( (lv_elements_3_0= ruleXAnnotationOrExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXAnnotationOrExpression ) ) )* )? otherlv_6= ']' )
                    // InternalSuite.g:751:3: ( ( ( () '#' '[' ) )=> ( () otherlv_1= '#' otherlv_2= '[' ) ) ( ( (lv_elements_3_0= ruleXAnnotationOrExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXAnnotationOrExpression ) ) )* )? otherlv_6= ']'
                    {
                    // InternalSuite.g:751:3: ( ( ( () '#' '[' ) )=> ( () otherlv_1= '#' otherlv_2= '[' ) )
                    // InternalSuite.g:751:4: ( ( () '#' '[' ) )=> ( () otherlv_1= '#' otherlv_2= '[' )
                    {
                    // InternalSuite.g:754:5: ( () otherlv_1= '#' otherlv_2= '[' )
                    // InternalSuite.g:754:6: () otherlv_1= '#' otherlv_2= '['
                    {
                    // InternalSuite.g:754:6: ()
                    // InternalSuite.g:755:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAnnotationElementValueAccess().getXListLiteralAction_0_0_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXAnnotationElementValueAccess().getNumberSignKeyword_0_0_0_1());
                          
                    }
                    otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXAnnotationElementValueAccess().getLeftSquareBracketKeyword_0_0_0_2());
                          
                    }

                    }


                    }

                    // InternalSuite.g:768:3: ( ( (lv_elements_3_0= ruleXAnnotationOrExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXAnnotationOrExpression ) ) )* )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==RULE_STRING||(LA19_0>=RULE_HEX && LA19_0<=RULE_ID)||LA19_0==18||(LA19_0>=20 && LA19_0<=21)||(LA19_0>=25 && LA19_0<=26)||LA19_0==33||LA19_0==49||LA19_0==54||LA19_0==60||LA19_0==63||LA19_0==65||(LA19_0>=69 && LA19_0<=71)||(LA19_0>=74 && LA19_0<=86)||LA19_0==88) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalSuite.g:768:4: ( (lv_elements_3_0= ruleXAnnotationOrExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXAnnotationOrExpression ) ) )*
                            {
                            // InternalSuite.g:768:4: ( (lv_elements_3_0= ruleXAnnotationOrExpression ) )
                            // InternalSuite.g:769:1: (lv_elements_3_0= ruleXAnnotationOrExpression )
                            {
                            // InternalSuite.g:769:1: (lv_elements_3_0= ruleXAnnotationOrExpression )
                            // InternalSuite.g:770:3: lv_elements_3_0= ruleXAnnotationOrExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAnnotationElementValueAccess().getElementsXAnnotationOrExpressionParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_21);
                            lv_elements_3_0=ruleXAnnotationOrExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXAnnotationElementValueRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"elements",
                                      		lv_elements_3_0, 
                                      		"org.eclipse.xtext.xbase.annotations.XbaseWithAnnotations.XAnnotationOrExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // InternalSuite.g:786:2: (otherlv_4= ',' ( (lv_elements_5_0= ruleXAnnotationOrExpression ) ) )*
                            loop18:
                            do {
                                int alt18=2;
                                int LA18_0 = input.LA(1);

                                if ( (LA18_0==22) ) {
                                    alt18=1;
                                }


                                switch (alt18) {
                            	case 1 :
                            	    // InternalSuite.g:786:4: otherlv_4= ',' ( (lv_elements_5_0= ruleXAnnotationOrExpression ) )
                            	    {
                            	    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_18); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getXAnnotationElementValueAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // InternalSuite.g:790:1: ( (lv_elements_5_0= ruleXAnnotationOrExpression ) )
                            	    // InternalSuite.g:791:1: (lv_elements_5_0= ruleXAnnotationOrExpression )
                            	    {
                            	    // InternalSuite.g:791:1: (lv_elements_5_0= ruleXAnnotationOrExpression )
                            	    // InternalSuite.g:792:3: lv_elements_5_0= ruleXAnnotationOrExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXAnnotationElementValueAccess().getElementsXAnnotationOrExpressionParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_21);
                            	    lv_elements_5_0=ruleXAnnotationOrExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXAnnotationElementValueRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"elements",
                            	              		lv_elements_5_0, 
                            	              		"org.eclipse.xtext.xbase.annotations.XbaseWithAnnotations.XAnnotationOrExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop18;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXAnnotationElementValueAccess().getRightSquareBracketKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSuite.g:814:5: this_XAnnotationOrExpression_7= ruleXAnnotationOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAnnotationElementValueAccess().getXAnnotationOrExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XAnnotationOrExpression_7=ruleXAnnotationOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XAnnotationOrExpression_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAnnotationElementValue"


    // $ANTLR start "entryRuleXAnnotationOrExpression"
    // InternalSuite.g:830:1: entryRuleXAnnotationOrExpression returns [EObject current=null] : iv_ruleXAnnotationOrExpression= ruleXAnnotationOrExpression EOF ;
    public final EObject entryRuleXAnnotationOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAnnotationOrExpression = null;


        try {
            // InternalSuite.g:831:2: (iv_ruleXAnnotationOrExpression= ruleXAnnotationOrExpression EOF )
            // InternalSuite.g:832:2: iv_ruleXAnnotationOrExpression= ruleXAnnotationOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAnnotationOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXAnnotationOrExpression=ruleXAnnotationOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAnnotationOrExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAnnotationOrExpression"


    // $ANTLR start "ruleXAnnotationOrExpression"
    // InternalSuite.g:839:1: ruleXAnnotationOrExpression returns [EObject current=null] : (this_XAnnotation_0= ruleXAnnotation | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXAnnotationOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAnnotation_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:842:28: ( (this_XAnnotation_0= ruleXAnnotation | this_XExpression_1= ruleXExpression ) )
            // InternalSuite.g:843:1: (this_XAnnotation_0= ruleXAnnotation | this_XExpression_1= ruleXExpression )
            {
            // InternalSuite.g:843:1: (this_XAnnotation_0= ruleXAnnotation | this_XExpression_1= ruleXExpression )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==20) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_STRING||(LA21_0>=RULE_HEX && LA21_0<=RULE_ID)||LA21_0==18||LA21_0==21||(LA21_0>=25 && LA21_0<=26)||LA21_0==33||LA21_0==49||LA21_0==54||LA21_0==60||LA21_0==63||LA21_0==65||(LA21_0>=69 && LA21_0<=71)||(LA21_0>=74 && LA21_0<=86)||LA21_0==88) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalSuite.g:844:5: this_XAnnotation_0= ruleXAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAnnotationOrExpressionAccess().getXAnnotationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XAnnotation_0=ruleXAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XAnnotation_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSuite.g:854:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAnnotationOrExpressionAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XExpression_1=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAnnotationOrExpression"


    // $ANTLR start "entryRuleXExpression"
    // InternalSuite.g:870:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // InternalSuite.g:871:2: (iv_ruleXExpression= ruleXExpression EOF )
            // InternalSuite.g:872:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpression"


    // $ANTLR start "ruleXExpression"
    // InternalSuite.g:879:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:882:28: (this_XAssignment_0= ruleXAssignment )
            // InternalSuite.g:884:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_XAssignment_0=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAssignment_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpression"


    // $ANTLR start "entryRuleXAssignment"
    // InternalSuite.g:900:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // InternalSuite.g:901:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // InternalSuite.g:902:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAssignment"


    // $ANTLR start "ruleXAssignment"
    // InternalSuite.g:909:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:912:28: ( ( ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // InternalSuite.g:913:1: ( ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // InternalSuite.g:913:1: ( ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt23=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==24) ) {
                    alt23=1;
                }
                else if ( (LA23_1==EOF||LA23_1==RULE_STRING||(LA23_1>=RULE_HEX && LA23_1<=RULE_ID)||(LA23_1>=17 && LA23_1<=19)||(LA23_1>=21 && LA23_1<=23)||(LA23_1>=25 && LA23_1<=61)||(LA23_1>=63 && LA23_1<=89)) ) {
                    alt23=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
                }
                break;
            case 74:
                {
                int LA23_2 = input.LA(2);

                if ( (LA23_2==EOF||LA23_2==RULE_STRING||(LA23_2>=RULE_HEX && LA23_2<=RULE_ID)||(LA23_2>=17 && LA23_2<=19)||(LA23_2>=21 && LA23_2<=23)||(LA23_2>=25 && LA23_2<=61)||(LA23_2>=63 && LA23_2<=89)) ) {
                    alt23=2;
                }
                else if ( (LA23_2==24) ) {
                    alt23=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 2, input);

                    throw nvae;
                }
                }
                break;
            case 75:
                {
                int LA23_3 = input.LA(2);

                if ( (LA23_3==24) ) {
                    alt23=1;
                }
                else if ( (LA23_3==EOF||LA23_3==RULE_STRING||(LA23_3>=RULE_HEX && LA23_3<=RULE_ID)||(LA23_3>=17 && LA23_3<=19)||(LA23_3>=21 && LA23_3<=23)||(LA23_3>=25 && LA23_3<=61)||(LA23_3>=63 && LA23_3<=89)) ) {
                    alt23=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 3, input);

                    throw nvae;
                }
                }
                break;
            case 76:
                {
                int LA23_4 = input.LA(2);

                if ( (LA23_4==24) ) {
                    alt23=1;
                }
                else if ( (LA23_4==EOF||LA23_4==RULE_STRING||(LA23_4>=RULE_HEX && LA23_4<=RULE_ID)||(LA23_4>=17 && LA23_4<=19)||(LA23_4>=21 && LA23_4<=23)||(LA23_4>=25 && LA23_4<=61)||(LA23_4>=63 && LA23_4<=89)) ) {
                    alt23=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 4, input);

                    throw nvae;
                }
                }
                break;
            case 77:
                {
                int LA23_5 = input.LA(2);

                if ( (LA23_5==EOF||LA23_5==RULE_STRING||(LA23_5>=RULE_HEX && LA23_5<=RULE_ID)||(LA23_5>=17 && LA23_5<=19)||(LA23_5>=21 && LA23_5<=23)||(LA23_5>=25 && LA23_5<=61)||(LA23_5>=63 && LA23_5<=89)) ) {
                    alt23=2;
                }
                else if ( (LA23_5==24) ) {
                    alt23=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
            case 18:
            case 21:
            case 25:
            case 26:
            case 33:
            case 49:
            case 54:
            case 60:
            case 63:
            case 65:
            case 69:
            case 70:
            case 71:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 88:
                {
                alt23=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalSuite.g:913:2: ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // InternalSuite.g:913:2: ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // InternalSuite.g:913:3: () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // InternalSuite.g:913:3: ()
                    // InternalSuite.g:914:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalSuite.g:919:2: ( ( ruleFeatureCallID ) )
                    // InternalSuite.g:920:1: ( ruleFeatureCallID )
                    {
                    // InternalSuite.g:920:1: ( ruleFeatureCallID )
                    // InternalSuite.g:921:3: ruleFeatureCallID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_17);
                    ruleFeatureCallID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getOpSingleAssignParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_18);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // InternalSuite.g:942:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // InternalSuite.g:943:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // InternalSuite.g:943:1: (lv_value_3_0= ruleXAssignment )
                    // InternalSuite.g:944:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_value_3_0=ruleXAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"org.eclipse.xtext.xbase.Xbase.XAssignment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSuite.g:961:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // InternalSuite.g:961:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // InternalSuite.g:962:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_23);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // InternalSuite.g:970:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt22=2;
                    alt22 = dfa22.predict(input);
                    switch (alt22) {
                        case 1 :
                            // InternalSuite.g:970:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // InternalSuite.g:970:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // InternalSuite.g:970:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // InternalSuite.g:975:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // InternalSuite.g:975:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // InternalSuite.g:975:7: ()
                            // InternalSuite.g:976:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // InternalSuite.g:981:2: ( ( ruleOpMultiAssign ) )
                            // InternalSuite.g:982:1: ( ruleOpMultiAssign )
                            {
                            // InternalSuite.g:982:1: ( ruleOpMultiAssign )
                            // InternalSuite.g:983:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_18);
                            ruleOpMultiAssign();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }


                            }

                            // InternalSuite.g:996:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // InternalSuite.g:997:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // InternalSuite.g:997:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // InternalSuite.g:998:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_rightOperand_7_0=ruleXAssignment();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"rightOperand",
                                      		lv_rightOperand_7_0, 
                                      		"org.eclipse.xtext.xbase.Xbase.XAssignment");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAssignment"


    // $ANTLR start "entryRuleOpSingleAssign"
    // InternalSuite.g:1022:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // InternalSuite.g:1023:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // InternalSuite.g:1024:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpSingleAssign"


    // $ANTLR start "ruleOpSingleAssign"
    // InternalSuite.g:1031:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalSuite.g:1034:28: (kw= '=' )
            // InternalSuite.g:1036:2: kw= '='
            {
            kw=(Token)match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpSingleAssignAccess().getEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpSingleAssign"


    // $ANTLR start "entryRuleOpMultiAssign"
    // InternalSuite.g:1049:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // InternalSuite.g:1050:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // InternalSuite.g:1051:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpMultiAssign"


    // $ANTLR start "ruleOpMultiAssign"
    // InternalSuite.g:1058:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | (kw= '<' kw= '<' kw= '=' ) | (kw= '>' (kw= '>' )? kw= '>=' ) ) ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalSuite.g:1061:28: ( (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | (kw= '<' kw= '<' kw= '=' ) | (kw= '>' (kw= '>' )? kw= '>=' ) ) )
            // InternalSuite.g:1062:1: (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | (kw= '<' kw= '<' kw= '=' ) | (kw= '>' (kw= '>' )? kw= '>=' ) )
            {
            // InternalSuite.g:1062:1: (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | (kw= '<' kw= '<' kw= '=' ) | (kw= '>' (kw= '>' )? kw= '>=' ) )
            int alt25=7;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt25=1;
                }
                break;
            case 29:
                {
                alt25=2;
                }
                break;
            case 30:
                {
                alt25=3;
                }
                break;
            case 31:
                {
                alt25=4;
                }
                break;
            case 32:
                {
                alt25=5;
                }
                break;
            case 33:
                {
                alt25=6;
                }
                break;
            case 34:
                {
                alt25=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalSuite.g:1063:2: kw= '+='
                    {
                    kw=(Token)match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPlusSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSuite.g:1070:2: kw= '-='
                    {
                    kw=(Token)match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getHyphenMinusEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalSuite.g:1077:2: kw= '*='
                    {
                    kw=(Token)match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getAsteriskEqualsSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalSuite.g:1084:2: kw= '/='
                    {
                    kw=(Token)match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getSolidusEqualsSignKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalSuite.g:1091:2: kw= '%='
                    {
                    kw=(Token)match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPercentSignEqualsSignKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // InternalSuite.g:1097:6: (kw= '<' kw= '<' kw= '=' )
                    {
                    // InternalSuite.g:1097:6: (kw= '<' kw= '<' kw= '=' )
                    // InternalSuite.g:1098:2: kw= '<' kw= '<' kw= '='
                    {
                    kw=(Token)match(input,33,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getLessThanSignKeyword_5_0()); 
                          
                    }
                    kw=(Token)match(input,33,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getLessThanSignKeyword_5_1()); 
                          
                    }
                    kw=(Token)match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getEqualsSignKeyword_5_2()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalSuite.g:1116:6: (kw= '>' (kw= '>' )? kw= '>=' )
                    {
                    // InternalSuite.g:1116:6: (kw= '>' (kw= '>' )? kw= '>=' )
                    // InternalSuite.g:1117:2: kw= '>' (kw= '>' )? kw= '>='
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getGreaterThanSignKeyword_6_0()); 
                          
                    }
                    // InternalSuite.g:1122:1: (kw= '>' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==34) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalSuite.g:1123:2: kw= '>'
                            {
                            kw=(Token)match(input,34,FollowSets000.FOLLOW_26); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getGreaterThanSignKeyword_6_1()); 
                                  
                            }

                            }
                            break;

                    }

                    kw=(Token)match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getGreaterThanSignEqualsSignKeyword_6_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpMultiAssign"


    // $ANTLR start "entryRuleXOrExpression"
    // InternalSuite.g:1142:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // InternalSuite.g:1143:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // InternalSuite.g:1144:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXOrExpression"


    // $ANTLR start "ruleXOrExpression"
    // InternalSuite.g:1151:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:1154:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // InternalSuite.g:1155:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // InternalSuite.g:1155:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // InternalSuite.g:1156:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_27);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSuite.g:1164:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==36) ) {
                    int LA26_2 = input.LA(2);

                    if ( (synpred9_InternalSuite()) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // InternalSuite.g:1164:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // InternalSuite.g:1164:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // InternalSuite.g:1164:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // InternalSuite.g:1169:6: ( () ( ( ruleOpOr ) ) )
            	    // InternalSuite.g:1169:7: () ( ( ruleOpOr ) )
            	    {
            	    // InternalSuite.g:1169:7: ()
            	    // InternalSuite.g:1170:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalSuite.g:1175:2: ( ( ruleOpOr ) )
            	    // InternalSuite.g:1176:1: ( ruleOpOr )
            	    {
            	    // InternalSuite.g:1176:1: ( ruleOpOr )
            	    // InternalSuite.g:1177:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    ruleOpOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalSuite.g:1190:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // InternalSuite.g:1191:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // InternalSuite.g:1191:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // InternalSuite.g:1192:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_27);
            	    lv_rightOperand_3_0=ruleXAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"org.eclipse.xtext.xbase.Xbase.XAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // InternalSuite.g:1216:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // InternalSuite.g:1217:2: (iv_ruleOpOr= ruleOpOr EOF )
            // InternalSuite.g:1218:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOr"


    // $ANTLR start "ruleOpOr"
    // InternalSuite.g:1225:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalSuite.g:1228:28: (kw= '||' )
            // InternalSuite.g:1230:2: kw= '||'
            {
            kw=(Token)match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpOrAccess().getVerticalLineVerticalLineKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "entryRuleXAndExpression"
    // InternalSuite.g:1243:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // InternalSuite.g:1244:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // InternalSuite.g:1245:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAndExpression"


    // $ANTLR start "ruleXAndExpression"
    // InternalSuite.g:1252:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:1255:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // InternalSuite.g:1256:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // InternalSuite.g:1256:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // InternalSuite.g:1257:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_28);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSuite.g:1265:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==37) ) {
                    int LA27_2 = input.LA(2);

                    if ( (synpred10_InternalSuite()) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // InternalSuite.g:1265:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // InternalSuite.g:1265:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // InternalSuite.g:1265:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // InternalSuite.g:1270:6: ( () ( ( ruleOpAnd ) ) )
            	    // InternalSuite.g:1270:7: () ( ( ruleOpAnd ) )
            	    {
            	    // InternalSuite.g:1270:7: ()
            	    // InternalSuite.g:1271:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalSuite.g:1276:2: ( ( ruleOpAnd ) )
            	    // InternalSuite.g:1277:1: ( ruleOpAnd )
            	    {
            	    // InternalSuite.g:1277:1: ( ruleOpAnd )
            	    // InternalSuite.g:1278:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    ruleOpAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalSuite.g:1291:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // InternalSuite.g:1292:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // InternalSuite.g:1292:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // InternalSuite.g:1293:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    lv_rightOperand_3_0=ruleXEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"org.eclipse.xtext.xbase.Xbase.XEqualityExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // InternalSuite.g:1317:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // InternalSuite.g:1318:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // InternalSuite.g:1319:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAnd"


    // $ANTLR start "ruleOpAnd"
    // InternalSuite.g:1326:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalSuite.g:1329:28: (kw= '&&' )
            // InternalSuite.g:1331:2: kw= '&&'
            {
            kw=(Token)match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpAndAccess().getAmpersandAmpersandKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "entryRuleXEqualityExpression"
    // InternalSuite.g:1344:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // InternalSuite.g:1345:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // InternalSuite.g:1346:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXEqualityExpression"


    // $ANTLR start "ruleXEqualityExpression"
    // InternalSuite.g:1353:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:1356:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // InternalSuite.g:1357:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // InternalSuite.g:1357:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // InternalSuite.g:1358:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_29);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSuite.g:1366:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop28:
            do {
                int alt28=2;
                switch ( input.LA(1) ) {
                case 38:
                    {
                    int LA28_2 = input.LA(2);

                    if ( (synpred11_InternalSuite()) ) {
                        alt28=1;
                    }


                    }
                    break;
                case 39:
                    {
                    int LA28_3 = input.LA(2);

                    if ( (synpred11_InternalSuite()) ) {
                        alt28=1;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA28_4 = input.LA(2);

                    if ( (synpred11_InternalSuite()) ) {
                        alt28=1;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA28_5 = input.LA(2);

                    if ( (synpred11_InternalSuite()) ) {
                        alt28=1;
                    }


                    }
                    break;

                }

                switch (alt28) {
            	case 1 :
            	    // InternalSuite.g:1366:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // InternalSuite.g:1366:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // InternalSuite.g:1366:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // InternalSuite.g:1371:6: ( () ( ( ruleOpEquality ) ) )
            	    // InternalSuite.g:1371:7: () ( ( ruleOpEquality ) )
            	    {
            	    // InternalSuite.g:1371:7: ()
            	    // InternalSuite.g:1372:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalSuite.g:1377:2: ( ( ruleOpEquality ) )
            	    // InternalSuite.g:1378:1: ( ruleOpEquality )
            	    {
            	    // InternalSuite.g:1378:1: ( ruleOpEquality )
            	    // InternalSuite.g:1379:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    ruleOpEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalSuite.g:1392:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // InternalSuite.g:1393:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // InternalSuite.g:1393:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // InternalSuite.g:1394:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_29);
            	    lv_rightOperand_3_0=ruleXRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"org.eclipse.xtext.xbase.Xbase.XRelationalExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // InternalSuite.g:1418:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // InternalSuite.g:1419:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // InternalSuite.g:1420:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpEquality"


    // $ANTLR start "ruleOpEquality"
    // InternalSuite.g:1427:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalSuite.g:1430:28: ( (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' ) )
            // InternalSuite.g:1431:1: (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' )
            {
            // InternalSuite.g:1431:1: (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' )
            int alt29=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt29=1;
                }
                break;
            case 39:
                {
                alt29=2;
                }
                break;
            case 40:
                {
                alt29=3;
                }
                break;
            case 41:
                {
                alt29=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalSuite.g:1432:2: kw= '=='
                    {
                    kw=(Token)match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSuite.g:1439:2: kw= '!='
                    {
                    kw=(Token)match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalSuite.g:1446:2: kw= '==='
                    {
                    kw=(Token)match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignEqualsSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalSuite.g:1453:2: kw= '!=='
                    {
                    kw=(Token)match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignEqualsSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpEquality"


    // $ANTLR start "entryRuleXRelationalExpression"
    // InternalSuite.g:1466:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // InternalSuite.g:1467:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // InternalSuite.g:1468:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXRelationalExpression"


    // $ANTLR start "ruleXRelationalExpression"
    // InternalSuite.g:1475:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:1478:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // InternalSuite.g:1479:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // InternalSuite.g:1479:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // InternalSuite.g:1480:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_30);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSuite.g:1488:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop30:
            do {
                int alt30=3;
                switch ( input.LA(1) ) {
                case 33:
                    {
                    int LA30_2 = input.LA(2);

                    if ( (synpred13_InternalSuite()) ) {
                        alt30=2;
                    }


                    }
                    break;
                case 34:
                    {
                    int LA30_3 = input.LA(2);

                    if ( (synpred13_InternalSuite()) ) {
                        alt30=2;
                    }


                    }
                    break;
                case 42:
                    {
                    int LA30_4 = input.LA(2);

                    if ( (synpred12_InternalSuite()) ) {
                        alt30=1;
                    }


                    }
                    break;
                case 35:
                    {
                    int LA30_5 = input.LA(2);

                    if ( (synpred13_InternalSuite()) ) {
                        alt30=2;
                    }


                    }
                    break;

                }

                switch (alt30) {
            	case 1 :
            	    // InternalSuite.g:1488:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    {
            	    // InternalSuite.g:1488:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    // InternalSuite.g:1488:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // InternalSuite.g:1488:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // InternalSuite.g:1488:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // InternalSuite.g:1490:5: ( () otherlv_2= 'instanceof' )
            	    // InternalSuite.g:1490:6: () otherlv_2= 'instanceof'
            	    {
            	    // InternalSuite.g:1490:6: ()
            	    // InternalSuite.g:1491:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,42,FollowSets000.FOLLOW_31); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // InternalSuite.g:1500:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // InternalSuite.g:1501:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // InternalSuite.g:1501:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // InternalSuite.g:1502:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_30);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSuite.g:1519:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // InternalSuite.g:1519:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // InternalSuite.g:1519:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // InternalSuite.g:1519:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // InternalSuite.g:1519:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // InternalSuite.g:1524:6: ( () ( ( ruleOpCompare ) ) )
            	    // InternalSuite.g:1524:7: () ( ( ruleOpCompare ) )
            	    {
            	    // InternalSuite.g:1524:7: ()
            	    // InternalSuite.g:1525:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalSuite.g:1530:2: ( ( ruleOpCompare ) )
            	    // InternalSuite.g:1531:1: ( ruleOpCompare )
            	    {
            	    // InternalSuite.g:1531:1: ( ruleOpCompare )
            	    // InternalSuite.g:1532:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    ruleOpCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalSuite.g:1545:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // InternalSuite.g:1546:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // InternalSuite.g:1546:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // InternalSuite.g:1547:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_30);
            	    lv_rightOperand_6_0=ruleXOtherOperatorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_6_0, 
            	              		"org.eclipse.xtext.xbase.Xbase.XOtherOperatorExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // InternalSuite.g:1571:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // InternalSuite.g:1572:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // InternalSuite.g:1573:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpCompare"


    // $ANTLR start "ruleOpCompare"
    // InternalSuite.g:1580:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | (kw= '<' kw= '=' ) | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalSuite.g:1583:28: ( (kw= '>=' | (kw= '<' kw= '=' ) | kw= '>' | kw= '<' ) )
            // InternalSuite.g:1584:1: (kw= '>=' | (kw= '<' kw= '=' ) | kw= '>' | kw= '<' )
            {
            // InternalSuite.g:1584:1: (kw= '>=' | (kw= '<' kw= '=' ) | kw= '>' | kw= '<' )
            int alt31=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt31=1;
                }
                break;
            case 33:
                {
                int LA31_2 = input.LA(2);

                if ( (LA31_2==EOF||LA31_2==RULE_STRING||(LA31_2>=RULE_HEX && LA31_2<=RULE_ID)||LA31_2==18||LA31_2==21||(LA31_2>=25 && LA31_2<=26)||LA31_2==33||LA31_2==49||LA31_2==54||LA31_2==60||LA31_2==63||LA31_2==65||(LA31_2>=69 && LA31_2<=71)||(LA31_2>=74 && LA31_2<=86)||LA31_2==88) ) {
                    alt31=4;
                }
                else if ( (LA31_2==24) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 2, input);

                    throw nvae;
                }
                }
                break;
            case 34:
                {
                alt31=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalSuite.g:1585:2: kw= '>='
                    {
                    kw=(Token)match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSuite.g:1591:6: (kw= '<' kw= '=' )
                    {
                    // InternalSuite.g:1591:6: (kw= '<' kw= '=' )
                    // InternalSuite.g:1592:2: kw= '<' kw= '='
                    {
                    kw=(Token)match(input,33,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getEqualsSignKeyword_1_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSuite.g:1605:2: kw= '>'
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalSuite.g:1612:2: kw= '<'
                    {
                    kw=(Token)match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpCompare"


    // $ANTLR start "entryRuleXOtherOperatorExpression"
    // InternalSuite.g:1625:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // InternalSuite.g:1626:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // InternalSuite.g:1627:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXOtherOperatorExpression"


    // $ANTLR start "ruleXOtherOperatorExpression"
    // InternalSuite.g:1634:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:1637:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // InternalSuite.g:1638:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // InternalSuite.g:1638:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // InternalSuite.g:1639:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_32);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSuite.g:1647:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop32:
            do {
                int alt32=2;
                alt32 = dfa32.predict(input);
                switch (alt32) {
            	case 1 :
            	    // InternalSuite.g:1647:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // InternalSuite.g:1647:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // InternalSuite.g:1647:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // InternalSuite.g:1652:6: ( () ( ( ruleOpOther ) ) )
            	    // InternalSuite.g:1652:7: () ( ( ruleOpOther ) )
            	    {
            	    // InternalSuite.g:1652:7: ()
            	    // InternalSuite.g:1653:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalSuite.g:1658:2: ( ( ruleOpOther ) )
            	    // InternalSuite.g:1659:1: ( ruleOpOther )
            	    {
            	    // InternalSuite.g:1659:1: ( ruleOpOther )
            	    // InternalSuite.g:1660:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    ruleOpOther();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalSuite.g:1673:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // InternalSuite.g:1674:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // InternalSuite.g:1674:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // InternalSuite.g:1675:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_32);
            	    lv_rightOperand_3_0=ruleXAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"org.eclipse.xtext.xbase.Xbase.XAdditiveExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // InternalSuite.g:1699:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // InternalSuite.g:1700:2: (iv_ruleOpOther= ruleOpOther EOF )
            // InternalSuite.g:1701:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOther"


    // $ANTLR start "ruleOpOther"
    // InternalSuite.g:1708:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..<' | (kw= '>' kw= '..' ) | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' | kw= '=>' ) ) | kw= '<>' | kw= '?:' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalSuite.g:1711:28: ( (kw= '->' | kw= '..<' | (kw= '>' kw= '..' ) | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' | kw= '=>' ) ) | kw= '<>' | kw= '?:' ) )
            // InternalSuite.g:1712:1: (kw= '->' | kw= '..<' | (kw= '>' kw= '..' ) | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' | kw= '=>' ) ) | kw= '<>' | kw= '?:' )
            {
            // InternalSuite.g:1712:1: (kw= '->' | kw= '..<' | (kw= '>' kw= '..' ) | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' | kw= '=>' ) ) | kw= '<>' | kw= '?:' )
            int alt35=9;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // InternalSuite.g:1713:2: kw= '->'
                    {
                    kw=(Token)match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSuite.g:1720:2: kw= '..<'
                    {
                    kw=(Token)match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopLessThanSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalSuite.g:1726:6: (kw= '>' kw= '..' )
                    {
                    // InternalSuite.g:1726:6: (kw= '>' kw= '..' )
                    // InternalSuite.g:1727:2: kw= '>' kw= '..'
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_2_0()); 
                          
                    }
                    kw=(Token)match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_2_1()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSuite.g:1740:2: kw= '..'
                    {
                    kw=(Token)match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalSuite.g:1747:2: kw= '=>'
                    {
                    kw=(Token)match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getEqualsSignGreaterThanSignKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // InternalSuite.g:1753:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    {
                    // InternalSuite.g:1753:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    // InternalSuite.g:1754:2: kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_5_0()); 
                          
                    }
                    // InternalSuite.g:1759:1: ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==34) ) {
                        int LA33_1 = input.LA(2);

                        if ( (LA33_1==EOF||LA33_1==RULE_STRING||(LA33_1>=RULE_HEX && LA33_1<=RULE_ID)||LA33_1==18||LA33_1==21||(LA33_1>=25 && LA33_1<=26)||LA33_1==33||LA33_1==49||LA33_1==54||LA33_1==60||LA33_1==63||LA33_1==65||(LA33_1>=69 && LA33_1<=71)||(LA33_1>=74 && LA33_1<=86)||LA33_1==88) ) {
                            alt33=2;
                        }
                        else if ( (LA33_1==34) && (synpred15_InternalSuite())) {
                            alt33=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 33, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalSuite.g:1759:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            {
                            // InternalSuite.g:1759:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            // InternalSuite.g:1759:3: ( ( '>' '>' ) )=> (kw= '>' kw= '>' )
                            {
                            // InternalSuite.g:1763:5: (kw= '>' kw= '>' )
                            // InternalSuite.g:1764:2: kw= '>' kw= '>'
                            {
                            kw=(Token)match(input,34,FollowSets000.FOLLOW_34); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_5_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_5_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSuite.g:1777:2: kw= '>'
                            {
                            kw=(Token)match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_5_1_1()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalSuite.g:1783:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' | kw= '=>' ) )
                    {
                    // InternalSuite.g:1783:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' | kw= '=>' ) )
                    // InternalSuite.g:1784:2: kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' | kw= '=>' )
                    {
                    kw=(Token)match(input,33,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_6_0()); 
                          
                    }
                    // InternalSuite.g:1789:1: ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' | kw= '=>' )
                    int alt34=3;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==33) ) {
                        int LA34_1 = input.LA(2);

                        if ( (synpred16_InternalSuite()) ) {
                            alt34=1;
                        }
                        else if ( (true) ) {
                            alt34=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 34, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA34_0==46) ) {
                        alt34=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalSuite.g:1789:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            {
                            // InternalSuite.g:1789:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            // InternalSuite.g:1789:3: ( ( '<' '<' ) )=> (kw= '<' kw= '<' )
                            {
                            // InternalSuite.g:1793:5: (kw= '<' kw= '<' )
                            // InternalSuite.g:1794:2: kw= '<' kw= '<'
                            {
                            kw=(Token)match(input,33,FollowSets000.FOLLOW_24); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_6_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_6_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSuite.g:1807:2: kw= '<'
                            {
                            kw=(Token)match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_6_1_1()); 
                                  
                            }

                            }
                            break;
                        case 3 :
                            // InternalSuite.g:1814:2: kw= '=>'
                            {
                            kw=(Token)match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getEqualsSignGreaterThanSignKeyword_6_1_2()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalSuite.g:1821:2: kw= '<>'
                    {
                    kw=(Token)match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignGreaterThanSignKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // InternalSuite.g:1828:2: kw= '?:'
                    {
                    kw=(Token)match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getQuestionMarkColonKeyword_8()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOther"


    // $ANTLR start "entryRuleXAdditiveExpression"
    // InternalSuite.g:1841:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // InternalSuite.g:1842:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // InternalSuite.g:1843:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAdditiveExpression"


    // $ANTLR start "ruleXAdditiveExpression"
    // InternalSuite.g:1850:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:1853:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // InternalSuite.g:1854:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // InternalSuite.g:1854:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // InternalSuite.g:1855:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_36);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSuite.g:1863:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==49) ) {
                    int LA36_2 = input.LA(2);

                    if ( (synpred17_InternalSuite()) ) {
                        alt36=1;
                    }


                }
                else if ( (LA36_0==18) ) {
                    int LA36_3 = input.LA(2);

                    if ( (synpred17_InternalSuite()) ) {
                        alt36=1;
                    }


                }


                switch (alt36) {
            	case 1 :
            	    // InternalSuite.g:1863:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // InternalSuite.g:1863:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // InternalSuite.g:1863:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // InternalSuite.g:1868:6: ( () ( ( ruleOpAdd ) ) )
            	    // InternalSuite.g:1868:7: () ( ( ruleOpAdd ) )
            	    {
            	    // InternalSuite.g:1868:7: ()
            	    // InternalSuite.g:1869:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalSuite.g:1874:2: ( ( ruleOpAdd ) )
            	    // InternalSuite.g:1875:1: ( ruleOpAdd )
            	    {
            	    // InternalSuite.g:1875:1: ( ruleOpAdd )
            	    // InternalSuite.g:1876:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    ruleOpAdd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalSuite.g:1889:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // InternalSuite.g:1890:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // InternalSuite.g:1890:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // InternalSuite.g:1891:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_36);
            	    lv_rightOperand_3_0=ruleXMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"org.eclipse.xtext.xbase.Xbase.XMultiplicativeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // InternalSuite.g:1915:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // InternalSuite.g:1916:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // InternalSuite.g:1917:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAdd"


    // $ANTLR start "ruleOpAdd"
    // InternalSuite.g:1924:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalSuite.g:1927:28: ( (kw= '+' | kw= '-' ) )
            // InternalSuite.g:1928:1: (kw= '+' | kw= '-' )
            {
            // InternalSuite.g:1928:1: (kw= '+' | kw= '-' )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==49) ) {
                alt37=1;
            }
            else if ( (LA37_0==18) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalSuite.g:1929:2: kw= '+'
                    {
                    kw=(Token)match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSuite.g:1936:2: kw= '-'
                    {
                    kw=(Token)match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAdd"


    // $ANTLR start "entryRuleXMultiplicativeExpression"
    // InternalSuite.g:1949:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // InternalSuite.g:1950:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // InternalSuite.g:1951:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXMultiplicativeExpression"


    // $ANTLR start "ruleXMultiplicativeExpression"
    // InternalSuite.g:1958:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:1961:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // InternalSuite.g:1962:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // InternalSuite.g:1962:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // InternalSuite.g:1963:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_37);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSuite.g:1971:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop38:
            do {
                int alt38=2;
                switch ( input.LA(1) ) {
                case 50:
                    {
                    int LA38_2 = input.LA(2);

                    if ( (synpred18_InternalSuite()) ) {
                        alt38=1;
                    }


                    }
                    break;
                case 51:
                    {
                    int LA38_3 = input.LA(2);

                    if ( (synpred18_InternalSuite()) ) {
                        alt38=1;
                    }


                    }
                    break;
                case 52:
                    {
                    int LA38_4 = input.LA(2);

                    if ( (synpred18_InternalSuite()) ) {
                        alt38=1;
                    }


                    }
                    break;
                case 53:
                    {
                    int LA38_5 = input.LA(2);

                    if ( (synpred18_InternalSuite()) ) {
                        alt38=1;
                    }


                    }
                    break;

                }

                switch (alt38) {
            	case 1 :
            	    // InternalSuite.g:1971:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // InternalSuite.g:1971:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // InternalSuite.g:1971:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // InternalSuite.g:1976:6: ( () ( ( ruleOpMulti ) ) )
            	    // InternalSuite.g:1976:7: () ( ( ruleOpMulti ) )
            	    {
            	    // InternalSuite.g:1976:7: ()
            	    // InternalSuite.g:1977:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalSuite.g:1982:2: ( ( ruleOpMulti ) )
            	    // InternalSuite.g:1983:1: ( ruleOpMulti )
            	    {
            	    // InternalSuite.g:1983:1: ( ruleOpMulti )
            	    // InternalSuite.g:1984:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    ruleOpMulti();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalSuite.g:1997:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // InternalSuite.g:1998:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // InternalSuite.g:1998:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // InternalSuite.g:1999:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_37);
            	    lv_rightOperand_3_0=ruleXUnaryOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"org.eclipse.xtext.xbase.Xbase.XUnaryOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // InternalSuite.g:2023:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // InternalSuite.g:2024:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // InternalSuite.g:2025:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpMulti"


    // $ANTLR start "ruleOpMulti"
    // InternalSuite.g:2032:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalSuite.g:2035:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // InternalSuite.g:2036:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // InternalSuite.g:2036:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt39=4;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt39=1;
                }
                break;
            case 51:
                {
                alt39=2;
                }
                break;
            case 52:
                {
                alt39=3;
                }
                break;
            case 53:
                {
                alt39=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalSuite.g:2037:2: kw= '*'
                    {
                    kw=(Token)match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSuite.g:2044:2: kw= '**'
                    {
                    kw=(Token)match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalSuite.g:2051:2: kw= '/'
                    {
                    kw=(Token)match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalSuite.g:2058:2: kw= '%'
                    {
                    kw=(Token)match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getPercentSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpMulti"


    // $ANTLR start "entryRuleXUnaryOperation"
    // InternalSuite.g:2071:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // InternalSuite.g:2072:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // InternalSuite.g:2073:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXUnaryOperation"


    // $ANTLR start "ruleXUnaryOperation"
    // InternalSuite.g:2080:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:2083:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // InternalSuite.g:2084:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // InternalSuite.g:2084:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==18||LA40_0==49||LA40_0==54) ) {
                alt40=1;
            }
            else if ( (LA40_0==RULE_STRING||(LA40_0>=RULE_HEX && LA40_0<=RULE_ID)||LA40_0==21||(LA40_0>=25 && LA40_0<=26)||LA40_0==33||LA40_0==60||LA40_0==63||LA40_0==65||(LA40_0>=69 && LA40_0<=71)||(LA40_0>=74 && LA40_0<=86)||LA40_0==88) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalSuite.g:2084:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) )
                    {
                    // InternalSuite.g:2084:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) )
                    // InternalSuite.g:2084:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) )
                    {
                    // InternalSuite.g:2084:3: ()
                    // InternalSuite.g:2085:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalSuite.g:2090:2: ( ( ruleOpUnary ) )
                    // InternalSuite.g:2091:1: ( ruleOpUnary )
                    {
                    // InternalSuite.g:2091:1: ( ruleOpUnary )
                    // InternalSuite.g:2092:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_18);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSuite.g:2105:2: ( (lv_operand_2_0= ruleXUnaryOperation ) )
                    // InternalSuite.g:2106:1: (lv_operand_2_0= ruleXUnaryOperation )
                    {
                    // InternalSuite.g:2106:1: (lv_operand_2_0= ruleXUnaryOperation )
                    // InternalSuite.g:2107:3: lv_operand_2_0= ruleXUnaryOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXUnaryOperationParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_operand_2_0=ruleXUnaryOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXUnaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_2_0, 
                              		"org.eclipse.xtext.xbase.Xbase.XUnaryOperation");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSuite.g:2125:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XCastedExpression_3=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XCastedExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXUnaryOperation"


    // $ANTLR start "entryRuleOpUnary"
    // InternalSuite.g:2141:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // InternalSuite.g:2142:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // InternalSuite.g:2143:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpUnary"


    // $ANTLR start "ruleOpUnary"
    // InternalSuite.g:2150:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalSuite.g:2153:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // InternalSuite.g:2154:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // InternalSuite.g:2154:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt41=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt41=1;
                }
                break;
            case 18:
                {
                alt41=2;
                }
                break;
            case 49:
                {
                alt41=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalSuite.g:2155:2: kw= '!'
                    {
                    kw=(Token)match(input,54,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSuite.g:2162:2: kw= '-'
                    {
                    kw=(Token)match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalSuite.g:2169:2: kw= '+'
                    {
                    kw=(Token)match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getPlusSignKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpUnary"


    // $ANTLR start "entryRuleXCastedExpression"
    // InternalSuite.g:2182:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // InternalSuite.g:2183:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // InternalSuite.g:2184:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCastedExpression"


    // $ANTLR start "ruleXCastedExpression"
    // InternalSuite.g:2191:1: ruleXCastedExpression returns [EObject current=null] : (this_XPostfixOperation_0= ruleXPostfixOperation ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XPostfixOperation_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:2194:28: ( (this_XPostfixOperation_0= ruleXPostfixOperation ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // InternalSuite.g:2195:1: (this_XPostfixOperation_0= ruleXPostfixOperation ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // InternalSuite.g:2195:1: (this_XPostfixOperation_0= ruleXPostfixOperation ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // InternalSuite.g:2196:5: this_XPostfixOperation_0= ruleXPostfixOperation ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXPostfixOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_38);
            this_XPostfixOperation_0=ruleXPostfixOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPostfixOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSuite.g:2204:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==55) ) {
                    int LA42_2 = input.LA(2);

                    if ( (synpred19_InternalSuite()) ) {
                        alt42=1;
                    }


                }


                switch (alt42) {
            	case 1 :
            	    // InternalSuite.g:2204:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // InternalSuite.g:2204:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // InternalSuite.g:2204:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // InternalSuite.g:2206:5: ( () otherlv_2= 'as' )
            	    // InternalSuite.g:2206:6: () otherlv_2= 'as'
            	    {
            	    // InternalSuite.g:2206:6: ()
            	    // InternalSuite.g:2207:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,55,FollowSets000.FOLLOW_31); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // InternalSuite.g:2216:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // InternalSuite.g:2217:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // InternalSuite.g:2217:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // InternalSuite.g:2218:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_38);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXCastedExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXPostfixOperation"
    // InternalSuite.g:2242:1: entryRuleXPostfixOperation returns [EObject current=null] : iv_ruleXPostfixOperation= ruleXPostfixOperation EOF ;
    public final EObject entryRuleXPostfixOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPostfixOperation = null;


        try {
            // InternalSuite.g:2243:2: (iv_ruleXPostfixOperation= ruleXPostfixOperation EOF )
            // InternalSuite.g:2244:2: iv_ruleXPostfixOperation= ruleXPostfixOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPostfixOperationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXPostfixOperation=ruleXPostfixOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPostfixOperation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXPostfixOperation"


    // $ANTLR start "ruleXPostfixOperation"
    // InternalSuite.g:2251:1: ruleXPostfixOperation returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( () ( ( ruleOpPostfix ) ) ) )=> ( () ( ( ruleOpPostfix ) ) ) )? ) ;
    public final EObject ruleXPostfixOperation() throws RecognitionException {
        EObject current = null;

        EObject this_XMemberFeatureCall_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:2254:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( () ( ( ruleOpPostfix ) ) ) )=> ( () ( ( ruleOpPostfix ) ) ) )? ) )
            // InternalSuite.g:2255:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( () ( ( ruleOpPostfix ) ) ) )=> ( () ( ( ruleOpPostfix ) ) ) )? )
            {
            // InternalSuite.g:2255:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( () ( ( ruleOpPostfix ) ) ) )=> ( () ( ( ruleOpPostfix ) ) ) )? )
            // InternalSuite.g:2256:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( () ( ( ruleOpPostfix ) ) ) )=> ( () ( ( ruleOpPostfix ) ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXPostfixOperationAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_39);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSuite.g:2264:1: ( ( ( () ( ( ruleOpPostfix ) ) ) )=> ( () ( ( ruleOpPostfix ) ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==56) ) {
                int LA43_1 = input.LA(2);

                if ( (synpred20_InternalSuite()) ) {
                    alt43=1;
                }
            }
            else if ( (LA43_0==57) ) {
                int LA43_2 = input.LA(2);

                if ( (synpred20_InternalSuite()) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // InternalSuite.g:2264:2: ( ( () ( ( ruleOpPostfix ) ) ) )=> ( () ( ( ruleOpPostfix ) ) )
                    {
                    // InternalSuite.g:2269:6: ( () ( ( ruleOpPostfix ) ) )
                    // InternalSuite.g:2269:7: () ( ( ruleOpPostfix ) )
                    {
                    // InternalSuite.g:2269:7: ()
                    // InternalSuite.g:2270:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalSuite.g:2275:2: ( ( ruleOpPostfix ) )
                    // InternalSuite.g:2276:1: ( ruleOpPostfix )
                    {
                    // InternalSuite.g:2276:1: ( ruleOpPostfix )
                    // InternalSuite.g:2277:3: ruleOpPostfix
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXPostfixOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXPostfixOperationAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleOpPostfix();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXPostfixOperation"


    // $ANTLR start "entryRuleOpPostfix"
    // InternalSuite.g:2298:1: entryRuleOpPostfix returns [String current=null] : iv_ruleOpPostfix= ruleOpPostfix EOF ;
    public final String entryRuleOpPostfix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpPostfix = null;


        try {
            // InternalSuite.g:2299:2: (iv_ruleOpPostfix= ruleOpPostfix EOF )
            // InternalSuite.g:2300:2: iv_ruleOpPostfix= ruleOpPostfix EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpPostfixRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOpPostfix=ruleOpPostfix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpPostfix.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpPostfix"


    // $ANTLR start "ruleOpPostfix"
    // InternalSuite.g:2307:1: ruleOpPostfix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '++' | kw= '--' ) ;
    public final AntlrDatatypeRuleToken ruleOpPostfix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalSuite.g:2310:28: ( (kw= '++' | kw= '--' ) )
            // InternalSuite.g:2311:1: (kw= '++' | kw= '--' )
            {
            // InternalSuite.g:2311:1: (kw= '++' | kw= '--' )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==56) ) {
                alt44=1;
            }
            else if ( (LA44_0==57) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalSuite.g:2312:2: kw= '++'
                    {
                    kw=(Token)match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpPostfixAccess().getPlusSignPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSuite.g:2319:2: kw= '--'
                    {
                    kw=(Token)match(input,57,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpPostfixAccess().getHyphenMinusHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpPostfix"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // InternalSuite.g:2332:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // InternalSuite.g:2333:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // InternalSuite.g:2334:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXMemberFeatureCall"


    // $ANTLR start "ruleXMemberFeatureCall"
    // InternalSuite.g:2341:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? ) )* ) ;
    public final EObject ruleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitStatic_3_0=null;
        Token otherlv_8=null;
        Token lv_nullSafe_9_0=null;
        Token lv_explicitStatic_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token lv_explicitOperationCall_17_0=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        EObject this_XPrimaryExpression_0 = null;

        EObject lv_value_6_0 = null;

        EObject lv_typeArguments_12_0 = null;

        EObject lv_typeArguments_14_0 = null;

        EObject lv_memberCallArguments_18_0 = null;

        EObject lv_memberCallArguments_19_0 = null;

        EObject lv_memberCallArguments_21_0 = null;

        EObject lv_memberCallArguments_23_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:2344:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? ) )* ) )
            // InternalSuite.g:2345:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? ) )* )
            {
            // InternalSuite.g:2345:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? ) )* )
            // InternalSuite.g:2346:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_40);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSuite.g:2354:1: ( ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? ) )*
            loop53:
            do {
                int alt53=3;
                switch ( input.LA(1) ) {
                case 19:
                    {
                    int LA53_2 = input.LA(2);

                    if ( (synpred21_InternalSuite()) ) {
                        alt53=1;
                    }
                    else if ( (synpred22_InternalSuite()) ) {
                        alt53=2;
                    }


                    }
                    break;
                case 58:
                    {
                    int LA53_3 = input.LA(2);

                    if ( (synpred21_InternalSuite()) ) {
                        alt53=1;
                    }
                    else if ( (synpred22_InternalSuite()) ) {
                        alt53=2;
                    }


                    }
                    break;
                case 59:
                    {
                    int LA53_4 = input.LA(2);

                    if ( (synpred22_InternalSuite()) ) {
                        alt53=2;
                    }


                    }
                    break;

                }

                switch (alt53) {
            	case 1 :
            	    // InternalSuite.g:2354:2: ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) )
            	    {
            	    // InternalSuite.g:2354:2: ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) )
            	    // InternalSuite.g:2354:3: ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) )
            	    {
            	    // InternalSuite.g:2354:3: ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )
            	    // InternalSuite.g:2354:4: ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign )
            	    {
            	    // InternalSuite.g:2367:25: ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign )
            	    // InternalSuite.g:2367:26: () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign
            	    {
            	    // InternalSuite.g:2367:26: ()
            	    // InternalSuite.g:2368:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalSuite.g:2373:2: (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) )
            	    int alt45=2;
            	    int LA45_0 = input.LA(1);

            	    if ( (LA45_0==19) ) {
            	        alt45=1;
            	    }
            	    else if ( (LA45_0==58) ) {
            	        alt45=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 45, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt45) {
            	        case 1 :
            	            // InternalSuite.g:2373:4: otherlv_2= '.'
            	            {
            	            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_41); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalSuite.g:2378:6: ( (lv_explicitStatic_3_0= '::' ) )
            	            {
            	            // InternalSuite.g:2378:6: ( (lv_explicitStatic_3_0= '::' ) )
            	            // InternalSuite.g:2379:1: (lv_explicitStatic_3_0= '::' )
            	            {
            	            // InternalSuite.g:2379:1: (lv_explicitStatic_3_0= '::' )
            	            // InternalSuite.g:2380:3: lv_explicitStatic_3_0= '::'
            	            {
            	            lv_explicitStatic_3_0=(Token)match(input,58,FollowSets000.FOLLOW_41); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_explicitStatic_3_0, grammarAccess.getXMemberFeatureCallAccess().getExplicitStaticColonColonKeyword_1_0_0_0_1_1_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "explicitStatic", true, "::");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalSuite.g:2393:3: ( ( ruleFeatureCallID ) )
            	    // InternalSuite.g:2394:1: ( ruleFeatureCallID )
            	    {
            	    // InternalSuite.g:2394:1: ( ruleFeatureCallID )
            	    // InternalSuite.g:2395:3: ruleFeatureCallID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_17);
            	    ruleFeatureCallID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3()); 
            	          
            	    }
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // InternalSuite.g:2416:3: ( (lv_value_6_0= ruleXAssignment ) )
            	    // InternalSuite.g:2417:1: (lv_value_6_0= ruleXAssignment )
            	    {
            	    // InternalSuite.g:2417:1: (lv_value_6_0= ruleXAssignment )
            	    // InternalSuite.g:2418:3: lv_value_6_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_40);
            	    lv_value_6_0=ruleXAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"value",
            	              		lv_value_6_0, 
            	              		"org.eclipse.xtext.xbase.Xbase.XAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSuite.g:2435:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? )
            	    {
            	    // InternalSuite.g:2435:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? )
            	    // InternalSuite.g:2435:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )?
            	    {
            	    // InternalSuite.g:2435:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) )
            	    // InternalSuite.g:2435:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) )
            	    {
            	    // InternalSuite.g:2451:7: ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) )
            	    // InternalSuite.g:2451:8: () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) )
            	    {
            	    // InternalSuite.g:2451:8: ()
            	    // InternalSuite.g:2452:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalSuite.g:2457:2: (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) )
            	    int alt46=3;
            	    switch ( input.LA(1) ) {
            	    case 19:
            	        {
            	        alt46=1;
            	        }
            	        break;
            	    case 59:
            	        {
            	        alt46=2;
            	        }
            	        break;
            	    case 58:
            	        {
            	        alt46=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 46, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt46) {
            	        case 1 :
            	            // InternalSuite.g:2457:4: otherlv_8= '.'
            	            {
            	            otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_42); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_8, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalSuite.g:2462:6: ( (lv_nullSafe_9_0= '?.' ) )
            	            {
            	            // InternalSuite.g:2462:6: ( (lv_nullSafe_9_0= '?.' ) )
            	            // InternalSuite.g:2463:1: (lv_nullSafe_9_0= '?.' )
            	            {
            	            // InternalSuite.g:2463:1: (lv_nullSafe_9_0= '?.' )
            	            // InternalSuite.g:2464:3: lv_nullSafe_9_0= '?.'
            	            {
            	            lv_nullSafe_9_0=(Token)match(input,59,FollowSets000.FOLLOW_42); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_nullSafe_9_0, grammarAccess.getXMemberFeatureCallAccess().getNullSafeQuestionMarkFullStopKeyword_1_1_0_0_1_1_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "nullSafe", true, "?.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalSuite.g:2478:6: ( (lv_explicitStatic_10_0= '::' ) )
            	            {
            	            // InternalSuite.g:2478:6: ( (lv_explicitStatic_10_0= '::' ) )
            	            // InternalSuite.g:2479:1: (lv_explicitStatic_10_0= '::' )
            	            {
            	            // InternalSuite.g:2479:1: (lv_explicitStatic_10_0= '::' )
            	            // InternalSuite.g:2480:3: lv_explicitStatic_10_0= '::'
            	            {
            	            lv_explicitStatic_10_0=(Token)match(input,58,FollowSets000.FOLLOW_42); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_explicitStatic_10_0, grammarAccess.getXMemberFeatureCallAccess().getExplicitStaticColonColonKeyword_1_1_0_0_1_2_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "explicitStatic", true, "::");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalSuite.g:2493:5: (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )?
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( (LA48_0==33) ) {
            	        alt48=1;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // InternalSuite.g:2493:7: otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>'
            	            {
            	            otherlv_11=(Token)match(input,33,FollowSets000.FOLLOW_43); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_11, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // InternalSuite.g:2497:1: ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) )
            	            // InternalSuite.g:2498:1: (lv_typeArguments_12_0= ruleJvmArgumentTypeReference )
            	            {
            	            // InternalSuite.g:2498:1: (lv_typeArguments_12_0= ruleJvmArgumentTypeReference )
            	            // InternalSuite.g:2499:3: lv_typeArguments_12_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FollowSets000.FOLLOW_44);
            	            lv_typeArguments_12_0=ruleJvmArgumentTypeReference();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"typeArguments",
            	                      		lv_typeArguments_12_0, 
            	                      		"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }

            	            // InternalSuite.g:2515:2: (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop47:
            	            do {
            	                int alt47=2;
            	                int LA47_0 = input.LA(1);

            	                if ( (LA47_0==22) ) {
            	                    alt47=1;
            	                }


            	                switch (alt47) {
            	            	case 1 :
            	            	    // InternalSuite.g:2515:4: otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_13=(Token)match(input,22,FollowSets000.FOLLOW_43); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_13, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // InternalSuite.g:2519:1: ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) )
            	            	    // InternalSuite.g:2520:1: (lv_typeArguments_14_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // InternalSuite.g:2520:1: (lv_typeArguments_14_0= ruleJvmArgumentTypeReference )
            	            	    // InternalSuite.g:2521:3: lv_typeArguments_14_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FollowSets000.FOLLOW_44);
            	            	    lv_typeArguments_14_0=ruleJvmArgumentTypeReference();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	            	      	        }
            	            	             		add(
            	            	             			current, 
            	            	             			"typeArguments",
            	            	              		lv_typeArguments_14_0, 
            	            	              		"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
            	            	      	        afterParserOrEnumRuleCall();
            	            	      	    
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop47;
            	                }
            	            } while (true);

            	            otherlv_15=(Token)match(input,34,FollowSets000.FOLLOW_42); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_15, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // InternalSuite.g:2541:3: ( ( ruleIdOrSuper ) )
            	    // InternalSuite.g:2542:1: ( ruleIdOrSuper )
            	    {
            	    // InternalSuite.g:2542:1: ( ruleIdOrSuper )
            	    // InternalSuite.g:2543:3: ruleIdOrSuper
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_45);
            	    ruleIdOrSuper();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // InternalSuite.g:2556:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )?
            	    int alt51=2;
            	    alt51 = dfa51.predict(input);
            	    switch (alt51) {
            	        case 1 :
            	            // InternalSuite.g:2556:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')'
            	            {
            	            // InternalSuite.g:2556:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) )
            	            // InternalSuite.g:2556:4: ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' )
            	            {
            	            // InternalSuite.g:2563:1: (lv_explicitOperationCall_17_0= '(' )
            	            // InternalSuite.g:2564:3: lv_explicitOperationCall_17_0= '('
            	            {
            	            lv_explicitOperationCall_17_0=(Token)match(input,21,FollowSets000.FOLLOW_46); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_explicitOperationCall_17_0, grammarAccess.getXMemberFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_3_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              	    
            	            }

            	            }


            	            }

            	            // InternalSuite.g:2577:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )?
            	            int alt50=3;
            	            alt50 = dfa50.predict(input);
            	            switch (alt50) {
            	                case 1 :
            	                    // InternalSuite.g:2577:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) )
            	                    {
            	                    // InternalSuite.g:2577:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) )
            	                    // InternalSuite.g:2577:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure )
            	                    {
            	                    // InternalSuite.g:2594:1: (lv_memberCallArguments_18_0= ruleXShortClosure )
            	                    // InternalSuite.g:2595:3: lv_memberCallArguments_18_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FollowSets000.FOLLOW_16);
            	                    lv_memberCallArguments_18_0=ruleXShortClosure();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_18_0, 
            	                              		"org.eclipse.xtext.xbase.Xbase.XShortClosure");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // InternalSuite.g:2612:6: ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* )
            	                    {
            	                    // InternalSuite.g:2612:6: ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* )
            	                    // InternalSuite.g:2612:7: ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )*
            	                    {
            	                    // InternalSuite.g:2612:7: ( (lv_memberCallArguments_19_0= ruleXExpression ) )
            	                    // InternalSuite.g:2613:1: (lv_memberCallArguments_19_0= ruleXExpression )
            	                    {
            	                    // InternalSuite.g:2613:1: (lv_memberCallArguments_19_0= ruleXExpression )
            	                    // InternalSuite.g:2614:3: lv_memberCallArguments_19_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FollowSets000.FOLLOW_15);
            	                    lv_memberCallArguments_19_0=ruleXExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_19_0, 
            	                              		"org.eclipse.xtext.xbase.Xbase.XExpression");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }

            	                    // InternalSuite.g:2630:2: (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )*
            	                    loop49:
            	                    do {
            	                        int alt49=2;
            	                        int LA49_0 = input.LA(1);

            	                        if ( (LA49_0==22) ) {
            	                            alt49=1;
            	                        }


            	                        switch (alt49) {
            	                    	case 1 :
            	                    	    // InternalSuite.g:2630:4: otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_20=(Token)match(input,22,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_20, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // InternalSuite.g:2634:1: ( (lv_memberCallArguments_21_0= ruleXExpression ) )
            	                    	    // InternalSuite.g:2635:1: (lv_memberCallArguments_21_0= ruleXExpression )
            	                    	    {
            	                    	    // InternalSuite.g:2635:1: (lv_memberCallArguments_21_0= ruleXExpression )
            	                    	    // InternalSuite.g:2636:3: lv_memberCallArguments_21_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FollowSets000.FOLLOW_15);
            	                    	    lv_memberCallArguments_21_0=ruleXExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      	        if (current==null) {
            	                    	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                    	      	        }
            	                    	             		add(
            	                    	             			current, 
            	                    	             			"memberCallArguments",
            	                    	              		lv_memberCallArguments_21_0, 
            	                    	              		"org.eclipse.xtext.xbase.Xbase.XExpression");
            	                    	      	        afterParserOrEnumRuleCall();
            	                    	      	    
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop49;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_22=(Token)match(input,23,FollowSets000.FOLLOW_47); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_22, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // InternalSuite.g:2656:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )?
            	    int alt52=2;
            	    alt52 = dfa52.predict(input);
            	    switch (alt52) {
            	        case 1 :
            	            // InternalSuite.g:2656:4: ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure )
            	            {
            	            // InternalSuite.g:2659:1: (lv_memberCallArguments_23_0= ruleXClosure )
            	            // InternalSuite.g:2660:3: lv_memberCallArguments_23_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FollowSets000.FOLLOW_40);
            	            lv_memberCallArguments_23_0=ruleXClosure();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"memberCallArguments",
            	                      		lv_memberCallArguments_23_0, 
            	                      		"org.eclipse.xtext.xbase.Xbase.XClosure");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // InternalSuite.g:2684:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // InternalSuite.g:2685:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // InternalSuite.g:2686:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXPrimaryExpression"


    // $ANTLR start "ruleXPrimaryExpression"
    // InternalSuite.g:2693:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | ( ( ( () 'synchronized' '(' ) )=>this_XSynchronizedExpression_3= ruleXSynchronizedExpression ) | this_XFeatureCall_4= ruleXFeatureCall | this_XLiteral_5= ruleXLiteral | this_XIfExpression_6= ruleXIfExpression | ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=>this_XForLoopExpression_7= ruleXForLoopExpression ) | this_XBasicForLoopExpression_8= ruleXBasicForLoopExpression | this_XWhileExpression_9= ruleXWhileExpression | this_XDoWhileExpression_10= ruleXDoWhileExpression | this_XThrowExpression_11= ruleXThrowExpression | this_XReturnExpression_12= ruleXReturnExpression | this_XTryCatchFinallyExpression_13= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_14= ruleXParenthesizedExpression ) ;
    public final EObject ruleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XConstructorCall_0 = null;

        EObject this_XBlockExpression_1 = null;

        EObject this_XSwitchExpression_2 = null;

        EObject this_XSynchronizedExpression_3 = null;

        EObject this_XFeatureCall_4 = null;

        EObject this_XLiteral_5 = null;

        EObject this_XIfExpression_6 = null;

        EObject this_XForLoopExpression_7 = null;

        EObject this_XBasicForLoopExpression_8 = null;

        EObject this_XWhileExpression_9 = null;

        EObject this_XDoWhileExpression_10 = null;

        EObject this_XThrowExpression_11 = null;

        EObject this_XReturnExpression_12 = null;

        EObject this_XTryCatchFinallyExpression_13 = null;

        EObject this_XParenthesizedExpression_14 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:2696:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | ( ( ( () 'synchronized' '(' ) )=>this_XSynchronizedExpression_3= ruleXSynchronizedExpression ) | this_XFeatureCall_4= ruleXFeatureCall | this_XLiteral_5= ruleXLiteral | this_XIfExpression_6= ruleXIfExpression | ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=>this_XForLoopExpression_7= ruleXForLoopExpression ) | this_XBasicForLoopExpression_8= ruleXBasicForLoopExpression | this_XWhileExpression_9= ruleXWhileExpression | this_XDoWhileExpression_10= ruleXDoWhileExpression | this_XThrowExpression_11= ruleXThrowExpression | this_XReturnExpression_12= ruleXReturnExpression | this_XTryCatchFinallyExpression_13= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_14= ruleXParenthesizedExpression ) )
            // InternalSuite.g:2697:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | ( ( ( () 'synchronized' '(' ) )=>this_XSynchronizedExpression_3= ruleXSynchronizedExpression ) | this_XFeatureCall_4= ruleXFeatureCall | this_XLiteral_5= ruleXLiteral | this_XIfExpression_6= ruleXIfExpression | ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=>this_XForLoopExpression_7= ruleXForLoopExpression ) | this_XBasicForLoopExpression_8= ruleXBasicForLoopExpression | this_XWhileExpression_9= ruleXWhileExpression | this_XDoWhileExpression_10= ruleXDoWhileExpression | this_XThrowExpression_11= ruleXThrowExpression | this_XReturnExpression_12= ruleXReturnExpression | this_XTryCatchFinallyExpression_13= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_14= ruleXParenthesizedExpression )
            {
            // InternalSuite.g:2697:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | ( ( ( () 'synchronized' '(' ) )=>this_XSynchronizedExpression_3= ruleXSynchronizedExpression ) | this_XFeatureCall_4= ruleXFeatureCall | this_XLiteral_5= ruleXLiteral | this_XIfExpression_6= ruleXIfExpression | ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=>this_XForLoopExpression_7= ruleXForLoopExpression ) | this_XBasicForLoopExpression_8= ruleXBasicForLoopExpression | this_XWhileExpression_9= ruleXWhileExpression | this_XDoWhileExpression_10= ruleXDoWhileExpression | this_XThrowExpression_11= ruleXThrowExpression | this_XReturnExpression_12= ruleXReturnExpression | this_XTryCatchFinallyExpression_13= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_14= ruleXParenthesizedExpression )
            int alt54=15;
            alt54 = dfa54.predict(input);
            switch (alt54) {
                case 1 :
                    // InternalSuite.g:2698:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XConstructorCall_0=ruleXConstructorCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XConstructorCall_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSuite.g:2708:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XBlockExpression_1=ruleXBlockExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBlockExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalSuite.g:2718:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XSwitchExpression_2=ruleXSwitchExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XSwitchExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalSuite.g:2727:6: ( ( ( () 'synchronized' '(' ) )=>this_XSynchronizedExpression_3= ruleXSynchronizedExpression )
                    {
                    // InternalSuite.g:2727:6: ( ( ( () 'synchronized' '(' ) )=>this_XSynchronizedExpression_3= ruleXSynchronizedExpression )
                    // InternalSuite.g:2727:7: ( ( () 'synchronized' '(' ) )=>this_XSynchronizedExpression_3= ruleXSynchronizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSynchronizedExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XSynchronizedExpression_3=ruleXSynchronizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XSynchronizedExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSuite.g:2741:5: this_XFeatureCall_4= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XFeatureCall_4=ruleXFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFeatureCall_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // InternalSuite.g:2751:5: this_XLiteral_5= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XLiteral_5=ruleXLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XLiteral_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // InternalSuite.g:2761:5: this_XIfExpression_6= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XIfExpression_6=ruleXIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIfExpression_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // InternalSuite.g:2770:6: ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=>this_XForLoopExpression_7= ruleXForLoopExpression )
                    {
                    // InternalSuite.g:2770:6: ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=>this_XForLoopExpression_7= ruleXForLoopExpression )
                    // InternalSuite.g:2770:7: ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=>this_XForLoopExpression_7= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XForLoopExpression_7=ruleXForLoopExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XForLoopExpression_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalSuite.g:2789:5: this_XBasicForLoopExpression_8= ruleXBasicForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBasicForLoopExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XBasicForLoopExpression_8=ruleXBasicForLoopExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBasicForLoopExpression_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // InternalSuite.g:2799:5: this_XWhileExpression_9= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XWhileExpression_9=ruleXWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XWhileExpression_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // InternalSuite.g:2809:5: this_XDoWhileExpression_10= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XDoWhileExpression_10=ruleXDoWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XDoWhileExpression_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // InternalSuite.g:2819:5: this_XThrowExpression_11= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XThrowExpression_11=ruleXThrowExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XThrowExpression_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 13 :
                    // InternalSuite.g:2829:5: this_XReturnExpression_12= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XReturnExpression_12=ruleXReturnExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XReturnExpression_12; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 14 :
                    // InternalSuite.g:2839:5: this_XTryCatchFinallyExpression_13= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_13()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XTryCatchFinallyExpression_13=ruleXTryCatchFinallyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTryCatchFinallyExpression_13; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 15 :
                    // InternalSuite.g:2849:5: this_XParenthesizedExpression_14= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_14()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XParenthesizedExpression_14=ruleXParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XParenthesizedExpression_14; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXPrimaryExpression"


    // $ANTLR start "entryRuleXLiteral"
    // InternalSuite.g:2865:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // InternalSuite.g:2866:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // InternalSuite.g:2867:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXLiteral"


    // $ANTLR start "ruleXLiteral"
    // InternalSuite.g:2874:1: ruleXLiteral returns [EObject current=null] : (this_XCollectionLiteral_0= ruleXCollectionLiteral | ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure ) | this_XBooleanLiteral_2= ruleXBooleanLiteral | this_XNumberLiteral_3= ruleXNumberLiteral | this_XNullLiteral_4= ruleXNullLiteral | this_XStringLiteral_5= ruleXStringLiteral | this_XTypeLiteral_6= ruleXTypeLiteral ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XCollectionLiteral_0 = null;

        EObject this_XClosure_1 = null;

        EObject this_XBooleanLiteral_2 = null;

        EObject this_XNumberLiteral_3 = null;

        EObject this_XNullLiteral_4 = null;

        EObject this_XStringLiteral_5 = null;

        EObject this_XTypeLiteral_6 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:2877:28: ( (this_XCollectionLiteral_0= ruleXCollectionLiteral | ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure ) | this_XBooleanLiteral_2= ruleXBooleanLiteral | this_XNumberLiteral_3= ruleXNumberLiteral | this_XNullLiteral_4= ruleXNullLiteral | this_XStringLiteral_5= ruleXStringLiteral | this_XTypeLiteral_6= ruleXTypeLiteral ) )
            // InternalSuite.g:2878:1: (this_XCollectionLiteral_0= ruleXCollectionLiteral | ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure ) | this_XBooleanLiteral_2= ruleXBooleanLiteral | this_XNumberLiteral_3= ruleXNumberLiteral | this_XNullLiteral_4= ruleXNullLiteral | this_XStringLiteral_5= ruleXStringLiteral | this_XTypeLiteral_6= ruleXTypeLiteral )
            {
            // InternalSuite.g:2878:1: (this_XCollectionLiteral_0= ruleXCollectionLiteral | ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure ) | this_XBooleanLiteral_2= ruleXBooleanLiteral | this_XNumberLiteral_3= ruleXNumberLiteral | this_XNullLiteral_4= ruleXNullLiteral | this_XStringLiteral_5= ruleXStringLiteral | this_XTypeLiteral_6= ruleXTypeLiteral )
            int alt55=7;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==25) ) {
                alt55=1;
            }
            else if ( (LA55_0==26) && (synpred28_InternalSuite())) {
                alt55=2;
            }
            else if ( ((LA55_0>=80 && LA55_0<=81)) ) {
                alt55=3;
            }
            else if ( ((LA55_0>=RULE_HEX && LA55_0<=RULE_DECIMAL)) ) {
                alt55=4;
            }
            else if ( (LA55_0==82) ) {
                alt55=5;
            }
            else if ( (LA55_0==RULE_STRING) ) {
                alt55=6;
            }
            else if ( (LA55_0==83) ) {
                alt55=7;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalSuite.g:2879:5: this_XCollectionLiteral_0= ruleXCollectionLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXCollectionLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XCollectionLiteral_0=ruleXCollectionLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XCollectionLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSuite.g:2888:6: ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure )
                    {
                    // InternalSuite.g:2888:6: ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure )
                    // InternalSuite.g:2888:7: ( ( () '[' ) )=>this_XClosure_1= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XClosure_1=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XClosure_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSuite.g:2901:5: this_XBooleanLiteral_2= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XBooleanLiteral_2=ruleXBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBooleanLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalSuite.g:2911:5: this_XNumberLiteral_3= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XNumberLiteral_3=ruleXNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNumberLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalSuite.g:2921:5: this_XNullLiteral_4= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XNullLiteral_4=ruleXNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNullLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // InternalSuite.g:2931:5: this_XStringLiteral_5= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XStringLiteral_5=ruleXStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XStringLiteral_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // InternalSuite.g:2941:5: this_XTypeLiteral_6= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XTypeLiteral_6=ruleXTypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTypeLiteral_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXLiteral"


    // $ANTLR start "entryRuleXCollectionLiteral"
    // InternalSuite.g:2957:1: entryRuleXCollectionLiteral returns [EObject current=null] : iv_ruleXCollectionLiteral= ruleXCollectionLiteral EOF ;
    public final EObject entryRuleXCollectionLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCollectionLiteral = null;


        try {
            // InternalSuite.g:2958:2: (iv_ruleXCollectionLiteral= ruleXCollectionLiteral EOF )
            // InternalSuite.g:2959:2: iv_ruleXCollectionLiteral= ruleXCollectionLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCollectionLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXCollectionLiteral=ruleXCollectionLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCollectionLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCollectionLiteral"


    // $ANTLR start "ruleXCollectionLiteral"
    // InternalSuite.g:2966:1: ruleXCollectionLiteral returns [EObject current=null] : (this_XSetLiteral_0= ruleXSetLiteral | this_XListLiteral_1= ruleXListLiteral ) ;
    public final EObject ruleXCollectionLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XSetLiteral_0 = null;

        EObject this_XListLiteral_1 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:2969:28: ( (this_XSetLiteral_0= ruleXSetLiteral | this_XListLiteral_1= ruleXListLiteral ) )
            // InternalSuite.g:2970:1: (this_XSetLiteral_0= ruleXSetLiteral | this_XListLiteral_1= ruleXListLiteral )
            {
            // InternalSuite.g:2970:1: (this_XSetLiteral_0= ruleXSetLiteral | this_XListLiteral_1= ruleXListLiteral )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==25) ) {
                int LA56_1 = input.LA(2);

                if ( (LA56_1==26) ) {
                    alt56=2;
                }
                else if ( (LA56_1==60) ) {
                    alt56=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalSuite.g:2971:5: this_XSetLiteral_0= ruleXSetLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXCollectionLiteralAccess().getXSetLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XSetLiteral_0=ruleXSetLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XSetLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSuite.g:2981:5: this_XListLiteral_1= ruleXListLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXCollectionLiteralAccess().getXListLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XListLiteral_1=ruleXListLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XListLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCollectionLiteral"


    // $ANTLR start "entryRuleXSetLiteral"
    // InternalSuite.g:2997:1: entryRuleXSetLiteral returns [EObject current=null] : iv_ruleXSetLiteral= ruleXSetLiteral EOF ;
    public final EObject entryRuleXSetLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSetLiteral = null;


        try {
            // InternalSuite.g:2998:2: (iv_ruleXSetLiteral= ruleXSetLiteral EOF )
            // InternalSuite.g:2999:2: iv_ruleXSetLiteral= ruleXSetLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSetLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXSetLiteral=ruleXSetLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSetLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXSetLiteral"


    // $ANTLR start "ruleXSetLiteral"
    // InternalSuite.g:3006:1: ruleXSetLiteral returns [EObject current=null] : ( () otherlv_1= '#' otherlv_2= '{' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleXSetLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_elements_3_0 = null;

        EObject lv_elements_5_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:3009:28: ( ( () otherlv_1= '#' otherlv_2= '{' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= '}' ) )
            // InternalSuite.g:3010:1: ( () otherlv_1= '#' otherlv_2= '{' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= '}' )
            {
            // InternalSuite.g:3010:1: ( () otherlv_1= '#' otherlv_2= '{' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= '}' )
            // InternalSuite.g:3010:2: () otherlv_1= '#' otherlv_2= '{' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= '}'
            {
            // InternalSuite.g:3010:2: ()
            // InternalSuite.g:3011:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSetLiteralAccess().getXSetLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSetLiteralAccess().getNumberSignKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,60,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXSetLiteralAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // InternalSuite.g:3024:1: ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_STRING||(LA58_0>=RULE_HEX && LA58_0<=RULE_ID)||LA58_0==18||LA58_0==21||(LA58_0>=25 && LA58_0<=26)||LA58_0==33||LA58_0==49||LA58_0==54||LA58_0==60||LA58_0==63||LA58_0==65||(LA58_0>=69 && LA58_0<=71)||(LA58_0>=74 && LA58_0<=86)||LA58_0==88) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalSuite.g:3024:2: ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )*
                    {
                    // InternalSuite.g:3024:2: ( (lv_elements_3_0= ruleXExpression ) )
                    // InternalSuite.g:3025:1: (lv_elements_3_0= ruleXExpression )
                    {
                    // InternalSuite.g:3025:1: (lv_elements_3_0= ruleXExpression )
                    // InternalSuite.g:3026:3: lv_elements_3_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSetLiteralAccess().getElementsXExpressionParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_50);
                    lv_elements_3_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSetLiteralRule());
                      	        }
                             		add(
                             			current, 
                             			"elements",
                              		lv_elements_3_0, 
                              		"org.eclipse.xtext.xbase.Xbase.XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSuite.g:3042:2: (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==22) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalSuite.g:3042:4: otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_18); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXSetLiteralAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // InternalSuite.g:3046:1: ( (lv_elements_5_0= ruleXExpression ) )
                    	    // InternalSuite.g:3047:1: (lv_elements_5_0= ruleXExpression )
                    	    {
                    	    // InternalSuite.g:3047:1: (lv_elements_5_0= ruleXExpression )
                    	    // InternalSuite.g:3048:3: lv_elements_5_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXSetLiteralAccess().getElementsXExpressionParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_50);
                    	    lv_elements_5_0=ruleXExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXSetLiteralRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"elements",
                    	              		lv_elements_5_0, 
                    	              		"org.eclipse.xtext.xbase.Xbase.XExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,61,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXSetLiteralAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXSetLiteral"


    // $ANTLR start "entryRuleXListLiteral"
    // InternalSuite.g:3076:1: entryRuleXListLiteral returns [EObject current=null] : iv_ruleXListLiteral= ruleXListLiteral EOF ;
    public final EObject entryRuleXListLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXListLiteral = null;


        try {
            // InternalSuite.g:3077:2: (iv_ruleXListLiteral= ruleXListLiteral EOF )
            // InternalSuite.g:3078:2: iv_ruleXListLiteral= ruleXListLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXListLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXListLiteral=ruleXListLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXListLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXListLiteral"


    // $ANTLR start "ruleXListLiteral"
    // InternalSuite.g:3085:1: ruleXListLiteral returns [EObject current=null] : ( () otherlv_1= '#' otherlv_2= '[' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= ']' ) ;
    public final EObject ruleXListLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_elements_3_0 = null;

        EObject lv_elements_5_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:3088:28: ( ( () otherlv_1= '#' otherlv_2= '[' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= ']' ) )
            // InternalSuite.g:3089:1: ( () otherlv_1= '#' otherlv_2= '[' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= ']' )
            {
            // InternalSuite.g:3089:1: ( () otherlv_1= '#' otherlv_2= '[' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= ']' )
            // InternalSuite.g:3089:2: () otherlv_1= '#' otherlv_2= '[' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= ']'
            {
            // InternalSuite.g:3089:2: ()
            // InternalSuite.g:3090:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXListLiteralAccess().getXListLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXListLiteralAccess().getNumberSignKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXListLiteralAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // InternalSuite.g:3103:1: ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_STRING||(LA60_0>=RULE_HEX && LA60_0<=RULE_ID)||LA60_0==18||LA60_0==21||(LA60_0>=25 && LA60_0<=26)||LA60_0==33||LA60_0==49||LA60_0==54||LA60_0==60||LA60_0==63||LA60_0==65||(LA60_0>=69 && LA60_0<=71)||(LA60_0>=74 && LA60_0<=86)||LA60_0==88) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalSuite.g:3103:2: ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )*
                    {
                    // InternalSuite.g:3103:2: ( (lv_elements_3_0= ruleXExpression ) )
                    // InternalSuite.g:3104:1: (lv_elements_3_0= ruleXExpression )
                    {
                    // InternalSuite.g:3104:1: (lv_elements_3_0= ruleXExpression )
                    // InternalSuite.g:3105:3: lv_elements_3_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXListLiteralAccess().getElementsXExpressionParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_21);
                    lv_elements_3_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXListLiteralRule());
                      	        }
                             		add(
                             			current, 
                             			"elements",
                              		lv_elements_3_0, 
                              		"org.eclipse.xtext.xbase.Xbase.XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSuite.g:3121:2: (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==22) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // InternalSuite.g:3121:4: otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_18); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXListLiteralAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // InternalSuite.g:3125:1: ( (lv_elements_5_0= ruleXExpression ) )
                    	    // InternalSuite.g:3126:1: (lv_elements_5_0= ruleXExpression )
                    	    {
                    	    // InternalSuite.g:3126:1: (lv_elements_5_0= ruleXExpression )
                    	    // InternalSuite.g:3127:3: lv_elements_5_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXListLiteralAccess().getElementsXExpressionParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_21);
                    	    lv_elements_5_0=ruleXExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXListLiteralRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"elements",
                    	              		lv_elements_5_0, 
                    	              		"org.eclipse.xtext.xbase.Xbase.XExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXListLiteralAccess().getRightSquareBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXListLiteral"


    // $ANTLR start "entryRuleXClosure"
    // InternalSuite.g:3155:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // InternalSuite.g:3156:2: (iv_ruleXClosure= ruleXClosure EOF )
            // InternalSuite.g:3157:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXClosure"


    // $ANTLR start "ruleXClosure"
    // InternalSuite.g:3164:1: ruleXClosure returns [EObject current=null] : ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
    public final EObject ruleXClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_explicitSyntax_5_0=null;
        Token otherlv_7=null;
        EObject lv_declaredFormalParameters_2_0 = null;

        EObject lv_declaredFormalParameters_4_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:3167:28: ( ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // InternalSuite.g:3168:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // InternalSuite.g:3168:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // InternalSuite.g:3168:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // InternalSuite.g:3168:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) )
            // InternalSuite.g:3168:3: ( ( () '[' ) )=> ( () otherlv_1= '[' )
            {
            // InternalSuite.g:3170:5: ( () otherlv_1= '[' )
            // InternalSuite.g:3170:6: () otherlv_1= '['
            {
            // InternalSuite.g:3170:6: ()
            // InternalSuite.g:3171:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_0_0_1());
                  
            }

            }


            }

            // InternalSuite.g:3180:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt63=2;
            alt63 = dfa63.predict(input);
            switch (alt63) {
                case 1 :
                    // InternalSuite.g:3180:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // InternalSuite.g:3195:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // InternalSuite.g:3195:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // InternalSuite.g:3195:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==RULE_ID||LA62_0==21||LA62_0==46) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // InternalSuite.g:3195:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // InternalSuite.g:3195:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // InternalSuite.g:3196:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // InternalSuite.g:3196:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // InternalSuite.g:3197:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_52);
                            lv_declaredFormalParameters_2_0=ruleJvmFormalParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"declaredFormalParameters",
                                      		lv_declaredFormalParameters_2_0, 
                                      		"org.eclipse.xtext.xbase.Xbase.JvmFormalParameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // InternalSuite.g:3213:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop61:
                            do {
                                int alt61=2;
                                int LA61_0 = input.LA(1);

                                if ( (LA61_0==22) ) {
                                    alt61=1;
                                }


                                switch (alt61) {
                            	case 1 :
                            	    // InternalSuite.g:3213:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_31); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_1_0_0_1_0());
                            	          
                            	    }
                            	    // InternalSuite.g:3217:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // InternalSuite.g:3218:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // InternalSuite.g:3218:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // InternalSuite.g:3219:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_52);
                            	    lv_declaredFormalParameters_4_0=ruleJvmFormalParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"declaredFormalParameters",
                            	              		lv_declaredFormalParameters_4_0, 
                            	              		"org.eclipse.xtext.xbase.Xbase.JvmFormalParameter");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop61;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // InternalSuite.g:3235:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // InternalSuite.g:3236:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // InternalSuite.g:3236:1: (lv_explicitSyntax_5_0= '|' )
                    // InternalSuite.g:3237:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,62,FollowSets000.FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitSyntax_5_0, grammarAccess.getXClosureAccess().getExplicitSyntaxVerticalLineKeyword_1_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXClosureRule());
                      	        }
                             		setWithLastConsumed(current, "explicitSyntax", true, "|");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalSuite.g:3250:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // InternalSuite.g:3251:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // InternalSuite.g:3251:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // InternalSuite.g:3252:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_54);
            lv_expression_6_0=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_6_0, 
                      		"org.eclipse.xtext.xbase.Xbase.XExpressionInClosure");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getXClosureAccess().getRightSquareBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXClosure"


    // $ANTLR start "entryRuleXExpressionInClosure"
    // InternalSuite.g:3280:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // InternalSuite.g:3281:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // InternalSuite.g:3282:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpressionInClosure"


    // $ANTLR start "ruleXExpressionInClosure"
    // InternalSuite.g:3289:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:3292:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_2= ';' )? )* ) )
            // InternalSuite.g:3293:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_2= ';' )? )* )
            {
            // InternalSuite.g:3293:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_2= ';' )? )* )
            // InternalSuite.g:3293:2: () ( ( (lv_expressions_1_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_2= ';' )? )*
            {
            // InternalSuite.g:3293:2: ()
            // InternalSuite.g:3294:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // InternalSuite.g:3299:2: ( ( (lv_expressions_1_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_2= ';' )? )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==RULE_STRING||(LA65_0>=RULE_HEX && LA65_0<=RULE_ID)||LA65_0==18||LA65_0==21||(LA65_0>=25 && LA65_0<=26)||LA65_0==33||LA65_0==49||LA65_0==54||LA65_0==60||LA65_0==63||LA65_0==65||(LA65_0>=69 && LA65_0<=86)||LA65_0==88) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalSuite.g:3299:3: ( (lv_expressions_1_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_2= ';' )?
            	    {
            	    // InternalSuite.g:3299:3: ( (lv_expressions_1_0= ruleXExpressionOrVarDeclaration ) )
            	    // InternalSuite.g:3300:1: (lv_expressions_1_0= ruleXExpressionOrVarDeclaration )
            	    {
            	    // InternalSuite.g:3300:1: (lv_expressions_1_0= ruleXExpressionOrVarDeclaration )
            	    // InternalSuite.g:3301:3: lv_expressions_1_0= ruleXExpressionOrVarDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionOrVarDeclarationParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_55);
            	    lv_expressions_1_0=ruleXExpressionOrVarDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXExpressionInClosureRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_1_0, 
            	              		"org.eclipse.xtext.xbase.Xbase.XExpressionOrVarDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // InternalSuite.g:3317:2: (otherlv_2= ';' )?
            	    int alt64=2;
            	    int LA64_0 = input.LA(1);

            	    if ( (LA64_0==17) ) {
            	        alt64=1;
            	    }
            	    switch (alt64) {
            	        case 1 :
            	            // InternalSuite.g:3317:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_56); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpressionInClosure"


    // $ANTLR start "entryRuleXShortClosure"
    // InternalSuite.g:3329:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // InternalSuite.g:3330:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // InternalSuite.g:3331:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXShortClosure"


    // $ANTLR start "ruleXShortClosure"
    // InternalSuite.g:3338:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:3341:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // InternalSuite.g:3342:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // InternalSuite.g:3342:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // InternalSuite.g:3342:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // InternalSuite.g:3342:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // InternalSuite.g:3342:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // InternalSuite.g:3358:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // InternalSuite.g:3358:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // InternalSuite.g:3358:7: ()
            // InternalSuite.g:3359:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // InternalSuite.g:3364:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_ID||LA67_0==21||LA67_0==46) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalSuite.g:3364:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // InternalSuite.g:3364:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // InternalSuite.g:3365:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // InternalSuite.g:3365:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // InternalSuite.g:3366:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_52);
                    lv_declaredFormalParameters_1_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"declaredFormalParameters",
                              		lv_declaredFormalParameters_1_0, 
                              		"org.eclipse.xtext.xbase.Xbase.JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSuite.g:3382:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==22) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // InternalSuite.g:3382:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_31); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // InternalSuite.g:3386:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // InternalSuite.g:3387:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // InternalSuite.g:3387:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // InternalSuite.g:3388:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_52);
                    	    lv_declaredFormalParameters_3_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"declaredFormalParameters",
                    	              		lv_declaredFormalParameters_3_0, 
                    	              		"org.eclipse.xtext.xbase.Xbase.JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop66;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSuite.g:3404:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // InternalSuite.g:3405:1: (lv_explicitSyntax_4_0= '|' )
            {
            // InternalSuite.g:3405:1: (lv_explicitSyntax_4_0= '|' )
            // InternalSuite.g:3406:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,62,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_explicitSyntax_4_0, grammarAccess.getXShortClosureAccess().getExplicitSyntaxVerticalLineKeyword_0_0_2_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXShortClosureRule());
              	        }
                     		setWithLastConsumed(current, "explicitSyntax", true, "|");
              	    
            }

            }


            }


            }


            }

            // InternalSuite.g:3419:4: ( (lv_expression_5_0= ruleXExpression ) )
            // InternalSuite.g:3420:1: (lv_expression_5_0= ruleXExpression )
            {
            // InternalSuite.g:3420:1: (lv_expression_5_0= ruleXExpression )
            // InternalSuite.g:3421:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_expression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_5_0, 
                      		"org.eclipse.xtext.xbase.Xbase.XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXShortClosure"


    // $ANTLR start "entryRuleXParenthesizedExpression"
    // InternalSuite.g:3445:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // InternalSuite.g:3446:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // InternalSuite.g:3447:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXParenthesizedExpression"


    // $ANTLR start "ruleXParenthesizedExpression"
    // InternalSuite.g:3454:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:3457:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // InternalSuite.g:3458:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // InternalSuite.g:3458:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // InternalSuite.g:3458:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_16);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXParenthesizedExpression"


    // $ANTLR start "entryRuleXIfExpression"
    // InternalSuite.g:3483:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // InternalSuite.g:3484:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // InternalSuite.g:3485:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXIfExpression"


    // $ANTLR start "ruleXIfExpression"
    // InternalSuite.g:3492:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_if_3_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_else_7_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:3495:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // InternalSuite.g:3496:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // InternalSuite.g:3496:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // InternalSuite.g:3496:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // InternalSuite.g:3496:2: ()
            // InternalSuite.g:3497:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FollowSets000.FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // InternalSuite.g:3510:1: ( (lv_if_3_0= ruleXExpression ) )
            // InternalSuite.g:3511:1: (lv_if_3_0= ruleXExpression )
            {
            // InternalSuite.g:3511:1: (lv_if_3_0= ruleXExpression )
            // InternalSuite.g:3512:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_16);
            lv_if_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"if",
                      		lv_if_3_0, 
                      		"org.eclipse.xtext.xbase.Xbase.XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // InternalSuite.g:3532:1: ( (lv_then_5_0= ruleXExpression ) )
            // InternalSuite.g:3533:1: (lv_then_5_0= ruleXExpression )
            {
            // InternalSuite.g:3533:1: (lv_then_5_0= ruleXExpression )
            // InternalSuite.g:3534:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_58);
            lv_then_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_5_0, 
                      		"org.eclipse.xtext.xbase.Xbase.XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSuite.g:3550:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==64) ) {
                int LA68_1 = input.LA(2);

                if ( (synpred32_InternalSuite()) ) {
                    alt68=1;
                }
            }
            switch (alt68) {
                case 1 :
                    // InternalSuite.g:3550:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // InternalSuite.g:3550:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // InternalSuite.g:3550:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,64,FollowSets000.FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // InternalSuite.g:3555:2: ( (lv_else_7_0= ruleXExpression ) )
                    // InternalSuite.g:3556:1: (lv_else_7_0= ruleXExpression )
                    {
                    // InternalSuite.g:3556:1: (lv_else_7_0= ruleXExpression )
                    // InternalSuite.g:3557:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_else_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_7_0, 
                              		"org.eclipse.xtext.xbase.Xbase.XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXIfExpression"


    // $ANTLR start "entryRuleXSwitchExpression"
    // InternalSuite.g:3581:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // InternalSuite.g:3582:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // InternalSuite.g:3583:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXSwitchExpression"


    // $ANTLR start "ruleXSwitchExpression"
    // InternalSuite.g:3590:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_switch_5_0= ruleXExpression ) ) otherlv_6= ')' ) | ( ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )? ( (lv_switch_9_0= ruleXExpression ) ) ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )* (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
    public final EObject ruleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_declaredParam_3_0 = null;

        EObject lv_switch_5_0 = null;

        EObject lv_declaredParam_7_0 = null;

        EObject lv_switch_9_0 = null;

        EObject lv_cases_11_0 = null;

        EObject lv_default_14_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:3593:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_switch_5_0= ruleXExpression ) ) otherlv_6= ')' ) | ( ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )? ( (lv_switch_9_0= ruleXExpression ) ) ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )* (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // InternalSuite.g:3594:1: ( () otherlv_1= 'switch' ( ( ( ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_switch_5_0= ruleXExpression ) ) otherlv_6= ')' ) | ( ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )? ( (lv_switch_9_0= ruleXExpression ) ) ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )* (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // InternalSuite.g:3594:1: ( () otherlv_1= 'switch' ( ( ( ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_switch_5_0= ruleXExpression ) ) otherlv_6= ')' ) | ( ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )? ( (lv_switch_9_0= ruleXExpression ) ) ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )* (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // InternalSuite.g:3594:2: () otherlv_1= 'switch' ( ( ( ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_switch_5_0= ruleXExpression ) ) otherlv_6= ')' ) | ( ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )? ( (lv_switch_9_0= ruleXExpression ) ) ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )* (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // InternalSuite.g:3594:2: ()
            // InternalSuite.g:3595:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,65,FollowSets000.FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // InternalSuite.g:3604:1: ( ( ( ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_switch_5_0= ruleXExpression ) ) otherlv_6= ')' ) | ( ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )? ( (lv_switch_9_0= ruleXExpression ) ) ) )
            int alt70=2;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // InternalSuite.g:3604:2: ( ( ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_switch_5_0= ruleXExpression ) ) otherlv_6= ')' )
                    {
                    // InternalSuite.g:3604:2: ( ( ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_switch_5_0= ruleXExpression ) ) otherlv_6= ')' )
                    // InternalSuite.g:3604:3: ( ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_switch_5_0= ruleXExpression ) ) otherlv_6= ')'
                    {
                    // InternalSuite.g:3604:3: ( ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) )
                    // InternalSuite.g:3604:4: ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' )
                    {
                    // InternalSuite.g:3610:5: (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' )
                    // InternalSuite.g:3610:7: otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':'
                    {
                    otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2_0_0_0_0());
                          
                    }
                    // InternalSuite.g:3614:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
                    // InternalSuite.g:3615:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
                    {
                    // InternalSuite.g:3615:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
                    // InternalSuite.g:3616:3: lv_declaredParam_3_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_2_0_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_60);
                    lv_declaredParam_3_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"declaredParam",
                              		lv_declaredParam_3_0, 
                              		"org.eclipse.xtext.xbase.Xbase.JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,66,FollowSets000.FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_0_0_2());
                          
                    }

                    }


                    }

                    // InternalSuite.g:3636:3: ( (lv_switch_5_0= ruleXExpression ) )
                    // InternalSuite.g:3637:1: (lv_switch_5_0= ruleXExpression )
                    {
                    // InternalSuite.g:3637:1: (lv_switch_5_0= ruleXExpression )
                    // InternalSuite.g:3638:3: lv_switch_5_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_16);
                    lv_switch_5_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"switch",
                              		lv_switch_5_0, 
                              		"org.eclipse.xtext.xbase.Xbase.XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_2_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSuite.g:3659:6: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )? ( (lv_switch_9_0= ruleXExpression ) ) )
                    {
                    // InternalSuite.g:3659:6: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )? ( (lv_switch_9_0= ruleXExpression ) ) )
                    // InternalSuite.g:3659:7: ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )? ( (lv_switch_9_0= ruleXExpression ) )
                    {
                    // InternalSuite.g:3659:7: ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )?
                    int alt69=2;
                    alt69 = dfa69.predict(input);
                    switch (alt69) {
                        case 1 :
                            // InternalSuite.g:3659:8: ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' )
                            {
                            // InternalSuite.g:3664:5: ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' )
                            // InternalSuite.g:3664:6: ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':'
                            {
                            // InternalSuite.g:3664:6: ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) )
                            // InternalSuite.g:3665:1: (lv_declaredParam_7_0= ruleJvmFormalParameter )
                            {
                            // InternalSuite.g:3665:1: (lv_declaredParam_7_0= ruleJvmFormalParameter )
                            // InternalSuite.g:3666:3: lv_declaredParam_7_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_2_1_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_60);
                            lv_declaredParam_7_0=ruleJvmFormalParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"declaredParam",
                                      		lv_declaredParam_7_0, 
                                      		"org.eclipse.xtext.xbase.Xbase.JvmFormalParameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_8=(Token)match(input,66,FollowSets000.FOLLOW_18); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1_0_0_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // InternalSuite.g:3686:4: ( (lv_switch_9_0= ruleXExpression ) )
                    // InternalSuite.g:3687:1: (lv_switch_9_0= ruleXExpression )
                    {
                    // InternalSuite.g:3687:1: (lv_switch_9_0= ruleXExpression )
                    // InternalSuite.g:3688:3: lv_switch_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_48);
                    lv_switch_9_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"switch",
                              		lv_switch_9_0, 
                              		"org.eclipse.xtext.xbase.Xbase.XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,60,FollowSets000.FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // InternalSuite.g:3708:1: ( (lv_cases_11_0= ruleXCasePart ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==RULE_ID||(LA71_0>=21 && LA71_0<=22)||LA71_0==46||LA71_0==66||LA71_0==68) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalSuite.g:3709:1: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // InternalSuite.g:3709:1: (lv_cases_11_0= ruleXCasePart )
            	    // InternalSuite.g:3710:3: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_61);
            	    lv_cases_11_0=ruleXCasePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_11_0, 
            	              		"org.eclipse.xtext.xbase.Xbase.XCasePart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);

            // InternalSuite.g:3726:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==67) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalSuite.g:3726:5: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    otherlv_12=(Token)match(input,67,FollowSets000.FOLLOW_60); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,66,FollowSets000.FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_5_1());
                          
                    }
                    // InternalSuite.g:3734:1: ( (lv_default_14_0= ruleXExpression ) )
                    // InternalSuite.g:3735:1: (lv_default_14_0= ruleXExpression )
                    {
                    // InternalSuite.g:3735:1: (lv_default_14_0= ruleXExpression )
                    // InternalSuite.g:3736:3: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_62);
                    lv_default_14_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_14_0, 
                              		"org.eclipse.xtext.xbase.Xbase.XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,61,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getXSwitchExpressionAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXSwitchExpression"


    // $ANTLR start "entryRuleXCasePart"
    // InternalSuite.g:3764:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // InternalSuite.g:3765:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // InternalSuite.g:3766:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCasePart"


    // $ANTLR start "ruleXCasePart"
    // InternalSuite.g:3773:1: ruleXCasePart returns [EObject current=null] : ( () ( (lv_typeGuard_1_0= ruleJvmTypeReference ) )? (otherlv_2= 'case' ( (lv_case_3_0= ruleXExpression ) ) )? ( (otherlv_4= ':' ( (lv_then_5_0= ruleXExpression ) ) ) | ( (lv_fallThrough_6_0= ',' ) ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_fallThrough_6_0=null;
        EObject lv_typeGuard_1_0 = null;

        EObject lv_case_3_0 = null;

        EObject lv_then_5_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:3776:28: ( ( () ( (lv_typeGuard_1_0= ruleJvmTypeReference ) )? (otherlv_2= 'case' ( (lv_case_3_0= ruleXExpression ) ) )? ( (otherlv_4= ':' ( (lv_then_5_0= ruleXExpression ) ) ) | ( (lv_fallThrough_6_0= ',' ) ) ) ) )
            // InternalSuite.g:3777:1: ( () ( (lv_typeGuard_1_0= ruleJvmTypeReference ) )? (otherlv_2= 'case' ( (lv_case_3_0= ruleXExpression ) ) )? ( (otherlv_4= ':' ( (lv_then_5_0= ruleXExpression ) ) ) | ( (lv_fallThrough_6_0= ',' ) ) ) )
            {
            // InternalSuite.g:3777:1: ( () ( (lv_typeGuard_1_0= ruleJvmTypeReference ) )? (otherlv_2= 'case' ( (lv_case_3_0= ruleXExpression ) ) )? ( (otherlv_4= ':' ( (lv_then_5_0= ruleXExpression ) ) ) | ( (lv_fallThrough_6_0= ',' ) ) ) )
            // InternalSuite.g:3777:2: () ( (lv_typeGuard_1_0= ruleJvmTypeReference ) )? (otherlv_2= 'case' ( (lv_case_3_0= ruleXExpression ) ) )? ( (otherlv_4= ':' ( (lv_then_5_0= ruleXExpression ) ) ) | ( (lv_fallThrough_6_0= ',' ) ) )
            {
            // InternalSuite.g:3777:2: ()
            // InternalSuite.g:3778:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXCasePartAccess().getXCasePartAction_0(),
                          current);
                  
            }

            }

            // InternalSuite.g:3783:2: ( (lv_typeGuard_1_0= ruleJvmTypeReference ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_ID||LA73_0==21||LA73_0==46) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalSuite.g:3784:1: (lv_typeGuard_1_0= ruleJvmTypeReference )
                    {
                    // InternalSuite.g:3784:1: (lv_typeGuard_1_0= ruleJvmTypeReference )
                    // InternalSuite.g:3785:3: lv_typeGuard_1_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_63);
                    lv_typeGuard_1_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"typeGuard",
                              		lv_typeGuard_1_0, 
                              		"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalSuite.g:3801:3: (otherlv_2= 'case' ( (lv_case_3_0= ruleXExpression ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==68) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalSuite.g:3801:5: otherlv_2= 'case' ( (lv_case_3_0= ruleXExpression ) )
                    {
                    otherlv_2=(Token)match(input,68,FollowSets000.FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXCasePartAccess().getCaseKeyword_2_0());
                          
                    }
                    // InternalSuite.g:3805:1: ( (lv_case_3_0= ruleXExpression ) )
                    // InternalSuite.g:3806:1: (lv_case_3_0= ruleXExpression )
                    {
                    // InternalSuite.g:3806:1: (lv_case_3_0= ruleXExpression )
                    // InternalSuite.g:3807:3: lv_case_3_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_64);
                    lv_case_3_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"case",
                              		lv_case_3_0, 
                              		"org.eclipse.xtext.xbase.Xbase.XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSuite.g:3823:4: ( (otherlv_4= ':' ( (lv_then_5_0= ruleXExpression ) ) ) | ( (lv_fallThrough_6_0= ',' ) ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==66) ) {
                alt75=1;
            }
            else if ( (LA75_0==22) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalSuite.g:3823:5: (otherlv_4= ':' ( (lv_then_5_0= ruleXExpression ) ) )
                    {
                    // InternalSuite.g:3823:5: (otherlv_4= ':' ( (lv_then_5_0= ruleXExpression ) ) )
                    // InternalSuite.g:3823:7: otherlv_4= ':' ( (lv_then_5_0= ruleXExpression ) )
                    {
                    otherlv_4=(Token)match(input,66,FollowSets000.FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXCasePartAccess().getColonKeyword_3_0_0());
                          
                    }
                    // InternalSuite.g:3827:1: ( (lv_then_5_0= ruleXExpression ) )
                    // InternalSuite.g:3828:1: (lv_then_5_0= ruleXExpression )
                    {
                    // InternalSuite.g:3828:1: (lv_then_5_0= ruleXExpression )
                    // InternalSuite.g:3829:3: lv_then_5_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_then_5_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"then",
                              		lv_then_5_0, 
                              		"org.eclipse.xtext.xbase.Xbase.XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSuite.g:3846:6: ( (lv_fallThrough_6_0= ',' ) )
                    {
                    // InternalSuite.g:3846:6: ( (lv_fallThrough_6_0= ',' ) )
                    // InternalSuite.g:3847:1: (lv_fallThrough_6_0= ',' )
                    {
                    // InternalSuite.g:3847:1: (lv_fallThrough_6_0= ',' )
                    // InternalSuite.g:3848:3: lv_fallThrough_6_0= ','
                    {
                    lv_fallThrough_6_0=(Token)match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_fallThrough_6_0, grammarAccess.getXCasePartAccess().getFallThroughCommaKeyword_3_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXCasePartRule());
                      	        }
                             		setWithLastConsumed(current, "fallThrough", true, ",");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCasePart"


    // $ANTLR start "entryRuleXForLoopExpression"
    // InternalSuite.g:3869:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // InternalSuite.g:3870:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // InternalSuite.g:3871:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXForLoopExpression"


    // $ANTLR start "ruleXForLoopExpression"
    // InternalSuite.g:3878:1: ruleXForLoopExpression returns [EObject current=null] : ( ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
    public final EObject ruleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_declaredParam_3_0 = null;

        EObject lv_forExpression_5_0 = null;

        EObject lv_eachExpression_7_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:3881:28: ( ( ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // InternalSuite.g:3882:1: ( ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // InternalSuite.g:3882:1: ( ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // InternalSuite.g:3882:2: ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // InternalSuite.g:3882:2: ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) )
            // InternalSuite.g:3882:3: ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' )
            {
            // InternalSuite.g:3890:5: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' )
            // InternalSuite.g:3890:6: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':'
            {
            // InternalSuite.g:3890:6: ()
            // InternalSuite.g:3891:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0_0_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FollowSets000.FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_0_0_1());
                  
            }
            otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_0_0_2());
                  
            }
            // InternalSuite.g:3904:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // InternalSuite.g:3905:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // InternalSuite.g:3905:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // InternalSuite.g:3906:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_0_0_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_60);
            lv_declaredParam_3_0=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_3_0, 
                      		"org.eclipse.xtext.xbase.Xbase.JvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,66,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_0_0_4());
                  
            }

            }


            }

            // InternalSuite.g:3926:3: ( (lv_forExpression_5_0= ruleXExpression ) )
            // InternalSuite.g:3927:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // InternalSuite.g:3927:1: (lv_forExpression_5_0= ruleXExpression )
            // InternalSuite.g:3928:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_16);
            lv_forExpression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"forExpression",
                      		lv_forExpression_5_0, 
                      		"org.eclipse.xtext.xbase.Xbase.XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_2());
                  
            }
            // InternalSuite.g:3948:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // InternalSuite.g:3949:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // InternalSuite.g:3949:1: (lv_eachExpression_7_0= ruleXExpression )
            // InternalSuite.g:3950:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_eachExpression_7_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"eachExpression",
                      		lv_eachExpression_7_0, 
                      		"org.eclipse.xtext.xbase.Xbase.XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXForLoopExpression"


    // $ANTLR start "entryRuleXBasicForLoopExpression"
    // InternalSuite.g:3974:1: entryRuleXBasicForLoopExpression returns [EObject current=null] : iv_ruleXBasicForLoopExpression= ruleXBasicForLoopExpression EOF ;
    public final EObject entryRuleXBasicForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBasicForLoopExpression = null;


        try {
            // InternalSuite.g:3975:2: (iv_ruleXBasicForLoopExpression= ruleXBasicForLoopExpression EOF )
            // InternalSuite.g:3976:2: iv_ruleXBasicForLoopExpression= ruleXBasicForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBasicForLoopExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXBasicForLoopExpression=ruleXBasicForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBasicForLoopExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXBasicForLoopExpression"


    // $ANTLR start "ruleXBasicForLoopExpression"
    // InternalSuite.g:3983:1: ruleXBasicForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( ( (lv_initExpressions_3_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_4= ',' ( (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration ) ) )* )? otherlv_6= ';' ( (lv_expression_7_0= ruleXExpression ) )? otherlv_8= ';' ( ( (lv_updateExpressions_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_updateExpressions_11_0= ruleXExpression ) ) )* )? otherlv_12= ')' ( (lv_eachExpression_13_0= ruleXExpression ) ) ) ;
    public final EObject ruleXBasicForLoopExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_initExpressions_3_0 = null;

        EObject lv_initExpressions_5_0 = null;

        EObject lv_expression_7_0 = null;

        EObject lv_updateExpressions_9_0 = null;

        EObject lv_updateExpressions_11_0 = null;

        EObject lv_eachExpression_13_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:3986:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( ( (lv_initExpressions_3_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_4= ',' ( (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration ) ) )* )? otherlv_6= ';' ( (lv_expression_7_0= ruleXExpression ) )? otherlv_8= ';' ( ( (lv_updateExpressions_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_updateExpressions_11_0= ruleXExpression ) ) )* )? otherlv_12= ')' ( (lv_eachExpression_13_0= ruleXExpression ) ) ) )
            // InternalSuite.g:3987:1: ( () otherlv_1= 'for' otherlv_2= '(' ( ( (lv_initExpressions_3_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_4= ',' ( (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration ) ) )* )? otherlv_6= ';' ( (lv_expression_7_0= ruleXExpression ) )? otherlv_8= ';' ( ( (lv_updateExpressions_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_updateExpressions_11_0= ruleXExpression ) ) )* )? otherlv_12= ')' ( (lv_eachExpression_13_0= ruleXExpression ) ) )
            {
            // InternalSuite.g:3987:1: ( () otherlv_1= 'for' otherlv_2= '(' ( ( (lv_initExpressions_3_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_4= ',' ( (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration ) ) )* )? otherlv_6= ';' ( (lv_expression_7_0= ruleXExpression ) )? otherlv_8= ';' ( ( (lv_updateExpressions_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_updateExpressions_11_0= ruleXExpression ) ) )* )? otherlv_12= ')' ( (lv_eachExpression_13_0= ruleXExpression ) ) )
            // InternalSuite.g:3987:2: () otherlv_1= 'for' otherlv_2= '(' ( ( (lv_initExpressions_3_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_4= ',' ( (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration ) ) )* )? otherlv_6= ';' ( (lv_expression_7_0= ruleXExpression ) )? otherlv_8= ';' ( ( (lv_updateExpressions_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_updateExpressions_11_0= ruleXExpression ) ) )* )? otherlv_12= ')' ( (lv_eachExpression_13_0= ruleXExpression ) )
            {
            // InternalSuite.g:3987:2: ()
            // InternalSuite.g:3988:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBasicForLoopExpressionAccess().getXBasicForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FollowSets000.FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBasicForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXBasicForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // InternalSuite.g:4001:1: ( ( (lv_initExpressions_3_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_4= ',' ( (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration ) ) )* )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==RULE_STRING||(LA77_0>=RULE_HEX && LA77_0<=RULE_ID)||LA77_0==18||LA77_0==21||(LA77_0>=25 && LA77_0<=26)||LA77_0==33||LA77_0==49||LA77_0==54||LA77_0==60||LA77_0==63||LA77_0==65||(LA77_0>=69 && LA77_0<=86)||LA77_0==88) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalSuite.g:4001:2: ( (lv_initExpressions_3_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_4= ',' ( (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration ) ) )*
                    {
                    // InternalSuite.g:4001:2: ( (lv_initExpressions_3_0= ruleXExpressionOrVarDeclaration ) )
                    // InternalSuite.g:4002:1: (lv_initExpressions_3_0= ruleXExpressionOrVarDeclaration )
                    {
                    // InternalSuite.g:4002:1: (lv_initExpressions_3_0= ruleXExpressionOrVarDeclaration )
                    // InternalSuite.g:4003:3: lv_initExpressions_3_0= ruleXExpressionOrVarDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXBasicForLoopExpressionAccess().getInitExpressionsXExpressionOrVarDeclarationParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_66);
                    lv_initExpressions_3_0=ruleXExpressionOrVarDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXBasicForLoopExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"initExpressions",
                              		lv_initExpressions_3_0, 
                              		"org.eclipse.xtext.xbase.Xbase.XExpressionOrVarDeclaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSuite.g:4019:2: (otherlv_4= ',' ( (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration ) ) )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==22) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // InternalSuite.g:4019:4: otherlv_4= ',' ( (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration ) )
                    	    {
                    	    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_67); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXBasicForLoopExpressionAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // InternalSuite.g:4023:1: ( (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration ) )
                    	    // InternalSuite.g:4024:1: (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration )
                    	    {
                    	    // InternalSuite.g:4024:1: (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration )
                    	    // InternalSuite.g:4025:3: lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXBasicForLoopExpressionAccess().getInitExpressionsXExpressionOrVarDeclarationParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_66);
                    	    lv_initExpressions_5_0=ruleXExpressionOrVarDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXBasicForLoopExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"initExpressions",
                    	              		lv_initExpressions_5_0, 
                    	              		"org.eclipse.xtext.xbase.Xbase.XExpressionOrVarDeclaration");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_68); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXBasicForLoopExpressionAccess().getSemicolonKeyword_4());
                  
            }
            // InternalSuite.g:4045:1: ( (lv_expression_7_0= ruleXExpression ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RULE_STRING||(LA78_0>=RULE_HEX && LA78_0<=RULE_ID)||LA78_0==18||LA78_0==21||(LA78_0>=25 && LA78_0<=26)||LA78_0==33||LA78_0==49||LA78_0==54||LA78_0==60||LA78_0==63||LA78_0==65||(LA78_0>=69 && LA78_0<=71)||(LA78_0>=74 && LA78_0<=86)||LA78_0==88) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalSuite.g:4046:1: (lv_expression_7_0= ruleXExpression )
                    {
                    // InternalSuite.g:4046:1: (lv_expression_7_0= ruleXExpression )
                    // InternalSuite.g:4047:3: lv_expression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXBasicForLoopExpressionAccess().getExpressionXExpressionParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_69);
                    lv_expression_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXBasicForLoopExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_7_0, 
                              		"org.eclipse.xtext.xbase.Xbase.XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getXBasicForLoopExpressionAccess().getSemicolonKeyword_6());
                  
            }
            // InternalSuite.g:4067:1: ( ( (lv_updateExpressions_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_updateExpressions_11_0= ruleXExpression ) ) )* )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RULE_STRING||(LA80_0>=RULE_HEX && LA80_0<=RULE_ID)||LA80_0==18||LA80_0==21||(LA80_0>=25 && LA80_0<=26)||LA80_0==33||LA80_0==49||LA80_0==54||LA80_0==60||LA80_0==63||LA80_0==65||(LA80_0>=69 && LA80_0<=71)||(LA80_0>=74 && LA80_0<=86)||LA80_0==88) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalSuite.g:4067:2: ( (lv_updateExpressions_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_updateExpressions_11_0= ruleXExpression ) ) )*
                    {
                    // InternalSuite.g:4067:2: ( (lv_updateExpressions_9_0= ruleXExpression ) )
                    // InternalSuite.g:4068:1: (lv_updateExpressions_9_0= ruleXExpression )
                    {
                    // InternalSuite.g:4068:1: (lv_updateExpressions_9_0= ruleXExpression )
                    // InternalSuite.g:4069:3: lv_updateExpressions_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXBasicForLoopExpressionAccess().getUpdateExpressionsXExpressionParserRuleCall_7_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_15);
                    lv_updateExpressions_9_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXBasicForLoopExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"updateExpressions",
                              		lv_updateExpressions_9_0, 
                              		"org.eclipse.xtext.xbase.Xbase.XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSuite.g:4085:2: (otherlv_10= ',' ( (lv_updateExpressions_11_0= ruleXExpression ) ) )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==22) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // InternalSuite.g:4085:4: otherlv_10= ',' ( (lv_updateExpressions_11_0= ruleXExpression ) )
                    	    {
                    	    otherlv_10=(Token)match(input,22,FollowSets000.FOLLOW_18); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getXBasicForLoopExpressionAccess().getCommaKeyword_7_1_0());
                    	          
                    	    }
                    	    // InternalSuite.g:4089:1: ( (lv_updateExpressions_11_0= ruleXExpression ) )
                    	    // InternalSuite.g:4090:1: (lv_updateExpressions_11_0= ruleXExpression )
                    	    {
                    	    // InternalSuite.g:4090:1: (lv_updateExpressions_11_0= ruleXExpression )
                    	    // InternalSuite.g:4091:3: lv_updateExpressions_11_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXBasicForLoopExpressionAccess().getUpdateExpressionsXExpressionParserRuleCall_7_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_15);
                    	    lv_updateExpressions_11_0=ruleXExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXBasicForLoopExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"updateExpressions",
                    	              		lv_updateExpressions_11_0, 
                    	              		"org.eclipse.xtext.xbase.Xbase.XExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop79;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,23,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getXBasicForLoopExpressionAccess().getRightParenthesisKeyword_8());
                  
            }
            // InternalSuite.g:4111:1: ( (lv_eachExpression_13_0= ruleXExpression ) )
            // InternalSuite.g:4112:1: (lv_eachExpression_13_0= ruleXExpression )
            {
            // InternalSuite.g:4112:1: (lv_eachExpression_13_0= ruleXExpression )
            // InternalSuite.g:4113:3: lv_eachExpression_13_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXBasicForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_9_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_eachExpression_13_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXBasicForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"eachExpression",
                      		lv_eachExpression_13_0, 
                      		"org.eclipse.xtext.xbase.Xbase.XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXBasicForLoopExpression"


    // $ANTLR start "entryRuleXWhileExpression"
    // InternalSuite.g:4137:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // InternalSuite.g:4138:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // InternalSuite.g:4139:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXWhileExpression"


    // $ANTLR start "ruleXWhileExpression"
    // InternalSuite.g:4146:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:4149:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // InternalSuite.g:4150:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // InternalSuite.g:4150:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // InternalSuite.g:4150:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // InternalSuite.g:4150:2: ()
            // InternalSuite.g:4151:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FollowSets000.FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // InternalSuite.g:4164:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // InternalSuite.g:4165:1: (lv_predicate_3_0= ruleXExpression )
            {
            // InternalSuite.g:4165:1: (lv_predicate_3_0= ruleXExpression )
            // InternalSuite.g:4166:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_16);
            lv_predicate_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_3_0, 
                      		"org.eclipse.xtext.xbase.Xbase.XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // InternalSuite.g:4186:1: ( (lv_body_5_0= ruleXExpression ) )
            // InternalSuite.g:4187:1: (lv_body_5_0= ruleXExpression )
            {
            // InternalSuite.g:4187:1: (lv_body_5_0= ruleXExpression )
            // InternalSuite.g:4188:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_body_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_5_0, 
                      		"org.eclipse.xtext.xbase.Xbase.XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXWhileExpression"


    // $ANTLR start "entryRuleXDoWhileExpression"
    // InternalSuite.g:4212:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // InternalSuite.g:4213:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // InternalSuite.g:4214:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXDoWhileExpression"


    // $ANTLR start "ruleXDoWhileExpression"
    // InternalSuite.g:4221:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
    public final EObject ruleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_body_2_0 = null;

        EObject lv_predicate_5_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:4224:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // InternalSuite.g:4225:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // InternalSuite.g:4225:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // InternalSuite.g:4225:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // InternalSuite.g:4225:2: ()
            // InternalSuite.g:4226:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // InternalSuite.g:4235:1: ( (lv_body_2_0= ruleXExpression ) )
            // InternalSuite.g:4236:1: (lv_body_2_0= ruleXExpression )
            {
            // InternalSuite.g:4236:1: (lv_body_2_0= ruleXExpression )
            // InternalSuite.g:4237:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_70);
            lv_body_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_2_0, 
                      		"org.eclipse.xtext.xbase.Xbase.XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,70,FollowSets000.FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // InternalSuite.g:4261:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // InternalSuite.g:4262:1: (lv_predicate_5_0= ruleXExpression )
            {
            // InternalSuite.g:4262:1: (lv_predicate_5_0= ruleXExpression )
            // InternalSuite.g:4263:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_16);
            lv_predicate_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_5_0, 
                      		"org.eclipse.xtext.xbase.Xbase.XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXDoWhileExpressionAccess().getRightParenthesisKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXDoWhileExpression"


    // $ANTLR start "entryRuleXBlockExpression"
    // InternalSuite.g:4291:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // InternalSuite.g:4292:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // InternalSuite.g:4293:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXBlockExpression"


    // $ANTLR start "ruleXBlockExpression"
    // InternalSuite.g:4300:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:4303:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // InternalSuite.g:4304:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // InternalSuite.g:4304:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // InternalSuite.g:4304:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // InternalSuite.g:4304:2: ()
            // InternalSuite.g:4305:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FollowSets000.FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // InternalSuite.g:4314:1: ( ( (lv_expressions_2_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_3= ';' )? )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==RULE_STRING||(LA82_0>=RULE_HEX && LA82_0<=RULE_ID)||LA82_0==18||LA82_0==21||(LA82_0>=25 && LA82_0<=26)||LA82_0==33||LA82_0==49||LA82_0==54||LA82_0==60||LA82_0==63||LA82_0==65||(LA82_0>=69 && LA82_0<=86)||LA82_0==88) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // InternalSuite.g:4314:2: ( (lv_expressions_2_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_3= ';' )?
            	    {
            	    // InternalSuite.g:4314:2: ( (lv_expressions_2_0= ruleXExpressionOrVarDeclaration ) )
            	    // InternalSuite.g:4315:1: (lv_expressions_2_0= ruleXExpressionOrVarDeclaration )
            	    {
            	    // InternalSuite.g:4315:1: (lv_expressions_2_0= ruleXExpressionOrVarDeclaration )
            	    // InternalSuite.g:4316:3: lv_expressions_2_0= ruleXExpressionOrVarDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionOrVarDeclarationParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_72);
            	    lv_expressions_2_0=ruleXExpressionOrVarDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXBlockExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"org.eclipse.xtext.xbase.Xbase.XExpressionOrVarDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // InternalSuite.g:4332:2: (otherlv_3= ';' )?
            	    int alt81=2;
            	    int LA81_0 = input.LA(1);

            	    if ( (LA81_0==17) ) {
            	        alt81=1;
            	    }
            	    switch (alt81) {
            	        case 1 :
            	            // InternalSuite.g:4332:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_71); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);

            otherlv_4=(Token)match(input,61,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXBlockExpressionAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXBlockExpression"


    // $ANTLR start "entryRuleXExpressionOrVarDeclaration"
    // InternalSuite.g:4348:1: entryRuleXExpressionOrVarDeclaration returns [EObject current=null] : iv_ruleXExpressionOrVarDeclaration= ruleXExpressionOrVarDeclaration EOF ;
    public final EObject entryRuleXExpressionOrVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionOrVarDeclaration = null;


        try {
            // InternalSuite.g:4349:2: (iv_ruleXExpressionOrVarDeclaration= ruleXExpressionOrVarDeclaration EOF )
            // InternalSuite.g:4350:2: iv_ruleXExpressionOrVarDeclaration= ruleXExpressionOrVarDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionOrVarDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXExpressionOrVarDeclaration=ruleXExpressionOrVarDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionOrVarDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpressionOrVarDeclaration"


    // $ANTLR start "ruleXExpressionOrVarDeclaration"
    // InternalSuite.g:4357:1: ruleXExpressionOrVarDeclaration returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionOrVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:4360:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // InternalSuite.g:4361:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // InternalSuite.g:4361:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( ((LA83_0>=72 && LA83_0<=73)) ) {
                alt83=1;
            }
            else if ( (LA83_0==RULE_STRING||(LA83_0>=RULE_HEX && LA83_0<=RULE_ID)||LA83_0==18||LA83_0==21||(LA83_0>=25 && LA83_0<=26)||LA83_0==33||LA83_0==49||LA83_0==54||LA83_0==60||LA83_0==63||LA83_0==65||(LA83_0>=69 && LA83_0<=71)||(LA83_0>=74 && LA83_0<=86)||LA83_0==88) ) {
                alt83=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // InternalSuite.g:4362:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionOrVarDeclarationAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XVariableDeclaration_0=ruleXVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XVariableDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSuite.g:4372:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionOrVarDeclarationAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XExpression_1=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpressionOrVarDeclaration"


    // $ANTLR start "entryRuleXVariableDeclaration"
    // InternalSuite.g:4388:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // InternalSuite.g:4389:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // InternalSuite.g:4390:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXVariableDeclaration"


    // $ANTLR start "ruleXVariableDeclaration"
    // InternalSuite.g:4397:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_writeable_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:4400:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // InternalSuite.g:4401:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // InternalSuite.g:4401:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // InternalSuite.g:4401:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // InternalSuite.g:4401:2: ()
            // InternalSuite.g:4402:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // InternalSuite.g:4407:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==72) ) {
                alt84=1;
            }
            else if ( (LA84_0==73) ) {
                alt84=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // InternalSuite.g:4407:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // InternalSuite.g:4407:3: ( (lv_writeable_1_0= 'var' ) )
                    // InternalSuite.g:4408:1: (lv_writeable_1_0= 'var' )
                    {
                    // InternalSuite.g:4408:1: (lv_writeable_1_0= 'var' )
                    // InternalSuite.g:4409:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,72,FollowSets000.FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_writeable_1_0, grammarAccess.getXVariableDeclarationAccess().getWriteableVarKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "writeable", true, "var");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSuite.g:4423:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,73,FollowSets000.FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // InternalSuite.g:4427:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==RULE_ID) ) {
                int LA85_1 = input.LA(2);

                if ( (synpred36_InternalSuite()) ) {
                    alt85=1;
                }
                else if ( (true) ) {
                    alt85=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 85, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA85_0==21) && (synpred36_InternalSuite())) {
                alt85=1;
            }
            else if ( (LA85_0==46) && (synpred36_InternalSuite())) {
                alt85=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // InternalSuite.g:4427:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // InternalSuite.g:4427:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // InternalSuite.g:4427:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // InternalSuite.g:4435:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // InternalSuite.g:4435:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // InternalSuite.g:4435:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // InternalSuite.g:4436:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // InternalSuite.g:4436:1: (lv_type_3_0= ruleJvmTypeReference )
                    // InternalSuite.g:4437:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_3);
                    lv_type_3_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_3_0, 
                              		"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSuite.g:4453:2: ( (lv_name_4_0= ruleValidID ) )
                    // InternalSuite.g:4454:1: (lv_name_4_0= ruleValidID )
                    {
                    // InternalSuite.g:4454:1: (lv_name_4_0= ruleValidID )
                    // InternalSuite.g:4455:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_73);
                    lv_name_4_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_4_0, 
                              		"org.eclipse.xtext.xbase.Xtype.ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSuite.g:4472:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // InternalSuite.g:4472:6: ( (lv_name_5_0= ruleValidID ) )
                    // InternalSuite.g:4473:1: (lv_name_5_0= ruleValidID )
                    {
                    // InternalSuite.g:4473:1: (lv_name_5_0= ruleValidID )
                    // InternalSuite.g:4474:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_73);
                    lv_name_5_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_5_0, 
                              		"org.eclipse.xtext.xbase.Xtype.ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSuite.g:4490:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==24) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalSuite.g:4490:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // InternalSuite.g:4494:1: ( (lv_right_7_0= ruleXExpression ) )
                    // InternalSuite.g:4495:1: (lv_right_7_0= ruleXExpression )
                    {
                    // InternalSuite.g:4495:1: (lv_right_7_0= ruleXExpression )
                    // InternalSuite.g:4496:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_right_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_7_0, 
                              		"org.eclipse.xtext.xbase.Xbase.XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXVariableDeclaration"


    // $ANTLR start "entryRuleJvmFormalParameter"
    // InternalSuite.g:4520:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // InternalSuite.g:4521:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // InternalSuite.g:4522:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmFormalParameter"


    // $ANTLR start "ruleJvmFormalParameter"
    // InternalSuite.g:4529:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:4532:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // InternalSuite.g:4533:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // InternalSuite.g:4533:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // InternalSuite.g:4533:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // InternalSuite.g:4533:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==RULE_ID) ) {
                int LA87_1 = input.LA(2);

                if ( (LA87_1==RULE_ID||LA87_1==19||LA87_1==26||LA87_1==33) ) {
                    alt87=1;
                }
            }
            else if ( (LA87_0==21||LA87_0==46) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalSuite.g:4534:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // InternalSuite.g:4534:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // InternalSuite.g:4535:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_3);
                    lv_parameterType_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"parameterType",
                              		lv_parameterType_0_0, 
                              		"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalSuite.g:4551:3: ( (lv_name_1_0= ruleValidID ) )
            // InternalSuite.g:4552:1: (lv_name_1_0= ruleValidID )
            {
            // InternalSuite.g:4552:1: (lv_name_1_0= ruleValidID )
            // InternalSuite.g:4553:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"org.eclipse.xtext.xbase.Xtype.ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmFormalParameter"


    // $ANTLR start "entryRuleFullJvmFormalParameter"
    // InternalSuite.g:4577:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // InternalSuite.g:4578:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // InternalSuite.g:4579:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFullJvmFormalParameter"


    // $ANTLR start "ruleFullJvmFormalParameter"
    // InternalSuite.g:4586:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:4589:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // InternalSuite.g:4590:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // InternalSuite.g:4590:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // InternalSuite.g:4590:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // InternalSuite.g:4590:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // InternalSuite.g:4591:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // InternalSuite.g:4591:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // InternalSuite.g:4592:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_3);
            lv_parameterType_0_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"parameterType",
                      		lv_parameterType_0_0, 
                      		"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSuite.g:4608:2: ( (lv_name_1_0= ruleValidID ) )
            // InternalSuite.g:4609:1: (lv_name_1_0= ruleValidID )
            {
            // InternalSuite.g:4609:1: (lv_name_1_0= ruleValidID )
            // InternalSuite.g:4610:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"org.eclipse.xtext.xbase.Xtype.ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFullJvmFormalParameter"


    // $ANTLR start "entryRuleXFeatureCall"
    // InternalSuite.g:4634:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // InternalSuite.g:4635:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // InternalSuite.g:4636:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFeatureCall"


    // $ANTLR start "ruleXFeatureCall"
    // InternalSuite.g:4643:1: ruleXFeatureCall returns [EObject current=null] : ( () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure ) )? ) ;
    public final EObject ruleXFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_explicitOperationCall_7_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_typeArguments_2_0 = null;

        EObject lv_typeArguments_4_0 = null;

        EObject lv_featureCallArguments_8_0 = null;

        EObject lv_featureCallArguments_9_0 = null;

        EObject lv_featureCallArguments_11_0 = null;

        EObject lv_featureCallArguments_13_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:4646:28: ( ( () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure ) )? ) )
            // InternalSuite.g:4647:1: ( () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure ) )? )
            {
            // InternalSuite.g:4647:1: ( () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure ) )? )
            // InternalSuite.g:4647:2: () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure ) )?
            {
            // InternalSuite.g:4647:2: ()
            // InternalSuite.g:4648:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // InternalSuite.g:4653:2: (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==33) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalSuite.g:4653:4: otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_1_0());
                          
                    }
                    // InternalSuite.g:4657:1: ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) )
                    // InternalSuite.g:4658:1: (lv_typeArguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // InternalSuite.g:4658:1: (lv_typeArguments_2_0= ruleJvmArgumentTypeReference )
                    // InternalSuite.g:4659:3: lv_typeArguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_44);
                    lv_typeArguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_2_0, 
                              		"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSuite.g:4675:2: (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==22) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // InternalSuite.g:4675:4: otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_43); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getXFeatureCallAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalSuite.g:4679:1: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // InternalSuite.g:4680:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // InternalSuite.g:4680:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    	    // InternalSuite.g:4681:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_44);
                    	    lv_typeArguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_4_0, 
                    	              		"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop88;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,34,FollowSets000.FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }
                    break;

            }

            // InternalSuite.g:4701:3: ( ( ruleIdOrSuper ) )
            // InternalSuite.g:4702:1: ( ruleIdOrSuper )
            {
            // InternalSuite.g:4702:1: ( ruleIdOrSuper )
            // InternalSuite.g:4703:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_74);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSuite.g:4716:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )?
            int alt92=2;
            alt92 = dfa92.predict(input);
            switch (alt92) {
                case 1 :
                    // InternalSuite.g:4716:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')'
                    {
                    // InternalSuite.g:4716:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) )
                    // InternalSuite.g:4716:4: ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' )
                    {
                    // InternalSuite.g:4723:1: (lv_explicitOperationCall_7_0= '(' )
                    // InternalSuite.g:4724:3: lv_explicitOperationCall_7_0= '('
                    {
                    lv_explicitOperationCall_7_0=(Token)match(input,21,FollowSets000.FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitOperationCall_7_0, grammarAccess.getXFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_3_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                             		setWithLastConsumed(current, "explicitOperationCall", true, "(");
                      	    
                    }

                    }


                    }

                    // InternalSuite.g:4737:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )?
                    int alt91=3;
                    alt91 = dfa91.predict(input);
                    switch (alt91) {
                        case 1 :
                            // InternalSuite.g:4737:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) )
                            {
                            // InternalSuite.g:4737:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) )
                            // InternalSuite.g:4737:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure )
                            {
                            // InternalSuite.g:4754:1: (lv_featureCallArguments_8_0= ruleXShortClosure )
                            // InternalSuite.g:4755:3: lv_featureCallArguments_8_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_3_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_16);
                            lv_featureCallArguments_8_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_8_0, 
                                      		"org.eclipse.xtext.xbase.Xbase.XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSuite.g:4772:6: ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* )
                            {
                            // InternalSuite.g:4772:6: ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* )
                            // InternalSuite.g:4772:7: ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )*
                            {
                            // InternalSuite.g:4772:7: ( (lv_featureCallArguments_9_0= ruleXExpression ) )
                            // InternalSuite.g:4773:1: (lv_featureCallArguments_9_0= ruleXExpression )
                            {
                            // InternalSuite.g:4773:1: (lv_featureCallArguments_9_0= ruleXExpression )
                            // InternalSuite.g:4774:3: lv_featureCallArguments_9_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_3_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_15);
                            lv_featureCallArguments_9_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_9_0, 
                                      		"org.eclipse.xtext.xbase.Xbase.XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // InternalSuite.g:4790:2: (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )*
                            loop90:
                            do {
                                int alt90=2;
                                int LA90_0 = input.LA(1);

                                if ( (LA90_0==22) ) {
                                    alt90=1;
                                }


                                switch (alt90) {
                            	case 1 :
                            	    // InternalSuite.g:4790:4: otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) )
                            	    {
                            	    otherlv_10=(Token)match(input,22,FollowSets000.FOLLOW_18); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_10, grammarAccess.getXFeatureCallAccess().getCommaKeyword_3_1_1_1_0());
                            	          
                            	    }
                            	    // InternalSuite.g:4794:1: ( (lv_featureCallArguments_11_0= ruleXExpression ) )
                            	    // InternalSuite.g:4795:1: (lv_featureCallArguments_11_0= ruleXExpression )
                            	    {
                            	    // InternalSuite.g:4795:1: (lv_featureCallArguments_11_0= ruleXExpression )
                            	    // InternalSuite.g:4796:3: lv_featureCallArguments_11_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_3_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_15);
                            	    lv_featureCallArguments_11_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"featureCallArguments",
                            	              		lv_featureCallArguments_11_0, 
                            	              		"org.eclipse.xtext.xbase.Xbase.XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop90;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,23,FollowSets000.FOLLOW_75); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_3_2());
                          
                    }

                    }
                    break;

            }

            // InternalSuite.g:4816:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure ) )?
            int alt93=2;
            alt93 = dfa93.predict(input);
            switch (alt93) {
                case 1 :
                    // InternalSuite.g:4816:4: ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure )
                    {
                    // InternalSuite.g:4819:1: (lv_featureCallArguments_13_0= ruleXClosure )
                    // InternalSuite.g:4820:3: lv_featureCallArguments_13_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_featureCallArguments_13_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"featureCallArguments",
                              		lv_featureCallArguments_13_0, 
                              		"org.eclipse.xtext.xbase.Xbase.XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFeatureCall"


    // $ANTLR start "entryRuleFeatureCallID"
    // InternalSuite.g:4844:1: entryRuleFeatureCallID returns [String current=null] : iv_ruleFeatureCallID= ruleFeatureCallID EOF ;
    public final String entryRuleFeatureCallID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureCallID = null;


        try {
            // InternalSuite.g:4845:2: (iv_ruleFeatureCallID= ruleFeatureCallID EOF )
            // InternalSuite.g:4846:2: iv_ruleFeatureCallID= ruleFeatureCallID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureCallIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFeatureCallID=ruleFeatureCallID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureCallID.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureCallID"


    // $ANTLR start "ruleFeatureCallID"
    // InternalSuite.g:4853:1: ruleFeatureCallID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'extends' | kw= 'static' | kw= 'import' | kw= 'extension' ) ;
    public final AntlrDatatypeRuleToken ruleFeatureCallID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:4856:28: ( (this_ValidID_0= ruleValidID | kw= 'extends' | kw= 'static' | kw= 'import' | kw= 'extension' ) )
            // InternalSuite.g:4857:1: (this_ValidID_0= ruleValidID | kw= 'extends' | kw= 'static' | kw= 'import' | kw= 'extension' )
            {
            // InternalSuite.g:4857:1: (this_ValidID_0= ruleValidID | kw= 'extends' | kw= 'static' | kw= 'import' | kw= 'extension' )
            int alt94=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt94=1;
                }
                break;
            case 74:
                {
                alt94=2;
                }
                break;
            case 75:
                {
                alt94=3;
                }
                break;
            case 76:
                {
                alt94=4;
                }
                break;
            case 77:
                {
                alt94=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }

            switch (alt94) {
                case 1 :
                    // InternalSuite.g:4858:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeatureCallIDAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ValidID_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ValidID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSuite.g:4870:2: kw= 'extends'
                    {
                    kw=(Token)match(input,74,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFeatureCallIDAccess().getExtendsKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalSuite.g:4877:2: kw= 'static'
                    {
                    kw=(Token)match(input,75,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFeatureCallIDAccess().getStaticKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalSuite.g:4884:2: kw= 'import'
                    {
                    kw=(Token)match(input,76,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFeatureCallIDAccess().getImportKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalSuite.g:4891:2: kw= 'extension'
                    {
                    kw=(Token)match(input,77,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFeatureCallIDAccess().getExtensionKeyword_4()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureCallID"


    // $ANTLR start "entryRuleIdOrSuper"
    // InternalSuite.g:4904:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // InternalSuite.g:4905:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // InternalSuite.g:4906:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdOrSuper"


    // $ANTLR start "ruleIdOrSuper"
    // InternalSuite.g:4913:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FeatureCallID_0= ruleFeatureCallID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FeatureCallID_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:4916:28: ( (this_FeatureCallID_0= ruleFeatureCallID | kw= 'super' ) )
            // InternalSuite.g:4917:1: (this_FeatureCallID_0= ruleFeatureCallID | kw= 'super' )
            {
            // InternalSuite.g:4917:1: (this_FeatureCallID_0= ruleFeatureCallID | kw= 'super' )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==RULE_ID||(LA95_0>=74 && LA95_0<=77)) ) {
                alt95=1;
            }
            else if ( (LA95_0==78) ) {
                alt95=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // InternalSuite.g:4918:5: this_FeatureCallID_0= ruleFeatureCallID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getFeatureCallIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_FeatureCallID_0=ruleFeatureCallID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_FeatureCallID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSuite.g:4930:2: kw= 'super'
                    {
                    kw=(Token)match(input,78,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIdOrSuperAccess().getSuperKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdOrSuper"


    // $ANTLR start "entryRuleXConstructorCall"
    // InternalSuite.g:4943:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // InternalSuite.g:4944:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // InternalSuite.g:4945:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXConstructorCall"


    // $ANTLR start "ruleXConstructorCall"
    // InternalSuite.g:4952:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXConstructorCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_explicitConstructorCall_8_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_4_0 = null;

        EObject lv_typeArguments_6_0 = null;

        EObject lv_arguments_9_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_12_0 = null;

        EObject lv_arguments_14_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:4955:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // InternalSuite.g:4956:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // InternalSuite.g:4956:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // InternalSuite.g:4956:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // InternalSuite.g:4956:2: ()
            // InternalSuite.g:4957:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,79,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // InternalSuite.g:4966:1: ( ( ruleQualifiedName ) )
            // InternalSuite.g:4967:1: ( ruleQualifiedName )
            {
            // InternalSuite.g:4967:1: ( ruleQualifiedName )
            // InternalSuite.g:4968:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_76);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSuite.g:4981:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt97=2;
            alt97 = dfa97.predict(input);
            switch (alt97) {
                case 1 :
                    // InternalSuite.g:4981:3: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // InternalSuite.g:4981:3: ( ( '<' )=>otherlv_3= '<' )
                    // InternalSuite.g:4981:4: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,33,FollowSets000.FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }

                    }

                    // InternalSuite.g:4986:2: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // InternalSuite.g:4987:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // InternalSuite.g:4987:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // InternalSuite.g:4988:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_44);
                    lv_typeArguments_4_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_4_0, 
                              		"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSuite.g:5004:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop96:
                    do {
                        int alt96=2;
                        int LA96_0 = input.LA(1);

                        if ( (LA96_0==22) ) {
                            alt96=1;
                        }


                        switch (alt96) {
                    	case 1 :
                    	    // InternalSuite.g:5004:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_43); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // InternalSuite.g:5008:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // InternalSuite.g:5009:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // InternalSuite.g:5009:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // InternalSuite.g:5010:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_44);
                    	    lv_typeArguments_6_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_6_0, 
                    	              		"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop96;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,34,FollowSets000.FOLLOW_74); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // InternalSuite.g:5030:3: ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt100=2;
            alt100 = dfa100.predict(input);
            switch (alt100) {
                case 1 :
                    // InternalSuite.g:5030:4: ( ( ( '(' ) )=> (lv_explicitConstructorCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // InternalSuite.g:5030:4: ( ( ( '(' ) )=> (lv_explicitConstructorCall_8_0= '(' ) )
                    // InternalSuite.g:5030:5: ( ( '(' ) )=> (lv_explicitConstructorCall_8_0= '(' )
                    {
                    // InternalSuite.g:5037:1: (lv_explicitConstructorCall_8_0= '(' )
                    // InternalSuite.g:5038:3: lv_explicitConstructorCall_8_0= '('
                    {
                    lv_explicitConstructorCall_8_0=(Token)match(input,21,FollowSets000.FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitConstructorCall_8_0, grammarAccess.getXConstructorCallAccess().getExplicitConstructorCallLeftParenthesisKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXConstructorCallRule());
                      	        }
                             		setWithLastConsumed(current, "explicitConstructorCall", true, "(");
                      	    
                    }

                    }


                    }

                    // InternalSuite.g:5051:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt99=3;
                    alt99 = dfa99.predict(input);
                    switch (alt99) {
                        case 1 :
                            // InternalSuite.g:5051:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // InternalSuite.g:5051:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // InternalSuite.g:5051:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // InternalSuite.g:5068:1: (lv_arguments_9_0= ruleXShortClosure )
                            // InternalSuite.g:5069:3: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_16);
                            lv_arguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"arguments",
                                      		lv_arguments_9_0, 
                                      		"org.eclipse.xtext.xbase.Xbase.XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSuite.g:5086:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // InternalSuite.g:5086:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // InternalSuite.g:5086:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // InternalSuite.g:5086:7: ( (lv_arguments_10_0= ruleXExpression ) )
                            // InternalSuite.g:5087:1: (lv_arguments_10_0= ruleXExpression )
                            {
                            // InternalSuite.g:5087:1: (lv_arguments_10_0= ruleXExpression )
                            // InternalSuite.g:5088:3: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_15);
                            lv_arguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"arguments",
                                      		lv_arguments_10_0, 
                                      		"org.eclipse.xtext.xbase.Xbase.XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // InternalSuite.g:5104:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop98:
                            do {
                                int alt98=2;
                                int LA98_0 = input.LA(1);

                                if ( (LA98_0==22) ) {
                                    alt98=1;
                                }


                                switch (alt98) {
                            	case 1 :
                            	    // InternalSuite.g:5104:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,22,FollowSets000.FOLLOW_18); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // InternalSuite.g:5108:1: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // InternalSuite.g:5109:1: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // InternalSuite.g:5109:1: (lv_arguments_12_0= ruleXExpression )
                            	    // InternalSuite.g:5110:3: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_15);
                            	    lv_arguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"arguments",
                            	              		lv_arguments_12_0, 
                            	              		"org.eclipse.xtext.xbase.Xbase.XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop98;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,23,FollowSets000.FOLLOW_75); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // InternalSuite.g:5130:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt101=2;
            alt101 = dfa101.predict(input);
            switch (alt101) {
                case 1 :
                    // InternalSuite.g:5130:4: ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // InternalSuite.g:5133:1: (lv_arguments_14_0= ruleXClosure )
                    // InternalSuite.g:5134:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_arguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_14_0, 
                              		"org.eclipse.xtext.xbase.Xbase.XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXConstructorCall"


    // $ANTLR start "entryRuleXBooleanLiteral"
    // InternalSuite.g:5158:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // InternalSuite.g:5159:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // InternalSuite.g:5160:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXBooleanLiteral"


    // $ANTLR start "ruleXBooleanLiteral"
    // InternalSuite.g:5167:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // InternalSuite.g:5170:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // InternalSuite.g:5171:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // InternalSuite.g:5171:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // InternalSuite.g:5171:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // InternalSuite.g:5171:2: ()
            // InternalSuite.g:5172:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // InternalSuite.g:5177:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==80) ) {
                alt102=1;
            }
            else if ( (LA102_0==81) ) {
                alt102=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }
            switch (alt102) {
                case 1 :
                    // InternalSuite.g:5177:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,80,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSuite.g:5182:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // InternalSuite.g:5182:6: ( (lv_isTrue_2_0= 'true' ) )
                    // InternalSuite.g:5183:1: (lv_isTrue_2_0= 'true' )
                    {
                    // InternalSuite.g:5183:1: (lv_isTrue_2_0= 'true' )
                    // InternalSuite.g:5184:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,81,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isTrue_2_0, grammarAccess.getXBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXBooleanLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "isTrue", true, "true");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXBooleanLiteral"


    // $ANTLR start "entryRuleXNullLiteral"
    // InternalSuite.g:5205:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // InternalSuite.g:5206:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // InternalSuite.g:5207:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXNullLiteral"


    // $ANTLR start "ruleXNullLiteral"
    // InternalSuite.g:5214:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalSuite.g:5217:28: ( ( () otherlv_1= 'null' ) )
            // InternalSuite.g:5218:1: ( () otherlv_1= 'null' )
            {
            // InternalSuite.g:5218:1: ( () otherlv_1= 'null' )
            // InternalSuite.g:5218:2: () otherlv_1= 'null'
            {
            // InternalSuite.g:5218:2: ()
            // InternalSuite.g:5219:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,82,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXNullLiteralAccess().getNullKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXNullLiteral"


    // $ANTLR start "entryRuleXNumberLiteral"
    // InternalSuite.g:5236:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // InternalSuite.g:5237:2: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // InternalSuite.g:5238:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXNumberLiteral"


    // $ANTLR start "ruleXNumberLiteral"
    // InternalSuite.g:5245:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:5248:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // InternalSuite.g:5249:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // InternalSuite.g:5249:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // InternalSuite.g:5249:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // InternalSuite.g:5249:2: ()
            // InternalSuite.g:5250:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // InternalSuite.g:5255:2: ( (lv_value_1_0= ruleNumber ) )
            // InternalSuite.g:5256:1: (lv_value_1_0= ruleNumber )
            {
            // InternalSuite.g:5256:1: (lv_value_1_0= ruleNumber )
            // InternalSuite.g:5257:3: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_1_0=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXNumberLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"org.eclipse.xtext.xbase.Xbase.Number");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXNumberLiteral"


    // $ANTLR start "entryRuleXStringLiteral"
    // InternalSuite.g:5281:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // InternalSuite.g:5282:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // InternalSuite.g:5283:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXStringLiteral"


    // $ANTLR start "ruleXStringLiteral"
    // InternalSuite.g:5290:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // InternalSuite.g:5293:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalSuite.g:5294:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalSuite.g:5294:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalSuite.g:5294:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalSuite.g:5294:2: ()
            // InternalSuite.g:5295:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // InternalSuite.g:5300:2: ( (lv_value_1_0= RULE_STRING ) )
            // InternalSuite.g:5301:1: (lv_value_1_0= RULE_STRING )
            {
            // InternalSuite.g:5301:1: (lv_value_1_0= RULE_STRING )
            // InternalSuite.g:5302:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"org.eclipse.xtext.xbase.Xtype.STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXStringLiteral"


    // $ANTLR start "entryRuleXTypeLiteral"
    // InternalSuite.g:5326:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // InternalSuite.g:5327:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // InternalSuite.g:5328:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXTypeLiteral"


    // $ANTLR start "ruleXTypeLiteral"
    // InternalSuite.g:5335:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_arrayDimensions_4_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:5338:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' ) )
            // InternalSuite.g:5339:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' )
            {
            // InternalSuite.g:5339:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' )
            // InternalSuite.g:5339:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')'
            {
            // InternalSuite.g:5339:2: ()
            // InternalSuite.g:5340:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,83,FollowSets000.FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // InternalSuite.g:5353:1: ( ( ruleQualifiedName ) )
            // InternalSuite.g:5354:1: ( ruleQualifiedName )
            {
            // InternalSuite.g:5354:1: ( ruleQualifiedName )
            // InternalSuite.g:5355:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_77);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSuite.g:5368:2: ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==26) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // InternalSuite.g:5369:1: (lv_arrayDimensions_4_0= ruleArrayBrackets )
            	    {
            	    // InternalSuite.g:5369:1: (lv_arrayDimensions_4_0= ruleArrayBrackets )
            	    // InternalSuite.g:5370:3: lv_arrayDimensions_4_0= ruleArrayBrackets
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getArrayDimensionsArrayBracketsParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_77);
            	    lv_arrayDimensions_4_0=ruleArrayBrackets();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXTypeLiteralRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"arrayDimensions",
            	              		lv_arrayDimensions_4_0, 
            	              		"org.eclipse.xtext.xbase.Xtype.ArrayBrackets");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop103;
                }
            } while (true);

            otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXTypeLiteralAccess().getRightParenthesisKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXTypeLiteral"


    // $ANTLR start "entryRuleXThrowExpression"
    // InternalSuite.g:5398:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // InternalSuite.g:5399:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // InternalSuite.g:5400:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXThrowExpression"


    // $ANTLR start "ruleXThrowExpression"
    // InternalSuite.g:5407:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:5410:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // InternalSuite.g:5411:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // InternalSuite.g:5411:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // InternalSuite.g:5411:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // InternalSuite.g:5411:2: ()
            // InternalSuite.g:5412:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,84,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // InternalSuite.g:5421:1: ( (lv_expression_2_0= ruleXExpression ) )
            // InternalSuite.g:5422:1: (lv_expression_2_0= ruleXExpression )
            {
            // InternalSuite.g:5422:1: (lv_expression_2_0= ruleXExpression )
            // InternalSuite.g:5423:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXThrowExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"org.eclipse.xtext.xbase.Xbase.XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXThrowExpression"


    // $ANTLR start "entryRuleXReturnExpression"
    // InternalSuite.g:5447:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // InternalSuite.g:5448:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // InternalSuite.g:5449:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXReturnExpression"


    // $ANTLR start "ruleXReturnExpression"
    // InternalSuite.g:5456:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( 'extends' | 'static' | 'import' | 'extension' | '!' | '-' | '+' | 'new' | '{' | 'switch' | 'synchronized' | '<' | 'super' | '#' | '[' | 'false' | 'true' | 'null' | 'typeof' | 'if' | 'for' | 'while' | 'do' | 'throw' | 'return' | 'try' | '(' | RULE_ID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:5459:28: ( ( () otherlv_1= 'return' ( ( 'extends' | 'static' | 'import' | 'extension' | '!' | '-' | '+' | 'new' | '{' | 'switch' | 'synchronized' | '<' | 'super' | '#' | '[' | 'false' | 'true' | 'null' | 'typeof' | 'if' | 'for' | 'while' | 'do' | 'throw' | 'return' | 'try' | '(' | RULE_ID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // InternalSuite.g:5460:1: ( () otherlv_1= 'return' ( ( 'extends' | 'static' | 'import' | 'extension' | '!' | '-' | '+' | 'new' | '{' | 'switch' | 'synchronized' | '<' | 'super' | '#' | '[' | 'false' | 'true' | 'null' | 'typeof' | 'if' | 'for' | 'while' | 'do' | 'throw' | 'return' | 'try' | '(' | RULE_ID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // InternalSuite.g:5460:1: ( () otherlv_1= 'return' ( ( 'extends' | 'static' | 'import' | 'extension' | '!' | '-' | '+' | 'new' | '{' | 'switch' | 'synchronized' | '<' | 'super' | '#' | '[' | 'false' | 'true' | 'null' | 'typeof' | 'if' | 'for' | 'while' | 'do' | 'throw' | 'return' | 'try' | '(' | RULE_ID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING )=> (lv_expression_2_0= ruleXExpression ) )? )
            // InternalSuite.g:5460:2: () otherlv_1= 'return' ( ( 'extends' | 'static' | 'import' | 'extension' | '!' | '-' | '+' | 'new' | '{' | 'switch' | 'synchronized' | '<' | 'super' | '#' | '[' | 'false' | 'true' | 'null' | 'typeof' | 'if' | 'for' | 'while' | 'do' | 'throw' | 'return' | 'try' | '(' | RULE_ID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // InternalSuite.g:5460:2: ()
            // InternalSuite.g:5461:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,85,FollowSets000.FOLLOW_78); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // InternalSuite.g:5470:1: ( ( 'extends' | 'static' | 'import' | 'extension' | '!' | '-' | '+' | 'new' | '{' | 'switch' | 'synchronized' | '<' | 'super' | '#' | '[' | 'false' | 'true' | 'null' | 'typeof' | 'if' | 'for' | 'while' | 'do' | 'throw' | 'return' | 'try' | '(' | RULE_ID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt104=2;
            alt104 = dfa104.predict(input);
            switch (alt104) {
                case 1 :
                    // InternalSuite.g:5470:2: ( 'extends' | 'static' | 'import' | 'extension' | '!' | '-' | '+' | 'new' | '{' | 'switch' | 'synchronized' | '<' | 'super' | '#' | '[' | 'false' | 'true' | 'null' | 'typeof' | 'if' | 'for' | 'while' | 'do' | 'throw' | 'return' | 'try' | '(' | RULE_ID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // InternalSuite.g:5498:1: (lv_expression_2_0= ruleXExpression )
                    // InternalSuite.g:5499:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_expression_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXReturnExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_2_0, 
                              		"org.eclipse.xtext.xbase.Xbase.XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXReturnExpression"


    // $ANTLR start "entryRuleXTryCatchFinallyExpression"
    // InternalSuite.g:5523:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // InternalSuite.g:5524:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // InternalSuite.g:5525:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXTryCatchFinallyExpression"


    // $ANTLR start "ruleXTryCatchFinallyExpression"
    // InternalSuite.g:5532:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
    public final EObject ruleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_2_0 = null;

        EObject lv_catchClauses_3_0 = null;

        EObject lv_finallyExpression_5_0 = null;

        EObject lv_finallyExpression_7_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:5535:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // InternalSuite.g:5536:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // InternalSuite.g:5536:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // InternalSuite.g:5536:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // InternalSuite.g:5536:2: ()
            // InternalSuite.g:5537:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,86,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // InternalSuite.g:5546:1: ( (lv_expression_2_0= ruleXExpression ) )
            // InternalSuite.g:5547:1: (lv_expression_2_0= ruleXExpression )
            {
            // InternalSuite.g:5547:1: (lv_expression_2_0= ruleXExpression )
            // InternalSuite.g:5548:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_79);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"org.eclipse.xtext.xbase.Xbase.XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSuite.g:5564:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==89) ) {
                alt107=1;
            }
            else if ( (LA107_0==87) ) {
                alt107=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }
            switch (alt107) {
                case 1 :
                    // InternalSuite.g:5564:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // InternalSuite.g:5564:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // InternalSuite.g:5564:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // InternalSuite.g:5564:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt105=0;
                    loop105:
                    do {
                        int alt105=2;
                        int LA105_0 = input.LA(1);

                        if ( (LA105_0==89) ) {
                            int LA105_2 = input.LA(2);

                            if ( (synpred45_InternalSuite()) ) {
                                alt105=1;
                            }


                        }


                        switch (alt105) {
                    	case 1 :
                    	    // InternalSuite.g:5564:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // InternalSuite.g:5566:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // InternalSuite.g:5567:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_80);
                    	    lv_catchClauses_3_0=ruleXCatchClause();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"catchClauses",
                    	              		lv_catchClauses_3_0, 
                    	              		"org.eclipse.xtext.xbase.Xbase.XCatchClause");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt105 >= 1 ) break loop105;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(105, input);
                                throw eee;
                        }
                        cnt105++;
                    } while (true);

                    // InternalSuite.g:5583:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==87) ) {
                        int LA106_1 = input.LA(2);

                        if ( (synpred46_InternalSuite()) ) {
                            alt106=1;
                        }
                    }
                    switch (alt106) {
                        case 1 :
                            // InternalSuite.g:5583:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // InternalSuite.g:5583:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // InternalSuite.g:5583:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,87,FollowSets000.FOLLOW_18); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // InternalSuite.g:5588:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // InternalSuite.g:5589:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // InternalSuite.g:5589:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // InternalSuite.g:5590:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_finallyExpression_5_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"finallyExpression",
                                      		lv_finallyExpression_5_0, 
                                      		"org.eclipse.xtext.xbase.Xbase.XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSuite.g:5607:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // InternalSuite.g:5607:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // InternalSuite.g:5607:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,87,FollowSets000.FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // InternalSuite.g:5611:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // InternalSuite.g:5612:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // InternalSuite.g:5612:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // InternalSuite.g:5613:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_finallyExpression_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"finallyExpression",
                              		lv_finallyExpression_7_0, 
                              		"org.eclipse.xtext.xbase.Xbase.XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXTryCatchFinallyExpression"


    // $ANTLR start "entryRuleXSynchronizedExpression"
    // InternalSuite.g:5637:1: entryRuleXSynchronizedExpression returns [EObject current=null] : iv_ruleXSynchronizedExpression= ruleXSynchronizedExpression EOF ;
    public final EObject entryRuleXSynchronizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSynchronizedExpression = null;


        try {
            // InternalSuite.g:5638:2: (iv_ruleXSynchronizedExpression= ruleXSynchronizedExpression EOF )
            // InternalSuite.g:5639:2: iv_ruleXSynchronizedExpression= ruleXSynchronizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSynchronizedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXSynchronizedExpression=ruleXSynchronizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSynchronizedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXSynchronizedExpression"


    // $ANTLR start "ruleXSynchronizedExpression"
    // InternalSuite.g:5646:1: ruleXSynchronizedExpression returns [EObject current=null] : ( ( ( ( () 'synchronized' '(' ) )=> ( () otherlv_1= 'synchronized' otherlv_2= '(' ) ) ( (lv_param_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXSynchronizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_param_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:5649:28: ( ( ( ( ( () 'synchronized' '(' ) )=> ( () otherlv_1= 'synchronized' otherlv_2= '(' ) ) ( (lv_param_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // InternalSuite.g:5650:1: ( ( ( ( () 'synchronized' '(' ) )=> ( () otherlv_1= 'synchronized' otherlv_2= '(' ) ) ( (lv_param_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // InternalSuite.g:5650:1: ( ( ( ( () 'synchronized' '(' ) )=> ( () otherlv_1= 'synchronized' otherlv_2= '(' ) ) ( (lv_param_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_expression_5_0= ruleXExpression ) ) )
            // InternalSuite.g:5650:2: ( ( ( () 'synchronized' '(' ) )=> ( () otherlv_1= 'synchronized' otherlv_2= '(' ) ) ( (lv_param_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_expression_5_0= ruleXExpression ) )
            {
            // InternalSuite.g:5650:2: ( ( ( () 'synchronized' '(' ) )=> ( () otherlv_1= 'synchronized' otherlv_2= '(' ) )
            // InternalSuite.g:5650:3: ( ( () 'synchronized' '(' ) )=> ( () otherlv_1= 'synchronized' otherlv_2= '(' )
            {
            // InternalSuite.g:5653:5: ( () otherlv_1= 'synchronized' otherlv_2= '(' )
            // InternalSuite.g:5653:6: () otherlv_1= 'synchronized' otherlv_2= '('
            {
            // InternalSuite.g:5653:6: ()
            // InternalSuite.g:5654:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSynchronizedExpressionAccess().getXSynchronizedExpressionAction_0_0_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,88,FollowSets000.FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSynchronizedExpressionAccess().getSynchronizedKeyword_0_0_1());
                  
            }
            otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXSynchronizedExpressionAccess().getLeftParenthesisKeyword_0_0_2());
                  
            }

            }


            }

            // InternalSuite.g:5667:3: ( (lv_param_3_0= ruleXExpression ) )
            // InternalSuite.g:5668:1: (lv_param_3_0= ruleXExpression )
            {
            // InternalSuite.g:5668:1: (lv_param_3_0= ruleXExpression )
            // InternalSuite.g:5669:3: lv_param_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSynchronizedExpressionAccess().getParamXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_16);
            lv_param_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXSynchronizedExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"param",
                      		lv_param_3_0, 
                      		"org.eclipse.xtext.xbase.Xbase.XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXSynchronizedExpressionAccess().getRightParenthesisKeyword_2());
                  
            }
            // InternalSuite.g:5689:1: ( (lv_expression_5_0= ruleXExpression ) )
            // InternalSuite.g:5690:1: (lv_expression_5_0= ruleXExpression )
            {
            // InternalSuite.g:5690:1: (lv_expression_5_0= ruleXExpression )
            // InternalSuite.g:5691:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSynchronizedExpressionAccess().getExpressionXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_expression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXSynchronizedExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_5_0, 
                      		"org.eclipse.xtext.xbase.Xbase.XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXSynchronizedExpression"


    // $ANTLR start "entryRuleXCatchClause"
    // InternalSuite.g:5715:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // InternalSuite.g:5716:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // InternalSuite.g:5717:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCatchClause"


    // $ANTLR start "ruleXCatchClause"
    // InternalSuite.g:5724:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:5727:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // InternalSuite.g:5728:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // InternalSuite.g:5728:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // InternalSuite.g:5728:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // InternalSuite.g:5728:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // InternalSuite.g:5728:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,89,FollowSets000.FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalSuite.g:5737:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // InternalSuite.g:5738:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // InternalSuite.g:5738:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // InternalSuite.g:5739:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_16);
            lv_declaredParam_2_0=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_2_0, 
                      		"org.eclipse.xtext.xbase.Xbase.FullJvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // InternalSuite.g:5759:1: ( (lv_expression_4_0= ruleXExpression ) )
            // InternalSuite.g:5760:1: (lv_expression_4_0= ruleXExpression )
            {
            // InternalSuite.g:5760:1: (lv_expression_4_0= ruleXExpression )
            // InternalSuite.g:5761:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"org.eclipse.xtext.xbase.Xbase.XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCatchClause"


    // $ANTLR start "entryRuleNumber"
    // InternalSuite.g:5785:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // InternalSuite.g:5789:2: (iv_ruleNumber= ruleNumber EOF )
            // InternalSuite.g:5790:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalSuite.g:5800:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HEX_0=null;
        Token this_INT_1=null;
        Token this_DECIMAL_2=null;
        Token kw=null;
        Token this_INT_4=null;
        Token this_DECIMAL_5=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // InternalSuite.g:5804:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // InternalSuite.g:5805:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // InternalSuite.g:5805:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==RULE_HEX) ) {
                alt111=1;
            }
            else if ( ((LA111_0>=RULE_INT && LA111_0<=RULE_DECIMAL)) ) {
                alt111=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }
            switch (alt111) {
                case 1 :
                    // InternalSuite.g:5805:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSuite.g:5813:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // InternalSuite.g:5813:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // InternalSuite.g:5813:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // InternalSuite.g:5813:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==RULE_INT) ) {
                        alt108=1;
                    }
                    else if ( (LA108_0==RULE_DECIMAL) ) {
                        alt108=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 108, 0, input);

                        throw nvae;
                    }
                    switch (alt108) {
                        case 1 :
                            // InternalSuite.g:5813:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // InternalSuite.g:5821:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FollowSets000.FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_DECIMAL_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // InternalSuite.g:5828:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt110=2;
                    int LA110_0 = input.LA(1);

                    if ( (LA110_0==19) ) {
                        int LA110_1 = input.LA(2);

                        if ( ((LA110_1>=RULE_INT && LA110_1<=RULE_DECIMAL)) ) {
                            alt110=1;
                        }
                    }
                    switch (alt110) {
                        case 1 :
                            // InternalSuite.g:5829:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,19,FollowSets000.FOLLOW_81); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                  
                            }
                            // InternalSuite.g:5834:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            int alt109=2;
                            int LA109_0 = input.LA(1);

                            if ( (LA109_0==RULE_INT) ) {
                                alt109=1;
                            }
                            else if ( (LA109_0==RULE_DECIMAL) ) {
                                alt109=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 109, 0, input);

                                throw nvae;
                            }
                            switch (alt109) {
                                case 1 :
                                    // InternalSuite.g:5834:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_4);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // InternalSuite.g:5842:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FollowSets000.FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_DECIMAL_5);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_DECIMAL_5, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_1_1_1()); 
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleJvmTypeReference"
    // InternalSuite.g:5860:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // InternalSuite.g:5861:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // InternalSuite.g:5862:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmTypeReference"


    // $ANTLR start "ruleJvmTypeReference"
    // InternalSuite.g:5869:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_3 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:5872:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef ) )
            // InternalSuite.g:5873:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef )
            {
            // InternalSuite.g:5873:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef )
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==RULE_ID) ) {
                alt113=1;
            }
            else if ( (LA113_0==21||LA113_0==46) ) {
                alt113=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }
            switch (alt113) {
                case 1 :
                    // InternalSuite.g:5873:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* )
                    {
                    // InternalSuite.g:5873:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* )
                    // InternalSuite.g:5874:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_75);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // InternalSuite.g:5882:1: ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )*
                    loop112:
                    do {
                        int alt112=2;
                        int LA112_0 = input.LA(1);

                        if ( (LA112_0==26) ) {
                            int LA112_2 = input.LA(2);

                            if ( (LA112_2==27) ) {
                                int LA112_3 = input.LA(3);

                                if ( (synpred49_InternalSuite()) ) {
                                    alt112=1;
                                }


                            }


                        }


                        switch (alt112) {
                    	case 1 :
                    	    // InternalSuite.g:5882:2: ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets )
                    	    {
                    	    // InternalSuite.g:5883:24: ( () ruleArrayBrackets )
                    	    // InternalSuite.g:5883:25: () ruleArrayBrackets
                    	    {
                    	    // InternalSuite.g:5883:25: ()
                    	    // InternalSuite.g:5884:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getArrayBracketsParserRuleCall_0_1_0_1()); 
                    	          
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_75);
                    	    ruleArrayBrackets();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop112;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalSuite.g:5899:5: this_XFunctionTypeRef_3= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XFunctionTypeRef_3=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFunctionTypeRef_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmTypeReference"


    // $ANTLR start "entryRuleArrayBrackets"
    // InternalSuite.g:5915:1: entryRuleArrayBrackets returns [String current=null] : iv_ruleArrayBrackets= ruleArrayBrackets EOF ;
    public final String entryRuleArrayBrackets() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArrayBrackets = null;


        try {
            // InternalSuite.g:5916:2: (iv_ruleArrayBrackets= ruleArrayBrackets EOF )
            // InternalSuite.g:5917:2: iv_ruleArrayBrackets= ruleArrayBrackets EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayBracketsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleArrayBrackets=ruleArrayBrackets();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayBrackets.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayBrackets"


    // $ANTLR start "ruleArrayBrackets"
    // InternalSuite.g:5924:1: ruleArrayBrackets returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleArrayBrackets() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalSuite.g:5927:28: ( (kw= '[' kw= ']' ) )
            // InternalSuite.g:5928:1: (kw= '[' kw= ']' )
            {
            // InternalSuite.g:5928:1: (kw= '[' kw= ']' )
            // InternalSuite.g:5929:2: kw= '[' kw= ']'
            {
            kw=(Token)match(input,26,FollowSets000.FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getArrayBracketsAccess().getLeftSquareBracketKeyword_0()); 
                  
            }
            kw=(Token)match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getArrayBracketsAccess().getRightSquareBracketKeyword_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayBrackets"


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // InternalSuite.g:5948:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // InternalSuite.g:5949:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // InternalSuite.g:5950:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFunctionTypeRef"


    // $ANTLR start "ruleXFunctionTypeRef"
    // InternalSuite.g:5957:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_paramTypes_1_0 = null;

        EObject lv_paramTypes_3_0 = null;

        EObject lv_returnType_6_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:5960:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // InternalSuite.g:5961:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // InternalSuite.g:5961:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // InternalSuite.g:5961:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // InternalSuite.g:5961:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==21) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // InternalSuite.g:5961:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_82); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // InternalSuite.g:5965:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt115=2;
                    int LA115_0 = input.LA(1);

                    if ( (LA115_0==RULE_ID||LA115_0==21||LA115_0==46) ) {
                        alt115=1;
                    }
                    switch (alt115) {
                        case 1 :
                            // InternalSuite.g:5965:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // InternalSuite.g:5965:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // InternalSuite.g:5966:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // InternalSuite.g:5966:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // InternalSuite.g:5967:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_15);
                            lv_paramTypes_1_0=ruleJvmTypeReference();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"paramTypes",
                                      		lv_paramTypes_1_0, 
                                      		"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // InternalSuite.g:5983:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop114:
                            do {
                                int alt114=2;
                                int LA114_0 = input.LA(1);

                                if ( (LA114_0==22) ) {
                                    alt114=1;
                                }


                                switch (alt114) {
                            	case 1 :
                            	    // InternalSuite.g:5983:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_31); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // InternalSuite.g:5987:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // InternalSuite.g:5988:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // InternalSuite.g:5988:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // InternalSuite.g:5989:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_15);
                            	    lv_paramTypes_3_0=ruleJvmTypeReference();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"paramTypes",
                            	              		lv_paramTypes_3_0, 
                            	              		"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop114;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_83); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,46,FollowSets000.FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // InternalSuite.g:6013:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // InternalSuite.g:6014:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // InternalSuite.g:6014:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // InternalSuite.g:6015:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_returnType_6_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
              	        }
                     		set(
                     			current, 
                     			"returnType",
                      		lv_returnType_6_0, 
                      		"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFunctionTypeRef"


    // $ANTLR start "entryRuleJvmParameterizedTypeReference"
    // InternalSuite.g:6039:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // InternalSuite.g:6040:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // InternalSuite.g:6041:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmParameterizedTypeReference"


    // $ANTLR start "ruleJvmParameterizedTypeReference"
    // InternalSuite.g:6048:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_12_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:6051:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )? ) )
            // InternalSuite.g:6052:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )? )
            {
            // InternalSuite.g:6052:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )? )
            // InternalSuite.g:6052:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )?
            {
            // InternalSuite.g:6052:2: ( ( ruleQualifiedName ) )
            // InternalSuite.g:6053:1: ( ruleQualifiedName )
            {
            // InternalSuite.g:6053:1: ( ruleQualifiedName )
            // InternalSuite.g:6054:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_84);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSuite.g:6067:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )?
            int alt121=2;
            alt121 = dfa121.predict(input);
            switch (alt121) {
                case 1 :
                    // InternalSuite.g:6067:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )*
                    {
                    // InternalSuite.g:6067:3: ( ( '<' )=>otherlv_1= '<' )
                    // InternalSuite.g:6067:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // InternalSuite.g:6072:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // InternalSuite.g:6073:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // InternalSuite.g:6073:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // InternalSuite.g:6074:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_44);
                    lv_arguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_2_0, 
                              		"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSuite.g:6090:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop117:
                    do {
                        int alt117=2;
                        int LA117_0 = input.LA(1);

                        if ( (LA117_0==22) ) {
                            alt117=1;
                        }


                        switch (alt117) {
                    	case 1 :
                    	    // InternalSuite.g:6090:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_43); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalSuite.g:6094:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // InternalSuite.g:6095:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // InternalSuite.g:6095:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // InternalSuite.g:6096:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_44);
                    	    lv_arguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_4_0, 
                    	              		"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop117;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,34,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3());
                          
                    }
                    // InternalSuite.g:6116:1: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )*
                    loop120:
                    do {
                        int alt120=2;
                        int LA120_0 = input.LA(1);

                        if ( (LA120_0==19) ) {
                            int LA120_2 = input.LA(2);

                            if ( (LA120_2==RULE_ID) ) {
                                int LA120_3 = input.LA(3);

                                if ( (synpred51_InternalSuite()) ) {
                                    alt120=1;
                                }


                            }


                        }


                        switch (alt120) {
                    	case 1 :
                    	    // InternalSuite.g:6116:2: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )?
                    	    {
                    	    // InternalSuite.g:6116:2: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) )
                    	    // InternalSuite.g:6116:3: ( ( () '.' ) )=> ( () otherlv_7= '.' )
                    	    {
                    	    // InternalSuite.g:6118:5: ( () otherlv_7= '.' )
                    	    // InternalSuite.g:6118:6: () otherlv_7= '.'
                    	    {
                    	    // InternalSuite.g:6118:6: ()
                    	    // InternalSuite.g:6119:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmParameterizedTypeReferenceAccess().getJvmInnerTypeReferenceOuterAction_1_4_0_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getJvmParameterizedTypeReferenceAccess().getFullStopKeyword_1_4_0_0_1());
                    	          
                    	    }

                    	    }


                    	    }

                    	    // InternalSuite.g:6128:3: ( ( ruleValidID ) )
                    	    // InternalSuite.g:6129:1: ( ruleValidID )
                    	    {
                    	    // InternalSuite.g:6129:1: ( ruleValidID )
                    	    // InternalSuite.g:6130:3: ruleValidID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_1_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_85);
                    	    ruleValidID();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // InternalSuite.g:6143:2: ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )?
                    	    int alt119=2;
                    	    alt119 = dfa119.predict(input);
                    	    switch (alt119) {
                    	        case 1 :
                    	            // InternalSuite.g:6143:3: ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>'
                    	            {
                    	            // InternalSuite.g:6143:3: ( ( '<' )=>otherlv_9= '<' )
                    	            // InternalSuite.g:6143:4: ( '<' )=>otherlv_9= '<'
                    	            {
                    	            otherlv_9=(Token)match(input,33,FollowSets000.FOLLOW_43); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	                  	newLeafNode(otherlv_9, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_4_2_0());
                    	                  
                    	            }

                    	            }

                    	            // InternalSuite.g:6148:2: ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) )
                    	            // InternalSuite.g:6149:1: (lv_arguments_10_0= ruleJvmArgumentTypeReference )
                    	            {
                    	            // InternalSuite.g:6149:1: (lv_arguments_10_0= ruleJvmArgumentTypeReference )
                    	            // InternalSuite.g:6150:3: lv_arguments_10_0= ruleJvmArgumentTypeReference
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_4_2_1_0()); 
                    	              	    
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_44);
                    	            lv_arguments_10_0=ruleJvmArgumentTypeReference();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	              	        }
                    	                     		add(
                    	                     			current, 
                    	                     			"arguments",
                    	                      		lv_arguments_10_0, 
                    	                      		"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
                    	              	        afterParserOrEnumRuleCall();
                    	              	    
                    	            }

                    	            }


                    	            }

                    	            // InternalSuite.g:6166:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )*
                    	            loop118:
                    	            do {
                    	                int alt118=2;
                    	                int LA118_0 = input.LA(1);

                    	                if ( (LA118_0==22) ) {
                    	                    alt118=1;
                    	                }


                    	                switch (alt118) {
                    	            	case 1 :
                    	            	    // InternalSuite.g:6166:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) )
                    	            	    {
                    	            	    otherlv_11=(Token)match(input,22,FollowSets000.FOLLOW_43); if (state.failed) return current;
                    	            	    if ( state.backtracking==0 ) {

                    	            	          	newLeafNode(otherlv_11, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_4_2_2_0());
                    	            	          
                    	            	    }
                    	            	    // InternalSuite.g:6170:1: ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) )
                    	            	    // InternalSuite.g:6171:1: (lv_arguments_12_0= ruleJvmArgumentTypeReference )
                    	            	    {
                    	            	    // InternalSuite.g:6171:1: (lv_arguments_12_0= ruleJvmArgumentTypeReference )
                    	            	    // InternalSuite.g:6172:3: lv_arguments_12_0= ruleJvmArgumentTypeReference
                    	            	    {
                    	            	    if ( state.backtracking==0 ) {
                    	            	       
                    	            	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_4_2_2_1_0()); 
                    	            	      	    
                    	            	    }
                    	            	    pushFollow(FollowSets000.FOLLOW_44);
                    	            	    lv_arguments_12_0=ruleJvmArgumentTypeReference();

                    	            	    state._fsp--;
                    	            	    if (state.failed) return current;
                    	            	    if ( state.backtracking==0 ) {

                    	            	      	        if (current==null) {
                    	            	      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	            	      	        }
                    	            	             		add(
                    	            	             			current, 
                    	            	             			"arguments",
                    	            	              		lv_arguments_12_0, 
                    	            	              		"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
                    	            	      	        afterParserOrEnumRuleCall();
                    	            	      	    
                    	            	    }

                    	            	    }


                    	            	    }


                    	            	    }
                    	            	    break;

                    	            	default :
                    	            	    break loop118;
                    	                }
                    	            } while (true);

                    	            otherlv_13=(Token)match(input,34,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	                  	newLeafNode(otherlv_13, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_4_2_3());
                    	                  
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop120;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmParameterizedTypeReference"


    // $ANTLR start "entryRuleJvmArgumentTypeReference"
    // InternalSuite.g:6200:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // InternalSuite.g:6201:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // InternalSuite.g:6202:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmArgumentTypeReference"


    // $ANTLR start "ruleJvmArgumentTypeReference"
    // InternalSuite.g:6209:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:6212:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // InternalSuite.g:6213:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // InternalSuite.g:6213:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==RULE_ID||LA122_0==21||LA122_0==46) ) {
                alt122=1;
            }
            else if ( (LA122_0==90) ) {
                alt122=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;
            }
            switch (alt122) {
                case 1 :
                    // InternalSuite.g:6214:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_JvmTypeReference_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSuite.g:6224:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_JvmWildcardTypeReference_1=ruleJvmWildcardTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmWildcardTypeReference_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmArgumentTypeReference"


    // $ANTLR start "entryRuleJvmWildcardTypeReference"
    // InternalSuite.g:6240:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // InternalSuite.g:6241:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // InternalSuite.g:6242:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmWildcardTypeReference"


    // $ANTLR start "ruleJvmWildcardTypeReference"
    // InternalSuite.g:6249:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;

        EObject lv_constraints_4_0 = null;

        EObject lv_constraints_5_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:6252:28: ( ( () otherlv_1= '?' ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )? ) )
            // InternalSuite.g:6253:1: ( () otherlv_1= '?' ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )? )
            {
            // InternalSuite.g:6253:1: ( () otherlv_1= '?' ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )? )
            // InternalSuite.g:6253:2: () otherlv_1= '?' ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )?
            {
            // InternalSuite.g:6253:2: ()
            // InternalSuite.g:6254:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,90,FollowSets000.FOLLOW_86); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // InternalSuite.g:6263:1: ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )?
            int alt125=3;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==74) ) {
                alt125=1;
            }
            else if ( (LA125_0==78) ) {
                alt125=2;
            }
            switch (alt125) {
                case 1 :
                    // InternalSuite.g:6263:2: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* )
                    {
                    // InternalSuite.g:6263:2: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* )
                    // InternalSuite.g:6263:3: ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )*
                    {
                    // InternalSuite.g:6263:3: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // InternalSuite.g:6264:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // InternalSuite.g:6264:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // InternalSuite.g:6265:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_87);
                    lv_constraints_2_0=ruleJvmUpperBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_2_0, 
                              		"org.eclipse.xtext.xbase.Xtype.JvmUpperBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSuite.g:6281:2: ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )*
                    loop123:
                    do {
                        int alt123=2;
                        int LA123_0 = input.LA(1);

                        if ( (LA123_0==91) ) {
                            alt123=1;
                        }


                        switch (alt123) {
                    	case 1 :
                    	    // InternalSuite.g:6282:1: (lv_constraints_3_0= ruleJvmUpperBoundAnded )
                    	    {
                    	    // InternalSuite.g:6282:1: (lv_constraints_3_0= ruleJvmUpperBoundAnded )
                    	    // InternalSuite.g:6283:3: lv_constraints_3_0= ruleJvmUpperBoundAnded
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundAndedParserRuleCall_2_0_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_87);
                    	    lv_constraints_3_0=ruleJvmUpperBoundAnded();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"constraints",
                    	              		lv_constraints_3_0, 
                    	              		"org.eclipse.xtext.xbase.Xtype.JvmUpperBoundAnded");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop123;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalSuite.g:6300:6: ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* )
                    {
                    // InternalSuite.g:6300:6: ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* )
                    // InternalSuite.g:6300:7: ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )*
                    {
                    // InternalSuite.g:6300:7: ( (lv_constraints_4_0= ruleJvmLowerBound ) )
                    // InternalSuite.g:6301:1: (lv_constraints_4_0= ruleJvmLowerBound )
                    {
                    // InternalSuite.g:6301:1: (lv_constraints_4_0= ruleJvmLowerBound )
                    // InternalSuite.g:6302:3: lv_constraints_4_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_87);
                    lv_constraints_4_0=ruleJvmLowerBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_4_0, 
                              		"org.eclipse.xtext.xbase.Xtype.JvmLowerBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSuite.g:6318:2: ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )*
                    loop124:
                    do {
                        int alt124=2;
                        int LA124_0 = input.LA(1);

                        if ( (LA124_0==91) ) {
                            alt124=1;
                        }


                        switch (alt124) {
                    	case 1 :
                    	    // InternalSuite.g:6319:1: (lv_constraints_5_0= ruleJvmLowerBoundAnded )
                    	    {
                    	    // InternalSuite.g:6319:1: (lv_constraints_5_0= ruleJvmLowerBoundAnded )
                    	    // InternalSuite.g:6320:3: lv_constraints_5_0= ruleJvmLowerBoundAnded
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundAndedParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_87);
                    	    lv_constraints_5_0=ruleJvmLowerBoundAnded();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"constraints",
                    	              		lv_constraints_5_0, 
                    	              		"org.eclipse.xtext.xbase.Xtype.JvmLowerBoundAnded");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop124;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmWildcardTypeReference"


    // $ANTLR start "entryRuleJvmUpperBound"
    // InternalSuite.g:6344:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // InternalSuite.g:6345:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // InternalSuite.g:6346:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBound"


    // $ANTLR start "ruleJvmUpperBound"
    // InternalSuite.g:6353:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:6356:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // InternalSuite.g:6357:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // InternalSuite.g:6357:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // InternalSuite.g:6357:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,74,FollowSets000.FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // InternalSuite.g:6361:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // InternalSuite.g:6362:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // InternalSuite.g:6362:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // InternalSuite.g:6363:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBound"


    // $ANTLR start "entryRuleJvmUpperBoundAnded"
    // InternalSuite.g:6387:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // InternalSuite.g:6388:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // InternalSuite.g:6389:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBoundAnded"


    // $ANTLR start "ruleJvmUpperBoundAnded"
    // InternalSuite.g:6396:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:6399:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // InternalSuite.g:6400:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // InternalSuite.g:6400:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // InternalSuite.g:6400:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,91,FollowSets000.FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // InternalSuite.g:6404:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // InternalSuite.g:6405:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // InternalSuite.g:6405:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // InternalSuite.g:6406:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundAndedRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBoundAnded"


    // $ANTLR start "entryRuleJvmLowerBound"
    // InternalSuite.g:6430:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // InternalSuite.g:6431:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // InternalSuite.g:6432:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmLowerBound"


    // $ANTLR start "ruleJvmLowerBound"
    // InternalSuite.g:6439:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:6442:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // InternalSuite.g:6443:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // InternalSuite.g:6443:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // InternalSuite.g:6443:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,78,FollowSets000.FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // InternalSuite.g:6447:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // InternalSuite.g:6448:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // InternalSuite.g:6448:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // InternalSuite.g:6449:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmLowerBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmLowerBound"


    // $ANTLR start "entryRuleJvmLowerBoundAnded"
    // InternalSuite.g:6473:1: entryRuleJvmLowerBoundAnded returns [EObject current=null] : iv_ruleJvmLowerBoundAnded= ruleJvmLowerBoundAnded EOF ;
    public final EObject entryRuleJvmLowerBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBoundAnded = null;


        try {
            // InternalSuite.g:6474:2: (iv_ruleJvmLowerBoundAnded= ruleJvmLowerBoundAnded EOF )
            // InternalSuite.g:6475:2: iv_ruleJvmLowerBoundAnded= ruleJvmLowerBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundAndedRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleJvmLowerBoundAnded=ruleJvmLowerBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBoundAnded; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmLowerBoundAnded"


    // $ANTLR start "ruleJvmLowerBoundAnded"
    // InternalSuite.g:6482:1: ruleJvmLowerBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:6485:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // InternalSuite.g:6486:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // InternalSuite.g:6486:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // InternalSuite.g:6486:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,91,FollowSets000.FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // InternalSuite.g:6490:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // InternalSuite.g:6491:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // InternalSuite.g:6491:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // InternalSuite.g:6492:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmLowerBoundAndedRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmLowerBoundAnded"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalSuite.g:6518:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalSuite.g:6519:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalSuite.g:6520:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalSuite.g:6527:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:6530:28: ( (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) )
            // InternalSuite.g:6531:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            {
            // InternalSuite.g:6531:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            // InternalSuite.g:6532:5: this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*'
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_88);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,19,FollowSets000.FOLLOW_89); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1()); 
                  
            }
            kw=(Token)match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleValidID"
    // InternalSuite.g:6562:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // InternalSuite.g:6563:2: (iv_ruleValidID= ruleValidID EOF )
            // InternalSuite.g:6564:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // InternalSuite.g:6571:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // InternalSuite.g:6574:28: (this_ID_0= RULE_ID )
            // InternalSuite.g:6575:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRuleXImportSection"
    // InternalSuite.g:6590:1: entryRuleXImportSection returns [EObject current=null] : iv_ruleXImportSection= ruleXImportSection EOF ;
    public final EObject entryRuleXImportSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXImportSection = null;


        try {
            // InternalSuite.g:6591:2: (iv_ruleXImportSection= ruleXImportSection EOF )
            // InternalSuite.g:6592:2: iv_ruleXImportSection= ruleXImportSection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXImportSectionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXImportSection=ruleXImportSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXImportSection; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXImportSection"


    // $ANTLR start "ruleXImportSection"
    // InternalSuite.g:6599:1: ruleXImportSection returns [EObject current=null] : ( (lv_importDeclarations_0_0= ruleXImportDeclaration ) )+ ;
    public final EObject ruleXImportSection() throws RecognitionException {
        EObject current = null;

        EObject lv_importDeclarations_0_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:6602:28: ( ( (lv_importDeclarations_0_0= ruleXImportDeclaration ) )+ )
            // InternalSuite.g:6603:1: ( (lv_importDeclarations_0_0= ruleXImportDeclaration ) )+
            {
            // InternalSuite.g:6603:1: ( (lv_importDeclarations_0_0= ruleXImportDeclaration ) )+
            int cnt126=0;
            loop126:
            do {
                int alt126=2;
                int LA126_0 = input.LA(1);

                if ( (LA126_0==76) ) {
                    alt126=1;
                }


                switch (alt126) {
            	case 1 :
            	    // InternalSuite.g:6604:1: (lv_importDeclarations_0_0= ruleXImportDeclaration )
            	    {
            	    // InternalSuite.g:6604:1: (lv_importDeclarations_0_0= ruleXImportDeclaration )
            	    // InternalSuite.g:6605:3: lv_importDeclarations_0_0= ruleXImportDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXImportSectionAccess().getImportDeclarationsXImportDeclarationParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_90);
            	    lv_importDeclarations_0_0=ruleXImportDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXImportSectionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"importDeclarations",
            	              		lv_importDeclarations_0_0, 
            	              		"org.eclipse.xtext.xbase.Xtype.XImportDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt126 >= 1 ) break loop126;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(126, input);
                        throw eee;
                }
                cnt126++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXImportSection"


    // $ANTLR start "entryRuleXImportDeclaration"
    // InternalSuite.g:6629:1: entryRuleXImportDeclaration returns [EObject current=null] : iv_ruleXImportDeclaration= ruleXImportDeclaration EOF ;
    public final EObject entryRuleXImportDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXImportDeclaration = null;


        try {
            // InternalSuite.g:6630:2: (iv_ruleXImportDeclaration= ruleXImportDeclaration EOF )
            // InternalSuite.g:6631:2: iv_ruleXImportDeclaration= ruleXImportDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXImportDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXImportDeclaration=ruleXImportDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXImportDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXImportDeclaration"


    // $ANTLR start "ruleXImportDeclaration"
    // InternalSuite.g:6638:1: ruleXImportDeclaration returns [EObject current=null] : (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? ) ;
    public final EObject ruleXImportDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_static_1_0=null;
        Token lv_extension_2_0=null;
        Token lv_wildcard_4_0=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_memberName_5_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_7_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:6641:28: ( (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? ) )
            // InternalSuite.g:6642:1: (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? )
            {
            // InternalSuite.g:6642:1: (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? )
            // InternalSuite.g:6642:3: otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )?
            {
            otherlv_0=(Token)match(input,76,FollowSets000.FOLLOW_91); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXImportDeclarationAccess().getImportKeyword_0());
                  
            }
            // InternalSuite.g:6646:1: ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) )
            int alt129=3;
            alt129 = dfa129.predict(input);
            switch (alt129) {
                case 1 :
                    // InternalSuite.g:6646:2: ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) )
                    {
                    // InternalSuite.g:6646:2: ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) )
                    // InternalSuite.g:6646:3: ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) )
                    {
                    // InternalSuite.g:6646:3: ( (lv_static_1_0= 'static' ) )
                    // InternalSuite.g:6647:1: (lv_static_1_0= 'static' )
                    {
                    // InternalSuite.g:6647:1: (lv_static_1_0= 'static' )
                    // InternalSuite.g:6648:3: lv_static_1_0= 'static'
                    {
                    lv_static_1_0=(Token)match(input,75,FollowSets000.FOLLOW_92); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_static_1_0, grammarAccess.getXImportDeclarationAccess().getStaticStaticKeyword_1_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXImportDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "static", true, "static");
                      	    
                    }

                    }


                    }

                    // InternalSuite.g:6661:2: ( (lv_extension_2_0= 'extension' ) )?
                    int alt127=2;
                    int LA127_0 = input.LA(1);

                    if ( (LA127_0==77) ) {
                        alt127=1;
                    }
                    switch (alt127) {
                        case 1 :
                            // InternalSuite.g:6662:1: (lv_extension_2_0= 'extension' )
                            {
                            // InternalSuite.g:6662:1: (lv_extension_2_0= 'extension' )
                            // InternalSuite.g:6663:3: lv_extension_2_0= 'extension'
                            {
                            lv_extension_2_0=(Token)match(input,77,FollowSets000.FOLLOW_92); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_extension_2_0, grammarAccess.getXImportDeclarationAccess().getExtensionExtensionKeyword_1_0_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getXImportDeclarationRule());
                              	        }
                                     		setWithLastConsumed(current, "extension", true, "extension");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // InternalSuite.g:6676:3: ( ( ruleQualifiedNameInStaticImport ) )
                    // InternalSuite.g:6677:1: ( ruleQualifiedNameInStaticImport )
                    {
                    // InternalSuite.g:6677:1: ( ruleQualifiedNameInStaticImport )
                    // InternalSuite.g:6678:3: ruleQualifiedNameInStaticImport
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXImportDeclarationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeCrossReference_1_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_93);
                    ruleQualifiedNameInStaticImport();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSuite.g:6691:2: ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) )
                    int alt128=2;
                    int LA128_0 = input.LA(1);

                    if ( (LA128_0==50) ) {
                        alt128=1;
                    }
                    else if ( (LA128_0==RULE_ID) ) {
                        alt128=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 128, 0, input);

                        throw nvae;
                    }
                    switch (alt128) {
                        case 1 :
                            // InternalSuite.g:6691:3: ( (lv_wildcard_4_0= '*' ) )
                            {
                            // InternalSuite.g:6691:3: ( (lv_wildcard_4_0= '*' ) )
                            // InternalSuite.g:6692:1: (lv_wildcard_4_0= '*' )
                            {
                            // InternalSuite.g:6692:1: (lv_wildcard_4_0= '*' )
                            // InternalSuite.g:6693:3: lv_wildcard_4_0= '*'
                            {
                            lv_wildcard_4_0=(Token)match(input,50,FollowSets000.FOLLOW_94); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_wildcard_4_0, grammarAccess.getXImportDeclarationAccess().getWildcardAsteriskKeyword_1_0_3_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getXImportDeclarationRule());
                              	        }
                                     		setWithLastConsumed(current, "wildcard", true, "*");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSuite.g:6707:6: ( (lv_memberName_5_0= ruleValidID ) )
                            {
                            // InternalSuite.g:6707:6: ( (lv_memberName_5_0= ruleValidID ) )
                            // InternalSuite.g:6708:1: (lv_memberName_5_0= ruleValidID )
                            {
                            // InternalSuite.g:6708:1: (lv_memberName_5_0= ruleValidID )
                            // InternalSuite.g:6709:3: lv_memberName_5_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXImportDeclarationAccess().getMemberNameValidIDParserRuleCall_1_0_3_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_94);
                            lv_memberName_5_0=ruleValidID();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXImportDeclarationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"memberName",
                                      		lv_memberName_5_0, 
                                      		"org.eclipse.xtext.xbase.Xtype.ValidID");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSuite.g:6726:6: ( ( ruleQualifiedName ) )
                    {
                    // InternalSuite.g:6726:6: ( ( ruleQualifiedName ) )
                    // InternalSuite.g:6727:1: ( ruleQualifiedName )
                    {
                    // InternalSuite.g:6727:1: ( ruleQualifiedName )
                    // InternalSuite.g:6728:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXImportDeclarationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeCrossReference_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_94);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSuite.g:6742:6: ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) )
                    {
                    // InternalSuite.g:6742:6: ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) )
                    // InternalSuite.g:6743:1: (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard )
                    {
                    // InternalSuite.g:6743:1: (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard )
                    // InternalSuite.g:6744:3: lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_94);
                    lv_importedNamespace_7_0=ruleQualifiedNameWithWildcard();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXImportDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"importedNamespace",
                              		lv_importedNamespace_7_0, 
                              		"org.eclipse.xtext.xbase.Xtype.QualifiedNameWithWildcard");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSuite.g:6760:3: (otherlv_8= ';' )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==17) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // InternalSuite.g:6760:5: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXImportDeclarationAccess().getSemicolonKeyword_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXImportDeclaration"


    // $ANTLR start "entryRuleQualifiedNameInStaticImport"
    // InternalSuite.g:6772:1: entryRuleQualifiedNameInStaticImport returns [String current=null] : iv_ruleQualifiedNameInStaticImport= ruleQualifiedNameInStaticImport EOF ;
    public final String entryRuleQualifiedNameInStaticImport() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameInStaticImport = null;


        try {
            // InternalSuite.g:6773:2: (iv_ruleQualifiedNameInStaticImport= ruleQualifiedNameInStaticImport EOF )
            // InternalSuite.g:6774:2: iv_ruleQualifiedNameInStaticImport= ruleQualifiedNameInStaticImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameInStaticImportRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQualifiedNameInStaticImport=ruleQualifiedNameInStaticImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameInStaticImport.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameInStaticImport"


    // $ANTLR start "ruleQualifiedNameInStaticImport"
    // InternalSuite.g:6781:1: ruleQualifiedNameInStaticImport returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '.' )+ ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameInStaticImport() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // InternalSuite.g:6784:28: ( (this_ValidID_0= ruleValidID kw= '.' )+ )
            // InternalSuite.g:6785:1: (this_ValidID_0= ruleValidID kw= '.' )+
            {
            // InternalSuite.g:6785:1: (this_ValidID_0= ruleValidID kw= '.' )+
            int cnt131=0;
            loop131:
            do {
                int alt131=2;
                int LA131_0 = input.LA(1);

                if ( (LA131_0==RULE_ID) ) {
                    int LA131_2 = input.LA(2);

                    if ( (LA131_2==19) ) {
                        alt131=1;
                    }


                }


                switch (alt131) {
            	case 1 :
            	    // InternalSuite.g:6786:5: this_ValidID_0= ruleValidID kw= '.'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameInStaticImportAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FollowSets000.FOLLOW_88);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,19,FollowSets000.FOLLOW_95); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameInStaticImportAccess().getFullStopKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt131 >= 1 ) break loop131;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(131, input);
                        throw eee;
                }
                cnt131++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameInStaticImport"

    // $ANTLR start synpred1_InternalSuite
    public final void synpred1_InternalSuite_fragment() throws RecognitionException {   
        // InternalSuite.g:402:3: ( '.' )
        // InternalSuite.g:403:2: '.'
        {
        match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalSuite

    // $ANTLR start synpred2_InternalSuite
    public final void synpred2_InternalSuite_fragment() throws RecognitionException {   
        // InternalSuite.g:469:4: ( '(' )
        // InternalSuite.g:469:6: '('
        {
        match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalSuite

    // $ANTLR start synpred3_InternalSuite
    public final void synpred3_InternalSuite_fragment() throws RecognitionException {   
        // InternalSuite.g:474:5: ( ( ( ( ruleValidID ) ) '=' ) )
        // InternalSuite.g:474:6: ( ( ( ruleValidID ) ) '=' )
        {
        // InternalSuite.g:474:6: ( ( ( ruleValidID ) ) '=' )
        // InternalSuite.g:474:7: ( ( ruleValidID ) ) '='
        {
        // InternalSuite.g:474:7: ( ( ruleValidID ) )
        // InternalSuite.g:475:1: ( ruleValidID )
        {
        // InternalSuite.g:475:1: ( ruleValidID )
        // InternalSuite.g:476:3: ruleValidID
        {
        pushFollow(FollowSets000.FOLLOW_17);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalSuite

    // $ANTLR start synpred6_InternalSuite
    public final void synpred6_InternalSuite_fragment() throws RecognitionException {   
        // InternalSuite.g:631:4: ( ( () '#' '[' ) )
        // InternalSuite.g:631:5: ( () '#' '[' )
        {
        // InternalSuite.g:631:5: ( () '#' '[' )
        // InternalSuite.g:631:6: () '#' '['
        {
        // InternalSuite.g:631:6: ()
        // InternalSuite.g:632:1: 
        {
        }

        match(input,25,FollowSets000.FOLLOW_19); if (state.failed) return ;
        match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred6_InternalSuite

    // $ANTLR start synpred7_InternalSuite
    public final void synpred7_InternalSuite_fragment() throws RecognitionException {   
        // InternalSuite.g:751:4: ( ( () '#' '[' ) )
        // InternalSuite.g:751:5: ( () '#' '[' )
        {
        // InternalSuite.g:751:5: ( () '#' '[' )
        // InternalSuite.g:751:6: () '#' '['
        {
        // InternalSuite.g:751:6: ()
        // InternalSuite.g:752:1: 
        {
        }

        match(input,25,FollowSets000.FOLLOW_19); if (state.failed) return ;
        match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred7_InternalSuite

    // $ANTLR start synpred8_InternalSuite
    public final void synpred8_InternalSuite_fragment() throws RecognitionException {   
        // InternalSuite.g:970:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // InternalSuite.g:970:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // InternalSuite.g:970:4: ( () ( ( ruleOpMultiAssign ) ) )
        // InternalSuite.g:970:5: () ( ( ruleOpMultiAssign ) )
        {
        // InternalSuite.g:970:5: ()
        // InternalSuite.g:971:1: 
        {
        }

        // InternalSuite.g:971:2: ( ( ruleOpMultiAssign ) )
        // InternalSuite.g:972:1: ( ruleOpMultiAssign )
        {
        // InternalSuite.g:972:1: ( ruleOpMultiAssign )
        // InternalSuite.g:973:3: ruleOpMultiAssign
        {
        pushFollow(FollowSets000.FOLLOW_2);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalSuite

    // $ANTLR start synpred9_InternalSuite
    public final void synpred9_InternalSuite_fragment() throws RecognitionException {   
        // InternalSuite.g:1164:3: ( ( () ( ( ruleOpOr ) ) ) )
        // InternalSuite.g:1164:4: ( () ( ( ruleOpOr ) ) )
        {
        // InternalSuite.g:1164:4: ( () ( ( ruleOpOr ) ) )
        // InternalSuite.g:1164:5: () ( ( ruleOpOr ) )
        {
        // InternalSuite.g:1164:5: ()
        // InternalSuite.g:1165:1: 
        {
        }

        // InternalSuite.g:1165:2: ( ( ruleOpOr ) )
        // InternalSuite.g:1166:1: ( ruleOpOr )
        {
        // InternalSuite.g:1166:1: ( ruleOpOr )
        // InternalSuite.g:1167:3: ruleOpOr
        {
        pushFollow(FollowSets000.FOLLOW_2);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalSuite

    // $ANTLR start synpred10_InternalSuite
    public final void synpred10_InternalSuite_fragment() throws RecognitionException {   
        // InternalSuite.g:1265:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // InternalSuite.g:1265:4: ( () ( ( ruleOpAnd ) ) )
        {
        // InternalSuite.g:1265:4: ( () ( ( ruleOpAnd ) ) )
        // InternalSuite.g:1265:5: () ( ( ruleOpAnd ) )
        {
        // InternalSuite.g:1265:5: ()
        // InternalSuite.g:1266:1: 
        {
        }

        // InternalSuite.g:1266:2: ( ( ruleOpAnd ) )
        // InternalSuite.g:1267:1: ( ruleOpAnd )
        {
        // InternalSuite.g:1267:1: ( ruleOpAnd )
        // InternalSuite.g:1268:3: ruleOpAnd
        {
        pushFollow(FollowSets000.FOLLOW_2);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred10_InternalSuite

    // $ANTLR start synpred11_InternalSuite
    public final void synpred11_InternalSuite_fragment() throws RecognitionException {   
        // InternalSuite.g:1366:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // InternalSuite.g:1366:4: ( () ( ( ruleOpEquality ) ) )
        {
        // InternalSuite.g:1366:4: ( () ( ( ruleOpEquality ) ) )
        // InternalSuite.g:1366:5: () ( ( ruleOpEquality ) )
        {
        // InternalSuite.g:1366:5: ()
        // InternalSuite.g:1367:1: 
        {
        }

        // InternalSuite.g:1367:2: ( ( ruleOpEquality ) )
        // InternalSuite.g:1368:1: ( ruleOpEquality )
        {
        // InternalSuite.g:1368:1: ( ruleOpEquality )
        // InternalSuite.g:1369:3: ruleOpEquality
        {
        pushFollow(FollowSets000.FOLLOW_2);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred11_InternalSuite

    // $ANTLR start synpred12_InternalSuite
    public final void synpred12_InternalSuite_fragment() throws RecognitionException {   
        // InternalSuite.g:1488:4: ( ( () 'instanceof' ) )
        // InternalSuite.g:1488:5: ( () 'instanceof' )
        {
        // InternalSuite.g:1488:5: ( () 'instanceof' )
        // InternalSuite.g:1488:6: () 'instanceof'
        {
        // InternalSuite.g:1488:6: ()
        // InternalSuite.g:1489:1: 
        {
        }

        match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalSuite

    // $ANTLR start synpred13_InternalSuite
    public final void synpred13_InternalSuite_fragment() throws RecognitionException {   
        // InternalSuite.g:1519:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // InternalSuite.g:1519:9: ( () ( ( ruleOpCompare ) ) )
        {
        // InternalSuite.g:1519:9: ( () ( ( ruleOpCompare ) ) )
        // InternalSuite.g:1519:10: () ( ( ruleOpCompare ) )
        {
        // InternalSuite.g:1519:10: ()
        // InternalSuite.g:1520:1: 
        {
        }

        // InternalSuite.g:1520:2: ( ( ruleOpCompare ) )
        // InternalSuite.g:1521:1: ( ruleOpCompare )
        {
        // InternalSuite.g:1521:1: ( ruleOpCompare )
        // InternalSuite.g:1522:3: ruleOpCompare
        {
        pushFollow(FollowSets000.FOLLOW_2);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred13_InternalSuite

    // $ANTLR start synpred14_InternalSuite
    public final void synpred14_InternalSuite_fragment() throws RecognitionException {   
        // InternalSuite.g:1647:3: ( ( () ( ( ruleOpOther ) ) ) )
        // InternalSuite.g:1647:4: ( () ( ( ruleOpOther ) ) )
        {
        // InternalSuite.g:1647:4: ( () ( ( ruleOpOther ) ) )
        // InternalSuite.g:1647:5: () ( ( ruleOpOther ) )
        {
        // InternalSuite.g:1647:5: ()
        // InternalSuite.g:1648:1: 
        {
        }

        // InternalSuite.g:1648:2: ( ( ruleOpOther ) )
        // InternalSuite.g:1649:1: ( ruleOpOther )
        {
        // InternalSuite.g:1649:1: ( ruleOpOther )
        // InternalSuite.g:1650:3: ruleOpOther
        {
        pushFollow(FollowSets000.FOLLOW_2);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred14_InternalSuite

    // $ANTLR start synpred15_InternalSuite
    public final void synpred15_InternalSuite_fragment() throws RecognitionException {   
        // InternalSuite.g:1759:3: ( ( '>' '>' ) )
        // InternalSuite.g:1759:4: ( '>' '>' )
        {
        // InternalSuite.g:1759:4: ( '>' '>' )
        // InternalSuite.g:1760:2: '>' '>'
        {
        match(input,34,FollowSets000.FOLLOW_34); if (state.failed) return ;
        match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalSuite

    // $ANTLR start synpred16_InternalSuite
    public final void synpred16_InternalSuite_fragment() throws RecognitionException {   
        // InternalSuite.g:1789:3: ( ( '<' '<' ) )
        // InternalSuite.g:1789:4: ( '<' '<' )
        {
        // InternalSuite.g:1789:4: ( '<' '<' )
        // InternalSuite.g:1790:2: '<' '<'
        {
        match(input,33,FollowSets000.FOLLOW_24); if (state.failed) return ;
        match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred16_InternalSuite

    // $ANTLR start synpred17_InternalSuite
    public final void synpred17_InternalSuite_fragment() throws RecognitionException {   
        // InternalSuite.g:1863:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // InternalSuite.g:1863:4: ( () ( ( ruleOpAdd ) ) )
        {
        // InternalSuite.g:1863:4: ( () ( ( ruleOpAdd ) ) )
        // InternalSuite.g:1863:5: () ( ( ruleOpAdd ) )
        {
        // InternalSuite.g:1863:5: ()
        // InternalSuite.g:1864:1: 
        {
        }

        // InternalSuite.g:1864:2: ( ( ruleOpAdd ) )
        // InternalSuite.g:1865:1: ( ruleOpAdd )
        {
        // InternalSuite.g:1865:1: ( ruleOpAdd )
        // InternalSuite.g:1866:3: ruleOpAdd
        {
        pushFollow(FollowSets000.FOLLOW_2);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred17_InternalSuite

    // $ANTLR start synpred18_InternalSuite
    public final void synpred18_InternalSuite_fragment() throws RecognitionException {   
        // InternalSuite.g:1971:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // InternalSuite.g:1971:4: ( () ( ( ruleOpMulti ) ) )
        {
        // InternalSuite.g:1971:4: ( () ( ( ruleOpMulti ) ) )
        // InternalSuite.g:1971:5: () ( ( ruleOpMulti ) )
        {
        // InternalSuite.g:1971:5: ()
        // InternalSuite.g:1972:1: 
        {
        }

        // InternalSuite.g:1972:2: ( ( ruleOpMulti ) )
        // InternalSuite.g:1973:1: ( ruleOpMulti )
        {
        // InternalSuite.g:1973:1: ( ruleOpMulti )
        // InternalSuite.g:1974:3: ruleOpMulti
        {
        pushFollow(FollowSets000.FOLLOW_2);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred18_InternalSuite

    // $ANTLR start synpred19_InternalSuite
    public final void synpred19_InternalSuite_fragment() throws RecognitionException {   
        // InternalSuite.g:2204:3: ( ( () 'as' ) )
        // InternalSuite.g:2204:4: ( () 'as' )
        {
        // InternalSuite.g:2204:4: ( () 'as' )
        // InternalSuite.g:2204:5: () 'as'
        {
        // InternalSuite.g:2204:5: ()
        // InternalSuite.g:2205:1: 
        {
        }

        match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalSuite

    // $ANTLR start synpred20_InternalSuite
    public final void synpred20_InternalSuite_fragment() throws RecognitionException {   
        // InternalSuite.g:2264:2: ( ( () ( ( ruleOpPostfix ) ) ) )
        // InternalSuite.g:2264:3: ( () ( ( ruleOpPostfix ) ) )
        {
        // InternalSuite.g:2264:3: ( () ( ( ruleOpPostfix ) ) )
        // InternalSuite.g:2264:4: () ( ( ruleOpPostfix ) )
        {
        // InternalSuite.g:2264:4: ()
        // InternalSuite.g:2265:1: 
        {
        }

        // InternalSuite.g:2265:2: ( ( ruleOpPostfix ) )
        // InternalSuite.g:2266:1: ( ruleOpPostfix )
        {
        // InternalSuite.g:2266:1: ( ruleOpPostfix )
        // InternalSuite.g:2267:3: ruleOpPostfix
        {
        pushFollow(FollowSets000.FOLLOW_2);
        ruleOpPostfix();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalSuite

    // $ANTLR start synpred21_InternalSuite
    public final void synpred21_InternalSuite_fragment() throws RecognitionException {   
        // InternalSuite.g:2354:4: ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )
        // InternalSuite.g:2354:5: ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign )
        {
        // InternalSuite.g:2354:5: ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign )
        // InternalSuite.g:2354:6: () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign
        {
        // InternalSuite.g:2354:6: ()
        // InternalSuite.g:2355:1: 
        {
        }

        // InternalSuite.g:2355:2: ( '.' | ( ( '::' ) ) )
        int alt132=2;
        int LA132_0 = input.LA(1);

        if ( (LA132_0==19) ) {
            alt132=1;
        }
        else if ( (LA132_0==58) ) {
            alt132=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 132, 0, input);

            throw nvae;
        }
        switch (alt132) {
            case 1 :
                // InternalSuite.g:2355:4: '.'
                {
                match(input,19,FollowSets000.FOLLOW_41); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalSuite.g:2357:6: ( ( '::' ) )
                {
                // InternalSuite.g:2357:6: ( ( '::' ) )
                // InternalSuite.g:2358:1: ( '::' )
                {
                // InternalSuite.g:2358:1: ( '::' )
                // InternalSuite.g:2359:2: '::'
                {
                match(input,58,FollowSets000.FOLLOW_41); if (state.failed) return ;

                }


                }


                }
                break;

        }

        // InternalSuite.g:2363:3: ( ( ruleFeatureCallID ) )
        // InternalSuite.g:2364:1: ( ruleFeatureCallID )
        {
        // InternalSuite.g:2364:1: ( ruleFeatureCallID )
        // InternalSuite.g:2365:3: ruleFeatureCallID
        {
        pushFollow(FollowSets000.FOLLOW_17);
        ruleFeatureCallID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FollowSets000.FOLLOW_2);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalSuite

    // $ANTLR start synpred22_InternalSuite
    public final void synpred22_InternalSuite_fragment() throws RecognitionException {   
        // InternalSuite.g:2435:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )
        // InternalSuite.g:2435:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) )
        {
        // InternalSuite.g:2435:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) )
        // InternalSuite.g:2435:10: () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) )
        {
        // InternalSuite.g:2435:10: ()
        // InternalSuite.g:2436:1: 
        {
        }

        // InternalSuite.g:2436:2: ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) )
        int alt133=3;
        switch ( input.LA(1) ) {
        case 19:
            {
            alt133=1;
            }
            break;
        case 59:
            {
            alt133=2;
            }
            break;
        case 58:
            {
            alt133=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 133, 0, input);

            throw nvae;
        }

        switch (alt133) {
            case 1 :
                // InternalSuite.g:2436:4: '.'
                {
                match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalSuite.g:2438:6: ( ( '?.' ) )
                {
                // InternalSuite.g:2438:6: ( ( '?.' ) )
                // InternalSuite.g:2439:1: ( '?.' )
                {
                // InternalSuite.g:2439:1: ( '?.' )
                // InternalSuite.g:2440:2: '?.'
                {
                match(input,59,FollowSets000.FOLLOW_2); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // InternalSuite.g:2445:6: ( ( '::' ) )
                {
                // InternalSuite.g:2445:6: ( ( '::' ) )
                // InternalSuite.g:2446:1: ( '::' )
                {
                // InternalSuite.g:2446:1: ( '::' )
                // InternalSuite.g:2447:2: '::'
                {
                match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred22_InternalSuite

    // $ANTLR start synpred23_InternalSuite
    public final void synpred23_InternalSuite_fragment() throws RecognitionException {   
        // InternalSuite.g:2556:4: ( ( '(' ) )
        // InternalSuite.g:2557:1: ( '(' )
        {
        // InternalSuite.g:2557:1: ( '(' )
        // InternalSuite.g:2558:2: '('
        {
        match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalSuite

    // $ANTLR start synpred24_InternalSuite
    public final void synpred24_InternalSuite_fragment() throws RecognitionException {   
        // InternalSuite.g:2577:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // InternalSuite.g:2577:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // InternalSuite.g:2577:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // InternalSuite.g:2577:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // InternalSuite.g:2577:6: ()
        // InternalSuite.g:2578:1: 
        {
        }

        // InternalSuite.g:2578:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt135=2;
        int LA135_0 = input.LA(1);

        if ( (LA135_0==RULE_ID||LA135_0==21||LA135_0==46) ) {
            alt135=1;
        }
        switch (alt135) {
            case 1 :
                // InternalSuite.g:2578:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // InternalSuite.g:2578:3: ( ( ruleJvmFormalParameter ) )
                // InternalSuite.g:2579:1: ( ruleJvmFormalParameter )
                {
                // InternalSuite.g:2579:1: ( ruleJvmFormalParameter )
                // InternalSuite.g:2580:1: ruleJvmFormalParameter
                {
                pushFollow(FollowSets000.FOLLOW_52);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // InternalSuite.g:2582:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop134:
                do {
                    int alt134=2;
                    int LA134_0 = input.LA(1);

                    if ( (LA134_0==22) ) {
                        alt134=1;
                    }


                    switch (alt134) {
                	case 1 :
                	    // InternalSuite.g:2582:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,22,FollowSets000.FOLLOW_31); if (state.failed) return ;
                	    // InternalSuite.g:2583:1: ( ( ruleJvmFormalParameter ) )
                	    // InternalSuite.g:2584:1: ( ruleJvmFormalParameter )
                	    {
                	    // InternalSuite.g:2584:1: ( ruleJvmFormalParameter )
                	    // InternalSuite.g:2585:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FollowSets000.FOLLOW_52);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop134;
                    }
                } while (true);


                }
                break;

        }

        // InternalSuite.g:2587:6: ( ( '|' ) )
        // InternalSuite.g:2588:1: ( '|' )
        {
        // InternalSuite.g:2588:1: ( '|' )
        // InternalSuite.g:2589:2: '|'
        {
        match(input,62,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred24_InternalSuite

    // $ANTLR start synpred25_InternalSuite
    public final void synpred25_InternalSuite_fragment() throws RecognitionException {   
        // InternalSuite.g:2656:4: ( ( () '[' ) )
        // InternalSuite.g:2656:5: ( () '[' )
        {
        // InternalSuite.g:2656:5: ( () '[' )
        // InternalSuite.g:2656:6: () '['
        {
        // InternalSuite.g:2656:6: ()
        // InternalSuite.g:2657:1: 
        {
        }

        match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred25_InternalSuite

    // $ANTLR start synpred26_InternalSuite
    public final void synpred26_InternalSuite_fragment() throws RecognitionException {   
        // InternalSuite.g:2727:7: ( ( () 'synchronized' '(' ) )
        // InternalSuite.g:2727:8: ( () 'synchronized' '(' )
        {
        // InternalSuite.g:2727:8: ( () 'synchronized' '(' )
        // InternalSuite.g:2727:9: () 'synchronized' '('
        {
        // InternalSuite.g:2727:9: ()
        // InternalSuite.g:2728:1: 
        {
        }

        match(input,88,FollowSets000.FOLLOW_57); if (state.failed) return ;
        match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalSuite

    // $ANTLR start synpred27_InternalSuite
    public final void synpred27_InternalSuite_fragment() throws RecognitionException {   
        // InternalSuite.g:2770:7: ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )
        // InternalSuite.g:2770:8: ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' )
        {
        // InternalSuite.g:2770:8: ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' )
        // InternalSuite.g:2770:9: () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':'
        {
        // InternalSuite.g:2770:9: ()
        // InternalSuite.g:2771:1: 
        {
        }

        match(input,69,FollowSets000.FOLLOW_57); if (state.failed) return ;
        match(input,21,FollowSets000.FOLLOW_31); if (state.failed) return ;
        // InternalSuite.g:2773:1: ( ( ruleJvmFormalParameter ) )
        // InternalSuite.g:2774:1: ( ruleJvmFormalParameter )
        {
        // InternalSuite.g:2774:1: ( ruleJvmFormalParameter )
        // InternalSuite.g:2775:1: ruleJvmFormalParameter
        {
        pushFollow(FollowSets000.FOLLOW_60);
        ruleJvmFormalParameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,66,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred27_InternalSuite

    // $ANTLR start synpred28_InternalSuite
    public final void synpred28_InternalSuite_fragment() throws RecognitionException {   
        // InternalSuite.g:2888:7: ( ( () '[' ) )
        // InternalSuite.g:2888:8: ( () '[' )
        {
        // InternalSuite.g:2888:8: ( () '[' )
        // InternalSuite.g:2888:9: () '['
        {
        // InternalSuite.g:2888:9: ()
        // InternalSuite.g:2889:1: 
        {
        }

        match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred28_InternalSuite

    // $ANTLR start synpred30_InternalSuite
    public final void synpred30_InternalSuite_fragment() throws RecognitionException {   
        // InternalSuite.g:3180:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // InternalSuite.g:3180:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // InternalSuite.g:3180:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // InternalSuite.g:3180:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // InternalSuite.g:3180:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt137=2;
        int LA137_0 = input.LA(1);

        if ( (LA137_0==RULE_ID||LA137_0==21||LA137_0==46) ) {
            alt137=1;
        }
        switch (alt137) {
            case 1 :
                // InternalSuite.g:3180:7: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // InternalSuite.g:3180:7: ( ( ruleJvmFormalParameter ) )
                // InternalSuite.g:3181:1: ( ruleJvmFormalParameter )
                {
                // InternalSuite.g:3181:1: ( ruleJvmFormalParameter )
                // InternalSuite.g:3182:1: ruleJvmFormalParameter
                {
                pushFollow(FollowSets000.FOLLOW_52);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // InternalSuite.g:3184:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop136:
                do {
                    int alt136=2;
                    int LA136_0 = input.LA(1);

                    if ( (LA136_0==22) ) {
                        alt136=1;
                    }


                    switch (alt136) {
                	case 1 :
                	    // InternalSuite.g:3184:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,22,FollowSets000.FOLLOW_31); if (state.failed) return ;
                	    // InternalSuite.g:3185:1: ( ( ruleJvmFormalParameter ) )
                	    // InternalSuite.g:3186:1: ( ruleJvmFormalParameter )
                	    {
                	    // InternalSuite.g:3186:1: ( ruleJvmFormalParameter )
                	    // InternalSuite.g:3187:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FollowSets000.FOLLOW_52);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop136;
                    }
                } while (true);


                }
                break;

        }

        // InternalSuite.g:3189:6: ( ( '|' ) )
        // InternalSuite.g:3190:1: ( '|' )
        {
        // InternalSuite.g:3190:1: ( '|' )
        // InternalSuite.g:3191:2: '|'
        {
        match(input,62,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred30_InternalSuite

    // $ANTLR start synpred32_InternalSuite
    public final void synpred32_InternalSuite_fragment() throws RecognitionException {   
        // InternalSuite.g:3550:4: ( 'else' )
        // InternalSuite.g:3550:6: 'else'
        {
        match(input,64,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_InternalSuite

    // $ANTLR start synpred33_InternalSuite
    public final void synpred33_InternalSuite_fragment() throws RecognitionException {   
        // InternalSuite.g:3604:4: ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )
        // InternalSuite.g:3604:5: ( '(' ( ( ruleJvmFormalParameter ) ) ':' )
        {
        // InternalSuite.g:3604:5: ( '(' ( ( ruleJvmFormalParameter ) ) ':' )
        // InternalSuite.g:3604:7: '(' ( ( ruleJvmFormalParameter ) ) ':'
        {
        match(input,21,FollowSets000.FOLLOW_31); if (state.failed) return ;
        // InternalSuite.g:3605:1: ( ( ruleJvmFormalParameter ) )
        // InternalSuite.g:3606:1: ( ruleJvmFormalParameter )
        {
        // InternalSuite.g:3606:1: ( ruleJvmFormalParameter )
        // InternalSuite.g:3607:1: ruleJvmFormalParameter
        {
        pushFollow(FollowSets000.FOLLOW_60);
        ruleJvmFormalParameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,66,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred33_InternalSuite

    // $ANTLR start synpred34_InternalSuite
    public final void synpred34_InternalSuite_fragment() throws RecognitionException {   
        // InternalSuite.g:3659:8: ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )
        // InternalSuite.g:3659:9: ( ( ( ruleJvmFormalParameter ) ) ':' )
        {
        // InternalSuite.g:3659:9: ( ( ( ruleJvmFormalParameter ) ) ':' )
        // InternalSuite.g:3659:10: ( ( ruleJvmFormalParameter ) ) ':'
        {
        // InternalSuite.g:3659:10: ( ( ruleJvmFormalParameter ) )
        // InternalSuite.g:3660:1: ( ruleJvmFormalParameter )
        {
        // InternalSuite.g:3660:1: ( ruleJvmFormalParameter )
        // InternalSuite.g:3661:1: ruleJvmFormalParameter
        {
        pushFollow(FollowSets000.FOLLOW_60);
        ruleJvmFormalParameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,66,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred34_InternalSuite

    // $ANTLR start synpred36_InternalSuite
    public final void synpred36_InternalSuite_fragment() throws RecognitionException {   
        // InternalSuite.g:4427:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // InternalSuite.g:4427:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // InternalSuite.g:4427:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // InternalSuite.g:4427:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // InternalSuite.g:4427:6: ( ( ruleJvmTypeReference ) )
        // InternalSuite.g:4428:1: ( ruleJvmTypeReference )
        {
        // InternalSuite.g:4428:1: ( ruleJvmTypeReference )
        // InternalSuite.g:4429:1: ruleJvmTypeReference
        {
        pushFollow(FollowSets000.FOLLOW_3);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalSuite.g:4431:2: ( ( ruleValidID ) )
        // InternalSuite.g:4432:1: ( ruleValidID )
        {
        // InternalSuite.g:4432:1: ( ruleValidID )
        // InternalSuite.g:4433:1: ruleValidID
        {
        pushFollow(FollowSets000.FOLLOW_2);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred36_InternalSuite

    // $ANTLR start synpred37_InternalSuite
    public final void synpred37_InternalSuite_fragment() throws RecognitionException {   
        // InternalSuite.g:4716:4: ( ( '(' ) )
        // InternalSuite.g:4717:1: ( '(' )
        {
        // InternalSuite.g:4717:1: ( '(' )
        // InternalSuite.g:4718:2: '('
        {
        match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred37_InternalSuite

    // $ANTLR start synpred38_InternalSuite
    public final void synpred38_InternalSuite_fragment() throws RecognitionException {   
        // InternalSuite.g:4737:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // InternalSuite.g:4737:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // InternalSuite.g:4737:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // InternalSuite.g:4737:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // InternalSuite.g:4737:6: ()
        // InternalSuite.g:4738:1: 
        {
        }

        // InternalSuite.g:4738:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt141=2;
        int LA141_0 = input.LA(1);

        if ( (LA141_0==RULE_ID||LA141_0==21||LA141_0==46) ) {
            alt141=1;
        }
        switch (alt141) {
            case 1 :
                // InternalSuite.g:4738:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // InternalSuite.g:4738:3: ( ( ruleJvmFormalParameter ) )
                // InternalSuite.g:4739:1: ( ruleJvmFormalParameter )
                {
                // InternalSuite.g:4739:1: ( ruleJvmFormalParameter )
                // InternalSuite.g:4740:1: ruleJvmFormalParameter
                {
                pushFollow(FollowSets000.FOLLOW_52);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // InternalSuite.g:4742:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop140:
                do {
                    int alt140=2;
                    int LA140_0 = input.LA(1);

                    if ( (LA140_0==22) ) {
                        alt140=1;
                    }


                    switch (alt140) {
                	case 1 :
                	    // InternalSuite.g:4742:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,22,FollowSets000.FOLLOW_31); if (state.failed) return ;
                	    // InternalSuite.g:4743:1: ( ( ruleJvmFormalParameter ) )
                	    // InternalSuite.g:4744:1: ( ruleJvmFormalParameter )
                	    {
                	    // InternalSuite.g:4744:1: ( ruleJvmFormalParameter )
                	    // InternalSuite.g:4745:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FollowSets000.FOLLOW_52);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop140;
                    }
                } while (true);


                }
                break;

        }

        // InternalSuite.g:4747:6: ( ( '|' ) )
        // InternalSuite.g:4748:1: ( '|' )
        {
        // InternalSuite.g:4748:1: ( '|' )
        // InternalSuite.g:4749:2: '|'
        {
        match(input,62,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred38_InternalSuite

    // $ANTLR start synpred39_InternalSuite
    public final void synpred39_InternalSuite_fragment() throws RecognitionException {   
        // InternalSuite.g:4816:4: ( ( () '[' ) )
        // InternalSuite.g:4816:5: ( () '[' )
        {
        // InternalSuite.g:4816:5: ( () '[' )
        // InternalSuite.g:4816:6: () '['
        {
        // InternalSuite.g:4816:6: ()
        // InternalSuite.g:4817:1: 
        {
        }

        match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred39_InternalSuite

    // $ANTLR start synpred40_InternalSuite
    public final void synpred40_InternalSuite_fragment() throws RecognitionException {   
        // InternalSuite.g:4981:4: ( '<' )
        // InternalSuite.g:4981:6: '<'
        {
        match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_InternalSuite

    // $ANTLR start synpred41_InternalSuite
    public final void synpred41_InternalSuite_fragment() throws RecognitionException {   
        // InternalSuite.g:5030:5: ( ( '(' ) )
        // InternalSuite.g:5031:1: ( '(' )
        {
        // InternalSuite.g:5031:1: ( '(' )
        // InternalSuite.g:5032:2: '('
        {
        match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred41_InternalSuite

    // $ANTLR start synpred42_InternalSuite
    public final void synpred42_InternalSuite_fragment() throws RecognitionException {   
        // InternalSuite.g:5051:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // InternalSuite.g:5051:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // InternalSuite.g:5051:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // InternalSuite.g:5051:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // InternalSuite.g:5051:6: ()
        // InternalSuite.g:5052:1: 
        {
        }

        // InternalSuite.g:5052:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt143=2;
        int LA143_0 = input.LA(1);

        if ( (LA143_0==RULE_ID||LA143_0==21||LA143_0==46) ) {
            alt143=1;
        }
        switch (alt143) {
            case 1 :
                // InternalSuite.g:5052:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // InternalSuite.g:5052:3: ( ( ruleJvmFormalParameter ) )
                // InternalSuite.g:5053:1: ( ruleJvmFormalParameter )
                {
                // InternalSuite.g:5053:1: ( ruleJvmFormalParameter )
                // InternalSuite.g:5054:1: ruleJvmFormalParameter
                {
                pushFollow(FollowSets000.FOLLOW_52);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // InternalSuite.g:5056:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop142:
                do {
                    int alt142=2;
                    int LA142_0 = input.LA(1);

                    if ( (LA142_0==22) ) {
                        alt142=1;
                    }


                    switch (alt142) {
                	case 1 :
                	    // InternalSuite.g:5056:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,22,FollowSets000.FOLLOW_31); if (state.failed) return ;
                	    // InternalSuite.g:5057:1: ( ( ruleJvmFormalParameter ) )
                	    // InternalSuite.g:5058:1: ( ruleJvmFormalParameter )
                	    {
                	    // InternalSuite.g:5058:1: ( ruleJvmFormalParameter )
                	    // InternalSuite.g:5059:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FollowSets000.FOLLOW_52);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop142;
                    }
                } while (true);


                }
                break;

        }

        // InternalSuite.g:5061:6: ( ( '|' ) )
        // InternalSuite.g:5062:1: ( '|' )
        {
        // InternalSuite.g:5062:1: ( '|' )
        // InternalSuite.g:5063:2: '|'
        {
        match(input,62,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred42_InternalSuite

    // $ANTLR start synpred43_InternalSuite
    public final void synpred43_InternalSuite_fragment() throws RecognitionException {   
        // InternalSuite.g:5130:4: ( ( () '[' ) )
        // InternalSuite.g:5130:5: ( () '[' )
        {
        // InternalSuite.g:5130:5: ( () '[' )
        // InternalSuite.g:5130:6: () '['
        {
        // InternalSuite.g:5130:6: ()
        // InternalSuite.g:5131:1: 
        {
        }

        match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred43_InternalSuite

    // $ANTLR start synpred44_InternalSuite
    public final void synpred44_InternalSuite_fragment() throws RecognitionException {   
        // InternalSuite.g:5470:2: ( 'extends' | 'static' | 'import' | 'extension' | '!' | '-' | '+' | 'new' | '{' | 'switch' | 'synchronized' | '<' | 'super' | '#' | '[' | 'false' | 'true' | 'null' | 'typeof' | 'if' | 'for' | 'while' | 'do' | 'throw' | 'return' | 'try' | '(' | RULE_ID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING )
        // InternalSuite.g:
        {
        if ( input.LA(1)==RULE_STRING||(input.LA(1)>=RULE_HEX && input.LA(1)<=RULE_ID)||input.LA(1)==18||input.LA(1)==21||(input.LA(1)>=25 && input.LA(1)<=26)||input.LA(1)==33||input.LA(1)==49||input.LA(1)==54||input.LA(1)==60||input.LA(1)==63||input.LA(1)==65||(input.LA(1)>=69 && input.LA(1)<=71)||(input.LA(1)>=74 && input.LA(1)<=86)||input.LA(1)==88 ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred44_InternalSuite

    // $ANTLR start synpred45_InternalSuite
    public final void synpred45_InternalSuite_fragment() throws RecognitionException {   
        // InternalSuite.g:5564:5: ( 'catch' )
        // InternalSuite.g:5564:7: 'catch'
        {
        match(input,89,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred45_InternalSuite

    // $ANTLR start synpred46_InternalSuite
    public final void synpred46_InternalSuite_fragment() throws RecognitionException {   
        // InternalSuite.g:5583:5: ( 'finally' )
        // InternalSuite.g:5583:7: 'finally'
        {
        match(input,87,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_InternalSuite

    // $ANTLR start synpred49_InternalSuite
    public final void synpred49_InternalSuite_fragment() throws RecognitionException {   
        // InternalSuite.g:5882:2: ( ( () ruleArrayBrackets ) )
        // InternalSuite.g:5882:3: ( () ruleArrayBrackets )
        {
        // InternalSuite.g:5882:3: ( () ruleArrayBrackets )
        // InternalSuite.g:5882:4: () ruleArrayBrackets
        {
        // InternalSuite.g:5882:4: ()
        // InternalSuite.g:5883:1: 
        {
        }

        pushFollow(FollowSets000.FOLLOW_2);
        ruleArrayBrackets();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred49_InternalSuite

    // $ANTLR start synpred50_InternalSuite
    public final void synpred50_InternalSuite_fragment() throws RecognitionException {   
        // InternalSuite.g:6067:4: ( '<' )
        // InternalSuite.g:6067:6: '<'
        {
        match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_InternalSuite

    // $ANTLR start synpred51_InternalSuite
    public final void synpred51_InternalSuite_fragment() throws RecognitionException {   
        // InternalSuite.g:6116:3: ( ( () '.' ) )
        // InternalSuite.g:6116:4: ( () '.' )
        {
        // InternalSuite.g:6116:4: ( () '.' )
        // InternalSuite.g:6116:5: () '.'
        {
        // InternalSuite.g:6116:5: ()
        // InternalSuite.g:6117:1: 
        {
        }

        match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred51_InternalSuite

    // $ANTLR start synpred52_InternalSuite
    public final void synpred52_InternalSuite_fragment() throws RecognitionException {   
        // InternalSuite.g:6143:4: ( '<' )
        // InternalSuite.g:6143:6: '<'
        {
        match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_InternalSuite

    // Delegated rules

    public final boolean synpred36_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred43_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred46_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred50_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred51_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred45_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred44_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred42_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalSuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalSuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA92 dfa92 = new DFA92(this);
    protected DFA91 dfa91 = new DFA91(this);
    protected DFA93 dfa93 = new DFA93(this);
    protected DFA97 dfa97 = new DFA97(this);
    protected DFA100 dfa100 = new DFA100(this);
    protected DFA99 dfa99 = new DFA99(this);
    protected DFA101 dfa101 = new DFA101(this);
    protected DFA104 dfa104 = new DFA104(this);
    protected DFA121 dfa121 = new DFA121(this);
    protected DFA119 dfa119 = new DFA119(this);
    protected DFA129 dfa129 = new DFA129(this);
    static final String dfa_1s = "\44\uffff";
    static final String dfa_2s = "\1\6\1\0\42\uffff";
    static final String dfa_3s = "\1\130\1\0\42\uffff";
    static final String dfa_4s = "\2\uffff\1\2\37\uffff\1\3\1\1";
    static final String dfa_5s = "\1\uffff\1\0\42\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\uffff\3\2\1\1\6\uffff\1\2\1\uffff\2\2\1\uffff\1\42\1\uffff\2\2\6\uffff\1\2\17\uffff\1\2\4\uffff\1\2\5\uffff\1\2\2\uffff\1\2\1\uffff\1\2\3\uffff\3\2\2\uffff\15\2\1\uffff\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "474:2: ( ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleXAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleXAnnotationElementValuePair ) ) )* ) | ( (lv_value_7_0= ruleXAnnotationElementValueOrCommaList ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_1 = input.LA(1);

                         
                        int index11_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalSuite()) ) {s = 35;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index11_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\43\uffff";
    static final String dfa_8s = "\1\6\1\0\41\uffff";
    static final String dfa_9s = "\1\130\1\0\41\uffff";
    static final String dfa_10s = "\2\uffff\1\2\37\uffff\1\1";
    static final String dfa_11s = "\1\uffff\1\0\41\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\1\uffff\4\2\6\uffff\1\2\1\uffff\2\2\3\uffff\1\1\1\2\6\uffff\1\2\17\uffff\1\2\4\uffff\1\2\5\uffff\1\2\2\uffff\1\2\1\uffff\1\2\3\uffff\3\2\2\uffff\15\2\1\uffff\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "631:1: ( ( ( ( ( () '#' '[' ) )=> ( () otherlv_1= '#' otherlv_2= '[' ) ) ( ( (lv_elements_3_0= ruleXAnnotationOrExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXAnnotationOrExpression ) ) )* )? otherlv_6= ']' ) | (this_XAnnotationOrExpression_7= ruleXAnnotationOrExpression ( () (otherlv_9= ',' ( (lv_elements_10_0= ruleXAnnotationOrExpression ) ) )+ )? ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_1 = input.LA(1);

                         
                        int index17_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalSuite()) ) {s = 34;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index17_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "751:1: ( ( ( ( ( () '#' '[' ) )=> ( () otherlv_1= '#' otherlv_2= '[' ) ) ( ( (lv_elements_3_0= ruleXAnnotationOrExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXAnnotationOrExpression ) ) )* )? otherlv_6= ']' ) | this_XAnnotationOrExpression_7= ruleXAnnotationOrExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_1 = input.LA(1);

                         
                        int index20_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalSuite()) ) {s = 34;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index20_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_13s = "\12\uffff";
    static final String dfa_14s = "\1\10\11\uffff";
    static final String dfa_15s = "\1\6\7\0\2\uffff";
    static final String dfa_16s = "\1\131\7\0\2\uffff";
    static final String dfa_17s = "\10\uffff\1\2\1\1";
    static final String dfa_18s = "\1\uffff\1\4\1\5\1\6\1\2\1\3\1\1\1\0\2\uffff}>";
    static final String[] dfa_19s = {
            "\1\10\1\uffff\4\10\5\uffff\3\10\1\uffff\3\10\1\uffff\3\10\1\1\1\2\1\3\1\4\1\5\1\6\1\7\33\10\1\uffff\33\10",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_13;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "970:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_7 = input.LA(1);

                         
                        int index22_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalSuite()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index22_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_6 = input.LA(1);

                         
                        int index22_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalSuite()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index22_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_4 = input.LA(1);

                         
                        int index22_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalSuite()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index22_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA22_5 = input.LA(1);

                         
                        int index22_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalSuite()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index22_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA22_1 = input.LA(1);

                         
                        int index22_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalSuite()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index22_1);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA22_2 = input.LA(1);

                         
                        int index22_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalSuite()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index22_2);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA22_3 = input.LA(1);

                         
                        int index22_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalSuite()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index22_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_20s = "\13\uffff";
    static final String dfa_21s = "\1\1\12\uffff";
    static final String dfa_22s = "\1\6\1\uffff\10\0\1\uffff";
    static final String dfa_23s = "\1\131\1\uffff\10\0\1\uffff";
    static final String dfa_24s = "\1\uffff\1\2\10\uffff\1\1";
    static final String dfa_25s = "\2\uffff\1\0\1\3\1\6\1\4\1\5\1\7\1\1\1\2\1\uffff}>";
    static final String[] dfa_26s = {
            "\1\1\1\uffff\4\1\5\uffff\3\1\1\uffff\3\1\1\uffff\10\1\1\2\1\3\10\1\1\4\1\5\1\6\1\7\1\10\1\11\15\1\1\uffff\33\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "()* loopback of 1647:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_2 = input.LA(1);

                         
                        int index32_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSuite()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index32_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA32_8 = input.LA(1);

                         
                        int index32_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSuite()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index32_8);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA32_9 = input.LA(1);

                         
                        int index32_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSuite()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index32_9);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA32_3 = input.LA(1);

                         
                        int index32_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSuite()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index32_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA32_5 = input.LA(1);

                         
                        int index32_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSuite()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index32_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA32_6 = input.LA(1);

                         
                        int index32_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSuite()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index32_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA32_4 = input.LA(1);

                         
                        int index32_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSuite()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index32_4);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA32_7 = input.LA(1);

                         
                        int index32_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSuite()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index32_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_27s = "\1\41\2\uffff\1\42\7\uffff";
    static final String dfa_28s = "\1\60\2\uffff\1\55\7\uffff";
    static final String dfa_29s = "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\7\1\10\1\11\1\3\1\6";
    static final String dfa_30s = "\13\uffff}>";
    static final String[] dfa_31s = {
            "\1\6\1\3\10\uffff\1\1\1\2\1\4\1\5\1\7\1\10",
            "",
            "",
            "\1\12\12\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[][] dfa_31 = unpackEncodedStringArray(dfa_31s);

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_27;
            this.max = dfa_28;
            this.accept = dfa_29;
            this.special = dfa_30;
            this.transition = dfa_31;
        }
        public String getDescription() {
            return "1712:1: (kw= '->' | kw= '..<' | (kw= '>' kw= '..' ) | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' | kw= '=>' ) ) | kw= '<>' | kw= '?:' )";
        }
    }
    static final String dfa_32s = "\116\uffff";
    static final String dfa_33s = "\1\2\115\uffff";
    static final String dfa_34s = "\1\6\1\0\114\uffff";
    static final String dfa_35s = "\1\131\1\0\114\uffff";
    static final String dfa_36s = "\2\uffff\1\2\112\uffff\1\1";
    static final String dfa_37s = "\1\uffff\1\0\114\uffff}>";
    static final String[] dfa_38s = {
            "\1\2\1\uffff\4\2\5\uffff\3\2\1\uffff\1\1\2\2\1\uffff\45\2\1\uffff\33\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final char[] dfa_35 = DFA.unpackEncodedStringToUnsignedChars(dfa_35s);
    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final short[][] dfa_38 = unpackEncodedStringArray(dfa_38s);

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = dfa_32;
            this.eof = dfa_33;
            this.min = dfa_34;
            this.max = dfa_35;
            this.accept = dfa_36;
            this.special = dfa_37;
            this.transition = dfa_38;
        }
        public String getDescription() {
            return "2556:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA51_1 = input.LA(1);

                         
                        int index51_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalSuite()) ) {s = 77;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index51_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 51, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_39s = "\1\6\2\0\41\uffff";
    static final String dfa_40s = "\1\130\2\0\41\uffff";
    static final String dfa_41s = "\3\uffff\2\1\1\2\35\uffff\1\3";
    static final String dfa_42s = "\1\0\1\1\1\2\41\uffff}>";
    static final String[] dfa_43s = {
            "\1\5\1\uffff\3\5\1\1\6\uffff\1\5\2\uffff\1\2\1\uffff\1\43\1\uffff\2\5\6\uffff\1\5\14\uffff\1\3\2\uffff\1\5\4\uffff\1\5\5\uffff\1\5\1\uffff\1\4\1\5\1\uffff\1\5\3\uffff\3\5\2\uffff\15\5\1\uffff\1\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final char[] dfa_39 = DFA.unpackEncodedStringToUnsignedChars(dfa_39s);
    static final char[] dfa_40 = DFA.unpackEncodedStringToUnsignedChars(dfa_40s);
    static final short[] dfa_41 = DFA.unpackEncodedString(dfa_41s);
    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final short[][] dfa_43 = unpackEncodedStringArray(dfa_43s);

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_39;
            this.max = dfa_40;
            this.accept = dfa_41;
            this.special = dfa_42;
            this.transition = dfa_43;
        }
        public String getDescription() {
            return "2577:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA50_0 = input.LA(1);

                         
                        int index50_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA50_0==RULE_ID) ) {s = 1;}

                        else if ( (LA50_0==21) ) {s = 2;}

                        else if ( (LA50_0==46) && (synpred24_InternalSuite())) {s = 3;}

                        else if ( (LA50_0==62) && (synpred24_InternalSuite())) {s = 4;}

                        else if ( (LA50_0==RULE_STRING||(LA50_0>=RULE_HEX && LA50_0<=RULE_DECIMAL)||LA50_0==18||(LA50_0>=25 && LA50_0<=26)||LA50_0==33||LA50_0==49||LA50_0==54||LA50_0==60||LA50_0==63||LA50_0==65||(LA50_0>=69 && LA50_0<=71)||(LA50_0>=74 && LA50_0<=86)||LA50_0==88) ) {s = 5;}

                        else if ( (LA50_0==23) ) {s = 35;}

                         
                        input.seek(index50_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA50_1 = input.LA(1);

                         
                        int index50_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalSuite()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index50_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA50_2 = input.LA(1);

                         
                        int index50_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalSuite()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index50_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 50, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String[] dfa_44s = {
            "\1\2\1\uffff\4\2\5\uffff\3\2\1\uffff\3\2\1\uffff\1\2\1\1\43\2\1\uffff\33\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[][] dfa_44 = unpackEncodedStringArray(dfa_44s);

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = dfa_32;
            this.eof = dfa_33;
            this.min = dfa_34;
            this.max = dfa_35;
            this.accept = dfa_36;
            this.special = dfa_37;
            this.transition = dfa_44;
        }
        public String getDescription() {
            return "2656:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA52_1 = input.LA(1);

                         
                        int index52_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalSuite()) ) {s = 77;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index52_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 52, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_45s = "\40\uffff";
    static final String dfa_46s = "\1\6\26\uffff\1\0\10\uffff";
    static final String dfa_47s = "\1\130\26\uffff\1\0\10\uffff";
    static final String dfa_48s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\6\uffff\1\6\11\uffff\1\7\1\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\10\1\11";
    static final String dfa_49s = "\1\0\26\uffff\1\1\10\uffff}>";
    static final String[] dfa_50s = {
            "\1\14\1\uffff\3\14\1\5\11\uffff\1\35\3\uffff\2\14\6\uffff\1\5\32\uffff\1\2\2\uffff\1\26\1\uffff\1\3\3\uffff\1\27\1\30\1\31\2\uffff\5\5\1\1\4\14\1\32\1\33\1\34\1\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_45 = DFA.unpackEncodedString(dfa_45s);
    static final char[] dfa_46 = DFA.unpackEncodedStringToUnsignedChars(dfa_46s);
    static final char[] dfa_47 = DFA.unpackEncodedStringToUnsignedChars(dfa_47s);
    static final short[] dfa_48 = DFA.unpackEncodedString(dfa_48s);
    static final short[] dfa_49 = DFA.unpackEncodedString(dfa_49s);
    static final short[][] dfa_50 = unpackEncodedStringArray(dfa_50s);

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = dfa_45;
            this.eof = dfa_45;
            this.min = dfa_46;
            this.max = dfa_47;
            this.accept = dfa_48;
            this.special = dfa_49;
            this.transition = dfa_50;
        }
        public String getDescription() {
            return "2697:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | ( ( ( () 'synchronized' '(' ) )=>this_XSynchronizedExpression_3= ruleXSynchronizedExpression ) | this_XFeatureCall_4= ruleXFeatureCall | this_XLiteral_5= ruleXLiteral | this_XIfExpression_6= ruleXIfExpression | ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=>this_XForLoopExpression_7= ruleXForLoopExpression ) | this_XBasicForLoopExpression_8= ruleXBasicForLoopExpression | this_XWhileExpression_9= ruleXWhileExpression | this_XDoWhileExpression_10= ruleXDoWhileExpression | this_XThrowExpression_11= ruleXThrowExpression | this_XReturnExpression_12= ruleXReturnExpression | this_XTryCatchFinallyExpression_13= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_14= ruleXParenthesizedExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA54_0 = input.LA(1);

                         
                        int index54_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA54_0==79) ) {s = 1;}

                        else if ( (LA54_0==60) ) {s = 2;}

                        else if ( (LA54_0==65) ) {s = 3;}

                        else if ( (LA54_0==88) && (synpred26_InternalSuite())) {s = 4;}

                        else if ( (LA54_0==RULE_ID||LA54_0==33||(LA54_0>=74 && LA54_0<=78)) ) {s = 5;}

                        else if ( (LA54_0==RULE_STRING||(LA54_0>=RULE_HEX && LA54_0<=RULE_DECIMAL)||(LA54_0>=25 && LA54_0<=26)||(LA54_0>=80 && LA54_0<=83)) ) {s = 12;}

                        else if ( (LA54_0==63) ) {s = 22;}

                        else if ( (LA54_0==69) ) {s = 23;}

                        else if ( (LA54_0==70) ) {s = 24;}

                        else if ( (LA54_0==71) ) {s = 25;}

                        else if ( (LA54_0==84) ) {s = 26;}

                        else if ( (LA54_0==85) ) {s = 27;}

                        else if ( (LA54_0==86) ) {s = 28;}

                        else if ( (LA54_0==21) ) {s = 29;}

                         
                        input.seek(index54_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA54_23 = input.LA(1);

                         
                        int index54_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalSuite()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index54_23);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 54, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_51s = "\46\uffff";
    static final String dfa_52s = "\1\6\2\0\43\uffff";
    static final String dfa_53s = "\1\130\2\0\43\uffff";
    static final String dfa_54s = "\3\uffff\2\1\1\2\40\uffff";
    static final String dfa_55s = "\1\0\1\1\1\2\43\uffff}>";
    static final String[] dfa_56s = {
            "\1\5\1\uffff\3\5\1\1\6\uffff\1\5\2\uffff\1\2\3\uffff\3\5\5\uffff\1\5\14\uffff\1\3\2\uffff\1\5\4\uffff\1\5\5\uffff\1\5\1\uffff\1\4\1\5\1\uffff\1\5\3\uffff\22\5\1\uffff\1\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_51 = DFA.unpackEncodedString(dfa_51s);
    static final char[] dfa_52 = DFA.unpackEncodedStringToUnsignedChars(dfa_52s);
    static final char[] dfa_53 = DFA.unpackEncodedStringToUnsignedChars(dfa_53s);
    static final short[] dfa_54 = DFA.unpackEncodedString(dfa_54s);
    static final short[] dfa_55 = DFA.unpackEncodedString(dfa_55s);
    static final short[][] dfa_56 = unpackEncodedStringArray(dfa_56s);

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = dfa_51;
            this.eof = dfa_51;
            this.min = dfa_52;
            this.max = dfa_53;
            this.accept = dfa_54;
            this.special = dfa_55;
            this.transition = dfa_56;
        }
        public String getDescription() {
            return "3180:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA63_0 = input.LA(1);

                         
                        int index63_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA63_0==RULE_ID) ) {s = 1;}

                        else if ( (LA63_0==21) ) {s = 2;}

                        else if ( (LA63_0==46) && (synpred30_InternalSuite())) {s = 3;}

                        else if ( (LA63_0==62) && (synpred30_InternalSuite())) {s = 4;}

                        else if ( (LA63_0==RULE_STRING||(LA63_0>=RULE_HEX && LA63_0<=RULE_DECIMAL)||LA63_0==18||(LA63_0>=25 && LA63_0<=27)||LA63_0==33||LA63_0==49||LA63_0==54||LA63_0==60||LA63_0==63||LA63_0==65||(LA63_0>=69 && LA63_0<=86)||LA63_0==88) ) {s = 5;}

                         
                        input.seek(index63_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA63_1 = input.LA(1);

                         
                        int index63_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalSuite()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index63_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA63_2 = input.LA(1);

                         
                        int index63_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalSuite()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index63_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 63, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String[] dfa_57s = {
            "\1\2\1\uffff\4\2\6\uffff\1\2\2\uffff\1\1\3\uffff\2\2\6\uffff\1\2\14\uffff\1\2\2\uffff\1\2\4\uffff\1\2\5\uffff\1\2\2\uffff\1\2\1\uffff\1\2\3\uffff\3\2\2\uffff\15\2\1\uffff\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[][] dfa_57 = unpackEncodedStringArray(dfa_57s);

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_57;
        }
        public String getDescription() {
            return "3604:1: ( ( ( ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_switch_5_0= ruleXExpression ) ) otherlv_6= ')' ) | ( ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )? ( (lv_switch_9_0= ruleXExpression ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA70_1 = input.LA(1);

                         
                        int index70_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSuite()) ) {s = 34;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index70_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 70, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_58s = "\42\uffff";
    static final String dfa_59s = "\1\6\2\0\37\uffff";
    static final String dfa_60s = "\1\130\2\0\37\uffff";
    static final String dfa_61s = "\3\uffff\1\1\1\2\35\uffff";
    static final String dfa_62s = "\1\0\1\1\1\2\37\uffff}>";
    static final String[] dfa_63s = {
            "\1\4\1\uffff\3\4\1\1\6\uffff\1\4\2\uffff\1\2\3\uffff\2\4\6\uffff\1\4\14\uffff\1\3\2\uffff\1\4\4\uffff\1\4\5\uffff\1\4\2\uffff\1\4\1\uffff\1\4\3\uffff\3\4\2\uffff\15\4\1\uffff\1\4",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_58 = DFA.unpackEncodedString(dfa_58s);
    static final char[] dfa_59 = DFA.unpackEncodedStringToUnsignedChars(dfa_59s);
    static final char[] dfa_60 = DFA.unpackEncodedStringToUnsignedChars(dfa_60s);
    static final short[] dfa_61 = DFA.unpackEncodedString(dfa_61s);
    static final short[] dfa_62 = DFA.unpackEncodedString(dfa_62s);
    static final short[][] dfa_63 = unpackEncodedStringArray(dfa_63s);

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = dfa_58;
            this.eof = dfa_58;
            this.min = dfa_59;
            this.max = dfa_60;
            this.accept = dfa_61;
            this.special = dfa_62;
            this.transition = dfa_63;
        }
        public String getDescription() {
            return "3659:7: ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA69_0 = input.LA(1);

                         
                        int index69_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA69_0==RULE_ID) ) {s = 1;}

                        else if ( (LA69_0==21) ) {s = 2;}

                        else if ( (LA69_0==46) && (synpred34_InternalSuite())) {s = 3;}

                        else if ( (LA69_0==RULE_STRING||(LA69_0>=RULE_HEX && LA69_0<=RULE_DECIMAL)||LA69_0==18||(LA69_0>=25 && LA69_0<=26)||LA69_0==33||LA69_0==49||LA69_0==54||LA69_0==60||LA69_0==63||LA69_0==65||(LA69_0>=69 && LA69_0<=71)||(LA69_0>=74 && LA69_0<=86)||LA69_0==88) ) {s = 4;}

                         
                        input.seek(index69_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA69_1 = input.LA(1);

                         
                        int index69_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSuite()) ) {s = 3;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index69_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA69_2 = input.LA(1);

                         
                        int index69_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSuite()) ) {s = 3;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index69_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 69, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA92 extends DFA {

        public DFA92(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 92;
            this.eot = dfa_32;
            this.eof = dfa_33;
            this.min = dfa_34;
            this.max = dfa_35;
            this.accept = dfa_36;
            this.special = dfa_37;
            this.transition = dfa_38;
        }
        public String getDescription() {
            return "4716:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA92_1 = input.LA(1);

                         
                        int index92_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalSuite()) ) {s = 77;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index92_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 92, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA91 extends DFA {

        public DFA91(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 91;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_39;
            this.max = dfa_40;
            this.accept = dfa_41;
            this.special = dfa_42;
            this.transition = dfa_43;
        }
        public String getDescription() {
            return "4737:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA91_0 = input.LA(1);

                         
                        int index91_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA91_0==RULE_ID) ) {s = 1;}

                        else if ( (LA91_0==21) ) {s = 2;}

                        else if ( (LA91_0==46) && (synpred38_InternalSuite())) {s = 3;}

                        else if ( (LA91_0==62) && (synpred38_InternalSuite())) {s = 4;}

                        else if ( (LA91_0==RULE_STRING||(LA91_0>=RULE_HEX && LA91_0<=RULE_DECIMAL)||LA91_0==18||(LA91_0>=25 && LA91_0<=26)||LA91_0==33||LA91_0==49||LA91_0==54||LA91_0==60||LA91_0==63||LA91_0==65||(LA91_0>=69 && LA91_0<=71)||(LA91_0>=74 && LA91_0<=86)||LA91_0==88) ) {s = 5;}

                        else if ( (LA91_0==23) ) {s = 35;}

                         
                        input.seek(index91_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA91_1 = input.LA(1);

                         
                        int index91_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalSuite()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index91_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA91_2 = input.LA(1);

                         
                        int index91_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalSuite()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index91_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 91, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA93 extends DFA {

        public DFA93(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 93;
            this.eot = dfa_32;
            this.eof = dfa_33;
            this.min = dfa_34;
            this.max = dfa_35;
            this.accept = dfa_36;
            this.special = dfa_37;
            this.transition = dfa_44;
        }
        public String getDescription() {
            return "4816:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA93_1 = input.LA(1);

                         
                        int index93_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalSuite()) ) {s = 77;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index93_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 93, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String[] dfa_64s = {
            "\1\2\1\uffff\4\2\5\uffff\3\2\1\uffff\3\2\1\uffff\10\2\1\1\34\2\1\uffff\33\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[][] dfa_64 = unpackEncodedStringArray(dfa_64s);

    class DFA97 extends DFA {

        public DFA97(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 97;
            this.eot = dfa_32;
            this.eof = dfa_33;
            this.min = dfa_34;
            this.max = dfa_35;
            this.accept = dfa_36;
            this.special = dfa_37;
            this.transition = dfa_64;
        }
        public String getDescription() {
            return "4981:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA97_1 = input.LA(1);

                         
                        int index97_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalSuite()) ) {s = 77;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index97_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 97, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA100 extends DFA {

        public DFA100(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 100;
            this.eot = dfa_32;
            this.eof = dfa_33;
            this.min = dfa_34;
            this.max = dfa_35;
            this.accept = dfa_36;
            this.special = dfa_37;
            this.transition = dfa_38;
        }
        public String getDescription() {
            return "5030:3: ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA100_1 = input.LA(1);

                         
                        int index100_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalSuite()) ) {s = 77;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index100_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 100, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA99 extends DFA {

        public DFA99(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 99;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_39;
            this.max = dfa_40;
            this.accept = dfa_41;
            this.special = dfa_42;
            this.transition = dfa_43;
        }
        public String getDescription() {
            return "5051:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA99_0 = input.LA(1);

                         
                        int index99_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA99_0==RULE_ID) ) {s = 1;}

                        else if ( (LA99_0==21) ) {s = 2;}

                        else if ( (LA99_0==46) && (synpred42_InternalSuite())) {s = 3;}

                        else if ( (LA99_0==62) && (synpred42_InternalSuite())) {s = 4;}

                        else if ( (LA99_0==RULE_STRING||(LA99_0>=RULE_HEX && LA99_0<=RULE_DECIMAL)||LA99_0==18||(LA99_0>=25 && LA99_0<=26)||LA99_0==33||LA99_0==49||LA99_0==54||LA99_0==60||LA99_0==63||LA99_0==65||(LA99_0>=69 && LA99_0<=71)||(LA99_0>=74 && LA99_0<=86)||LA99_0==88) ) {s = 5;}

                        else if ( (LA99_0==23) ) {s = 35;}

                         
                        input.seek(index99_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA99_1 = input.LA(1);

                         
                        int index99_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalSuite()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index99_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA99_2 = input.LA(1);

                         
                        int index99_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalSuite()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index99_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 99, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA101 extends DFA {

        public DFA101(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 101;
            this.eot = dfa_32;
            this.eof = dfa_33;
            this.min = dfa_34;
            this.max = dfa_35;
            this.accept = dfa_36;
            this.special = dfa_37;
            this.transition = dfa_44;
        }
        public String getDescription() {
            return "5130:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA101_1 = input.LA(1);

                         
                        int index101_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalSuite()) ) {s = 77;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index101_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 101, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_65s = "\1\41\115\uffff";
    static final String dfa_66s = "\1\6\40\0\55\uffff";
    static final String dfa_67s = "\1\131\40\0\55\uffff";
    static final String dfa_68s = "\41\uffff\1\2\53\uffff\1\1";
    static final String dfa_69s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\55\uffff}>";
    static final String[] dfa_70s = {
            "\1\27\1\uffff\1\23\1\24\1\25\1\1\5\uffff\1\41\1\7\1\41\1\uffff\1\40\2\41\1\uffff\1\17\1\20\6\41\1\15\17\41\1\10\4\41\1\6\5\41\1\12\1\41\1\uffff\1\31\1\41\1\13\3\41\1\32\1\33\1\34\2\41\1\2\1\3\1\4\1\5\1\16\1\11\1\21\1\22\1\26\1\30\1\35\1\36\1\37\1\41\1\14\1\41",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[] dfa_65 = DFA.unpackEncodedString(dfa_65s);
    static final char[] dfa_66 = DFA.unpackEncodedStringToUnsignedChars(dfa_66s);
    static final char[] dfa_67 = DFA.unpackEncodedStringToUnsignedChars(dfa_67s);
    static final short[] dfa_68 = DFA.unpackEncodedString(dfa_68s);
    static final short[] dfa_69 = DFA.unpackEncodedString(dfa_69s);
    static final short[][] dfa_70 = unpackEncodedStringArray(dfa_70s);

    class DFA104 extends DFA {

        public DFA104(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 104;
            this.eot = dfa_32;
            this.eof = dfa_65;
            this.min = dfa_66;
            this.max = dfa_67;
            this.accept = dfa_68;
            this.special = dfa_69;
            this.transition = dfa_70;
        }
        public String getDescription() {
            return "5470:1: ( ( 'extends' | 'static' | 'import' | 'extension' | '!' | '-' | '+' | 'new' | '{' | 'switch' | 'synchronized' | '<' | 'super' | '#' | '[' | 'false' | 'true' | 'null' | 'typeof' | 'if' | 'for' | 'while' | 'do' | 'throw' | 'return' | 'try' | '(' | RULE_ID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA104_1 = input.LA(1);

                         
                        int index104_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalSuite()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index104_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA104_2 = input.LA(1);

                         
                        int index104_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalSuite()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index104_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA104_3 = input.LA(1);

                         
                        int index104_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalSuite()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index104_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA104_4 = input.LA(1);

                         
                        int index104_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalSuite()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index104_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA104_5 = input.LA(1);

                         
                        int index104_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalSuite()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index104_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA104_6 = input.LA(1);

                         
                        int index104_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalSuite()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index104_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA104_7 = input.LA(1);

                         
                        int index104_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalSuite()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index104_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA104_8 = input.LA(1);

                         
                        int index104_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalSuite()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index104_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA104_9 = input.LA(1);

                         
                        int index104_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalSuite()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index104_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA104_10 = input.LA(1);

                         
                        int index104_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalSuite()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index104_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA104_11 = input.LA(1);

                         
                        int index104_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalSuite()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index104_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA104_12 = input.LA(1);

                         
                        int index104_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalSuite()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index104_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA104_13 = input.LA(1);

                         
                        int index104_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalSuite()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index104_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA104_14 = input.LA(1);

                         
                        int index104_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalSuite()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index104_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA104_15 = input.LA(1);

                         
                        int index104_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalSuite()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index104_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA104_16 = input.LA(1);

                         
                        int index104_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalSuite()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index104_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA104_17 = input.LA(1);

                         
                        int index104_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalSuite()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index104_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA104_18 = input.LA(1);

                         
                        int index104_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalSuite()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index104_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA104_19 = input.LA(1);

                         
                        int index104_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalSuite()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index104_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA104_20 = input.LA(1);

                         
                        int index104_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalSuite()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index104_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA104_21 = input.LA(1);

                         
                        int index104_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalSuite()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index104_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA104_22 = input.LA(1);

                         
                        int index104_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalSuite()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index104_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA104_23 = input.LA(1);

                         
                        int index104_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalSuite()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index104_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA104_24 = input.LA(1);

                         
                        int index104_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalSuite()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index104_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA104_25 = input.LA(1);

                         
                        int index104_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalSuite()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index104_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA104_26 = input.LA(1);

                         
                        int index104_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalSuite()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index104_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA104_27 = input.LA(1);

                         
                        int index104_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalSuite()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index104_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA104_28 = input.LA(1);

                         
                        int index104_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalSuite()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index104_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA104_29 = input.LA(1);

                         
                        int index104_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalSuite()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index104_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA104_30 = input.LA(1);

                         
                        int index104_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalSuite()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index104_30);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA104_31 = input.LA(1);

                         
                        int index104_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalSuite()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index104_31);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA104_32 = input.LA(1);

                         
                        int index104_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalSuite()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index104_32);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 104, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_71s = "\117\uffff";
    static final String dfa_72s = "\1\2\116\uffff";
    static final String dfa_73s = "\1\6\1\0\115\uffff";
    static final String dfa_74s = "\1\133\1\0\115\uffff";
    static final String dfa_75s = "\2\uffff\1\2\113\uffff\1\1";
    static final String dfa_76s = "\1\uffff\1\0\115\uffff}>";
    static final String[] dfa_77s = {
            "\1\2\1\uffff\4\2\5\uffff\3\2\1\uffff\3\2\1\uffff\10\2\1\1\34\2\1\uffff\33\2\1\uffff\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_71 = DFA.unpackEncodedString(dfa_71s);
    static final short[] dfa_72 = DFA.unpackEncodedString(dfa_72s);
    static final char[] dfa_73 = DFA.unpackEncodedStringToUnsignedChars(dfa_73s);
    static final char[] dfa_74 = DFA.unpackEncodedStringToUnsignedChars(dfa_74s);
    static final short[] dfa_75 = DFA.unpackEncodedString(dfa_75s);
    static final short[] dfa_76 = DFA.unpackEncodedString(dfa_76s);
    static final short[][] dfa_77 = unpackEncodedStringArray(dfa_77s);

    class DFA121 extends DFA {

        public DFA121(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 121;
            this.eot = dfa_71;
            this.eof = dfa_72;
            this.min = dfa_73;
            this.max = dfa_74;
            this.accept = dfa_75;
            this.special = dfa_76;
            this.transition = dfa_77;
        }
        public String getDescription() {
            return "6067:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA121_1 = input.LA(1);

                         
                        int index121_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred50_InternalSuite()) ) {s = 78;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index121_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 121, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA119 extends DFA {

        public DFA119(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 119;
            this.eot = dfa_71;
            this.eof = dfa_72;
            this.min = dfa_73;
            this.max = dfa_74;
            this.accept = dfa_75;
            this.special = dfa_76;
            this.transition = dfa_77;
        }
        public String getDescription() {
            return "6143:2: ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA119_1 = input.LA(1);

                         
                        int index119_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred52_InternalSuite()) ) {s = 78;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index119_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 119, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_78s = "\7\uffff";
    static final String dfa_79s = "\2\uffff\1\4\2\uffff\1\4\1\uffff";
    static final String dfa_80s = "\1\13\1\uffff\1\4\1\13\1\uffff\1\4\1\uffff";
    static final String dfa_81s = "\1\113\1\uffff\1\114\1\62\1\uffff\1\114\1\uffff";
    static final String dfa_82s = "\1\uffff\1\1\2\uffff\1\2\1\uffff\1\3";
    static final String dfa_83s = "\7\uffff}>";
    static final String[] dfa_84s = {
            "\1\2\77\uffff\1\1",
            "",
            "\1\4\14\uffff\1\4\1\uffff\1\3\1\4\67\uffff\1\4",
            "\1\5\46\uffff\1\6",
            "",
            "\1\4\14\uffff\1\4\1\uffff\1\3\1\4\67\uffff\1\4",
            ""
    };

    static final short[] dfa_78 = DFA.unpackEncodedString(dfa_78s);
    static final short[] dfa_79 = DFA.unpackEncodedString(dfa_79s);
    static final char[] dfa_80 = DFA.unpackEncodedStringToUnsignedChars(dfa_80s);
    static final char[] dfa_81 = DFA.unpackEncodedStringToUnsignedChars(dfa_81s);
    static final short[] dfa_82 = DFA.unpackEncodedString(dfa_82s);
    static final short[] dfa_83 = DFA.unpackEncodedString(dfa_83s);
    static final short[][] dfa_84 = unpackEncodedStringArray(dfa_84s);

    class DFA129 extends DFA {

        public DFA129(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 129;
            this.eot = dfa_78;
            this.eof = dfa_79;
            this.min = dfa_80;
            this.max = dfa_81;
            this.accept = dfa_82;
            this.special = dfa_83;
            this.transition = dfa_84;
        }
        public String getDescription() {
            return "6646:1: ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000120012L,0x0000000000001000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100012L,0x0000000000001000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100012L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100010L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000082L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x9042000206B40F40L,0x00000000017FFCE2L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x9042000206340F40L,0x00000000017FFCE2L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x904200020E340F40L,0x00000000017FFCE2L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008400000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000007F0000002L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000C00000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000002L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000003C000000002L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040E00000002L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000400000200800L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0001F80600000002L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000400200000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0002000000040002L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x003C000000000002L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0080000000000002L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0300000000000002L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0C00000000080002L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000800L,0x0000000000003C00L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000200000800L,0x0000000000007C00L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000400000200800L,0x0000000004000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000400400000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0C00000004280002L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0xD042400206B40F40L,0x00000000017FFCE2L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0C00000004080002L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0xB042000206340F40L,0x00000000017FFCE2L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x2000000000400000L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0xD04240020E340F40L,0x00000000017FFFE2L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x4000000000400000L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x904200020E340F40L,0x00000000017FFFE2L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x9042000206360F42L,0x00000000017FFFE2L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x9042000206340F42L,0x00000000017FFFE2L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x9042400206340F40L,0x00000000017FFCE2L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x2000400000600800L,0x000000000000001CL});
        public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000014L});
        public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000004L});
        public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x9042000206360F40L,0x00000000017FFFE2L});
        public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x9042000206340F40L,0x00000000017FFFE2L});
        public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x9042000206360F40L,0x00000000017FFCE2L});
        public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
        public static final BitSet FOLLOW_71 = new BitSet(new long[]{0xB042000206340F40L,0x00000000017FFFE2L});
        public static final BitSet FOLLOW_72 = new BitSet(new long[]{0xB042000206360F40L,0x00000000017FFFE2L});
        public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000004200002L});
        public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000204200002L});
        public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000004800000L});
        public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x9042000206340F42L,0x00000000017FFCE2L});
        public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000002800000L});
        public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000002L,0x0000000002800000L});
        public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000600L});
        public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000400000A00800L});
        public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000200080002L});
        public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004400L});
        public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
        public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
        public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000800L,0x0000000000000800L});
        public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000800L,0x0000000000002000L});
        public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0004000000000800L});
        public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000802L});
    }


}