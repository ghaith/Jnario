package org.jnario.spec.ui.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSpecLexer extends Lexer {
    public static final int Each=64;
    public static final int FRAGMENT_Solidus=138;
    public static final int FRAGMENT_ExclamationMarkEqualsSignEqualsSign=174;
    public static final int EqualsSignGreaterThanSign=43;
    public static final int FRAGMENT_Typeof=210;
    public static final int LessThanSign=18;
    public static final int FRAGMENT_LeftCurlyBracket=148;
    public static final int FRAGMENT_QuestionMark=144;
    public static final int Assert=77;
    public static final int FRAGMENT_RULE_DECIMAL=239;
    public static final int Throw=75;
    public static final int FRAGMENT_GreaterThanSignEqualsSign=167;
    public static final int FRAGMENT_For=180;
    public static final int ExclamationMarkEqualsSignEqualsSign=51;
    public static final int GreaterThanSign=20;
    public static final int RULE_ID=107;
    public static final int FRAGMENT_NumberSign=128;
    public static final int FRAGMENT_HyphenMinus=136;
    public static final int FRAGMENT_RULE_ID=230;
    public static final int FRAGMENT_Strictfp=222;
    public static final int FRAGMENT_RightParenthesis=132;
    public static final int GreaterThanSignEqualsSign=44;
    public static final int ColonColon=40;
    public static final int RULE_INT=121;
    public static final int FRAGMENT_EqualsSignGreaterThanSign=166;
    public static final int FRAGMENT_FullStopFullStopFullStop=175;
    public static final int FRAGMENT_Facts=194;
    public static final int Should=83;
    public static final int FRAGMENT_RULE_ML_COMMENT=229;
    public static final int FRAGMENT_Colon=139;
    public static final int FRAGMENT_Should=206;
    public static final int Dispatch=97;
    public static final int FRAGMENT_RightCurlyBracket=150;
    public static final int FRAGMENT_Abstract=218;
    public static final int FRAGMENT_RULE_HEX=237;
    public static final int As=47;
    public static final int QuestionMarkColon=46;
    public static final int RULE_IDENTIFIER_PART=118;
    public static final int FRAGMENT_Final=196;
    public static final int Solidus=15;
    public static final int RightCurlyBracket=27;
    public static final int Transient=103;
    public static final int PercentSignEqualsSign=29;
    public static final int Context=88;
    public static final int Describe=96;
    public static final int FullStop=14;
    public static final int FRAGMENT_Extension=224;
    public static final int FRAGMENT_Not=182;
    public static final int FRAGMENT_True=191;
    public static final int Semicolon=17;
    public static final int FRAGMENT_RULE_WS=242;
    public static final int PlusSignPlusSign=33;
    public static final int QuestionMark=21;
    public static final int FRAGMENT_RULE_RICH_TEXT=231;
    public static final int After=69;
    public static final int FRAGMENT_Null=190;
    public static final int FRAGMENT_GreaterThanSign=143;
    public static final int HyphenMinusHyphenMinus=35;
    public static final int FRAGMENT_HyphenMinusHyphenMinus=158;
    public static final int FRAGMENT_LessThanSign=141;
    public static final int Typeof=87;
    public static final int FRAGMENT_RULE_ANY_OTHER=243;
    public static final int SolidusEqualsSign=39;
    public static final int FRAGMENT_ExclamationMark=127;
    public static final int FRAGMENT_SolidusEqualsSign=162;
    public static final int FRAGMENT_Import=202;
    public static final int Native=80;
    public static final int FRAGMENT_Protected=225;
    public static final int FRAGMENT_CommercialAt=145;
    public static final int FullStopFullStop=38;
    public static final int FRAGMENT_LeftParenthesis=131;
    public static final int Ampersand=7;
    public static final int AsteriskEqualsSign=32;
    public static final int FRAGMENT_RULE_RICH_TEXT_INBETWEEN=234;
    public static final int Override=98;
    public static final int Protected=102;
    public static final int FRAGMENT_EqualsSignEqualsSign=165;
    public static final int RightParenthesis=9;
    public static final int For=57;
    public static final int FRAGMENT_Synchronized=228;
    public static final int FRAGMENT_AsteriskEqualsSign=155;
    public static final int FRAGMENT_Do=171;
    public static final int Do=48;
    public static final int Fact=66;
    public static final int FRAGMENT_False=195;
    public static final int RULE_DECIMAL=122;
    public static final int FRAGMENT_Val=184;
    public static final int Not=59;
    public static final int FRAGMENT_VerticalLineVerticalLine=173;
    public static final int AsteriskAsterisk=31;
    public static final int FRAGMENT_Var=185;
    public static final int Static=84;
    public static final int FRAGMENT_ColonColon=163;
    public static final int FRAGMENT_RULE_RICH_TEXT_START=232;
    public static final int RULE_SL_COMMENT=124;
    public static final int RULE_IN_RICH_STRING=116;
    public static final int FRAGMENT_Comma=135;
    public static final int AmpersandAmpersand=30;
    public static final int FRAGMENT_Static=207;
    public static final int Colon=16;
    public static final int HyphenMinusEqualsSign=36;
    public static final int FRAGMENT_PlusSign=134;
    public static final int EOF=-1;
    public static final int Asterisk=10;
    public static final int RULE_RICH_TEXT=110;
    public static final int Return=82;
    public static final int RULE_RICH_TEXT_END=112;
    public static final int LeftCurlyBracket=25;
    public static final int RULE_RICH_TEXT_INBETWEEN=113;
    public static final int Volatile=100;
    public static final int FRAGMENT_Transient=226;
    public static final int Extension=101;
    public static final int FRAGMENT_PercentSignEqualsSign=152;
    public static final int FRAGMENT_As=170;
    public static final int FRAGMENT_HyphenMinusGreaterThanSign=160;
    public static final int FRAGMENT_Each=187;
    public static final int FRAGMENT_Native=203;
    public static final int FRAGMENT_Assert=200;
    public static final int Val=61;
    public static final int LessThanSignGreaterThanSign=41;
    public static final int RULE_HEX=120;
    public static final int FRAGMENT_LeftSquareBracket=146;
    public static final int Import=79;
    public static final int Var=62;
    public static final int FRAGMENT_Dispatch=220;
    public static final int FRAGMENT_HyphenMinusEqualsSign=159;
    public static final int False=72;
    public static final int FRAGMENT_PlusSignPlusSign=156;
    public static final int FRAGMENT_RULE_INT=238;
    public static final int FRAGMENT_Try=183;
    public static final int LeftParenthesis=8;
    public static final int FRAGMENT_Super=197;
    public static final int FRAGMENT_Return=205;
    public static final int Private=94;
    public static final int Extends=90;
    public static final int ExclamationMark=4;
    public static final int FRAGMENT_EqualsSign=142;
    public static final int FRAGMENT_Extends=213;
    public static final int Throws=86;
    public static final int RULE_RICH_TEXT_START=111;
    public static final int FRAGMENT_EqualsSignEqualsSignEqualsSign=177;
    public static final int FRAGMENT_Public=204;
    public static final int EqualsSignEqualsSign=42;
    public static final int FRAGMENT_All=178;
    public static final int FRAGMENT_New=181;
    public static final int SYNTHETIC_ALL_KEYWORDS=244;
    public static final int Switch=85;
    public static final int VerticalLine=26;
    public static final int PlusSign=11;
    public static final int RULE_ML_COMMENT=106;
    public static final int LeftSquareBracket=23;
    public static final int Package=92;
    public static final int FRAGMENT_AmpersandAmpersand=153;
    public static final int FRAGMENT_Catch=193;
    public static final int If=49;
    public static final int Finally=91;
    public static final int FRAGMENT_AsteriskAsterisk=154;
    public static final int VerticalLineVerticalLine=50;
    public static final int Catch=70;
    public static final int FRAGMENT_ExclamationMarkEqualsSign=151;
    public static final int FRAGMENT_PlusSignEqualsSign=157;
    public static final int Case=63;
    public static final int RULE_UNICODE_ESCAPE=109;
    public static final int QuestionMarkFullStop=45;
    public static final int Comma=12;
    public static final int FRAGMENT_LessThanSignGreaterThanSign=164;
    public static final int FRAGMENT_Fact=189;
    public static final int FRAGMENT_Package=215;
    public static final int HyphenMinus=13;
    public static final int Synchronized=105;
    public static final int FRAGMENT_Ampersand=130;
    public static final int FRAGMENT_Def=179;
    public static final int FRAGMENT_RULE_RICH_TEXT_END=233;
    public static final int FRAGMENT_Pending=216;
    public static final int Final=73;
    public static final int Abstract=95;
    public static final int FRAGMENT_FullStop=137;
    public static final int Default=89;
    public static final int FRAGMENT_RightSquareBracket=147;
    public static final int CommercialAt=22;
    public static final int Facts=71;
    public static final int Else=65;
    public static final int RULE_HEX_DIGIT=108;
    public static final int ExclamationMarkEqualsSign=28;
    public static final int HyphenMinusGreaterThanSign=37;
    public static final int FRAGMENT_RULE_COMMENT_RICH_TEXT_INBETWEEN=235;
    public static final int All=55;
    public static final int New=58;
    public static final int Null=67;
    public static final int RULE_COMMENT_RICH_TEXT_END=115;
    public static final int True=68;
    public static final int FRAGMENT_Asterisk=133;
    public static final int FullStopFullStopFullStop=52;
    public static final int FRAGMENT_While=199;
    public static final int PercentSign=6;
    public static final int RULE_IDENTIFIER_START=117;
    public static final int Super=74;
    public static final int FRAGMENT_VerticalLine=149;
    public static final int FRAGMENT_Switch=208;
    public static final int FRAGMENT_Case=186;
    public static final int FRAGMENT_Context=211;
    public static final int Try=60;
    public static final int FRAGMENT_PercentSign=129;
    public static final int FRAGMENT_Describe=219;
    public static final int RightSquareBracket=24;
    public static final int Strictfp=99;
    public static final int FRAGMENT_Else=188;
    public static final int FRAGMENT_QuestionMarkFullStop=168;
    public static final int FRAGMENT_Throws=209;
    public static final int FRAGMENT_Default=212;
    public static final int Public=81;
    public static final int FRAGMENT_FullStopFullStopLessThanSign=176;
    public static final int EqualsSignEqualsSignEqualsSign=54;
    public static final int FRAGMENT_RULE_COMMENT_RICH_TEXT_END=236;
    public static final int FRAGMENT_QuestionMarkColon=169;
    public static final int FRAGMENT_Private=217;
    public static final int FRAGMENT_Override=221;
    public static final int NumberSign=5;
    public static final int FRAGMENT_FullStopFullStop=161;
    public static final int FRAGMENT_After=192;
    public static final int FRAGMENT_RULE_STRING=240;
    public static final int Before=78;
    public static final int FRAGMENT_RULE_SL_COMMENT=241;
    public static final int RULE_STRING=123;
    public static final int FRAGMENT_Instanceof=227;
    public static final int EqualsSign=19;
    public static final int FRAGMENT_Finally=214;
    public static final int FRAGMENT_Throw=198;
    public static final int RULE_COMMENT_RICH_TEXT_INBETWEEN=114;
    public static final int Instanceof=104;
    public static final int FRAGMENT_Before=201;
    public static final int PlusSignEqualsSign=34;
    public static final int FRAGMENT_If=172;
    public static final int Def=56;
    public static final int RULE_WS=125;
    public static final int FRAGMENT_Volatile=223;
    public static final int FRAGMENT_Semicolon=140;
    public static final int While=76;
    public static final int RULE_ANY_OTHER=126;
    public static final int RULE_IDENTIFIER_PART_IMPL=119;
    public static final int FullStopFullStopLessThanSign=53;
    public static final int Pending=93;

    // delegates
    // delegators

    public InternalSpecLexer() {;} 
    public InternalSpecLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSpecLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
        state.ruleMemo = new HashMap[787+1];
 
    }
    public String getGrammarFileName() { return "../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g"; }

    // $ANTLR start "SYNTHETIC_ALL_KEYWORDS"
    public final void mSYNTHETIC_ALL_KEYWORDS() throws RecognitionException {
        int SYNTHETIC_ALL_KEYWORDS_StartIndex = input.index();
        try {
            int _type = SYNTHETIC_ALL_KEYWORDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:148:24: ( ( FRAGMENT_ExclamationMark )=> FRAGMENT_ExclamationMark | ( FRAGMENT_NumberSign )=> FRAGMENT_NumberSign | ( FRAGMENT_PercentSign )=> FRAGMENT_PercentSign | ( FRAGMENT_Ampersand )=> FRAGMENT_Ampersand | ( FRAGMENT_LeftParenthesis )=> FRAGMENT_LeftParenthesis | ( FRAGMENT_RightParenthesis )=> FRAGMENT_RightParenthesis | ( FRAGMENT_Asterisk )=> FRAGMENT_Asterisk | ( FRAGMENT_PlusSign )=> FRAGMENT_PlusSign | ( FRAGMENT_Comma )=> FRAGMENT_Comma | ( FRAGMENT_HyphenMinus )=> FRAGMENT_HyphenMinus | ( FRAGMENT_FullStop )=> FRAGMENT_FullStop | ( FRAGMENT_Solidus )=> FRAGMENT_Solidus | ( FRAGMENT_Colon )=> FRAGMENT_Colon | ( FRAGMENT_Semicolon )=> FRAGMENT_Semicolon | ( FRAGMENT_LessThanSign )=> FRAGMENT_LessThanSign | ( FRAGMENT_EqualsSign )=> FRAGMENT_EqualsSign | ( FRAGMENT_GreaterThanSign )=> FRAGMENT_GreaterThanSign | ( FRAGMENT_QuestionMark )=> FRAGMENT_QuestionMark | ( FRAGMENT_CommercialAt )=> FRAGMENT_CommercialAt | ( FRAGMENT_LeftSquareBracket )=> FRAGMENT_LeftSquareBracket | ( FRAGMENT_RightSquareBracket )=> FRAGMENT_RightSquareBracket | ( FRAGMENT_LeftCurlyBracket )=> FRAGMENT_LeftCurlyBracket | ( FRAGMENT_VerticalLine )=> FRAGMENT_VerticalLine | ( FRAGMENT_RightCurlyBracket )=> FRAGMENT_RightCurlyBracket | ( FRAGMENT_ExclamationMarkEqualsSign )=> FRAGMENT_ExclamationMarkEqualsSign | ( FRAGMENT_PercentSignEqualsSign )=> FRAGMENT_PercentSignEqualsSign | ( FRAGMENT_AmpersandAmpersand )=> FRAGMENT_AmpersandAmpersand | ( FRAGMENT_AsteriskAsterisk )=> FRAGMENT_AsteriskAsterisk | ( FRAGMENT_AsteriskEqualsSign )=> FRAGMENT_AsteriskEqualsSign | ( FRAGMENT_PlusSignPlusSign )=> FRAGMENT_PlusSignPlusSign | ( FRAGMENT_PlusSignEqualsSign )=> FRAGMENT_PlusSignEqualsSign | ( FRAGMENT_HyphenMinusHyphenMinus )=> FRAGMENT_HyphenMinusHyphenMinus | ( FRAGMENT_HyphenMinusEqualsSign )=> FRAGMENT_HyphenMinusEqualsSign | ( FRAGMENT_HyphenMinusGreaterThanSign )=> FRAGMENT_HyphenMinusGreaterThanSign | ( FRAGMENT_FullStopFullStop )=> FRAGMENT_FullStopFullStop | ( FRAGMENT_SolidusEqualsSign )=> FRAGMENT_SolidusEqualsSign | ( FRAGMENT_ColonColon )=> FRAGMENT_ColonColon | ( FRAGMENT_LessThanSignGreaterThanSign )=> FRAGMENT_LessThanSignGreaterThanSign | ( FRAGMENT_EqualsSignEqualsSign )=> FRAGMENT_EqualsSignEqualsSign | ( FRAGMENT_EqualsSignGreaterThanSign )=> FRAGMENT_EqualsSignGreaterThanSign | ( FRAGMENT_GreaterThanSignEqualsSign )=> FRAGMENT_GreaterThanSignEqualsSign | ( FRAGMENT_QuestionMarkFullStop )=> FRAGMENT_QuestionMarkFullStop | ( FRAGMENT_QuestionMarkColon )=> FRAGMENT_QuestionMarkColon | ( FRAGMENT_As )=> FRAGMENT_As | ( FRAGMENT_Do )=> FRAGMENT_Do | ( FRAGMENT_If )=> FRAGMENT_If | ( FRAGMENT_VerticalLineVerticalLine )=> FRAGMENT_VerticalLineVerticalLine | ( FRAGMENT_ExclamationMarkEqualsSignEqualsSign )=> FRAGMENT_ExclamationMarkEqualsSignEqualsSign | ( FRAGMENT_FullStopFullStopFullStop )=> FRAGMENT_FullStopFullStopFullStop | ( FRAGMENT_FullStopFullStopLessThanSign )=> FRAGMENT_FullStopFullStopLessThanSign | ( FRAGMENT_EqualsSignEqualsSignEqualsSign )=> FRAGMENT_EqualsSignEqualsSignEqualsSign | ( FRAGMENT_All )=> FRAGMENT_All | ( FRAGMENT_Def )=> FRAGMENT_Def | ( FRAGMENT_For )=> FRAGMENT_For | ( FRAGMENT_New )=> FRAGMENT_New | ( FRAGMENT_Not )=> FRAGMENT_Not | ( FRAGMENT_Try )=> FRAGMENT_Try | ( FRAGMENT_Val )=> FRAGMENT_Val | ( FRAGMENT_Var )=> FRAGMENT_Var | ( FRAGMENT_Case )=> FRAGMENT_Case | ( FRAGMENT_Each )=> FRAGMENT_Each | ( FRAGMENT_Else )=> FRAGMENT_Else | ( FRAGMENT_Fact )=> FRAGMENT_Fact | ( FRAGMENT_Null )=> FRAGMENT_Null | ( FRAGMENT_True )=> FRAGMENT_True | ( FRAGMENT_After )=> FRAGMENT_After | ( FRAGMENT_Catch )=> FRAGMENT_Catch | ( FRAGMENT_Facts )=> FRAGMENT_Facts | ( FRAGMENT_False )=> FRAGMENT_False | ( FRAGMENT_Final )=> FRAGMENT_Final | ( FRAGMENT_Super )=> FRAGMENT_Super | ( FRAGMENT_Throw )=> FRAGMENT_Throw | ( FRAGMENT_While )=> FRAGMENT_While | ( FRAGMENT_Assert )=> FRAGMENT_Assert | ( FRAGMENT_Before )=> FRAGMENT_Before | ( FRAGMENT_Import )=> FRAGMENT_Import | ( FRAGMENT_Native )=> FRAGMENT_Native | ( FRAGMENT_Public )=> FRAGMENT_Public | ( FRAGMENT_Return )=> FRAGMENT_Return | ( FRAGMENT_Should )=> FRAGMENT_Should | ( FRAGMENT_Static )=> FRAGMENT_Static | ( FRAGMENT_Switch )=> FRAGMENT_Switch | ( FRAGMENT_Throws )=> FRAGMENT_Throws | ( FRAGMENT_Typeof )=> FRAGMENT_Typeof | ( FRAGMENT_Context )=> FRAGMENT_Context | ( FRAGMENT_Default )=> FRAGMENT_Default | ( FRAGMENT_Extends )=> FRAGMENT_Extends | ( FRAGMENT_Finally )=> FRAGMENT_Finally | ( FRAGMENT_Package )=> FRAGMENT_Package | ( FRAGMENT_Pending )=> FRAGMENT_Pending | ( FRAGMENT_Private )=> FRAGMENT_Private | ( FRAGMENT_Abstract )=> FRAGMENT_Abstract | ( FRAGMENT_Describe )=> FRAGMENT_Describe | ( FRAGMENT_Dispatch )=> FRAGMENT_Dispatch | ( FRAGMENT_Override )=> FRAGMENT_Override | ( FRAGMENT_Strictfp )=> FRAGMENT_Strictfp | ( FRAGMENT_Volatile )=> FRAGMENT_Volatile | ( FRAGMENT_Extension )=> FRAGMENT_Extension | ( FRAGMENT_Protected )=> FRAGMENT_Protected | ( FRAGMENT_Transient )=> FRAGMENT_Transient | ( FRAGMENT_Instanceof )=> FRAGMENT_Instanceof | ( FRAGMENT_Synchronized )=> FRAGMENT_Synchronized | ( FRAGMENT_RULE_ML_COMMENT )=> FRAGMENT_RULE_ML_COMMENT | ( FRAGMENT_RULE_ID )=> FRAGMENT_RULE_ID | ( FRAGMENT_RULE_RICH_TEXT )=> FRAGMENT_RULE_RICH_TEXT | ( FRAGMENT_RULE_RICH_TEXT_START )=> FRAGMENT_RULE_RICH_TEXT_START | ( FRAGMENT_RULE_RICH_TEXT_END )=> FRAGMENT_RULE_RICH_TEXT_END | ( FRAGMENT_RULE_RICH_TEXT_INBETWEEN )=> FRAGMENT_RULE_RICH_TEXT_INBETWEEN | ( FRAGMENT_RULE_COMMENT_RICH_TEXT_INBETWEEN )=> FRAGMENT_RULE_COMMENT_RICH_TEXT_INBETWEEN | ( FRAGMENT_RULE_COMMENT_RICH_TEXT_END )=> FRAGMENT_RULE_COMMENT_RICH_TEXT_END | ( FRAGMENT_RULE_HEX )=> FRAGMENT_RULE_HEX | ( FRAGMENT_RULE_INT )=> FRAGMENT_RULE_INT | ( FRAGMENT_RULE_DECIMAL )=> FRAGMENT_RULE_DECIMAL | ( FRAGMENT_RULE_STRING )=> FRAGMENT_RULE_STRING | ( FRAGMENT_RULE_SL_COMMENT )=> FRAGMENT_RULE_SL_COMMENT | ( FRAGMENT_RULE_WS )=> FRAGMENT_RULE_WS | ( FRAGMENT_RULE_ANY_OTHER )=> FRAGMENT_RULE_ANY_OTHER )
            int alt1=117;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:149:2: ( FRAGMENT_ExclamationMark )=> FRAGMENT_ExclamationMark
                    {
                    mFRAGMENT_ExclamationMark(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = ExclamationMark; 
                    }

                    }
                    break;
                case 2 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:150:2: ( FRAGMENT_NumberSign )=> FRAGMENT_NumberSign
                    {
                    mFRAGMENT_NumberSign(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = NumberSign; 
                    }

                    }
                    break;
                case 3 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:151:2: ( FRAGMENT_PercentSign )=> FRAGMENT_PercentSign
                    {
                    mFRAGMENT_PercentSign(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = PercentSign; 
                    }

                    }
                    break;
                case 4 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:152:2: ( FRAGMENT_Ampersand )=> FRAGMENT_Ampersand
                    {
                    mFRAGMENT_Ampersand(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Ampersand; 
                    }

                    }
                    break;
                case 5 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:153:2: ( FRAGMENT_LeftParenthesis )=> FRAGMENT_LeftParenthesis
                    {
                    mFRAGMENT_LeftParenthesis(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = LeftParenthesis; 
                    }

                    }
                    break;
                case 6 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:154:2: ( FRAGMENT_RightParenthesis )=> FRAGMENT_RightParenthesis
                    {
                    mFRAGMENT_RightParenthesis(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RightParenthesis; 
                    }

                    }
                    break;
                case 7 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:155:2: ( FRAGMENT_Asterisk )=> FRAGMENT_Asterisk
                    {
                    mFRAGMENT_Asterisk(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Asterisk; 
                    }

                    }
                    break;
                case 8 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:156:2: ( FRAGMENT_PlusSign )=> FRAGMENT_PlusSign
                    {
                    mFRAGMENT_PlusSign(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = PlusSign; 
                    }

                    }
                    break;
                case 9 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:157:2: ( FRAGMENT_Comma )=> FRAGMENT_Comma
                    {
                    mFRAGMENT_Comma(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Comma; 
                    }

                    }
                    break;
                case 10 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:158:2: ( FRAGMENT_HyphenMinus )=> FRAGMENT_HyphenMinus
                    {
                    mFRAGMENT_HyphenMinus(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = HyphenMinus; 
                    }

                    }
                    break;
                case 11 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:159:2: ( FRAGMENT_FullStop )=> FRAGMENT_FullStop
                    {
                    mFRAGMENT_FullStop(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = FullStop; 
                    }

                    }
                    break;
                case 12 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:160:2: ( FRAGMENT_Solidus )=> FRAGMENT_Solidus
                    {
                    mFRAGMENT_Solidus(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Solidus; 
                    }

                    }
                    break;
                case 13 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:161:2: ( FRAGMENT_Colon )=> FRAGMENT_Colon
                    {
                    mFRAGMENT_Colon(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Colon; 
                    }

                    }
                    break;
                case 14 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:162:2: ( FRAGMENT_Semicolon )=> FRAGMENT_Semicolon
                    {
                    mFRAGMENT_Semicolon(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Semicolon; 
                    }

                    }
                    break;
                case 15 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:163:2: ( FRAGMENT_LessThanSign )=> FRAGMENT_LessThanSign
                    {
                    mFRAGMENT_LessThanSign(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = LessThanSign; 
                    }

                    }
                    break;
                case 16 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:164:2: ( FRAGMENT_EqualsSign )=> FRAGMENT_EqualsSign
                    {
                    mFRAGMENT_EqualsSign(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = EqualsSign; 
                    }

                    }
                    break;
                case 17 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:165:2: ( FRAGMENT_GreaterThanSign )=> FRAGMENT_GreaterThanSign
                    {
                    mFRAGMENT_GreaterThanSign(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = GreaterThanSign; 
                    }

                    }
                    break;
                case 18 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:166:2: ( FRAGMENT_QuestionMark )=> FRAGMENT_QuestionMark
                    {
                    mFRAGMENT_QuestionMark(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = QuestionMark; 
                    }

                    }
                    break;
                case 19 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:167:2: ( FRAGMENT_CommercialAt )=> FRAGMENT_CommercialAt
                    {
                    mFRAGMENT_CommercialAt(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = CommercialAt; 
                    }

                    }
                    break;
                case 20 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:168:2: ( FRAGMENT_LeftSquareBracket )=> FRAGMENT_LeftSquareBracket
                    {
                    mFRAGMENT_LeftSquareBracket(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = LeftSquareBracket; 
                    }

                    }
                    break;
                case 21 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:169:2: ( FRAGMENT_RightSquareBracket )=> FRAGMENT_RightSquareBracket
                    {
                    mFRAGMENT_RightSquareBracket(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RightSquareBracket; 
                    }

                    }
                    break;
                case 22 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:170:2: ( FRAGMENT_LeftCurlyBracket )=> FRAGMENT_LeftCurlyBracket
                    {
                    mFRAGMENT_LeftCurlyBracket(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = LeftCurlyBracket; 
                    }

                    }
                    break;
                case 23 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:171:2: ( FRAGMENT_VerticalLine )=> FRAGMENT_VerticalLine
                    {
                    mFRAGMENT_VerticalLine(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = VerticalLine; 
                    }

                    }
                    break;
                case 24 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:172:2: ( FRAGMENT_RightCurlyBracket )=> FRAGMENT_RightCurlyBracket
                    {
                    mFRAGMENT_RightCurlyBracket(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RightCurlyBracket; 
                    }

                    }
                    break;
                case 25 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:173:2: ( FRAGMENT_ExclamationMarkEqualsSign )=> FRAGMENT_ExclamationMarkEqualsSign
                    {
                    mFRAGMENT_ExclamationMarkEqualsSign(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = ExclamationMarkEqualsSign; 
                    }

                    }
                    break;
                case 26 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:174:2: ( FRAGMENT_PercentSignEqualsSign )=> FRAGMENT_PercentSignEqualsSign
                    {
                    mFRAGMENT_PercentSignEqualsSign(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = PercentSignEqualsSign; 
                    }

                    }
                    break;
                case 27 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:175:2: ( FRAGMENT_AmpersandAmpersand )=> FRAGMENT_AmpersandAmpersand
                    {
                    mFRAGMENT_AmpersandAmpersand(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = AmpersandAmpersand; 
                    }

                    }
                    break;
                case 28 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:176:2: ( FRAGMENT_AsteriskAsterisk )=> FRAGMENT_AsteriskAsterisk
                    {
                    mFRAGMENT_AsteriskAsterisk(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = AsteriskAsterisk; 
                    }

                    }
                    break;
                case 29 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:177:2: ( FRAGMENT_AsteriskEqualsSign )=> FRAGMENT_AsteriskEqualsSign
                    {
                    mFRAGMENT_AsteriskEqualsSign(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = AsteriskEqualsSign; 
                    }

                    }
                    break;
                case 30 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:178:2: ( FRAGMENT_PlusSignPlusSign )=> FRAGMENT_PlusSignPlusSign
                    {
                    mFRAGMENT_PlusSignPlusSign(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = PlusSignPlusSign; 
                    }

                    }
                    break;
                case 31 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:179:2: ( FRAGMENT_PlusSignEqualsSign )=> FRAGMENT_PlusSignEqualsSign
                    {
                    mFRAGMENT_PlusSignEqualsSign(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = PlusSignEqualsSign; 
                    }

                    }
                    break;
                case 32 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:180:2: ( FRAGMENT_HyphenMinusHyphenMinus )=> FRAGMENT_HyphenMinusHyphenMinus
                    {
                    mFRAGMENT_HyphenMinusHyphenMinus(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = HyphenMinusHyphenMinus; 
                    }

                    }
                    break;
                case 33 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:181:2: ( FRAGMENT_HyphenMinusEqualsSign )=> FRAGMENT_HyphenMinusEqualsSign
                    {
                    mFRAGMENT_HyphenMinusEqualsSign(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = HyphenMinusEqualsSign; 
                    }

                    }
                    break;
                case 34 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:182:2: ( FRAGMENT_HyphenMinusGreaterThanSign )=> FRAGMENT_HyphenMinusGreaterThanSign
                    {
                    mFRAGMENT_HyphenMinusGreaterThanSign(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = HyphenMinusGreaterThanSign; 
                    }

                    }
                    break;
                case 35 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:183:2: ( FRAGMENT_FullStopFullStop )=> FRAGMENT_FullStopFullStop
                    {
                    mFRAGMENT_FullStopFullStop(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = FullStopFullStop; 
                    }

                    }
                    break;
                case 36 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:184:2: ( FRAGMENT_SolidusEqualsSign )=> FRAGMENT_SolidusEqualsSign
                    {
                    mFRAGMENT_SolidusEqualsSign(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = SolidusEqualsSign; 
                    }

                    }
                    break;
                case 37 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:185:2: ( FRAGMENT_ColonColon )=> FRAGMENT_ColonColon
                    {
                    mFRAGMENT_ColonColon(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = ColonColon; 
                    }

                    }
                    break;
                case 38 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:186:2: ( FRAGMENT_LessThanSignGreaterThanSign )=> FRAGMENT_LessThanSignGreaterThanSign
                    {
                    mFRAGMENT_LessThanSignGreaterThanSign(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = LessThanSignGreaterThanSign; 
                    }

                    }
                    break;
                case 39 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:187:2: ( FRAGMENT_EqualsSignEqualsSign )=> FRAGMENT_EqualsSignEqualsSign
                    {
                    mFRAGMENT_EqualsSignEqualsSign(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = EqualsSignEqualsSign; 
                    }

                    }
                    break;
                case 40 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:188:2: ( FRAGMENT_EqualsSignGreaterThanSign )=> FRAGMENT_EqualsSignGreaterThanSign
                    {
                    mFRAGMENT_EqualsSignGreaterThanSign(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = EqualsSignGreaterThanSign; 
                    }

                    }
                    break;
                case 41 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:189:2: ( FRAGMENT_GreaterThanSignEqualsSign )=> FRAGMENT_GreaterThanSignEqualsSign
                    {
                    mFRAGMENT_GreaterThanSignEqualsSign(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = GreaterThanSignEqualsSign; 
                    }

                    }
                    break;
                case 42 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:190:2: ( FRAGMENT_QuestionMarkFullStop )=> FRAGMENT_QuestionMarkFullStop
                    {
                    mFRAGMENT_QuestionMarkFullStop(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = QuestionMarkFullStop; 
                    }

                    }
                    break;
                case 43 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:191:2: ( FRAGMENT_QuestionMarkColon )=> FRAGMENT_QuestionMarkColon
                    {
                    mFRAGMENT_QuestionMarkColon(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = QuestionMarkColon; 
                    }

                    }
                    break;
                case 44 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:192:2: ( FRAGMENT_As )=> FRAGMENT_As
                    {
                    mFRAGMENT_As(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = As; 
                    }

                    }
                    break;
                case 45 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:193:2: ( FRAGMENT_Do )=> FRAGMENT_Do
                    {
                    mFRAGMENT_Do(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Do; 
                    }

                    }
                    break;
                case 46 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:194:2: ( FRAGMENT_If )=> FRAGMENT_If
                    {
                    mFRAGMENT_If(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = If; 
                    }

                    }
                    break;
                case 47 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:195:2: ( FRAGMENT_VerticalLineVerticalLine )=> FRAGMENT_VerticalLineVerticalLine
                    {
                    mFRAGMENT_VerticalLineVerticalLine(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = VerticalLineVerticalLine; 
                    }

                    }
                    break;
                case 48 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:196:2: ( FRAGMENT_ExclamationMarkEqualsSignEqualsSign )=> FRAGMENT_ExclamationMarkEqualsSignEqualsSign
                    {
                    mFRAGMENT_ExclamationMarkEqualsSignEqualsSign(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = ExclamationMarkEqualsSignEqualsSign; 
                    }

                    }
                    break;
                case 49 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:197:2: ( FRAGMENT_FullStopFullStopFullStop )=> FRAGMENT_FullStopFullStopFullStop
                    {
                    mFRAGMENT_FullStopFullStopFullStop(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = FullStopFullStopFullStop; 
                    }

                    }
                    break;
                case 50 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:198:2: ( FRAGMENT_FullStopFullStopLessThanSign )=> FRAGMENT_FullStopFullStopLessThanSign
                    {
                    mFRAGMENT_FullStopFullStopLessThanSign(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = FullStopFullStopLessThanSign; 
                    }

                    }
                    break;
                case 51 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:199:2: ( FRAGMENT_EqualsSignEqualsSignEqualsSign )=> FRAGMENT_EqualsSignEqualsSignEqualsSign
                    {
                    mFRAGMENT_EqualsSignEqualsSignEqualsSign(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = EqualsSignEqualsSignEqualsSign; 
                    }

                    }
                    break;
                case 52 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:200:2: ( FRAGMENT_All )=> FRAGMENT_All
                    {
                    mFRAGMENT_All(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = All; 
                    }

                    }
                    break;
                case 53 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:201:2: ( FRAGMENT_Def )=> FRAGMENT_Def
                    {
                    mFRAGMENT_Def(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Def; 
                    }

                    }
                    break;
                case 54 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:202:2: ( FRAGMENT_For )=> FRAGMENT_For
                    {
                    mFRAGMENT_For(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = For; 
                    }

                    }
                    break;
                case 55 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:203:2: ( FRAGMENT_New )=> FRAGMENT_New
                    {
                    mFRAGMENT_New(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = New; 
                    }

                    }
                    break;
                case 56 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:204:2: ( FRAGMENT_Not )=> FRAGMENT_Not
                    {
                    mFRAGMENT_Not(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Not; 
                    }

                    }
                    break;
                case 57 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:205:2: ( FRAGMENT_Try )=> FRAGMENT_Try
                    {
                    mFRAGMENT_Try(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Try; 
                    }

                    }
                    break;
                case 58 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:206:2: ( FRAGMENT_Val )=> FRAGMENT_Val
                    {
                    mFRAGMENT_Val(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Val; 
                    }

                    }
                    break;
                case 59 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:207:2: ( FRAGMENT_Var )=> FRAGMENT_Var
                    {
                    mFRAGMENT_Var(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Var; 
                    }

                    }
                    break;
                case 60 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:208:2: ( FRAGMENT_Case )=> FRAGMENT_Case
                    {
                    mFRAGMENT_Case(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Case; 
                    }

                    }
                    break;
                case 61 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:209:2: ( FRAGMENT_Each )=> FRAGMENT_Each
                    {
                    mFRAGMENT_Each(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Each; 
                    }

                    }
                    break;
                case 62 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:210:2: ( FRAGMENT_Else )=> FRAGMENT_Else
                    {
                    mFRAGMENT_Else(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Else; 
                    }

                    }
                    break;
                case 63 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:211:2: ( FRAGMENT_Fact )=> FRAGMENT_Fact
                    {
                    mFRAGMENT_Fact(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Fact; 
                    }

                    }
                    break;
                case 64 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:212:2: ( FRAGMENT_Null )=> FRAGMENT_Null
                    {
                    mFRAGMENT_Null(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Null; 
                    }

                    }
                    break;
                case 65 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:213:2: ( FRAGMENT_True )=> FRAGMENT_True
                    {
                    mFRAGMENT_True(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = True; 
                    }

                    }
                    break;
                case 66 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:214:2: ( FRAGMENT_After )=> FRAGMENT_After
                    {
                    mFRAGMENT_After(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = After; 
                    }

                    }
                    break;
                case 67 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:215:2: ( FRAGMENT_Catch )=> FRAGMENT_Catch
                    {
                    mFRAGMENT_Catch(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Catch; 
                    }

                    }
                    break;
                case 68 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:216:2: ( FRAGMENT_Facts )=> FRAGMENT_Facts
                    {
                    mFRAGMENT_Facts(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Facts; 
                    }

                    }
                    break;
                case 69 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:217:2: ( FRAGMENT_False )=> FRAGMENT_False
                    {
                    mFRAGMENT_False(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = False; 
                    }

                    }
                    break;
                case 70 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:218:2: ( FRAGMENT_Final )=> FRAGMENT_Final
                    {
                    mFRAGMENT_Final(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Final; 
                    }

                    }
                    break;
                case 71 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:219:2: ( FRAGMENT_Super )=> FRAGMENT_Super
                    {
                    mFRAGMENT_Super(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Super; 
                    }

                    }
                    break;
                case 72 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:220:2: ( FRAGMENT_Throw )=> FRAGMENT_Throw
                    {
                    mFRAGMENT_Throw(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Throw; 
                    }

                    }
                    break;
                case 73 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:221:2: ( FRAGMENT_While )=> FRAGMENT_While
                    {
                    mFRAGMENT_While(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = While; 
                    }

                    }
                    break;
                case 74 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:222:2: ( FRAGMENT_Assert )=> FRAGMENT_Assert
                    {
                    mFRAGMENT_Assert(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Assert; 
                    }

                    }
                    break;
                case 75 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:223:2: ( FRAGMENT_Before )=> FRAGMENT_Before
                    {
                    mFRAGMENT_Before(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Before; 
                    }

                    }
                    break;
                case 76 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:224:2: ( FRAGMENT_Import )=> FRAGMENT_Import
                    {
                    mFRAGMENT_Import(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Import; 
                    }

                    }
                    break;
                case 77 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:225:2: ( FRAGMENT_Native )=> FRAGMENT_Native
                    {
                    mFRAGMENT_Native(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Native; 
                    }

                    }
                    break;
                case 78 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:226:2: ( FRAGMENT_Public )=> FRAGMENT_Public
                    {
                    mFRAGMENT_Public(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Public; 
                    }

                    }
                    break;
                case 79 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:227:2: ( FRAGMENT_Return )=> FRAGMENT_Return
                    {
                    mFRAGMENT_Return(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Return; 
                    }

                    }
                    break;
                case 80 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:228:2: ( FRAGMENT_Should )=> FRAGMENT_Should
                    {
                    mFRAGMENT_Should(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Should; 
                    }

                    }
                    break;
                case 81 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:229:2: ( FRAGMENT_Static )=> FRAGMENT_Static
                    {
                    mFRAGMENT_Static(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Static; 
                    }

                    }
                    break;
                case 82 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:230:2: ( FRAGMENT_Switch )=> FRAGMENT_Switch
                    {
                    mFRAGMENT_Switch(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Switch; 
                    }

                    }
                    break;
                case 83 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:231:2: ( FRAGMENT_Throws )=> FRAGMENT_Throws
                    {
                    mFRAGMENT_Throws(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Throws; 
                    }

                    }
                    break;
                case 84 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:232:2: ( FRAGMENT_Typeof )=> FRAGMENT_Typeof
                    {
                    mFRAGMENT_Typeof(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Typeof; 
                    }

                    }
                    break;
                case 85 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:233:2: ( FRAGMENT_Context )=> FRAGMENT_Context
                    {
                    mFRAGMENT_Context(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Context; 
                    }

                    }
                    break;
                case 86 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:234:2: ( FRAGMENT_Default )=> FRAGMENT_Default
                    {
                    mFRAGMENT_Default(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Default; 
                    }

                    }
                    break;
                case 87 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:235:2: ( FRAGMENT_Extends )=> FRAGMENT_Extends
                    {
                    mFRAGMENT_Extends(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Extends; 
                    }

                    }
                    break;
                case 88 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:236:2: ( FRAGMENT_Finally )=> FRAGMENT_Finally
                    {
                    mFRAGMENT_Finally(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Finally; 
                    }

                    }
                    break;
                case 89 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:237:2: ( FRAGMENT_Package )=> FRAGMENT_Package
                    {
                    mFRAGMENT_Package(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Package; 
                    }

                    }
                    break;
                case 90 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:238:2: ( FRAGMENT_Pending )=> FRAGMENT_Pending
                    {
                    mFRAGMENT_Pending(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Pending; 
                    }

                    }
                    break;
                case 91 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:239:2: ( FRAGMENT_Private )=> FRAGMENT_Private
                    {
                    mFRAGMENT_Private(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Private; 
                    }

                    }
                    break;
                case 92 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:240:2: ( FRAGMENT_Abstract )=> FRAGMENT_Abstract
                    {
                    mFRAGMENT_Abstract(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Abstract; 
                    }

                    }
                    break;
                case 93 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:241:2: ( FRAGMENT_Describe )=> FRAGMENT_Describe
                    {
                    mFRAGMENT_Describe(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Describe; 
                    }

                    }
                    break;
                case 94 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:242:2: ( FRAGMENT_Dispatch )=> FRAGMENT_Dispatch
                    {
                    mFRAGMENT_Dispatch(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Dispatch; 
                    }

                    }
                    break;
                case 95 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:243:2: ( FRAGMENT_Override )=> FRAGMENT_Override
                    {
                    mFRAGMENT_Override(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Override; 
                    }

                    }
                    break;
                case 96 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:244:2: ( FRAGMENT_Strictfp )=> FRAGMENT_Strictfp
                    {
                    mFRAGMENT_Strictfp(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Strictfp; 
                    }

                    }
                    break;
                case 97 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:245:2: ( FRAGMENT_Volatile )=> FRAGMENT_Volatile
                    {
                    mFRAGMENT_Volatile(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Volatile; 
                    }

                    }
                    break;
                case 98 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:246:2: ( FRAGMENT_Extension )=> FRAGMENT_Extension
                    {
                    mFRAGMENT_Extension(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Extension; 
                    }

                    }
                    break;
                case 99 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:247:2: ( FRAGMENT_Protected )=> FRAGMENT_Protected
                    {
                    mFRAGMENT_Protected(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Protected; 
                    }

                    }
                    break;
                case 100 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:248:2: ( FRAGMENT_Transient )=> FRAGMENT_Transient
                    {
                    mFRAGMENT_Transient(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Transient; 
                    }

                    }
                    break;
                case 101 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:249:2: ( FRAGMENT_Instanceof )=> FRAGMENT_Instanceof
                    {
                    mFRAGMENT_Instanceof(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Instanceof; 
                    }

                    }
                    break;
                case 102 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:250:2: ( FRAGMENT_Synchronized )=> FRAGMENT_Synchronized
                    {
                    mFRAGMENT_Synchronized(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = Synchronized; 
                    }

                    }
                    break;
                case 103 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:251:2: ( FRAGMENT_RULE_ML_COMMENT )=> FRAGMENT_RULE_ML_COMMENT
                    {
                    mFRAGMENT_RULE_ML_COMMENT(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RULE_ML_COMMENT; 
                    }

                    }
                    break;
                case 104 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:252:2: ( FRAGMENT_RULE_ID )=> FRAGMENT_RULE_ID
                    {
                    mFRAGMENT_RULE_ID(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RULE_ID; 
                    }

                    }
                    break;
                case 105 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:253:2: ( FRAGMENT_RULE_RICH_TEXT )=> FRAGMENT_RULE_RICH_TEXT
                    {
                    mFRAGMENT_RULE_RICH_TEXT(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RULE_RICH_TEXT; 
                    }

                    }
                    break;
                case 106 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:254:2: ( FRAGMENT_RULE_RICH_TEXT_START )=> FRAGMENT_RULE_RICH_TEXT_START
                    {
                    mFRAGMENT_RULE_RICH_TEXT_START(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RULE_RICH_TEXT_START; 
                    }

                    }
                    break;
                case 107 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:255:2: ( FRAGMENT_RULE_RICH_TEXT_END )=> FRAGMENT_RULE_RICH_TEXT_END
                    {
                    mFRAGMENT_RULE_RICH_TEXT_END(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RULE_RICH_TEXT_END; 
                    }

                    }
                    break;
                case 108 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:256:2: ( FRAGMENT_RULE_RICH_TEXT_INBETWEEN )=> FRAGMENT_RULE_RICH_TEXT_INBETWEEN
                    {
                    mFRAGMENT_RULE_RICH_TEXT_INBETWEEN(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RULE_RICH_TEXT_INBETWEEN; 
                    }

                    }
                    break;
                case 109 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:257:2: ( FRAGMENT_RULE_COMMENT_RICH_TEXT_INBETWEEN )=> FRAGMENT_RULE_COMMENT_RICH_TEXT_INBETWEEN
                    {
                    mFRAGMENT_RULE_COMMENT_RICH_TEXT_INBETWEEN(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RULE_COMMENT_RICH_TEXT_INBETWEEN; 
                    }

                    }
                    break;
                case 110 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:258:2: ( FRAGMENT_RULE_COMMENT_RICH_TEXT_END )=> FRAGMENT_RULE_COMMENT_RICH_TEXT_END
                    {
                    mFRAGMENT_RULE_COMMENT_RICH_TEXT_END(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RULE_COMMENT_RICH_TEXT_END; 
                    }

                    }
                    break;
                case 111 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:259:2: ( FRAGMENT_RULE_HEX )=> FRAGMENT_RULE_HEX
                    {
                    mFRAGMENT_RULE_HEX(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RULE_HEX; 
                    }

                    }
                    break;
                case 112 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:260:2: ( FRAGMENT_RULE_INT )=> FRAGMENT_RULE_INT
                    {
                    mFRAGMENT_RULE_INT(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RULE_INT; 
                    }

                    }
                    break;
                case 113 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:261:2: ( FRAGMENT_RULE_DECIMAL )=> FRAGMENT_RULE_DECIMAL
                    {
                    mFRAGMENT_RULE_DECIMAL(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RULE_DECIMAL; 
                    }

                    }
                    break;
                case 114 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:262:2: ( FRAGMENT_RULE_STRING )=> FRAGMENT_RULE_STRING
                    {
                    mFRAGMENT_RULE_STRING(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RULE_STRING; 
                    }

                    }
                    break;
                case 115 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:263:2: ( FRAGMENT_RULE_SL_COMMENT )=> FRAGMENT_RULE_SL_COMMENT
                    {
                    mFRAGMENT_RULE_SL_COMMENT(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RULE_SL_COMMENT; 
                    }

                    }
                    break;
                case 116 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:264:2: ( FRAGMENT_RULE_WS )=> FRAGMENT_RULE_WS
                    {
                    mFRAGMENT_RULE_WS(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RULE_WS; 
                    }

                    }
                    break;
                case 117 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:265:2: ( FRAGMENT_RULE_ANY_OTHER )=> FRAGMENT_RULE_ANY_OTHER
                    {
                    mFRAGMENT_RULE_ANY_OTHER(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RULE_ANY_OTHER; 
                    }

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, SYNTHETIC_ALL_KEYWORDS_StartIndex); }
        }
    }
    // $ANTLR end "SYNTHETIC_ALL_KEYWORDS"

    // $ANTLR start "FRAGMENT_ExclamationMark"
    public final void mFRAGMENT_ExclamationMark() throws RecognitionException {
        int FRAGMENT_ExclamationMark_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:267:35: ( '!' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:267:37: '!'
            {
            match('!'); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, FRAGMENT_ExclamationMark_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_ExclamationMark"

    // $ANTLR start "FRAGMENT_NumberSign"
    public final void mFRAGMENT_NumberSign() throws RecognitionException {
        int FRAGMENT_NumberSign_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:269:30: ( '#' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:269:32: '#'
            {
            match('#'); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, FRAGMENT_NumberSign_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_NumberSign"

    // $ANTLR start "FRAGMENT_PercentSign"
    public final void mFRAGMENT_PercentSign() throws RecognitionException {
        int FRAGMENT_PercentSign_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:271:31: ( '%' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:271:33: '%'
            {
            match('%'); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, FRAGMENT_PercentSign_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_PercentSign"

    // $ANTLR start "FRAGMENT_Ampersand"
    public final void mFRAGMENT_Ampersand() throws RecognitionException {
        int FRAGMENT_Ampersand_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:273:29: ( '&' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:273:31: '&'
            {
            match('&'); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, FRAGMENT_Ampersand_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Ampersand"

    // $ANTLR start "FRAGMENT_LeftParenthesis"
    public final void mFRAGMENT_LeftParenthesis() throws RecognitionException {
        int FRAGMENT_LeftParenthesis_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:275:35: ( '(' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:275:37: '('
            {
            match('('); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, FRAGMENT_LeftParenthesis_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_LeftParenthesis"

    // $ANTLR start "FRAGMENT_RightParenthesis"
    public final void mFRAGMENT_RightParenthesis() throws RecognitionException {
        int FRAGMENT_RightParenthesis_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:277:36: ( ')' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:277:38: ')'
            {
            match(')'); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, FRAGMENT_RightParenthesis_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_RightParenthesis"

    // $ANTLR start "FRAGMENT_Asterisk"
    public final void mFRAGMENT_Asterisk() throws RecognitionException {
        int FRAGMENT_Asterisk_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:279:28: ( '*' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:279:30: '*'
            {
            match('*'); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, FRAGMENT_Asterisk_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Asterisk"

    // $ANTLR start "FRAGMENT_PlusSign"
    public final void mFRAGMENT_PlusSign() throws RecognitionException {
        int FRAGMENT_PlusSign_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:281:28: ( '+' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:281:30: '+'
            {
            match('+'); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, FRAGMENT_PlusSign_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_PlusSign"

    // $ANTLR start "FRAGMENT_Comma"
    public final void mFRAGMENT_Comma() throws RecognitionException {
        int FRAGMENT_Comma_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:283:25: ( ',' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:283:27: ','
            {
            match(','); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, FRAGMENT_Comma_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Comma"

    // $ANTLR start "FRAGMENT_HyphenMinus"
    public final void mFRAGMENT_HyphenMinus() throws RecognitionException {
        int FRAGMENT_HyphenMinus_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:285:31: ( '-' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:285:33: '-'
            {
            match('-'); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, FRAGMENT_HyphenMinus_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_HyphenMinus"

    // $ANTLR start "FRAGMENT_FullStop"
    public final void mFRAGMENT_FullStop() throws RecognitionException {
        int FRAGMENT_FullStop_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:287:28: ( '.' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:287:30: '.'
            {
            match('.'); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, FRAGMENT_FullStop_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_FullStop"

    // $ANTLR start "FRAGMENT_Solidus"
    public final void mFRAGMENT_Solidus() throws RecognitionException {
        int FRAGMENT_Solidus_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:289:27: ( '/' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:289:29: '/'
            {
            match('/'); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, FRAGMENT_Solidus_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Solidus"

    // $ANTLR start "FRAGMENT_Colon"
    public final void mFRAGMENT_Colon() throws RecognitionException {
        int FRAGMENT_Colon_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:291:25: ( ':' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:291:27: ':'
            {
            match(':'); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, FRAGMENT_Colon_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Colon"

    // $ANTLR start "FRAGMENT_Semicolon"
    public final void mFRAGMENT_Semicolon() throws RecognitionException {
        int FRAGMENT_Semicolon_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:293:29: ( ';' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:293:31: ';'
            {
            match(';'); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, FRAGMENT_Semicolon_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Semicolon"

    // $ANTLR start "FRAGMENT_LessThanSign"
    public final void mFRAGMENT_LessThanSign() throws RecognitionException {
        int FRAGMENT_LessThanSign_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:295:32: ( '<' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:295:34: '<'
            {
            match('<'); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, FRAGMENT_LessThanSign_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_LessThanSign"

    // $ANTLR start "FRAGMENT_EqualsSign"
    public final void mFRAGMENT_EqualsSign() throws RecognitionException {
        int FRAGMENT_EqualsSign_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:297:30: ( '=' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:297:32: '='
            {
            match('='); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, FRAGMENT_EqualsSign_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_EqualsSign"

    // $ANTLR start "FRAGMENT_GreaterThanSign"
    public final void mFRAGMENT_GreaterThanSign() throws RecognitionException {
        int FRAGMENT_GreaterThanSign_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:299:35: ( '>' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:299:37: '>'
            {
            match('>'); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, FRAGMENT_GreaterThanSign_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_GreaterThanSign"

    // $ANTLR start "FRAGMENT_QuestionMark"
    public final void mFRAGMENT_QuestionMark() throws RecognitionException {
        int FRAGMENT_QuestionMark_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:301:32: ( '?' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:301:34: '?'
            {
            match('?'); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, FRAGMENT_QuestionMark_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_QuestionMark"

    // $ANTLR start "FRAGMENT_CommercialAt"
    public final void mFRAGMENT_CommercialAt() throws RecognitionException {
        int FRAGMENT_CommercialAt_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:303:32: ( '@' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:303:34: '@'
            {
            match('@'); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, FRAGMENT_CommercialAt_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_CommercialAt"

    // $ANTLR start "FRAGMENT_LeftSquareBracket"
    public final void mFRAGMENT_LeftSquareBracket() throws RecognitionException {
        int FRAGMENT_LeftSquareBracket_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:305:37: ( '[' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:305:39: '['
            {
            match('['); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, FRAGMENT_LeftSquareBracket_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_LeftSquareBracket"

    // $ANTLR start "FRAGMENT_RightSquareBracket"
    public final void mFRAGMENT_RightSquareBracket() throws RecognitionException {
        int FRAGMENT_RightSquareBracket_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:307:38: ( ']' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:307:40: ']'
            {
            match(']'); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, FRAGMENT_RightSquareBracket_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_RightSquareBracket"

    // $ANTLR start "FRAGMENT_LeftCurlyBracket"
    public final void mFRAGMENT_LeftCurlyBracket() throws RecognitionException {
        int FRAGMENT_LeftCurlyBracket_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:309:36: ( '{' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:309:38: '{'
            {
            match('{'); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, FRAGMENT_LeftCurlyBracket_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_LeftCurlyBracket"

    // $ANTLR start "FRAGMENT_VerticalLine"
    public final void mFRAGMENT_VerticalLine() throws RecognitionException {
        int FRAGMENT_VerticalLine_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:311:32: ( '|' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:311:34: '|'
            {
            match('|'); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, FRAGMENT_VerticalLine_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_VerticalLine"

    // $ANTLR start "FRAGMENT_RightCurlyBracket"
    public final void mFRAGMENT_RightCurlyBracket() throws RecognitionException {
        int FRAGMENT_RightCurlyBracket_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:313:37: ( '}' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:313:39: '}'
            {
            match('}'); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, FRAGMENT_RightCurlyBracket_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_RightCurlyBracket"

    // $ANTLR start "FRAGMENT_ExclamationMarkEqualsSign"
    public final void mFRAGMENT_ExclamationMarkEqualsSign() throws RecognitionException {
        int FRAGMENT_ExclamationMarkEqualsSign_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:315:45: ( '!=' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:315:47: '!='
            {
            match("!="); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, FRAGMENT_ExclamationMarkEqualsSign_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_ExclamationMarkEqualsSign"

    // $ANTLR start "FRAGMENT_PercentSignEqualsSign"
    public final void mFRAGMENT_PercentSignEqualsSign() throws RecognitionException {
        int FRAGMENT_PercentSignEqualsSign_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:317:41: ( '%=' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:317:43: '%='
            {
            match("%="); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, FRAGMENT_PercentSignEqualsSign_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_PercentSignEqualsSign"

    // $ANTLR start "FRAGMENT_AmpersandAmpersand"
    public final void mFRAGMENT_AmpersandAmpersand() throws RecognitionException {
        int FRAGMENT_AmpersandAmpersand_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:319:38: ( '&&' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:319:40: '&&'
            {
            match("&&"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, FRAGMENT_AmpersandAmpersand_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_AmpersandAmpersand"

    // $ANTLR start "FRAGMENT_AsteriskAsterisk"
    public final void mFRAGMENT_AsteriskAsterisk() throws RecognitionException {
        int FRAGMENT_AsteriskAsterisk_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:321:36: ( '**' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:321:38: '**'
            {
            match("**"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, FRAGMENT_AsteriskAsterisk_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_AsteriskAsterisk"

    // $ANTLR start "FRAGMENT_AsteriskEqualsSign"
    public final void mFRAGMENT_AsteriskEqualsSign() throws RecognitionException {
        int FRAGMENT_AsteriskEqualsSign_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:323:38: ( '*=' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:323:40: '*='
            {
            match("*="); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 30, FRAGMENT_AsteriskEqualsSign_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_AsteriskEqualsSign"

    // $ANTLR start "FRAGMENT_PlusSignPlusSign"
    public final void mFRAGMENT_PlusSignPlusSign() throws RecognitionException {
        int FRAGMENT_PlusSignPlusSign_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:325:36: ( '++' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:325:38: '++'
            {
            match("++"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, FRAGMENT_PlusSignPlusSign_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_PlusSignPlusSign"

    // $ANTLR start "FRAGMENT_PlusSignEqualsSign"
    public final void mFRAGMENT_PlusSignEqualsSign() throws RecognitionException {
        int FRAGMENT_PlusSignEqualsSign_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:327:38: ( '+=' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:327:40: '+='
            {
            match("+="); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 32, FRAGMENT_PlusSignEqualsSign_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_PlusSignEqualsSign"

    // $ANTLR start "FRAGMENT_HyphenMinusHyphenMinus"
    public final void mFRAGMENT_HyphenMinusHyphenMinus() throws RecognitionException {
        int FRAGMENT_HyphenMinusHyphenMinus_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:329:42: ( '--' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:329:44: '--'
            {
            match("--"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, FRAGMENT_HyphenMinusHyphenMinus_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_HyphenMinusHyphenMinus"

    // $ANTLR start "FRAGMENT_HyphenMinusEqualsSign"
    public final void mFRAGMENT_HyphenMinusEqualsSign() throws RecognitionException {
        int FRAGMENT_HyphenMinusEqualsSign_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:331:41: ( '-=' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:331:43: '-='
            {
            match("-="); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 34, FRAGMENT_HyphenMinusEqualsSign_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_HyphenMinusEqualsSign"

    // $ANTLR start "FRAGMENT_HyphenMinusGreaterThanSign"
    public final void mFRAGMENT_HyphenMinusGreaterThanSign() throws RecognitionException {
        int FRAGMENT_HyphenMinusGreaterThanSign_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:333:46: ( '->' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:333:48: '->'
            {
            match("->"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, FRAGMENT_HyphenMinusGreaterThanSign_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_HyphenMinusGreaterThanSign"

    // $ANTLR start "FRAGMENT_FullStopFullStop"
    public final void mFRAGMENT_FullStopFullStop() throws RecognitionException {
        int FRAGMENT_FullStopFullStop_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:335:36: ( '..' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:335:38: '..'
            {
            match(".."); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 36, FRAGMENT_FullStopFullStop_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_FullStopFullStop"

    // $ANTLR start "FRAGMENT_SolidusEqualsSign"
    public final void mFRAGMENT_SolidusEqualsSign() throws RecognitionException {
        int FRAGMENT_SolidusEqualsSign_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:337:37: ( '/=' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:337:39: '/='
            {
            match("/="); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 37, FRAGMENT_SolidusEqualsSign_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_SolidusEqualsSign"

    // $ANTLR start "FRAGMENT_ColonColon"
    public final void mFRAGMENT_ColonColon() throws RecognitionException {
        int FRAGMENT_ColonColon_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:339:30: ( '::' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:339:32: '::'
            {
            match("::"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 38, FRAGMENT_ColonColon_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_ColonColon"

    // $ANTLR start "FRAGMENT_LessThanSignGreaterThanSign"
    public final void mFRAGMENT_LessThanSignGreaterThanSign() throws RecognitionException {
        int FRAGMENT_LessThanSignGreaterThanSign_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:341:47: ( '<>' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:341:49: '<>'
            {
            match("<>"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 39, FRAGMENT_LessThanSignGreaterThanSign_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_LessThanSignGreaterThanSign"

    // $ANTLR start "FRAGMENT_EqualsSignEqualsSign"
    public final void mFRAGMENT_EqualsSignEqualsSign() throws RecognitionException {
        int FRAGMENT_EqualsSignEqualsSign_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:343:40: ( '==' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:343:42: '=='
            {
            match("=="); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 40, FRAGMENT_EqualsSignEqualsSign_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_EqualsSignEqualsSign"

    // $ANTLR start "FRAGMENT_EqualsSignGreaterThanSign"
    public final void mFRAGMENT_EqualsSignGreaterThanSign() throws RecognitionException {
        int FRAGMENT_EqualsSignGreaterThanSign_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:345:45: ( '=>' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:345:47: '=>'
            {
            match("=>"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 41, FRAGMENT_EqualsSignGreaterThanSign_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_EqualsSignGreaterThanSign"

    // $ANTLR start "FRAGMENT_GreaterThanSignEqualsSign"
    public final void mFRAGMENT_GreaterThanSignEqualsSign() throws RecognitionException {
        int FRAGMENT_GreaterThanSignEqualsSign_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:347:45: ( '>=' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:347:47: '>='
            {
            match(">="); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 42, FRAGMENT_GreaterThanSignEqualsSign_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_GreaterThanSignEqualsSign"

    // $ANTLR start "FRAGMENT_QuestionMarkFullStop"
    public final void mFRAGMENT_QuestionMarkFullStop() throws RecognitionException {
        int FRAGMENT_QuestionMarkFullStop_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:349:40: ( '?.' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:349:42: '?.'
            {
            match("?."); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 43, FRAGMENT_QuestionMarkFullStop_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_QuestionMarkFullStop"

    // $ANTLR start "FRAGMENT_QuestionMarkColon"
    public final void mFRAGMENT_QuestionMarkColon() throws RecognitionException {
        int FRAGMENT_QuestionMarkColon_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:351:37: ( '?:' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:351:39: '?:'
            {
            match("?:"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 44, FRAGMENT_QuestionMarkColon_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_QuestionMarkColon"

    // $ANTLR start "FRAGMENT_As"
    public final void mFRAGMENT_As() throws RecognitionException {
        int FRAGMENT_As_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:353:22: ( 'as' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:353:24: 'as'
            {
            match("as"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 45, FRAGMENT_As_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_As"

    // $ANTLR start "FRAGMENT_Do"
    public final void mFRAGMENT_Do() throws RecognitionException {
        int FRAGMENT_Do_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:355:22: ( 'do' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:355:24: 'do'
            {
            match("do"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 46, FRAGMENT_Do_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Do"

    // $ANTLR start "FRAGMENT_If"
    public final void mFRAGMENT_If() throws RecognitionException {
        int FRAGMENT_If_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:357:22: ( 'if' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:357:24: 'if'
            {
            match("if"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 47, FRAGMENT_If_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_If"

    // $ANTLR start "FRAGMENT_VerticalLineVerticalLine"
    public final void mFRAGMENT_VerticalLineVerticalLine() throws RecognitionException {
        int FRAGMENT_VerticalLineVerticalLine_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:359:44: ( '||' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:359:46: '||'
            {
            match("||"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 48, FRAGMENT_VerticalLineVerticalLine_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_VerticalLineVerticalLine"

    // $ANTLR start "FRAGMENT_ExclamationMarkEqualsSignEqualsSign"
    public final void mFRAGMENT_ExclamationMarkEqualsSignEqualsSign() throws RecognitionException {
        int FRAGMENT_ExclamationMarkEqualsSignEqualsSign_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:361:55: ( '!==' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:361:57: '!=='
            {
            match("!=="); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 49, FRAGMENT_ExclamationMarkEqualsSignEqualsSign_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_ExclamationMarkEqualsSignEqualsSign"

    // $ANTLR start "FRAGMENT_FullStopFullStopFullStop"
    public final void mFRAGMENT_FullStopFullStopFullStop() throws RecognitionException {
        int FRAGMENT_FullStopFullStopFullStop_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:363:44: ( '...' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:363:46: '...'
            {
            match("..."); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 50, FRAGMENT_FullStopFullStopFullStop_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_FullStopFullStopFullStop"

    // $ANTLR start "FRAGMENT_FullStopFullStopLessThanSign"
    public final void mFRAGMENT_FullStopFullStopLessThanSign() throws RecognitionException {
        int FRAGMENT_FullStopFullStopLessThanSign_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:365:48: ( '..<' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:365:50: '..<'
            {
            match("..<"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 51, FRAGMENT_FullStopFullStopLessThanSign_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_FullStopFullStopLessThanSign"

    // $ANTLR start "FRAGMENT_EqualsSignEqualsSignEqualsSign"
    public final void mFRAGMENT_EqualsSignEqualsSignEqualsSign() throws RecognitionException {
        int FRAGMENT_EqualsSignEqualsSignEqualsSign_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:367:50: ( '===' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:367:52: '==='
            {
            match("==="); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 52, FRAGMENT_EqualsSignEqualsSignEqualsSign_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_EqualsSignEqualsSignEqualsSign"

    // $ANTLR start "FRAGMENT_All"
    public final void mFRAGMENT_All() throws RecognitionException {
        int FRAGMENT_All_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:369:23: ( 'all' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:369:25: 'all'
            {
            match("all"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 53, FRAGMENT_All_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_All"

    // $ANTLR start "FRAGMENT_Def"
    public final void mFRAGMENT_Def() throws RecognitionException {
        int FRAGMENT_Def_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:371:23: ( 'def' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:371:25: 'def'
            {
            match("def"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 54, FRAGMENT_Def_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Def"

    // $ANTLR start "FRAGMENT_For"
    public final void mFRAGMENT_For() throws RecognitionException {
        int FRAGMENT_For_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:373:23: ( 'for' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:373:25: 'for'
            {
            match("for"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 55, FRAGMENT_For_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_For"

    // $ANTLR start "FRAGMENT_New"
    public final void mFRAGMENT_New() throws RecognitionException {
        int FRAGMENT_New_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:375:23: ( 'new' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:375:25: 'new'
            {
            match("new"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 56, FRAGMENT_New_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_New"

    // $ANTLR start "FRAGMENT_Not"
    public final void mFRAGMENT_Not() throws RecognitionException {
        int FRAGMENT_Not_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:377:23: ( 'not' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:377:25: 'not'
            {
            match("not"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 57, FRAGMENT_Not_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Not"

    // $ANTLR start "FRAGMENT_Try"
    public final void mFRAGMENT_Try() throws RecognitionException {
        int FRAGMENT_Try_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:379:23: ( 'try' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:379:25: 'try'
            {
            match("try"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 58, FRAGMENT_Try_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Try"

    // $ANTLR start "FRAGMENT_Val"
    public final void mFRAGMENT_Val() throws RecognitionException {
        int FRAGMENT_Val_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:381:23: ( 'val' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:381:25: 'val'
            {
            match("val"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 59, FRAGMENT_Val_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Val"

    // $ANTLR start "FRAGMENT_Var"
    public final void mFRAGMENT_Var() throws RecognitionException {
        int FRAGMENT_Var_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:383:23: ( 'var' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:383:25: 'var'
            {
            match("var"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 60, FRAGMENT_Var_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Var"

    // $ANTLR start "FRAGMENT_Case"
    public final void mFRAGMENT_Case() throws RecognitionException {
        int FRAGMENT_Case_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:385:24: ( 'case' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:385:26: 'case'
            {
            match("case"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 61, FRAGMENT_Case_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Case"

    // $ANTLR start "FRAGMENT_Each"
    public final void mFRAGMENT_Each() throws RecognitionException {
        int FRAGMENT_Each_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:387:24: ( 'each' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:387:26: 'each'
            {
            match("each"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 62, FRAGMENT_Each_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Each"

    // $ANTLR start "FRAGMENT_Else"
    public final void mFRAGMENT_Else() throws RecognitionException {
        int FRAGMENT_Else_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:389:24: ( 'else' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:389:26: 'else'
            {
            match("else"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 63, FRAGMENT_Else_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Else"

    // $ANTLR start "FRAGMENT_Fact"
    public final void mFRAGMENT_Fact() throws RecognitionException {
        int FRAGMENT_Fact_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:391:24: ( 'fact' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:391:26: 'fact'
            {
            match("fact"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 64, FRAGMENT_Fact_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Fact"

    // $ANTLR start "FRAGMENT_Null"
    public final void mFRAGMENT_Null() throws RecognitionException {
        int FRAGMENT_Null_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:393:24: ( 'null' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:393:26: 'null'
            {
            match("null"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 65, FRAGMENT_Null_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Null"

    // $ANTLR start "FRAGMENT_True"
    public final void mFRAGMENT_True() throws RecognitionException {
        int FRAGMENT_True_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:395:24: ( 'true' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:395:26: 'true'
            {
            match("true"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 66, FRAGMENT_True_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_True"

    // $ANTLR start "FRAGMENT_After"
    public final void mFRAGMENT_After() throws RecognitionException {
        int FRAGMENT_After_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:397:25: ( 'after' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:397:27: 'after'
            {
            match("after"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 67, FRAGMENT_After_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_After"

    // $ANTLR start "FRAGMENT_Catch"
    public final void mFRAGMENT_Catch() throws RecognitionException {
        int FRAGMENT_Catch_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:399:25: ( 'catch' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:399:27: 'catch'
            {
            match("catch"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 68, FRAGMENT_Catch_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Catch"

    // $ANTLR start "FRAGMENT_Facts"
    public final void mFRAGMENT_Facts() throws RecognitionException {
        int FRAGMENT_Facts_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:401:25: ( 'facts' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:401:27: 'facts'
            {
            match("facts"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 69, FRAGMENT_Facts_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Facts"

    // $ANTLR start "FRAGMENT_False"
    public final void mFRAGMENT_False() throws RecognitionException {
        int FRAGMENT_False_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:403:25: ( 'false' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:403:27: 'false'
            {
            match("false"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 70, FRAGMENT_False_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_False"

    // $ANTLR start "FRAGMENT_Final"
    public final void mFRAGMENT_Final() throws RecognitionException {
        int FRAGMENT_Final_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:405:25: ( 'final' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:405:27: 'final'
            {
            match("final"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 71, FRAGMENT_Final_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Final"

    // $ANTLR start "FRAGMENT_Super"
    public final void mFRAGMENT_Super() throws RecognitionException {
        int FRAGMENT_Super_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:407:25: ( 'super' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:407:27: 'super'
            {
            match("super"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 72, FRAGMENT_Super_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Super"

    // $ANTLR start "FRAGMENT_Throw"
    public final void mFRAGMENT_Throw() throws RecognitionException {
        int FRAGMENT_Throw_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:409:25: ( 'throw' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:409:27: 'throw'
            {
            match("throw"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 73, FRAGMENT_Throw_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Throw"

    // $ANTLR start "FRAGMENT_While"
    public final void mFRAGMENT_While() throws RecognitionException {
        int FRAGMENT_While_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:411:25: ( 'while' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:411:27: 'while'
            {
            match("while"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 74, FRAGMENT_While_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_While"

    // $ANTLR start "FRAGMENT_Assert"
    public final void mFRAGMENT_Assert() throws RecognitionException {
        int FRAGMENT_Assert_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:413:26: ( 'assert' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:413:28: 'assert'
            {
            match("assert"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 75, FRAGMENT_Assert_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Assert"

    // $ANTLR start "FRAGMENT_Before"
    public final void mFRAGMENT_Before() throws RecognitionException {
        int FRAGMENT_Before_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:415:26: ( 'before' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:415:28: 'before'
            {
            match("before"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 76, FRAGMENT_Before_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Before"

    // $ANTLR start "FRAGMENT_Import"
    public final void mFRAGMENT_Import() throws RecognitionException {
        int FRAGMENT_Import_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:417:26: ( 'import' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:417:28: 'import'
            {
            match("import"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 77, FRAGMENT_Import_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Import"

    // $ANTLR start "FRAGMENT_Native"
    public final void mFRAGMENT_Native() throws RecognitionException {
        int FRAGMENT_Native_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:419:26: ( 'native' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:419:28: 'native'
            {
            match("native"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 78, FRAGMENT_Native_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Native"

    // $ANTLR start "FRAGMENT_Public"
    public final void mFRAGMENT_Public() throws RecognitionException {
        int FRAGMENT_Public_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:421:26: ( 'public' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:421:28: 'public'
            {
            match("public"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 79, FRAGMENT_Public_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Public"

    // $ANTLR start "FRAGMENT_Return"
    public final void mFRAGMENT_Return() throws RecognitionException {
        int FRAGMENT_Return_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:423:26: ( 'return' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:423:28: 'return'
            {
            match("return"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 80, FRAGMENT_Return_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Return"

    // $ANTLR start "FRAGMENT_Should"
    public final void mFRAGMENT_Should() throws RecognitionException {
        int FRAGMENT_Should_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:425:26: ( 'should' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:425:28: 'should'
            {
            match("should"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 81, FRAGMENT_Should_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Should"

    // $ANTLR start "FRAGMENT_Static"
    public final void mFRAGMENT_Static() throws RecognitionException {
        int FRAGMENT_Static_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:427:26: ( 'static' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:427:28: 'static'
            {
            match("static"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 82, FRAGMENT_Static_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Static"

    // $ANTLR start "FRAGMENT_Switch"
    public final void mFRAGMENT_Switch() throws RecognitionException {
        int FRAGMENT_Switch_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:429:26: ( 'switch' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:429:28: 'switch'
            {
            match("switch"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 83, FRAGMENT_Switch_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Switch"

    // $ANTLR start "FRAGMENT_Throws"
    public final void mFRAGMENT_Throws() throws RecognitionException {
        int FRAGMENT_Throws_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:431:26: ( 'throws' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:431:28: 'throws'
            {
            match("throws"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 84, FRAGMENT_Throws_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Throws"

    // $ANTLR start "FRAGMENT_Typeof"
    public final void mFRAGMENT_Typeof() throws RecognitionException {
        int FRAGMENT_Typeof_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:433:26: ( 'typeof' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:433:28: 'typeof'
            {
            match("typeof"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 85, FRAGMENT_Typeof_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Typeof"

    // $ANTLR start "FRAGMENT_Context"
    public final void mFRAGMENT_Context() throws RecognitionException {
        int FRAGMENT_Context_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:435:27: ( 'context' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:435:29: 'context'
            {
            match("context"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 86, FRAGMENT_Context_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Context"

    // $ANTLR start "FRAGMENT_Default"
    public final void mFRAGMENT_Default() throws RecognitionException {
        int FRAGMENT_Default_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:437:27: ( 'default' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:437:29: 'default'
            {
            match("default"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 87, FRAGMENT_Default_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Default"

    // $ANTLR start "FRAGMENT_Extends"
    public final void mFRAGMENT_Extends() throws RecognitionException {
        int FRAGMENT_Extends_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:439:27: ( 'extends' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:439:29: 'extends'
            {
            match("extends"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 88, FRAGMENT_Extends_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Extends"

    // $ANTLR start "FRAGMENT_Finally"
    public final void mFRAGMENT_Finally() throws RecognitionException {
        int FRAGMENT_Finally_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:441:27: ( 'finally' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:441:29: 'finally'
            {
            match("finally"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 89, FRAGMENT_Finally_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Finally"

    // $ANTLR start "FRAGMENT_Package"
    public final void mFRAGMENT_Package() throws RecognitionException {
        int FRAGMENT_Package_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:443:27: ( 'package' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:443:29: 'package'
            {
            match("package"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 90, FRAGMENT_Package_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Package"

    // $ANTLR start "FRAGMENT_Pending"
    public final void mFRAGMENT_Pending() throws RecognitionException {
        int FRAGMENT_Pending_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:445:27: ( 'pending' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:445:29: 'pending'
            {
            match("pending"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 91, FRAGMENT_Pending_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Pending"

    // $ANTLR start "FRAGMENT_Private"
    public final void mFRAGMENT_Private() throws RecognitionException {
        int FRAGMENT_Private_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:447:27: ( 'private' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:447:29: 'private'
            {
            match("private"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 92, FRAGMENT_Private_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Private"

    // $ANTLR start "FRAGMENT_Abstract"
    public final void mFRAGMENT_Abstract() throws RecognitionException {
        int FRAGMENT_Abstract_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:449:28: ( 'abstract' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:449:30: 'abstract'
            {
            match("abstract"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 93, FRAGMENT_Abstract_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Abstract"

    // $ANTLR start "FRAGMENT_Describe"
    public final void mFRAGMENT_Describe() throws RecognitionException {
        int FRAGMENT_Describe_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:451:28: ( 'describe' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:451:30: 'describe'
            {
            match("describe"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 94, FRAGMENT_Describe_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Describe"

    // $ANTLR start "FRAGMENT_Dispatch"
    public final void mFRAGMENT_Dispatch() throws RecognitionException {
        int FRAGMENT_Dispatch_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:453:28: ( 'dispatch' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:453:30: 'dispatch'
            {
            match("dispatch"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 95, FRAGMENT_Dispatch_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Dispatch"

    // $ANTLR start "FRAGMENT_Override"
    public final void mFRAGMENT_Override() throws RecognitionException {
        int FRAGMENT_Override_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:455:28: ( 'override' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:455:30: 'override'
            {
            match("override"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 96, FRAGMENT_Override_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Override"

    // $ANTLR start "FRAGMENT_Strictfp"
    public final void mFRAGMENT_Strictfp() throws RecognitionException {
        int FRAGMENT_Strictfp_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:457:28: ( 'strictfp' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:457:30: 'strictfp'
            {
            match("strictfp"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 97, FRAGMENT_Strictfp_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Strictfp"

    // $ANTLR start "FRAGMENT_Volatile"
    public final void mFRAGMENT_Volatile() throws RecognitionException {
        int FRAGMENT_Volatile_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:459:28: ( 'volatile' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:459:30: 'volatile'
            {
            match("volatile"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 98, FRAGMENT_Volatile_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Volatile"

    // $ANTLR start "FRAGMENT_Extension"
    public final void mFRAGMENT_Extension() throws RecognitionException {
        int FRAGMENT_Extension_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:461:29: ( 'extension' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:461:31: 'extension'
            {
            match("extension"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 99, FRAGMENT_Extension_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Extension"

    // $ANTLR start "FRAGMENT_Protected"
    public final void mFRAGMENT_Protected() throws RecognitionException {
        int FRAGMENT_Protected_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:463:29: ( 'protected' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:463:31: 'protected'
            {
            match("protected"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 100, FRAGMENT_Protected_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Protected"

    // $ANTLR start "FRAGMENT_Transient"
    public final void mFRAGMENT_Transient() throws RecognitionException {
        int FRAGMENT_Transient_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:465:29: ( 'transient' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:465:31: 'transient'
            {
            match("transient"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 101, FRAGMENT_Transient_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Transient"

    // $ANTLR start "FRAGMENT_Instanceof"
    public final void mFRAGMENT_Instanceof() throws RecognitionException {
        int FRAGMENT_Instanceof_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:467:30: ( 'instanceof' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:467:32: 'instanceof'
            {
            match("instanceof"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 102, FRAGMENT_Instanceof_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Instanceof"

    // $ANTLR start "FRAGMENT_Synchronized"
    public final void mFRAGMENT_Synchronized() throws RecognitionException {
        int FRAGMENT_Synchronized_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:469:32: ( 'synchronized' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:469:34: 'synchronized'
            {
            match("synchronized"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 103, FRAGMENT_Synchronized_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_Synchronized"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        int RULE_ML_COMMENT_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:474:26: ( FRAGMENT_RULE_ML_COMMENT )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:474:28: FRAGMENT_RULE_ML_COMMENT
            {
            mFRAGMENT_RULE_ML_COMMENT(); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 104, RULE_ML_COMMENT_StartIndex); }
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "FRAGMENT_RULE_ML_COMMENT"
    public final void mFRAGMENT_RULE_ML_COMMENT() throws RecognitionException {
        int FRAGMENT_RULE_ML_COMMENT_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:475:35: ( '/*' ( options {greedy=false; } : . )* ~ ( '\\\\' ) '*/' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:475:37: '/*' ( options {greedy=false; } : . )* ~ ( '\\\\' ) '*/'
            {
            match("/*"); if (state.failed) return ;

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:475:42: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='*') ) {
                        int LA2_3 = input.LA(3);

                        if ( (LA2_3=='/') ) {
                            alt2=2;
                        }
                        else if ( ((LA2_3>='\u0000' && LA2_3<='.')||(LA2_3>='0' && LA2_3<='\uFFFF')) ) {
                            alt2=1;
                        }


                    }
                    else if ( ((LA2_1>='\u0000' && LA2_1<=')')||(LA2_1>='+' && LA2_1<='\uFFFF')) ) {
                        alt2=1;
                    }


                }
                else if ( (LA2_0=='\\') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:475:70: .
            	    {
            	    matchAny(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            if ( (input.LA(1)>='\u0000' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match("*/"); if (state.failed) return ;


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 105, FRAGMENT_RULE_ML_COMMENT_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_RULE_ML_COMMENT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        int RULE_ID_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:477:18: ( FRAGMENT_RULE_ID )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:477:20: FRAGMENT_RULE_ID
            {
            mFRAGMENT_RULE_ID(); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 106, RULE_ID_StartIndex); }
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "FRAGMENT_RULE_ID"
    public final void mFRAGMENT_RULE_ID() throws RecognitionException {
        int FRAGMENT_RULE_ID_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:478:27: ( ( '^' )? ( RULE_IDENTIFIER_START | RULE_UNICODE_ESCAPE ) ( RULE_IDENTIFIER_PART | RULE_UNICODE_ESCAPE )* )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:478:29: ( '^' )? ( RULE_IDENTIFIER_START | RULE_UNICODE_ESCAPE ) ( RULE_IDENTIFIER_PART | RULE_UNICODE_ESCAPE )*
            {
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:478:29: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:0:0: '^'
                    {
                    match('^'); if (state.failed) return ;

                    }
                    break;

            }

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:478:34: ( RULE_IDENTIFIER_START | RULE_UNICODE_ESCAPE )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='$'||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')||(LA4_0>='\u00A2' && LA4_0<='\u00A5')||LA4_0=='\u00AA'||LA4_0=='\u00B5'||LA4_0=='\u00BA'||(LA4_0>='\u00C0' && LA4_0<='\u00D6')||(LA4_0>='\u00D8' && LA4_0<='\u00F6')||(LA4_0>='\u00F8' && LA4_0<='\u0236')||(LA4_0>='\u0250' && LA4_0<='\u02C1')||(LA4_0>='\u02C6' && LA4_0<='\u02D1')||(LA4_0>='\u02E0' && LA4_0<='\u02E4')||LA4_0=='\u02EE'||LA4_0=='\u037A'||LA4_0=='\u0386'||(LA4_0>='\u0388' && LA4_0<='\u038A')||LA4_0=='\u038C'||(LA4_0>='\u038E' && LA4_0<='\u03A1')||(LA4_0>='\u03A3' && LA4_0<='\u03CE')||(LA4_0>='\u03D0' && LA4_0<='\u03F5')||(LA4_0>='\u03F7' && LA4_0<='\u03FB')||(LA4_0>='\u0400' && LA4_0<='\u0481')||(LA4_0>='\u048A' && LA4_0<='\u04CE')||(LA4_0>='\u04D0' && LA4_0<='\u04F5')||(LA4_0>='\u04F8' && LA4_0<='\u04F9')||(LA4_0>='\u0500' && LA4_0<='\u050F')||(LA4_0>='\u0531' && LA4_0<='\u0556')||LA4_0=='\u0559'||(LA4_0>='\u0561' && LA4_0<='\u0587')||(LA4_0>='\u05D0' && LA4_0<='\u05EA')||(LA4_0>='\u05F0' && LA4_0<='\u05F2')||(LA4_0>='\u0621' && LA4_0<='\u063A')||(LA4_0>='\u0640' && LA4_0<='\u064A')||(LA4_0>='\u066E' && LA4_0<='\u066F')||(LA4_0>='\u0671' && LA4_0<='\u06D3')||LA4_0=='\u06D5'||(LA4_0>='\u06E5' && LA4_0<='\u06E6')||(LA4_0>='\u06EE' && LA4_0<='\u06EF')||(LA4_0>='\u06FA' && LA4_0<='\u06FC')||LA4_0=='\u06FF'||LA4_0=='\u0710'||(LA4_0>='\u0712' && LA4_0<='\u072F')||(LA4_0>='\u074D' && LA4_0<='\u074F')||(LA4_0>='\u0780' && LA4_0<='\u07A5')||LA4_0=='\u07B1'||(LA4_0>='\u0904' && LA4_0<='\u0939')||LA4_0=='\u093D'||LA4_0=='\u0950'||(LA4_0>='\u0958' && LA4_0<='\u0961')||(LA4_0>='\u0985' && LA4_0<='\u098C')||(LA4_0>='\u098F' && LA4_0<='\u0990')||(LA4_0>='\u0993' && LA4_0<='\u09A8')||(LA4_0>='\u09AA' && LA4_0<='\u09B0')||LA4_0=='\u09B2'||(LA4_0>='\u09B6' && LA4_0<='\u09B9')||LA4_0=='\u09BD'||(LA4_0>='\u09DC' && LA4_0<='\u09DD')||(LA4_0>='\u09DF' && LA4_0<='\u09E1')||(LA4_0>='\u09F0' && LA4_0<='\u09F3')||(LA4_0>='\u0A05' && LA4_0<='\u0A0A')||(LA4_0>='\u0A0F' && LA4_0<='\u0A10')||(LA4_0>='\u0A13' && LA4_0<='\u0A28')||(LA4_0>='\u0A2A' && LA4_0<='\u0A30')||(LA4_0>='\u0A32' && LA4_0<='\u0A33')||(LA4_0>='\u0A35' && LA4_0<='\u0A36')||(LA4_0>='\u0A38' && LA4_0<='\u0A39')||(LA4_0>='\u0A59' && LA4_0<='\u0A5C')||LA4_0=='\u0A5E'||(LA4_0>='\u0A72' && LA4_0<='\u0A74')||(LA4_0>='\u0A85' && LA4_0<='\u0A8D')||(LA4_0>='\u0A8F' && LA4_0<='\u0A91')||(LA4_0>='\u0A93' && LA4_0<='\u0AA8')||(LA4_0>='\u0AAA' && LA4_0<='\u0AB0')||(LA4_0>='\u0AB2' && LA4_0<='\u0AB3')||(LA4_0>='\u0AB5' && LA4_0<='\u0AB9')||LA4_0=='\u0ABD'||LA4_0=='\u0AD0'||(LA4_0>='\u0AE0' && LA4_0<='\u0AE1')||LA4_0=='\u0AF1'||(LA4_0>='\u0B05' && LA4_0<='\u0B0C')||(LA4_0>='\u0B0F' && LA4_0<='\u0B10')||(LA4_0>='\u0B13' && LA4_0<='\u0B28')||(LA4_0>='\u0B2A' && LA4_0<='\u0B30')||(LA4_0>='\u0B32' && LA4_0<='\u0B33')||(LA4_0>='\u0B35' && LA4_0<='\u0B39')||LA4_0=='\u0B3D'||(LA4_0>='\u0B5C' && LA4_0<='\u0B5D')||(LA4_0>='\u0B5F' && LA4_0<='\u0B61')||LA4_0=='\u0B71'||LA4_0=='\u0B83'||(LA4_0>='\u0B85' && LA4_0<='\u0B8A')||(LA4_0>='\u0B8E' && LA4_0<='\u0B90')||(LA4_0>='\u0B92' && LA4_0<='\u0B95')||(LA4_0>='\u0B99' && LA4_0<='\u0B9A')||LA4_0=='\u0B9C'||(LA4_0>='\u0B9E' && LA4_0<='\u0B9F')||(LA4_0>='\u0BA3' && LA4_0<='\u0BA4')||(LA4_0>='\u0BA8' && LA4_0<='\u0BAA')||(LA4_0>='\u0BAE' && LA4_0<='\u0BB5')||(LA4_0>='\u0BB7' && LA4_0<='\u0BB9')||LA4_0=='\u0BF9'||(LA4_0>='\u0C05' && LA4_0<='\u0C0C')||(LA4_0>='\u0C0E' && LA4_0<='\u0C10')||(LA4_0>='\u0C12' && LA4_0<='\u0C28')||(LA4_0>='\u0C2A' && LA4_0<='\u0C33')||(LA4_0>='\u0C35' && LA4_0<='\u0C39')||(LA4_0>='\u0C60' && LA4_0<='\u0C61')||(LA4_0>='\u0C85' && LA4_0<='\u0C8C')||(LA4_0>='\u0C8E' && LA4_0<='\u0C90')||(LA4_0>='\u0C92' && LA4_0<='\u0CA8')||(LA4_0>='\u0CAA' && LA4_0<='\u0CB3')||(LA4_0>='\u0CB5' && LA4_0<='\u0CB9')||LA4_0=='\u0CBD'||LA4_0=='\u0CDE'||(LA4_0>='\u0CE0' && LA4_0<='\u0CE1')||(LA4_0>='\u0D05' && LA4_0<='\u0D0C')||(LA4_0>='\u0D0E' && LA4_0<='\u0D10')||(LA4_0>='\u0D12' && LA4_0<='\u0D28')||(LA4_0>='\u0D2A' && LA4_0<='\u0D39')||(LA4_0>='\u0D60' && LA4_0<='\u0D61')||(LA4_0>='\u0D85' && LA4_0<='\u0D96')||(LA4_0>='\u0D9A' && LA4_0<='\u0DB1')||(LA4_0>='\u0DB3' && LA4_0<='\u0DBB')||LA4_0=='\u0DBD'||(LA4_0>='\u0DC0' && LA4_0<='\u0DC6')||(LA4_0>='\u0E01' && LA4_0<='\u0E30')||(LA4_0>='\u0E32' && LA4_0<='\u0E33')||(LA4_0>='\u0E3F' && LA4_0<='\u0E46')||(LA4_0>='\u0E81' && LA4_0<='\u0E82')||LA4_0=='\u0E84'||(LA4_0>='\u0E87' && LA4_0<='\u0E88')||LA4_0=='\u0E8A'||LA4_0=='\u0E8D'||(LA4_0>='\u0E94' && LA4_0<='\u0E97')||(LA4_0>='\u0E99' && LA4_0<='\u0E9F')||(LA4_0>='\u0EA1' && LA4_0<='\u0EA3')||LA4_0=='\u0EA5'||LA4_0=='\u0EA7'||(LA4_0>='\u0EAA' && LA4_0<='\u0EAB')||(LA4_0>='\u0EAD' && LA4_0<='\u0EB0')||(LA4_0>='\u0EB2' && LA4_0<='\u0EB3')||LA4_0=='\u0EBD'||(LA4_0>='\u0EC0' && LA4_0<='\u0EC4')||LA4_0=='\u0EC6'||(LA4_0>='\u0EDC' && LA4_0<='\u0EDD')||LA4_0=='\u0F00'||(LA4_0>='\u0F40' && LA4_0<='\u0F47')||(LA4_0>='\u0F49' && LA4_0<='\u0F6A')||(LA4_0>='\u0F88' && LA4_0<='\u0F8B')||(LA4_0>='\u1000' && LA4_0<='\u1021')||(LA4_0>='\u1023' && LA4_0<='\u1027')||(LA4_0>='\u1029' && LA4_0<='\u102A')||(LA4_0>='\u1050' && LA4_0<='\u1055')||(LA4_0>='\u10A0' && LA4_0<='\u10C5')||(LA4_0>='\u10D0' && LA4_0<='\u10F8')||(LA4_0>='\u1100' && LA4_0<='\u1159')||(LA4_0>='\u115F' && LA4_0<='\u11A2')||(LA4_0>='\u11A8' && LA4_0<='\u11F9')||(LA4_0>='\u1200' && LA4_0<='\u1206')||(LA4_0>='\u1208' && LA4_0<='\u1246')||LA4_0=='\u1248'||(LA4_0>='\u124A' && LA4_0<='\u124D')||(LA4_0>='\u1250' && LA4_0<='\u1256')||LA4_0=='\u1258'||(LA4_0>='\u125A' && LA4_0<='\u125D')||(LA4_0>='\u1260' && LA4_0<='\u1286')||LA4_0=='\u1288'||(LA4_0>='\u128A' && LA4_0<='\u128D')||(LA4_0>='\u1290' && LA4_0<='\u12AE')||LA4_0=='\u12B0'||(LA4_0>='\u12B2' && LA4_0<='\u12B5')||(LA4_0>='\u12B8' && LA4_0<='\u12BE')||LA4_0=='\u12C0'||(LA4_0>='\u12C2' && LA4_0<='\u12C5')||(LA4_0>='\u12C8' && LA4_0<='\u12CE')||(LA4_0>='\u12D0' && LA4_0<='\u12D6')||(LA4_0>='\u12D8' && LA4_0<='\u12EE')||(LA4_0>='\u12F0' && LA4_0<='\u130E')||LA4_0=='\u1310'||(LA4_0>='\u1312' && LA4_0<='\u1315')||(LA4_0>='\u1318' && LA4_0<='\u131E')||(LA4_0>='\u1320' && LA4_0<='\u1346')||(LA4_0>='\u1348' && LA4_0<='\u135A')||(LA4_0>='\u13A0' && LA4_0<='\u13F4')||(LA4_0>='\u1401' && LA4_0<='\u166C')||(LA4_0>='\u166F' && LA4_0<='\u1676')||(LA4_0>='\u1681' && LA4_0<='\u169A')||(LA4_0>='\u16A0' && LA4_0<='\u16EA')||(LA4_0>='\u16EE' && LA4_0<='\u16F0')||(LA4_0>='\u1700' && LA4_0<='\u170C')||(LA4_0>='\u170E' && LA4_0<='\u1711')||(LA4_0>='\u1720' && LA4_0<='\u1731')||(LA4_0>='\u1740' && LA4_0<='\u1751')||(LA4_0>='\u1760' && LA4_0<='\u176C')||(LA4_0>='\u176E' && LA4_0<='\u1770')||(LA4_0>='\u1780' && LA4_0<='\u17B3')||LA4_0=='\u17D7'||(LA4_0>='\u17DB' && LA4_0<='\u17DC')||(LA4_0>='\u1820' && LA4_0<='\u1877')||(LA4_0>='\u1880' && LA4_0<='\u18A8')||(LA4_0>='\u1900' && LA4_0<='\u191C')||(LA4_0>='\u1950' && LA4_0<='\u196D')||(LA4_0>='\u1970' && LA4_0<='\u1974')||(LA4_0>='\u1D00' && LA4_0<='\u1D6B')||(LA4_0>='\u1E00' && LA4_0<='\u1E9B')||(LA4_0>='\u1EA0' && LA4_0<='\u1EF9')||(LA4_0>='\u1F00' && LA4_0<='\u1F15')||(LA4_0>='\u1F18' && LA4_0<='\u1F1D')||(LA4_0>='\u1F20' && LA4_0<='\u1F45')||(LA4_0>='\u1F48' && LA4_0<='\u1F4D')||(LA4_0>='\u1F50' && LA4_0<='\u1F57')||LA4_0=='\u1F59'||LA4_0=='\u1F5B'||LA4_0=='\u1F5D'||(LA4_0>='\u1F5F' && LA4_0<='\u1F7D')||(LA4_0>='\u1F80' && LA4_0<='\u1FB4')||(LA4_0>='\u1FB6' && LA4_0<='\u1FBC')||LA4_0=='\u1FBE'||(LA4_0>='\u1FC2' && LA4_0<='\u1FC4')||(LA4_0>='\u1FC6' && LA4_0<='\u1FCC')||(LA4_0>='\u1FD0' && LA4_0<='\u1FD3')||(LA4_0>='\u1FD6' && LA4_0<='\u1FDB')||(LA4_0>='\u1FE0' && LA4_0<='\u1FEC')||(LA4_0>='\u1FF2' && LA4_0<='\u1FF4')||(LA4_0>='\u1FF6' && LA4_0<='\u1FFC')||(LA4_0>='\u203F' && LA4_0<='\u2040')||LA4_0=='\u2054'||LA4_0=='\u2071'||LA4_0=='\u207F'||(LA4_0>='\u20A0' && LA4_0<='\u20B1')||LA4_0=='\u2102'||LA4_0=='\u2107'||(LA4_0>='\u210A' && LA4_0<='\u2113')||LA4_0=='\u2115'||(LA4_0>='\u2119' && LA4_0<='\u211D')||LA4_0=='\u2124'||LA4_0=='\u2126'||LA4_0=='\u2128'||(LA4_0>='\u212A' && LA4_0<='\u212D')||(LA4_0>='\u212F' && LA4_0<='\u2131')||(LA4_0>='\u2133' && LA4_0<='\u2139')||(LA4_0>='\u213D' && LA4_0<='\u213F')||(LA4_0>='\u2145' && LA4_0<='\u2149')||(LA4_0>='\u2160' && LA4_0<='\u2183')||(LA4_0>='\u3005' && LA4_0<='\u3007')||(LA4_0>='\u3021' && LA4_0<='\u3029')||(LA4_0>='\u3031' && LA4_0<='\u3035')||(LA4_0>='\u3038' && LA4_0<='\u303C')||(LA4_0>='\u3041' && LA4_0<='\u3096')||(LA4_0>='\u309D' && LA4_0<='\u309F')||(LA4_0>='\u30A1' && LA4_0<='\u30FF')||(LA4_0>='\u3105' && LA4_0<='\u312C')||(LA4_0>='\u3131' && LA4_0<='\u318E')||(LA4_0>='\u31A0' && LA4_0<='\u31B7')||(LA4_0>='\u31F0' && LA4_0<='\u31FF')||(LA4_0>='\u3400' && LA4_0<='\u4DB5')||(LA4_0>='\u4E00' && LA4_0<='\u9FA5')||(LA4_0>='\uA000' && LA4_0<='\uA48C')||(LA4_0>='\uAC00' && LA4_0<='\uD7A3')||(LA4_0>='\uF900' && LA4_0<='\uFA2D')||(LA4_0>='\uFA30' && LA4_0<='\uFA6A')||(LA4_0>='\uFB00' && LA4_0<='\uFB06')||(LA4_0>='\uFB13' && LA4_0<='\uFB17')||LA4_0=='\uFB1D'||(LA4_0>='\uFB1F' && LA4_0<='\uFB28')||(LA4_0>='\uFB2A' && LA4_0<='\uFB36')||(LA4_0>='\uFB38' && LA4_0<='\uFB3C')||LA4_0=='\uFB3E'||(LA4_0>='\uFB40' && LA4_0<='\uFB41')||(LA4_0>='\uFB43' && LA4_0<='\uFB44')||(LA4_0>='\uFB46' && LA4_0<='\uFBB1')||(LA4_0>='\uFBD3' && LA4_0<='\uFD3D')||(LA4_0>='\uFD50' && LA4_0<='\uFD8F')||(LA4_0>='\uFD92' && LA4_0<='\uFDC7')||(LA4_0>='\uFDF0' && LA4_0<='\uFDFC')||(LA4_0>='\uFE33' && LA4_0<='\uFE34')||(LA4_0>='\uFE4D' && LA4_0<='\uFE4F')||LA4_0=='\uFE69'||(LA4_0>='\uFE70' && LA4_0<='\uFE74')||(LA4_0>='\uFE76' && LA4_0<='\uFEFC')||LA4_0=='\uFF04'||(LA4_0>='\uFF21' && LA4_0<='\uFF3A')||LA4_0=='\uFF3F'||(LA4_0>='\uFF41' && LA4_0<='\uFF5A')||(LA4_0>='\uFF65' && LA4_0<='\uFFBE')||(LA4_0>='\uFFC2' && LA4_0<='\uFFC7')||(LA4_0>='\uFFCA' && LA4_0<='\uFFCF')||(LA4_0>='\uFFD2' && LA4_0<='\uFFD7')||(LA4_0>='\uFFDA' && LA4_0<='\uFFDC')||(LA4_0>='\uFFE0' && LA4_0<='\uFFE1')||(LA4_0>='\uFFE5' && LA4_0<='\uFFE6')) ) {
                alt4=1;
            }
            else if ( (LA4_0=='\\') ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:478:35: RULE_IDENTIFIER_START
                    {
                    mRULE_IDENTIFIER_START(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:478:57: RULE_UNICODE_ESCAPE
                    {
                    mRULE_UNICODE_ESCAPE(); if (state.failed) return ;

                    }
                    break;

            }

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:478:78: ( RULE_IDENTIFIER_PART | RULE_UNICODE_ESCAPE )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='\b')||(LA5_0>='\u000E' && LA5_0<='\u001B')||LA5_0=='$'||(LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')||(LA5_0>='\u007F' && LA5_0<='\u009F')||(LA5_0>='\u00A2' && LA5_0<='\u00A5')||LA5_0=='\u00AA'||LA5_0=='\u00AD'||LA5_0=='\u00B5'||LA5_0=='\u00BA'||(LA5_0>='\u00C0' && LA5_0<='\u00D6')||(LA5_0>='\u00D8' && LA5_0<='\u00F6')||(LA5_0>='\u00F8' && LA5_0<='\u0236')||(LA5_0>='\u0250' && LA5_0<='\u02C1')||(LA5_0>='\u02C6' && LA5_0<='\u02D1')||(LA5_0>='\u02E0' && LA5_0<='\u02E4')||LA5_0=='\u02EE'||(LA5_0>='\u0300' && LA5_0<='\u0357')||(LA5_0>='\u035D' && LA5_0<='\u036F')||LA5_0=='\u037A'||LA5_0=='\u0386'||(LA5_0>='\u0388' && LA5_0<='\u038A')||LA5_0=='\u038C'||(LA5_0>='\u038E' && LA5_0<='\u03A1')||(LA5_0>='\u03A3' && LA5_0<='\u03CE')||(LA5_0>='\u03D0' && LA5_0<='\u03F5')||(LA5_0>='\u03F7' && LA5_0<='\u03FB')||(LA5_0>='\u0400' && LA5_0<='\u0481')||(LA5_0>='\u0483' && LA5_0<='\u0486')||(LA5_0>='\u048A' && LA5_0<='\u04CE')||(LA5_0>='\u04D0' && LA5_0<='\u04F5')||(LA5_0>='\u04F8' && LA5_0<='\u04F9')||(LA5_0>='\u0500' && LA5_0<='\u050F')||(LA5_0>='\u0531' && LA5_0<='\u0556')||LA5_0=='\u0559'||(LA5_0>='\u0561' && LA5_0<='\u0587')||(LA5_0>='\u0591' && LA5_0<='\u05A1')||(LA5_0>='\u05A3' && LA5_0<='\u05B9')||(LA5_0>='\u05BB' && LA5_0<='\u05BD')||LA5_0=='\u05BF'||(LA5_0>='\u05C1' && LA5_0<='\u05C2')||LA5_0=='\u05C4'||(LA5_0>='\u05D0' && LA5_0<='\u05EA')||(LA5_0>='\u05F0' && LA5_0<='\u05F2')||(LA5_0>='\u0600' && LA5_0<='\u0603')||(LA5_0>='\u0610' && LA5_0<='\u0615')||(LA5_0>='\u0621' && LA5_0<='\u063A')||(LA5_0>='\u0640' && LA5_0<='\u0658')||(LA5_0>='\u0660' && LA5_0<='\u0669')||(LA5_0>='\u066E' && LA5_0<='\u06D3')||(LA5_0>='\u06D5' && LA5_0<='\u06DD')||(LA5_0>='\u06DF' && LA5_0<='\u06E8')||(LA5_0>='\u06EA' && LA5_0<='\u06FC')||LA5_0=='\u06FF'||(LA5_0>='\u070F' && LA5_0<='\u074A')||(LA5_0>='\u074D' && LA5_0<='\u074F')||(LA5_0>='\u0780' && LA5_0<='\u07B1')||(LA5_0>='\u0901' && LA5_0<='\u0939')||(LA5_0>='\u093C' && LA5_0<='\u094D')||(LA5_0>='\u0950' && LA5_0<='\u0954')||(LA5_0>='\u0958' && LA5_0<='\u0963')||(LA5_0>='\u0966' && LA5_0<='\u096F')||(LA5_0>='\u0981' && LA5_0<='\u0983')||(LA5_0>='\u0985' && LA5_0<='\u098C')||(LA5_0>='\u098F' && LA5_0<='\u0990')||(LA5_0>='\u0993' && LA5_0<='\u09A8')||(LA5_0>='\u09AA' && LA5_0<='\u09B0')||LA5_0=='\u09B2'||(LA5_0>='\u09B6' && LA5_0<='\u09B9')||(LA5_0>='\u09BC' && LA5_0<='\u09C4')||(LA5_0>='\u09C7' && LA5_0<='\u09C8')||(LA5_0>='\u09CB' && LA5_0<='\u09CD')||LA5_0=='\u09D7'||(LA5_0>='\u09DC' && LA5_0<='\u09DD')||(LA5_0>='\u09DF' && LA5_0<='\u09E3')||(LA5_0>='\u09E6' && LA5_0<='\u09F3')||(LA5_0>='\u0A01' && LA5_0<='\u0A03')||(LA5_0>='\u0A05' && LA5_0<='\u0A0A')||(LA5_0>='\u0A0F' && LA5_0<='\u0A10')||(LA5_0>='\u0A13' && LA5_0<='\u0A28')||(LA5_0>='\u0A2A' && LA5_0<='\u0A30')||(LA5_0>='\u0A32' && LA5_0<='\u0A33')||(LA5_0>='\u0A35' && LA5_0<='\u0A36')||(LA5_0>='\u0A38' && LA5_0<='\u0A39')||LA5_0=='\u0A3C'||(LA5_0>='\u0A3E' && LA5_0<='\u0A42')||(LA5_0>='\u0A47' && LA5_0<='\u0A48')||(LA5_0>='\u0A4B' && LA5_0<='\u0A4D')||(LA5_0>='\u0A59' && LA5_0<='\u0A5C')||LA5_0=='\u0A5E'||(LA5_0>='\u0A66' && LA5_0<='\u0A74')||(LA5_0>='\u0A81' && LA5_0<='\u0A83')||(LA5_0>='\u0A85' && LA5_0<='\u0A8D')||(LA5_0>='\u0A8F' && LA5_0<='\u0A91')||(LA5_0>='\u0A93' && LA5_0<='\u0AA8')||(LA5_0>='\u0AAA' && LA5_0<='\u0AB0')||(LA5_0>='\u0AB2' && LA5_0<='\u0AB3')||(LA5_0>='\u0AB5' && LA5_0<='\u0AB9')||(LA5_0>='\u0ABC' && LA5_0<='\u0AC5')||(LA5_0>='\u0AC7' && LA5_0<='\u0AC9')||(LA5_0>='\u0ACB' && LA5_0<='\u0ACD')||LA5_0=='\u0AD0'||(LA5_0>='\u0AE0' && LA5_0<='\u0AE3')||(LA5_0>='\u0AE6' && LA5_0<='\u0AEF')||LA5_0=='\u0AF1'||(LA5_0>='\u0B01' && LA5_0<='\u0B03')||(LA5_0>='\u0B05' && LA5_0<='\u0B0C')||(LA5_0>='\u0B0F' && LA5_0<='\u0B10')||(LA5_0>='\u0B13' && LA5_0<='\u0B28')||(LA5_0>='\u0B2A' && LA5_0<='\u0B30')||(LA5_0>='\u0B32' && LA5_0<='\u0B33')||(LA5_0>='\u0B35' && LA5_0<='\u0B39')||(LA5_0>='\u0B3C' && LA5_0<='\u0B43')||(LA5_0>='\u0B47' && LA5_0<='\u0B48')||(LA5_0>='\u0B4B' && LA5_0<='\u0B4D')||(LA5_0>='\u0B56' && LA5_0<='\u0B57')||(LA5_0>='\u0B5C' && LA5_0<='\u0B5D')||(LA5_0>='\u0B5F' && LA5_0<='\u0B61')||(LA5_0>='\u0B66' && LA5_0<='\u0B6F')||LA5_0=='\u0B71'||(LA5_0>='\u0B82' && LA5_0<='\u0B83')||(LA5_0>='\u0B85' && LA5_0<='\u0B8A')||(LA5_0>='\u0B8E' && LA5_0<='\u0B90')||(LA5_0>='\u0B92' && LA5_0<='\u0B95')||(LA5_0>='\u0B99' && LA5_0<='\u0B9A')||LA5_0=='\u0B9C'||(LA5_0>='\u0B9E' && LA5_0<='\u0B9F')||(LA5_0>='\u0BA3' && LA5_0<='\u0BA4')||(LA5_0>='\u0BA8' && LA5_0<='\u0BAA')||(LA5_0>='\u0BAE' && LA5_0<='\u0BB5')||(LA5_0>='\u0BB7' && LA5_0<='\u0BB9')||(LA5_0>='\u0BBE' && LA5_0<='\u0BC2')||(LA5_0>='\u0BC6' && LA5_0<='\u0BC8')||(LA5_0>='\u0BCA' && LA5_0<='\u0BCD')||LA5_0=='\u0BD7'||(LA5_0>='\u0BE7' && LA5_0<='\u0BEF')||LA5_0=='\u0BF9'||(LA5_0>='\u0C01' && LA5_0<='\u0C03')||(LA5_0>='\u0C05' && LA5_0<='\u0C0C')||(LA5_0>='\u0C0E' && LA5_0<='\u0C10')||(LA5_0>='\u0C12' && LA5_0<='\u0C28')||(LA5_0>='\u0C2A' && LA5_0<='\u0C33')||(LA5_0>='\u0C35' && LA5_0<='\u0C39')||(LA5_0>='\u0C3E' && LA5_0<='\u0C44')||(LA5_0>='\u0C46' && LA5_0<='\u0C48')||(LA5_0>='\u0C4A' && LA5_0<='\u0C4D')||(LA5_0>='\u0C55' && LA5_0<='\u0C56')||(LA5_0>='\u0C60' && LA5_0<='\u0C61')||(LA5_0>='\u0C66' && LA5_0<='\u0C6F')||(LA5_0>='\u0C82' && LA5_0<='\u0C83')||(LA5_0>='\u0C85' && LA5_0<='\u0C8C')||(LA5_0>='\u0C8E' && LA5_0<='\u0C90')||(LA5_0>='\u0C92' && LA5_0<='\u0CA8')||(LA5_0>='\u0CAA' && LA5_0<='\u0CB3')||(LA5_0>='\u0CB5' && LA5_0<='\u0CB9')||(LA5_0>='\u0CBC' && LA5_0<='\u0CC4')||(LA5_0>='\u0CC6' && LA5_0<='\u0CC8')||(LA5_0>='\u0CCA' && LA5_0<='\u0CCD')||(LA5_0>='\u0CD5' && LA5_0<='\u0CD6')||LA5_0=='\u0CDE'||(LA5_0>='\u0CE0' && LA5_0<='\u0CE1')||(LA5_0>='\u0CE6' && LA5_0<='\u0CEF')||(LA5_0>='\u0D02' && LA5_0<='\u0D03')||(LA5_0>='\u0D05' && LA5_0<='\u0D0C')||(LA5_0>='\u0D0E' && LA5_0<='\u0D10')||(LA5_0>='\u0D12' && LA5_0<='\u0D28')||(LA5_0>='\u0D2A' && LA5_0<='\u0D39')||(LA5_0>='\u0D3E' && LA5_0<='\u0D43')||(LA5_0>='\u0D46' && LA5_0<='\u0D48')||(LA5_0>='\u0D4A' && LA5_0<='\u0D4D')||LA5_0=='\u0D57'||(LA5_0>='\u0D60' && LA5_0<='\u0D61')||(LA5_0>='\u0D66' && LA5_0<='\u0D6F')||(LA5_0>='\u0D82' && LA5_0<='\u0D83')||(LA5_0>='\u0D85' && LA5_0<='\u0D96')||(LA5_0>='\u0D9A' && LA5_0<='\u0DB1')||(LA5_0>='\u0DB3' && LA5_0<='\u0DBB')||LA5_0=='\u0DBD'||(LA5_0>='\u0DC0' && LA5_0<='\u0DC6')||LA5_0=='\u0DCA'||(LA5_0>='\u0DCF' && LA5_0<='\u0DD4')||LA5_0=='\u0DD6'||(LA5_0>='\u0DD8' && LA5_0<='\u0DDF')||(LA5_0>='\u0DF2' && LA5_0<='\u0DF3')||(LA5_0>='\u0E01' && LA5_0<='\u0E3A')||(LA5_0>='\u0E3F' && LA5_0<='\u0E4E')||(LA5_0>='\u0E50' && LA5_0<='\u0E59')||(LA5_0>='\u0E81' && LA5_0<='\u0E82')||LA5_0=='\u0E84'||(LA5_0>='\u0E87' && LA5_0<='\u0E88')||LA5_0=='\u0E8A'||LA5_0=='\u0E8D'||(LA5_0>='\u0E94' && LA5_0<='\u0E97')||(LA5_0>='\u0E99' && LA5_0<='\u0E9F')||(LA5_0>='\u0EA1' && LA5_0<='\u0EA3')||LA5_0=='\u0EA5'||LA5_0=='\u0EA7'||(LA5_0>='\u0EAA' && LA5_0<='\u0EAB')||(LA5_0>='\u0EAD' && LA5_0<='\u0EB9')||(LA5_0>='\u0EBB' && LA5_0<='\u0EBD')||(LA5_0>='\u0EC0' && LA5_0<='\u0EC4')||LA5_0=='\u0EC6'||(LA5_0>='\u0EC8' && LA5_0<='\u0ECD')||(LA5_0>='\u0ED0' && LA5_0<='\u0ED9')||(LA5_0>='\u0EDC' && LA5_0<='\u0EDD')||LA5_0=='\u0F00'||(LA5_0>='\u0F18' && LA5_0<='\u0F19')||(LA5_0>='\u0F20' && LA5_0<='\u0F29')||LA5_0=='\u0F35'||LA5_0=='\u0F37'||LA5_0=='\u0F39'||(LA5_0>='\u0F3E' && LA5_0<='\u0F47')||(LA5_0>='\u0F49' && LA5_0<='\u0F6A')||(LA5_0>='\u0F71' && LA5_0<='\u0F84')||(LA5_0>='\u0F86' && LA5_0<='\u0F8B')||(LA5_0>='\u0F90' && LA5_0<='\u0F97')||(LA5_0>='\u0F99' && LA5_0<='\u0FBC')||LA5_0=='\u0FC6'||(LA5_0>='\u1000' && LA5_0<='\u1021')||(LA5_0>='\u1023' && LA5_0<='\u1027')||(LA5_0>='\u1029' && LA5_0<='\u102A')||(LA5_0>='\u102C' && LA5_0<='\u1032')||(LA5_0>='\u1036' && LA5_0<='\u1039')||(LA5_0>='\u1040' && LA5_0<='\u1049')||(LA5_0>='\u1050' && LA5_0<='\u1059')||(LA5_0>='\u10A0' && LA5_0<='\u10C5')||(LA5_0>='\u10D0' && LA5_0<='\u10F8')||(LA5_0>='\u1100' && LA5_0<='\u1159')||(LA5_0>='\u115F' && LA5_0<='\u11A2')||(LA5_0>='\u11A8' && LA5_0<='\u11F9')||(LA5_0>='\u1200' && LA5_0<='\u1206')||(LA5_0>='\u1208' && LA5_0<='\u1246')||LA5_0=='\u1248'||(LA5_0>='\u124A' && LA5_0<='\u124D')||(LA5_0>='\u1250' && LA5_0<='\u1256')||LA5_0=='\u1258'||(LA5_0>='\u125A' && LA5_0<='\u125D')||(LA5_0>='\u1260' && LA5_0<='\u1286')||LA5_0=='\u1288'||(LA5_0>='\u128A' && LA5_0<='\u128D')||(LA5_0>='\u1290' && LA5_0<='\u12AE')||LA5_0=='\u12B0'||(LA5_0>='\u12B2' && LA5_0<='\u12B5')||(LA5_0>='\u12B8' && LA5_0<='\u12BE')||LA5_0=='\u12C0'||(LA5_0>='\u12C2' && LA5_0<='\u12C5')||(LA5_0>='\u12C8' && LA5_0<='\u12CE')||(LA5_0>='\u12D0' && LA5_0<='\u12D6')||(LA5_0>='\u12D8' && LA5_0<='\u12EE')||(LA5_0>='\u12F0' && LA5_0<='\u130E')||LA5_0=='\u1310'||(LA5_0>='\u1312' && LA5_0<='\u1315')||(LA5_0>='\u1318' && LA5_0<='\u131E')||(LA5_0>='\u1320' && LA5_0<='\u1346')||(LA5_0>='\u1348' && LA5_0<='\u135A')||(LA5_0>='\u1369' && LA5_0<='\u1371')||(LA5_0>='\u13A0' && LA5_0<='\u13F4')||(LA5_0>='\u1401' && LA5_0<='\u166C')||(LA5_0>='\u166F' && LA5_0<='\u1676')||(LA5_0>='\u1681' && LA5_0<='\u169A')||(LA5_0>='\u16A0' && LA5_0<='\u16EA')||(LA5_0>='\u16EE' && LA5_0<='\u16F0')||(LA5_0>='\u1700' && LA5_0<='\u170C')||(LA5_0>='\u170E' && LA5_0<='\u1714')||(LA5_0>='\u1720' && LA5_0<='\u1734')||(LA5_0>='\u1740' && LA5_0<='\u1753')||(LA5_0>='\u1760' && LA5_0<='\u176C')||(LA5_0>='\u176E' && LA5_0<='\u1770')||(LA5_0>='\u1772' && LA5_0<='\u1773')||(LA5_0>='\u1780' && LA5_0<='\u17D3')||LA5_0=='\u17D7'||(LA5_0>='\u17DB' && LA5_0<='\u17DD')||(LA5_0>='\u17E0' && LA5_0<='\u17E9')||(LA5_0>='\u180B' && LA5_0<='\u180D')||(LA5_0>='\u1810' && LA5_0<='\u1819')||(LA5_0>='\u1820' && LA5_0<='\u1877')||(LA5_0>='\u1880' && LA5_0<='\u18A9')||(LA5_0>='\u1900' && LA5_0<='\u191C')||(LA5_0>='\u1920' && LA5_0<='\u192B')||(LA5_0>='\u1930' && LA5_0<='\u193B')||(LA5_0>='\u1946' && LA5_0<='\u196D')||(LA5_0>='\u1970' && LA5_0<='\u1974')||(LA5_0>='\u1D00' && LA5_0<='\u1D6B')||(LA5_0>='\u1E00' && LA5_0<='\u1E9B')||(LA5_0>='\u1EA0' && LA5_0<='\u1EF9')||(LA5_0>='\u1F00' && LA5_0<='\u1F15')||(LA5_0>='\u1F18' && LA5_0<='\u1F1D')||(LA5_0>='\u1F20' && LA5_0<='\u1F45')||(LA5_0>='\u1F48' && LA5_0<='\u1F4D')||(LA5_0>='\u1F50' && LA5_0<='\u1F57')||LA5_0=='\u1F59'||LA5_0=='\u1F5B'||LA5_0=='\u1F5D'||(LA5_0>='\u1F5F' && LA5_0<='\u1F7D')||(LA5_0>='\u1F80' && LA5_0<='\u1FB4')||(LA5_0>='\u1FB6' && LA5_0<='\u1FBC')||LA5_0=='\u1FBE'||(LA5_0>='\u1FC2' && LA5_0<='\u1FC4')||(LA5_0>='\u1FC6' && LA5_0<='\u1FCC')||(LA5_0>='\u1FD0' && LA5_0<='\u1FD3')||(LA5_0>='\u1FD6' && LA5_0<='\u1FDB')||(LA5_0>='\u1FE0' && LA5_0<='\u1FEC')||(LA5_0>='\u1FF2' && LA5_0<='\u1FF4')||(LA5_0>='\u1FF6' && LA5_0<='\u1FFC')||(LA5_0>='\u200C' && LA5_0<='\u200F')||(LA5_0>='\u202A' && LA5_0<='\u202E')||(LA5_0>='\u203F' && LA5_0<='\u2040')||LA5_0=='\u2054'||(LA5_0>='\u2060' && LA5_0<='\u2063')||(LA5_0>='\u206A' && LA5_0<='\u206F')||LA5_0=='\u2071'||LA5_0=='\u207F'||(LA5_0>='\u20A0' && LA5_0<='\u20B1')||(LA5_0>='\u20D0' && LA5_0<='\u20DC')||LA5_0=='\u20E1'||(LA5_0>='\u20E5' && LA5_0<='\u20EA')||LA5_0=='\u2102'||LA5_0=='\u2107'||(LA5_0>='\u210A' && LA5_0<='\u2113')||LA5_0=='\u2115'||(LA5_0>='\u2119' && LA5_0<='\u211D')||LA5_0=='\u2124'||LA5_0=='\u2126'||LA5_0=='\u2128'||(LA5_0>='\u212A' && LA5_0<='\u212D')||(LA5_0>='\u212F' && LA5_0<='\u2131')||(LA5_0>='\u2133' && LA5_0<='\u2139')||(LA5_0>='\u213D' && LA5_0<='\u213F')||(LA5_0>='\u2145' && LA5_0<='\u2149')||(LA5_0>='\u2160' && LA5_0<='\u2183')||(LA5_0>='\u3005' && LA5_0<='\u3007')||(LA5_0>='\u3021' && LA5_0<='\u302F')||(LA5_0>='\u3031' && LA5_0<='\u3035')||(LA5_0>='\u3038' && LA5_0<='\u303C')||(LA5_0>='\u3041' && LA5_0<='\u3096')||(LA5_0>='\u3099' && LA5_0<='\u309A')||(LA5_0>='\u309D' && LA5_0<='\u309F')||(LA5_0>='\u30A1' && LA5_0<='\u30FF')||(LA5_0>='\u3105' && LA5_0<='\u312C')||(LA5_0>='\u3131' && LA5_0<='\u318E')||(LA5_0>='\u31A0' && LA5_0<='\u31B7')||(LA5_0>='\u31F0' && LA5_0<='\u31FF')||(LA5_0>='\u3400' && LA5_0<='\u4DB5')||(LA5_0>='\u4E00' && LA5_0<='\u9FA5')||(LA5_0>='\uA000' && LA5_0<='\uA48C')||(LA5_0>='\uAC00' && LA5_0<='\uD7A3')||(LA5_0>='\uF900' && LA5_0<='\uFA2D')||(LA5_0>='\uFA30' && LA5_0<='\uFA6A')||(LA5_0>='\uFB00' && LA5_0<='\uFB06')||(LA5_0>='\uFB13' && LA5_0<='\uFB17')||(LA5_0>='\uFB1D' && LA5_0<='\uFB28')||(LA5_0>='\uFB2A' && LA5_0<='\uFB36')||(LA5_0>='\uFB38' && LA5_0<='\uFB3C')||LA5_0=='\uFB3E'||(LA5_0>='\uFB40' && LA5_0<='\uFB41')||(LA5_0>='\uFB43' && LA5_0<='\uFB44')||(LA5_0>='\uFB46' && LA5_0<='\uFBB1')||(LA5_0>='\uFBD3' && LA5_0<='\uFD3D')||(LA5_0>='\uFD50' && LA5_0<='\uFD8F')||(LA5_0>='\uFD92' && LA5_0<='\uFDC7')||(LA5_0>='\uFDF0' && LA5_0<='\uFDFC')||(LA5_0>='\uFE00' && LA5_0<='\uFE0F')||(LA5_0>='\uFE20' && LA5_0<='\uFE23')||(LA5_0>='\uFE33' && LA5_0<='\uFE34')||(LA5_0>='\uFE4D' && LA5_0<='\uFE4F')||LA5_0=='\uFE69'||(LA5_0>='\uFE70' && LA5_0<='\uFE74')||(LA5_0>='\uFE76' && LA5_0<='\uFEFC')||LA5_0=='\uFEFF'||LA5_0=='\uFF04'||(LA5_0>='\uFF10' && LA5_0<='\uFF19')||(LA5_0>='\uFF21' && LA5_0<='\uFF3A')||LA5_0=='\uFF3F'||(LA5_0>='\uFF41' && LA5_0<='\uFF5A')||(LA5_0>='\uFF65' && LA5_0<='\uFFBE')||(LA5_0>='\uFFC2' && LA5_0<='\uFFC7')||(LA5_0>='\uFFCA' && LA5_0<='\uFFCF')||(LA5_0>='\uFFD2' && LA5_0<='\uFFD7')||(LA5_0>='\uFFDA' && LA5_0<='\uFFDC')||(LA5_0>='\uFFE0' && LA5_0<='\uFFE1')||(LA5_0>='\uFFE5' && LA5_0<='\uFFE6')||(LA5_0>='\uFFF9' && LA5_0<='\uFFFB')) ) {
                    alt5=1;
                }
                else if ( (LA5_0=='\\') ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:478:79: RULE_IDENTIFIER_PART
            	    {
            	    mRULE_IDENTIFIER_PART(); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:478:100: RULE_UNICODE_ESCAPE
            	    {
            	    mRULE_UNICODE_ESCAPE(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 107, FRAGMENT_RULE_ID_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_RULE_ID"

    // $ANTLR start "RULE_HEX_DIGIT"
    public final void mRULE_HEX_DIGIT() throws RecognitionException {
        int RULE_HEX_DIGIT_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:480:25: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:480:27: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 108, RULE_HEX_DIGIT_StartIndex); }
        }
    }
    // $ANTLR end "RULE_HEX_DIGIT"

    // $ANTLR start "RULE_UNICODE_ESCAPE"
    public final void mRULE_UNICODE_ESCAPE() throws RecognitionException {
        int RULE_UNICODE_ESCAPE_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:482:30: ( '\\\\' 'u' ( RULE_HEX_DIGIT ( RULE_HEX_DIGIT ( RULE_HEX_DIGIT ( RULE_HEX_DIGIT )? )? )? )? )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:482:32: '\\\\' 'u' ( RULE_HEX_DIGIT ( RULE_HEX_DIGIT ( RULE_HEX_DIGIT ( RULE_HEX_DIGIT )? )? )? )?
            {
            match('\\'); if (state.failed) return ;
            match('u'); if (state.failed) return ;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:482:41: ( RULE_HEX_DIGIT ( RULE_HEX_DIGIT ( RULE_HEX_DIGIT ( RULE_HEX_DIGIT )? )? )? )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='F')||(LA9_0>='a' && LA9_0<='f')) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:482:42: RULE_HEX_DIGIT ( RULE_HEX_DIGIT ( RULE_HEX_DIGIT ( RULE_HEX_DIGIT )? )? )?
                    {
                    mRULE_HEX_DIGIT(); if (state.failed) return ;
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:482:57: ( RULE_HEX_DIGIT ( RULE_HEX_DIGIT ( RULE_HEX_DIGIT )? )? )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='F')||(LA8_0>='a' && LA8_0<='f')) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:482:58: RULE_HEX_DIGIT ( RULE_HEX_DIGIT ( RULE_HEX_DIGIT )? )?
                            {
                            mRULE_HEX_DIGIT(); if (state.failed) return ;
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:482:73: ( RULE_HEX_DIGIT ( RULE_HEX_DIGIT )? )?
                            int alt7=2;
                            int LA7_0 = input.LA(1);

                            if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='F')||(LA7_0>='a' && LA7_0<='f')) ) {
                                alt7=1;
                            }
                            switch (alt7) {
                                case 1 :
                                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:482:74: RULE_HEX_DIGIT ( RULE_HEX_DIGIT )?
                                    {
                                    mRULE_HEX_DIGIT(); if (state.failed) return ;
                                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:482:89: ( RULE_HEX_DIGIT )?
                                    int alt6=2;
                                    int LA6_0 = input.LA(1);

                                    if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='F')||(LA6_0>='a' && LA6_0<='f')) ) {
                                        alt6=1;
                                    }
                                    switch (alt6) {
                                        case 1 :
                                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:0:0: RULE_HEX_DIGIT
                                            {
                                            mRULE_HEX_DIGIT(); if (state.failed) return ;

                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 109, RULE_UNICODE_ESCAPE_StartIndex); }
        }
    }
    // $ANTLR end "RULE_UNICODE_ESCAPE"

    // $ANTLR start "RULE_RICH_TEXT"
    public final void mRULE_RICH_TEXT() throws RecognitionException {
        int RULE_RICH_TEXT_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:484:25: ( FRAGMENT_RULE_RICH_TEXT )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:484:27: FRAGMENT_RULE_RICH_TEXT
            {
            mFRAGMENT_RULE_RICH_TEXT(); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 110, RULE_RICH_TEXT_StartIndex); }
        }
    }
    // $ANTLR end "RULE_RICH_TEXT"

    // $ANTLR start "FRAGMENT_RULE_RICH_TEXT"
    public final void mFRAGMENT_RULE_RICH_TEXT() throws RecognitionException {
        int FRAGMENT_RULE_RICH_TEXT_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:485:34: ( '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:485:36: '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            {
            match("'''"); if (state.failed) return ;

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:485:45: ( RULE_IN_RICH_STRING )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\'') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='\'') ) {
                        int LA10_4 = input.LA(3);

                        if ( ((LA10_4>='\u0000' && LA10_4<='&')||(LA10_4>='(' && LA10_4<='\u00AA')||(LA10_4>='\u00AC' && LA10_4<='\uFFFF')) ) {
                            alt10=1;
                        }


                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='&')||(LA10_1>='(' && LA10_1<='\u00AA')||(LA10_1>='\u00AC' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='\u00AA')||(LA10_0>='\u00AC' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:0:0: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:485:66: ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\'') ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1=='\'') ) {
                    int LA13_3 = input.LA(3);

                    if ( (LA13_3=='\'') ) {
                        alt13=1;
                    }
                    else {
                        alt13=2;}
                }
                else {
                    alt13=2;}
            }
            else {
                alt13=2;}
            switch (alt13) {
                case 1 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:485:67: '\\'\\'\\''
                    {
                    match("'''"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:485:76: ( '\\'' ( '\\'' )? )? EOF
                    {
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:485:76: ( '\\'' ( '\\'' )? )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\'') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:485:77: '\\'' ( '\\'' )?
                            {
                            match('\''); if (state.failed) return ;
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:485:82: ( '\\'' )?
                            int alt11=2;
                            int LA11_0 = input.LA(1);

                            if ( (LA11_0=='\'') ) {
                                alt11=1;
                            }
                            switch (alt11) {
                                case 1 :
                                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:0:0: '\\''
                                    {
                                    match('\''); if (state.failed) return ;

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match(EOF); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 111, FRAGMENT_RULE_RICH_TEXT_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_RULE_RICH_TEXT"

    // $ANTLR start "RULE_RICH_TEXT_START"
    public final void mRULE_RICH_TEXT_START() throws RecognitionException {
        int RULE_RICH_TEXT_START_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:487:31: ( FRAGMENT_RULE_RICH_TEXT_START )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:487:33: FRAGMENT_RULE_RICH_TEXT_START
            {
            mFRAGMENT_RULE_RICH_TEXT_START(); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 112, RULE_RICH_TEXT_START_StartIndex); }
        }
    }
    // $ANTLR end "RULE_RICH_TEXT_START"

    // $ANTLR start "FRAGMENT_RULE_RICH_TEXT_START"
    public final void mFRAGMENT_RULE_RICH_TEXT_START() throws RecognitionException {
        int FRAGMENT_RULE_RICH_TEXT_START_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 113) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:488:40: ( '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:488:42: '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB'
            {
            match("'''"); if (state.failed) return ;

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:488:51: ( RULE_IN_RICH_STRING )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='\'') ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1=='\'') ) {
                        int LA14_4 = input.LA(3);

                        if ( ((LA14_4>='\u0000' && LA14_4<='&')||(LA14_4>='(' && LA14_4<='\u00AA')||(LA14_4>='\u00AC' && LA14_4<='\uFFFF')) ) {
                            alt14=1;
                        }


                    }
                    else if ( ((LA14_1>='\u0000' && LA14_1<='&')||(LA14_1>='(' && LA14_1<='\u00AA')||(LA14_1>='\u00AC' && LA14_1<='\uFFFF')) ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0>='\u0000' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='\u00AA')||(LA14_0>='\u00AC' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:0:0: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:488:72: ( '\\'' ( '\\'' )? )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\'') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:488:73: '\\'' ( '\\'' )?
                    {
                    match('\''); if (state.failed) return ;
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:488:78: ( '\\'' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\'') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:0:0: '\\''
                            {
                            match('\''); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }

            match('\u00AB'); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 113, FRAGMENT_RULE_RICH_TEXT_START_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_RULE_RICH_TEXT_START"

    // $ANTLR start "RULE_RICH_TEXT_END"
    public final void mRULE_RICH_TEXT_END() throws RecognitionException {
        int RULE_RICH_TEXT_END_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 114) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:490:29: ( FRAGMENT_RULE_RICH_TEXT_END )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:490:31: FRAGMENT_RULE_RICH_TEXT_END
            {
            mFRAGMENT_RULE_RICH_TEXT_END(); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 114, RULE_RICH_TEXT_END_StartIndex); }
        }
    }
    // $ANTLR end "RULE_RICH_TEXT_END"

    // $ANTLR start "FRAGMENT_RULE_RICH_TEXT_END"
    public final void mFRAGMENT_RULE_RICH_TEXT_END() throws RecognitionException {
        int FRAGMENT_RULE_RICH_TEXT_END_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 115) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:491:38: ( '\\u00BB' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:491:40: '\\u00BB' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            {
            match('\u00BB'); if (state.failed) return ;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:491:49: ( RULE_IN_RICH_STRING )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='\'') ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1=='\'') ) {
                        int LA17_4 = input.LA(3);

                        if ( ((LA17_4>='\u0000' && LA17_4<='&')||(LA17_4>='(' && LA17_4<='\u00AA')||(LA17_4>='\u00AC' && LA17_4<='\uFFFF')) ) {
                            alt17=1;
                        }


                    }
                    else if ( ((LA17_1>='\u0000' && LA17_1<='&')||(LA17_1>='(' && LA17_1<='\u00AA')||(LA17_1>='\u00AC' && LA17_1<='\uFFFF')) ) {
                        alt17=1;
                    }


                }
                else if ( ((LA17_0>='\u0000' && LA17_0<='&')||(LA17_0>='(' && LA17_0<='\u00AA')||(LA17_0>='\u00AC' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:0:0: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:491:70: ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\'') ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1=='\'') ) {
                    int LA20_3 = input.LA(3);

                    if ( (LA20_3=='\'') ) {
                        alt20=1;
                    }
                    else {
                        alt20=2;}
                }
                else {
                    alt20=2;}
            }
            else {
                alt20=2;}
            switch (alt20) {
                case 1 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:491:71: '\\'\\'\\''
                    {
                    match("'''"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:491:80: ( '\\'' ( '\\'' )? )? EOF
                    {
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:491:80: ( '\\'' ( '\\'' )? )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='\'') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:491:81: '\\'' ( '\\'' )?
                            {
                            match('\''); if (state.failed) return ;
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:491:86: ( '\\'' )?
                            int alt18=2;
                            int LA18_0 = input.LA(1);

                            if ( (LA18_0=='\'') ) {
                                alt18=1;
                            }
                            switch (alt18) {
                                case 1 :
                                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:0:0: '\\''
                                    {
                                    match('\''); if (state.failed) return ;

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match(EOF); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 115, FRAGMENT_RULE_RICH_TEXT_END_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_RULE_RICH_TEXT_END"

    // $ANTLR start "RULE_RICH_TEXT_INBETWEEN"
    public final void mRULE_RICH_TEXT_INBETWEEN() throws RecognitionException {
        int RULE_RICH_TEXT_INBETWEEN_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 116) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:493:35: ( FRAGMENT_RULE_RICH_TEXT_INBETWEEN )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:493:37: FRAGMENT_RULE_RICH_TEXT_INBETWEEN
            {
            mFRAGMENT_RULE_RICH_TEXT_INBETWEEN(); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 116, RULE_RICH_TEXT_INBETWEEN_StartIndex); }
        }
    }
    // $ANTLR end "RULE_RICH_TEXT_INBETWEEN"

    // $ANTLR start "FRAGMENT_RULE_RICH_TEXT_INBETWEEN"
    public final void mFRAGMENT_RULE_RICH_TEXT_INBETWEEN() throws RecognitionException {
        int FRAGMENT_RULE_RICH_TEXT_INBETWEEN_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 117) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:494:44: ( '\\u00BB' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:494:46: '\\u00BB' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB'
            {
            match('\u00BB'); if (state.failed) return ;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:494:55: ( RULE_IN_RICH_STRING )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0=='\'') ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1=='\'') ) {
                        int LA21_4 = input.LA(3);

                        if ( ((LA21_4>='\u0000' && LA21_4<='&')||(LA21_4>='(' && LA21_4<='\u00AA')||(LA21_4>='\u00AC' && LA21_4<='\uFFFF')) ) {
                            alt21=1;
                        }


                    }
                    else if ( ((LA21_1>='\u0000' && LA21_1<='&')||(LA21_1>='(' && LA21_1<='\u00AA')||(LA21_1>='\u00AC' && LA21_1<='\uFFFF')) ) {
                        alt21=1;
                    }


                }
                else if ( ((LA21_0>='\u0000' && LA21_0<='&')||(LA21_0>='(' && LA21_0<='\u00AA')||(LA21_0>='\u00AC' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:0:0: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:494:76: ( '\\'' ( '\\'' )? )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='\'') ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:494:77: '\\'' ( '\\'' )?
                    {
                    match('\''); if (state.failed) return ;
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:494:82: ( '\\'' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='\'') ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:0:0: '\\''
                            {
                            match('\''); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }

            match('\u00AB'); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 117, FRAGMENT_RULE_RICH_TEXT_INBETWEEN_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_RULE_RICH_TEXT_INBETWEEN"

    // $ANTLR start "RULE_COMMENT_RICH_TEXT_INBETWEEN"
    public final void mRULE_COMMENT_RICH_TEXT_INBETWEEN() throws RecognitionException {
        int RULE_COMMENT_RICH_TEXT_INBETWEEN_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 118) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:496:43: ( FRAGMENT_RULE_COMMENT_RICH_TEXT_INBETWEEN )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:496:45: FRAGMENT_RULE_COMMENT_RICH_TEXT_INBETWEEN
            {
            mFRAGMENT_RULE_COMMENT_RICH_TEXT_INBETWEEN(); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 118, RULE_COMMENT_RICH_TEXT_INBETWEEN_StartIndex); }
        }
    }
    // $ANTLR end "RULE_COMMENT_RICH_TEXT_INBETWEEN"

    // $ANTLR start "FRAGMENT_RULE_COMMENT_RICH_TEXT_INBETWEEN"
    public final void mFRAGMENT_RULE_COMMENT_RICH_TEXT_INBETWEEN() throws RecognitionException {
        int FRAGMENT_RULE_COMMENT_RICH_TEXT_INBETWEEN_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 119) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:497:52: ( '\\u00AB\\u00AB' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )? )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:497:54: '\\u00AB\\u00AB' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )?
            {
            match("\u00AB\u00AB"); if (state.failed) return ;

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:497:69: (~ ( ( '\\n' | '\\r' ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='\u0000' && LA24_0<='\t')||(LA24_0>='\u000B' && LA24_0<='\f')||(LA24_0>='\u000E' && LA24_0<='\uFFFF')) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:0:0: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:497:85: ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0=='\n'||LA29_0=='\r') ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:497:86: ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB'
                    {
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:497:86: ( '\\r' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0=='\r') ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:0:0: '\\r'
                            {
                            match('\r'); if (state.failed) return ;

                            }
                            break;

                    }

                    match('\n'); if (state.failed) return ;
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:497:97: ( RULE_IN_RICH_STRING )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0=='\'') ) {
                            int LA26_1 = input.LA(2);

                            if ( (LA26_1=='\'') ) {
                                int LA26_4 = input.LA(3);

                                if ( ((LA26_4>='\u0000' && LA26_4<='&')||(LA26_4>='(' && LA26_4<='\u00AA')||(LA26_4>='\u00AC' && LA26_4<='\uFFFF')) ) {
                                    alt26=1;
                                }


                            }
                            else if ( ((LA26_1>='\u0000' && LA26_1<='&')||(LA26_1>='(' && LA26_1<='\u00AA')||(LA26_1>='\u00AC' && LA26_1<='\uFFFF')) ) {
                                alt26=1;
                            }


                        }
                        else if ( ((LA26_0>='\u0000' && LA26_0<='&')||(LA26_0>='(' && LA26_0<='\u00AA')||(LA26_0>='\u00AC' && LA26_0<='\uFFFF')) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:0:0: RULE_IN_RICH_STRING
                    	    {
                    	    mRULE_IN_RICH_STRING(); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:497:118: ( '\\'' ( '\\'' )? )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0=='\'') ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:497:119: '\\'' ( '\\'' )?
                            {
                            match('\''); if (state.failed) return ;
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:497:124: ( '\\'' )?
                            int alt27=2;
                            int LA27_0 = input.LA(1);

                            if ( (LA27_0=='\'') ) {
                                alt27=1;
                            }
                            switch (alt27) {
                                case 1 :
                                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:0:0: '\\''
                                    {
                                    match('\''); if (state.failed) return ;

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match('\u00AB'); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 119, FRAGMENT_RULE_COMMENT_RICH_TEXT_INBETWEEN_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_RULE_COMMENT_RICH_TEXT_INBETWEEN"

    // $ANTLR start "RULE_COMMENT_RICH_TEXT_END"
    public final void mRULE_COMMENT_RICH_TEXT_END() throws RecognitionException {
        int RULE_COMMENT_RICH_TEXT_END_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 120) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:499:37: ( FRAGMENT_RULE_COMMENT_RICH_TEXT_END )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:499:39: FRAGMENT_RULE_COMMENT_RICH_TEXT_END
            {
            mFRAGMENT_RULE_COMMENT_RICH_TEXT_END(); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 120, RULE_COMMENT_RICH_TEXT_END_StartIndex); }
        }
    }
    // $ANTLR end "RULE_COMMENT_RICH_TEXT_END"

    // $ANTLR start "FRAGMENT_RULE_COMMENT_RICH_TEXT_END"
    public final void mFRAGMENT_RULE_COMMENT_RICH_TEXT_END() throws RecognitionException {
        int FRAGMENT_RULE_COMMENT_RICH_TEXT_END_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 121) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:500:46: ( '\\u00AB\\u00AB' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) | EOF ) )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:500:48: '\\u00AB\\u00AB' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) | EOF )
            {
            match("\u00AB\u00AB"); if (state.failed) return ;

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:500:63: (~ ( ( '\\n' | '\\r' ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>='\u0000' && LA30_0<='\t')||(LA30_0>='\u000B' && LA30_0<='\f')||(LA30_0>='\u000E' && LA30_0<='\uFFFF')) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:0:0: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:500:79: ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) | EOF )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0=='\n'||LA36_0=='\r') ) {
                alt36=1;
            }
            else {
                alt36=2;}
            switch (alt36) {
                case 1 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:500:80: ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
                    {
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:500:80: ( '\\r' )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0=='\r') ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:0:0: '\\r'
                            {
                            match('\r'); if (state.failed) return ;

                            }
                            break;

                    }

                    match('\n'); if (state.failed) return ;
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:500:91: ( RULE_IN_RICH_STRING )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0=='\'') ) {
                            int LA32_1 = input.LA(2);

                            if ( (LA32_1=='\'') ) {
                                int LA32_4 = input.LA(3);

                                if ( ((LA32_4>='\u0000' && LA32_4<='&')||(LA32_4>='(' && LA32_4<='\u00AA')||(LA32_4>='\u00AC' && LA32_4<='\uFFFF')) ) {
                                    alt32=1;
                                }


                            }
                            else if ( ((LA32_1>='\u0000' && LA32_1<='&')||(LA32_1>='(' && LA32_1<='\u00AA')||(LA32_1>='\u00AC' && LA32_1<='\uFFFF')) ) {
                                alt32=1;
                            }


                        }
                        else if ( ((LA32_0>='\u0000' && LA32_0<='&')||(LA32_0>='(' && LA32_0<='\u00AA')||(LA32_0>='\u00AC' && LA32_0<='\uFFFF')) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:0:0: RULE_IN_RICH_STRING
                    	    {
                    	    mRULE_IN_RICH_STRING(); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:500:112: ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0=='\'') ) {
                        int LA35_1 = input.LA(2);

                        if ( (LA35_1=='\'') ) {
                            int LA35_3 = input.LA(3);

                            if ( (LA35_3=='\'') ) {
                                alt35=1;
                            }
                            else {
                                alt35=2;}
                        }
                        else {
                            alt35=2;}
                    }
                    else {
                        alt35=2;}
                    switch (alt35) {
                        case 1 :
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:500:113: '\\'\\'\\''
                            {
                            match("'''"); if (state.failed) return ;


                            }
                            break;
                        case 2 :
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:500:122: ( '\\'' ( '\\'' )? )? EOF
                            {
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:500:122: ( '\\'' ( '\\'' )? )?
                            int alt34=2;
                            int LA34_0 = input.LA(1);

                            if ( (LA34_0=='\'') ) {
                                alt34=1;
                            }
                            switch (alt34) {
                                case 1 :
                                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:500:123: '\\'' ( '\\'' )?
                                    {
                                    match('\''); if (state.failed) return ;
                                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:500:128: ( '\\'' )?
                                    int alt33=2;
                                    int LA33_0 = input.LA(1);

                                    if ( (LA33_0=='\'') ) {
                                        alt33=1;
                                    }
                                    switch (alt33) {
                                        case 1 :
                                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:0:0: '\\''
                                            {
                                            match('\''); if (state.failed) return ;

                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }

                            match(EOF); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:500:141: EOF
                    {
                    match(EOF); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 121, FRAGMENT_RULE_COMMENT_RICH_TEXT_END_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_RULE_COMMENT_RICH_TEXT_END"

    // $ANTLR start "RULE_IN_RICH_STRING"
    public final void mRULE_IN_RICH_STRING() throws RecognitionException {
        int RULE_IN_RICH_STRING_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 122) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:502:30: ( ( '\\'\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | '\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | ~ ( ( '\\u00AB' | '\\'' ) ) ) )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:502:32: ( '\\'\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | '\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | ~ ( ( '\\u00AB' | '\\'' ) ) )
            {
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:502:32: ( '\\'\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | '\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | ~ ( ( '\\u00AB' | '\\'' ) ) )
            int alt37=3;
            int LA37_0 = input.LA(1);

            if ( (LA37_0=='\'') ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1=='\'') ) {
                    alt37=1;
                }
                else if ( ((LA37_1>='\u0000' && LA37_1<='&')||(LA37_1>='(' && LA37_1<='\u00AA')||(LA37_1>='\u00AC' && LA37_1<='\uFFFF')) ) {
                    alt37=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA37_0>='\u0000' && LA37_0<='&')||(LA37_0>='(' && LA37_0<='\u00AA')||(LA37_0>='\u00AC' && LA37_0<='\uFFFF')) ) {
                alt37=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:502:33: '\\'\\'' ~ ( ( '\\u00AB' | '\\'' ) )
                    {
                    match("''"); if (state.failed) return ;

                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\u00AA')||(input.LA(1)>='\u00AC' && input.LA(1)<='\uFFFF') ) {
                        input.consume();
                    state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:502:59: '\\'' ~ ( ( '\\u00AB' | '\\'' ) )
                    {
                    match('\''); if (state.failed) return ;
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\u00AA')||(input.LA(1)>='\u00AC' && input.LA(1)<='\uFFFF') ) {
                        input.consume();
                    state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 3 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:502:83: ~ ( ( '\\u00AB' | '\\'' ) )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\u00AA')||(input.LA(1)>='\u00AC' && input.LA(1)<='\uFFFF') ) {
                        input.consume();
                    state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 122, RULE_IN_RICH_STRING_StartIndex); }
        }
    }
    // $ANTLR end "RULE_IN_RICH_STRING"

    // $ANTLR start "RULE_IDENTIFIER_START"
    public final void mRULE_IDENTIFIER_START() throws RecognitionException {
        int RULE_IDENTIFIER_START_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 123) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:504:32: ( ( '$' | 'A' .. 'Z' | '_' | 'a' .. 'z' | '\\u00A2' .. '\\u00A5' | '\\u00AA' | '\\u00B5' | '\\u00BA' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u0236' | '\\u0250' .. '\\u02C1' | '\\u02C6' .. '\\u02D1' | '\\u02E0' .. '\\u02E4' | '\\u02EE' | '\\u037A' | '\\u0386' | '\\u0388' .. '\\u038A' | '\\u038C' | '\\u038E' .. '\\u03A1' | '\\u03A3' .. '\\u03CE' | '\\u03D0' .. '\\u03F5' | '\\u03F7' .. '\\u03FB' | '\\u0400' .. '\\u0481' | '\\u048A' .. '\\u04CE' | '\\u04D0' .. '\\u04F5' | '\\u04F8' .. '\\u04F9' | '\\u0500' .. '\\u050F' | '\\u0531' .. '\\u0556' | '\\u0559' | '\\u0561' .. '\\u0587' | '\\u05D0' .. '\\u05EA' | '\\u05F0' .. '\\u05F2' | '\\u0621' .. '\\u063A' | '\\u0640' .. '\\u064A' | '\\u066E' .. '\\u066F' | '\\u0671' .. '\\u06D3' | '\\u06D5' | '\\u06E5' .. '\\u06E6' | '\\u06EE' .. '\\u06EF' | '\\u06FA' .. '\\u06FC' | '\\u06FF' | '\\u0710' | '\\u0712' .. '\\u072F' | '\\u074D' .. '\\u074F' | '\\u0780' .. '\\u07A5' | '\\u07B1' | '\\u0904' .. '\\u0939' | '\\u093D' | '\\u0950' | '\\u0958' .. '\\u0961' | '\\u0985' .. '\\u098C' | '\\u098F' .. '\\u0990' | '\\u0993' .. '\\u09A8' | '\\u09AA' .. '\\u09B0' | '\\u09B2' | '\\u09B6' .. '\\u09B9' | '\\u09BD' | '\\u09DC' .. '\\u09DD' | '\\u09DF' .. '\\u09E1' | '\\u09F0' .. '\\u09F3' | '\\u0A05' .. '\\u0A0A' | '\\u0A0F' .. '\\u0A10' | '\\u0A13' .. '\\u0A28' | '\\u0A2A' .. '\\u0A30' | '\\u0A32' .. '\\u0A33' | '\\u0A35' .. '\\u0A36' | '\\u0A38' .. '\\u0A39' | '\\u0A59' .. '\\u0A5C' | '\\u0A5E' | '\\u0A72' .. '\\u0A74' | '\\u0A85' .. '\\u0A8D' | '\\u0A8F' .. '\\u0A91' | '\\u0A93' .. '\\u0AA8' | '\\u0AAA' .. '\\u0AB0' | '\\u0AB2' .. '\\u0AB3' | '\\u0AB5' .. '\\u0AB9' | '\\u0ABD' | '\\u0AD0' | '\\u0AE0' .. '\\u0AE1' | '\\u0AF1' | '\\u0B05' .. '\\u0B0C' | '\\u0B0F' .. '\\u0B10' | '\\u0B13' .. '\\u0B28' | '\\u0B2A' .. '\\u0B30' | '\\u0B32' .. '\\u0B33' | '\\u0B35' .. '\\u0B39' | '\\u0B3D' | '\\u0B5C' .. '\\u0B5D' | '\\u0B5F' .. '\\u0B61' | '\\u0B71' | '\\u0B83' | '\\u0B85' .. '\\u0B8A' | '\\u0B8E' .. '\\u0B90' | '\\u0B92' .. '\\u0B95' | '\\u0B99' .. '\\u0B9A' | '\\u0B9C' | '\\u0B9E' .. '\\u0B9F' | '\\u0BA3' .. '\\u0BA4' | '\\u0BA8' .. '\\u0BAA' | '\\u0BAE' .. '\\u0BB5' | '\\u0BB7' .. '\\u0BB9' | '\\u0BF9' | '\\u0C05' .. '\\u0C0C' | '\\u0C0E' .. '\\u0C10' | '\\u0C12' .. '\\u0C28' | '\\u0C2A' .. '\\u0C33' | '\\u0C35' .. '\\u0C39' | '\\u0C60' .. '\\u0C61' | '\\u0C85' .. '\\u0C8C' | '\\u0C8E' .. '\\u0C90' | '\\u0C92' .. '\\u0CA8' | '\\u0CAA' .. '\\u0CB3' | '\\u0CB5' .. '\\u0CB9' | '\\u0CBD' | '\\u0CDE' | '\\u0CE0' .. '\\u0CE1' | '\\u0D05' .. '\\u0D0C' | '\\u0D0E' .. '\\u0D10' | '\\u0D12' .. '\\u0D28' | '\\u0D2A' .. '\\u0D39' | '\\u0D60' .. '\\u0D61' | '\\u0D85' .. '\\u0D96' | '\\u0D9A' .. '\\u0DB1' | '\\u0DB3' .. '\\u0DBB' | '\\u0DBD' | '\\u0DC0' .. '\\u0DC6' | '\\u0E01' .. '\\u0E30' | '\\u0E32' .. '\\u0E33' | '\\u0E3F' .. '\\u0E46' | '\\u0E81' .. '\\u0E82' | '\\u0E84' | '\\u0E87' .. '\\u0E88' | '\\u0E8A' | '\\u0E8D' | '\\u0E94' .. '\\u0E97' | '\\u0E99' .. '\\u0E9F' | '\\u0EA1' .. '\\u0EA3' | '\\u0EA5' | '\\u0EA7' | '\\u0EAA' .. '\\u0EAB' | '\\u0EAD' .. '\\u0EB0' | '\\u0EB2' .. '\\u0EB3' | '\\u0EBD' | '\\u0EC0' .. '\\u0EC4' | '\\u0EC6' | '\\u0EDC' .. '\\u0EDD' | '\\u0F00' | '\\u0F40' .. '\\u0F47' | '\\u0F49' .. '\\u0F6A' | '\\u0F88' .. '\\u0F8B' | '\\u1000' .. '\\u1021' | '\\u1023' .. '\\u1027' | '\\u1029' .. '\\u102A' | '\\u1050' .. '\\u1055' | '\\u10A0' .. '\\u10C5' | '\\u10D0' .. '\\u10F8' | '\\u1100' .. '\\u1159' | '\\u115F' .. '\\u11A2' | '\\u11A8' .. '\\u11F9' | '\\u1200' .. '\\u1206' | '\\u1208' .. '\\u1246' | '\\u1248' | '\\u124A' .. '\\u124D' | '\\u1250' .. '\\u1256' | '\\u1258' | '\\u125A' .. '\\u125D' | '\\u1260' .. '\\u1286' | '\\u1288' | '\\u128A' .. '\\u128D' | '\\u1290' .. '\\u12AE' | '\\u12B0' | '\\u12B2' .. '\\u12B5' | '\\u12B8' .. '\\u12BE' | '\\u12C0' | '\\u12C2' .. '\\u12C5' | '\\u12C8' .. '\\u12CE' | '\\u12D0' .. '\\u12D6' | '\\u12D8' .. '\\u12EE' | '\\u12F0' .. '\\u130E' | '\\u1310' | '\\u1312' .. '\\u1315' | '\\u1318' .. '\\u131E' | '\\u1320' .. '\\u1346' | '\\u1348' .. '\\u135A' | '\\u13A0' .. '\\u13F4' | '\\u1401' .. '\\u166C' | '\\u166F' .. '\\u1676' | '\\u1681' .. '\\u169A' | '\\u16A0' .. '\\u16EA' | '\\u16EE' .. '\\u16F0' | '\\u1700' .. '\\u170C' | '\\u170E' .. '\\u1711' | '\\u1720' .. '\\u1731' | '\\u1740' .. '\\u1751' | '\\u1760' .. '\\u176C' | '\\u176E' .. '\\u1770' | '\\u1780' .. '\\u17B3' | '\\u17D7' | '\\u17DB' .. '\\u17DC' | '\\u1820' .. '\\u1877' | '\\u1880' .. '\\u18A8' | '\\u1900' .. '\\u191C' | '\\u1950' .. '\\u196D' | '\\u1970' .. '\\u1974' | '\\u1D00' .. '\\u1D6B' | '\\u1E00' .. '\\u1E9B' | '\\u1EA0' .. '\\u1EF9' | '\\u1F00' .. '\\u1F15' | '\\u1F18' .. '\\u1F1D' | '\\u1F20' .. '\\u1F45' | '\\u1F48' .. '\\u1F4D' | '\\u1F50' .. '\\u1F57' | '\\u1F59' | '\\u1F5B' | '\\u1F5D' | '\\u1F5F' .. '\\u1F7D' | '\\u1F80' .. '\\u1FB4' | '\\u1FB6' .. '\\u1FBC' | '\\u1FBE' | '\\u1FC2' .. '\\u1FC4' | '\\u1FC6' .. '\\u1FCC' | '\\u1FD0' .. '\\u1FD3' | '\\u1FD6' .. '\\u1FDB' | '\\u1FE0' .. '\\u1FEC' | '\\u1FF2' .. '\\u1FF4' | '\\u1FF6' .. '\\u1FFC' | '\\u203F' .. '\\u2040' | '\\u2054' | '\\u2071' | '\\u207F' | '\\u20A0' .. '\\u20B1' | '\\u2102' | '\\u2107' | '\\u210A' .. '\\u2113' | '\\u2115' | '\\u2119' .. '\\u211D' | '\\u2124' | '\\u2126' | '\\u2128' | '\\u212A' .. '\\u212D' | '\\u212F' .. '\\u2131' | '\\u2133' .. '\\u2139' | '\\u213D' .. '\\u213F' | '\\u2145' .. '\\u2149' | '\\u2160' .. '\\u2183' | '\\u3005' .. '\\u3007' | '\\u3021' .. '\\u3029' | '\\u3031' .. '\\u3035' | '\\u3038' .. '\\u303C' | '\\u3041' .. '\\u3096' | '\\u309D' .. '\\u309F' | '\\u30A1' .. '\\u30FF' | '\\u3105' .. '\\u312C' | '\\u3131' .. '\\u318E' | '\\u31A0' .. '\\u31B7' | '\\u31F0' .. '\\u31FF' | '\\u3400' .. '\\u4DB5' | '\\u4E00' .. '\\u9FA5' | '\\uA000' .. '\\uA48C' | '\\uAC00' .. '\\uD7A3' | '\\uF900' .. '\\uFA2D' | '\\uFA30' .. '\\uFA6A' | '\\uFB00' .. '\\uFB06' | '\\uFB13' .. '\\uFB17' | '\\uFB1D' | '\\uFB1F' .. '\\uFB28' | '\\uFB2A' .. '\\uFB36' | '\\uFB38' .. '\\uFB3C' | '\\uFB3E' | '\\uFB40' .. '\\uFB41' | '\\uFB43' .. '\\uFB44' | '\\uFB46' .. '\\uFBB1' | '\\uFBD3' .. '\\uFD3D' | '\\uFD50' .. '\\uFD8F' | '\\uFD92' .. '\\uFDC7' | '\\uFDF0' .. '\\uFDFC' | '\\uFE33' .. '\\uFE34' | '\\uFE4D' .. '\\uFE4F' | '\\uFE69' | '\\uFE70' .. '\\uFE74' | '\\uFE76' .. '\\uFEFC' | '\\uFF04' | '\\uFF21' .. '\\uFF3A' | '\\uFF3F' | '\\uFF41' .. '\\uFF5A' | '\\uFF65' .. '\\uFFBE' | '\\uFFC2' .. '\\uFFC7' | '\\uFFCA' .. '\\uFFCF' | '\\uFFD2' .. '\\uFFD7' | '\\uFFDA' .. '\\uFFDC' | '\\uFFE0' .. '\\uFFE1' | '\\uFFE5' .. '\\uFFE6' ) )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:504:34: ( '$' | 'A' .. 'Z' | '_' | 'a' .. 'z' | '\\u00A2' .. '\\u00A5' | '\\u00AA' | '\\u00B5' | '\\u00BA' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u0236' | '\\u0250' .. '\\u02C1' | '\\u02C6' .. '\\u02D1' | '\\u02E0' .. '\\u02E4' | '\\u02EE' | '\\u037A' | '\\u0386' | '\\u0388' .. '\\u038A' | '\\u038C' | '\\u038E' .. '\\u03A1' | '\\u03A3' .. '\\u03CE' | '\\u03D0' .. '\\u03F5' | '\\u03F7' .. '\\u03FB' | '\\u0400' .. '\\u0481' | '\\u048A' .. '\\u04CE' | '\\u04D0' .. '\\u04F5' | '\\u04F8' .. '\\u04F9' | '\\u0500' .. '\\u050F' | '\\u0531' .. '\\u0556' | '\\u0559' | '\\u0561' .. '\\u0587' | '\\u05D0' .. '\\u05EA' | '\\u05F0' .. '\\u05F2' | '\\u0621' .. '\\u063A' | '\\u0640' .. '\\u064A' | '\\u066E' .. '\\u066F' | '\\u0671' .. '\\u06D3' | '\\u06D5' | '\\u06E5' .. '\\u06E6' | '\\u06EE' .. '\\u06EF' | '\\u06FA' .. '\\u06FC' | '\\u06FF' | '\\u0710' | '\\u0712' .. '\\u072F' | '\\u074D' .. '\\u074F' | '\\u0780' .. '\\u07A5' | '\\u07B1' | '\\u0904' .. '\\u0939' | '\\u093D' | '\\u0950' | '\\u0958' .. '\\u0961' | '\\u0985' .. '\\u098C' | '\\u098F' .. '\\u0990' | '\\u0993' .. '\\u09A8' | '\\u09AA' .. '\\u09B0' | '\\u09B2' | '\\u09B6' .. '\\u09B9' | '\\u09BD' | '\\u09DC' .. '\\u09DD' | '\\u09DF' .. '\\u09E1' | '\\u09F0' .. '\\u09F3' | '\\u0A05' .. '\\u0A0A' | '\\u0A0F' .. '\\u0A10' | '\\u0A13' .. '\\u0A28' | '\\u0A2A' .. '\\u0A30' | '\\u0A32' .. '\\u0A33' | '\\u0A35' .. '\\u0A36' | '\\u0A38' .. '\\u0A39' | '\\u0A59' .. '\\u0A5C' | '\\u0A5E' | '\\u0A72' .. '\\u0A74' | '\\u0A85' .. '\\u0A8D' | '\\u0A8F' .. '\\u0A91' | '\\u0A93' .. '\\u0AA8' | '\\u0AAA' .. '\\u0AB0' | '\\u0AB2' .. '\\u0AB3' | '\\u0AB5' .. '\\u0AB9' | '\\u0ABD' | '\\u0AD0' | '\\u0AE0' .. '\\u0AE1' | '\\u0AF1' | '\\u0B05' .. '\\u0B0C' | '\\u0B0F' .. '\\u0B10' | '\\u0B13' .. '\\u0B28' | '\\u0B2A' .. '\\u0B30' | '\\u0B32' .. '\\u0B33' | '\\u0B35' .. '\\u0B39' | '\\u0B3D' | '\\u0B5C' .. '\\u0B5D' | '\\u0B5F' .. '\\u0B61' | '\\u0B71' | '\\u0B83' | '\\u0B85' .. '\\u0B8A' | '\\u0B8E' .. '\\u0B90' | '\\u0B92' .. '\\u0B95' | '\\u0B99' .. '\\u0B9A' | '\\u0B9C' | '\\u0B9E' .. '\\u0B9F' | '\\u0BA3' .. '\\u0BA4' | '\\u0BA8' .. '\\u0BAA' | '\\u0BAE' .. '\\u0BB5' | '\\u0BB7' .. '\\u0BB9' | '\\u0BF9' | '\\u0C05' .. '\\u0C0C' | '\\u0C0E' .. '\\u0C10' | '\\u0C12' .. '\\u0C28' | '\\u0C2A' .. '\\u0C33' | '\\u0C35' .. '\\u0C39' | '\\u0C60' .. '\\u0C61' | '\\u0C85' .. '\\u0C8C' | '\\u0C8E' .. '\\u0C90' | '\\u0C92' .. '\\u0CA8' | '\\u0CAA' .. '\\u0CB3' | '\\u0CB5' .. '\\u0CB9' | '\\u0CBD' | '\\u0CDE' | '\\u0CE0' .. '\\u0CE1' | '\\u0D05' .. '\\u0D0C' | '\\u0D0E' .. '\\u0D10' | '\\u0D12' .. '\\u0D28' | '\\u0D2A' .. '\\u0D39' | '\\u0D60' .. '\\u0D61' | '\\u0D85' .. '\\u0D96' | '\\u0D9A' .. '\\u0DB1' | '\\u0DB3' .. '\\u0DBB' | '\\u0DBD' | '\\u0DC0' .. '\\u0DC6' | '\\u0E01' .. '\\u0E30' | '\\u0E32' .. '\\u0E33' | '\\u0E3F' .. '\\u0E46' | '\\u0E81' .. '\\u0E82' | '\\u0E84' | '\\u0E87' .. '\\u0E88' | '\\u0E8A' | '\\u0E8D' | '\\u0E94' .. '\\u0E97' | '\\u0E99' .. '\\u0E9F' | '\\u0EA1' .. '\\u0EA3' | '\\u0EA5' | '\\u0EA7' | '\\u0EAA' .. '\\u0EAB' | '\\u0EAD' .. '\\u0EB0' | '\\u0EB2' .. '\\u0EB3' | '\\u0EBD' | '\\u0EC0' .. '\\u0EC4' | '\\u0EC6' | '\\u0EDC' .. '\\u0EDD' | '\\u0F00' | '\\u0F40' .. '\\u0F47' | '\\u0F49' .. '\\u0F6A' | '\\u0F88' .. '\\u0F8B' | '\\u1000' .. '\\u1021' | '\\u1023' .. '\\u1027' | '\\u1029' .. '\\u102A' | '\\u1050' .. '\\u1055' | '\\u10A0' .. '\\u10C5' | '\\u10D0' .. '\\u10F8' | '\\u1100' .. '\\u1159' | '\\u115F' .. '\\u11A2' | '\\u11A8' .. '\\u11F9' | '\\u1200' .. '\\u1206' | '\\u1208' .. '\\u1246' | '\\u1248' | '\\u124A' .. '\\u124D' | '\\u1250' .. '\\u1256' | '\\u1258' | '\\u125A' .. '\\u125D' | '\\u1260' .. '\\u1286' | '\\u1288' | '\\u128A' .. '\\u128D' | '\\u1290' .. '\\u12AE' | '\\u12B0' | '\\u12B2' .. '\\u12B5' | '\\u12B8' .. '\\u12BE' | '\\u12C0' | '\\u12C2' .. '\\u12C5' | '\\u12C8' .. '\\u12CE' | '\\u12D0' .. '\\u12D6' | '\\u12D8' .. '\\u12EE' | '\\u12F0' .. '\\u130E' | '\\u1310' | '\\u1312' .. '\\u1315' | '\\u1318' .. '\\u131E' | '\\u1320' .. '\\u1346' | '\\u1348' .. '\\u135A' | '\\u13A0' .. '\\u13F4' | '\\u1401' .. '\\u166C' | '\\u166F' .. '\\u1676' | '\\u1681' .. '\\u169A' | '\\u16A0' .. '\\u16EA' | '\\u16EE' .. '\\u16F0' | '\\u1700' .. '\\u170C' | '\\u170E' .. '\\u1711' | '\\u1720' .. '\\u1731' | '\\u1740' .. '\\u1751' | '\\u1760' .. '\\u176C' | '\\u176E' .. '\\u1770' | '\\u1780' .. '\\u17B3' | '\\u17D7' | '\\u17DB' .. '\\u17DC' | '\\u1820' .. '\\u1877' | '\\u1880' .. '\\u18A8' | '\\u1900' .. '\\u191C' | '\\u1950' .. '\\u196D' | '\\u1970' .. '\\u1974' | '\\u1D00' .. '\\u1D6B' | '\\u1E00' .. '\\u1E9B' | '\\u1EA0' .. '\\u1EF9' | '\\u1F00' .. '\\u1F15' | '\\u1F18' .. '\\u1F1D' | '\\u1F20' .. '\\u1F45' | '\\u1F48' .. '\\u1F4D' | '\\u1F50' .. '\\u1F57' | '\\u1F59' | '\\u1F5B' | '\\u1F5D' | '\\u1F5F' .. '\\u1F7D' | '\\u1F80' .. '\\u1FB4' | '\\u1FB6' .. '\\u1FBC' | '\\u1FBE' | '\\u1FC2' .. '\\u1FC4' | '\\u1FC6' .. '\\u1FCC' | '\\u1FD0' .. '\\u1FD3' | '\\u1FD6' .. '\\u1FDB' | '\\u1FE0' .. '\\u1FEC' | '\\u1FF2' .. '\\u1FF4' | '\\u1FF6' .. '\\u1FFC' | '\\u203F' .. '\\u2040' | '\\u2054' | '\\u2071' | '\\u207F' | '\\u20A0' .. '\\u20B1' | '\\u2102' | '\\u2107' | '\\u210A' .. '\\u2113' | '\\u2115' | '\\u2119' .. '\\u211D' | '\\u2124' | '\\u2126' | '\\u2128' | '\\u212A' .. '\\u212D' | '\\u212F' .. '\\u2131' | '\\u2133' .. '\\u2139' | '\\u213D' .. '\\u213F' | '\\u2145' .. '\\u2149' | '\\u2160' .. '\\u2183' | '\\u3005' .. '\\u3007' | '\\u3021' .. '\\u3029' | '\\u3031' .. '\\u3035' | '\\u3038' .. '\\u303C' | '\\u3041' .. '\\u3096' | '\\u309D' .. '\\u309F' | '\\u30A1' .. '\\u30FF' | '\\u3105' .. '\\u312C' | '\\u3131' .. '\\u318E' | '\\u31A0' .. '\\u31B7' | '\\u31F0' .. '\\u31FF' | '\\u3400' .. '\\u4DB5' | '\\u4E00' .. '\\u9FA5' | '\\uA000' .. '\\uA48C' | '\\uAC00' .. '\\uD7A3' | '\\uF900' .. '\\uFA2D' | '\\uFA30' .. '\\uFA6A' | '\\uFB00' .. '\\uFB06' | '\\uFB13' .. '\\uFB17' | '\\uFB1D' | '\\uFB1F' .. '\\uFB28' | '\\uFB2A' .. '\\uFB36' | '\\uFB38' .. '\\uFB3C' | '\\uFB3E' | '\\uFB40' .. '\\uFB41' | '\\uFB43' .. '\\uFB44' | '\\uFB46' .. '\\uFBB1' | '\\uFBD3' .. '\\uFD3D' | '\\uFD50' .. '\\uFD8F' | '\\uFD92' .. '\\uFDC7' | '\\uFDF0' .. '\\uFDFC' | '\\uFE33' .. '\\uFE34' | '\\uFE4D' .. '\\uFE4F' | '\\uFE69' | '\\uFE70' .. '\\uFE74' | '\\uFE76' .. '\\uFEFC' | '\\uFF04' | '\\uFF21' .. '\\uFF3A' | '\\uFF3F' | '\\uFF41' .. '\\uFF5A' | '\\uFF65' .. '\\uFFBE' | '\\uFFC2' .. '\\uFFC7' | '\\uFFCA' .. '\\uFFCF' | '\\uFFD2' .. '\\uFFD7' | '\\uFFDA' .. '\\uFFDC' | '\\uFFE0' .. '\\uFFE1' | '\\uFFE5' .. '\\uFFE6' )
            {
            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00A2' && input.LA(1)<='\u00A5')||input.LA(1)=='\u00AA'||input.LA(1)=='\u00B5'||input.LA(1)=='\u00BA'||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u0236')||(input.LA(1)>='\u0250' && input.LA(1)<='\u02C1')||(input.LA(1)>='\u02C6' && input.LA(1)<='\u02D1')||(input.LA(1)>='\u02E0' && input.LA(1)<='\u02E4')||input.LA(1)=='\u02EE'||input.LA(1)=='\u037A'||input.LA(1)=='\u0386'||(input.LA(1)>='\u0388' && input.LA(1)<='\u038A')||input.LA(1)=='\u038C'||(input.LA(1)>='\u038E' && input.LA(1)<='\u03A1')||(input.LA(1)>='\u03A3' && input.LA(1)<='\u03CE')||(input.LA(1)>='\u03D0' && input.LA(1)<='\u03F5')||(input.LA(1)>='\u03F7' && input.LA(1)<='\u03FB')||(input.LA(1)>='\u0400' && input.LA(1)<='\u0481')||(input.LA(1)>='\u048A' && input.LA(1)<='\u04CE')||(input.LA(1)>='\u04D0' && input.LA(1)<='\u04F5')||(input.LA(1)>='\u04F8' && input.LA(1)<='\u04F9')||(input.LA(1)>='\u0500' && input.LA(1)<='\u050F')||(input.LA(1)>='\u0531' && input.LA(1)<='\u0556')||input.LA(1)=='\u0559'||(input.LA(1)>='\u0561' && input.LA(1)<='\u0587')||(input.LA(1)>='\u05D0' && input.LA(1)<='\u05EA')||(input.LA(1)>='\u05F0' && input.LA(1)<='\u05F2')||(input.LA(1)>='\u0621' && input.LA(1)<='\u063A')||(input.LA(1)>='\u0640' && input.LA(1)<='\u064A')||(input.LA(1)>='\u066E' && input.LA(1)<='\u066F')||(input.LA(1)>='\u0671' && input.LA(1)<='\u06D3')||input.LA(1)=='\u06D5'||(input.LA(1)>='\u06E5' && input.LA(1)<='\u06E6')||(input.LA(1)>='\u06EE' && input.LA(1)<='\u06EF')||(input.LA(1)>='\u06FA' && input.LA(1)<='\u06FC')||input.LA(1)=='\u06FF'||input.LA(1)=='\u0710'||(input.LA(1)>='\u0712' && input.LA(1)<='\u072F')||(input.LA(1)>='\u074D' && input.LA(1)<='\u074F')||(input.LA(1)>='\u0780' && input.LA(1)<='\u07A5')||input.LA(1)=='\u07B1'||(input.LA(1)>='\u0904' && input.LA(1)<='\u0939')||input.LA(1)=='\u093D'||input.LA(1)=='\u0950'||(input.LA(1)>='\u0958' && input.LA(1)<='\u0961')||(input.LA(1)>='\u0985' && input.LA(1)<='\u098C')||(input.LA(1)>='\u098F' && input.LA(1)<='\u0990')||(input.LA(1)>='\u0993' && input.LA(1)<='\u09A8')||(input.LA(1)>='\u09AA' && input.LA(1)<='\u09B0')||input.LA(1)=='\u09B2'||(input.LA(1)>='\u09B6' && input.LA(1)<='\u09B9')||input.LA(1)=='\u09BD'||(input.LA(1)>='\u09DC' && input.LA(1)<='\u09DD')||(input.LA(1)>='\u09DF' && input.LA(1)<='\u09E1')||(input.LA(1)>='\u09F0' && input.LA(1)<='\u09F3')||(input.LA(1)>='\u0A05' && input.LA(1)<='\u0A0A')||(input.LA(1)>='\u0A0F' && input.LA(1)<='\u0A10')||(input.LA(1)>='\u0A13' && input.LA(1)<='\u0A28')||(input.LA(1)>='\u0A2A' && input.LA(1)<='\u0A30')||(input.LA(1)>='\u0A32' && input.LA(1)<='\u0A33')||(input.LA(1)>='\u0A35' && input.LA(1)<='\u0A36')||(input.LA(1)>='\u0A38' && input.LA(1)<='\u0A39')||(input.LA(1)>='\u0A59' && input.LA(1)<='\u0A5C')||input.LA(1)=='\u0A5E'||(input.LA(1)>='\u0A72' && input.LA(1)<='\u0A74')||(input.LA(1)>='\u0A85' && input.LA(1)<='\u0A8D')||(input.LA(1)>='\u0A8F' && input.LA(1)<='\u0A91')||(input.LA(1)>='\u0A93' && input.LA(1)<='\u0AA8')||(input.LA(1)>='\u0AAA' && input.LA(1)<='\u0AB0')||(input.LA(1)>='\u0AB2' && input.LA(1)<='\u0AB3')||(input.LA(1)>='\u0AB5' && input.LA(1)<='\u0AB9')||input.LA(1)=='\u0ABD'||input.LA(1)=='\u0AD0'||(input.LA(1)>='\u0AE0' && input.LA(1)<='\u0AE1')||input.LA(1)=='\u0AF1'||(input.LA(1)>='\u0B05' && input.LA(1)<='\u0B0C')||(input.LA(1)>='\u0B0F' && input.LA(1)<='\u0B10')||(input.LA(1)>='\u0B13' && input.LA(1)<='\u0B28')||(input.LA(1)>='\u0B2A' && input.LA(1)<='\u0B30')||(input.LA(1)>='\u0B32' && input.LA(1)<='\u0B33')||(input.LA(1)>='\u0B35' && input.LA(1)<='\u0B39')||input.LA(1)=='\u0B3D'||(input.LA(1)>='\u0B5C' && input.LA(1)<='\u0B5D')||(input.LA(1)>='\u0B5F' && input.LA(1)<='\u0B61')||input.LA(1)=='\u0B71'||input.LA(1)=='\u0B83'||(input.LA(1)>='\u0B85' && input.LA(1)<='\u0B8A')||(input.LA(1)>='\u0B8E' && input.LA(1)<='\u0B90')||(input.LA(1)>='\u0B92' && input.LA(1)<='\u0B95')||(input.LA(1)>='\u0B99' && input.LA(1)<='\u0B9A')||input.LA(1)=='\u0B9C'||(input.LA(1)>='\u0B9E' && input.LA(1)<='\u0B9F')||(input.LA(1)>='\u0BA3' && input.LA(1)<='\u0BA4')||(input.LA(1)>='\u0BA8' && input.LA(1)<='\u0BAA')||(input.LA(1)>='\u0BAE' && input.LA(1)<='\u0BB5')||(input.LA(1)>='\u0BB7' && input.LA(1)<='\u0BB9')||input.LA(1)=='\u0BF9'||(input.LA(1)>='\u0C05' && input.LA(1)<='\u0C0C')||(input.LA(1)>='\u0C0E' && input.LA(1)<='\u0C10')||(input.LA(1)>='\u0C12' && input.LA(1)<='\u0C28')||(input.LA(1)>='\u0C2A' && input.LA(1)<='\u0C33')||(input.LA(1)>='\u0C35' && input.LA(1)<='\u0C39')||(input.LA(1)>='\u0C60' && input.LA(1)<='\u0C61')||(input.LA(1)>='\u0C85' && input.LA(1)<='\u0C8C')||(input.LA(1)>='\u0C8E' && input.LA(1)<='\u0C90')||(input.LA(1)>='\u0C92' && input.LA(1)<='\u0CA8')||(input.LA(1)>='\u0CAA' && input.LA(1)<='\u0CB3')||(input.LA(1)>='\u0CB5' && input.LA(1)<='\u0CB9')||input.LA(1)=='\u0CBD'||input.LA(1)=='\u0CDE'||(input.LA(1)>='\u0CE0' && input.LA(1)<='\u0CE1')||(input.LA(1)>='\u0D05' && input.LA(1)<='\u0D0C')||(input.LA(1)>='\u0D0E' && input.LA(1)<='\u0D10')||(input.LA(1)>='\u0D12' && input.LA(1)<='\u0D28')||(input.LA(1)>='\u0D2A' && input.LA(1)<='\u0D39')||(input.LA(1)>='\u0D60' && input.LA(1)<='\u0D61')||(input.LA(1)>='\u0D85' && input.LA(1)<='\u0D96')||(input.LA(1)>='\u0D9A' && input.LA(1)<='\u0DB1')||(input.LA(1)>='\u0DB3' && input.LA(1)<='\u0DBB')||input.LA(1)=='\u0DBD'||(input.LA(1)>='\u0DC0' && input.LA(1)<='\u0DC6')||(input.LA(1)>='\u0E01' && input.LA(1)<='\u0E30')||(input.LA(1)>='\u0E32' && input.LA(1)<='\u0E33')||(input.LA(1)>='\u0E3F' && input.LA(1)<='\u0E46')||(input.LA(1)>='\u0E81' && input.LA(1)<='\u0E82')||input.LA(1)=='\u0E84'||(input.LA(1)>='\u0E87' && input.LA(1)<='\u0E88')||input.LA(1)=='\u0E8A'||input.LA(1)=='\u0E8D'||(input.LA(1)>='\u0E94' && input.LA(1)<='\u0E97')||(input.LA(1)>='\u0E99' && input.LA(1)<='\u0E9F')||(input.LA(1)>='\u0EA1' && input.LA(1)<='\u0EA3')||input.LA(1)=='\u0EA5'||input.LA(1)=='\u0EA7'||(input.LA(1)>='\u0EAA' && input.LA(1)<='\u0EAB')||(input.LA(1)>='\u0EAD' && input.LA(1)<='\u0EB0')||(input.LA(1)>='\u0EB2' && input.LA(1)<='\u0EB3')||input.LA(1)=='\u0EBD'||(input.LA(1)>='\u0EC0' && input.LA(1)<='\u0EC4')||input.LA(1)=='\u0EC6'||(input.LA(1)>='\u0EDC' && input.LA(1)<='\u0EDD')||input.LA(1)=='\u0F00'||(input.LA(1)>='\u0F40' && input.LA(1)<='\u0F47')||(input.LA(1)>='\u0F49' && input.LA(1)<='\u0F6A')||(input.LA(1)>='\u0F88' && input.LA(1)<='\u0F8B')||(input.LA(1)>='\u1000' && input.LA(1)<='\u1021')||(input.LA(1)>='\u1023' && input.LA(1)<='\u1027')||(input.LA(1)>='\u1029' && input.LA(1)<='\u102A')||(input.LA(1)>='\u1050' && input.LA(1)<='\u1055')||(input.LA(1)>='\u10A0' && input.LA(1)<='\u10C5')||(input.LA(1)>='\u10D0' && input.LA(1)<='\u10F8')||(input.LA(1)>='\u1100' && input.LA(1)<='\u1159')||(input.LA(1)>='\u115F' && input.LA(1)<='\u11A2')||(input.LA(1)>='\u11A8' && input.LA(1)<='\u11F9')||(input.LA(1)>='\u1200' && input.LA(1)<='\u1206')||(input.LA(1)>='\u1208' && input.LA(1)<='\u1246')||input.LA(1)=='\u1248'||(input.LA(1)>='\u124A' && input.LA(1)<='\u124D')||(input.LA(1)>='\u1250' && input.LA(1)<='\u1256')||input.LA(1)=='\u1258'||(input.LA(1)>='\u125A' && input.LA(1)<='\u125D')||(input.LA(1)>='\u1260' && input.LA(1)<='\u1286')||input.LA(1)=='\u1288'||(input.LA(1)>='\u128A' && input.LA(1)<='\u128D')||(input.LA(1)>='\u1290' && input.LA(1)<='\u12AE')||input.LA(1)=='\u12B0'||(input.LA(1)>='\u12B2' && input.LA(1)<='\u12B5')||(input.LA(1)>='\u12B8' && input.LA(1)<='\u12BE')||input.LA(1)=='\u12C0'||(input.LA(1)>='\u12C2' && input.LA(1)<='\u12C5')||(input.LA(1)>='\u12C8' && input.LA(1)<='\u12CE')||(input.LA(1)>='\u12D0' && input.LA(1)<='\u12D6')||(input.LA(1)>='\u12D8' && input.LA(1)<='\u12EE')||(input.LA(1)>='\u12F0' && input.LA(1)<='\u130E')||input.LA(1)=='\u1310'||(input.LA(1)>='\u1312' && input.LA(1)<='\u1315')||(input.LA(1)>='\u1318' && input.LA(1)<='\u131E')||(input.LA(1)>='\u1320' && input.LA(1)<='\u1346')||(input.LA(1)>='\u1348' && input.LA(1)<='\u135A')||(input.LA(1)>='\u13A0' && input.LA(1)<='\u13F4')||(input.LA(1)>='\u1401' && input.LA(1)<='\u166C')||(input.LA(1)>='\u166F' && input.LA(1)<='\u1676')||(input.LA(1)>='\u1681' && input.LA(1)<='\u169A')||(input.LA(1)>='\u16A0' && input.LA(1)<='\u16EA')||(input.LA(1)>='\u16EE' && input.LA(1)<='\u16F0')||(input.LA(1)>='\u1700' && input.LA(1)<='\u170C')||(input.LA(1)>='\u170E' && input.LA(1)<='\u1711')||(input.LA(1)>='\u1720' && input.LA(1)<='\u1731')||(input.LA(1)>='\u1740' && input.LA(1)<='\u1751')||(input.LA(1)>='\u1760' && input.LA(1)<='\u176C')||(input.LA(1)>='\u176E' && input.LA(1)<='\u1770')||(input.LA(1)>='\u1780' && input.LA(1)<='\u17B3')||input.LA(1)=='\u17D7'||(input.LA(1)>='\u17DB' && input.LA(1)<='\u17DC')||(input.LA(1)>='\u1820' && input.LA(1)<='\u1877')||(input.LA(1)>='\u1880' && input.LA(1)<='\u18A8')||(input.LA(1)>='\u1900' && input.LA(1)<='\u191C')||(input.LA(1)>='\u1950' && input.LA(1)<='\u196D')||(input.LA(1)>='\u1970' && input.LA(1)<='\u1974')||(input.LA(1)>='\u1D00' && input.LA(1)<='\u1D6B')||(input.LA(1)>='\u1E00' && input.LA(1)<='\u1E9B')||(input.LA(1)>='\u1EA0' && input.LA(1)<='\u1EF9')||(input.LA(1)>='\u1F00' && input.LA(1)<='\u1F15')||(input.LA(1)>='\u1F18' && input.LA(1)<='\u1F1D')||(input.LA(1)>='\u1F20' && input.LA(1)<='\u1F45')||(input.LA(1)>='\u1F48' && input.LA(1)<='\u1F4D')||(input.LA(1)>='\u1F50' && input.LA(1)<='\u1F57')||input.LA(1)=='\u1F59'||input.LA(1)=='\u1F5B'||input.LA(1)=='\u1F5D'||(input.LA(1)>='\u1F5F' && input.LA(1)<='\u1F7D')||(input.LA(1)>='\u1F80' && input.LA(1)<='\u1FB4')||(input.LA(1)>='\u1FB6' && input.LA(1)<='\u1FBC')||input.LA(1)=='\u1FBE'||(input.LA(1)>='\u1FC2' && input.LA(1)<='\u1FC4')||(input.LA(1)>='\u1FC6' && input.LA(1)<='\u1FCC')||(input.LA(1)>='\u1FD0' && input.LA(1)<='\u1FD3')||(input.LA(1)>='\u1FD6' && input.LA(1)<='\u1FDB')||(input.LA(1)>='\u1FE0' && input.LA(1)<='\u1FEC')||(input.LA(1)>='\u1FF2' && input.LA(1)<='\u1FF4')||(input.LA(1)>='\u1FF6' && input.LA(1)<='\u1FFC')||(input.LA(1)>='\u203F' && input.LA(1)<='\u2040')||input.LA(1)=='\u2054'||input.LA(1)=='\u2071'||input.LA(1)=='\u207F'||(input.LA(1)>='\u20A0' && input.LA(1)<='\u20B1')||input.LA(1)=='\u2102'||input.LA(1)=='\u2107'||(input.LA(1)>='\u210A' && input.LA(1)<='\u2113')||input.LA(1)=='\u2115'||(input.LA(1)>='\u2119' && input.LA(1)<='\u211D')||input.LA(1)=='\u2124'||input.LA(1)=='\u2126'||input.LA(1)=='\u2128'||(input.LA(1)>='\u212A' && input.LA(1)<='\u212D')||(input.LA(1)>='\u212F' && input.LA(1)<='\u2131')||(input.LA(1)>='\u2133' && input.LA(1)<='\u2139')||(input.LA(1)>='\u213D' && input.LA(1)<='\u213F')||(input.LA(1)>='\u2145' && input.LA(1)<='\u2149')||(input.LA(1)>='\u2160' && input.LA(1)<='\u2183')||(input.LA(1)>='\u3005' && input.LA(1)<='\u3007')||(input.LA(1)>='\u3021' && input.LA(1)<='\u3029')||(input.LA(1)>='\u3031' && input.LA(1)<='\u3035')||(input.LA(1)>='\u3038' && input.LA(1)<='\u303C')||(input.LA(1)>='\u3041' && input.LA(1)<='\u3096')||(input.LA(1)>='\u309D' && input.LA(1)<='\u309F')||(input.LA(1)>='\u30A1' && input.LA(1)<='\u30FF')||(input.LA(1)>='\u3105' && input.LA(1)<='\u312C')||(input.LA(1)>='\u3131' && input.LA(1)<='\u318E')||(input.LA(1)>='\u31A0' && input.LA(1)<='\u31B7')||(input.LA(1)>='\u31F0' && input.LA(1)<='\u31FF')||(input.LA(1)>='\u3400' && input.LA(1)<='\u4DB5')||(input.LA(1)>='\u4E00' && input.LA(1)<='\u9FA5')||(input.LA(1)>='\uA000' && input.LA(1)<='\uA48C')||(input.LA(1)>='\uAC00' && input.LA(1)<='\uD7A3')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFA2D')||(input.LA(1)>='\uFA30' && input.LA(1)<='\uFA6A')||(input.LA(1)>='\uFB00' && input.LA(1)<='\uFB06')||(input.LA(1)>='\uFB13' && input.LA(1)<='\uFB17')||input.LA(1)=='\uFB1D'||(input.LA(1)>='\uFB1F' && input.LA(1)<='\uFB28')||(input.LA(1)>='\uFB2A' && input.LA(1)<='\uFB36')||(input.LA(1)>='\uFB38' && input.LA(1)<='\uFB3C')||input.LA(1)=='\uFB3E'||(input.LA(1)>='\uFB40' && input.LA(1)<='\uFB41')||(input.LA(1)>='\uFB43' && input.LA(1)<='\uFB44')||(input.LA(1)>='\uFB46' && input.LA(1)<='\uFBB1')||(input.LA(1)>='\uFBD3' && input.LA(1)<='\uFD3D')||(input.LA(1)>='\uFD50' && input.LA(1)<='\uFD8F')||(input.LA(1)>='\uFD92' && input.LA(1)<='\uFDC7')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFDFC')||(input.LA(1)>='\uFE33' && input.LA(1)<='\uFE34')||(input.LA(1)>='\uFE4D' && input.LA(1)<='\uFE4F')||input.LA(1)=='\uFE69'||(input.LA(1)>='\uFE70' && input.LA(1)<='\uFE74')||(input.LA(1)>='\uFE76' && input.LA(1)<='\uFEFC')||input.LA(1)=='\uFF04'||(input.LA(1)>='\uFF21' && input.LA(1)<='\uFF3A')||input.LA(1)=='\uFF3F'||(input.LA(1)>='\uFF41' && input.LA(1)<='\uFF5A')||(input.LA(1)>='\uFF65' && input.LA(1)<='\uFFBE')||(input.LA(1)>='\uFFC2' && input.LA(1)<='\uFFC7')||(input.LA(1)>='\uFFCA' && input.LA(1)<='\uFFCF')||(input.LA(1)>='\uFFD2' && input.LA(1)<='\uFFD7')||(input.LA(1)>='\uFFDA' && input.LA(1)<='\uFFDC')||(input.LA(1)>='\uFFE0' && input.LA(1)<='\uFFE1')||(input.LA(1)>='\uFFE5' && input.LA(1)<='\uFFE6') ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 123, RULE_IDENTIFIER_START_StartIndex); }
        }
    }
    // $ANTLR end "RULE_IDENTIFIER_START"

    // $ANTLR start "RULE_IDENTIFIER_PART"
    public final void mRULE_IDENTIFIER_PART() throws RecognitionException {
        int RULE_IDENTIFIER_PART_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 124) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:506:31: ( ( RULE_IDENTIFIER_START | RULE_IDENTIFIER_PART_IMPL ) )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:506:33: ( RULE_IDENTIFIER_START | RULE_IDENTIFIER_PART_IMPL )
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001B')||input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u007F' && input.LA(1)<='\u009F')||(input.LA(1)>='\u00A2' && input.LA(1)<='\u00A5')||input.LA(1)=='\u00AA'||input.LA(1)=='\u00AD'||input.LA(1)=='\u00B5'||input.LA(1)=='\u00BA'||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u0236')||(input.LA(1)>='\u0250' && input.LA(1)<='\u02C1')||(input.LA(1)>='\u02C6' && input.LA(1)<='\u02D1')||(input.LA(1)>='\u02E0' && input.LA(1)<='\u02E4')||input.LA(1)=='\u02EE'||(input.LA(1)>='\u0300' && input.LA(1)<='\u0357')||(input.LA(1)>='\u035D' && input.LA(1)<='\u036F')||input.LA(1)=='\u037A'||input.LA(1)=='\u0386'||(input.LA(1)>='\u0388' && input.LA(1)<='\u038A')||input.LA(1)=='\u038C'||(input.LA(1)>='\u038E' && input.LA(1)<='\u03A1')||(input.LA(1)>='\u03A3' && input.LA(1)<='\u03CE')||(input.LA(1)>='\u03D0' && input.LA(1)<='\u03F5')||(input.LA(1)>='\u03F7' && input.LA(1)<='\u03FB')||(input.LA(1)>='\u0400' && input.LA(1)<='\u0481')||(input.LA(1)>='\u0483' && input.LA(1)<='\u0486')||(input.LA(1)>='\u048A' && input.LA(1)<='\u04CE')||(input.LA(1)>='\u04D0' && input.LA(1)<='\u04F5')||(input.LA(1)>='\u04F8' && input.LA(1)<='\u04F9')||(input.LA(1)>='\u0500' && input.LA(1)<='\u050F')||(input.LA(1)>='\u0531' && input.LA(1)<='\u0556')||input.LA(1)=='\u0559'||(input.LA(1)>='\u0561' && input.LA(1)<='\u0587')||(input.LA(1)>='\u0591' && input.LA(1)<='\u05A1')||(input.LA(1)>='\u05A3' && input.LA(1)<='\u05B9')||(input.LA(1)>='\u05BB' && input.LA(1)<='\u05BD')||input.LA(1)=='\u05BF'||(input.LA(1)>='\u05C1' && input.LA(1)<='\u05C2')||input.LA(1)=='\u05C4'||(input.LA(1)>='\u05D0' && input.LA(1)<='\u05EA')||(input.LA(1)>='\u05F0' && input.LA(1)<='\u05F2')||(input.LA(1)>='\u0600' && input.LA(1)<='\u0603')||(input.LA(1)>='\u0610' && input.LA(1)<='\u0615')||(input.LA(1)>='\u0621' && input.LA(1)<='\u063A')||(input.LA(1)>='\u0640' && input.LA(1)<='\u0658')||(input.LA(1)>='\u0660' && input.LA(1)<='\u0669')||(input.LA(1)>='\u066E' && input.LA(1)<='\u06D3')||(input.LA(1)>='\u06D5' && input.LA(1)<='\u06DD')||(input.LA(1)>='\u06DF' && input.LA(1)<='\u06E8')||(input.LA(1)>='\u06EA' && input.LA(1)<='\u06FC')||input.LA(1)=='\u06FF'||(input.LA(1)>='\u070F' && input.LA(1)<='\u074A')||(input.LA(1)>='\u074D' && input.LA(1)<='\u074F')||(input.LA(1)>='\u0780' && input.LA(1)<='\u07B1')||(input.LA(1)>='\u0901' && input.LA(1)<='\u0939')||(input.LA(1)>='\u093C' && input.LA(1)<='\u094D')||(input.LA(1)>='\u0950' && input.LA(1)<='\u0954')||(input.LA(1)>='\u0958' && input.LA(1)<='\u0963')||(input.LA(1)>='\u0966' && input.LA(1)<='\u096F')||(input.LA(1)>='\u0981' && input.LA(1)<='\u0983')||(input.LA(1)>='\u0985' && input.LA(1)<='\u098C')||(input.LA(1)>='\u098F' && input.LA(1)<='\u0990')||(input.LA(1)>='\u0993' && input.LA(1)<='\u09A8')||(input.LA(1)>='\u09AA' && input.LA(1)<='\u09B0')||input.LA(1)=='\u09B2'||(input.LA(1)>='\u09B6' && input.LA(1)<='\u09B9')||(input.LA(1)>='\u09BC' && input.LA(1)<='\u09C4')||(input.LA(1)>='\u09C7' && input.LA(1)<='\u09C8')||(input.LA(1)>='\u09CB' && input.LA(1)<='\u09CD')||input.LA(1)=='\u09D7'||(input.LA(1)>='\u09DC' && input.LA(1)<='\u09DD')||(input.LA(1)>='\u09DF' && input.LA(1)<='\u09E3')||(input.LA(1)>='\u09E6' && input.LA(1)<='\u09F3')||(input.LA(1)>='\u0A01' && input.LA(1)<='\u0A03')||(input.LA(1)>='\u0A05' && input.LA(1)<='\u0A0A')||(input.LA(1)>='\u0A0F' && input.LA(1)<='\u0A10')||(input.LA(1)>='\u0A13' && input.LA(1)<='\u0A28')||(input.LA(1)>='\u0A2A' && input.LA(1)<='\u0A30')||(input.LA(1)>='\u0A32' && input.LA(1)<='\u0A33')||(input.LA(1)>='\u0A35' && input.LA(1)<='\u0A36')||(input.LA(1)>='\u0A38' && input.LA(1)<='\u0A39')||input.LA(1)=='\u0A3C'||(input.LA(1)>='\u0A3E' && input.LA(1)<='\u0A42')||(input.LA(1)>='\u0A47' && input.LA(1)<='\u0A48')||(input.LA(1)>='\u0A4B' && input.LA(1)<='\u0A4D')||(input.LA(1)>='\u0A59' && input.LA(1)<='\u0A5C')||input.LA(1)=='\u0A5E'||(input.LA(1)>='\u0A66' && input.LA(1)<='\u0A74')||(input.LA(1)>='\u0A81' && input.LA(1)<='\u0A83')||(input.LA(1)>='\u0A85' && input.LA(1)<='\u0A8D')||(input.LA(1)>='\u0A8F' && input.LA(1)<='\u0A91')||(input.LA(1)>='\u0A93' && input.LA(1)<='\u0AA8')||(input.LA(1)>='\u0AAA' && input.LA(1)<='\u0AB0')||(input.LA(1)>='\u0AB2' && input.LA(1)<='\u0AB3')||(input.LA(1)>='\u0AB5' && input.LA(1)<='\u0AB9')||(input.LA(1)>='\u0ABC' && input.LA(1)<='\u0AC5')||(input.LA(1)>='\u0AC7' && input.LA(1)<='\u0AC9')||(input.LA(1)>='\u0ACB' && input.LA(1)<='\u0ACD')||input.LA(1)=='\u0AD0'||(input.LA(1)>='\u0AE0' && input.LA(1)<='\u0AE3')||(input.LA(1)>='\u0AE6' && input.LA(1)<='\u0AEF')||input.LA(1)=='\u0AF1'||(input.LA(1)>='\u0B01' && input.LA(1)<='\u0B03')||(input.LA(1)>='\u0B05' && input.LA(1)<='\u0B0C')||(input.LA(1)>='\u0B0F' && input.LA(1)<='\u0B10')||(input.LA(1)>='\u0B13' && input.LA(1)<='\u0B28')||(input.LA(1)>='\u0B2A' && input.LA(1)<='\u0B30')||(input.LA(1)>='\u0B32' && input.LA(1)<='\u0B33')||(input.LA(1)>='\u0B35' && input.LA(1)<='\u0B39')||(input.LA(1)>='\u0B3C' && input.LA(1)<='\u0B43')||(input.LA(1)>='\u0B47' && input.LA(1)<='\u0B48')||(input.LA(1)>='\u0B4B' && input.LA(1)<='\u0B4D')||(input.LA(1)>='\u0B56' && input.LA(1)<='\u0B57')||(input.LA(1)>='\u0B5C' && input.LA(1)<='\u0B5D')||(input.LA(1)>='\u0B5F' && input.LA(1)<='\u0B61')||(input.LA(1)>='\u0B66' && input.LA(1)<='\u0B6F')||input.LA(1)=='\u0B71'||(input.LA(1)>='\u0B82' && input.LA(1)<='\u0B83')||(input.LA(1)>='\u0B85' && input.LA(1)<='\u0B8A')||(input.LA(1)>='\u0B8E' && input.LA(1)<='\u0B90')||(input.LA(1)>='\u0B92' && input.LA(1)<='\u0B95')||(input.LA(1)>='\u0B99' && input.LA(1)<='\u0B9A')||input.LA(1)=='\u0B9C'||(input.LA(1)>='\u0B9E' && input.LA(1)<='\u0B9F')||(input.LA(1)>='\u0BA3' && input.LA(1)<='\u0BA4')||(input.LA(1)>='\u0BA8' && input.LA(1)<='\u0BAA')||(input.LA(1)>='\u0BAE' && input.LA(1)<='\u0BB5')||(input.LA(1)>='\u0BB7' && input.LA(1)<='\u0BB9')||(input.LA(1)>='\u0BBE' && input.LA(1)<='\u0BC2')||(input.LA(1)>='\u0BC6' && input.LA(1)<='\u0BC8')||(input.LA(1)>='\u0BCA' && input.LA(1)<='\u0BCD')||input.LA(1)=='\u0BD7'||(input.LA(1)>='\u0BE7' && input.LA(1)<='\u0BEF')||input.LA(1)=='\u0BF9'||(input.LA(1)>='\u0C01' && input.LA(1)<='\u0C03')||(input.LA(1)>='\u0C05' && input.LA(1)<='\u0C0C')||(input.LA(1)>='\u0C0E' && input.LA(1)<='\u0C10')||(input.LA(1)>='\u0C12' && input.LA(1)<='\u0C28')||(input.LA(1)>='\u0C2A' && input.LA(1)<='\u0C33')||(input.LA(1)>='\u0C35' && input.LA(1)<='\u0C39')||(input.LA(1)>='\u0C3E' && input.LA(1)<='\u0C44')||(input.LA(1)>='\u0C46' && input.LA(1)<='\u0C48')||(input.LA(1)>='\u0C4A' && input.LA(1)<='\u0C4D')||(input.LA(1)>='\u0C55' && input.LA(1)<='\u0C56')||(input.LA(1)>='\u0C60' && input.LA(1)<='\u0C61')||(input.LA(1)>='\u0C66' && input.LA(1)<='\u0C6F')||(input.LA(1)>='\u0C82' && input.LA(1)<='\u0C83')||(input.LA(1)>='\u0C85' && input.LA(1)<='\u0C8C')||(input.LA(1)>='\u0C8E' && input.LA(1)<='\u0C90')||(input.LA(1)>='\u0C92' && input.LA(1)<='\u0CA8')||(input.LA(1)>='\u0CAA' && input.LA(1)<='\u0CB3')||(input.LA(1)>='\u0CB5' && input.LA(1)<='\u0CB9')||(input.LA(1)>='\u0CBC' && input.LA(1)<='\u0CC4')||(input.LA(1)>='\u0CC6' && input.LA(1)<='\u0CC8')||(input.LA(1)>='\u0CCA' && input.LA(1)<='\u0CCD')||(input.LA(1)>='\u0CD5' && input.LA(1)<='\u0CD6')||input.LA(1)=='\u0CDE'||(input.LA(1)>='\u0CE0' && input.LA(1)<='\u0CE1')||(input.LA(1)>='\u0CE6' && input.LA(1)<='\u0CEF')||(input.LA(1)>='\u0D02' && input.LA(1)<='\u0D03')||(input.LA(1)>='\u0D05' && input.LA(1)<='\u0D0C')||(input.LA(1)>='\u0D0E' && input.LA(1)<='\u0D10')||(input.LA(1)>='\u0D12' && input.LA(1)<='\u0D28')||(input.LA(1)>='\u0D2A' && input.LA(1)<='\u0D39')||(input.LA(1)>='\u0D3E' && input.LA(1)<='\u0D43')||(input.LA(1)>='\u0D46' && input.LA(1)<='\u0D48')||(input.LA(1)>='\u0D4A' && input.LA(1)<='\u0D4D')||input.LA(1)=='\u0D57'||(input.LA(1)>='\u0D60' && input.LA(1)<='\u0D61')||(input.LA(1)>='\u0D66' && input.LA(1)<='\u0D6F')||(input.LA(1)>='\u0D82' && input.LA(1)<='\u0D83')||(input.LA(1)>='\u0D85' && input.LA(1)<='\u0D96')||(input.LA(1)>='\u0D9A' && input.LA(1)<='\u0DB1')||(input.LA(1)>='\u0DB3' && input.LA(1)<='\u0DBB')||input.LA(1)=='\u0DBD'||(input.LA(1)>='\u0DC0' && input.LA(1)<='\u0DC6')||input.LA(1)=='\u0DCA'||(input.LA(1)>='\u0DCF' && input.LA(1)<='\u0DD4')||input.LA(1)=='\u0DD6'||(input.LA(1)>='\u0DD8' && input.LA(1)<='\u0DDF')||(input.LA(1)>='\u0DF2' && input.LA(1)<='\u0DF3')||(input.LA(1)>='\u0E01' && input.LA(1)<='\u0E3A')||(input.LA(1)>='\u0E3F' && input.LA(1)<='\u0E4E')||(input.LA(1)>='\u0E50' && input.LA(1)<='\u0E59')||(input.LA(1)>='\u0E81' && input.LA(1)<='\u0E82')||input.LA(1)=='\u0E84'||(input.LA(1)>='\u0E87' && input.LA(1)<='\u0E88')||input.LA(1)=='\u0E8A'||input.LA(1)=='\u0E8D'||(input.LA(1)>='\u0E94' && input.LA(1)<='\u0E97')||(input.LA(1)>='\u0E99' && input.LA(1)<='\u0E9F')||(input.LA(1)>='\u0EA1' && input.LA(1)<='\u0EA3')||input.LA(1)=='\u0EA5'||input.LA(1)=='\u0EA7'||(input.LA(1)>='\u0EAA' && input.LA(1)<='\u0EAB')||(input.LA(1)>='\u0EAD' && input.LA(1)<='\u0EB9')||(input.LA(1)>='\u0EBB' && input.LA(1)<='\u0EBD')||(input.LA(1)>='\u0EC0' && input.LA(1)<='\u0EC4')||input.LA(1)=='\u0EC6'||(input.LA(1)>='\u0EC8' && input.LA(1)<='\u0ECD')||(input.LA(1)>='\u0ED0' && input.LA(1)<='\u0ED9')||(input.LA(1)>='\u0EDC' && input.LA(1)<='\u0EDD')||input.LA(1)=='\u0F00'||(input.LA(1)>='\u0F18' && input.LA(1)<='\u0F19')||(input.LA(1)>='\u0F20' && input.LA(1)<='\u0F29')||input.LA(1)=='\u0F35'||input.LA(1)=='\u0F37'||input.LA(1)=='\u0F39'||(input.LA(1)>='\u0F3E' && input.LA(1)<='\u0F47')||(input.LA(1)>='\u0F49' && input.LA(1)<='\u0F6A')||(input.LA(1)>='\u0F71' && input.LA(1)<='\u0F84')||(input.LA(1)>='\u0F86' && input.LA(1)<='\u0F8B')||(input.LA(1)>='\u0F90' && input.LA(1)<='\u0F97')||(input.LA(1)>='\u0F99' && input.LA(1)<='\u0FBC')||input.LA(1)=='\u0FC6'||(input.LA(1)>='\u1000' && input.LA(1)<='\u1021')||(input.LA(1)>='\u1023' && input.LA(1)<='\u1027')||(input.LA(1)>='\u1029' && input.LA(1)<='\u102A')||(input.LA(1)>='\u102C' && input.LA(1)<='\u1032')||(input.LA(1)>='\u1036' && input.LA(1)<='\u1039')||(input.LA(1)>='\u1040' && input.LA(1)<='\u1049')||(input.LA(1)>='\u1050' && input.LA(1)<='\u1059')||(input.LA(1)>='\u10A0' && input.LA(1)<='\u10C5')||(input.LA(1)>='\u10D0' && input.LA(1)<='\u10F8')||(input.LA(1)>='\u1100' && input.LA(1)<='\u1159')||(input.LA(1)>='\u115F' && input.LA(1)<='\u11A2')||(input.LA(1)>='\u11A8' && input.LA(1)<='\u11F9')||(input.LA(1)>='\u1200' && input.LA(1)<='\u1206')||(input.LA(1)>='\u1208' && input.LA(1)<='\u1246')||input.LA(1)=='\u1248'||(input.LA(1)>='\u124A' && input.LA(1)<='\u124D')||(input.LA(1)>='\u1250' && input.LA(1)<='\u1256')||input.LA(1)=='\u1258'||(input.LA(1)>='\u125A' && input.LA(1)<='\u125D')||(input.LA(1)>='\u1260' && input.LA(1)<='\u1286')||input.LA(1)=='\u1288'||(input.LA(1)>='\u128A' && input.LA(1)<='\u128D')||(input.LA(1)>='\u1290' && input.LA(1)<='\u12AE')||input.LA(1)=='\u12B0'||(input.LA(1)>='\u12B2' && input.LA(1)<='\u12B5')||(input.LA(1)>='\u12B8' && input.LA(1)<='\u12BE')||input.LA(1)=='\u12C0'||(input.LA(1)>='\u12C2' && input.LA(1)<='\u12C5')||(input.LA(1)>='\u12C8' && input.LA(1)<='\u12CE')||(input.LA(1)>='\u12D0' && input.LA(1)<='\u12D6')||(input.LA(1)>='\u12D8' && input.LA(1)<='\u12EE')||(input.LA(1)>='\u12F0' && input.LA(1)<='\u130E')||input.LA(1)=='\u1310'||(input.LA(1)>='\u1312' && input.LA(1)<='\u1315')||(input.LA(1)>='\u1318' && input.LA(1)<='\u131E')||(input.LA(1)>='\u1320' && input.LA(1)<='\u1346')||(input.LA(1)>='\u1348' && input.LA(1)<='\u135A')||(input.LA(1)>='\u1369' && input.LA(1)<='\u1371')||(input.LA(1)>='\u13A0' && input.LA(1)<='\u13F4')||(input.LA(1)>='\u1401' && input.LA(1)<='\u166C')||(input.LA(1)>='\u166F' && input.LA(1)<='\u1676')||(input.LA(1)>='\u1681' && input.LA(1)<='\u169A')||(input.LA(1)>='\u16A0' && input.LA(1)<='\u16EA')||(input.LA(1)>='\u16EE' && input.LA(1)<='\u16F0')||(input.LA(1)>='\u1700' && input.LA(1)<='\u170C')||(input.LA(1)>='\u170E' && input.LA(1)<='\u1714')||(input.LA(1)>='\u1720' && input.LA(1)<='\u1734')||(input.LA(1)>='\u1740' && input.LA(1)<='\u1753')||(input.LA(1)>='\u1760' && input.LA(1)<='\u176C')||(input.LA(1)>='\u176E' && input.LA(1)<='\u1770')||(input.LA(1)>='\u1772' && input.LA(1)<='\u1773')||(input.LA(1)>='\u1780' && input.LA(1)<='\u17D3')||input.LA(1)=='\u17D7'||(input.LA(1)>='\u17DB' && input.LA(1)<='\u17DD')||(input.LA(1)>='\u17E0' && input.LA(1)<='\u17E9')||(input.LA(1)>='\u180B' && input.LA(1)<='\u180D')||(input.LA(1)>='\u1810' && input.LA(1)<='\u1819')||(input.LA(1)>='\u1820' && input.LA(1)<='\u1877')||(input.LA(1)>='\u1880' && input.LA(1)<='\u18A9')||(input.LA(1)>='\u1900' && input.LA(1)<='\u191C')||(input.LA(1)>='\u1920' && input.LA(1)<='\u192B')||(input.LA(1)>='\u1930' && input.LA(1)<='\u193B')||(input.LA(1)>='\u1946' && input.LA(1)<='\u196D')||(input.LA(1)>='\u1970' && input.LA(1)<='\u1974')||(input.LA(1)>='\u1D00' && input.LA(1)<='\u1D6B')||(input.LA(1)>='\u1E00' && input.LA(1)<='\u1E9B')||(input.LA(1)>='\u1EA0' && input.LA(1)<='\u1EF9')||(input.LA(1)>='\u1F00' && input.LA(1)<='\u1F15')||(input.LA(1)>='\u1F18' && input.LA(1)<='\u1F1D')||(input.LA(1)>='\u1F20' && input.LA(1)<='\u1F45')||(input.LA(1)>='\u1F48' && input.LA(1)<='\u1F4D')||(input.LA(1)>='\u1F50' && input.LA(1)<='\u1F57')||input.LA(1)=='\u1F59'||input.LA(1)=='\u1F5B'||input.LA(1)=='\u1F5D'||(input.LA(1)>='\u1F5F' && input.LA(1)<='\u1F7D')||(input.LA(1)>='\u1F80' && input.LA(1)<='\u1FB4')||(input.LA(1)>='\u1FB6' && input.LA(1)<='\u1FBC')||input.LA(1)=='\u1FBE'||(input.LA(1)>='\u1FC2' && input.LA(1)<='\u1FC4')||(input.LA(1)>='\u1FC6' && input.LA(1)<='\u1FCC')||(input.LA(1)>='\u1FD0' && input.LA(1)<='\u1FD3')||(input.LA(1)>='\u1FD6' && input.LA(1)<='\u1FDB')||(input.LA(1)>='\u1FE0' && input.LA(1)<='\u1FEC')||(input.LA(1)>='\u1FF2' && input.LA(1)<='\u1FF4')||(input.LA(1)>='\u1FF6' && input.LA(1)<='\u1FFC')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200F')||(input.LA(1)>='\u202A' && input.LA(1)<='\u202E')||(input.LA(1)>='\u203F' && input.LA(1)<='\u2040')||input.LA(1)=='\u2054'||(input.LA(1)>='\u2060' && input.LA(1)<='\u2063')||(input.LA(1)>='\u206A' && input.LA(1)<='\u206F')||input.LA(1)=='\u2071'||input.LA(1)=='\u207F'||(input.LA(1)>='\u20A0' && input.LA(1)<='\u20B1')||(input.LA(1)>='\u20D0' && input.LA(1)<='\u20DC')||input.LA(1)=='\u20E1'||(input.LA(1)>='\u20E5' && input.LA(1)<='\u20EA')||input.LA(1)=='\u2102'||input.LA(1)=='\u2107'||(input.LA(1)>='\u210A' && input.LA(1)<='\u2113')||input.LA(1)=='\u2115'||(input.LA(1)>='\u2119' && input.LA(1)<='\u211D')||input.LA(1)=='\u2124'||input.LA(1)=='\u2126'||input.LA(1)=='\u2128'||(input.LA(1)>='\u212A' && input.LA(1)<='\u212D')||(input.LA(1)>='\u212F' && input.LA(1)<='\u2131')||(input.LA(1)>='\u2133' && input.LA(1)<='\u2139')||(input.LA(1)>='\u213D' && input.LA(1)<='\u213F')||(input.LA(1)>='\u2145' && input.LA(1)<='\u2149')||(input.LA(1)>='\u2160' && input.LA(1)<='\u2183')||(input.LA(1)>='\u3005' && input.LA(1)<='\u3007')||(input.LA(1)>='\u3021' && input.LA(1)<='\u302F')||(input.LA(1)>='\u3031' && input.LA(1)<='\u3035')||(input.LA(1)>='\u3038' && input.LA(1)<='\u303C')||(input.LA(1)>='\u3041' && input.LA(1)<='\u3096')||(input.LA(1)>='\u3099' && input.LA(1)<='\u309A')||(input.LA(1)>='\u309D' && input.LA(1)<='\u309F')||(input.LA(1)>='\u30A1' && input.LA(1)<='\u30FF')||(input.LA(1)>='\u3105' && input.LA(1)<='\u312C')||(input.LA(1)>='\u3131' && input.LA(1)<='\u318E')||(input.LA(1)>='\u31A0' && input.LA(1)<='\u31B7')||(input.LA(1)>='\u31F0' && input.LA(1)<='\u31FF')||(input.LA(1)>='\u3400' && input.LA(1)<='\u4DB5')||(input.LA(1)>='\u4E00' && input.LA(1)<='\u9FA5')||(input.LA(1)>='\uA000' && input.LA(1)<='\uA48C')||(input.LA(1)>='\uAC00' && input.LA(1)<='\uD7A3')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFA2D')||(input.LA(1)>='\uFA30' && input.LA(1)<='\uFA6A')||(input.LA(1)>='\uFB00' && input.LA(1)<='\uFB06')||(input.LA(1)>='\uFB13' && input.LA(1)<='\uFB17')||(input.LA(1)>='\uFB1D' && input.LA(1)<='\uFB28')||(input.LA(1)>='\uFB2A' && input.LA(1)<='\uFB36')||(input.LA(1)>='\uFB38' && input.LA(1)<='\uFB3C')||input.LA(1)=='\uFB3E'||(input.LA(1)>='\uFB40' && input.LA(1)<='\uFB41')||(input.LA(1)>='\uFB43' && input.LA(1)<='\uFB44')||(input.LA(1)>='\uFB46' && input.LA(1)<='\uFBB1')||(input.LA(1)>='\uFBD3' && input.LA(1)<='\uFD3D')||(input.LA(1)>='\uFD50' && input.LA(1)<='\uFD8F')||(input.LA(1)>='\uFD92' && input.LA(1)<='\uFDC7')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFDFC')||(input.LA(1)>='\uFE00' && input.LA(1)<='\uFE0F')||(input.LA(1)>='\uFE20' && input.LA(1)<='\uFE23')||(input.LA(1)>='\uFE33' && input.LA(1)<='\uFE34')||(input.LA(1)>='\uFE4D' && input.LA(1)<='\uFE4F')||input.LA(1)=='\uFE69'||(input.LA(1)>='\uFE70' && input.LA(1)<='\uFE74')||(input.LA(1)>='\uFE76' && input.LA(1)<='\uFEFC')||input.LA(1)=='\uFEFF'||input.LA(1)=='\uFF04'||(input.LA(1)>='\uFF10' && input.LA(1)<='\uFF19')||(input.LA(1)>='\uFF21' && input.LA(1)<='\uFF3A')||input.LA(1)=='\uFF3F'||(input.LA(1)>='\uFF41' && input.LA(1)<='\uFF5A')||(input.LA(1)>='\uFF65' && input.LA(1)<='\uFFBE')||(input.LA(1)>='\uFFC2' && input.LA(1)<='\uFFC7')||(input.LA(1)>='\uFFCA' && input.LA(1)<='\uFFCF')||(input.LA(1)>='\uFFD2' && input.LA(1)<='\uFFD7')||(input.LA(1)>='\uFFDA' && input.LA(1)<='\uFFDC')||(input.LA(1)>='\uFFE0' && input.LA(1)<='\uFFE1')||(input.LA(1)>='\uFFE5' && input.LA(1)<='\uFFE6')||(input.LA(1)>='\uFFF9' && input.LA(1)<='\uFFFB') ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 124, RULE_IDENTIFIER_PART_StartIndex); }
        }
    }
    // $ANTLR end "RULE_IDENTIFIER_PART"

    // $ANTLR start "RULE_IDENTIFIER_PART_IMPL"
    public final void mRULE_IDENTIFIER_PART_IMPL() throws RecognitionException {
        int RULE_IDENTIFIER_PART_IMPL_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 125) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:508:36: ( ( '\\u0000' .. '\\b' | '\\u000E' .. '\\u001B' | '0' .. '9' | '\\u007F' .. '\\u009F' | '\\u00AD' | '\\u0300' .. '\\u0357' | '\\u035D' .. '\\u036F' | '\\u0483' .. '\\u0486' | '\\u0591' .. '\\u05A1' | '\\u05A3' .. '\\u05B9' | '\\u05BB' .. '\\u05BD' | '\\u05BF' | '\\u05C1' .. '\\u05C2' | '\\u05C4' | '\\u0600' .. '\\u0603' | '\\u0610' .. '\\u0615' | '\\u064B' .. '\\u0658' | '\\u0660' .. '\\u0669' | '\\u0670' | '\\u06D6' .. '\\u06DD' | '\\u06DF' .. '\\u06E4' | '\\u06E7' .. '\\u06E8' | '\\u06EA' .. '\\u06ED' | '\\u06F0' .. '\\u06F9' | '\\u070F' | '\\u0711' | '\\u0730' .. '\\u074A' | '\\u07A6' .. '\\u07B0' | '\\u0901' .. '\\u0903' | '\\u093C' | '\\u093E' .. '\\u094D' | '\\u0951' .. '\\u0954' | '\\u0962' .. '\\u0963' | '\\u0966' .. '\\u096F' | '\\u0981' .. '\\u0983' | '\\u09BC' | '\\u09BE' .. '\\u09C4' | '\\u09C7' .. '\\u09C8' | '\\u09CB' .. '\\u09CD' | '\\u09D7' | '\\u09E2' .. '\\u09E3' | '\\u09E6' .. '\\u09EF' | '\\u0A01' .. '\\u0A03' | '\\u0A3C' | '\\u0A3E' .. '\\u0A42' | '\\u0A47' .. '\\u0A48' | '\\u0A4B' .. '\\u0A4D' | '\\u0A66' .. '\\u0A71' | '\\u0A81' .. '\\u0A83' | '\\u0ABC' | '\\u0ABE' .. '\\u0AC5' | '\\u0AC7' .. '\\u0AC9' | '\\u0ACB' .. '\\u0ACD' | '\\u0AE2' .. '\\u0AE3' | '\\u0AE6' .. '\\u0AEF' | '\\u0B01' .. '\\u0B03' | '\\u0B3C' | '\\u0B3E' .. '\\u0B43' | '\\u0B47' .. '\\u0B48' | '\\u0B4B' .. '\\u0B4D' | '\\u0B56' .. '\\u0B57' | '\\u0B66' .. '\\u0B6F' | '\\u0B82' | '\\u0BBE' .. '\\u0BC2' | '\\u0BC6' .. '\\u0BC8' | '\\u0BCA' .. '\\u0BCD' | '\\u0BD7' | '\\u0BE7' .. '\\u0BEF' | '\\u0C01' .. '\\u0C03' | '\\u0C3E' .. '\\u0C44' | '\\u0C46' .. '\\u0C48' | '\\u0C4A' .. '\\u0C4D' | '\\u0C55' .. '\\u0C56' | '\\u0C66' .. '\\u0C6F' | '\\u0C82' .. '\\u0C83' | '\\u0CBC' | '\\u0CBE' .. '\\u0CC4' | '\\u0CC6' .. '\\u0CC8' | '\\u0CCA' .. '\\u0CCD' | '\\u0CD5' .. '\\u0CD6' | '\\u0CE6' .. '\\u0CEF' | '\\u0D02' .. '\\u0D03' | '\\u0D3E' .. '\\u0D43' | '\\u0D46' .. '\\u0D48' | '\\u0D4A' .. '\\u0D4D' | '\\u0D57' | '\\u0D66' .. '\\u0D6F' | '\\u0D82' .. '\\u0D83' | '\\u0DCA' | '\\u0DCF' .. '\\u0DD4' | '\\u0DD6' | '\\u0DD8' .. '\\u0DDF' | '\\u0DF2' .. '\\u0DF3' | '\\u0E31' | '\\u0E34' .. '\\u0E3A' | '\\u0E47' .. '\\u0E4E' | '\\u0E50' .. '\\u0E59' | '\\u0EB1' | '\\u0EB4' .. '\\u0EB9' | '\\u0EBB' .. '\\u0EBC' | '\\u0EC8' .. '\\u0ECD' | '\\u0ED0' .. '\\u0ED9' | '\\u0F18' .. '\\u0F19' | '\\u0F20' .. '\\u0F29' | '\\u0F35' | '\\u0F37' | '\\u0F39' | '\\u0F3E' .. '\\u0F3F' | '\\u0F71' .. '\\u0F84' | '\\u0F86' .. '\\u0F87' | '\\u0F90' .. '\\u0F97' | '\\u0F99' .. '\\u0FBC' | '\\u0FC6' | '\\u102C' .. '\\u1032' | '\\u1036' .. '\\u1039' | '\\u1040' .. '\\u1049' | '\\u1056' .. '\\u1059' | '\\u1369' .. '\\u1371' | '\\u1712' .. '\\u1714' | '\\u1732' .. '\\u1734' | '\\u1752' .. '\\u1753' | '\\u1772' .. '\\u1773' | '\\u17B4' .. '\\u17D3' | '\\u17DD' | '\\u17E0' .. '\\u17E9' | '\\u180B' .. '\\u180D' | '\\u1810' .. '\\u1819' | '\\u18A9' | '\\u1920' .. '\\u192B' | '\\u1930' .. '\\u193B' | '\\u1946' .. '\\u194F' | '\\u200C' .. '\\u200F' | '\\u202A' .. '\\u202E' | '\\u2060' .. '\\u2063' | '\\u206A' .. '\\u206F' | '\\u20D0' .. '\\u20DC' | '\\u20E1' | '\\u20E5' .. '\\u20EA' | '\\u302A' .. '\\u302F' | '\\u3099' .. '\\u309A' | '\\uFB1E' | '\\uFE00' .. '\\uFE0F' | '\\uFE20' .. '\\uFE23' | '\\uFEFF' | '\\uFF10' .. '\\uFF19' | '\\uFFF9' .. '\\uFFFB' ) )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:508:38: ( '\\u0000' .. '\\b' | '\\u000E' .. '\\u001B' | '0' .. '9' | '\\u007F' .. '\\u009F' | '\\u00AD' | '\\u0300' .. '\\u0357' | '\\u035D' .. '\\u036F' | '\\u0483' .. '\\u0486' | '\\u0591' .. '\\u05A1' | '\\u05A3' .. '\\u05B9' | '\\u05BB' .. '\\u05BD' | '\\u05BF' | '\\u05C1' .. '\\u05C2' | '\\u05C4' | '\\u0600' .. '\\u0603' | '\\u0610' .. '\\u0615' | '\\u064B' .. '\\u0658' | '\\u0660' .. '\\u0669' | '\\u0670' | '\\u06D6' .. '\\u06DD' | '\\u06DF' .. '\\u06E4' | '\\u06E7' .. '\\u06E8' | '\\u06EA' .. '\\u06ED' | '\\u06F0' .. '\\u06F9' | '\\u070F' | '\\u0711' | '\\u0730' .. '\\u074A' | '\\u07A6' .. '\\u07B0' | '\\u0901' .. '\\u0903' | '\\u093C' | '\\u093E' .. '\\u094D' | '\\u0951' .. '\\u0954' | '\\u0962' .. '\\u0963' | '\\u0966' .. '\\u096F' | '\\u0981' .. '\\u0983' | '\\u09BC' | '\\u09BE' .. '\\u09C4' | '\\u09C7' .. '\\u09C8' | '\\u09CB' .. '\\u09CD' | '\\u09D7' | '\\u09E2' .. '\\u09E3' | '\\u09E6' .. '\\u09EF' | '\\u0A01' .. '\\u0A03' | '\\u0A3C' | '\\u0A3E' .. '\\u0A42' | '\\u0A47' .. '\\u0A48' | '\\u0A4B' .. '\\u0A4D' | '\\u0A66' .. '\\u0A71' | '\\u0A81' .. '\\u0A83' | '\\u0ABC' | '\\u0ABE' .. '\\u0AC5' | '\\u0AC7' .. '\\u0AC9' | '\\u0ACB' .. '\\u0ACD' | '\\u0AE2' .. '\\u0AE3' | '\\u0AE6' .. '\\u0AEF' | '\\u0B01' .. '\\u0B03' | '\\u0B3C' | '\\u0B3E' .. '\\u0B43' | '\\u0B47' .. '\\u0B48' | '\\u0B4B' .. '\\u0B4D' | '\\u0B56' .. '\\u0B57' | '\\u0B66' .. '\\u0B6F' | '\\u0B82' | '\\u0BBE' .. '\\u0BC2' | '\\u0BC6' .. '\\u0BC8' | '\\u0BCA' .. '\\u0BCD' | '\\u0BD7' | '\\u0BE7' .. '\\u0BEF' | '\\u0C01' .. '\\u0C03' | '\\u0C3E' .. '\\u0C44' | '\\u0C46' .. '\\u0C48' | '\\u0C4A' .. '\\u0C4D' | '\\u0C55' .. '\\u0C56' | '\\u0C66' .. '\\u0C6F' | '\\u0C82' .. '\\u0C83' | '\\u0CBC' | '\\u0CBE' .. '\\u0CC4' | '\\u0CC6' .. '\\u0CC8' | '\\u0CCA' .. '\\u0CCD' | '\\u0CD5' .. '\\u0CD6' | '\\u0CE6' .. '\\u0CEF' | '\\u0D02' .. '\\u0D03' | '\\u0D3E' .. '\\u0D43' | '\\u0D46' .. '\\u0D48' | '\\u0D4A' .. '\\u0D4D' | '\\u0D57' | '\\u0D66' .. '\\u0D6F' | '\\u0D82' .. '\\u0D83' | '\\u0DCA' | '\\u0DCF' .. '\\u0DD4' | '\\u0DD6' | '\\u0DD8' .. '\\u0DDF' | '\\u0DF2' .. '\\u0DF3' | '\\u0E31' | '\\u0E34' .. '\\u0E3A' | '\\u0E47' .. '\\u0E4E' | '\\u0E50' .. '\\u0E59' | '\\u0EB1' | '\\u0EB4' .. '\\u0EB9' | '\\u0EBB' .. '\\u0EBC' | '\\u0EC8' .. '\\u0ECD' | '\\u0ED0' .. '\\u0ED9' | '\\u0F18' .. '\\u0F19' | '\\u0F20' .. '\\u0F29' | '\\u0F35' | '\\u0F37' | '\\u0F39' | '\\u0F3E' .. '\\u0F3F' | '\\u0F71' .. '\\u0F84' | '\\u0F86' .. '\\u0F87' | '\\u0F90' .. '\\u0F97' | '\\u0F99' .. '\\u0FBC' | '\\u0FC6' | '\\u102C' .. '\\u1032' | '\\u1036' .. '\\u1039' | '\\u1040' .. '\\u1049' | '\\u1056' .. '\\u1059' | '\\u1369' .. '\\u1371' | '\\u1712' .. '\\u1714' | '\\u1732' .. '\\u1734' | '\\u1752' .. '\\u1753' | '\\u1772' .. '\\u1773' | '\\u17B4' .. '\\u17D3' | '\\u17DD' | '\\u17E0' .. '\\u17E9' | '\\u180B' .. '\\u180D' | '\\u1810' .. '\\u1819' | '\\u18A9' | '\\u1920' .. '\\u192B' | '\\u1930' .. '\\u193B' | '\\u1946' .. '\\u194F' | '\\u200C' .. '\\u200F' | '\\u202A' .. '\\u202E' | '\\u2060' .. '\\u2063' | '\\u206A' .. '\\u206F' | '\\u20D0' .. '\\u20DC' | '\\u20E1' | '\\u20E5' .. '\\u20EA' | '\\u302A' .. '\\u302F' | '\\u3099' .. '\\u309A' | '\\uFB1E' | '\\uFE00' .. '\\uFE0F' | '\\uFE20' .. '\\uFE23' | '\\uFEFF' | '\\uFF10' .. '\\uFF19' | '\\uFFF9' .. '\\uFFFB' )
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001B')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='\u007F' && input.LA(1)<='\u009F')||input.LA(1)=='\u00AD'||(input.LA(1)>='\u0300' && input.LA(1)<='\u0357')||(input.LA(1)>='\u035D' && input.LA(1)<='\u036F')||(input.LA(1)>='\u0483' && input.LA(1)<='\u0486')||(input.LA(1)>='\u0591' && input.LA(1)<='\u05A1')||(input.LA(1)>='\u05A3' && input.LA(1)<='\u05B9')||(input.LA(1)>='\u05BB' && input.LA(1)<='\u05BD')||input.LA(1)=='\u05BF'||(input.LA(1)>='\u05C1' && input.LA(1)<='\u05C2')||input.LA(1)=='\u05C4'||(input.LA(1)>='\u0600' && input.LA(1)<='\u0603')||(input.LA(1)>='\u0610' && input.LA(1)<='\u0615')||(input.LA(1)>='\u064B' && input.LA(1)<='\u0658')||(input.LA(1)>='\u0660' && input.LA(1)<='\u0669')||input.LA(1)=='\u0670'||(input.LA(1)>='\u06D6' && input.LA(1)<='\u06DD')||(input.LA(1)>='\u06DF' && input.LA(1)<='\u06E4')||(input.LA(1)>='\u06E7' && input.LA(1)<='\u06E8')||(input.LA(1)>='\u06EA' && input.LA(1)<='\u06ED')||(input.LA(1)>='\u06F0' && input.LA(1)<='\u06F9')||input.LA(1)=='\u070F'||input.LA(1)=='\u0711'||(input.LA(1)>='\u0730' && input.LA(1)<='\u074A')||(input.LA(1)>='\u07A6' && input.LA(1)<='\u07B0')||(input.LA(1)>='\u0901' && input.LA(1)<='\u0903')||input.LA(1)=='\u093C'||(input.LA(1)>='\u093E' && input.LA(1)<='\u094D')||(input.LA(1)>='\u0951' && input.LA(1)<='\u0954')||(input.LA(1)>='\u0962' && input.LA(1)<='\u0963')||(input.LA(1)>='\u0966' && input.LA(1)<='\u096F')||(input.LA(1)>='\u0981' && input.LA(1)<='\u0983')||input.LA(1)=='\u09BC'||(input.LA(1)>='\u09BE' && input.LA(1)<='\u09C4')||(input.LA(1)>='\u09C7' && input.LA(1)<='\u09C8')||(input.LA(1)>='\u09CB' && input.LA(1)<='\u09CD')||input.LA(1)=='\u09D7'||(input.LA(1)>='\u09E2' && input.LA(1)<='\u09E3')||(input.LA(1)>='\u09E6' && input.LA(1)<='\u09EF')||(input.LA(1)>='\u0A01' && input.LA(1)<='\u0A03')||input.LA(1)=='\u0A3C'||(input.LA(1)>='\u0A3E' && input.LA(1)<='\u0A42')||(input.LA(1)>='\u0A47' && input.LA(1)<='\u0A48')||(input.LA(1)>='\u0A4B' && input.LA(1)<='\u0A4D')||(input.LA(1)>='\u0A66' && input.LA(1)<='\u0A71')||(input.LA(1)>='\u0A81' && input.LA(1)<='\u0A83')||input.LA(1)=='\u0ABC'||(input.LA(1)>='\u0ABE' && input.LA(1)<='\u0AC5')||(input.LA(1)>='\u0AC7' && input.LA(1)<='\u0AC9')||(input.LA(1)>='\u0ACB' && input.LA(1)<='\u0ACD')||(input.LA(1)>='\u0AE2' && input.LA(1)<='\u0AE3')||(input.LA(1)>='\u0AE6' && input.LA(1)<='\u0AEF')||(input.LA(1)>='\u0B01' && input.LA(1)<='\u0B03')||input.LA(1)=='\u0B3C'||(input.LA(1)>='\u0B3E' && input.LA(1)<='\u0B43')||(input.LA(1)>='\u0B47' && input.LA(1)<='\u0B48')||(input.LA(1)>='\u0B4B' && input.LA(1)<='\u0B4D')||(input.LA(1)>='\u0B56' && input.LA(1)<='\u0B57')||(input.LA(1)>='\u0B66' && input.LA(1)<='\u0B6F')||input.LA(1)=='\u0B82'||(input.LA(1)>='\u0BBE' && input.LA(1)<='\u0BC2')||(input.LA(1)>='\u0BC6' && input.LA(1)<='\u0BC8')||(input.LA(1)>='\u0BCA' && input.LA(1)<='\u0BCD')||input.LA(1)=='\u0BD7'||(input.LA(1)>='\u0BE7' && input.LA(1)<='\u0BEF')||(input.LA(1)>='\u0C01' && input.LA(1)<='\u0C03')||(input.LA(1)>='\u0C3E' && input.LA(1)<='\u0C44')||(input.LA(1)>='\u0C46' && input.LA(1)<='\u0C48')||(input.LA(1)>='\u0C4A' && input.LA(1)<='\u0C4D')||(input.LA(1)>='\u0C55' && input.LA(1)<='\u0C56')||(input.LA(1)>='\u0C66' && input.LA(1)<='\u0C6F')||(input.LA(1)>='\u0C82' && input.LA(1)<='\u0C83')||input.LA(1)=='\u0CBC'||(input.LA(1)>='\u0CBE' && input.LA(1)<='\u0CC4')||(input.LA(1)>='\u0CC6' && input.LA(1)<='\u0CC8')||(input.LA(1)>='\u0CCA' && input.LA(1)<='\u0CCD')||(input.LA(1)>='\u0CD5' && input.LA(1)<='\u0CD6')||(input.LA(1)>='\u0CE6' && input.LA(1)<='\u0CEF')||(input.LA(1)>='\u0D02' && input.LA(1)<='\u0D03')||(input.LA(1)>='\u0D3E' && input.LA(1)<='\u0D43')||(input.LA(1)>='\u0D46' && input.LA(1)<='\u0D48')||(input.LA(1)>='\u0D4A' && input.LA(1)<='\u0D4D')||input.LA(1)=='\u0D57'||(input.LA(1)>='\u0D66' && input.LA(1)<='\u0D6F')||(input.LA(1)>='\u0D82' && input.LA(1)<='\u0D83')||input.LA(1)=='\u0DCA'||(input.LA(1)>='\u0DCF' && input.LA(1)<='\u0DD4')||input.LA(1)=='\u0DD6'||(input.LA(1)>='\u0DD8' && input.LA(1)<='\u0DDF')||(input.LA(1)>='\u0DF2' && input.LA(1)<='\u0DF3')||input.LA(1)=='\u0E31'||(input.LA(1)>='\u0E34' && input.LA(1)<='\u0E3A')||(input.LA(1)>='\u0E47' && input.LA(1)<='\u0E4E')||(input.LA(1)>='\u0E50' && input.LA(1)<='\u0E59')||input.LA(1)=='\u0EB1'||(input.LA(1)>='\u0EB4' && input.LA(1)<='\u0EB9')||(input.LA(1)>='\u0EBB' && input.LA(1)<='\u0EBC')||(input.LA(1)>='\u0EC8' && input.LA(1)<='\u0ECD')||(input.LA(1)>='\u0ED0' && input.LA(1)<='\u0ED9')||(input.LA(1)>='\u0F18' && input.LA(1)<='\u0F19')||(input.LA(1)>='\u0F20' && input.LA(1)<='\u0F29')||input.LA(1)=='\u0F35'||input.LA(1)=='\u0F37'||input.LA(1)=='\u0F39'||(input.LA(1)>='\u0F3E' && input.LA(1)<='\u0F3F')||(input.LA(1)>='\u0F71' && input.LA(1)<='\u0F84')||(input.LA(1)>='\u0F86' && input.LA(1)<='\u0F87')||(input.LA(1)>='\u0F90' && input.LA(1)<='\u0F97')||(input.LA(1)>='\u0F99' && input.LA(1)<='\u0FBC')||input.LA(1)=='\u0FC6'||(input.LA(1)>='\u102C' && input.LA(1)<='\u1032')||(input.LA(1)>='\u1036' && input.LA(1)<='\u1039')||(input.LA(1)>='\u1040' && input.LA(1)<='\u1049')||(input.LA(1)>='\u1056' && input.LA(1)<='\u1059')||(input.LA(1)>='\u1369' && input.LA(1)<='\u1371')||(input.LA(1)>='\u1712' && input.LA(1)<='\u1714')||(input.LA(1)>='\u1732' && input.LA(1)<='\u1734')||(input.LA(1)>='\u1752' && input.LA(1)<='\u1753')||(input.LA(1)>='\u1772' && input.LA(1)<='\u1773')||(input.LA(1)>='\u17B4' && input.LA(1)<='\u17D3')||input.LA(1)=='\u17DD'||(input.LA(1)>='\u17E0' && input.LA(1)<='\u17E9')||(input.LA(1)>='\u180B' && input.LA(1)<='\u180D')||(input.LA(1)>='\u1810' && input.LA(1)<='\u1819')||input.LA(1)=='\u18A9'||(input.LA(1)>='\u1920' && input.LA(1)<='\u192B')||(input.LA(1)>='\u1930' && input.LA(1)<='\u193B')||(input.LA(1)>='\u1946' && input.LA(1)<='\u194F')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200F')||(input.LA(1)>='\u202A' && input.LA(1)<='\u202E')||(input.LA(1)>='\u2060' && input.LA(1)<='\u2063')||(input.LA(1)>='\u206A' && input.LA(1)<='\u206F')||(input.LA(1)>='\u20D0' && input.LA(1)<='\u20DC')||input.LA(1)=='\u20E1'||(input.LA(1)>='\u20E5' && input.LA(1)<='\u20EA')||(input.LA(1)>='\u302A' && input.LA(1)<='\u302F')||(input.LA(1)>='\u3099' && input.LA(1)<='\u309A')||input.LA(1)=='\uFB1E'||(input.LA(1)>='\uFE00' && input.LA(1)<='\uFE0F')||(input.LA(1)>='\uFE20' && input.LA(1)<='\uFE23')||input.LA(1)=='\uFEFF'||(input.LA(1)>='\uFF10' && input.LA(1)<='\uFF19')||(input.LA(1)>='\uFFF9' && input.LA(1)<='\uFFFB') ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 125, RULE_IDENTIFIER_PART_IMPL_StartIndex); }
        }
    }
    // $ANTLR end "RULE_IDENTIFIER_PART_IMPL"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        int RULE_HEX_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 126) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:510:19: ( FRAGMENT_RULE_HEX )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:510:21: FRAGMENT_RULE_HEX
            {
            mFRAGMENT_RULE_HEX(); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 126, RULE_HEX_StartIndex); }
        }
    }
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "FRAGMENT_RULE_HEX"
    public final void mFRAGMENT_RULE_HEX() throws RecognitionException {
        int FRAGMENT_RULE_HEX_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 127) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:511:28: ( ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )? )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:511:30: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            {
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:511:30: ( '0x' | '0X' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0=='0') ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1=='x') ) {
                    alt38=1;
                }
                else if ( (LA38_1=='X') ) {
                    alt38=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:511:31: '0x'
                    {
                    match("0x"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:511:36: '0X'
                    {
                    match("0X"); if (state.failed) return ;


                    }
                    break;

            }

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:511:42: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>='0' && LA39_0<='9')||(LA39_0>='A' && LA39_0<='F')||LA39_0=='_'||(LA39_0>='a' && LA39_0<='f')) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:511:76: ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0=='#') ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:511:77: '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    {
                    match('#'); if (state.failed) return ;
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:511:81: ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0=='B'||LA40_0=='b') ) {
                        alt40=1;
                    }
                    else if ( (LA40_0=='L'||LA40_0=='l') ) {
                        alt40=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:511:82: ( 'b' | 'B' ) ( 'i' | 'I' )
                            {
                            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                                input.consume();
                            state.failed=false;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                                input.consume();
                            state.failed=false;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;
                        case 2 :
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:511:102: ( 'l' | 'L' )
                            {
                            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                                input.consume();
                            state.failed=false;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }


                    }
                    break;

            }


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 127, FRAGMENT_RULE_HEX_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_RULE_HEX"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        int RULE_INT_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 128) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:513:19: ( FRAGMENT_RULE_INT )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:513:21: FRAGMENT_RULE_INT
            {
            mFRAGMENT_RULE_INT(); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 128, RULE_INT_StartIndex); }
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "FRAGMENT_RULE_INT"
    public final void mFRAGMENT_RULE_INT() throws RecognitionException {
        int FRAGMENT_RULE_INT_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 129) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:514:28: ( '0' .. '9' ( '0' .. '9' | '_' )* )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:514:30: '0' .. '9' ( '0' .. '9' | '_' )*
            {
            matchRange('0','9'); if (state.failed) return ;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:514:39: ( '0' .. '9' | '_' )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>='0' && LA42_0<='9')||LA42_0=='_') ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='_' ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 129, FRAGMENT_RULE_INT_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_RULE_INT"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        int RULE_DECIMAL_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 130) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:516:23: ( FRAGMENT_RULE_DECIMAL )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:516:25: FRAGMENT_RULE_DECIMAL
            {
            mFRAGMENT_RULE_DECIMAL(); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 130, RULE_DECIMAL_StartIndex); }
        }
    }
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "FRAGMENT_RULE_DECIMAL"
    public final void mFRAGMENT_RULE_DECIMAL() throws RecognitionException {
        int FRAGMENT_RULE_DECIMAL_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 131) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:517:32: ( RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )? )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:517:34: RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            {
            mRULE_INT(); if (state.failed) return ;
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:517:43: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0=='E'||LA44_0=='e') ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:517:44: ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();
                    state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:517:54: ( '+' | '-' )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0=='+'||LA43_0=='-') ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();
                            state.failed=false;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_INT(); if (state.failed) return ;

                    }
                    break;

            }

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:517:76: ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            int alt45=3;
            int LA45_0 = input.LA(1);

            if ( (LA45_0=='B'||LA45_0=='b') ) {
                alt45=1;
            }
            else if ( (LA45_0=='D'||LA45_0=='F'||LA45_0=='L'||LA45_0=='d'||LA45_0=='f'||LA45_0=='l') ) {
                alt45=2;
            }
            switch (alt45) {
                case 1 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:517:77: ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' )
                    {
                    if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                        input.consume();
                    state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='I'||input.LA(1)=='d'||input.LA(1)=='i' ) {
                        input.consume();
                    state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:517:105: ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' )
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='L'||input.LA(1)=='d'||input.LA(1)=='f'||input.LA(1)=='l' ) {
                        input.consume();
                    state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 131, FRAGMENT_RULE_DECIMAL_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_RULE_DECIMAL"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        int RULE_STRING_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 132) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:519:22: ( FRAGMENT_RULE_STRING )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:519:24: FRAGMENT_RULE_STRING
            {
            mFRAGMENT_RULE_STRING(); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 132, RULE_STRING_StartIndex); }
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "FRAGMENT_RULE_STRING"
    public final void mFRAGMENT_RULE_STRING() throws RecognitionException {
        int FRAGMENT_RULE_STRING_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 133) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:520:31: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? ) )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:520:33: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? )
            {
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:520:33: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0=='\"') ) {
                alt50=1;
            }
            else if ( (LA50_0=='\'') ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:520:34: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )?
                    {
                    match('\"'); if (state.failed) return ;
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:520:38: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop46:
                    do {
                        int alt46=3;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0=='\\') ) {
                            alt46=1;
                        }
                        else if ( ((LA46_0>='\u0000' && LA46_0<='!')||(LA46_0>='#' && LA46_0<='[')||(LA46_0>=']' && LA46_0<='\uFFFF')) ) {
                            alt46=2;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:520:39: '\\\\' .
                    	    {
                    	    match('\\'); if (state.failed) return ;
                    	    matchAny(); if (state.failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:520:46: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();
                    	    state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:520:62: ( '\"' )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0=='\"') ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:0:0: '\"'
                            {
                            match('\"'); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:520:67: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )?
                    {
                    match('\''); if (state.failed) return ;
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:520:72: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop48:
                    do {
                        int alt48=3;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0=='\\') ) {
                            alt48=1;
                        }
                        else if ( ((LA48_0>='\u0000' && LA48_0<='&')||(LA48_0>='(' && LA48_0<='[')||(LA48_0>=']' && LA48_0<='\uFFFF')) ) {
                            alt48=2;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:520:73: '\\\\' .
                    	    {
                    	    match('\\'); if (state.failed) return ;
                    	    matchAny(); if (state.failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:520:80: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();
                    	    state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);

                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:520:97: ( '\\'' )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0=='\'') ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:0:0: '\\''
                            {
                            match('\''); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 133, FRAGMENT_RULE_STRING_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_RULE_STRING"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        int RULE_SL_COMMENT_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 134) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:522:26: ( FRAGMENT_RULE_SL_COMMENT )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:522:28: FRAGMENT_RULE_SL_COMMENT
            {
            mFRAGMENT_RULE_SL_COMMENT(); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 134, RULE_SL_COMMENT_StartIndex); }
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "FRAGMENT_RULE_SL_COMMENT"
    public final void mFRAGMENT_RULE_SL_COMMENT() throws RecognitionException {
        int FRAGMENT_RULE_SL_COMMENT_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 135) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:523:35: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:523:37: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); if (state.failed) return ;

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:523:42: (~ ( ( '\\n' | '\\r' ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>='\u0000' && LA51_0<='\t')||(LA51_0>='\u000B' && LA51_0<='\f')||(LA51_0>='\u000E' && LA51_0<='\uFFFF')) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:0:0: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:523:58: ( ( '\\r' )? '\\n' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0=='\n'||LA53_0=='\r') ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:523:59: ( '\\r' )? '\\n'
                    {
                    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:523:59: ( '\\r' )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0=='\r') ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:0:0: '\\r'
                            {
                            match('\r'); if (state.failed) return ;

                            }
                            break;

                    }

                    match('\n'); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 135, FRAGMENT_RULE_SL_COMMENT_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        int RULE_WS_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 136) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:525:18: ( FRAGMENT_RULE_WS )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:525:20: FRAGMENT_RULE_WS
            {
            mFRAGMENT_RULE_WS(); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 136, RULE_WS_StartIndex); }
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "FRAGMENT_RULE_WS"
    public final void mFRAGMENT_RULE_WS() throws RecognitionException {
        int FRAGMENT_RULE_WS_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 137) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:526:27: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:526:29: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:526:29: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt54=0;
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>='\t' && LA54_0<='\n')||LA54_0=='\r'||LA54_0==' ') ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt54 >= 1 ) break loop54;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(54, input);
                        throw eee;
                }
                cnt54++;
            } while (true);


            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 137, FRAGMENT_RULE_WS_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        int RULE_ANY_OTHER_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 138) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:528:25: ( FRAGMENT_RULE_ANY_OTHER )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:528:27: FRAGMENT_RULE_ANY_OTHER
            {
            mFRAGMENT_RULE_ANY_OTHER(); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 138, RULE_ANY_OTHER_StartIndex); }
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    // $ANTLR start "FRAGMENT_RULE_ANY_OTHER"
    public final void mFRAGMENT_RULE_ANY_OTHER() throws RecognitionException {
        int FRAGMENT_RULE_ANY_OTHER_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 139) ) { return ; }
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:529:34: ( . )
            // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:529:36: .
            {
            matchAny(); if (state.failed) return ;

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 139, FRAGMENT_RULE_ANY_OTHER_StartIndex); }
        }
    }
    // $ANTLR end "FRAGMENT_RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:1:8: ( SYNTHETIC_ALL_KEYWORDS )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:1:10: SYNTHETIC_ALL_KEYWORDS
        {
        mSYNTHETIC_ALL_KEYWORDS(); if (state.failed) return ;

        }


    }

    // $ANTLR start synpred1_InternalSpecLexer
    public final void synpred1_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:149:2: ( FRAGMENT_ExclamationMark )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:149:3: FRAGMENT_ExclamationMark
        {
        mFRAGMENT_ExclamationMark(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalSpecLexer

    // $ANTLR start synpred2_InternalSpecLexer
    public final void synpred2_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:150:2: ( FRAGMENT_NumberSign )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:150:3: FRAGMENT_NumberSign
        {
        mFRAGMENT_NumberSign(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalSpecLexer

    // $ANTLR start synpred3_InternalSpecLexer
    public final void synpred3_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:151:2: ( FRAGMENT_PercentSign )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:151:3: FRAGMENT_PercentSign
        {
        mFRAGMENT_PercentSign(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalSpecLexer

    // $ANTLR start synpred4_InternalSpecLexer
    public final void synpred4_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:152:2: ( FRAGMENT_Ampersand )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:152:3: FRAGMENT_Ampersand
        {
        mFRAGMENT_Ampersand(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalSpecLexer

    // $ANTLR start synpred5_InternalSpecLexer
    public final void synpred5_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:153:2: ( FRAGMENT_LeftParenthesis )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:153:3: FRAGMENT_LeftParenthesis
        {
        mFRAGMENT_LeftParenthesis(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalSpecLexer

    // $ANTLR start synpred6_InternalSpecLexer
    public final void synpred6_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:154:2: ( FRAGMENT_RightParenthesis )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:154:3: FRAGMENT_RightParenthesis
        {
        mFRAGMENT_RightParenthesis(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalSpecLexer

    // $ANTLR start synpred7_InternalSpecLexer
    public final void synpred7_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:155:2: ( FRAGMENT_Asterisk )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:155:3: FRAGMENT_Asterisk
        {
        mFRAGMENT_Asterisk(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_InternalSpecLexer

    // $ANTLR start synpred8_InternalSpecLexer
    public final void synpred8_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:156:2: ( FRAGMENT_PlusSign )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:156:3: FRAGMENT_PlusSign
        {
        mFRAGMENT_PlusSign(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_InternalSpecLexer

    // $ANTLR start synpred9_InternalSpecLexer
    public final void synpred9_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:157:2: ( FRAGMENT_Comma )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:157:3: FRAGMENT_Comma
        {
        mFRAGMENT_Comma(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_InternalSpecLexer

    // $ANTLR start synpred10_InternalSpecLexer
    public final void synpred10_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:158:2: ( FRAGMENT_HyphenMinus )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:158:3: FRAGMENT_HyphenMinus
        {
        mFRAGMENT_HyphenMinus(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_InternalSpecLexer

    // $ANTLR start synpred11_InternalSpecLexer
    public final void synpred11_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:159:2: ( FRAGMENT_FullStop )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:159:3: FRAGMENT_FullStop
        {
        mFRAGMENT_FullStop(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_InternalSpecLexer

    // $ANTLR start synpred12_InternalSpecLexer
    public final void synpred12_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:160:2: ( FRAGMENT_Solidus )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:160:3: FRAGMENT_Solidus
        {
        mFRAGMENT_Solidus(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_InternalSpecLexer

    // $ANTLR start synpred13_InternalSpecLexer
    public final void synpred13_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:161:2: ( FRAGMENT_Colon )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:161:3: FRAGMENT_Colon
        {
        mFRAGMENT_Colon(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_InternalSpecLexer

    // $ANTLR start synpred14_InternalSpecLexer
    public final void synpred14_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:162:2: ( FRAGMENT_Semicolon )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:162:3: FRAGMENT_Semicolon
        {
        mFRAGMENT_Semicolon(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalSpecLexer

    // $ANTLR start synpred15_InternalSpecLexer
    public final void synpred15_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:163:2: ( FRAGMENT_LessThanSign )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:163:3: FRAGMENT_LessThanSign
        {
        mFRAGMENT_LessThanSign(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_InternalSpecLexer

    // $ANTLR start synpred16_InternalSpecLexer
    public final void synpred16_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:164:2: ( FRAGMENT_EqualsSign )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:164:3: FRAGMENT_EqualsSign
        {
        mFRAGMENT_EqualsSign(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalSpecLexer

    // $ANTLR start synpred17_InternalSpecLexer
    public final void synpred17_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:165:2: ( FRAGMENT_GreaterThanSign )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:165:3: FRAGMENT_GreaterThanSign
        {
        mFRAGMENT_GreaterThanSign(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_InternalSpecLexer

    // $ANTLR start synpred18_InternalSpecLexer
    public final void synpred18_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:166:2: ( FRAGMENT_QuestionMark )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:166:3: FRAGMENT_QuestionMark
        {
        mFRAGMENT_QuestionMark(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalSpecLexer

    // $ANTLR start synpred19_InternalSpecLexer
    public final void synpred19_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:167:2: ( FRAGMENT_CommercialAt )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:167:3: FRAGMENT_CommercialAt
        {
        mFRAGMENT_CommercialAt(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_InternalSpecLexer

    // $ANTLR start synpred20_InternalSpecLexer
    public final void synpred20_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:168:2: ( FRAGMENT_LeftSquareBracket )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:168:3: FRAGMENT_LeftSquareBracket
        {
        mFRAGMENT_LeftSquareBracket(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_InternalSpecLexer

    // $ANTLR start synpred21_InternalSpecLexer
    public final void synpred21_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:169:2: ( FRAGMENT_RightSquareBracket )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:169:3: FRAGMENT_RightSquareBracket
        {
        mFRAGMENT_RightSquareBracket(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_InternalSpecLexer

    // $ANTLR start synpred22_InternalSpecLexer
    public final void synpred22_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:170:2: ( FRAGMENT_LeftCurlyBracket )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:170:3: FRAGMENT_LeftCurlyBracket
        {
        mFRAGMENT_LeftCurlyBracket(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalSpecLexer

    // $ANTLR start synpred23_InternalSpecLexer
    public final void synpred23_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:171:2: ( FRAGMENT_VerticalLine )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:171:3: FRAGMENT_VerticalLine
        {
        mFRAGMENT_VerticalLine(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_InternalSpecLexer

    // $ANTLR start synpred24_InternalSpecLexer
    public final void synpred24_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:172:2: ( FRAGMENT_RightCurlyBracket )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:172:3: FRAGMENT_RightCurlyBracket
        {
        mFRAGMENT_RightCurlyBracket(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_InternalSpecLexer

    // $ANTLR start synpred25_InternalSpecLexer
    public final void synpred25_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:173:2: ( FRAGMENT_ExclamationMarkEqualsSign )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:173:3: FRAGMENT_ExclamationMarkEqualsSign
        {
        mFRAGMENT_ExclamationMarkEqualsSign(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalSpecLexer

    // $ANTLR start synpred26_InternalSpecLexer
    public final void synpred26_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:174:2: ( FRAGMENT_PercentSignEqualsSign )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:174:3: FRAGMENT_PercentSignEqualsSign
        {
        mFRAGMENT_PercentSignEqualsSign(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_InternalSpecLexer

    // $ANTLR start synpred27_InternalSpecLexer
    public final void synpred27_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:175:2: ( FRAGMENT_AmpersandAmpersand )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:175:3: FRAGMENT_AmpersandAmpersand
        {
        mFRAGMENT_AmpersandAmpersand(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_InternalSpecLexer

    // $ANTLR start synpred28_InternalSpecLexer
    public final void synpred28_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:176:2: ( FRAGMENT_AsteriskAsterisk )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:176:3: FRAGMENT_AsteriskAsterisk
        {
        mFRAGMENT_AsteriskAsterisk(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_InternalSpecLexer

    // $ANTLR start synpred29_InternalSpecLexer
    public final void synpred29_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:177:2: ( FRAGMENT_AsteriskEqualsSign )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:177:3: FRAGMENT_AsteriskEqualsSign
        {
        mFRAGMENT_AsteriskEqualsSign(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalSpecLexer

    // $ANTLR start synpred30_InternalSpecLexer
    public final void synpred30_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:178:2: ( FRAGMENT_PlusSignPlusSign )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:178:3: FRAGMENT_PlusSignPlusSign
        {
        mFRAGMENT_PlusSignPlusSign(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalSpecLexer

    // $ANTLR start synpred31_InternalSpecLexer
    public final void synpred31_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:179:2: ( FRAGMENT_PlusSignEqualsSign )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:179:3: FRAGMENT_PlusSignEqualsSign
        {
        mFRAGMENT_PlusSignEqualsSign(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_InternalSpecLexer

    // $ANTLR start synpred32_InternalSpecLexer
    public final void synpred32_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:180:2: ( FRAGMENT_HyphenMinusHyphenMinus )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:180:3: FRAGMENT_HyphenMinusHyphenMinus
        {
        mFRAGMENT_HyphenMinusHyphenMinus(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_InternalSpecLexer

    // $ANTLR start synpred33_InternalSpecLexer
    public final void synpred33_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:181:2: ( FRAGMENT_HyphenMinusEqualsSign )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:181:3: FRAGMENT_HyphenMinusEqualsSign
        {
        mFRAGMENT_HyphenMinusEqualsSign(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_InternalSpecLexer

    // $ANTLR start synpred34_InternalSpecLexer
    public final void synpred34_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:182:2: ( FRAGMENT_HyphenMinusGreaterThanSign )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:182:3: FRAGMENT_HyphenMinusGreaterThanSign
        {
        mFRAGMENT_HyphenMinusGreaterThanSign(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_InternalSpecLexer

    // $ANTLR start synpred35_InternalSpecLexer
    public final void synpred35_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:183:2: ( FRAGMENT_FullStopFullStop )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:183:3: FRAGMENT_FullStopFullStop
        {
        mFRAGMENT_FullStopFullStop(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalSpecLexer

    // $ANTLR start synpred36_InternalSpecLexer
    public final void synpred36_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:184:2: ( FRAGMENT_SolidusEqualsSign )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:184:3: FRAGMENT_SolidusEqualsSign
        {
        mFRAGMENT_SolidusEqualsSign(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_InternalSpecLexer

    // $ANTLR start synpred37_InternalSpecLexer
    public final void synpred37_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:185:2: ( FRAGMENT_ColonColon )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:185:3: FRAGMENT_ColonColon
        {
        mFRAGMENT_ColonColon(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalSpecLexer

    // $ANTLR start synpred38_InternalSpecLexer
    public final void synpred38_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:186:2: ( FRAGMENT_LessThanSignGreaterThanSign )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:186:3: FRAGMENT_LessThanSignGreaterThanSign
        {
        mFRAGMENT_LessThanSignGreaterThanSign(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_InternalSpecLexer

    // $ANTLR start synpred39_InternalSpecLexer
    public final void synpred39_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:187:2: ( FRAGMENT_EqualsSignEqualsSign )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:187:3: FRAGMENT_EqualsSignEqualsSign
        {
        mFRAGMENT_EqualsSignEqualsSign(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_InternalSpecLexer

    // $ANTLR start synpred40_InternalSpecLexer
    public final void synpred40_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:188:2: ( FRAGMENT_EqualsSignGreaterThanSign )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:188:3: FRAGMENT_EqualsSignGreaterThanSign
        {
        mFRAGMENT_EqualsSignGreaterThanSign(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_InternalSpecLexer

    // $ANTLR start synpred41_InternalSpecLexer
    public final void synpred41_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:189:2: ( FRAGMENT_GreaterThanSignEqualsSign )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:189:3: FRAGMENT_GreaterThanSignEqualsSign
        {
        mFRAGMENT_GreaterThanSignEqualsSign(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_InternalSpecLexer

    // $ANTLR start synpred42_InternalSpecLexer
    public final void synpred42_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:190:2: ( FRAGMENT_QuestionMarkFullStop )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:190:3: FRAGMENT_QuestionMarkFullStop
        {
        mFRAGMENT_QuestionMarkFullStop(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_InternalSpecLexer

    // $ANTLR start synpred43_InternalSpecLexer
    public final void synpred43_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:191:2: ( FRAGMENT_QuestionMarkColon )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:191:3: FRAGMENT_QuestionMarkColon
        {
        mFRAGMENT_QuestionMarkColon(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_InternalSpecLexer

    // $ANTLR start synpred44_InternalSpecLexer
    public final void synpred44_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:192:2: ( FRAGMENT_As )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:192:3: FRAGMENT_As
        {
        mFRAGMENT_As(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_InternalSpecLexer

    // $ANTLR start synpred45_InternalSpecLexer
    public final void synpred45_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:193:2: ( FRAGMENT_Do )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:193:3: FRAGMENT_Do
        {
        mFRAGMENT_Do(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred45_InternalSpecLexer

    // $ANTLR start synpred46_InternalSpecLexer
    public final void synpred46_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:194:2: ( FRAGMENT_If )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:194:3: FRAGMENT_If
        {
        mFRAGMENT_If(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_InternalSpecLexer

    // $ANTLR start synpred47_InternalSpecLexer
    public final void synpred47_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:195:2: ( FRAGMENT_VerticalLineVerticalLine )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:195:3: FRAGMENT_VerticalLineVerticalLine
        {
        mFRAGMENT_VerticalLineVerticalLine(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_InternalSpecLexer

    // $ANTLR start synpred48_InternalSpecLexer
    public final void synpred48_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:196:2: ( FRAGMENT_ExclamationMarkEqualsSignEqualsSign )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:196:3: FRAGMENT_ExclamationMarkEqualsSignEqualsSign
        {
        mFRAGMENT_ExclamationMarkEqualsSignEqualsSign(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_InternalSpecLexer

    // $ANTLR start synpred49_InternalSpecLexer
    public final void synpred49_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:197:2: ( FRAGMENT_FullStopFullStopFullStop )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:197:3: FRAGMENT_FullStopFullStopFullStop
        {
        mFRAGMENT_FullStopFullStopFullStop(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_InternalSpecLexer

    // $ANTLR start synpred50_InternalSpecLexer
    public final void synpred50_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:198:2: ( FRAGMENT_FullStopFullStopLessThanSign )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:198:3: FRAGMENT_FullStopFullStopLessThanSign
        {
        mFRAGMENT_FullStopFullStopLessThanSign(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_InternalSpecLexer

    // $ANTLR start synpred51_InternalSpecLexer
    public final void synpred51_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:199:2: ( FRAGMENT_EqualsSignEqualsSignEqualsSign )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:199:3: FRAGMENT_EqualsSignEqualsSignEqualsSign
        {
        mFRAGMENT_EqualsSignEqualsSignEqualsSign(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_InternalSpecLexer

    // $ANTLR start synpred52_InternalSpecLexer
    public final void synpred52_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:200:2: ( FRAGMENT_All )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:200:3: FRAGMENT_All
        {
        mFRAGMENT_All(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_InternalSpecLexer

    // $ANTLR start synpred53_InternalSpecLexer
    public final void synpred53_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:201:2: ( FRAGMENT_Def )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:201:3: FRAGMENT_Def
        {
        mFRAGMENT_Def(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred53_InternalSpecLexer

    // $ANTLR start synpred54_InternalSpecLexer
    public final void synpred54_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:202:2: ( FRAGMENT_For )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:202:3: FRAGMENT_For
        {
        mFRAGMENT_For(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred54_InternalSpecLexer

    // $ANTLR start synpred55_InternalSpecLexer
    public final void synpred55_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:203:2: ( FRAGMENT_New )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:203:3: FRAGMENT_New
        {
        mFRAGMENT_New(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_InternalSpecLexer

    // $ANTLR start synpred56_InternalSpecLexer
    public final void synpred56_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:204:2: ( FRAGMENT_Not )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:204:3: FRAGMENT_Not
        {
        mFRAGMENT_Not(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_InternalSpecLexer

    // $ANTLR start synpred57_InternalSpecLexer
    public final void synpred57_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:205:2: ( FRAGMENT_Try )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:205:3: FRAGMENT_Try
        {
        mFRAGMENT_Try(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_InternalSpecLexer

    // $ANTLR start synpred58_InternalSpecLexer
    public final void synpred58_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:206:2: ( FRAGMENT_Val )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:206:3: FRAGMENT_Val
        {
        mFRAGMENT_Val(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_InternalSpecLexer

    // $ANTLR start synpred59_InternalSpecLexer
    public final void synpred59_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:207:2: ( FRAGMENT_Var )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:207:3: FRAGMENT_Var
        {
        mFRAGMENT_Var(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_InternalSpecLexer

    // $ANTLR start synpred60_InternalSpecLexer
    public final void synpred60_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:208:2: ( FRAGMENT_Case )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:208:3: FRAGMENT_Case
        {
        mFRAGMENT_Case(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred60_InternalSpecLexer

    // $ANTLR start synpred61_InternalSpecLexer
    public final void synpred61_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:209:2: ( FRAGMENT_Each )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:209:3: FRAGMENT_Each
        {
        mFRAGMENT_Each(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred61_InternalSpecLexer

    // $ANTLR start synpred62_InternalSpecLexer
    public final void synpred62_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:210:2: ( FRAGMENT_Else )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:210:3: FRAGMENT_Else
        {
        mFRAGMENT_Else(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_InternalSpecLexer

    // $ANTLR start synpred63_InternalSpecLexer
    public final void synpred63_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:211:2: ( FRAGMENT_Fact )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:211:3: FRAGMENT_Fact
        {
        mFRAGMENT_Fact(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_InternalSpecLexer

    // $ANTLR start synpred64_InternalSpecLexer
    public final void synpred64_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:212:2: ( FRAGMENT_Null )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:212:3: FRAGMENT_Null
        {
        mFRAGMENT_Null(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred64_InternalSpecLexer

    // $ANTLR start synpred65_InternalSpecLexer
    public final void synpred65_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:213:2: ( FRAGMENT_True )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:213:3: FRAGMENT_True
        {
        mFRAGMENT_True(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred65_InternalSpecLexer

    // $ANTLR start synpred66_InternalSpecLexer
    public final void synpred66_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:214:2: ( FRAGMENT_After )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:214:3: FRAGMENT_After
        {
        mFRAGMENT_After(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred66_InternalSpecLexer

    // $ANTLR start synpred67_InternalSpecLexer
    public final void synpred67_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:215:2: ( FRAGMENT_Catch )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:215:3: FRAGMENT_Catch
        {
        mFRAGMENT_Catch(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred67_InternalSpecLexer

    // $ANTLR start synpred68_InternalSpecLexer
    public final void synpred68_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:216:2: ( FRAGMENT_Facts )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:216:3: FRAGMENT_Facts
        {
        mFRAGMENT_Facts(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred68_InternalSpecLexer

    // $ANTLR start synpred69_InternalSpecLexer
    public final void synpred69_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:217:2: ( FRAGMENT_False )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:217:3: FRAGMENT_False
        {
        mFRAGMENT_False(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_InternalSpecLexer

    // $ANTLR start synpred70_InternalSpecLexer
    public final void synpred70_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:218:2: ( FRAGMENT_Final )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:218:3: FRAGMENT_Final
        {
        mFRAGMENT_Final(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred70_InternalSpecLexer

    // $ANTLR start synpred71_InternalSpecLexer
    public final void synpred71_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:219:2: ( FRAGMENT_Super )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:219:3: FRAGMENT_Super
        {
        mFRAGMENT_Super(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred71_InternalSpecLexer

    // $ANTLR start synpred72_InternalSpecLexer
    public final void synpred72_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:220:2: ( FRAGMENT_Throw )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:220:3: FRAGMENT_Throw
        {
        mFRAGMENT_Throw(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred72_InternalSpecLexer

    // $ANTLR start synpred73_InternalSpecLexer
    public final void synpred73_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:221:2: ( FRAGMENT_While )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:221:3: FRAGMENT_While
        {
        mFRAGMENT_While(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred73_InternalSpecLexer

    // $ANTLR start synpred74_InternalSpecLexer
    public final void synpred74_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:222:2: ( FRAGMENT_Assert )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:222:3: FRAGMENT_Assert
        {
        mFRAGMENT_Assert(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred74_InternalSpecLexer

    // $ANTLR start synpred75_InternalSpecLexer
    public final void synpred75_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:223:2: ( FRAGMENT_Before )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:223:3: FRAGMENT_Before
        {
        mFRAGMENT_Before(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred75_InternalSpecLexer

    // $ANTLR start synpred76_InternalSpecLexer
    public final void synpred76_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:224:2: ( FRAGMENT_Import )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:224:3: FRAGMENT_Import
        {
        mFRAGMENT_Import(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred76_InternalSpecLexer

    // $ANTLR start synpred77_InternalSpecLexer
    public final void synpred77_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:225:2: ( FRAGMENT_Native )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:225:3: FRAGMENT_Native
        {
        mFRAGMENT_Native(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred77_InternalSpecLexer

    // $ANTLR start synpred78_InternalSpecLexer
    public final void synpred78_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:226:2: ( FRAGMENT_Public )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:226:3: FRAGMENT_Public
        {
        mFRAGMENT_Public(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred78_InternalSpecLexer

    // $ANTLR start synpred79_InternalSpecLexer
    public final void synpred79_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:227:2: ( FRAGMENT_Return )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:227:3: FRAGMENT_Return
        {
        mFRAGMENT_Return(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred79_InternalSpecLexer

    // $ANTLR start synpred80_InternalSpecLexer
    public final void synpred80_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:228:2: ( FRAGMENT_Should )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:228:3: FRAGMENT_Should
        {
        mFRAGMENT_Should(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred80_InternalSpecLexer

    // $ANTLR start synpred81_InternalSpecLexer
    public final void synpred81_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:229:2: ( FRAGMENT_Static )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:229:3: FRAGMENT_Static
        {
        mFRAGMENT_Static(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred81_InternalSpecLexer

    // $ANTLR start synpred82_InternalSpecLexer
    public final void synpred82_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:230:2: ( FRAGMENT_Switch )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:230:3: FRAGMENT_Switch
        {
        mFRAGMENT_Switch(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred82_InternalSpecLexer

    // $ANTLR start synpred83_InternalSpecLexer
    public final void synpred83_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:231:2: ( FRAGMENT_Throws )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:231:3: FRAGMENT_Throws
        {
        mFRAGMENT_Throws(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred83_InternalSpecLexer

    // $ANTLR start synpred84_InternalSpecLexer
    public final void synpred84_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:232:2: ( FRAGMENT_Typeof )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:232:3: FRAGMENT_Typeof
        {
        mFRAGMENT_Typeof(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred84_InternalSpecLexer

    // $ANTLR start synpred85_InternalSpecLexer
    public final void synpred85_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:233:2: ( FRAGMENT_Context )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:233:3: FRAGMENT_Context
        {
        mFRAGMENT_Context(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred85_InternalSpecLexer

    // $ANTLR start synpred86_InternalSpecLexer
    public final void synpred86_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:234:2: ( FRAGMENT_Default )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:234:3: FRAGMENT_Default
        {
        mFRAGMENT_Default(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred86_InternalSpecLexer

    // $ANTLR start synpred87_InternalSpecLexer
    public final void synpred87_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:235:2: ( FRAGMENT_Extends )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:235:3: FRAGMENT_Extends
        {
        mFRAGMENT_Extends(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred87_InternalSpecLexer

    // $ANTLR start synpred88_InternalSpecLexer
    public final void synpred88_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:236:2: ( FRAGMENT_Finally )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:236:3: FRAGMENT_Finally
        {
        mFRAGMENT_Finally(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred88_InternalSpecLexer

    // $ANTLR start synpred89_InternalSpecLexer
    public final void synpred89_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:237:2: ( FRAGMENT_Package )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:237:3: FRAGMENT_Package
        {
        mFRAGMENT_Package(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred89_InternalSpecLexer

    // $ANTLR start synpred90_InternalSpecLexer
    public final void synpred90_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:238:2: ( FRAGMENT_Pending )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:238:3: FRAGMENT_Pending
        {
        mFRAGMENT_Pending(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred90_InternalSpecLexer

    // $ANTLR start synpred91_InternalSpecLexer
    public final void synpred91_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:239:2: ( FRAGMENT_Private )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:239:3: FRAGMENT_Private
        {
        mFRAGMENT_Private(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred91_InternalSpecLexer

    // $ANTLR start synpred92_InternalSpecLexer
    public final void synpred92_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:240:2: ( FRAGMENT_Abstract )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:240:3: FRAGMENT_Abstract
        {
        mFRAGMENT_Abstract(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred92_InternalSpecLexer

    // $ANTLR start synpred93_InternalSpecLexer
    public final void synpred93_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:241:2: ( FRAGMENT_Describe )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:241:3: FRAGMENT_Describe
        {
        mFRAGMENT_Describe(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred93_InternalSpecLexer

    // $ANTLR start synpred94_InternalSpecLexer
    public final void synpred94_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:242:2: ( FRAGMENT_Dispatch )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:242:3: FRAGMENT_Dispatch
        {
        mFRAGMENT_Dispatch(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred94_InternalSpecLexer

    // $ANTLR start synpred95_InternalSpecLexer
    public final void synpred95_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:243:2: ( FRAGMENT_Override )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:243:3: FRAGMENT_Override
        {
        mFRAGMENT_Override(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred95_InternalSpecLexer

    // $ANTLR start synpred96_InternalSpecLexer
    public final void synpred96_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:244:2: ( FRAGMENT_Strictfp )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:244:3: FRAGMENT_Strictfp
        {
        mFRAGMENT_Strictfp(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred96_InternalSpecLexer

    // $ANTLR start synpred97_InternalSpecLexer
    public final void synpred97_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:245:2: ( FRAGMENT_Volatile )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:245:3: FRAGMENT_Volatile
        {
        mFRAGMENT_Volatile(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred97_InternalSpecLexer

    // $ANTLR start synpred98_InternalSpecLexer
    public final void synpred98_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:246:2: ( FRAGMENT_Extension )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:246:3: FRAGMENT_Extension
        {
        mFRAGMENT_Extension(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred98_InternalSpecLexer

    // $ANTLR start synpred99_InternalSpecLexer
    public final void synpred99_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:247:2: ( FRAGMENT_Protected )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:247:3: FRAGMENT_Protected
        {
        mFRAGMENT_Protected(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred99_InternalSpecLexer

    // $ANTLR start synpred100_InternalSpecLexer
    public final void synpred100_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:248:2: ( FRAGMENT_Transient )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:248:3: FRAGMENT_Transient
        {
        mFRAGMENT_Transient(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred100_InternalSpecLexer

    // $ANTLR start synpred101_InternalSpecLexer
    public final void synpred101_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:249:2: ( FRAGMENT_Instanceof )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:249:3: FRAGMENT_Instanceof
        {
        mFRAGMENT_Instanceof(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred101_InternalSpecLexer

    // $ANTLR start synpred102_InternalSpecLexer
    public final void synpred102_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:250:2: ( FRAGMENT_Synchronized )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:250:3: FRAGMENT_Synchronized
        {
        mFRAGMENT_Synchronized(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred102_InternalSpecLexer

    // $ANTLR start synpred103_InternalSpecLexer
    public final void synpred103_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:251:2: ( FRAGMENT_RULE_ML_COMMENT )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:251:3: FRAGMENT_RULE_ML_COMMENT
        {
        mFRAGMENT_RULE_ML_COMMENT(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred103_InternalSpecLexer

    // $ANTLR start synpred104_InternalSpecLexer
    public final void synpred104_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:252:2: ( FRAGMENT_RULE_ID )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:252:3: FRAGMENT_RULE_ID
        {
        mFRAGMENT_RULE_ID(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred104_InternalSpecLexer

    // $ANTLR start synpred105_InternalSpecLexer
    public final void synpred105_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:253:2: ( FRAGMENT_RULE_RICH_TEXT )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:253:3: FRAGMENT_RULE_RICH_TEXT
        {
        mFRAGMENT_RULE_RICH_TEXT(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred105_InternalSpecLexer

    // $ANTLR start synpred106_InternalSpecLexer
    public final void synpred106_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:254:2: ( FRAGMENT_RULE_RICH_TEXT_START )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:254:3: FRAGMENT_RULE_RICH_TEXT_START
        {
        mFRAGMENT_RULE_RICH_TEXT_START(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred106_InternalSpecLexer

    // $ANTLR start synpred107_InternalSpecLexer
    public final void synpred107_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:255:2: ( FRAGMENT_RULE_RICH_TEXT_END )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:255:3: FRAGMENT_RULE_RICH_TEXT_END
        {
        mFRAGMENT_RULE_RICH_TEXT_END(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred107_InternalSpecLexer

    // $ANTLR start synpred108_InternalSpecLexer
    public final void synpred108_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:256:2: ( FRAGMENT_RULE_RICH_TEXT_INBETWEEN )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:256:3: FRAGMENT_RULE_RICH_TEXT_INBETWEEN
        {
        mFRAGMENT_RULE_RICH_TEXT_INBETWEEN(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred108_InternalSpecLexer

    // $ANTLR start synpred109_InternalSpecLexer
    public final void synpred109_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:257:2: ( FRAGMENT_RULE_COMMENT_RICH_TEXT_INBETWEEN )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:257:3: FRAGMENT_RULE_COMMENT_RICH_TEXT_INBETWEEN
        {
        mFRAGMENT_RULE_COMMENT_RICH_TEXT_INBETWEEN(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred109_InternalSpecLexer

    // $ANTLR start synpred110_InternalSpecLexer
    public final void synpred110_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:258:2: ( FRAGMENT_RULE_COMMENT_RICH_TEXT_END )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:258:3: FRAGMENT_RULE_COMMENT_RICH_TEXT_END
        {
        mFRAGMENT_RULE_COMMENT_RICH_TEXT_END(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred110_InternalSpecLexer

    // $ANTLR start synpred111_InternalSpecLexer
    public final void synpred111_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:259:2: ( FRAGMENT_RULE_HEX )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:259:3: FRAGMENT_RULE_HEX
        {
        mFRAGMENT_RULE_HEX(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred111_InternalSpecLexer

    // $ANTLR start synpred112_InternalSpecLexer
    public final void synpred112_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:260:2: ( FRAGMENT_RULE_INT )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:260:3: FRAGMENT_RULE_INT
        {
        mFRAGMENT_RULE_INT(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred112_InternalSpecLexer

    // $ANTLR start synpred113_InternalSpecLexer
    public final void synpred113_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:261:2: ( FRAGMENT_RULE_DECIMAL )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:261:3: FRAGMENT_RULE_DECIMAL
        {
        mFRAGMENT_RULE_DECIMAL(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred113_InternalSpecLexer

    // $ANTLR start synpred114_InternalSpecLexer
    public final void synpred114_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:262:2: ( FRAGMENT_RULE_STRING )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:262:3: FRAGMENT_RULE_STRING
        {
        mFRAGMENT_RULE_STRING(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred114_InternalSpecLexer

    // $ANTLR start synpred115_InternalSpecLexer
    public final void synpred115_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:263:2: ( FRAGMENT_RULE_SL_COMMENT )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:263:3: FRAGMENT_RULE_SL_COMMENT
        {
        mFRAGMENT_RULE_SL_COMMENT(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred115_InternalSpecLexer

    // $ANTLR start synpred116_InternalSpecLexer
    public final void synpred116_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:264:2: ( FRAGMENT_RULE_WS )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:264:3: FRAGMENT_RULE_WS
        {
        mFRAGMENT_RULE_WS(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred116_InternalSpecLexer

    // $ANTLR start synpred117_InternalSpecLexer
    public final void synpred117_InternalSpecLexer_fragment() throws RecognitionException {   
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:265:2: ( FRAGMENT_RULE_ANY_OTHER )
        // ../org.jnario.spec.ui/src-gen/org/jnario/spec/ui/contentassist/antlr/lexer/InternalSpecLexer.g:265:3: FRAGMENT_RULE_ANY_OTHER
        {
        mFRAGMENT_RULE_ANY_OTHER(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred117_InternalSpecLexer

    public final boolean synpred83_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred83_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred96_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred96_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred106_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred106_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred68_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred68_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred56_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred43_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred70_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred70_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred105_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred105_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred97_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred97_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred71_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred71_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred84_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred84_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred67_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred67_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred107_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred107_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred117_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred117_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred98_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred98_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred72_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred72_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred69_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred69_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred79_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred79_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred82_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred82_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred110_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred110_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred42_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred116_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred116_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred93_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred93_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred53_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred53_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred80_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred80_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred73_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred73_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred60_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred60_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred57_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred87_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred87_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred112_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred112_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred102_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred102_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred104_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred104_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred95_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred95_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred114_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred114_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred75_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred75_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred85_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred85_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred55_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred65_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred65_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred45_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred109_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred109_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred48_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred48_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred89_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred89_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred90_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred90_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred76_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred76_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred50_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred63_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred63_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred91_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred91_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred101_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred101_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred47_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred64_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred64_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred77_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred77_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred51_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred92_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred92_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred59_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred59_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred62_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred62_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred88_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred88_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred78_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred78_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred100_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred100_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred103_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred103_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred86_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred86_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred99_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred99_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred58_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred58_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred66_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred66_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred108_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred108_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred81_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred81_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred111_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred111_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred61_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred74_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred74_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred115_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred115_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred94_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred94_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred44_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred54_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred46_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred113_InternalSpecLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred113_InternalSpecLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\50\uffff\1\u008b\1\uffff\1\u008b\2\uffff\1\u008b\5\uffff\1\u009a"+
        "\23\uffff\1\u009d\12\uffff\1\u009f\16\uffff\1\u00a1\100\uffff\1"+
        "\u00b8\21\uffff\1\u00c0\4\uffff\1\u00c2\3\uffff\2\u00c0\4\uffff"+
        "\1\u00c9\1\u00cb\1\uffff\2\u00c0\6\uffff\1\u00c0\1\uffff";
    static final String DFA1_eofS =
        "\u00d0\uffff";
    static final String DFA1_minS =
        "\1\0\1\75\1\0\1\75\1\46\2\0\1\52\1\53\1\0\1\55\1\56\1\52\1\72\1"+
        "\0\1\76\2\75\1\56\4\0\1\174\1\0\1\142\1\145\1\146\2\141\1\150\3"+
        "\141\2\150\1\145\1\141\1\145\1\166\1\44\1\0\1\165\1\47\1\0\1\u00ab"+
        "\1\130\3\0\1\uffff\1\75\23\uffff\1\56\12\uffff\1\75\16\uffff\1\163"+
        "\5\uffff\1\146\5\uffff\1\143\1\156\4\uffff\1\141\1\162\1\uffff\1"+
        "\154\1\uffff\1\163\3\uffff\1\164\2\uffff\1\141\7\uffff\1\151\5\uffff"+
        "\1\47\5\uffff\1\0\16\uffff\1\141\1\uffff\1\164\1\uffff\1\141\3\uffff"+
        "\1\157\4\uffff\1\145\4\uffff\1\0\4\uffff\1\163\1\154\1\167\1\156"+
        "\2\0\4\uffff\1\154\1\163\1\144\2\0\6\uffff\1\0\1\uffff";
    static final String DFA1_maxS =
        "\1\uffff\1\75\1\0\1\75\1\46\2\0\2\75\1\0\1\76\1\56\1\75\1\72\1"+
        "\0\2\76\1\75\1\72\4\0\1\174\1\0\1\163\1\157\1\156\1\157\1\165\1"+
        "\171\2\157\1\170\1\171\1\150\1\145\1\165\1\145\1\166\1\uffe6\1\0"+
        "\1\165\1\47\1\uffff\1\u00ab\1\170\3\0\1\uffff\1\75\23\uffff\1\74"+
        "\12\uffff\1\75\16\uffff\1\163\5\uffff\1\163\5\uffff\1\154\1\156"+
        "\4\uffff\1\171\1\162\1\uffff\1\162\1\uffff\1\164\3\uffff\1\164\2"+
        "\uffff\1\162\7\uffff\1\157\5\uffff\1\47\5\uffff\1\0\16\uffff\1\141"+
        "\1\uffff\1\164\1\uffff\1\141\3\uffff\1\157\4\uffff\1\145\4\uffff"+
        "\1\uffff\4\uffff\1\163\1\154\1\167\1\156\2\uffff\4\uffff\1\154\2"+
        "\163\2\uffff\6\uffff\1\uffff\1\uffff";
    static final String DFA1_acceptS =
        "\62\uffff\1\165\1\uffff\1\1\1\2\1\32\1\3\1\33\1\4\1\5\1\6\1\34"+
        "\1\35\1\7\1\36\1\37\1\10\1\11\1\40\1\41\1\42\1\12\1\uffff\1\13\1"+
        "\44\1\147\1\163\1\14\1\45\1\15\1\16\1\46\1\17\1\uffff\1\50\1\20"+
        "\1\51\1\21\1\52\1\53\1\22\1\23\1\24\1\25\1\26\1\57\1\27\1\30\1\uffff"+
        "\1\64\1\102\1\134\1\150\1\55\1\uffff\1\136\1\56\1\114\1\145\1\66"+
        "\2\uffff\1\67\1\70\1\100\1\115\2\uffff\1\124\1\uffff\1\141\1\uffff"+
        "\1\125\1\75\1\76\1\uffff\1\107\1\120\1\uffff\1\122\1\146\1\111\1"+
        "\113\1\116\1\131\1\132\1\uffff\1\117\1\137\1\150\1\165\1\150\1\uffff"+
        "\1\162\3\154\1\153\1\uffff\2\157\1\160\1\161\1\164\1\60\1\31\1\61"+
        "\1\62\1\43\1\63\1\47\1\112\1\54\1\uffff\1\135\1\uffff\1\105\1\uffff"+
        "\1\71\1\101\1\144\1\uffff\1\72\1\73\1\74\1\103\1\uffff\1\121\1\140"+
        "\1\133\1\143\1\uffff\1\155\1\156\1\126\1\65\6\uffff\1\152\1\151"+
        "\1\104\1\77\5\uffff\1\130\1\106\1\123\1\110\1\127\1\142\1\uffff"+
        "\1\151";
    static final String DFA1_specialS =
        "\1\63\1\45\1\54\1\46\1\50\1\74\1\77\1\60\1\70\1\104\1\101\1\15"+
        "\1\13\1\1\1\10\1\14\1\30\1\22\1\33\1\27\1\34\1\36\1\43\1\57\1\52"+
        "\1\25\1\6\1\11\1\103\1\100\1\67\1\105\1\102\1\72\1\47\1\0\1\4\1"+
        "\17\1\12\1\41\1\2\1\62\1\31\1\106\1\71\1\24\1\7\1\42\1\61\1\107"+
        "\1\uffff\1\44\23\uffff\1\5\12\uffff\1\16\16\uffff\1\75\5\uffff\1"+
        "\56\5\uffff\1\110\5\uffff\1\40\2\uffff\1\37\1\uffff\1\53\6\uffff"+
        "\1\35\7\uffff\1\65\13\uffff\1\76\16\uffff\1\32\21\uffff\1\26\4\uffff"+
        "\1\51\3\uffff\1\3\1\73\4\uffff\1\21\1\23\1\55\1\20\1\66\6\uffff"+
        "\1\64\1\uffff}>";
    static final String[] DFA1_transitionS = {
            "\11\62\2\61\2\62\1\61\22\62\1\61\1\1\1\60\1\2\1\51\1\3\1\4"+
            "\1\53\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\56\11\57\1\15\1"+
            "\16\1\17\1\20\1\21\1\22\1\23\32\51\1\24\1\52\1\25\1\50\1\51"+
            "\1\62\1\31\1\44\1\40\1\32\1\41\1\34\2\51\1\33\4\51\1\35\1\47"+
            "\1\45\1\51\1\46\1\42\1\36\1\51\1\37\1\43\3\51\1\26\1\27\1\30"+
            "\44\62\4\51\4\62\1\51\1\55\11\62\1\51\4\62\1\51\1\54\4\62\27"+
            "\51\1\62\37\51\1\62\u013f\51\31\62\162\51\4\62\14\51\16\62\5"+
            "\51\11\62\1\51\u008b\62\1\51\13\62\1\51\1\62\3\51\1\62\1\51"+
            "\1\62\24\51\1\62\54\51\1\62\46\51\1\62\5\51\4\62\u0082\51\10"+
            "\62\105\51\1\62\46\51\2\62\2\51\6\62\20\51\41\62\46\51\2\62"+
            "\1\51\7\62\47\51\110\62\33\51\5\62\3\51\56\62\32\51\5\62\13"+
            "\51\43\62\2\51\1\62\143\51\1\62\1\51\17\62\2\51\7\62\2\51\12"+
            "\62\3\51\2\62\1\51\20\62\1\51\1\62\36\51\35\62\3\51\60\62\46"+
            "\51\13\62\1\51\u0152\62\66\51\3\62\1\51\22\62\1\51\7\62\12\51"+
            "\43\62\10\51\2\62\2\51\2\62\26\51\1\62\7\51\1\62\1\51\3\62\4"+
            "\51\3\62\1\51\36\62\2\51\1\62\3\51\16\62\4\51\21\62\6\51\4\62"+
            "\2\51\2\62\26\51\1\62\7\51\1\62\2\51\1\62\2\51\1\62\2\51\37"+
            "\62\4\51\1\62\1\51\23\62\3\51\20\62\11\51\1\62\3\51\1\62\26"+
            "\51\1\62\7\51\1\62\2\51\1\62\5\51\3\62\1\51\22\62\1\51\17\62"+
            "\2\51\17\62\1\51\23\62\10\51\2\62\2\51\2\62\26\51\1\62\7\51"+
            "\1\62\2\51\1\62\5\51\3\62\1\51\36\62\2\51\1\62\3\51\17\62\1"+
            "\51\21\62\1\51\1\62\6\51\3\62\3\51\1\62\4\51\3\62\2\51\1\62"+
            "\1\51\1\62\2\51\3\62\2\51\3\62\3\51\3\62\10\51\1\62\3\51\77"+
            "\62\1\51\13\62\10\51\1\62\3\51\1\62\27\51\1\62\12\51\1\62\5"+
            "\51\46\62\2\51\43\62\10\51\1\62\3\51\1\62\27\51\1\62\12\51\1"+
            "\62\5\51\3\62\1\51\40\62\1\51\1\62\2\51\43\62\10\51\1\62\3\51"+
            "\1\62\27\51\1\62\20\51\46\62\2\51\43\62\22\51\3\62\30\51\1\62"+
            "\11\51\1\62\1\51\2\62\7\51\72\62\60\51\1\62\2\51\13\62\10\51"+
            "\72\62\2\51\1\62\1\51\2\62\2\51\1\62\1\51\2\62\1\51\6\62\4\51"+
            "\1\62\7\51\1\62\3\51\1\62\1\51\1\62\1\51\2\62\2\51\1\62\4\51"+
            "\1\62\2\51\11\62\1\51\2\62\5\51\1\62\1\51\25\62\2\51\42\62\1"+
            "\51\77\62\10\51\1\62\42\51\35\62\4\51\164\62\42\51\1\62\5\51"+
            "\1\62\2\51\45\62\6\51\112\62\46\51\12\62\51\51\7\62\132\51\5"+
            "\62\104\51\5\62\122\51\6\62\7\51\1\62\77\51\1\62\1\51\1\62\4"+
            "\51\2\62\7\51\1\62\1\51\1\62\4\51\2\62\47\51\1\62\1\51\1\62"+
            "\4\51\2\62\37\51\1\62\1\51\1\62\4\51\2\62\7\51\1\62\1\51\1\62"+
            "\4\51\2\62\7\51\1\62\7\51\1\62\27\51\1\62\37\51\1\62\1\51\1"+
            "\62\4\51\2\62\7\51\1\62\47\51\1\62\23\51\105\62\125\51\14\62"+
            "\u026c\51\2\62\10\51\12\62\32\51\5\62\113\51\3\62\3\51\17\62"+
            "\15\51\1\62\4\51\16\62\22\51\16\62\22\51\16\62\15\51\1\62\3"+
            "\51\17\62\64\51\43\62\1\51\3\62\2\51\103\62\130\51\10\62\51"+
            "\51\127\62\35\51\63\62\36\51\2\62\5\51\u038b\62\154\51\u0094"+
            "\62\u009c\51\4\62\132\51\6\62\26\51\2\62\6\51\2\62\46\51\2\62"+
            "\6\51\2\62\10\51\1\62\1\51\1\62\1\51\1\62\1\51\1\62\37\51\2"+
            "\62\65\51\1\62\7\51\1\62\1\51\3\62\3\51\1\62\7\51\3\62\4\51"+
            "\2\62\6\51\4\62\15\51\5\62\3\51\1\62\7\51\102\62\2\51\23\62"+
            "\1\51\34\62\1\51\15\62\1\51\40\62\22\51\120\62\1\51\4\62\1\51"+
            "\2\62\12\51\1\62\1\51\3\62\5\51\6\62\1\51\1\62\1\51\1\62\1\51"+
            "\1\62\4\51\1\62\3\51\1\62\7\51\3\62\3\51\5\62\5\51\26\62\44"+
            "\51\u0e81\62\3\51\31\62\11\51\7\62\5\51\2\62\5\51\4\62\126\51"+
            "\6\62\3\51\1\62\137\51\5\62\50\51\4\62\136\51\21\62\30\51\70"+
            "\62\20\51\u0200\62\u19b6\51\112\62\u51a6\51\132\62\u048d\51"+
            "\u0773\62\u2ba4\51\u215c\62\u012e\51\2\62\73\51\u0095\62\7\51"+
            "\14\62\5\51\5\62\1\51\1\62\12\51\1\62\15\51\1\62\5\51\1\62\1"+
            "\51\1\62\2\51\1\62\2\51\1\62\154\51\41\62\u016b\51\22\62\100"+
            "\51\2\62\66\51\50\62\15\51\66\62\2\51\30\62\3\51\31\62\1\51"+
            "\6\62\5\51\1\62\u0087\51\7\62\1\51\34\62\32\51\4\62\1\51\1\62"+
            "\32\51\12\62\132\51\3\62\6\51\2\62\6\51\2\62\6\51\2\62\3\51"+
            "\3\62\2\51\3\62\2\51\31\62",
            "\1\63",
            "\1\uffff",
            "\1\66",
            "\1\70",
            "\1\uffff",
            "\1\uffff",
            "\1\74\22\uffff\1\75",
            "\1\77\21\uffff\1\100",
            "\1\uffff",
            "\1\103\17\uffff\1\104\1\105",
            "\1\107",
            "\1\112\4\uffff\1\113\15\uffff\1\111",
            "\1\115",
            "\1\uffff",
            "\1\120",
            "\1\122\1\123",
            "\1\125",
            "\1\127\13\uffff\1\130",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\136",
            "\1\uffff",
            "\1\144\3\uffff\1\143\5\uffff\1\142\6\uffff\1\141",
            "\1\147\3\uffff\1\150\5\uffff\1\146",
            "\1\151\6\uffff\1\152\1\153",
            "\1\155\7\uffff\1\156\5\uffff\1\154",
            "\1\162\3\uffff\1\157\11\uffff\1\160\5\uffff\1\161",
            "\1\164\11\uffff\1\163\6\uffff\1\165",
            "\1\166\15\uffff\1\167",
            "\1\170\15\uffff\1\171",
            "\1\172\12\uffff\1\173\13\uffff\1\174",
            "\1\176\13\uffff\1\177\1\175\1\uffff\1\u0080\1\uffff\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0085\3\uffff\1\u0086\14\uffff\1\u0087\2\uffff\1\u0084",
            "\1\u0088",
            "\1\u0089",
            "\1\145\34\uffff\32\145\1\uffff\1\u008a\2\uffff\1\145\1\uffff"+
            "\32\145\47\uffff\4\145\4\uffff\1\145\12\uffff\1\145\4\uffff"+
            "\1\145\5\uffff\27\145\1\uffff\37\145\1\uffff\u013f\145\31\uffff"+
            "\162\145\4\uffff\14\145\16\uffff\5\145\11\uffff\1\145\u008b"+
            "\uffff\1\145\13\uffff\1\145\1\uffff\3\145\1\uffff\1\145\1\uffff"+
            "\24\145\1\uffff\54\145\1\uffff\46\145\1\uffff\5\145\4\uffff"+
            "\u0082\145\10\uffff\105\145\1\uffff\46\145\2\uffff\2\145\6\uffff"+
            "\20\145\41\uffff\46\145\2\uffff\1\145\7\uffff\47\145\110\uffff"+
            "\33\145\5\uffff\3\145\56\uffff\32\145\5\uffff\13\145\43\uffff"+
            "\2\145\1\uffff\143\145\1\uffff\1\145\17\uffff\2\145\7\uffff"+
            "\2\145\12\uffff\3\145\2\uffff\1\145\20\uffff\1\145\1\uffff\36"+
            "\145\35\uffff\3\145\60\uffff\46\145\13\uffff\1\145\u0152\uffff"+
            "\66\145\3\uffff\1\145\22\uffff\1\145\7\uffff\12\145\43\uffff"+
            "\10\145\2\uffff\2\145\2\uffff\26\145\1\uffff\7\145\1\uffff\1"+
            "\145\3\uffff\4\145\3\uffff\1\145\36\uffff\2\145\1\uffff\3\145"+
            "\16\uffff\4\145\21\uffff\6\145\4\uffff\2\145\2\uffff\26\145"+
            "\1\uffff\7\145\1\uffff\2\145\1\uffff\2\145\1\uffff\2\145\37"+
            "\uffff\4\145\1\uffff\1\145\23\uffff\3\145\20\uffff\11\145\1"+
            "\uffff\3\145\1\uffff\26\145\1\uffff\7\145\1\uffff\2\145\1\uffff"+
            "\5\145\3\uffff\1\145\22\uffff\1\145\17\uffff\2\145\17\uffff"+
            "\1\145\23\uffff\10\145\2\uffff\2\145\2\uffff\26\145\1\uffff"+
            "\7\145\1\uffff\2\145\1\uffff\5\145\3\uffff\1\145\36\uffff\2"+
            "\145\1\uffff\3\145\17\uffff\1\145\21\uffff\1\145\1\uffff\6\145"+
            "\3\uffff\3\145\1\uffff\4\145\3\uffff\2\145\1\uffff\1\145\1\uffff"+
            "\2\145\3\uffff\2\145\3\uffff\3\145\3\uffff\10\145\1\uffff\3"+
            "\145\77\uffff\1\145\13\uffff\10\145\1\uffff\3\145\1\uffff\27"+
            "\145\1\uffff\12\145\1\uffff\5\145\46\uffff\2\145\43\uffff\10"+
            "\145\1\uffff\3\145\1\uffff\27\145\1\uffff\12\145\1\uffff\5\145"+
            "\3\uffff\1\145\40\uffff\1\145\1\uffff\2\145\43\uffff\10\145"+
            "\1\uffff\3\145\1\uffff\27\145\1\uffff\20\145\46\uffff\2\145"+
            "\43\uffff\22\145\3\uffff\30\145\1\uffff\11\145\1\uffff\1\145"+
            "\2\uffff\7\145\72\uffff\60\145\1\uffff\2\145\13\uffff\10\145"+
            "\72\uffff\2\145\1\uffff\1\145\2\uffff\2\145\1\uffff\1\145\2"+
            "\uffff\1\145\6\uffff\4\145\1\uffff\7\145\1\uffff\3\145\1\uffff"+
            "\1\145\1\uffff\1\145\2\uffff\2\145\1\uffff\4\145\1\uffff\2\145"+
            "\11\uffff\1\145\2\uffff\5\145\1\uffff\1\145\25\uffff\2\145\42"+
            "\uffff\1\145\77\uffff\10\145\1\uffff\42\145\35\uffff\4\145\164"+
            "\uffff\42\145\1\uffff\5\145\1\uffff\2\145\45\uffff\6\145\112"+
            "\uffff\46\145\12\uffff\51\145\7\uffff\132\145\5\uffff\104\145"+
            "\5\uffff\122\145\6\uffff\7\145\1\uffff\77\145\1\uffff\1\145"+
            "\1\uffff\4\145\2\uffff\7\145\1\uffff\1\145\1\uffff\4\145\2\uffff"+
            "\47\145\1\uffff\1\145\1\uffff\4\145\2\uffff\37\145\1\uffff\1"+
            "\145\1\uffff\4\145\2\uffff\7\145\1\uffff\1\145\1\uffff\4\145"+
            "\2\uffff\7\145\1\uffff\7\145\1\uffff\27\145\1\uffff\37\145\1"+
            "\uffff\1\145\1\uffff\4\145\2\uffff\7\145\1\uffff\47\145\1\uffff"+
            "\23\145\105\uffff\125\145\14\uffff\u026c\145\2\uffff\10\145"+
            "\12\uffff\32\145\5\uffff\113\145\3\uffff\3\145\17\uffff\15\145"+
            "\1\uffff\4\145\16\uffff\22\145\16\uffff\22\145\16\uffff\15\145"+
            "\1\uffff\3\145\17\uffff\64\145\43\uffff\1\145\3\uffff\2\145"+
            "\103\uffff\130\145\10\uffff\51\145\127\uffff\35\145\63\uffff"+
            "\36\145\2\uffff\5\145\u038b\uffff\154\145\u0094\uffff\u009c"+
            "\145\4\uffff\132\145\6\uffff\26\145\2\uffff\6\145\2\uffff\46"+
            "\145\2\uffff\6\145\2\uffff\10\145\1\uffff\1\145\1\uffff\1\145"+
            "\1\uffff\1\145\1\uffff\37\145\2\uffff\65\145\1\uffff\7\145\1"+
            "\uffff\1\145\3\uffff\3\145\1\uffff\7\145\3\uffff\4\145\2\uffff"+
            "\6\145\4\uffff\15\145\5\uffff\3\145\1\uffff\7\145\102\uffff"+
            "\2\145\23\uffff\1\145\34\uffff\1\145\15\uffff\1\145\40\uffff"+
            "\22\145\120\uffff\1\145\4\uffff\1\145\2\uffff\12\145\1\uffff"+
            "\1\145\3\uffff\5\145\6\uffff\1\145\1\uffff\1\145\1\uffff\1\145"+
            "\1\uffff\4\145\1\uffff\3\145\1\uffff\7\145\3\uffff\3\145\5\uffff"+
            "\5\145\26\uffff\44\145\u0e81\uffff\3\145\31\uffff\11\145\7\uffff"+
            "\5\145\2\uffff\5\145\4\uffff\126\145\6\uffff\3\145\1\uffff\137"+
            "\145\5\uffff\50\145\4\uffff\136\145\21\uffff\30\145\70\uffff"+
            "\20\145\u0200\uffff\u19b6\145\112\uffff\u51a6\145\132\uffff"+
            "\u048d\145\u0773\uffff\u2ba4\145\u215c\uffff\u012e\145\2\uffff"+
            "\73\145\u0095\uffff\7\145\14\uffff\5\145\5\uffff\1\145\1\uffff"+
            "\12\145\1\uffff\15\145\1\uffff\5\145\1\uffff\1\145\1\uffff\2"+
            "\145\1\uffff\2\145\1\uffff\154\145\41\uffff\u016b\145\22\uffff"+
            "\100\145\2\uffff\66\145\50\uffff\15\145\66\uffff\2\145\30\uffff"+
            "\3\145\31\uffff\1\145\6\uffff\5\145\1\uffff\u0087\145\7\uffff"+
            "\1\145\34\uffff\32\145\4\uffff\1\145\1\uffff\32\145\12\uffff"+
            "\132\145\3\uffff\6\145\2\uffff\6\145\2\uffff\6\145\2\uffff\3"+
            "\145\3\uffff\2\145\3\uffff\2\145",
            "\1\uffff",
            "\1\u008c",
            "\1\u008d",
            "\47\u0090\1\u008f\u0083\u0090\1\u0091\uff54\u0090",
            "\1\u0093",
            "\1\u0095\37\uffff\1\u0094",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\u0099",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u009b\15\uffff\1\u009c",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u009e",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a0",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a2\14\uffff\1\u00a3",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a4\10\uffff\1\u00a5",
            "\1\u00a6",
            "",
            "",
            "",
            "",
            "\1\u00a9\23\uffff\1\u00a8\3\uffff\1\u00a7",
            "\1\u00aa",
            "",
            "\1\u00ab\5\uffff\1\u00ac",
            "",
            "\1\u00ad\1\u00ae",
            "",
            "",
            "",
            "\1\u00af",
            "",
            "",
            "\1\u00b0\20\uffff\1\u00b1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00b2\5\uffff\1\u00b3",
            "",
            "",
            "",
            "",
            "",
            "\1\u00b4",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00b7",
            "",
            "\1\u00b9",
            "",
            "\1\u00ba",
            "",
            "",
            "",
            "\1\u00bb",
            "",
            "",
            "",
            "",
            "\1\u00bc",
            "",
            "",
            "",
            "",
            "\47\u00be\1\u00bd\u0083\u00be\1\u00bf\uff54\u00be",
            "",
            "",
            "",
            "",
            "\1\u00c1",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\47\u00c7\1\u00c6\u0083\u00c7\1\u00bf\uff54\u00c7",
            "\47\u00be\1\u00bd\u0083\u00be\1\u00bf\uff54\u00be",
            "",
            "",
            "",
            "",
            "\1\u00c8",
            "\1\u00ca",
            "\1\u00cc\16\uffff\1\u00cd",
            "\47\u00ce\1\u00cf\u0083\u00ce\1\u00bf\uff54\u00ce",
            "\47\u00be\1\u00bd\u0083\u00be\1\u00bf\uff54\u00be",
            "",
            "",
            "",
            "",
            "",
            "",
            "\47\u00be\1\u00bd\u0083\u00be\1\u00bf\uff54\u00be",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "148:1: SYNTHETIC_ALL_KEYWORDS : ( ( FRAGMENT_ExclamationMark )=> FRAGMENT_ExclamationMark | ( FRAGMENT_NumberSign )=> FRAGMENT_NumberSign | ( FRAGMENT_PercentSign )=> FRAGMENT_PercentSign | ( FRAGMENT_Ampersand )=> FRAGMENT_Ampersand | ( FRAGMENT_LeftParenthesis )=> FRAGMENT_LeftParenthesis | ( FRAGMENT_RightParenthesis )=> FRAGMENT_RightParenthesis | ( FRAGMENT_Asterisk )=> FRAGMENT_Asterisk | ( FRAGMENT_PlusSign )=> FRAGMENT_PlusSign | ( FRAGMENT_Comma )=> FRAGMENT_Comma | ( FRAGMENT_HyphenMinus )=> FRAGMENT_HyphenMinus | ( FRAGMENT_FullStop )=> FRAGMENT_FullStop | ( FRAGMENT_Solidus )=> FRAGMENT_Solidus | ( FRAGMENT_Colon )=> FRAGMENT_Colon | ( FRAGMENT_Semicolon )=> FRAGMENT_Semicolon | ( FRAGMENT_LessThanSign )=> FRAGMENT_LessThanSign | ( FRAGMENT_EqualsSign )=> FRAGMENT_EqualsSign | ( FRAGMENT_GreaterThanSign )=> FRAGMENT_GreaterThanSign | ( FRAGMENT_QuestionMark )=> FRAGMENT_QuestionMark | ( FRAGMENT_CommercialAt )=> FRAGMENT_CommercialAt | ( FRAGMENT_LeftSquareBracket )=> FRAGMENT_LeftSquareBracket | ( FRAGMENT_RightSquareBracket )=> FRAGMENT_RightSquareBracket | ( FRAGMENT_LeftCurlyBracket )=> FRAGMENT_LeftCurlyBracket | ( FRAGMENT_VerticalLine )=> FRAGMENT_VerticalLine | ( FRAGMENT_RightCurlyBracket )=> FRAGMENT_RightCurlyBracket | ( FRAGMENT_ExclamationMarkEqualsSign )=> FRAGMENT_ExclamationMarkEqualsSign | ( FRAGMENT_PercentSignEqualsSign )=> FRAGMENT_PercentSignEqualsSign | ( FRAGMENT_AmpersandAmpersand )=> FRAGMENT_AmpersandAmpersand | ( FRAGMENT_AsteriskAsterisk )=> FRAGMENT_AsteriskAsterisk | ( FRAGMENT_AsteriskEqualsSign )=> FRAGMENT_AsteriskEqualsSign | ( FRAGMENT_PlusSignPlusSign )=> FRAGMENT_PlusSignPlusSign | ( FRAGMENT_PlusSignEqualsSign )=> FRAGMENT_PlusSignEqualsSign | ( FRAGMENT_HyphenMinusHyphenMinus )=> FRAGMENT_HyphenMinusHyphenMinus | ( FRAGMENT_HyphenMinusEqualsSign )=> FRAGMENT_HyphenMinusEqualsSign | ( FRAGMENT_HyphenMinusGreaterThanSign )=> FRAGMENT_HyphenMinusGreaterThanSign | ( FRAGMENT_FullStopFullStop )=> FRAGMENT_FullStopFullStop | ( FRAGMENT_SolidusEqualsSign )=> FRAGMENT_SolidusEqualsSign | ( FRAGMENT_ColonColon )=> FRAGMENT_ColonColon | ( FRAGMENT_LessThanSignGreaterThanSign )=> FRAGMENT_LessThanSignGreaterThanSign | ( FRAGMENT_EqualsSignEqualsSign )=> FRAGMENT_EqualsSignEqualsSign | ( FRAGMENT_EqualsSignGreaterThanSign )=> FRAGMENT_EqualsSignGreaterThanSign | ( FRAGMENT_GreaterThanSignEqualsSign )=> FRAGMENT_GreaterThanSignEqualsSign | ( FRAGMENT_QuestionMarkFullStop )=> FRAGMENT_QuestionMarkFullStop | ( FRAGMENT_QuestionMarkColon )=> FRAGMENT_QuestionMarkColon | ( FRAGMENT_As )=> FRAGMENT_As | ( FRAGMENT_Do )=> FRAGMENT_Do | ( FRAGMENT_If )=> FRAGMENT_If | ( FRAGMENT_VerticalLineVerticalLine )=> FRAGMENT_VerticalLineVerticalLine | ( FRAGMENT_ExclamationMarkEqualsSignEqualsSign )=> FRAGMENT_ExclamationMarkEqualsSignEqualsSign | ( FRAGMENT_FullStopFullStopFullStop )=> FRAGMENT_FullStopFullStopFullStop | ( FRAGMENT_FullStopFullStopLessThanSign )=> FRAGMENT_FullStopFullStopLessThanSign | ( FRAGMENT_EqualsSignEqualsSignEqualsSign )=> FRAGMENT_EqualsSignEqualsSignEqualsSign | ( FRAGMENT_All )=> FRAGMENT_All | ( FRAGMENT_Def )=> FRAGMENT_Def | ( FRAGMENT_For )=> FRAGMENT_For | ( FRAGMENT_New )=> FRAGMENT_New | ( FRAGMENT_Not )=> FRAGMENT_Not | ( FRAGMENT_Try )=> FRAGMENT_Try | ( FRAGMENT_Val )=> FRAGMENT_Val | ( FRAGMENT_Var )=> FRAGMENT_Var | ( FRAGMENT_Case )=> FRAGMENT_Case | ( FRAGMENT_Each )=> FRAGMENT_Each | ( FRAGMENT_Else )=> FRAGMENT_Else | ( FRAGMENT_Fact )=> FRAGMENT_Fact | ( FRAGMENT_Null )=> FRAGMENT_Null | ( FRAGMENT_True )=> FRAGMENT_True | ( FRAGMENT_After )=> FRAGMENT_After | ( FRAGMENT_Catch )=> FRAGMENT_Catch | ( FRAGMENT_Facts )=> FRAGMENT_Facts | ( FRAGMENT_False )=> FRAGMENT_False | ( FRAGMENT_Final )=> FRAGMENT_Final | ( FRAGMENT_Super )=> FRAGMENT_Super | ( FRAGMENT_Throw )=> FRAGMENT_Throw | ( FRAGMENT_While )=> FRAGMENT_While | ( FRAGMENT_Assert )=> FRAGMENT_Assert | ( FRAGMENT_Before )=> FRAGMENT_Before | ( FRAGMENT_Import )=> FRAGMENT_Import | ( FRAGMENT_Native )=> FRAGMENT_Native | ( FRAGMENT_Public )=> FRAGMENT_Public | ( FRAGMENT_Return )=> FRAGMENT_Return | ( FRAGMENT_Should )=> FRAGMENT_Should | ( FRAGMENT_Static )=> FRAGMENT_Static | ( FRAGMENT_Switch )=> FRAGMENT_Switch | ( FRAGMENT_Throws )=> FRAGMENT_Throws | ( FRAGMENT_Typeof )=> FRAGMENT_Typeof | ( FRAGMENT_Context )=> FRAGMENT_Context | ( FRAGMENT_Default )=> FRAGMENT_Default | ( FRAGMENT_Extends )=> FRAGMENT_Extends | ( FRAGMENT_Finally )=> FRAGMENT_Finally | ( FRAGMENT_Package )=> FRAGMENT_Package | ( FRAGMENT_Pending )=> FRAGMENT_Pending | ( FRAGMENT_Private )=> FRAGMENT_Private | ( FRAGMENT_Abstract )=> FRAGMENT_Abstract | ( FRAGMENT_Describe )=> FRAGMENT_Describe | ( FRAGMENT_Dispatch )=> FRAGMENT_Dispatch | ( FRAGMENT_Override )=> FRAGMENT_Override | ( FRAGMENT_Strictfp )=> FRAGMENT_Strictfp | ( FRAGMENT_Volatile )=> FRAGMENT_Volatile | ( FRAGMENT_Extension )=> FRAGMENT_Extension | ( FRAGMENT_Protected )=> FRAGMENT_Protected | ( FRAGMENT_Transient )=> FRAGMENT_Transient | ( FRAGMENT_Instanceof )=> FRAGMENT_Instanceof | ( FRAGMENT_Synchronized )=> FRAGMENT_Synchronized | ( FRAGMENT_RULE_ML_COMMENT )=> FRAGMENT_RULE_ML_COMMENT | ( FRAGMENT_RULE_ID )=> FRAGMENT_RULE_ID | ( FRAGMENT_RULE_RICH_TEXT )=> FRAGMENT_RULE_RICH_TEXT | ( FRAGMENT_RULE_RICH_TEXT_START )=> FRAGMENT_RULE_RICH_TEXT_START | ( FRAGMENT_RULE_RICH_TEXT_END )=> FRAGMENT_RULE_RICH_TEXT_END | ( FRAGMENT_RULE_RICH_TEXT_INBETWEEN )=> FRAGMENT_RULE_RICH_TEXT_INBETWEEN | ( FRAGMENT_RULE_COMMENT_RICH_TEXT_INBETWEEN )=> FRAGMENT_RULE_COMMENT_RICH_TEXT_INBETWEEN | ( FRAGMENT_RULE_COMMENT_RICH_TEXT_END )=> FRAGMENT_RULE_COMMENT_RICH_TEXT_END | ( FRAGMENT_RULE_HEX )=> FRAGMENT_RULE_HEX | ( FRAGMENT_RULE_INT )=> FRAGMENT_RULE_INT | ( FRAGMENT_RULE_DECIMAL )=> FRAGMENT_RULE_DECIMAL | ( FRAGMENT_RULE_STRING )=> FRAGMENT_RULE_STRING | ( FRAGMENT_RULE_SL_COMMENT )=> FRAGMENT_RULE_SL_COMMENT | ( FRAGMENT_RULE_WS )=> FRAGMENT_RULE_WS | ( FRAGMENT_RULE_ANY_OTHER )=> FRAGMENT_RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_35 = input.LA(1);

                         
                        int index1_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_35=='h') && (synpred73_InternalSpecLexer())) {s = 130;}

                        else if ( (synpred104_InternalSpecLexer()) ) {s = 101;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 50;}

                         
                        input.seek(index1_35);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_13 = input.LA(1);

                         
                        int index1_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_13==':') && (synpred37_InternalSpecLexer())) {s = 77;}

                        else if ( (synpred13_InternalSpecLexer()) ) {s = 78;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 50;}

                         
                        input.seek(index1_13);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_40 = input.LA(1);

                         
                        int index1_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_40=='$'||(LA1_40>='A' && LA1_40<='Z')||LA1_40=='_'||(LA1_40>='a' && LA1_40<='z')||(LA1_40>='\u00A2' && LA1_40<='\u00A5')||LA1_40=='\u00AA'||LA1_40=='\u00B5'||LA1_40=='\u00BA'||(LA1_40>='\u00C0' && LA1_40<='\u00D6')||(LA1_40>='\u00D8' && LA1_40<='\u00F6')||(LA1_40>='\u00F8' && LA1_40<='\u0236')||(LA1_40>='\u0250' && LA1_40<='\u02C1')||(LA1_40>='\u02C6' && LA1_40<='\u02D1')||(LA1_40>='\u02E0' && LA1_40<='\u02E4')||LA1_40=='\u02EE'||LA1_40=='\u037A'||LA1_40=='\u0386'||(LA1_40>='\u0388' && LA1_40<='\u038A')||LA1_40=='\u038C'||(LA1_40>='\u038E' && LA1_40<='\u03A1')||(LA1_40>='\u03A3' && LA1_40<='\u03CE')||(LA1_40>='\u03D0' && LA1_40<='\u03F5')||(LA1_40>='\u03F7' && LA1_40<='\u03FB')||(LA1_40>='\u0400' && LA1_40<='\u0481')||(LA1_40>='\u048A' && LA1_40<='\u04CE')||(LA1_40>='\u04D0' && LA1_40<='\u04F5')||(LA1_40>='\u04F8' && LA1_40<='\u04F9')||(LA1_40>='\u0500' && LA1_40<='\u050F')||(LA1_40>='\u0531' && LA1_40<='\u0556')||LA1_40=='\u0559'||(LA1_40>='\u0561' && LA1_40<='\u0587')||(LA1_40>='\u05D0' && LA1_40<='\u05EA')||(LA1_40>='\u05F0' && LA1_40<='\u05F2')||(LA1_40>='\u0621' && LA1_40<='\u063A')||(LA1_40>='\u0640' && LA1_40<='\u064A')||(LA1_40>='\u066E' && LA1_40<='\u066F')||(LA1_40>='\u0671' && LA1_40<='\u06D3')||LA1_40=='\u06D5'||(LA1_40>='\u06E5' && LA1_40<='\u06E6')||(LA1_40>='\u06EE' && LA1_40<='\u06EF')||(LA1_40>='\u06FA' && LA1_40<='\u06FC')||LA1_40=='\u06FF'||LA1_40=='\u0710'||(LA1_40>='\u0712' && LA1_40<='\u072F')||(LA1_40>='\u074D' && LA1_40<='\u074F')||(LA1_40>='\u0780' && LA1_40<='\u07A5')||LA1_40=='\u07B1'||(LA1_40>='\u0904' && LA1_40<='\u0939')||LA1_40=='\u093D'||LA1_40=='\u0950'||(LA1_40>='\u0958' && LA1_40<='\u0961')||(LA1_40>='\u0985' && LA1_40<='\u098C')||(LA1_40>='\u098F' && LA1_40<='\u0990')||(LA1_40>='\u0993' && LA1_40<='\u09A8')||(LA1_40>='\u09AA' && LA1_40<='\u09B0')||LA1_40=='\u09B2'||(LA1_40>='\u09B6' && LA1_40<='\u09B9')||LA1_40=='\u09BD'||(LA1_40>='\u09DC' && LA1_40<='\u09DD')||(LA1_40>='\u09DF' && LA1_40<='\u09E1')||(LA1_40>='\u09F0' && LA1_40<='\u09F3')||(LA1_40>='\u0A05' && LA1_40<='\u0A0A')||(LA1_40>='\u0A0F' && LA1_40<='\u0A10')||(LA1_40>='\u0A13' && LA1_40<='\u0A28')||(LA1_40>='\u0A2A' && LA1_40<='\u0A30')||(LA1_40>='\u0A32' && LA1_40<='\u0A33')||(LA1_40>='\u0A35' && LA1_40<='\u0A36')||(LA1_40>='\u0A38' && LA1_40<='\u0A39')||(LA1_40>='\u0A59' && LA1_40<='\u0A5C')||LA1_40=='\u0A5E'||(LA1_40>='\u0A72' && LA1_40<='\u0A74')||(LA1_40>='\u0A85' && LA1_40<='\u0A8D')||(LA1_40>='\u0A8F' && LA1_40<='\u0A91')||(LA1_40>='\u0A93' && LA1_40<='\u0AA8')||(LA1_40>='\u0AAA' && LA1_40<='\u0AB0')||(LA1_40>='\u0AB2' && LA1_40<='\u0AB3')||(LA1_40>='\u0AB5' && LA1_40<='\u0AB9')||LA1_40=='\u0ABD'||LA1_40=='\u0AD0'||(LA1_40>='\u0AE0' && LA1_40<='\u0AE1')||LA1_40=='\u0AF1'||(LA1_40>='\u0B05' && LA1_40<='\u0B0C')||(LA1_40>='\u0B0F' && LA1_40<='\u0B10')||(LA1_40>='\u0B13' && LA1_40<='\u0B28')||(LA1_40>='\u0B2A' && LA1_40<='\u0B30')||(LA1_40>='\u0B32' && LA1_40<='\u0B33')||(LA1_40>='\u0B35' && LA1_40<='\u0B39')||LA1_40=='\u0B3D'||(LA1_40>='\u0B5C' && LA1_40<='\u0B5D')||(LA1_40>='\u0B5F' && LA1_40<='\u0B61')||LA1_40=='\u0B71'||LA1_40=='\u0B83'||(LA1_40>='\u0B85' && LA1_40<='\u0B8A')||(LA1_40>='\u0B8E' && LA1_40<='\u0B90')||(LA1_40>='\u0B92' && LA1_40<='\u0B95')||(LA1_40>='\u0B99' && LA1_40<='\u0B9A')||LA1_40=='\u0B9C'||(LA1_40>='\u0B9E' && LA1_40<='\u0B9F')||(LA1_40>='\u0BA3' && LA1_40<='\u0BA4')||(LA1_40>='\u0BA8' && LA1_40<='\u0BAA')||(LA1_40>='\u0BAE' && LA1_40<='\u0BB5')||(LA1_40>='\u0BB7' && LA1_40<='\u0BB9')||LA1_40=='\u0BF9'||(LA1_40>='\u0C05' && LA1_40<='\u0C0C')||(LA1_40>='\u0C0E' && LA1_40<='\u0C10')||(LA1_40>='\u0C12' && LA1_40<='\u0C28')||(LA1_40>='\u0C2A' && LA1_40<='\u0C33')||(LA1_40>='\u0C35' && LA1_40<='\u0C39')||(LA1_40>='\u0C60' && LA1_40<='\u0C61')||(LA1_40>='\u0C85' && LA1_40<='\u0C8C')||(LA1_40>='\u0C8E' && LA1_40<='\u0C90')||(LA1_40>='\u0C92' && LA1_40<='\u0CA8')||(LA1_40>='\u0CAA' && LA1_40<='\u0CB3')||(LA1_40>='\u0CB5' && LA1_40<='\u0CB9')||LA1_40=='\u0CBD'||LA1_40=='\u0CDE'||(LA1_40>='\u0CE0' && LA1_40<='\u0CE1')||(LA1_40>='\u0D05' && LA1_40<='\u0D0C')||(LA1_40>='\u0D0E' && LA1_40<='\u0D10')||(LA1_40>='\u0D12' && LA1_40<='\u0D28')||(LA1_40>='\u0D2A' && LA1_40<='\u0D39')||(LA1_40>='\u0D60' && LA1_40<='\u0D61')||(LA1_40>='\u0D85' && LA1_40<='\u0D96')||(LA1_40>='\u0D9A' && LA1_40<='\u0DB1')||(LA1_40>='\u0DB3' && LA1_40<='\u0DBB')||LA1_40=='\u0DBD'||(LA1_40>='\u0DC0' && LA1_40<='\u0DC6')||(LA1_40>='\u0E01' && LA1_40<='\u0E30')||(LA1_40>='\u0E32' && LA1_40<='\u0E33')||(LA1_40>='\u0E3F' && LA1_40<='\u0E46')||(LA1_40>='\u0E81' && LA1_40<='\u0E82')||LA1_40=='\u0E84'||(LA1_40>='\u0E87' && LA1_40<='\u0E88')||LA1_40=='\u0E8A'||LA1_40=='\u0E8D'||(LA1_40>='\u0E94' && LA1_40<='\u0E97')||(LA1_40>='\u0E99' && LA1_40<='\u0E9F')||(LA1_40>='\u0EA1' && LA1_40<='\u0EA3')||LA1_40=='\u0EA5'||LA1_40=='\u0EA7'||(LA1_40>='\u0EAA' && LA1_40<='\u0EAB')||(LA1_40>='\u0EAD' && LA1_40<='\u0EB0')||(LA1_40>='\u0EB2' && LA1_40<='\u0EB3')||LA1_40=='\u0EBD'||(LA1_40>='\u0EC0' && LA1_40<='\u0EC4')||LA1_40=='\u0EC6'||(LA1_40>='\u0EDC' && LA1_40<='\u0EDD')||LA1_40=='\u0F00'||(LA1_40>='\u0F40' && LA1_40<='\u0F47')||(LA1_40>='\u0F49' && LA1_40<='\u0F6A')||(LA1_40>='\u0F88' && LA1_40<='\u0F8B')||(LA1_40>='\u1000' && LA1_40<='\u1021')||(LA1_40>='\u1023' && LA1_40<='\u1027')||(LA1_40>='\u1029' && LA1_40<='\u102A')||(LA1_40>='\u1050' && LA1_40<='\u1055')||(LA1_40>='\u10A0' && LA1_40<='\u10C5')||(LA1_40>='\u10D0' && LA1_40<='\u10F8')||(LA1_40>='\u1100' && LA1_40<='\u1159')||(LA1_40>='\u115F' && LA1_40<='\u11A2')||(LA1_40>='\u11A8' && LA1_40<='\u11F9')||(LA1_40>='\u1200' && LA1_40<='\u1206')||(LA1_40>='\u1208' && LA1_40<='\u1246')||LA1_40=='\u1248'||(LA1_40>='\u124A' && LA1_40<='\u124D')||(LA1_40>='\u1250' && LA1_40<='\u1256')||LA1_40=='\u1258'||(LA1_40>='\u125A' && LA1_40<='\u125D')||(LA1_40>='\u1260' && LA1_40<='\u1286')||LA1_40=='\u1288'||(LA1_40>='\u128A' && LA1_40<='\u128D')||(LA1_40>='\u1290' && LA1_40<='\u12AE')||LA1_40=='\u12B0'||(LA1_40>='\u12B2' && LA1_40<='\u12B5')||(LA1_40>='\u12B8' && LA1_40<='\u12BE')||LA1_40=='\u12C0'||(LA1_40>='\u12C2' && LA1_40<='\u12C5')||(LA1_40>='\u12C8' && LA1_40<='\u12CE')||(LA1_40>='\u12D0' && LA1_40<='\u12D6')||(LA1_40>='\u12D8' && LA1_40<='\u12EE')||(LA1_40>='\u12F0' && LA1_40<='\u130E')||LA1_40=='\u1310'||(LA1_40>='\u1312' && LA1_40<='\u1315')||(LA1_40>='\u1318' && LA1_40<='\u131E')||(LA1_40>='\u1320' && LA1_40<='\u1346')||(LA1_40>='\u1348' && LA1_40<='\u135A')||(LA1_40>='\u13A0' && LA1_40<='\u13F4')||(LA1_40>='\u1401' && LA1_40<='\u166C')||(LA1_40>='\u166F' && LA1_40<='\u1676')||(LA1_40>='\u1681' && LA1_40<='\u169A')||(LA1_40>='\u16A0' && LA1_40<='\u16EA')||(LA1_40>='\u16EE' && LA1_40<='\u16F0')||(LA1_40>='\u1700' && LA1_40<='\u170C')||(LA1_40>='\u170E' && LA1_40<='\u1711')||(LA1_40>='\u1720' && LA1_40<='\u1731')||(LA1_40>='\u1740' && LA1_40<='\u1751')||(LA1_40>='\u1760' && LA1_40<='\u176C')||(LA1_40>='\u176E' && LA1_40<='\u1770')||(LA1_40>='\u1780' && LA1_40<='\u17B3')||LA1_40=='\u17D7'||(LA1_40>='\u17DB' && LA1_40<='\u17DC')||(LA1_40>='\u1820' && LA1_40<='\u1877')||(LA1_40>='\u1880' && LA1_40<='\u18A8')||(LA1_40>='\u1900' && LA1_40<='\u191C')||(LA1_40>='\u1950' && LA1_40<='\u196D')||(LA1_40>='\u1970' && LA1_40<='\u1974')||(LA1_40>='\u1D00' && LA1_40<='\u1D6B')||(LA1_40>='\u1E00' && LA1_40<='\u1E9B')||(LA1_40>='\u1EA0' && LA1_40<='\u1EF9')||(LA1_40>='\u1F00' && LA1_40<='\u1F15')||(LA1_40>='\u1F18' && LA1_40<='\u1F1D')||(LA1_40>='\u1F20' && LA1_40<='\u1F45')||(LA1_40>='\u1F48' && LA1_40<='\u1F4D')||(LA1_40>='\u1F50' && LA1_40<='\u1F57')||LA1_40=='\u1F59'||LA1_40=='\u1F5B'||LA1_40=='\u1F5D'||(LA1_40>='\u1F5F' && LA1_40<='\u1F7D')||(LA1_40>='\u1F80' && LA1_40<='\u1FB4')||(LA1_40>='\u1FB6' && LA1_40<='\u1FBC')||LA1_40=='\u1FBE'||(LA1_40>='\u1FC2' && LA1_40<='\u1FC4')||(LA1_40>='\u1FC6' && LA1_40<='\u1FCC')||(LA1_40>='\u1FD0' && LA1_40<='\u1FD3')||(LA1_40>='\u1FD6' && LA1_40<='\u1FDB')||(LA1_40>='\u1FE0' && LA1_40<='\u1FEC')||(LA1_40>='\u1FF2' && LA1_40<='\u1FF4')||(LA1_40>='\u1FF6' && LA1_40<='\u1FFC')||(LA1_40>='\u203F' && LA1_40<='\u2040')||LA1_40=='\u2054'||LA1_40=='\u2071'||LA1_40=='\u207F'||(LA1_40>='\u20A0' && LA1_40<='\u20B1')||LA1_40=='\u2102'||LA1_40=='\u2107'||(LA1_40>='\u210A' && LA1_40<='\u2113')||LA1_40=='\u2115'||(LA1_40>='\u2119' && LA1_40<='\u211D')||LA1_40=='\u2124'||LA1_40=='\u2126'||LA1_40=='\u2128'||(LA1_40>='\u212A' && LA1_40<='\u212D')||(LA1_40>='\u212F' && LA1_40<='\u2131')||(LA1_40>='\u2133' && LA1_40<='\u2139')||(LA1_40>='\u213D' && LA1_40<='\u213F')||(LA1_40>='\u2145' && LA1_40<='\u2149')||(LA1_40>='\u2160' && LA1_40<='\u2183')||(LA1_40>='\u3005' && LA1_40<='\u3007')||(LA1_40>='\u3021' && LA1_40<='\u3029')||(LA1_40>='\u3031' && LA1_40<='\u3035')||(LA1_40>='\u3038' && LA1_40<='\u303C')||(LA1_40>='\u3041' && LA1_40<='\u3096')||(LA1_40>='\u309D' && LA1_40<='\u309F')||(LA1_40>='\u30A1' && LA1_40<='\u30FF')||(LA1_40>='\u3105' && LA1_40<='\u312C')||(LA1_40>='\u3131' && LA1_40<='\u318E')||(LA1_40>='\u31A0' && LA1_40<='\u31B7')||(LA1_40>='\u31F0' && LA1_40<='\u31FF')||(LA1_40>='\u3400' && LA1_40<='\u4DB5')||(LA1_40>='\u4E00' && LA1_40<='\u9FA5')||(LA1_40>='\uA000' && LA1_40<='\uA48C')||(LA1_40>='\uAC00' && LA1_40<='\uD7A3')||(LA1_40>='\uF900' && LA1_40<='\uFA2D')||(LA1_40>='\uFA30' && LA1_40<='\uFA6A')||(LA1_40>='\uFB00' && LA1_40<='\uFB06')||(LA1_40>='\uFB13' && LA1_40<='\uFB17')||LA1_40=='\uFB1D'||(LA1_40>='\uFB1F' && LA1_40<='\uFB28')||(LA1_40>='\uFB2A' && LA1_40<='\uFB36')||(LA1_40>='\uFB38' && LA1_40<='\uFB3C')||LA1_40=='\uFB3E'||(LA1_40>='\uFB40' && LA1_40<='\uFB41')||(LA1_40>='\uFB43' && LA1_40<='\uFB44')||(LA1_40>='\uFB46' && LA1_40<='\uFBB1')||(LA1_40>='\uFBD3' && LA1_40<='\uFD3D')||(LA1_40>='\uFD50' && LA1_40<='\uFD8F')||(LA1_40>='\uFD92' && LA1_40<='\uFDC7')||(LA1_40>='\uFDF0' && LA1_40<='\uFDFC')||(LA1_40>='\uFE33' && LA1_40<='\uFE34')||(LA1_40>='\uFE4D' && LA1_40<='\uFE4F')||LA1_40=='\uFE69'||(LA1_40>='\uFE70' && LA1_40<='\uFE74')||(LA1_40>='\uFE76' && LA1_40<='\uFEFC')||LA1_40=='\uFF04'||(LA1_40>='\uFF21' && LA1_40<='\uFF3A')||LA1_40=='\uFF3F'||(LA1_40>='\uFF41' && LA1_40<='\uFF5A')||(LA1_40>='\uFF65' && LA1_40<='\uFFBE')||(LA1_40>='\uFFC2' && LA1_40<='\uFFC7')||(LA1_40>='\uFFCA' && LA1_40<='\uFFCF')||(LA1_40>='\uFFD2' && LA1_40<='\uFFD7')||(LA1_40>='\uFFDA' && LA1_40<='\uFFDC')||(LA1_40>='\uFFE0' && LA1_40<='\uFFE1')||(LA1_40>='\uFFE5' && LA1_40<='\uFFE6')) && (synpred104_InternalSpecLexer())) {s = 101;}

                        else if ( (LA1_40=='\\') && (synpred104_InternalSpecLexer())) {s = 138;}

                        else s = 139;

                         
                        input.seek(index1_40);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA1_189 = input.LA(1);

                         
                        int index1_189 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_189=='\'') ) {s = 198;}

                        else if ( ((LA1_189>='\u0000' && LA1_189<='&')||(LA1_189>='(' && LA1_189<='\u00AA')||(LA1_189>='\u00AC' && LA1_189<='\uFFFF')) ) {s = 199;}

                        else if ( (LA1_189=='\u00AB') && (synpred106_InternalSpecLexer())) {s = 191;}

                        else s = 192;

                         
                        input.seek(index1_189);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA1_36 = input.LA(1);

                         
                        int index1_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_36=='e') && (synpred75_InternalSpecLexer())) {s = 131;}

                        else if ( (synpred104_InternalSpecLexer()) ) {s = 101;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 50;}

                         
                        input.seek(index1_36);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA1_71 = input.LA(1);

                         
                        int index1_71 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_71=='.') && (synpred49_InternalSpecLexer())) {s = 155;}

                        else if ( (LA1_71=='<') && (synpred50_InternalSpecLexer())) {s = 156;}

                        else s = 157;

                         
                        input.seek(index1_71);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA1_26 = input.LA(1);

                         
                        int index1_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_26=='o') && (synpred45_InternalSpecLexer())) {s = 102;}

                        else if ( (LA1_26=='e') ) {s = 103;}

                        else if ( (LA1_26=='i') && (synpred94_InternalSpecLexer())) {s = 104;}

                        else if ( (synpred104_InternalSpecLexer()) ) {s = 101;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 50;}

                         
                        input.seek(index1_26);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA1_46 = input.LA(1);

                         
                        int index1_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_46=='x') && (synpred111_InternalSpecLexer())) {s = 148;}

                        else if ( (LA1_46=='X') && (synpred111_InternalSpecLexer())) {s = 149;}

                        else if ( (synpred112_InternalSpecLexer()) ) {s = 150;}

                        else if ( (synpred113_InternalSpecLexer()) ) {s = 151;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 139;}

                         
                        input.seek(index1_46);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA1_14 = input.LA(1);

                         
                        int index1_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSpecLexer()) ) {s = 79;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 50;}

                         
                        input.seek(index1_14);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA1_27 = input.LA(1);

                         
                        int index1_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_27=='f') && (synpred46_InternalSpecLexer())) {s = 105;}

                        else if ( (LA1_27=='m') && (synpred76_InternalSpecLexer())) {s = 106;}

                        else if ( (LA1_27=='n') && (synpred101_InternalSpecLexer())) {s = 107;}

                        else if ( (synpred104_InternalSpecLexer()) ) {s = 101;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 50;}

                         
                        input.seek(index1_27);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA1_38 = input.LA(1);

                         
                        int index1_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_38=='e') && (synpred79_InternalSpecLexer())) {s = 136;}

                        else if ( (synpred104_InternalSpecLexer()) ) {s = 101;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 50;}

                         
                        input.seek(index1_38);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA1_12 = input.LA(1);

                         
                        int index1_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_12=='=') && (synpred36_InternalSpecLexer())) {s = 73;}

                        else if ( (LA1_12=='*') && (synpred103_InternalSpecLexer())) {s = 74;}

                        else if ( (LA1_12=='/') && (synpred115_InternalSpecLexer())) {s = 75;}

                        else if ( (synpred12_InternalSpecLexer()) ) {s = 76;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 50;}

                         
                        input.seek(index1_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA1_15 = input.LA(1);

                         
                        int index1_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_15=='>') && (synpred38_InternalSpecLexer())) {s = 80;}

                        else if ( (synpred15_InternalSpecLexer()) ) {s = 81;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 50;}

                         
                        input.seek(index1_15);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA1_11 = input.LA(1);

                         
                        int index1_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_11=='.') ) {s = 71;}

                        else if ( (synpred11_InternalSpecLexer()) ) {s = 72;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 50;}

                         
                        input.seek(index1_11);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA1_82 = input.LA(1);

                         
                        int index1_82 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_82=='=') && (synpred51_InternalSpecLexer())) {s = 158;}

                        else s = 159;

                         
                        input.seek(index1_82);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA1_37 = input.LA(1);

                         
                        int index1_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_37=='u') && (synpred78_InternalSpecLexer())) {s = 132;}

                        else if ( (LA1_37=='a') && (synpred89_InternalSpecLexer())) {s = 133;}

                        else if ( (LA1_37=='e') && (synpred90_InternalSpecLexer())) {s = 134;}

                        else if ( (LA1_37=='r') ) {s = 135;}

                        else if ( (synpred104_InternalSpecLexer()) ) {s = 101;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 50;}

                         
                        input.seek(index1_37);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA1_198 = input.LA(1);

                         
                        int index1_198 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA1_198>='\u0000' && LA1_198<='&')||(LA1_198>='(' && LA1_198<='\u00AA')||(LA1_198>='\u00AC' && LA1_198<='\uFFFF')) ) {s = 206;}

                        else if ( (LA1_198=='\'') && (synpred105_InternalSpecLexer())) {s = 207;}

                        else if ( (LA1_198=='\u00AB') && (synpred106_InternalSpecLexer())) {s = 191;}

                        else s = 192;

                         
                        input.seek(index1_198);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA1_195 = input.LA(1);

                         
                        int index1_195 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_195=='l') && (synpred88_InternalSpecLexer())) {s = 200;}

                        else s = 201;

                         
                        input.seek(index1_195);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA1_17 = input.LA(1);

                         
                        int index1_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_17=='=') && (synpred41_InternalSpecLexer())) {s = 85;}

                        else if ( (synpred17_InternalSpecLexer()) ) {s = 86;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 50;}

                         
                        input.seek(index1_17);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA1_196 = input.LA(1);

                         
                        int index1_196 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_196=='s') && (synpred83_InternalSpecLexer())) {s = 202;}

                        else s = 203;

                         
                        input.seek(index1_196);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA1_45 = input.LA(1);

                         
                        int index1_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_45=='\u00AB') ) {s = 147;}

                        else s = 139;

                         
                        input.seek(index1_45);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA1_25 = input.LA(1);

                         
                        int index1_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_25=='s') ) {s = 97;}

                        else if ( (LA1_25=='l') && (synpred52_InternalSpecLexer())) {s = 98;}

                        else if ( (LA1_25=='f') && (synpred66_InternalSpecLexer())) {s = 99;}

                        else if ( (LA1_25=='b') && (synpred92_InternalSpecLexer())) {s = 100;}

                        else if ( (synpred104_InternalSpecLexer()) ) {s = 101;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 50;}

                         
                        input.seek(index1_25);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA1_180 = input.LA(1);

                         
                        int index1_180 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_180=='\'') ) {s = 189;}

                        else if ( ((LA1_180>='\u0000' && LA1_180<='&')||(LA1_180>='(' && LA1_180<='\u00AA')||(LA1_180>='\u00AC' && LA1_180<='\uFFFF')) ) {s = 190;}

                        else if ( (LA1_180=='\u00AB') && (synpred106_InternalSpecLexer())) {s = 191;}

                        else s = 192;

                         
                        input.seek(index1_180);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA1_19 = input.LA(1);

                         
                        int index1_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSpecLexer()) ) {s = 90;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 50;}

                         
                        input.seek(index1_19);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA1_16 = input.LA(1);

                         
                        int index1_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_16=='=') ) {s = 82;}

                        else if ( (LA1_16=='>') && (synpred40_InternalSpecLexer())) {s = 83;}

                        else if ( (synpred16_InternalSpecLexer()) ) {s = 84;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 50;}

                         
                        input.seek(index1_16);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA1_42 = input.LA(1);

                         
                        int index1_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_42=='u') && (synpred104_InternalSpecLexer())) {s = 140;}

                        else s = 139;

                         
                        input.seek(index1_42);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA1_162 = input.LA(1);

                         
                        int index1_162 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_162=='a') && (synpred86_InternalSpecLexer())) {s = 183;}

                        else s = 184;

                         
                        input.seek(index1_162);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA1_18 = input.LA(1);

                         
                        int index1_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_18=='.') && (synpred42_InternalSpecLexer())) {s = 87;}

                        else if ( (LA1_18==':') && (synpred43_InternalSpecLexer())) {s = 88;}

                        else if ( (synpred18_InternalSpecLexer()) ) {s = 89;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 50;}

                         
                        input.seek(index1_18);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA1_20 = input.LA(1);

                         
                        int index1_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalSpecLexer()) ) {s = 91;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 50;}

                         
                        input.seek(index1_20);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA1_127 = input.LA(1);

                         
                        int index1_127 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_127=='a') && (synpred81_InternalSpecLexer())) {s = 176;}

                        else if ( (LA1_127=='r') && (synpred96_InternalSpecLexer())) {s = 177;}

                         
                        input.seek(index1_127);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA1_21 = input.LA(1);

                         
                        int index1_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalSpecLexer()) ) {s = 92;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 50;}

                         
                        input.seek(index1_21);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA1_118 = input.LA(1);

                         
                        int index1_118 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_118=='l') && (synpred58_InternalSpecLexer())) {s = 171;}

                        else if ( (LA1_118=='r') && (synpred59_InternalSpecLexer())) {s = 172;}

                         
                        input.seek(index1_118);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA1_115 = input.LA(1);

                         
                        int index1_115 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_115=='y') && (synpred57_InternalSpecLexer())) {s = 167;}

                        else if ( (LA1_115=='u') && (synpred65_InternalSpecLexer())) {s = 168;}

                        else if ( (LA1_115=='a') && (synpred100_InternalSpecLexer())) {s = 169;}

                         
                        input.seek(index1_115);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA1_39 = input.LA(1);

                         
                        int index1_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_39=='v') && (synpred95_InternalSpecLexer())) {s = 137;}

                        else if ( (synpred104_InternalSpecLexer()) ) {s = 101;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 50;}

                         
                        input.seek(index1_39);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA1_47 = input.LA(1);

                         
                        int index1_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred112_InternalSpecLexer()) ) {s = 150;}

                        else if ( (synpred113_InternalSpecLexer()) ) {s = 151;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 139;}

                         
                        input.seek(index1_47);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA1_22 = input.LA(1);

                         
                        int index1_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalSpecLexer()) ) {s = 93;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 50;}

                         
                        input.seek(index1_22);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA1_51 = input.LA(1);

                         
                        int index1_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_51=='=') && (synpred48_InternalSpecLexer())) {s = 153;}

                        else s = 154;

                         
                        input.seek(index1_51);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA1_1 = input.LA(1);

                         
                        int index1_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_1=='=') ) {s = 51;}

                        else if ( (synpred1_InternalSpecLexer()) ) {s = 52;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 50;}

                         
                        input.seek(index1_1);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA1_3 = input.LA(1);

                         
                        int index1_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_3=='=') && (synpred26_InternalSpecLexer())) {s = 54;}

                        else if ( (synpred3_InternalSpecLexer()) ) {s = 55;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 50;}

                         
                        input.seek(index1_3);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA1_34 = input.LA(1);

                         
                        int index1_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_34=='u') && (synpred71_InternalSpecLexer())) {s = 125;}

                        else if ( (LA1_34=='h') && (synpred80_InternalSpecLexer())) {s = 126;}

                        else if ( (LA1_34=='t') ) {s = 127;}

                        else if ( (LA1_34=='w') && (synpred82_InternalSpecLexer())) {s = 128;}

                        else if ( (LA1_34=='y') && (synpred102_InternalSpecLexer())) {s = 129;}

                        else if ( (synpred104_InternalSpecLexer()) ) {s = 101;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 50;}

                         
                        input.seek(index1_34);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA1_4 = input.LA(1);

                         
                        int index1_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_4=='&') && (synpred27_InternalSpecLexer())) {s = 56;}

                        else if ( (synpred4_InternalSpecLexer()) ) {s = 57;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 50;}

                         
                        input.seek(index1_4);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA1_185 = input.LA(1);

                         
                        int index1_185 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_185=='s') && (synpred68_InternalSpecLexer())) {s = 193;}

                        else s = 194;

                         
                        input.seek(index1_185);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA1_24 = input.LA(1);

                         
                        int index1_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalSpecLexer()) ) {s = 96;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 50;}

                         
                        input.seek(index1_24);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA1_120 = input.LA(1);

                         
                        int index1_120 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_120=='s') && (synpred60_InternalSpecLexer())) {s = 173;}

                        else if ( (LA1_120=='t') && (synpred67_InternalSpecLexer())) {s = 174;}

                         
                        input.seek(index1_120);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA1_2 = input.LA(1);

                         
                        int index1_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalSpecLexer()) ) {s = 53;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 50;}

                         
                        input.seek(index1_2);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA1_197 = input.LA(1);

                         
                        int index1_197 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_197=='d') && (synpred87_InternalSpecLexer())) {s = 204;}

                        else if ( (LA1_197=='s') && (synpred98_InternalSpecLexer())) {s = 205;}

                         
                        input.seek(index1_197);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA1_103 = input.LA(1);

                         
                        int index1_103 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_103=='f') ) {s = 162;}

                        else if ( (LA1_103=='s') && (synpred93_InternalSpecLexer())) {s = 163;}

                         
                        input.seek(index1_103);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA1_23 = input.LA(1);

                         
                        int index1_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_23=='|') && (synpred47_InternalSpecLexer())) {s = 94;}

                        else if ( (synpred23_InternalSpecLexer()) ) {s = 95;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 50;}

                         
                        input.seek(index1_23);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA1_7 = input.LA(1);

                         
                        int index1_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_7=='*') && (synpred28_InternalSpecLexer())) {s = 60;}

                        else if ( (LA1_7=='=') && (synpred29_InternalSpecLexer())) {s = 61;}

                        else if ( (synpred7_InternalSpecLexer()) ) {s = 62;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 50;}

                         
                        input.seek(index1_7);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA1_48 = input.LA(1);

                         
                        int index1_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred114_InternalSpecLexer()) ) {s = 142;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 139;}

                         
                        input.seek(index1_48);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA1_41 = input.LA(1);

                         
                        int index1_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_InternalSpecLexer()) ) {s = 138;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 139;}

                         
                        input.seek(index1_41);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA1_0 = input.LA(1);

                         
                        int index1_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_0=='!') ) {s = 1;}

                        else if ( (LA1_0=='#') ) {s = 2;}

                        else if ( (LA1_0=='%') ) {s = 3;}

                        else if ( (LA1_0=='&') ) {s = 4;}

                        else if ( (LA1_0=='(') ) {s = 5;}

                        else if ( (LA1_0==')') ) {s = 6;}

                        else if ( (LA1_0=='*') ) {s = 7;}

                        else if ( (LA1_0=='+') ) {s = 8;}

                        else if ( (LA1_0==',') ) {s = 9;}

                        else if ( (LA1_0=='-') ) {s = 10;}

                        else if ( (LA1_0=='.') ) {s = 11;}

                        else if ( (LA1_0=='/') ) {s = 12;}

                        else if ( (LA1_0==':') ) {s = 13;}

                        else if ( (LA1_0==';') ) {s = 14;}

                        else if ( (LA1_0=='<') ) {s = 15;}

                        else if ( (LA1_0=='=') ) {s = 16;}

                        else if ( (LA1_0=='>') ) {s = 17;}

                        else if ( (LA1_0=='?') ) {s = 18;}

                        else if ( (LA1_0=='@') ) {s = 19;}

                        else if ( (LA1_0=='[') ) {s = 20;}

                        else if ( (LA1_0==']') ) {s = 21;}

                        else if ( (LA1_0=='{') ) {s = 22;}

                        else if ( (LA1_0=='|') ) {s = 23;}

                        else if ( (LA1_0=='}') ) {s = 24;}

                        else if ( (LA1_0=='a') ) {s = 25;}

                        else if ( (LA1_0=='d') ) {s = 26;}

                        else if ( (LA1_0=='i') ) {s = 27;}

                        else if ( (LA1_0=='f') ) {s = 28;}

                        else if ( (LA1_0=='n') ) {s = 29;}

                        else if ( (LA1_0=='t') ) {s = 30;}

                        else if ( (LA1_0=='v') ) {s = 31;}

                        else if ( (LA1_0=='c') ) {s = 32;}

                        else if ( (LA1_0=='e') ) {s = 33;}

                        else if ( (LA1_0=='s') ) {s = 34;}

                        else if ( (LA1_0=='w') ) {s = 35;}

                        else if ( (LA1_0=='b') ) {s = 36;}

                        else if ( (LA1_0=='p') ) {s = 37;}

                        else if ( (LA1_0=='r') ) {s = 38;}

                        else if ( (LA1_0=='o') ) {s = 39;}

                        else if ( (LA1_0=='^') ) {s = 40;}

                        else if ( (LA1_0=='$'||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='g' && LA1_0<='h')||(LA1_0>='j' && LA1_0<='m')||LA1_0=='q'||LA1_0=='u'||(LA1_0>='x' && LA1_0<='z')||(LA1_0>='\u00A2' && LA1_0<='\u00A5')||LA1_0=='\u00AA'||LA1_0=='\u00B5'||LA1_0=='\u00BA'||(LA1_0>='\u00C0' && LA1_0<='\u00D6')||(LA1_0>='\u00D8' && LA1_0<='\u00F6')||(LA1_0>='\u00F8' && LA1_0<='\u0236')||(LA1_0>='\u0250' && LA1_0<='\u02C1')||(LA1_0>='\u02C6' && LA1_0<='\u02D1')||(LA1_0>='\u02E0' && LA1_0<='\u02E4')||LA1_0=='\u02EE'||LA1_0=='\u037A'||LA1_0=='\u0386'||(LA1_0>='\u0388' && LA1_0<='\u038A')||LA1_0=='\u038C'||(LA1_0>='\u038E' && LA1_0<='\u03A1')||(LA1_0>='\u03A3' && LA1_0<='\u03CE')||(LA1_0>='\u03D0' && LA1_0<='\u03F5')||(LA1_0>='\u03F7' && LA1_0<='\u03FB')||(LA1_0>='\u0400' && LA1_0<='\u0481')||(LA1_0>='\u048A' && LA1_0<='\u04CE')||(LA1_0>='\u04D0' && LA1_0<='\u04F5')||(LA1_0>='\u04F8' && LA1_0<='\u04F9')||(LA1_0>='\u0500' && LA1_0<='\u050F')||(LA1_0>='\u0531' && LA1_0<='\u0556')||LA1_0=='\u0559'||(LA1_0>='\u0561' && LA1_0<='\u0587')||(LA1_0>='\u05D0' && LA1_0<='\u05EA')||(LA1_0>='\u05F0' && LA1_0<='\u05F2')||(LA1_0>='\u0621' && LA1_0<='\u063A')||(LA1_0>='\u0640' && LA1_0<='\u064A')||(LA1_0>='\u066E' && LA1_0<='\u066F')||(LA1_0>='\u0671' && LA1_0<='\u06D3')||LA1_0=='\u06D5'||(LA1_0>='\u06E5' && LA1_0<='\u06E6')||(LA1_0>='\u06EE' && LA1_0<='\u06EF')||(LA1_0>='\u06FA' && LA1_0<='\u06FC')||LA1_0=='\u06FF'||LA1_0=='\u0710'||(LA1_0>='\u0712' && LA1_0<='\u072F')||(LA1_0>='\u074D' && LA1_0<='\u074F')||(LA1_0>='\u0780' && LA1_0<='\u07A5')||LA1_0=='\u07B1'||(LA1_0>='\u0904' && LA1_0<='\u0939')||LA1_0=='\u093D'||LA1_0=='\u0950'||(LA1_0>='\u0958' && LA1_0<='\u0961')||(LA1_0>='\u0985' && LA1_0<='\u098C')||(LA1_0>='\u098F' && LA1_0<='\u0990')||(LA1_0>='\u0993' && LA1_0<='\u09A8')||(LA1_0>='\u09AA' && LA1_0<='\u09B0')||LA1_0=='\u09B2'||(LA1_0>='\u09B6' && LA1_0<='\u09B9')||LA1_0=='\u09BD'||(LA1_0>='\u09DC' && LA1_0<='\u09DD')||(LA1_0>='\u09DF' && LA1_0<='\u09E1')||(LA1_0>='\u09F0' && LA1_0<='\u09F3')||(LA1_0>='\u0A05' && LA1_0<='\u0A0A')||(LA1_0>='\u0A0F' && LA1_0<='\u0A10')||(LA1_0>='\u0A13' && LA1_0<='\u0A28')||(LA1_0>='\u0A2A' && LA1_0<='\u0A30')||(LA1_0>='\u0A32' && LA1_0<='\u0A33')||(LA1_0>='\u0A35' && LA1_0<='\u0A36')||(LA1_0>='\u0A38' && LA1_0<='\u0A39')||(LA1_0>='\u0A59' && LA1_0<='\u0A5C')||LA1_0=='\u0A5E'||(LA1_0>='\u0A72' && LA1_0<='\u0A74')||(LA1_0>='\u0A85' && LA1_0<='\u0A8D')||(LA1_0>='\u0A8F' && LA1_0<='\u0A91')||(LA1_0>='\u0A93' && LA1_0<='\u0AA8')||(LA1_0>='\u0AAA' && LA1_0<='\u0AB0')||(LA1_0>='\u0AB2' && LA1_0<='\u0AB3')||(LA1_0>='\u0AB5' && LA1_0<='\u0AB9')||LA1_0=='\u0ABD'||LA1_0=='\u0AD0'||(LA1_0>='\u0AE0' && LA1_0<='\u0AE1')||LA1_0=='\u0AF1'||(LA1_0>='\u0B05' && LA1_0<='\u0B0C')||(LA1_0>='\u0B0F' && LA1_0<='\u0B10')||(LA1_0>='\u0B13' && LA1_0<='\u0B28')||(LA1_0>='\u0B2A' && LA1_0<='\u0B30')||(LA1_0>='\u0B32' && LA1_0<='\u0B33')||(LA1_0>='\u0B35' && LA1_0<='\u0B39')||LA1_0=='\u0B3D'||(LA1_0>='\u0B5C' && LA1_0<='\u0B5D')||(LA1_0>='\u0B5F' && LA1_0<='\u0B61')||LA1_0=='\u0B71'||LA1_0=='\u0B83'||(LA1_0>='\u0B85' && LA1_0<='\u0B8A')||(LA1_0>='\u0B8E' && LA1_0<='\u0B90')||(LA1_0>='\u0B92' && LA1_0<='\u0B95')||(LA1_0>='\u0B99' && LA1_0<='\u0B9A')||LA1_0=='\u0B9C'||(LA1_0>='\u0B9E' && LA1_0<='\u0B9F')||(LA1_0>='\u0BA3' && LA1_0<='\u0BA4')||(LA1_0>='\u0BA8' && LA1_0<='\u0BAA')||(LA1_0>='\u0BAE' && LA1_0<='\u0BB5')||(LA1_0>='\u0BB7' && LA1_0<='\u0BB9')||LA1_0=='\u0BF9'||(LA1_0>='\u0C05' && LA1_0<='\u0C0C')||(LA1_0>='\u0C0E' && LA1_0<='\u0C10')||(LA1_0>='\u0C12' && LA1_0<='\u0C28')||(LA1_0>='\u0C2A' && LA1_0<='\u0C33')||(LA1_0>='\u0C35' && LA1_0<='\u0C39')||(LA1_0>='\u0C60' && LA1_0<='\u0C61')||(LA1_0>='\u0C85' && LA1_0<='\u0C8C')||(LA1_0>='\u0C8E' && LA1_0<='\u0C90')||(LA1_0>='\u0C92' && LA1_0<='\u0CA8')||(LA1_0>='\u0CAA' && LA1_0<='\u0CB3')||(LA1_0>='\u0CB5' && LA1_0<='\u0CB9')||LA1_0=='\u0CBD'||LA1_0=='\u0CDE'||(LA1_0>='\u0CE0' && LA1_0<='\u0CE1')||(LA1_0>='\u0D05' && LA1_0<='\u0D0C')||(LA1_0>='\u0D0E' && LA1_0<='\u0D10')||(LA1_0>='\u0D12' && LA1_0<='\u0D28')||(LA1_0>='\u0D2A' && LA1_0<='\u0D39')||(LA1_0>='\u0D60' && LA1_0<='\u0D61')||(LA1_0>='\u0D85' && LA1_0<='\u0D96')||(LA1_0>='\u0D9A' && LA1_0<='\u0DB1')||(LA1_0>='\u0DB3' && LA1_0<='\u0DBB')||LA1_0=='\u0DBD'||(LA1_0>='\u0DC0' && LA1_0<='\u0DC6')||(LA1_0>='\u0E01' && LA1_0<='\u0E30')||(LA1_0>='\u0E32' && LA1_0<='\u0E33')||(LA1_0>='\u0E3F' && LA1_0<='\u0E46')||(LA1_0>='\u0E81' && LA1_0<='\u0E82')||LA1_0=='\u0E84'||(LA1_0>='\u0E87' && LA1_0<='\u0E88')||LA1_0=='\u0E8A'||LA1_0=='\u0E8D'||(LA1_0>='\u0E94' && LA1_0<='\u0E97')||(LA1_0>='\u0E99' && LA1_0<='\u0E9F')||(LA1_0>='\u0EA1' && LA1_0<='\u0EA3')||LA1_0=='\u0EA5'||LA1_0=='\u0EA7'||(LA1_0>='\u0EAA' && LA1_0<='\u0EAB')||(LA1_0>='\u0EAD' && LA1_0<='\u0EB0')||(LA1_0>='\u0EB2' && LA1_0<='\u0EB3')||LA1_0=='\u0EBD'||(LA1_0>='\u0EC0' && LA1_0<='\u0EC4')||LA1_0=='\u0EC6'||(LA1_0>='\u0EDC' && LA1_0<='\u0EDD')||LA1_0=='\u0F00'||(LA1_0>='\u0F40' && LA1_0<='\u0F47')||(LA1_0>='\u0F49' && LA1_0<='\u0F6A')||(LA1_0>='\u0F88' && LA1_0<='\u0F8B')||(LA1_0>='\u1000' && LA1_0<='\u1021')||(LA1_0>='\u1023' && LA1_0<='\u1027')||(LA1_0>='\u1029' && LA1_0<='\u102A')||(LA1_0>='\u1050' && LA1_0<='\u1055')||(LA1_0>='\u10A0' && LA1_0<='\u10C5')||(LA1_0>='\u10D0' && LA1_0<='\u10F8')||(LA1_0>='\u1100' && LA1_0<='\u1159')||(LA1_0>='\u115F' && LA1_0<='\u11A2')||(LA1_0>='\u11A8' && LA1_0<='\u11F9')||(LA1_0>='\u1200' && LA1_0<='\u1206')||(LA1_0>='\u1208' && LA1_0<='\u1246')||LA1_0=='\u1248'||(LA1_0>='\u124A' && LA1_0<='\u124D')||(LA1_0>='\u1250' && LA1_0<='\u1256')||LA1_0=='\u1258'||(LA1_0>='\u125A' && LA1_0<='\u125D')||(LA1_0>='\u1260' && LA1_0<='\u1286')||LA1_0=='\u1288'||(LA1_0>='\u128A' && LA1_0<='\u128D')||(LA1_0>='\u1290' && LA1_0<='\u12AE')||LA1_0=='\u12B0'||(LA1_0>='\u12B2' && LA1_0<='\u12B5')||(LA1_0>='\u12B8' && LA1_0<='\u12BE')||LA1_0=='\u12C0'||(LA1_0>='\u12C2' && LA1_0<='\u12C5')||(LA1_0>='\u12C8' && LA1_0<='\u12CE')||(LA1_0>='\u12D0' && LA1_0<='\u12D6')||(LA1_0>='\u12D8' && LA1_0<='\u12EE')||(LA1_0>='\u12F0' && LA1_0<='\u130E')||LA1_0=='\u1310'||(LA1_0>='\u1312' && LA1_0<='\u1315')||(LA1_0>='\u1318' && LA1_0<='\u131E')||(LA1_0>='\u1320' && LA1_0<='\u1346')||(LA1_0>='\u1348' && LA1_0<='\u135A')||(LA1_0>='\u13A0' && LA1_0<='\u13F4')||(LA1_0>='\u1401' && LA1_0<='\u166C')||(LA1_0>='\u166F' && LA1_0<='\u1676')||(LA1_0>='\u1681' && LA1_0<='\u169A')||(LA1_0>='\u16A0' && LA1_0<='\u16EA')||(LA1_0>='\u16EE' && LA1_0<='\u16F0')||(LA1_0>='\u1700' && LA1_0<='\u170C')||(LA1_0>='\u170E' && LA1_0<='\u1711')||(LA1_0>='\u1720' && LA1_0<='\u1731')||(LA1_0>='\u1740' && LA1_0<='\u1751')||(LA1_0>='\u1760' && LA1_0<='\u176C')||(LA1_0>='\u176E' && LA1_0<='\u1770')||(LA1_0>='\u1780' && LA1_0<='\u17B3')||LA1_0=='\u17D7'||(LA1_0>='\u17DB' && LA1_0<='\u17DC')||(LA1_0>='\u1820' && LA1_0<='\u1877')||(LA1_0>='\u1880' && LA1_0<='\u18A8')||(LA1_0>='\u1900' && LA1_0<='\u191C')||(LA1_0>='\u1950' && LA1_0<='\u196D')||(LA1_0>='\u1970' && LA1_0<='\u1974')||(LA1_0>='\u1D00' && LA1_0<='\u1D6B')||(LA1_0>='\u1E00' && LA1_0<='\u1E9B')||(LA1_0>='\u1EA0' && LA1_0<='\u1EF9')||(LA1_0>='\u1F00' && LA1_0<='\u1F15')||(LA1_0>='\u1F18' && LA1_0<='\u1F1D')||(LA1_0>='\u1F20' && LA1_0<='\u1F45')||(LA1_0>='\u1F48' && LA1_0<='\u1F4D')||(LA1_0>='\u1F50' && LA1_0<='\u1F57')||LA1_0=='\u1F59'||LA1_0=='\u1F5B'||LA1_0=='\u1F5D'||(LA1_0>='\u1F5F' && LA1_0<='\u1F7D')||(LA1_0>='\u1F80' && LA1_0<='\u1FB4')||(LA1_0>='\u1FB6' && LA1_0<='\u1FBC')||LA1_0=='\u1FBE'||(LA1_0>='\u1FC2' && LA1_0<='\u1FC4')||(LA1_0>='\u1FC6' && LA1_0<='\u1FCC')||(LA1_0>='\u1FD0' && LA1_0<='\u1FD3')||(LA1_0>='\u1FD6' && LA1_0<='\u1FDB')||(LA1_0>='\u1FE0' && LA1_0<='\u1FEC')||(LA1_0>='\u1FF2' && LA1_0<='\u1FF4')||(LA1_0>='\u1FF6' && LA1_0<='\u1FFC')||(LA1_0>='\u203F' && LA1_0<='\u2040')||LA1_0=='\u2054'||LA1_0=='\u2071'||LA1_0=='\u207F'||(LA1_0>='\u20A0' && LA1_0<='\u20B1')||LA1_0=='\u2102'||LA1_0=='\u2107'||(LA1_0>='\u210A' && LA1_0<='\u2113')||LA1_0=='\u2115'||(LA1_0>='\u2119' && LA1_0<='\u211D')||LA1_0=='\u2124'||LA1_0=='\u2126'||LA1_0=='\u2128'||(LA1_0>='\u212A' && LA1_0<='\u212D')||(LA1_0>='\u212F' && LA1_0<='\u2131')||(LA1_0>='\u2133' && LA1_0<='\u2139')||(LA1_0>='\u213D' && LA1_0<='\u213F')||(LA1_0>='\u2145' && LA1_0<='\u2149')||(LA1_0>='\u2160' && LA1_0<='\u2183')||(LA1_0>='\u3005' && LA1_0<='\u3007')||(LA1_0>='\u3021' && LA1_0<='\u3029')||(LA1_0>='\u3031' && LA1_0<='\u3035')||(LA1_0>='\u3038' && LA1_0<='\u303C')||(LA1_0>='\u3041' && LA1_0<='\u3096')||(LA1_0>='\u309D' && LA1_0<='\u309F')||(LA1_0>='\u30A1' && LA1_0<='\u30FF')||(LA1_0>='\u3105' && LA1_0<='\u312C')||(LA1_0>='\u3131' && LA1_0<='\u318E')||(LA1_0>='\u31A0' && LA1_0<='\u31B7')||(LA1_0>='\u31F0' && LA1_0<='\u31FF')||(LA1_0>='\u3400' && LA1_0<='\u4DB5')||(LA1_0>='\u4E00' && LA1_0<='\u9FA5')||(LA1_0>='\uA000' && LA1_0<='\uA48C')||(LA1_0>='\uAC00' && LA1_0<='\uD7A3')||(LA1_0>='\uF900' && LA1_0<='\uFA2D')||(LA1_0>='\uFA30' && LA1_0<='\uFA6A')||(LA1_0>='\uFB00' && LA1_0<='\uFB06')||(LA1_0>='\uFB13' && LA1_0<='\uFB17')||LA1_0=='\uFB1D'||(LA1_0>='\uFB1F' && LA1_0<='\uFB28')||(LA1_0>='\uFB2A' && LA1_0<='\uFB36')||(LA1_0>='\uFB38' && LA1_0<='\uFB3C')||LA1_0=='\uFB3E'||(LA1_0>='\uFB40' && LA1_0<='\uFB41')||(LA1_0>='\uFB43' && LA1_0<='\uFB44')||(LA1_0>='\uFB46' && LA1_0<='\uFBB1')||(LA1_0>='\uFBD3' && LA1_0<='\uFD3D')||(LA1_0>='\uFD50' && LA1_0<='\uFD8F')||(LA1_0>='\uFD92' && LA1_0<='\uFDC7')||(LA1_0>='\uFDF0' && LA1_0<='\uFDFC')||(LA1_0>='\uFE33' && LA1_0<='\uFE34')||(LA1_0>='\uFE4D' && LA1_0<='\uFE4F')||LA1_0=='\uFE69'||(LA1_0>='\uFE70' && LA1_0<='\uFE74')||(LA1_0>='\uFE76' && LA1_0<='\uFEFC')||LA1_0=='\uFF04'||(LA1_0>='\uFF21' && LA1_0<='\uFF3A')||LA1_0=='\uFF3F'||(LA1_0>='\uFF41' && LA1_0<='\uFF5A')||(LA1_0>='\uFF65' && LA1_0<='\uFFBE')||(LA1_0>='\uFFC2' && LA1_0<='\uFFC7')||(LA1_0>='\uFFCA' && LA1_0<='\uFFCF')||(LA1_0>='\uFFD2' && LA1_0<='\uFFD7')||(LA1_0>='\uFFDA' && LA1_0<='\uFFDC')||(LA1_0>='\uFFE0' && LA1_0<='\uFFE1')||(LA1_0>='\uFFE5' && LA1_0<='\uFFE6')) ) {s = 41;}

                        else if ( (LA1_0=='\\') ) {s = 42;}

                        else if ( (LA1_0=='\'') ) {s = 43;}

                        else if ( (LA1_0=='\u00BB') ) {s = 44;}

                        else if ( (LA1_0=='\u00AB') ) {s = 45;}

                        else if ( (LA1_0=='0') ) {s = 46;}

                        else if ( ((LA1_0>='1' && LA1_0<='9')) ) {s = 47;}

                        else if ( (LA1_0=='\"') ) {s = 48;}

                        else if ( ((LA1_0>='\t' && LA1_0<='\n')||LA1_0=='\r'||LA1_0==' ') ) {s = 49;}

                        else if ( ((LA1_0>='\u0000' && LA1_0<='\b')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\u001F')||LA1_0=='`'||(LA1_0>='~' && LA1_0<='\u00A1')||(LA1_0>='\u00A6' && LA1_0<='\u00A9')||(LA1_0>='\u00AC' && LA1_0<='\u00B4')||(LA1_0>='\u00B6' && LA1_0<='\u00B9')||(LA1_0>='\u00BC' && LA1_0<='\u00BF')||LA1_0=='\u00D7'||LA1_0=='\u00F7'||(LA1_0>='\u0237' && LA1_0<='\u024F')||(LA1_0>='\u02C2' && LA1_0<='\u02C5')||(LA1_0>='\u02D2' && LA1_0<='\u02DF')||(LA1_0>='\u02E5' && LA1_0<='\u02ED')||(LA1_0>='\u02EF' && LA1_0<='\u0379')||(LA1_0>='\u037B' && LA1_0<='\u0385')||LA1_0=='\u0387'||LA1_0=='\u038B'||LA1_0=='\u038D'||LA1_0=='\u03A2'||LA1_0=='\u03CF'||LA1_0=='\u03F6'||(LA1_0>='\u03FC' && LA1_0<='\u03FF')||(LA1_0>='\u0482' && LA1_0<='\u0489')||LA1_0=='\u04CF'||(LA1_0>='\u04F6' && LA1_0<='\u04F7')||(LA1_0>='\u04FA' && LA1_0<='\u04FF')||(LA1_0>='\u0510' && LA1_0<='\u0530')||(LA1_0>='\u0557' && LA1_0<='\u0558')||(LA1_0>='\u055A' && LA1_0<='\u0560')||(LA1_0>='\u0588' && LA1_0<='\u05CF')||(LA1_0>='\u05EB' && LA1_0<='\u05EF')||(LA1_0>='\u05F3' && LA1_0<='\u0620')||(LA1_0>='\u063B' && LA1_0<='\u063F')||(LA1_0>='\u064B' && LA1_0<='\u066D')||LA1_0=='\u0670'||LA1_0=='\u06D4'||(LA1_0>='\u06D6' && LA1_0<='\u06E4')||(LA1_0>='\u06E7' && LA1_0<='\u06ED')||(LA1_0>='\u06F0' && LA1_0<='\u06F9')||(LA1_0>='\u06FD' && LA1_0<='\u06FE')||(LA1_0>='\u0700' && LA1_0<='\u070F')||LA1_0=='\u0711'||(LA1_0>='\u0730' && LA1_0<='\u074C')||(LA1_0>='\u0750' && LA1_0<='\u077F')||(LA1_0>='\u07A6' && LA1_0<='\u07B0')||(LA1_0>='\u07B2' && LA1_0<='\u0903')||(LA1_0>='\u093A' && LA1_0<='\u093C')||(LA1_0>='\u093E' && LA1_0<='\u094F')||(LA1_0>='\u0951' && LA1_0<='\u0957')||(LA1_0>='\u0962' && LA1_0<='\u0984')||(LA1_0>='\u098D' && LA1_0<='\u098E')||(LA1_0>='\u0991' && LA1_0<='\u0992')||LA1_0=='\u09A9'||LA1_0=='\u09B1'||(LA1_0>='\u09B3' && LA1_0<='\u09B5')||(LA1_0>='\u09BA' && LA1_0<='\u09BC')||(LA1_0>='\u09BE' && LA1_0<='\u09DB')||LA1_0=='\u09DE'||(LA1_0>='\u09E2' && LA1_0<='\u09EF')||(LA1_0>='\u09F4' && LA1_0<='\u0A04')||(LA1_0>='\u0A0B' && LA1_0<='\u0A0E')||(LA1_0>='\u0A11' && LA1_0<='\u0A12')||LA1_0=='\u0A29'||LA1_0=='\u0A31'||LA1_0=='\u0A34'||LA1_0=='\u0A37'||(LA1_0>='\u0A3A' && LA1_0<='\u0A58')||LA1_0=='\u0A5D'||(LA1_0>='\u0A5F' && LA1_0<='\u0A71')||(LA1_0>='\u0A75' && LA1_0<='\u0A84')||LA1_0=='\u0A8E'||LA1_0=='\u0A92'||LA1_0=='\u0AA9'||LA1_0=='\u0AB1'||LA1_0=='\u0AB4'||(LA1_0>='\u0ABA' && LA1_0<='\u0ABC')||(LA1_0>='\u0ABE' && LA1_0<='\u0ACF')||(LA1_0>='\u0AD1' && LA1_0<='\u0ADF')||(LA1_0>='\u0AE2' && LA1_0<='\u0AF0')||(LA1_0>='\u0AF2' && LA1_0<='\u0B04')||(LA1_0>='\u0B0D' && LA1_0<='\u0B0E')||(LA1_0>='\u0B11' && LA1_0<='\u0B12')||LA1_0=='\u0B29'||LA1_0=='\u0B31'||LA1_0=='\u0B34'||(LA1_0>='\u0B3A' && LA1_0<='\u0B3C')||(LA1_0>='\u0B3E' && LA1_0<='\u0B5B')||LA1_0=='\u0B5E'||(LA1_0>='\u0B62' && LA1_0<='\u0B70')||(LA1_0>='\u0B72' && LA1_0<='\u0B82')||LA1_0=='\u0B84'||(LA1_0>='\u0B8B' && LA1_0<='\u0B8D')||LA1_0=='\u0B91'||(LA1_0>='\u0B96' && LA1_0<='\u0B98')||LA1_0=='\u0B9B'||LA1_0=='\u0B9D'||(LA1_0>='\u0BA0' && LA1_0<='\u0BA2')||(LA1_0>='\u0BA5' && LA1_0<='\u0BA7')||(LA1_0>='\u0BAB' && LA1_0<='\u0BAD')||LA1_0=='\u0BB6'||(LA1_0>='\u0BBA' && LA1_0<='\u0BF8')||(LA1_0>='\u0BFA' && LA1_0<='\u0C04')||LA1_0=='\u0C0D'||LA1_0=='\u0C11'||LA1_0=='\u0C29'||LA1_0=='\u0C34'||(LA1_0>='\u0C3A' && LA1_0<='\u0C5F')||(LA1_0>='\u0C62' && LA1_0<='\u0C84')||LA1_0=='\u0C8D'||LA1_0=='\u0C91'||LA1_0=='\u0CA9'||LA1_0=='\u0CB4'||(LA1_0>='\u0CBA' && LA1_0<='\u0CBC')||(LA1_0>='\u0CBE' && LA1_0<='\u0CDD')||LA1_0=='\u0CDF'||(LA1_0>='\u0CE2' && LA1_0<='\u0D04')||LA1_0=='\u0D0D'||LA1_0=='\u0D11'||LA1_0=='\u0D29'||(LA1_0>='\u0D3A' && LA1_0<='\u0D5F')||(LA1_0>='\u0D62' && LA1_0<='\u0D84')||(LA1_0>='\u0D97' && LA1_0<='\u0D99')||LA1_0=='\u0DB2'||LA1_0=='\u0DBC'||(LA1_0>='\u0DBE' && LA1_0<='\u0DBF')||(LA1_0>='\u0DC7' && LA1_0<='\u0E00')||LA1_0=='\u0E31'||(LA1_0>='\u0E34' && LA1_0<='\u0E3E')||(LA1_0>='\u0E47' && LA1_0<='\u0E80')||LA1_0=='\u0E83'||(LA1_0>='\u0E85' && LA1_0<='\u0E86')||LA1_0=='\u0E89'||(LA1_0>='\u0E8B' && LA1_0<='\u0E8C')||(LA1_0>='\u0E8E' && LA1_0<='\u0E93')||LA1_0=='\u0E98'||LA1_0=='\u0EA0'||LA1_0=='\u0EA4'||LA1_0=='\u0EA6'||(LA1_0>='\u0EA8' && LA1_0<='\u0EA9')||LA1_0=='\u0EAC'||LA1_0=='\u0EB1'||(LA1_0>='\u0EB4' && LA1_0<='\u0EBC')||(LA1_0>='\u0EBE' && LA1_0<='\u0EBF')||LA1_0=='\u0EC5'||(LA1_0>='\u0EC7' && LA1_0<='\u0EDB')||(LA1_0>='\u0EDE' && LA1_0<='\u0EFF')||(LA1_0>='\u0F01' && LA1_0<='\u0F3F')||LA1_0=='\u0F48'||(LA1_0>='\u0F6B' && LA1_0<='\u0F87')||(LA1_0>='\u0F8C' && LA1_0<='\u0FFF')||LA1_0=='\u1022'||LA1_0=='\u1028'||(LA1_0>='\u102B' && LA1_0<='\u104F')||(LA1_0>='\u1056' && LA1_0<='\u109F')||(LA1_0>='\u10C6' && LA1_0<='\u10CF')||(LA1_0>='\u10F9' && LA1_0<='\u10FF')||(LA1_0>='\u115A' && LA1_0<='\u115E')||(LA1_0>='\u11A3' && LA1_0<='\u11A7')||(LA1_0>='\u11FA' && LA1_0<='\u11FF')||LA1_0=='\u1207'||LA1_0=='\u1247'||LA1_0=='\u1249'||(LA1_0>='\u124E' && LA1_0<='\u124F')||LA1_0=='\u1257'||LA1_0=='\u1259'||(LA1_0>='\u125E' && LA1_0<='\u125F')||LA1_0=='\u1287'||LA1_0=='\u1289'||(LA1_0>='\u128E' && LA1_0<='\u128F')||LA1_0=='\u12AF'||LA1_0=='\u12B1'||(LA1_0>='\u12B6' && LA1_0<='\u12B7')||LA1_0=='\u12BF'||LA1_0=='\u12C1'||(LA1_0>='\u12C6' && LA1_0<='\u12C7')||LA1_0=='\u12CF'||LA1_0=='\u12D7'||LA1_0=='\u12EF'||LA1_0=='\u130F'||LA1_0=='\u1311'||(LA1_0>='\u1316' && LA1_0<='\u1317')||LA1_0=='\u131F'||LA1_0=='\u1347'||(LA1_0>='\u135B' && LA1_0<='\u139F')||(LA1_0>='\u13F5' && LA1_0<='\u1400')||(LA1_0>='\u166D' && LA1_0<='\u166E')||(LA1_0>='\u1677' && LA1_0<='\u1680')||(LA1_0>='\u169B' && LA1_0<='\u169F')||(LA1_0>='\u16EB' && LA1_0<='\u16ED')||(LA1_0>='\u16F1' && LA1_0<='\u16FF')||LA1_0=='\u170D'||(LA1_0>='\u1712' && LA1_0<='\u171F')||(LA1_0>='\u1732' && LA1_0<='\u173F')||(LA1_0>='\u1752' && LA1_0<='\u175F')||LA1_0=='\u176D'||(LA1_0>='\u1771' && LA1_0<='\u177F')||(LA1_0>='\u17B4' && LA1_0<='\u17D6')||(LA1_0>='\u17D8' && LA1_0<='\u17DA')||(LA1_0>='\u17DD' && LA1_0<='\u181F')||(LA1_0>='\u1878' && LA1_0<='\u187F')||(LA1_0>='\u18A9' && LA1_0<='\u18FF')||(LA1_0>='\u191D' && LA1_0<='\u194F')||(LA1_0>='\u196E' && LA1_0<='\u196F')||(LA1_0>='\u1975' && LA1_0<='\u1CFF')||(LA1_0>='\u1D6C' && LA1_0<='\u1DFF')||(LA1_0>='\u1E9C' && LA1_0<='\u1E9F')||(LA1_0>='\u1EFA' && LA1_0<='\u1EFF')||(LA1_0>='\u1F16' && LA1_0<='\u1F17')||(LA1_0>='\u1F1E' && LA1_0<='\u1F1F')||(LA1_0>='\u1F46' && LA1_0<='\u1F47')||(LA1_0>='\u1F4E' && LA1_0<='\u1F4F')||LA1_0=='\u1F58'||LA1_0=='\u1F5A'||LA1_0=='\u1F5C'||LA1_0=='\u1F5E'||(LA1_0>='\u1F7E' && LA1_0<='\u1F7F')||LA1_0=='\u1FB5'||LA1_0=='\u1FBD'||(LA1_0>='\u1FBF' && LA1_0<='\u1FC1')||LA1_0=='\u1FC5'||(LA1_0>='\u1FCD' && LA1_0<='\u1FCF')||(LA1_0>='\u1FD4' && LA1_0<='\u1FD5')||(LA1_0>='\u1FDC' && LA1_0<='\u1FDF')||(LA1_0>='\u1FED' && LA1_0<='\u1FF1')||LA1_0=='\u1FF5'||(LA1_0>='\u1FFD' && LA1_0<='\u203E')||(LA1_0>='\u2041' && LA1_0<='\u2053')||(LA1_0>='\u2055' && LA1_0<='\u2070')||(LA1_0>='\u2072' && LA1_0<='\u207E')||(LA1_0>='\u2080' && LA1_0<='\u209F')||(LA1_0>='\u20B2' && LA1_0<='\u2101')||(LA1_0>='\u2103' && LA1_0<='\u2106')||(LA1_0>='\u2108' && LA1_0<='\u2109')||LA1_0=='\u2114'||(LA1_0>='\u2116' && LA1_0<='\u2118')||(LA1_0>='\u211E' && LA1_0<='\u2123')||LA1_0=='\u2125'||LA1_0=='\u2127'||LA1_0=='\u2129'||LA1_0=='\u212E'||LA1_0=='\u2132'||(LA1_0>='\u213A' && LA1_0<='\u213C')||(LA1_0>='\u2140' && LA1_0<='\u2144')||(LA1_0>='\u214A' && LA1_0<='\u215F')||(LA1_0>='\u2184' && LA1_0<='\u3004')||(LA1_0>='\u3008' && LA1_0<='\u3020')||(LA1_0>='\u302A' && LA1_0<='\u3030')||(LA1_0>='\u3036' && LA1_0<='\u3037')||(LA1_0>='\u303D' && LA1_0<='\u3040')||(LA1_0>='\u3097' && LA1_0<='\u309C')||LA1_0=='\u30A0'||(LA1_0>='\u3100' && LA1_0<='\u3104')||(LA1_0>='\u312D' && LA1_0<='\u3130')||(LA1_0>='\u318F' && LA1_0<='\u319F')||(LA1_0>='\u31B8' && LA1_0<='\u31EF')||(LA1_0>='\u3200' && LA1_0<='\u33FF')||(LA1_0>='\u4DB6' && LA1_0<='\u4DFF')||(LA1_0>='\u9FA6' && LA1_0<='\u9FFF')||(LA1_0>='\uA48D' && LA1_0<='\uABFF')||(LA1_0>='\uD7A4' && LA1_0<='\uF8FF')||(LA1_0>='\uFA2E' && LA1_0<='\uFA2F')||(LA1_0>='\uFA6B' && LA1_0<='\uFAFF')||(LA1_0>='\uFB07' && LA1_0<='\uFB12')||(LA1_0>='\uFB18' && LA1_0<='\uFB1C')||LA1_0=='\uFB1E'||LA1_0=='\uFB29'||LA1_0=='\uFB37'||LA1_0=='\uFB3D'||LA1_0=='\uFB3F'||LA1_0=='\uFB42'||LA1_0=='\uFB45'||(LA1_0>='\uFBB2' && LA1_0<='\uFBD2')||(LA1_0>='\uFD3E' && LA1_0<='\uFD4F')||(LA1_0>='\uFD90' && LA1_0<='\uFD91')||(LA1_0>='\uFDC8' && LA1_0<='\uFDEF')||(LA1_0>='\uFDFD' && LA1_0<='\uFE32')||(LA1_0>='\uFE35' && LA1_0<='\uFE4C')||(LA1_0>='\uFE50' && LA1_0<='\uFE68')||(LA1_0>='\uFE6A' && LA1_0<='\uFE6F')||LA1_0=='\uFE75'||(LA1_0>='\uFEFD' && LA1_0<='\uFF03')||(LA1_0>='\uFF05' && LA1_0<='\uFF20')||(LA1_0>='\uFF3B' && LA1_0<='\uFF3E')||LA1_0=='\uFF40'||(LA1_0>='\uFF5B' && LA1_0<='\uFF64')||(LA1_0>='\uFFBF' && LA1_0<='\uFFC1')||(LA1_0>='\uFFC8' && LA1_0<='\uFFC9')||(LA1_0>='\uFFD0' && LA1_0<='\uFFD1')||(LA1_0>='\uFFD8' && LA1_0<='\uFFD9')||(LA1_0>='\uFFDD' && LA1_0<='\uFFDF')||(LA1_0>='\uFFE2' && LA1_0<='\uFFE4')||(LA1_0>='\uFFE7' && LA1_0<='\uFFFF')) && (synpred117_InternalSpecLexer())) {s = 50;}

                         
                        input.seek(index1_0);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA1_206 = input.LA(1);

                         
                        int index1_206 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_206=='\'') ) {s = 189;}

                        else if ( (LA1_206=='\u00AB') && (synpred106_InternalSpecLexer())) {s = 191;}

                        else if ( ((LA1_206>='\u0000' && LA1_206<='&')||(LA1_206>='(' && LA1_206<='\u00AA')||(LA1_206>='\u00AC' && LA1_206<='\uFFFF')) ) {s = 190;}

                        else s = 192;

                         
                        input.seek(index1_206);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA1_135 = input.LA(1);

                         
                        int index1_135 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_135=='i') && (synpred91_InternalSpecLexer())) {s = 178;}

                        else if ( (LA1_135=='o') && (synpred99_InternalSpecLexer())) {s = 179;}

                         
                        input.seek(index1_135);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA1_199 = input.LA(1);

                         
                        int index1_199 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_199=='\'') ) {s = 189;}

                        else if ( ((LA1_199>='\u0000' && LA1_199<='&')||(LA1_199>='(' && LA1_199<='\u00AA')||(LA1_199>='\u00AC' && LA1_199<='\uFFFF')) ) {s = 190;}

                        else if ( (LA1_199=='\u00AB') && (synpred106_InternalSpecLexer())) {s = 191;}

                        else s = 192;

                         
                        input.seek(index1_199);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA1_30 = input.LA(1);

                         
                        int index1_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_30=='r') ) {s = 115;}

                        else if ( (LA1_30=='h') ) {s = 116;}

                        else if ( (LA1_30=='y') && (synpred84_InternalSpecLexer())) {s = 117;}

                        else if ( (synpred104_InternalSpecLexer()) ) {s = 101;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 50;}

                         
                        input.seek(index1_30);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA1_8 = input.LA(1);

                         
                        int index1_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_8=='+') && (synpred30_InternalSpecLexer())) {s = 63;}

                        else if ( (LA1_8=='=') && (synpred31_InternalSpecLexer())) {s = 64;}

                        else if ( (synpred8_InternalSpecLexer()) ) {s = 65;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 50;}

                         
                        input.seek(index1_8);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA1_44 = input.LA(1);

                         
                        int index1_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_44=='\'') && (synpred108_InternalSpecLexer())) {s = 143;}

                        else if ( ((LA1_44>='\u0000' && LA1_44<='&')||(LA1_44>='(' && LA1_44<='\u00AA')||(LA1_44>='\u00AC' && LA1_44<='\uFFFF')) && (synpred108_InternalSpecLexer())) {s = 144;}

                        else if ( (LA1_44=='\u00AB') && (synpred108_InternalSpecLexer())) {s = 145;}

                        else if ( (synpred107_InternalSpecLexer()) ) {s = 146;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 139;}

                         
                        input.seek(index1_44);
                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA1_33 = input.LA(1);

                         
                        int index1_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_33=='a') && (synpred61_InternalSpecLexer())) {s = 122;}

                        else if ( (LA1_33=='l') && (synpred62_InternalSpecLexer())) {s = 123;}

                        else if ( (LA1_33=='x') ) {s = 124;}

                        else if ( (synpred104_InternalSpecLexer()) ) {s = 101;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 50;}

                         
                        input.seek(index1_33);
                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA1_190 = input.LA(1);

                         
                        int index1_190 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_190=='\'') ) {s = 189;}

                        else if ( (LA1_190=='\u00AB') && (synpred106_InternalSpecLexer())) {s = 191;}

                        else if ( ((LA1_190>='\u0000' && LA1_190<='&')||(LA1_190>='(' && LA1_190<='\u00AA')||(LA1_190>='\u00AC' && LA1_190<='\uFFFF')) ) {s = 190;}

                        else s = 192;

                         
                        input.seek(index1_190);
                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA1_5 = input.LA(1);

                         
                        int index1_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSpecLexer()) ) {s = 58;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 50;}

                         
                        input.seek(index1_5);
                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA1_97 = input.LA(1);

                         
                        int index1_97 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_97=='s') && (synpred74_InternalSpecLexer())) {s = 160;}

                        else s = 161;

                         
                        input.seek(index1_97);
                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA1_147 = input.LA(1);

                         
                        int index1_147 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_InternalSpecLexer()) ) {s = 181;}

                        else if ( (synpred110_InternalSpecLexer()) ) {s = 182;}

                         
                        input.seek(index1_147);
                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA1_6 = input.LA(1);

                         
                        int index1_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalSpecLexer()) ) {s = 59;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 50;}

                         
                        input.seek(index1_6);
                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA1_29 = input.LA(1);

                         
                        int index1_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_29=='e') && (synpred55_InternalSpecLexer())) {s = 111;}

                        else if ( (LA1_29=='o') && (synpred56_InternalSpecLexer())) {s = 112;}

                        else if ( (LA1_29=='u') && (synpred64_InternalSpecLexer())) {s = 113;}

                        else if ( (LA1_29=='a') && (synpred77_InternalSpecLexer())) {s = 114;}

                        else if ( (synpred104_InternalSpecLexer()) ) {s = 101;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 50;}

                         
                        input.seek(index1_29);
                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA1_10 = input.LA(1);

                         
                        int index1_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_10=='-') && (synpred32_InternalSpecLexer())) {s = 67;}

                        else if ( (LA1_10=='=') && (synpred33_InternalSpecLexer())) {s = 68;}

                        else if ( (LA1_10=='>') && (synpred34_InternalSpecLexer())) {s = 69;}

                        else if ( (synpred10_InternalSpecLexer()) ) {s = 70;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 50;}

                         
                        input.seek(index1_10);
                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA1_32 = input.LA(1);

                         
                        int index1_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_32=='a') ) {s = 120;}

                        else if ( (LA1_32=='o') && (synpred85_InternalSpecLexer())) {s = 121;}

                        else if ( (synpred104_InternalSpecLexer()) ) {s = 101;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 50;}

                         
                        input.seek(index1_32);
                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA1_28 = input.LA(1);

                         
                        int index1_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_28=='o') && (synpred54_InternalSpecLexer())) {s = 108;}

                        else if ( (LA1_28=='a') ) {s = 109;}

                        else if ( (LA1_28=='i') ) {s = 110;}

                        else if ( (synpred104_InternalSpecLexer()) ) {s = 101;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 50;}

                         
                        input.seek(index1_28);
                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA1_9 = input.LA(1);

                         
                        int index1_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalSpecLexer()) ) {s = 66;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 50;}

                         
                        input.seek(index1_9);
                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA1_31 = input.LA(1);

                         
                        int index1_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_31=='a') ) {s = 118;}

                        else if ( (LA1_31=='o') && (synpred97_InternalSpecLexer())) {s = 119;}

                        else if ( (synpred104_InternalSpecLexer()) ) {s = 101;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 50;}

                         
                        input.seek(index1_31);
                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA1_43 = input.LA(1);

                         
                        int index1_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_43=='\'') ) {s = 141;}

                        else if ( (synpred114_InternalSpecLexer()) ) {s = 142;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 139;}

                         
                        input.seek(index1_43);
                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA1_49 = input.LA(1);

                         
                        int index1_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred116_InternalSpecLexer()) ) {s = 152;}

                        else if ( (synpred117_InternalSpecLexer()) ) {s = 139;}

                         
                        input.seek(index1_49);
                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA1_109 = input.LA(1);

                         
                        int index1_109 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_109=='c') ) {s = 164;}

                        else if ( (LA1_109=='l') && (synpred69_InternalSpecLexer())) {s = 165;}

                         
                        input.seek(index1_109);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 1, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}