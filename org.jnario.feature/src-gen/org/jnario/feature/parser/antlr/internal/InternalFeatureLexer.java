package org.jnario.feature.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFeatureLexer extends Lexer {
    public static final int RULE_COMMENT_RICH_TEXT_INBETWEEN=17;
    public static final int RULE_ID=12;
    public static final int RULE_ANY_OTHER=32;
    public static final int RULE_COMMENT_RICH_TEXT_END=19;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int RULE_HEX=20;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int RULE_SCENARIO_TEXT=7;
    public static final int RULE_RICH_TEXT_END=18;
    public static final int RULE_BACKGROUND_TEXT=6;
    public static final int RULE_MNL=23;
    public static final int RULE_DECIMAL=22;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_TEXT=5;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int RULE_IN_RICH_STRING=28;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=29;
    public static final int RULE_STRING=13;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STEP_WITH_ARGS=25;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int RULE_RICH_TEXT_START=15;
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
    public static final int RULE_RICH_TEXT=14;
    public static final int T__63=63;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int RULE_THEN_TEXT=10;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__120=120;
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
    public static final int RULE_WHEN_TEXT=9;
    public static final int RULE_GIVEN_TEXT=8;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__59=59;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int RULE_INT=21;
    public static final int T__113=113;
    public static final int T__112=112;
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
    public static final int RULE_NL=27;
    public static final int RULE_SPACES=26;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=30;
    public static final int RULE_COLON=24;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_RICH_TEXT_INBETWEEN=16;
    public static final int RULE_WS=31;
    public static final int RULE_AND_TEXT=11;
    public static final int RULE_FEATURE_TEXT=4;

    // delegates
    // delegators

    public InternalFeatureLexer() {;} 
    public InternalFeatureLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalFeatureLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g"; }

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:11:7: ( 'package' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:11:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:12:7: ( 'import' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:12:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:13:7: ( 'static' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:13:9: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:14:7: ( 'extension' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:14:9: 'extension'
            {
            match("extension"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:15:7: ( '.' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:15:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:16:7: ( '*' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:16:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:17:7: ( ';' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:17:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:18:7: ( '@' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:18:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:19:7: ( '(' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:19:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:20:7: ( ',' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:20:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:21:7: ( ')' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:21:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:22:7: ( 'val' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:22:9: 'val'
            {
            match("val"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:23:7: ( 'var' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:23:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:24:7: ( '=' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:24:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:25:7: ( 'should' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:25:9: 'should'
            {
            match("should"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:26:7: ( 'throw' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:26:9: 'throw'
            {
            match("throw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:27:7: ( 'throws' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:27:9: 'throws'
            {
            match("throws"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:28:7: ( 'instanceof' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:28:9: 'instanceof'
            {
            match("instanceof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:29:7: ( 'not' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:29:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:30:7: ( 'assert' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:30:9: 'assert'
            {
            match("assert"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:31:7: ( 'public' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:31:9: 'public'
            {
            match("public"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:32:7: ( 'abstract' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:32:9: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:33:7: ( 'class' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:33:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:34:7: ( '<' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:34:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:35:7: ( '>' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:35:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:36:7: ( 'extends' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:36:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:37:7: ( 'implements' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:37:9: 'implements'
            {
            match("implements"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:38:7: ( '{' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:38:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:39:7: ( '}' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:39:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:40:7: ( 'create' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:40:9: 'create'
            {
            match("create"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:41:7: ( 'FOR' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:41:9: 'FOR'
            {
            match("FOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:42:7: ( ':' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:42:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:43:7: ( 'BEFORE' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:43:9: 'BEFORE'
            {
            match("BEFORE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:44:7: ( 'SEPARATOR' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:44:9: 'SEPARATOR'
            {
            match("SEPARATOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:45:7: ( 'AFTER' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:45:9: 'AFTER'
            {
            match("AFTER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:46:7: ( 'ENDFOR' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:46:9: 'ENDFOR'
            {
            match("ENDFOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:47:7: ( 'IF' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:47:9: 'IF'
            {
            match("IF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:48:7: ( 'ELSE' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:48:9: 'ELSE'
            {
            match("ELSE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:49:7: ( 'ENDIF' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:49:9: 'ENDIF'
            {
            match("ENDIF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:50:7: ( 'ELSEIF' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:50:9: 'ELSEIF'
            {
            match("ELSEIF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:51:7: ( '+' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:51:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:52:7: ( '+=' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:52:9: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:53:7: ( '||' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:53:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:54:7: ( '&&' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:54:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:55:7: ( '==' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:55:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:56:7: ( '!=' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:56:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:57:7: ( '>=' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:57:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:58:7: ( '<=' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:58:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:59:7: ( '->' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:59:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:60:7: ( '..' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:60:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:61:7: ( '=>' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:61:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:62:7: ( '<>' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:62:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:63:7: ( '?:' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:63:9: '?:'
            {
            match("?:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:64:7: ( '<=>' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:64:9: '<=>'
            {
            match("<=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:65:7: ( '-' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:65:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:66:7: ( '**' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:66:9: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:67:7: ( '/' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:67:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:68:7: ( '%' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:68:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:69:7: ( '!' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:69:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:70:7: ( 'as' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:70:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:71:7: ( '?.' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:71:9: '?.'
            {
            match("?."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:72:7: ( '*.' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:72:9: '*.'
            {
            match("*."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:73:7: ( '[' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:73:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:74:7: ( '|' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:74:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:75:7: ( ']' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:75:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:76:7: ( 'if' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:76:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:77:7: ( 'else' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:77:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:78:8: ( 'switch' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:78:10: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:79:8: ( 'default' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:79:10: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:80:8: ( 'case' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:80:10: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:81:8: ( 'for' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:81:10: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:82:8: ( 'while' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:82:10: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:83:8: ( 'do' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:83:10: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:84:8: ( 'super' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:84:10: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:85:8: ( '::' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:85:10: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:86:8: ( 'new' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:86:10: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:87:8: ( 'false' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:87:10: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:88:8: ( 'true' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:88:10: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:89:8: ( 'null' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:89:10: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:90:8: ( 'typeof' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:90:10: 'typeof'
            {
            match("typeof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:91:8: ( 'return' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:91:10: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:92:8: ( 'try' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:92:10: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:93:8: ( 'finally' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:93:10: 'finally'
            {
            match("finally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:94:8: ( 'catch' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:94:10: 'catch'
            {
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:95:8: ( '?' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:95:10: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:96:8: ( '&' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:96:10: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:97:8: ( 'protected' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:97:10: 'protected'
            {
            match("protected"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:98:8: ( 'private' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:98:10: 'private'
            {
            match("private"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "RULE_BACKGROUND_TEXT"
    public final void mRULE_BACKGROUND_TEXT() throws RecognitionException {
        try {
            int _type = RULE_BACKGROUND_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8307:22: ( 'Background:' RULE_MNL )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8307:24: 'Background:' RULE_MNL
            {
            match("Background:"); 

            mRULE_MNL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BACKGROUND_TEXT"

    // $ANTLR start "RULE_SCENARIO_TEXT"
    public final void mRULE_SCENARIO_TEXT() throws RecognitionException {
        try {
            int _type = RULE_SCENARIO_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8309:20: ( 'Scenario:' RULE_MNL )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8309:22: 'Scenario:' RULE_MNL
            {
            match("Scenario:"); 

            mRULE_MNL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SCENARIO_TEXT"

    // $ANTLR start "RULE_FEATURE_TEXT"
    public final void mRULE_FEATURE_TEXT() throws RecognitionException {
        try {
            int _type = RULE_FEATURE_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8311:19: ( 'Feature' RULE_COLON ( options {greedy=false; } : . )* ( RULE_BACKGROUND_TEXT | RULE_SCENARIO_TEXT ) )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8311:21: 'Feature' RULE_COLON ( options {greedy=false; } : . )* ( RULE_BACKGROUND_TEXT | RULE_SCENARIO_TEXT )
            {
            match("Feature"); 

            mRULE_COLON(); 
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8311:42: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8311:70: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8311:74: ( RULE_BACKGROUND_TEXT | RULE_SCENARIO_TEXT )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='B') ) {
                alt2=1;
            }
            else if ( (LA2_0=='S') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8311:75: RULE_BACKGROUND_TEXT
                    {
                    mRULE_BACKGROUND_TEXT(); 

                    }
                    break;
                case 2 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8311:96: RULE_SCENARIO_TEXT
                    {
                    mRULE_SCENARIO_TEXT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FEATURE_TEXT"

    // $ANTLR start "RULE_GIVEN_TEXT"
    public final void mRULE_GIVEN_TEXT() throws RecognitionException {
        try {
            int _type = RULE_GIVEN_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8313:17: ( 'Given ' RULE_STEP_WITH_ARGS )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8313:19: 'Given ' RULE_STEP_WITH_ARGS
            {
            match("Given "); 

            mRULE_STEP_WITH_ARGS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GIVEN_TEXT"

    // $ANTLR start "RULE_WHEN_TEXT"
    public final void mRULE_WHEN_TEXT() throws RecognitionException {
        try {
            int _type = RULE_WHEN_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8315:16: ( 'When ' RULE_STEP_WITH_ARGS )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8315:18: 'When ' RULE_STEP_WITH_ARGS
            {
            match("When "); 

            mRULE_STEP_WITH_ARGS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WHEN_TEXT"

    // $ANTLR start "RULE_THEN_TEXT"
    public final void mRULE_THEN_TEXT() throws RecognitionException {
        try {
            int _type = RULE_THEN_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8317:16: ( 'Then ' RULE_STEP_WITH_ARGS )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8317:18: 'Then ' RULE_STEP_WITH_ARGS
            {
            match("Then "); 

            mRULE_STEP_WITH_ARGS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_THEN_TEXT"

    // $ANTLR start "RULE_AND_TEXT"
    public final void mRULE_AND_TEXT() throws RecognitionException {
        try {
            int _type = RULE_AND_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8319:15: ( 'And ' RULE_STEP_WITH_ARGS )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8319:17: 'And ' RULE_STEP_WITH_ARGS
            {
            match("And "); 

            mRULE_STEP_WITH_ARGS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AND_TEXT"

    // $ANTLR start "RULE_TEXT"
    public final void mRULE_TEXT() throws RecognitionException {
        try {
            int _type = RULE_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8321:11: ( ( '____dummy____' )+ )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8321:13: ( '____dummy____' )+
            {
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8321:13: ( '____dummy____' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='_') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8321:13: '____dummy____'
            	    {
            	    match("____dummy____"); 


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TEXT"

    // $ANTLR start "RULE_STEP_WITH_ARGS"
    public final void mRULE_STEP_WITH_ARGS() throws RecognitionException {
        try {
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8323:30: ( (~ ( ( '\\r' | '\\n' ) ) )* ( '\\r' )? '\\n' RULE_SPACES ( RULE_RICH_TEXT )? )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8323:32: (~ ( ( '\\r' | '\\n' ) ) )* ( '\\r' )? '\\n' RULE_SPACES ( RULE_RICH_TEXT )?
            {
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8323:32: (~ ( ( '\\r' | '\\n' ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8323:32: ~ ( ( '\\r' | '\\n' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8323:48: ( '\\r' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\r') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8323:48: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            mRULE_SPACES(); 
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8323:71: ( RULE_RICH_TEXT )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\'') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8323:71: RULE_RICH_TEXT
                    {
                    mRULE_RICH_TEXT(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_STEP_WITH_ARGS"

    // $ANTLR start "RULE_MNL"
    public final void mRULE_MNL() throws RecognitionException {
        try {
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8325:19: ( (~ ( ( '\\r' | '\\n' ) ) )* RULE_NL )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8325:21: (~ ( ( '\\r' | '\\n' ) ) )* RULE_NL
            {
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8325:21: (~ ( ( '\\r' | '\\n' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8325:21: ~ ( ( '\\r' | '\\n' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            mRULE_NL(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_MNL"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8327:21: ( RULE_SPACES ':' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8327:23: RULE_SPACES ':'
            {
            mRULE_SPACES(); 
            match(':'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON"

    // $ANTLR start "RULE_NL"
    public final void mRULE_NL() throws RecognitionException {
        try {
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8329:18: ( ( '\\r' )? ( '\\n' )? )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8329:20: ( '\\r' )? ( '\\n' )?
            {
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8329:20: ( '\\r' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8329:20: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8329:26: ( '\\n' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\n') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8329:26: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NL"

    // $ANTLR start "RULE_SPACES"
    public final void mRULE_SPACES() throws RecognitionException {
        try {
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8331:22: ( ( ' ' | '\\t' )* )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8331:24: ( ' ' | '\\t' )*
            {
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8331:24: ( ' ' | '\\t' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\t'||LA10_0==' ') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_SPACES"

    // $ANTLR start "RULE_RICH_TEXT"
    public final void mRULE_RICH_TEXT() throws RecognitionException {
        try {
            int _type = RULE_RICH_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8333:16: ( '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8333:18: '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            {
            match("'''"); 

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8333:27: ( RULE_IN_RICH_STRING )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='\'') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='\'') ) {
                        int LA11_4 = input.LA(3);

                        if ( ((LA11_4>='\u0000' && LA11_4<='&')||(LA11_4>='(' && LA11_4<='\u00AA')||(LA11_4>='\u00AC' && LA11_4<='\uFFFF')) ) {
                            alt11=1;
                        }


                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='&')||(LA11_1>='(' && LA11_1<='\u00AA')||(LA11_1>='\u00AC' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='\u00AA')||(LA11_0>='\u00AC' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8333:27: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8333:48: ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\'') ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1=='\'') ) {
                    int LA14_3 = input.LA(3);

                    if ( (LA14_3=='\'') ) {
                        alt14=1;
                    }
                    else {
                        alt14=2;}
                }
                else {
                    alt14=2;}
            }
            else {
                alt14=2;}
            switch (alt14) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8333:49: '\\'\\'\\''
                    {
                    match("'''"); 


                    }
                    break;
                case 2 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8333:58: ( '\\'' ( '\\'' )? )? EOF
                    {
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8333:58: ( '\\'' ( '\\'' )? )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\'') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8333:59: '\\'' ( '\\'' )?
                            {
                            match('\''); 
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8333:64: ( '\\'' )?
                            int alt12=2;
                            int LA12_0 = input.LA(1);

                            if ( (LA12_0=='\'') ) {
                                alt12=1;
                            }
                            switch (alt12) {
                                case 1 :
                                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8333:64: '\\''
                                    {
                                    match('\''); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match(EOF); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RICH_TEXT"

    // $ANTLR start "RULE_RICH_TEXT_START"
    public final void mRULE_RICH_TEXT_START() throws RecognitionException {
        try {
            int _type = RULE_RICH_TEXT_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8335:22: ( '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8335:24: '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB'
            {
            match("'''"); 

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8335:33: ( RULE_IN_RICH_STRING )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='\'') ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1=='\'') ) {
                        int LA15_4 = input.LA(3);

                        if ( ((LA15_4>='\u0000' && LA15_4<='&')||(LA15_4>='(' && LA15_4<='\u00AA')||(LA15_4>='\u00AC' && LA15_4<='\uFFFF')) ) {
                            alt15=1;
                        }


                    }
                    else if ( ((LA15_1>='\u0000' && LA15_1<='&')||(LA15_1>='(' && LA15_1<='\u00AA')||(LA15_1>='\u00AC' && LA15_1<='\uFFFF')) ) {
                        alt15=1;
                    }


                }
                else if ( ((LA15_0>='\u0000' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='\u00AA')||(LA15_0>='\u00AC' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8335:33: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8335:54: ( '\\'' ( '\\'' )? )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\'') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8335:55: '\\'' ( '\\'' )?
                    {
                    match('\''); 
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8335:60: ( '\\'' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='\'') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8335:60: '\\''
                            {
                            match('\''); 

                            }
                            break;

                    }


                    }
                    break;

            }

            match('\u00AB'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RICH_TEXT_START"

    // $ANTLR start "RULE_RICH_TEXT_END"
    public final void mRULE_RICH_TEXT_END() throws RecognitionException {
        try {
            int _type = RULE_RICH_TEXT_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8337:20: ( '\\u00BB' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8337:22: '\\u00BB' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            {
            match('\u00BB'); 
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8337:31: ( RULE_IN_RICH_STRING )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='\'') ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1=='\'') ) {
                        int LA18_4 = input.LA(3);

                        if ( ((LA18_4>='\u0000' && LA18_4<='&')||(LA18_4>='(' && LA18_4<='\u00AA')||(LA18_4>='\u00AC' && LA18_4<='\uFFFF')) ) {
                            alt18=1;
                        }


                    }
                    else if ( ((LA18_1>='\u0000' && LA18_1<='&')||(LA18_1>='(' && LA18_1<='\u00AA')||(LA18_1>='\u00AC' && LA18_1<='\uFFFF')) ) {
                        alt18=1;
                    }


                }
                else if ( ((LA18_0>='\u0000' && LA18_0<='&')||(LA18_0>='(' && LA18_0<='\u00AA')||(LA18_0>='\u00AC' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8337:31: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8337:52: ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\'') ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1=='\'') ) {
                    int LA21_3 = input.LA(3);

                    if ( (LA21_3=='\'') ) {
                        alt21=1;
                    }
                    else {
                        alt21=2;}
                }
                else {
                    alt21=2;}
            }
            else {
                alt21=2;}
            switch (alt21) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8337:53: '\\'\\'\\''
                    {
                    match("'''"); 


                    }
                    break;
                case 2 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8337:62: ( '\\'' ( '\\'' )? )? EOF
                    {
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8337:62: ( '\\'' ( '\\'' )? )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='\'') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8337:63: '\\'' ( '\\'' )?
                            {
                            match('\''); 
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8337:68: ( '\\'' )?
                            int alt19=2;
                            int LA19_0 = input.LA(1);

                            if ( (LA19_0=='\'') ) {
                                alt19=1;
                            }
                            switch (alt19) {
                                case 1 :
                                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8337:68: '\\''
                                    {
                                    match('\''); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match(EOF); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RICH_TEXT_END"

    // $ANTLR start "RULE_RICH_TEXT_INBETWEEN"
    public final void mRULE_RICH_TEXT_INBETWEEN() throws RecognitionException {
        try {
            int _type = RULE_RICH_TEXT_INBETWEEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8339:26: ( '\\u00BB' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8339:28: '\\u00BB' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB'
            {
            match('\u00BB'); 
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8339:37: ( RULE_IN_RICH_STRING )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0=='\'') ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1=='\'') ) {
                        int LA22_4 = input.LA(3);

                        if ( ((LA22_4>='\u0000' && LA22_4<='&')||(LA22_4>='(' && LA22_4<='\u00AA')||(LA22_4>='\u00AC' && LA22_4<='\uFFFF')) ) {
                            alt22=1;
                        }


                    }
                    else if ( ((LA22_1>='\u0000' && LA22_1<='&')||(LA22_1>='(' && LA22_1<='\u00AA')||(LA22_1>='\u00AC' && LA22_1<='\uFFFF')) ) {
                        alt22=1;
                    }


                }
                else if ( ((LA22_0>='\u0000' && LA22_0<='&')||(LA22_0>='(' && LA22_0<='\u00AA')||(LA22_0>='\u00AC' && LA22_0<='\uFFFF')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8339:37: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8339:58: ( '\\'' ( '\\'' )? )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='\'') ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8339:59: '\\'' ( '\\'' )?
                    {
                    match('\''); 
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8339:64: ( '\\'' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0=='\'') ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8339:64: '\\''
                            {
                            match('\''); 

                            }
                            break;

                    }


                    }
                    break;

            }

            match('\u00AB'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RICH_TEXT_INBETWEEN"

    // $ANTLR start "RULE_COMMENT_RICH_TEXT_INBETWEEN"
    public final void mRULE_COMMENT_RICH_TEXT_INBETWEEN() throws RecognitionException {
        try {
            int _type = RULE_COMMENT_RICH_TEXT_INBETWEEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8341:34: ( '\\u00AB\\u00AB' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )? )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8341:36: '\\u00AB\\u00AB' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )?
            {
            match("\u00AB\u00AB"); 

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8341:51: (~ ( ( '\\n' | '\\r' ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>='\u0000' && LA25_0<='\t')||(LA25_0>='\u000B' && LA25_0<='\f')||(LA25_0>='\u000E' && LA25_0<='\uFFFF')) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8341:51: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8341:67: ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='\n'||LA30_0=='\r') ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8341:68: ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB'
                    {
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8341:68: ( '\\r' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0=='\r') ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8341:68: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8341:79: ( RULE_IN_RICH_STRING )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0=='\'') ) {
                            int LA27_1 = input.LA(2);

                            if ( (LA27_1=='\'') ) {
                                int LA27_4 = input.LA(3);

                                if ( ((LA27_4>='\u0000' && LA27_4<='&')||(LA27_4>='(' && LA27_4<='\u00AA')||(LA27_4>='\u00AC' && LA27_4<='\uFFFF')) ) {
                                    alt27=1;
                                }


                            }
                            else if ( ((LA27_1>='\u0000' && LA27_1<='&')||(LA27_1>='(' && LA27_1<='\u00AA')||(LA27_1>='\u00AC' && LA27_1<='\uFFFF')) ) {
                                alt27=1;
                            }


                        }
                        else if ( ((LA27_0>='\u0000' && LA27_0<='&')||(LA27_0>='(' && LA27_0<='\u00AA')||(LA27_0>='\u00AC' && LA27_0<='\uFFFF')) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8341:79: RULE_IN_RICH_STRING
                    	    {
                    	    mRULE_IN_RICH_STRING(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8341:100: ( '\\'' ( '\\'' )? )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0=='\'') ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8341:101: '\\'' ( '\\'' )?
                            {
                            match('\''); 
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8341:106: ( '\\'' )?
                            int alt28=2;
                            int LA28_0 = input.LA(1);

                            if ( (LA28_0=='\'') ) {
                                alt28=1;
                            }
                            switch (alt28) {
                                case 1 :
                                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8341:106: '\\''
                                    {
                                    match('\''); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match('\u00AB'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMENT_RICH_TEXT_INBETWEEN"

    // $ANTLR start "RULE_COMMENT_RICH_TEXT_END"
    public final void mRULE_COMMENT_RICH_TEXT_END() throws RecognitionException {
        try {
            int _type = RULE_COMMENT_RICH_TEXT_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8343:28: ( '\\u00AB\\u00AB' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) | EOF ) )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8343:30: '\\u00AB\\u00AB' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) | EOF )
            {
            match("\u00AB\u00AB"); 

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8343:45: (~ ( ( '\\n' | '\\r' ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>='\u0000' && LA31_0<='\t')||(LA31_0>='\u000B' && LA31_0<='\f')||(LA31_0>='\u000E' && LA31_0<='\uFFFF')) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8343:45: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8343:61: ( ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) | EOF )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0=='\n'||LA37_0=='\r') ) {
                alt37=1;
            }
            else {
                alt37=2;}
            switch (alt37) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8343:62: ( '\\r' )? '\\n' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
                    {
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8343:62: ( '\\r' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0=='\r') ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8343:62: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8343:73: ( RULE_IN_RICH_STRING )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0=='\'') ) {
                            int LA33_1 = input.LA(2);

                            if ( (LA33_1=='\'') ) {
                                int LA33_4 = input.LA(3);

                                if ( ((LA33_4>='\u0000' && LA33_4<='&')||(LA33_4>='(' && LA33_4<='\u00AA')||(LA33_4>='\u00AC' && LA33_4<='\uFFFF')) ) {
                                    alt33=1;
                                }


                            }
                            else if ( ((LA33_1>='\u0000' && LA33_1<='&')||(LA33_1>='(' && LA33_1<='\u00AA')||(LA33_1>='\u00AC' && LA33_1<='\uFFFF')) ) {
                                alt33=1;
                            }


                        }
                        else if ( ((LA33_0>='\u0000' && LA33_0<='&')||(LA33_0>='(' && LA33_0<='\u00AA')||(LA33_0>='\u00AC' && LA33_0<='\uFFFF')) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8343:73: RULE_IN_RICH_STRING
                    	    {
                    	    mRULE_IN_RICH_STRING(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8343:94: ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0=='\'') ) {
                        int LA36_1 = input.LA(2);

                        if ( (LA36_1=='\'') ) {
                            int LA36_3 = input.LA(3);

                            if ( (LA36_3=='\'') ) {
                                alt36=1;
                            }
                            else {
                                alt36=2;}
                        }
                        else {
                            alt36=2;}
                    }
                    else {
                        alt36=2;}
                    switch (alt36) {
                        case 1 :
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8343:95: '\\'\\'\\''
                            {
                            match("'''"); 


                            }
                            break;
                        case 2 :
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8343:104: ( '\\'' ( '\\'' )? )? EOF
                            {
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8343:104: ( '\\'' ( '\\'' )? )?
                            int alt35=2;
                            int LA35_0 = input.LA(1);

                            if ( (LA35_0=='\'') ) {
                                alt35=1;
                            }
                            switch (alt35) {
                                case 1 :
                                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8343:105: '\\'' ( '\\'' )?
                                    {
                                    match('\''); 
                                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8343:110: ( '\\'' )?
                                    int alt34=2;
                                    int LA34_0 = input.LA(1);

                                    if ( (LA34_0=='\'') ) {
                                        alt34=1;
                                    }
                                    switch (alt34) {
                                        case 1 :
                                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8343:110: '\\''
                                            {
                                            match('\''); 

                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }

                            match(EOF); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8343:123: EOF
                    {
                    match(EOF); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMENT_RICH_TEXT_END"

    // $ANTLR start "RULE_IN_RICH_STRING"
    public final void mRULE_IN_RICH_STRING() throws RecognitionException {
        try {
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8345:30: ( ( '\\'\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | '\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | ~ ( ( '\\u00AB' | '\\'' ) ) ) )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8345:32: ( '\\'\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | '\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | ~ ( ( '\\u00AB' | '\\'' ) ) )
            {
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8345:32: ( '\\'\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | '\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | ~ ( ( '\\u00AB' | '\\'' ) ) )
            int alt38=3;
            int LA38_0 = input.LA(1);

            if ( (LA38_0=='\'') ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1=='\'') ) {
                    alt38=1;
                }
                else if ( ((LA38_1>='\u0000' && LA38_1<='&')||(LA38_1>='(' && LA38_1<='\u00AA')||(LA38_1>='\u00AC' && LA38_1<='\uFFFF')) ) {
                    alt38=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA38_0>='\u0000' && LA38_0<='&')||(LA38_0>='(' && LA38_0<='\u00AA')||(LA38_0>='\u00AC' && LA38_0<='\uFFFF')) ) {
                alt38=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8345:33: '\\'\\'' ~ ( ( '\\u00AB' | '\\'' ) )
                    {
                    match("''"); 

                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\u00AA')||(input.LA(1)>='\u00AC' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8345:59: '\\'' ~ ( ( '\\u00AB' | '\\'' ) )
                    {
                    match('\''); 
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\u00AA')||(input.LA(1)>='\u00AC' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 3 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8345:83: ~ ( ( '\\u00AB' | '\\'' ) )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\u00AA')||(input.LA(1)>='\u00AC' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_IN_RICH_STRING"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8347:10: ( ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )? )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8347:12: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            {
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8347:12: ( '0x' | '0X' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0=='0') ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1=='x') ) {
                    alt39=1;
                }
                else if ( (LA39_1=='X') ) {
                    alt39=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8347:13: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8347:18: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8347:24: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>='0' && LA40_0<='9')||(LA40_0>='A' && LA40_0<='F')||LA40_0=='_'||(LA40_0>='a' && LA40_0<='f')) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt40 >= 1 ) break loop40;
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
            } while (true);

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8347:58: ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0=='#') ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8347:59: '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    {
                    match('#'); 
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8347:63: ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0=='B'||LA41_0=='b') ) {
                        alt41=1;
                    }
                    else if ( (LA41_0=='L'||LA41_0=='l') ) {
                        alt41=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 0, input);

                        throw nvae;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8347:64: ( 'b' | 'B' ) ( 'i' | 'I' )
                            {
                            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;
                        case 2 :
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8347:84: ( 'l' | 'L' )
                            {
                            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                                input.consume();

                            }
                            else {
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8349:10: ( '0' .. '9' ( '0' .. '9' | '_' )* )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8349:12: '0' .. '9' ( '0' .. '9' | '_' )*
            {
            matchRange('0','9'); 
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8349:21: ( '0' .. '9' | '_' )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>='0' && LA43_0<='9')||LA43_0=='_') ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='_' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8351:14: ( RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )? )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8351:16: RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            {
            mRULE_INT(); 
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8351:25: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0=='E'||LA45_0=='e') ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8351:26: ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8351:36: ( '+' | '-' )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0=='+'||LA44_0=='-') ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_INT(); 

                    }
                    break;

            }

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8351:58: ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            int alt46=3;
            int LA46_0 = input.LA(1);

            if ( (LA46_0=='B'||LA46_0=='b') ) {
                alt46=1;
            }
            else if ( (LA46_0=='D'||LA46_0=='F'||LA46_0=='L'||LA46_0=='d'||LA46_0=='f'||LA46_0=='l') ) {
                alt46=2;
            }
            switch (alt46) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8351:59: ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' )
                    {
                    if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='I'||input.LA(1)=='d'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8351:87: ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' )
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='L'||input.LA(1)=='d'||input.LA(1)=='f'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8353:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )* )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8353:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            {
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8353:11: ( '^' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0=='^') ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8353:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8353:44: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0=='$'||(LA48_0>='0' && LA48_0<='9')||(LA48_0>='A' && LA48_0<='Z')||LA48_0=='_'||(LA48_0>='a' && LA48_0<='z')) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8355:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8355:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8355:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0=='\"') ) {
                alt51=1;
            }
            else if ( (LA51_0=='\'') ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8355:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8355:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop49:
                    do {
                        int alt49=3;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0=='\\') ) {
                            alt49=1;
                        }
                        else if ( ((LA49_0>='\u0000' && LA49_0<='!')||(LA49_0>='#' && LA49_0<='[')||(LA49_0>=']' && LA49_0<='\uFFFF')) ) {
                            alt49=2;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8355:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8355:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8355:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8355:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop50:
                    do {
                        int alt50=3;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0=='\\') ) {
                            alt50=1;
                        }
                        else if ( ((LA50_0>='\u0000' && LA50_0<='&')||(LA50_0>='(' && LA50_0<='[')||(LA50_0>=']' && LA50_0<='\uFFFF')) ) {
                            alt50=2;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8355:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8355:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8357:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8357:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8357:24: ( options {greedy=false; } : . )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0=='*') ) {
                    int LA52_1 = input.LA(2);

                    if ( (LA52_1=='/') ) {
                        alt52=2;
                    }
                    else if ( ((LA52_1>='\u0000' && LA52_1<='.')||(LA52_1>='0' && LA52_1<='\uFFFF')) ) {
                        alt52=1;
                    }


                }
                else if ( ((LA52_0>='\u0000' && LA52_0<=')')||(LA52_0>='+' && LA52_0<='\uFFFF')) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8357:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8359:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8359:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8359:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>='\u0000' && LA53_0<='\t')||(LA53_0>='\u000B' && LA53_0<='\f')||(LA53_0>='\u000E' && LA53_0<='\uFFFF')) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8359:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8359:40: ( ( '\\r' )? '\\n' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0=='\n'||LA55_0=='\r') ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8359:41: ( '\\r' )? '\\n'
                    {
                    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8359:41: ( '\\r' )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0=='\r') ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8359:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8361:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8361:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8361:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt56=0;
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>='\t' && LA56_0<='\n')||LA56_0=='\r'||LA56_0==' ') ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt56 >= 1 ) break loop56;
                        EarlyExitException eee =
                            new EarlyExitException(56, input);
                        throw eee;
                }
                cnt56++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8363:16: ( . )
            // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:8363:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:8: ( T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | RULE_BACKGROUND_TEXT | RULE_SCENARIO_TEXT | RULE_FEATURE_TEXT | RULE_GIVEN_TEXT | RULE_WHEN_TEXT | RULE_THEN_TEXT | RULE_AND_TEXT | RULE_TEXT | RULE_RICH_TEXT | RULE_RICH_TEXT_START | RULE_RICH_TEXT_END | RULE_RICH_TEXT_INBETWEEN | RULE_COMMENT_RICH_TEXT_INBETWEEN | RULE_COMMENT_RICH_TEXT_END | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt57=111;
        alt57 = dfa57.predict(input);
        switch (alt57) {
            case 1 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:10: T__33
                {
                mT__33(); 

                }
                break;
            case 2 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:16: T__34
                {
                mT__34(); 

                }
                break;
            case 3 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:22: T__35
                {
                mT__35(); 

                }
                break;
            case 4 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:28: T__36
                {
                mT__36(); 

                }
                break;
            case 5 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:34: T__37
                {
                mT__37(); 

                }
                break;
            case 6 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:40: T__38
                {
                mT__38(); 

                }
                break;
            case 7 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:46: T__39
                {
                mT__39(); 

                }
                break;
            case 8 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:52: T__40
                {
                mT__40(); 

                }
                break;
            case 9 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:58: T__41
                {
                mT__41(); 

                }
                break;
            case 10 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:64: T__42
                {
                mT__42(); 

                }
                break;
            case 11 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:70: T__43
                {
                mT__43(); 

                }
                break;
            case 12 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:76: T__44
                {
                mT__44(); 

                }
                break;
            case 13 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:82: T__45
                {
                mT__45(); 

                }
                break;
            case 14 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:88: T__46
                {
                mT__46(); 

                }
                break;
            case 15 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:94: T__47
                {
                mT__47(); 

                }
                break;
            case 16 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:100: T__48
                {
                mT__48(); 

                }
                break;
            case 17 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:106: T__49
                {
                mT__49(); 

                }
                break;
            case 18 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:112: T__50
                {
                mT__50(); 

                }
                break;
            case 19 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:118: T__51
                {
                mT__51(); 

                }
                break;
            case 20 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:124: T__52
                {
                mT__52(); 

                }
                break;
            case 21 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:130: T__53
                {
                mT__53(); 

                }
                break;
            case 22 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:136: T__54
                {
                mT__54(); 

                }
                break;
            case 23 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:142: T__55
                {
                mT__55(); 

                }
                break;
            case 24 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:148: T__56
                {
                mT__56(); 

                }
                break;
            case 25 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:154: T__57
                {
                mT__57(); 

                }
                break;
            case 26 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:160: T__58
                {
                mT__58(); 

                }
                break;
            case 27 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:166: T__59
                {
                mT__59(); 

                }
                break;
            case 28 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:172: T__60
                {
                mT__60(); 

                }
                break;
            case 29 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:178: T__61
                {
                mT__61(); 

                }
                break;
            case 30 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:184: T__62
                {
                mT__62(); 

                }
                break;
            case 31 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:190: T__63
                {
                mT__63(); 

                }
                break;
            case 32 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:196: T__64
                {
                mT__64(); 

                }
                break;
            case 33 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:202: T__65
                {
                mT__65(); 

                }
                break;
            case 34 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:208: T__66
                {
                mT__66(); 

                }
                break;
            case 35 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:214: T__67
                {
                mT__67(); 

                }
                break;
            case 36 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:220: T__68
                {
                mT__68(); 

                }
                break;
            case 37 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:226: T__69
                {
                mT__69(); 

                }
                break;
            case 38 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:232: T__70
                {
                mT__70(); 

                }
                break;
            case 39 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:238: T__71
                {
                mT__71(); 

                }
                break;
            case 40 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:244: T__72
                {
                mT__72(); 

                }
                break;
            case 41 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:250: T__73
                {
                mT__73(); 

                }
                break;
            case 42 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:256: T__74
                {
                mT__74(); 

                }
                break;
            case 43 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:262: T__75
                {
                mT__75(); 

                }
                break;
            case 44 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:268: T__76
                {
                mT__76(); 

                }
                break;
            case 45 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:274: T__77
                {
                mT__77(); 

                }
                break;
            case 46 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:280: T__78
                {
                mT__78(); 

                }
                break;
            case 47 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:286: T__79
                {
                mT__79(); 

                }
                break;
            case 48 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:292: T__80
                {
                mT__80(); 

                }
                break;
            case 49 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:298: T__81
                {
                mT__81(); 

                }
                break;
            case 50 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:304: T__82
                {
                mT__82(); 

                }
                break;
            case 51 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:310: T__83
                {
                mT__83(); 

                }
                break;
            case 52 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:316: T__84
                {
                mT__84(); 

                }
                break;
            case 53 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:322: T__85
                {
                mT__85(); 

                }
                break;
            case 54 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:328: T__86
                {
                mT__86(); 

                }
                break;
            case 55 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:334: T__87
                {
                mT__87(); 

                }
                break;
            case 56 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:340: T__88
                {
                mT__88(); 

                }
                break;
            case 57 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:346: T__89
                {
                mT__89(); 

                }
                break;
            case 58 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:352: T__90
                {
                mT__90(); 

                }
                break;
            case 59 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:358: T__91
                {
                mT__91(); 

                }
                break;
            case 60 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:364: T__92
                {
                mT__92(); 

                }
                break;
            case 61 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:370: T__93
                {
                mT__93(); 

                }
                break;
            case 62 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:376: T__94
                {
                mT__94(); 

                }
                break;
            case 63 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:382: T__95
                {
                mT__95(); 

                }
                break;
            case 64 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:388: T__96
                {
                mT__96(); 

                }
                break;
            case 65 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:394: T__97
                {
                mT__97(); 

                }
                break;
            case 66 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:400: T__98
                {
                mT__98(); 

                }
                break;
            case 67 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:406: T__99
                {
                mT__99(); 

                }
                break;
            case 68 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:412: T__100
                {
                mT__100(); 

                }
                break;
            case 69 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:419: T__101
                {
                mT__101(); 

                }
                break;
            case 70 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:426: T__102
                {
                mT__102(); 

                }
                break;
            case 71 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:433: T__103
                {
                mT__103(); 

                }
                break;
            case 72 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:440: T__104
                {
                mT__104(); 

                }
                break;
            case 73 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:447: T__105
                {
                mT__105(); 

                }
                break;
            case 74 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:454: T__106
                {
                mT__106(); 

                }
                break;
            case 75 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:461: T__107
                {
                mT__107(); 

                }
                break;
            case 76 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:468: T__108
                {
                mT__108(); 

                }
                break;
            case 77 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:475: T__109
                {
                mT__109(); 

                }
                break;
            case 78 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:482: T__110
                {
                mT__110(); 

                }
                break;
            case 79 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:489: T__111
                {
                mT__111(); 

                }
                break;
            case 80 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:496: T__112
                {
                mT__112(); 

                }
                break;
            case 81 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:503: T__113
                {
                mT__113(); 

                }
                break;
            case 82 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:510: T__114
                {
                mT__114(); 

                }
                break;
            case 83 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:517: T__115
                {
                mT__115(); 

                }
                break;
            case 84 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:524: T__116
                {
                mT__116(); 

                }
                break;
            case 85 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:531: T__117
                {
                mT__117(); 

                }
                break;
            case 86 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:538: T__118
                {
                mT__118(); 

                }
                break;
            case 87 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:545: T__119
                {
                mT__119(); 

                }
                break;
            case 88 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:552: T__120
                {
                mT__120(); 

                }
                break;
            case 89 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:559: RULE_BACKGROUND_TEXT
                {
                mRULE_BACKGROUND_TEXT(); 

                }
                break;
            case 90 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:580: RULE_SCENARIO_TEXT
                {
                mRULE_SCENARIO_TEXT(); 

                }
                break;
            case 91 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:599: RULE_FEATURE_TEXT
                {
                mRULE_FEATURE_TEXT(); 

                }
                break;
            case 92 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:617: RULE_GIVEN_TEXT
                {
                mRULE_GIVEN_TEXT(); 

                }
                break;
            case 93 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:633: RULE_WHEN_TEXT
                {
                mRULE_WHEN_TEXT(); 

                }
                break;
            case 94 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:648: RULE_THEN_TEXT
                {
                mRULE_THEN_TEXT(); 

                }
                break;
            case 95 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:663: RULE_AND_TEXT
                {
                mRULE_AND_TEXT(); 

                }
                break;
            case 96 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:677: RULE_TEXT
                {
                mRULE_TEXT(); 

                }
                break;
            case 97 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:687: RULE_RICH_TEXT
                {
                mRULE_RICH_TEXT(); 

                }
                break;
            case 98 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:702: RULE_RICH_TEXT_START
                {
                mRULE_RICH_TEXT_START(); 

                }
                break;
            case 99 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:723: RULE_RICH_TEXT_END
                {
                mRULE_RICH_TEXT_END(); 

                }
                break;
            case 100 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:742: RULE_RICH_TEXT_INBETWEEN
                {
                mRULE_RICH_TEXT_INBETWEEN(); 

                }
                break;
            case 101 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:767: RULE_COMMENT_RICH_TEXT_INBETWEEN
                {
                mRULE_COMMENT_RICH_TEXT_INBETWEEN(); 

                }
                break;
            case 102 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:800: RULE_COMMENT_RICH_TEXT_END
                {
                mRULE_COMMENT_RICH_TEXT_END(); 

                }
                break;
            case 103 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:827: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 104 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:836: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 105 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:845: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 106 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:858: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 107 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:866: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 108 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:878: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 109 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:894: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 110 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:910: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 111 :
                // ../org.jnario.feature/src-gen/org/jnario/feature/parser/antlr/internal/InternalFeature.g:1:918: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA57 dfa57 = new DFA57(this);
    static final String DFA1_eotS =
        "\26\uffff";
    static final String DFA1_eofS =
        "\26\uffff";
    static final String DFA1_minS =
        "\3\0\1\uffff\17\0\1\uffff\1\0\1\uffff";
    static final String DFA1_maxS =
        "\3\uffff\1\uffff\17\uffff\1\uffff\1\uffff\1\uffff";
    static final String DFA1_acceptS =
        "\3\uffff\1\1\17\uffff\1\2\1\uffff\1\2";
    static final String DFA1_specialS =
        "\1\6\1\0\1\13\1\uffff\1\3\1\14\1\4\1\17\1\1\1\20\1\2\1\15\1\10\1"+
        "\16\1\11\1\21\1\5\1\22\1\7\1\uffff\1\12\1\uffff}>";
    static final String[] DFA1_transitionS = {
            "\102\3\1\1\20\3\1\2\uffac\3",
            "\141\3\1\4\uff9e\3",
            "\143\3\1\5\uff9c\3",
            "",
            "\143\3\1\6\uff9c\3",
            "\145\3\1\7\uff9a\3",
            "\153\3\1\10\uff94\3",
            "\156\3\1\11\uff91\3",
            "\147\3\1\12\uff98\3",
            "\141\3\1\13\uff9e\3",
            "\162\3\1\14\uff8d\3",
            "\162\3\1\15\uff8d\3",
            "\157\3\1\16\uff90\3",
            "\151\3\1\17\uff96\3",
            "\165\3\1\20\uff8a\3",
            "\157\3\1\21\uff90\3",
            "\156\3\1\22\uff91\3",
            "\72\3\1\23\uffc5\3",
            "\144\3\1\24\uff9b\3",
            "",
            "\72\3\1\25\uffc5\3",
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

    static class DFA1 extends DFA {

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
            return "()* loopback of 8311:42: ( options {greedy=false; } : . )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_1 = input.LA(1);

                        s = -1;
                        if ( (LA1_1=='a') ) {s = 4;}

                        else if ( ((LA1_1>='\u0000' && LA1_1<='`')||(LA1_1>='b' && LA1_1<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_8 = input.LA(1);

                        s = -1;
                        if ( (LA1_8=='g') ) {s = 10;}

                        else if ( ((LA1_8>='\u0000' && LA1_8<='f')||(LA1_8>='h' && LA1_8<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_10 = input.LA(1);

                        s = -1;
                        if ( (LA1_10=='r') ) {s = 12;}

                        else if ( ((LA1_10>='\u0000' && LA1_10<='q')||(LA1_10>='s' && LA1_10<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA1_4 = input.LA(1);

                        s = -1;
                        if ( (LA1_4=='c') ) {s = 6;}

                        else if ( ((LA1_4>='\u0000' && LA1_4<='b')||(LA1_4>='d' && LA1_4<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA1_6 = input.LA(1);

                        s = -1;
                        if ( (LA1_6=='k') ) {s = 8;}

                        else if ( ((LA1_6>='\u0000' && LA1_6<='j')||(LA1_6>='l' && LA1_6<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA1_16 = input.LA(1);

                        s = -1;
                        if ( (LA1_16=='n') ) {s = 18;}

                        else if ( ((LA1_16>='\u0000' && LA1_16<='m')||(LA1_16>='o' && LA1_16<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA1_0 = input.LA(1);

                        s = -1;
                        if ( (LA1_0=='B') ) {s = 1;}

                        else if ( (LA1_0=='S') ) {s = 2;}

                        else if ( ((LA1_0>='\u0000' && LA1_0<='A')||(LA1_0>='C' && LA1_0<='R')||(LA1_0>='T' && LA1_0<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA1_18 = input.LA(1);

                        s = -1;
                        if ( (LA1_18=='d') ) {s = 20;}

                        else if ( ((LA1_18>='\u0000' && LA1_18<='c')||(LA1_18>='e' && LA1_18<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA1_12 = input.LA(1);

                        s = -1;
                        if ( (LA1_12=='o') ) {s = 14;}

                        else if ( ((LA1_12>='\u0000' && LA1_12<='n')||(LA1_12>='p' && LA1_12<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA1_14 = input.LA(1);

                        s = -1;
                        if ( (LA1_14=='u') ) {s = 16;}

                        else if ( ((LA1_14>='\u0000' && LA1_14<='t')||(LA1_14>='v' && LA1_14<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA1_20 = input.LA(1);

                        s = -1;
                        if ( (LA1_20==':') ) {s = 21;}

                        else if ( ((LA1_20>='\u0000' && LA1_20<='9')||(LA1_20>=';' && LA1_20<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA1_2 = input.LA(1);

                        s = -1;
                        if ( (LA1_2=='c') ) {s = 5;}

                        else if ( ((LA1_2>='\u0000' && LA1_2<='b')||(LA1_2>='d' && LA1_2<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA1_5 = input.LA(1);

                        s = -1;
                        if ( (LA1_5=='e') ) {s = 7;}

                        else if ( ((LA1_5>='\u0000' && LA1_5<='d')||(LA1_5>='f' && LA1_5<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA1_11 = input.LA(1);

                        s = -1;
                        if ( (LA1_11=='r') ) {s = 13;}

                        else if ( ((LA1_11>='\u0000' && LA1_11<='q')||(LA1_11>='s' && LA1_11<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA1_13 = input.LA(1);

                        s = -1;
                        if ( (LA1_13=='i') ) {s = 15;}

                        else if ( ((LA1_13>='\u0000' && LA1_13<='h')||(LA1_13>='j' && LA1_13<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA1_7 = input.LA(1);

                        s = -1;
                        if ( (LA1_7=='n') ) {s = 9;}

                        else if ( ((LA1_7>='\u0000' && LA1_7<='m')||(LA1_7>='o' && LA1_7<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA1_9 = input.LA(1);

                        s = -1;
                        if ( (LA1_9=='a') ) {s = 11;}

                        else if ( ((LA1_9>='\u0000' && LA1_9<='`')||(LA1_9>='b' && LA1_9<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA1_15 = input.LA(1);

                        s = -1;
                        if ( (LA1_15=='o') ) {s = 17;}

                        else if ( ((LA1_15>='\u0000' && LA1_15<='n')||(LA1_15>='p' && LA1_15<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA1_17 = input.LA(1);

                        s = -1;
                        if ( (LA1_17==':') ) {s = 19;}

                        else if ( ((LA1_17>='\u0000' && LA1_17<='9')||(LA1_17>=';' && LA1_17<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 1, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA57_eotS =
        "\1\uffff\4\74\1\107\1\112\5\uffff\1\74\1\123\4\74\1\141\1\143\2"+
        "\uffff\1\74\1\151\5\74\1\164\1\166\1\170\1\172\1\174\1\177\1\u0082"+
        "\3\uffff\10\74\1\70\1\u0093\1\70\2\u009a\1\70\1\uffff\1\70\2\uffff"+
        "\3\74\1\uffff\2\74\1\u00a3\6\74\12\uffff\1\74\3\uffff\6\74\1\u00b4"+
        "\4\74\1\u00bb\6\uffff\2\74\2\uffff\10\74\1\u00c6\23\uffff\1\74\1"+
        "\u00c8\11\74\1\u0092\2\uffff\2\u0093\1\uffff\1\u00d8\1\uffff\1\u009a"+
        "\3\uffff\6\74\1\uffff\6\74\1\u00e6\1\u00e7\2\74\1\u00ea\1\74\1\u00ec"+
        "\1\u00ed\2\74\1\uffff\5\74\2\uffff\1\u00f5\11\74\1\uffff\1\74\1"+
        "\uffff\1\u0101\10\74\1\u010d\2\u0093\1\u00d8\1\uffff\1\u0111\1\uffff"+
        "\14\74\1\u011e\2\uffff\1\74\1\u0120\1\uffff\1\74\2\uffff\1\u0122"+
        "\4\74\1\u0127\1\74\1\uffff\6\74\1\uffff\2\74\1\u0132\1\74\1\uffff"+
        "\10\74\2\u010d\2\uffff\1\u0093\2\u0111\1\uffff\12\74\1\u014a\1\74"+
        "\1\uffff\1\u014e\1\uffff\1\74\1\uffff\2\74\1\u0152\1\74\1\uffff"+
        "\1\u0154\5\74\1\u015a\1\74\1\u015c\1\74\1\uffff\1\74\1\u015f\1\74"+
        "\1\u0161\2\74\2\uffff\1\74\2\u010d\2\u0111\1\74\1\u0168\2\74\1\u016b"+
        "\2\74\1\u016e\1\u016f\1\u0170\1\uffff\2\74\1\u0173\1\uffff\1\u0174"+
        "\1\u0175\1\74\1\uffff\1\u0177\1\uffff\1\74\1\u0179\3\74\1\uffff"+
        "\1\u017d\1\uffff\1\u017e\1\74\1\uffff\1\74\1\uffff\1\u0181\1\uffff"+
        "\1\74\1\u010d\1\u0111\1\u0183\1\uffff\1\74\1\u0185\1\uffff\2\74"+
        "\3\uffff\1\74\1\u0189\3\uffff\1\74\1\uffff\1\74\1\uffff\3\74\2\uffff"+
        "\1\u018f\1\u0190\1\uffff\1\74\1\uffff\1\74\1\uffff\3\74\1\uffff"+
        "\1\u0196\1\uffff\3\74\2\uffff\1\74\1\u019b\2\74\1\u019e\1\uffff"+
        "\1\74\1\u01a0\1\uffff\1\74\1\uffff\1\u01a2\1\u01a3\1\uffff\1\74"+
        "\1\uffff\1\74\3\uffff\2\74\1\u01a8\1\uffff\1\74";
    static final String DFA57_eofS =
        "\u01aa\uffff";
    static final String DFA57_minS =
        "\1\0\1\141\1\146\1\150\1\154\1\56\1\52\5\uffff\1\141\1\75\1\150"+
        "\1\145\1\142\1\141\2\75\2\uffff\1\117\1\72\2\105\1\106\1\114\1\106"+
        "\1\75\1\174\1\46\1\75\1\76\1\56\1\52\3\uffff\1\145\1\141\1\150\1"+
        "\145\1\151\2\150\1\137\2\0\1\u00ab\2\60\1\44\1\uffff\1\0\2\uffff"+
        "\1\143\1\142\1\151\1\uffff\1\160\1\163\1\44\1\141\1\157\1\151\1"+
        "\160\1\164\1\163\12\uffff\1\154\3\uffff\1\162\1\165\1\160\1\164"+
        "\1\167\1\154\1\44\1\163\1\141\1\145\1\163\1\76\6\uffff\1\122\1\141"+
        "\2\uffff\1\106\1\143\1\120\1\145\1\124\1\144\1\104\1\123\1\44\23"+
        "\uffff\1\146\1\44\1\162\1\154\1\156\1\151\1\164\1\166\2\145\1\137"+
        "\1\47\2\uffff\2\0\1\uffff\1\0\1\uffff\1\60\3\uffff\1\153\1\154\1"+
        "\164\1\166\1\154\1\164\1\uffff\1\164\1\165\1\164\3\145\2\44\1\157"+
        "\1\145\1\44\1\145\2\44\1\154\1\145\1\uffff\1\164\1\163\1\141\1\145"+
        "\1\143\2\uffff\1\44\1\164\1\117\1\153\1\101\1\156\1\105\1\40\1\106"+
        "\1\105\1\uffff\1\141\1\uffff\1\44\1\163\1\141\1\154\1\165\1\145"+
        "\2\156\1\137\4\0\1\12\1\0\1\uffff\1\141\1\151\1\145\1\141\1\162"+
        "\1\145\1\141\1\151\1\154\1\143\1\162\1\156\1\44\2\uffff\1\167\1"+
        "\44\1\uffff\1\157\2\uffff\1\44\2\162\1\163\1\164\1\44\1\150\1\uffff"+
        "\1\165\1\122\1\147\1\122\1\141\1\122\1\uffff\1\117\1\106\1\44\1"+
        "\165\1\uffff\1\145\1\154\1\145\1\162\1\156\2\40\1\144\2\0\2\uffff"+
        "\3\0\1\uffff\1\147\2\143\2\164\1\155\1\156\1\143\1\144\1\150\1\44"+
        "\1\144\1\uffff\1\44\1\uffff\1\146\1\uffff\1\164\1\141\1\44\1\145"+
        "\1\uffff\1\44\1\162\1\105\1\162\1\101\1\162\1\44\1\122\1\44\1\106"+
        "\1\uffff\1\154\1\44\1\154\1\44\1\156\1\40\2\uffff\1\165\4\0\1\145"+
        "\1\44\1\164\1\145\1\44\1\145\1\143\3\44\1\uffff\1\151\1\163\1\44"+
        "\1\uffff\2\44\1\143\1\uffff\1\44\1\uffff\1\145\1\44\1\157\1\124"+
        "\1\151\1\uffff\1\44\1\uffff\1\44\1\164\1\uffff\1\171\1\uffff\1\44"+
        "\1\uffff\1\155\2\0\1\44\1\uffff\1\145\1\44\1\uffff\1\156\1\145\3"+
        "\uffff\1\157\1\44\3\uffff\1\164\1\uffff\1\11\1\uffff\1\165\1\117"+
        "\1\157\2\uffff\2\44\1\uffff\1\155\1\uffff\1\144\1\uffff\1\164\1"+
        "\157\1\156\1\uffff\1\44\1\uffff\1\156\1\122\1\72\2\uffff\1\171\1"+
        "\44\1\163\1\146\1\44\1\uffff\1\144\1\44\1\uffff\1\137\1\uffff\2"+
        "\44\1\uffff\1\72\1\uffff\1\137\3\uffff\2\137\1\44\1\uffff\1\137";
    static final String DFA57_maxS =
        "\1\uffff\1\165\1\156\1\167\1\170\2\56\5\uffff\1\141\1\76\1\171\1"+
        "\165\1\163\1\162\1\76\1\75\2\uffff\1\145\1\72\1\141\1\143\1\156"+
        "\1\116\1\106\1\75\1\174\1\46\1\75\1\76\1\72\1\57\3\uffff\2\157\1"+
        "\150\1\145\1\151\2\150\1\137\2\uffff\1\u00ab\1\170\1\154\1\172\1"+
        "\uffff\1\uffff\2\uffff\1\143\1\142\1\157\1\uffff\1\160\1\163\1\172"+
        "\1\141\1\157\1\151\1\160\1\164\1\163\12\uffff\1\162\3\uffff\1\162"+
        "\1\171\1\160\1\164\1\167\1\154\1\172\1\163\1\141\1\145\1\164\1\76"+
        "\6\uffff\1\122\1\141\2\uffff\1\106\1\143\1\120\1\145\1\124\1\144"+
        "\1\104\1\123\1\172\23\uffff\1\146\1\172\1\162\1\154\1\156\1\151"+
        "\1\164\1\166\2\145\1\137\1\47\2\uffff\2\uffff\1\uffff\1\uffff\1"+
        "\uffff\1\154\3\uffff\1\153\1\154\1\164\1\166\1\157\1\164\1\uffff"+
        "\1\164\1\165\1\164\3\145\2\172\1\157\1\145\1\172\1\145\2\172\1\154"+
        "\1\145\1\uffff\1\164\1\163\1\141\1\145\1\143\2\uffff\1\172\1\164"+
        "\1\117\1\153\1\101\1\156\1\105\1\40\1\111\1\105\1\uffff\1\141\1"+
        "\uffff\1\172\1\163\1\141\1\154\1\165\1\145\2\156\1\137\4\uffff\1"+
        "\12\1\uffff\1\uffff\1\141\1\151\1\145\1\141\1\162\1\145\1\141\1"+
        "\151\1\154\1\143\1\162\1\156\1\172\2\uffff\1\167\1\172\1\uffff\1"+
        "\157\2\uffff\1\172\2\162\1\163\1\164\1\172\1\150\1\uffff\1\165\1"+
        "\122\1\147\1\122\1\141\1\122\1\uffff\1\117\1\106\1\172\1\165\1\uffff"+
        "\1\145\1\154\1\145\1\162\1\156\2\40\1\144\2\uffff\2\uffff\3\uffff"+
        "\1\uffff\1\147\2\143\2\164\1\155\1\156\1\143\1\144\1\150\1\172\1"+
        "\163\1\uffff\1\172\1\uffff\1\146\1\uffff\1\164\1\141\1\172\1\145"+
        "\1\uffff\1\172\1\162\1\105\1\162\1\101\1\162\1\172\1\122\1\172\1"+
        "\106\1\uffff\1\154\1\172\1\154\1\172\1\156\1\40\2\uffff\1\165\4"+
        "\uffff\1\145\1\172\1\164\1\145\1\172\1\145\1\143\3\172\1\uffff\1"+
        "\151\1\163\1\172\1\uffff\2\172\1\143\1\uffff\1\172\1\uffff\1\145"+
        "\1\172\1\157\1\124\1\151\1\uffff\1\172\1\uffff\1\172\1\164\1\uffff"+
        "\1\171\1\uffff\1\172\1\uffff\1\155\2\uffff\1\172\1\uffff\1\145\1"+
        "\172\1\uffff\1\156\1\145\3\uffff\1\157\1\172\3\uffff\1\164\1\uffff"+
        "\1\72\1\uffff\1\165\1\117\1\157\2\uffff\2\172\1\uffff\1\155\1\uffff"+
        "\1\144\1\uffff\1\164\1\157\1\156\1\uffff\1\172\1\uffff\1\156\1\122"+
        "\1\72\2\uffff\1\171\1\172\1\163\1\146\1\172\1\uffff\1\144\1\172"+
        "\1\uffff\1\137\1\uffff\2\172\1\uffff\1\72\1\uffff\1\137\3\uffff"+
        "\2\137\1\172\1\uffff\1\137";
    static final String DFA57_acceptS =
        "\7\uffff\1\7\1\10\1\11\1\12\1\13\10\uffff\1\34\1\35\16\uffff\1\72"+
        "\1\77\1\101\16\uffff\1\152\1\uffff\1\156\1\157\3\uffff\1\152\11"+
        "\uffff\1\62\1\5\1\70\1\76\1\6\1\7\1\10\1\11\1\12\1\13\1\uffff\1"+
        "\55\1\63\1\16\14\uffff\1\64\1\30\1\57\1\31\1\34\1\35\2\uffff\1\113"+
        "\1\40\11\uffff\1\52\1\51\1\53\1\100\1\54\1\126\1\56\1\73\1\61\1"+
        "\67\1\65\1\75\1\125\1\154\1\155\1\71\1\72\1\77\1\101\14\uffff\1"+
        "\153\1\143\2\uffff\1\144\1\uffff\1\147\1\uffff\1\150\1\151\1\156"+
        "\6\uffff\1\102\20\uffff\1\74\5\uffff\1\66\1\60\12\uffff\1\45\1\uffff"+
        "\1\111\17\uffff\1\145\15\uffff\1\14\1\15\2\uffff\1\122\1\uffff\1"+
        "\23\1\114\7\uffff\1\37\6\uffff\1\137\4\uffff\1\107\12\uffff\1\142"+
        "\1\141\3\uffff\1\146\14\uffff\1\103\1\uffff\1\116\1\uffff\1\117"+
        "\4\uffff\1\106\12\uffff\1\46\6\uffff\1\135\1\136\17\uffff\1\112"+
        "\3\uffff\1\20\3\uffff\1\27\1\uffff\1\124\5\uffff\1\43\1\uffff\1"+
        "\47\2\uffff\1\115\1\uffff\1\110\1\uffff\1\134\4\uffff\1\25\2\uffff"+
        "\1\2\2\uffff\1\3\1\17\1\104\2\uffff\1\21\1\120\1\24\1\uffff\1\36"+
        "\1\uffff\1\41\3\uffff\1\44\1\50\2\uffff\1\121\1\uffff\1\1\1\uffff"+
        "\1\130\3\uffff\1\32\1\uffff\1\133\3\uffff\1\105\1\123\5\uffff\1"+
        "\26\2\uffff\1\132\1\uffff\1\127\2\uffff\1\4\1\uffff\1\42\1\uffff"+
        "\1\33\1\22\1\131\3\uffff\1\140\1\uffff";
    static final String DFA57_specialS =
        "\1\1\56\uffff\1\6\1\17\5\uffff\1\15\135\uffff\1\22\1\12\1\uffff"+
        "\1\20\72\uffff\1\2\1\16\1\10\1\5\1\uffff\1\21\62\uffff\1\0\1\14"+
        "\2\uffff\1\7\1\26\1\24\53\uffff\1\4\1\11\1\3\1\23\45\uffff\1\13"+
        "\1\25\103\uffff}>";
    static final String[] DFA57_transitionS = {
            "\11\70\2\67\2\70\1\67\22\70\1\67\1\40\1\66\1\70\1\65\1\44\1"+
            "\37\1\57\1\11\1\13\1\6\1\35\1\12\1\41\1\5\1\43\1\62\11\63\1"+
            "\27\1\7\1\22\1\15\1\23\1\42\1\10\1\32\1\30\2\65\1\33\1\26\1"+
            "\53\1\65\1\34\11\65\1\31\1\55\2\65\1\54\3\65\1\45\1\70\1\46"+
            "\1\64\1\56\1\70\1\20\1\65\1\21\1\47\1\4\1\50\2\65\1\2\4\65\1"+
            "\17\1\65\1\1\1\65\1\52\1\3\1\16\1\65\1\14\1\51\3\65\1\24\1\36"+
            "\1\25\55\70\1\61\17\70\1\60\uff44\70",
            "\1\71\20\uffff\1\73\2\uffff\1\72",
            "\1\77\6\uffff\1\75\1\76",
            "\1\101\13\uffff\1\100\1\103\1\uffff\1\102",
            "\1\105\13\uffff\1\104",
            "\1\106",
            "\1\110\3\uffff\1\111",
            "",
            "",
            "",
            "",
            "",
            "\1\120",
            "\1\121\1\122",
            "\1\124\11\uffff\1\125\6\uffff\1\126",
            "\1\130\11\uffff\1\127\5\uffff\1\131",
            "\1\133\20\uffff\1\132",
            "\1\136\12\uffff\1\134\5\uffff\1\135",
            "\1\137\1\140",
            "\1\142",
            "",
            "",
            "\1\146\25\uffff\1\147",
            "\1\150",
            "\1\152\33\uffff\1\153",
            "\1\154\35\uffff\1\155",
            "\1\156\47\uffff\1\157",
            "\1\161\1\uffff\1\160",
            "\1\162",
            "\1\163",
            "\1\165",
            "\1\167",
            "\1\171",
            "\1\173",
            "\1\176\13\uffff\1\175",
            "\1\u0080\4\uffff\1\u0081",
            "",
            "",
            "",
            "\1\u0086\11\uffff\1\u0087",
            "\1\u0089\7\uffff\1\u008a\5\uffff\1\u0088",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\47\u0092\1\u0091\uffd8\u0092",
            "\47\u0095\1\u0094\u0083\u0095\1\u0096\uff54\u0095",
            "\1\u0097",
            "\12\u0099\10\uffff\1\u009b\1\uffff\3\u009b\5\uffff\1\u009b"+
            "\13\uffff\1\u0098\6\uffff\1\u0099\2\uffff\1\u009b\1\uffff\3"+
            "\u009b\5\uffff\1\u009b\13\uffff\1\u0098",
            "\12\u0099\10\uffff\1\u009b\1\uffff\3\u009b\5\uffff\1\u009b"+
            "\22\uffff\1\u0099\2\uffff\1\u009b\1\uffff\3\u009b\5\uffff\1"+
            "\u009b",
            "\1\74\34\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "\0\u0092",
            "",
            "",
            "\1\u009d",
            "\1\u009e",
            "\1\u00a0\5\uffff\1\u009f",
            "",
            "\1\u00a1",
            "\1\u00a2",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00aa\5\uffff\1\u00ab",
            "",
            "",
            "",
            "\1\u00ac",
            "\1\u00ad\3\uffff\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\22"+
            "\74\1\u00b3\7\74",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8\1\u00b9",
            "\1\u00ba",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00bc",
            "\1\u00bd",
            "",
            "",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c7",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "",
            "",
            "\47\u00d4\1\u00d3\u0083\u00d4\1\u0096\uff54\u00d4",
            "\47\u0095\1\u0094\u0083\u0095\1\u0096\uff54\u0095",
            "",
            "\12\u00d5\1\u00d7\2\u00d5\1\u00d6\ufff2\u00d5",
            "",
            "\12\u0099\10\uffff\1\u009b\1\uffff\3\u009b\5\uffff\1\u009b"+
            "\22\uffff\1\u0099\2\uffff\1\u009b\1\uffff\3\u009b\5\uffff\1"+
            "\u009b",
            "",
            "",
            "",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00de\2\uffff\1\u00dd",
            "\1\u00df",
            "",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u00e8",
            "\1\u00e9",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u00eb",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u00ee",
            "\1\u00ef",
            "",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd\2\uffff\1\u00fe",
            "\1\u00ff",
            "",
            "\1\u0100",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\47\u010b\1\u010a\u0083\u010b\1\u010c\uff54\u010b",
            "\47\u010e\1\uffff\u0083\u010e\1\u0096\uff54\u010e",
            "\47\u0095\1\u0094\u0083\u0095\1\u0096\uff54\u0095",
            "\12\u00d5\1\u00d7\2\u00d5\1\u00d6\ufff2\u00d5",
            "\1\u00d7",
            "\47\u0110\1\u010f\u0083\u0110\1\u00d8\uff54\u0110",
            "",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "",
            "\1\u011f",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "\1\u0121",
            "",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u0128",
            "",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "",
            "\1\u012f",
            "\1\u0130",
            "\1\74\13\uffff\12\74\7\uffff\10\74\1\u0131\21\74\4\uffff\1"+
            "\74\1\uffff\32\74",
            "\1\u0133",
            "",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\47\u013d\1\u013c\u0083\u013d\1\u010c\uff54\u013d",
            "\47\u010b\1\u010a\u0083\u010b\1\u010c\uff54\u010b",
            "",
            "",
            "\47\u0095\1\u0094\u0083\u0095\1\u0096\uff54\u0095",
            "\47\u013f\1\u013e\u0083\u013f\1\u00d8\uff54\u013f",
            "\47\u0110\1\u010f\u0083\u0110\1\u00d8\uff54\u0110",
            "",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u014c\16\uffff\1\u014b",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\22"+
            "\74\1\u014d\7\74",
            "",
            "\1\u014f",
            "",
            "\1\u0150",
            "\1\u0151",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u0153",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u015b",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u015d",
            "",
            "\1\u015e",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u0160",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u0162",
            "\1\u0163",
            "",
            "",
            "\1\u0164",
            "\47\u0165\1\uffff\u0083\u0165\1\u010c\uff54\u0165",
            "\47\u010b\1\u010a\u0083\u010b\1\u010c\uff54\u010b",
            "\47\u0166\1\uffff\u0083\u0166\1\u00d8\uff54\u0166",
            "\47\u0110\1\u010f\u0083\u0110\1\u00d8\uff54\u0110",
            "\1\u0167",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u0169",
            "\1\u016a",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u016c",
            "\1\u016d",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "\1\u0171",
            "\1\u0172",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u0176",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "\1\u0178",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u017f",
            "",
            "\1\u0180",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "\1\u0182",
            "\47\u010b\1\u010a\u0083\u010b\1\u010c\uff54\u010b",
            "\47\u0110\1\u010f\u0083\u0110\1\u00d8\uff54\u0110",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "\1\u0184",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "\1\u0186",
            "\1\u0187",
            "",
            "",
            "",
            "\1\u0188",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "",
            "",
            "\1\u018a",
            "",
            "\1\u018b\26\uffff\1\u018b\31\uffff\1\u018b",
            "",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "\1\u0191",
            "",
            "\1\u0192",
            "",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "",
            "",
            "\1\u019a",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\u019c",
            "\1\u019d",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "\1\u019f",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "\1\u01a1",
            "",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32"+
            "\74",
            "",
            "\1\u01a4",
            "",
            "\1\u01a5",
            "",
            "",
            "",
            "\1\u01a6",
            "\1\u01a7",
            "\1\74\13\uffff\12\74\7\uffff\32\74\4\uffff\1\u01a9\1\uffff"+
            "\32\74",
            "",
            "\1\u0090"
    };

    static final short[] DFA57_eot = DFA.unpackEncodedString(DFA57_eotS);
    static final short[] DFA57_eof = DFA.unpackEncodedString(DFA57_eofS);
    static final char[] DFA57_min = DFA.unpackEncodedStringToUnsignedChars(DFA57_minS);
    static final char[] DFA57_max = DFA.unpackEncodedStringToUnsignedChars(DFA57_maxS);
    static final short[] DFA57_accept = DFA.unpackEncodedString(DFA57_acceptS);
    static final short[] DFA57_special = DFA.unpackEncodedString(DFA57_specialS);
    static final short[][] DFA57_transition;

    static {
        int numStates = DFA57_transitionS.length;
        DFA57_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA57_transition[i] = DFA.unpackEncodedString(DFA57_transitionS[i]);
        }
    }

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = DFA57_eot;
            this.eof = DFA57_eof;
            this.min = DFA57_min;
            this.max = DFA57_max;
            this.accept = DFA57_accept;
            this.special = DFA57_special;
            this.transition = DFA57_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | RULE_BACKGROUND_TEXT | RULE_SCENARIO_TEXT | RULE_FEATURE_TEXT | RULE_GIVEN_TEXT | RULE_WHEN_TEXT | RULE_THEN_TEXT | RULE_AND_TEXT | RULE_TEXT | RULE_RICH_TEXT | RULE_RICH_TEXT_START | RULE_RICH_TEXT_END | RULE_RICH_TEXT_INBETWEEN | RULE_COMMENT_RICH_TEXT_INBETWEEN | RULE_COMMENT_RICH_TEXT_END | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA57_266 = input.LA(1);

                        s = -1;
                        if ( (LA57_266=='\'') ) {s = 316;}

                        else if ( ((LA57_266>='\u0000' && LA57_266<='&')||(LA57_266>='(' && LA57_266<='\u00AA')||(LA57_266>='\u00AC' && LA57_266<='\uFFFF')) ) {s = 317;}

                        else if ( (LA57_266=='\u00AB') ) {s = 268;}

                        else s = 269;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA57_0 = input.LA(1);

                        s = -1;
                        if ( (LA57_0=='p') ) {s = 1;}

                        else if ( (LA57_0=='i') ) {s = 2;}

                        else if ( (LA57_0=='s') ) {s = 3;}

                        else if ( (LA57_0=='e') ) {s = 4;}

                        else if ( (LA57_0=='.') ) {s = 5;}

                        else if ( (LA57_0=='*') ) {s = 6;}

                        else if ( (LA57_0==';') ) {s = 7;}

                        else if ( (LA57_0=='@') ) {s = 8;}

                        else if ( (LA57_0=='(') ) {s = 9;}

                        else if ( (LA57_0==',') ) {s = 10;}

                        else if ( (LA57_0==')') ) {s = 11;}

                        else if ( (LA57_0=='v') ) {s = 12;}

                        else if ( (LA57_0=='=') ) {s = 13;}

                        else if ( (LA57_0=='t') ) {s = 14;}

                        else if ( (LA57_0=='n') ) {s = 15;}

                        else if ( (LA57_0=='a') ) {s = 16;}

                        else if ( (LA57_0=='c') ) {s = 17;}

                        else if ( (LA57_0=='<') ) {s = 18;}

                        else if ( (LA57_0=='>') ) {s = 19;}

                        else if ( (LA57_0=='{') ) {s = 20;}

                        else if ( (LA57_0=='}') ) {s = 21;}

                        else if ( (LA57_0=='F') ) {s = 22;}

                        else if ( (LA57_0==':') ) {s = 23;}

                        else if ( (LA57_0=='B') ) {s = 24;}

                        else if ( (LA57_0=='S') ) {s = 25;}

                        else if ( (LA57_0=='A') ) {s = 26;}

                        else if ( (LA57_0=='E') ) {s = 27;}

                        else if ( (LA57_0=='I') ) {s = 28;}

                        else if ( (LA57_0=='+') ) {s = 29;}

                        else if ( (LA57_0=='|') ) {s = 30;}

                        else if ( (LA57_0=='&') ) {s = 31;}

                        else if ( (LA57_0=='!') ) {s = 32;}

                        else if ( (LA57_0=='-') ) {s = 33;}

                        else if ( (LA57_0=='?') ) {s = 34;}

                        else if ( (LA57_0=='/') ) {s = 35;}

                        else if ( (LA57_0=='%') ) {s = 36;}

                        else if ( (LA57_0=='[') ) {s = 37;}

                        else if ( (LA57_0==']') ) {s = 38;}

                        else if ( (LA57_0=='d') ) {s = 39;}

                        else if ( (LA57_0=='f') ) {s = 40;}

                        else if ( (LA57_0=='w') ) {s = 41;}

                        else if ( (LA57_0=='r') ) {s = 42;}

                        else if ( (LA57_0=='G') ) {s = 43;}

                        else if ( (LA57_0=='W') ) {s = 44;}

                        else if ( (LA57_0=='T') ) {s = 45;}

                        else if ( (LA57_0=='_') ) {s = 46;}

                        else if ( (LA57_0=='\'') ) {s = 47;}

                        else if ( (LA57_0=='\u00BB') ) {s = 48;}

                        else if ( (LA57_0=='\u00AB') ) {s = 49;}

                        else if ( (LA57_0=='0') ) {s = 50;}

                        else if ( ((LA57_0>='1' && LA57_0<='9')) ) {s = 51;}

                        else if ( (LA57_0=='^') ) {s = 52;}

                        else if ( (LA57_0=='$'||(LA57_0>='C' && LA57_0<='D')||LA57_0=='H'||(LA57_0>='J' && LA57_0<='R')||(LA57_0>='U' && LA57_0<='V')||(LA57_0>='X' && LA57_0<='Z')||LA57_0=='b'||(LA57_0>='g' && LA57_0<='h')||(LA57_0>='j' && LA57_0<='m')||LA57_0=='o'||LA57_0=='q'||LA57_0=='u'||(LA57_0>='x' && LA57_0<='z')) ) {s = 53;}

                        else if ( (LA57_0=='\"') ) {s = 54;}

                        else if ( ((LA57_0>='\t' && LA57_0<='\n')||LA57_0=='\r'||LA57_0==' ') ) {s = 55;}

                        else if ( ((LA57_0>='\u0000' && LA57_0<='\b')||(LA57_0>='\u000B' && LA57_0<='\f')||(LA57_0>='\u000E' && LA57_0<='\u001F')||LA57_0=='#'||LA57_0=='\\'||LA57_0=='`'||(LA57_0>='~' && LA57_0<='\u00AA')||(LA57_0>='\u00AC' && LA57_0<='\u00BA')||(LA57_0>='\u00BC' && LA57_0<='\uFFFF')) ) {s = 56;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA57_210 = input.LA(1);

                        s = -1;
                        if ( (LA57_210=='\'') ) {s = 266;}

                        else if ( ((LA57_210>='\u0000' && LA57_210<='&')||(LA57_210>='(' && LA57_210<='\u00AA')||(LA57_210>='\u00AC' && LA57_210<='\uFFFF')) ) {s = 267;}

                        else if ( (LA57_210=='\u00AB') ) {s = 268;}

                        else s = 269;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA57_318 = input.LA(1);

                        s = -1;
                        if ( ((LA57_318>='\u0000' && LA57_318<='&')||(LA57_318>='(' && LA57_318<='\u00AA')||(LA57_318>='\u00AC' && LA57_318<='\uFFFF')) ) {s = 358;}

                        else if ( (LA57_318=='\u00AB') ) {s = 216;}

                        else s = 273;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA57_316 = input.LA(1);

                        s = -1;
                        if ( ((LA57_316>='\u0000' && LA57_316<='&')||(LA57_316>='(' && LA57_316<='\u00AA')||(LA57_316>='\u00AC' && LA57_316<='\uFFFF')) ) {s = 357;}

                        else if ( (LA57_316=='\u00AB') ) {s = 268;}

                        else s = 269;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA57_213 = input.LA(1);

                        s = -1;
                        if ( (LA57_213=='\r') ) {s = 214;}

                        else if ( (LA57_213=='\n') ) {s = 215;}

                        else if ( ((LA57_213>='\u0000' && LA57_213<='\t')||(LA57_213>='\u000B' && LA57_213<='\f')||(LA57_213>='\u000E' && LA57_213<='\uFFFF')) ) {s = 213;}

                        else s = 216;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA57_47 = input.LA(1);

                        s = -1;
                        if ( (LA57_47=='\'') ) {s = 145;}

                        else if ( ((LA57_47>='\u0000' && LA57_47<='&')||(LA57_47>='(' && LA57_47<='\uFFFF')) ) {s = 146;}

                        else s = 56;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA57_270 = input.LA(1);

                        s = -1;
                        if ( (LA57_270=='\'') ) {s = 148;}

                        else if ( ((LA57_270>='\u0000' && LA57_270<='&')||(LA57_270>='(' && LA57_270<='\u00AA')||(LA57_270>='\u00AC' && LA57_270<='\uFFFF')) ) {s = 149;}

                        else if ( (LA57_270=='\u00AB') ) {s = 150;}

                        else s = 147;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA57_212 = input.LA(1);

                        s = -1;
                        if ( (LA57_212=='\'') ) {s = 148;}

                        else if ( (LA57_212=='\u00AB') ) {s = 150;}

                        else if ( ((LA57_212>='\u0000' && LA57_212<='&')||(LA57_212>='(' && LA57_212<='\u00AA')||(LA57_212>='\u00AC' && LA57_212<='\uFFFF')) ) {s = 149;}

                        else s = 147;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA57_317 = input.LA(1);

                        s = -1;
                        if ( (LA57_317=='\'') ) {s = 266;}

                        else if ( (LA57_317=='\u00AB') ) {s = 268;}

                        else if ( ((LA57_317>='\u0000' && LA57_317<='&')||(LA57_317>='(' && LA57_317<='\u00AA')||(LA57_317>='\u00AC' && LA57_317<='\uFFFF')) ) {s = 267;}

                        else s = 269;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA57_149 = input.LA(1);

                        s = -1;
                        if ( (LA57_149=='\'') ) {s = 148;}

                        else if ( ((LA57_149>='\u0000' && LA57_149<='&')||(LA57_149>='(' && LA57_149<='\u00AA')||(LA57_149>='\u00AC' && LA57_149<='\uFFFF')) ) {s = 149;}

                        else if ( (LA57_149=='\u00AB') ) {s = 150;}

                        else s = 147;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA57_357 = input.LA(1);

                        s = -1;
                        if ( (LA57_357=='\'') ) {s = 266;}

                        else if ( ((LA57_357>='\u0000' && LA57_357<='&')||(LA57_357>='(' && LA57_357<='\u00AA')||(LA57_357>='\u00AC' && LA57_357<='\uFFFF')) ) {s = 267;}

                        else if ( (LA57_357=='\u00AB') ) {s = 268;}

                        else s = 269;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA57_267 = input.LA(1);

                        s = -1;
                        if ( (LA57_267=='\'') ) {s = 266;}

                        else if ( ((LA57_267>='\u0000' && LA57_267<='&')||(LA57_267>='(' && LA57_267<='\u00AA')||(LA57_267>='\u00AC' && LA57_267<='\uFFFF')) ) {s = 267;}

                        else if ( (LA57_267=='\u00AB') ) {s = 268;}

                        else s = 269;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA57_54 = input.LA(1);

                        s = -1;
                        if ( ((LA57_54>='\u0000' && LA57_54<='\uFFFF')) ) {s = 146;}

                        else s = 56;

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA57_211 = input.LA(1);

                        s = -1;
                        if ( ((LA57_211>='\u0000' && LA57_211<='&')||(LA57_211>='(' && LA57_211<='\u00AA')||(LA57_211>='\u00AC' && LA57_211<='\uFFFF')) ) {s = 270;}

                        else if ( (LA57_211=='\u00AB') ) {s = 150;}

                        else s = 147;

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA57_48 = input.LA(1);

                        s = -1;
                        if ( (LA57_48=='\'') ) {s = 148;}

                        else if ( ((LA57_48>='\u0000' && LA57_48<='&')||(LA57_48>='(' && LA57_48<='\u00AA')||(LA57_48>='\u00AC' && LA57_48<='\uFFFF')) ) {s = 149;}

                        else if ( (LA57_48=='\u00AB') ) {s = 150;}

                        else s = 147;

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA57_151 = input.LA(1);

                        s = -1;
                        if ( ((LA57_151>='\u0000' && LA57_151<='\t')||(LA57_151>='\u000B' && LA57_151<='\f')||(LA57_151>='\u000E' && LA57_151<='\uFFFF')) ) {s = 213;}

                        else if ( (LA57_151=='\r') ) {s = 214;}

                        else if ( (LA57_151=='\n') ) {s = 215;}

                        else s = 216;

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA57_215 = input.LA(1);

                        s = -1;
                        if ( (LA57_215=='\'') ) {s = 271;}

                        else if ( ((LA57_215>='\u0000' && LA57_215<='&')||(LA57_215>='(' && LA57_215<='\u00AA')||(LA57_215>='\u00AC' && LA57_215<='\uFFFF')) ) {s = 272;}

                        else if ( (LA57_215=='\u00AB') ) {s = 216;}

                        else s = 273;

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA57_148 = input.LA(1);

                        s = -1;
                        if ( (LA57_148=='\'') ) {s = 211;}

                        else if ( ((LA57_148>='\u0000' && LA57_148<='&')||(LA57_148>='(' && LA57_148<='\u00AA')||(LA57_148>='\u00AC' && LA57_148<='\uFFFF')) ) {s = 212;}

                        else if ( (LA57_148=='\u00AB') ) {s = 150;}

                        else s = 147;

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA57_319 = input.LA(1);

                        s = -1;
                        if ( (LA57_319=='\'') ) {s = 271;}

                        else if ( (LA57_319=='\u00AB') ) {s = 216;}

                        else if ( ((LA57_319>='\u0000' && LA57_319<='&')||(LA57_319>='(' && LA57_319<='\u00AA')||(LA57_319>='\u00AC' && LA57_319<='\uFFFF')) ) {s = 272;}

                        else s = 273;

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA57_272 = input.LA(1);

                        s = -1;
                        if ( (LA57_272=='\'') ) {s = 271;}

                        else if ( ((LA57_272>='\u0000' && LA57_272<='&')||(LA57_272>='(' && LA57_272<='\u00AA')||(LA57_272>='\u00AC' && LA57_272<='\uFFFF')) ) {s = 272;}

                        else if ( (LA57_272=='\u00AB') ) {s = 216;}

                        else s = 273;

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA57_358 = input.LA(1);

                        s = -1;
                        if ( (LA57_358=='\'') ) {s = 271;}

                        else if ( (LA57_358=='\u00AB') ) {s = 216;}

                        else if ( ((LA57_358>='\u0000' && LA57_358<='&')||(LA57_358>='(' && LA57_358<='\u00AA')||(LA57_358>='\u00AC' && LA57_358<='\uFFFF')) ) {s = 272;}

                        else s = 273;

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA57_271 = input.LA(1);

                        s = -1;
                        if ( (LA57_271=='\'') ) {s = 318;}

                        else if ( ((LA57_271>='\u0000' && LA57_271<='&')||(LA57_271>='(' && LA57_271<='\u00AA')||(LA57_271>='\u00AC' && LA57_271<='\uFFFF')) ) {s = 319;}

                        else if ( (LA57_271=='\u00AB') ) {s = 216;}

                        else s = 273;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 57, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}