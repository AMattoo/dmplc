package edu.cmu.sei.annex.dmpl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDmplLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int RULE_TIDENTIFIER=4;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalDmplLexer() {;} 
    public InternalDmplLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDmplLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:11:7: ( 'const' )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:11:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:12:7: ( 'CONST' )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:12:9: 'CONST'
            {
            match("CONST"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:13:7: ( '=' )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:13:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:14:7: ( ';' )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:14:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:15:7: ( '[' )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:15:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:16:7: ( ']' )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:16:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:17:7: ( '#N' )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:17:9: '#N'
            {
            match("#N"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:18:7: ( '{' )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:18:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:19:7: ( '}' )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:19:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:20:7: ( 'extern' )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:20:9: 'extern'
            {
            match("extern"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:21:7: ( 'EXTERN' )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:21:9: 'EXTERN'
            {
            match("EXTERN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:22:7: ( 'pure' )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:22:9: 'pure'
            {
            match("pure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:23:7: ( 'PURE' )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:23:9: 'PURE'
            {
            match("PURE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:24:7: ( 'thread' )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:24:9: 'thread'
            {
            match("thread"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:25:7: ( '(' )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:25:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:26:7: ( ',' )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:26:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:27:7: ( ')' )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:27:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:28:7: ( '@' )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:28:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:29:7: ( 'id' )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:29:9: 'id'
            {
            match("id"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:30:7: ( '::' )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:30:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:31:7: ( '+' )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:31:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:32:7: ( '-' )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:32:9: '-'
            {
            match('-'); 

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
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:33:7: ( 'bool' )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:33:9: 'bool'
            {
            match("bool"); 


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
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:34:7: ( '_Bool' )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:34:9: '_Bool'
            {
            match("_Bool"); 


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
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:35:7: ( 'int' )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:35:9: 'int'
            {
            match("int"); 


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
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:36:7: ( 'double' )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:36:9: 'double'
            {
            match("double"); 


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
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:37:7: ( 'void' )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:37:9: 'void'
            {
            match("void"); 


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
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:38:7: ( 'char' )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:38:9: 'char'
            {
            match("char"); 


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
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:39:7: ( 'signed' )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:39:9: 'signed'
            {
            match("signed"); 


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
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:40:7: ( 'unsigned' )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:40:9: 'unsigned'
            {
            match("unsigned"); 


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
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:41:7: ( 'exists_other' )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:41:9: 'exists_other'
            {
            match("exists_other"); 


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
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:42:7: ( 'EXISTS_OTHER' )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:42:9: 'EXISTS_OTHER'
            {
            match("EXISTS_OTHER"); 


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
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:43:7: ( 'exists_higher' )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:43:9: 'exists_higher'
            {
            match("exists_higher"); 


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
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:44:7: ( 'EXISTS_HIGHER' )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:44:9: 'EXISTS_HIGHER'
            {
            match("EXISTS_HIGHER"); 


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
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:45:7: ( 'exists_lower' )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:45:9: 'exists_lower'
            {
            match("exists_lower"); 


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
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:46:7: ( 'EXISTS_LOWER' )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:46:9: 'EXISTS_LOWER'
            {
            match("EXISTS_LOWER"); 


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
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:47:7: ( 'NAN' )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:47:9: 'NAN'
            {
            match("NAN"); 


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
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:48:7: ( '.' )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:48:9: '.'
            {
            match('.'); 

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
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:49:7: ( '!' )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:49:9: '!'
            {
            match('!'); 

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
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:50:7: ( '~' )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:50:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "RULE_TIDENTIFIER"
    public final void mRULE_TIDENTIFIER() throws RecognitionException {
        try {
            int _type = RULE_TIDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:2157:18: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:2157:20: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:2157:44: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TIDENTIFIER"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:2159:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:2159:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:2159:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:2159:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:2159:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
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

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:2161:10: ( ( '0' .. '9' )+ )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:2161:12: ( '0' .. '9' )+
            {
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:2161:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:2161:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:2163:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:2163:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:2163:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:2163:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:2163:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:2163:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:2163:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:2163:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:2163:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:2163:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:2163:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop6;
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
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:2165:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:2165:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:2165:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:2165:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:2167:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:2167:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:2167:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:2167:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop9;
                }
            } while (true);

            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:2167:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:2167:41: ( '\\r' )? '\\n'
                    {
                    // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:2167:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:2167:41: '\\r'
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
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:2169:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:2169:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:2169:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:2171:16: ( . )
            // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:2171:18: .
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
        // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | RULE_TIDENTIFIER | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=48;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:250: RULE_TIDENTIFIER
                {
                mRULE_TIDENTIFIER(); 

                }
                break;
            case 42 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:267: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 43 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:275: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 44 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:284: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 45 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:296: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 46 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:312: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 47 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:328: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 48 :
                // ../edu.cmu.sei.annex.dmpl/src-gen/edu/cmu/sei/annex/dmpl/parser/antlr/internal/InternalDmpl.g:1:336: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\2\54\4\uffff\1\50\2\uffff\5\54\4\uffff\1\54\1\50\2\uffff\7\54\3\uffff\1\54\1\50\1\uffff\3\50\2\uffff\3\54\1\uffff\1\54\7\uffff\5\54\4\uffff\1\135\1\54\3\uffff\7\54\11\uffff\12\54\1\uffff\1\160\6\54\1\167\1\54\1\171\5\54\1\177\1\u0080\1\54\1\uffff\1\u0082\2\54\1\u0085\2\54\1\uffff\1\u0088\1\uffff\1\u0089\4\54\2\uffff\1\54\1\uffff\1\u008f\1\54\1\uffff\2\54\2\uffff\1\u0093\1\54\1\u0095\1\54\1\u0097\1\uffff\1\u0098\1\u0099\1\54\1\uffff\1\54\1\uffff\1\54\3\uffff\7\54\1\u00a8\6\54\1\uffff\14\54\1\u00bb\1\54\1\u00bd\1\u00be\1\54\1\u00c0\1\uffff\1\u00c1\2\uffff\1\u00c2\3\uffff";
    static final String DFA13_eofS =
        "\u00c3\uffff";
    static final String DFA13_minS =
        "\1\0\2\60\4\uffff\1\116\2\uffff\5\60\4\uffff\1\60\1\72\2\uffff\7\60\3\uffff\1\60\1\101\1\uffff\2\0\1\52\2\uffff\3\60\1\uffff\1\60\7\uffff\5\60\4\uffff\2\60\3\uffff\7\60\11\uffff\12\60\1\uffff\22\60\1\uffff\6\60\1\uffff\1\60\1\uffff\5\60\2\uffff\1\60\1\uffff\2\60\1\uffff\2\60\2\uffff\5\60\1\uffff\3\60\1\uffff\1\60\1\uffff\1\60\3\uffff\16\60\1\uffff\22\60\1\uffff\1\60\2\uffff\1\60\3\uffff";
    static final String DFA13_maxS =
        "\1\uffff\2\172\4\uffff\1\116\2\uffff\5\172\4\uffff\1\172\1\72\2\uffff\7\172\3\uffff\2\172\1\uffff\2\uffff\1\57\2\uffff\3\172\1\uffff\1\172\7\uffff\5\172\4\uffff\2\172\3\uffff\7\172\11\uffff\12\172\1\uffff\22\172\1\uffff\6\172\1\uffff\1\172\1\uffff\5\172\2\uffff\1\172\1\uffff\2\172\1\uffff\2\172\2\uffff\5\172\1\uffff\3\172\1\uffff\1\172\1\uffff\1\172\3\uffff\16\172\1\uffff\22\172\1\uffff\1\172\2\uffff\1\172\3\uffff";
    static final String DFA13_acceptS =
        "\3\uffff\1\3\1\4\1\5\1\6\1\uffff\1\10\1\11\5\uffff\1\17\1\20\1\21\1\22\2\uffff\1\25\1\26\7\uffff\1\46\1\47\1\50\2\uffff\1\53\3\uffff\1\57\1\60\3\uffff\1\51\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\5\uffff\1\17\1\20\1\21\1\22\2\uffff\1\24\1\25\1\26\7\uffff\1\46\1\47\1\50\1\52\1\53\1\54\1\55\1\56\1\57\12\uffff\1\23\22\uffff\1\31\6\uffff\1\45\1\uffff\1\34\5\uffff\1\14\1\15\1\uffff\1\27\2\uffff\1\33\2\uffff\1\1\1\2\5\uffff\1\30\3\uffff\1\12\1\uffff\1\13\1\uffff\1\16\1\32\1\35\16\uffff\1\36\22\uffff\1\37\1\uffff\1\43\1\40\1\uffff\1\44\1\41\1\42";
    static final String DFA13_specialS =
        "\1\2\43\uffff\1\1\1\0\u009d\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\50\2\47\2\50\1\47\22\50\1\47\1\37\1\44\1\7\3\50\1\45\1\17\1\21\1\50\1\25\1\20\1\26\1\36\1\46\12\43\1\24\1\4\1\50\1\3\2\50\1\22\2\41\1\2\1\41\1\13\10\41\1\35\1\41\1\15\12\41\1\5\1\50\1\6\1\42\1\30\1\50\1\41\1\27\1\1\1\31\1\12\3\41\1\23\6\41\1\14\2\41\1\33\1\16\1\34\1\32\4\41\1\10\1\50\1\11\1\40\uff81\50",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\7\53\1\52\6\53\1\51\13\53",
            "\12\53\7\uffff\16\53\1\55\13\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "",
            "\1\62",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\27\53\1\65\2\53",
            "\12\53\7\uffff\27\53\1\66\2\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\24\53\1\67\5\53",
            "\12\53\7\uffff\24\53\1\70\5\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\7\53\1\71\22\53",
            "",
            "",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\3\53\1\76\11\53\1\77\14\53",
            "\1\100",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\16\53\1\103\13\53",
            "\12\53\7\uffff\1\53\1\104\30\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\16\53\1\105\13\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\16\53\1\106\13\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\10\53\1\107\21\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\15\53\1\110\14\53",
            "\12\53\7\uffff\1\111\31\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\32\115\4\uffff\1\115\1\uffff\32\115",
            "",
            "\0\117",
            "\0\117",
            "\1\120\4\uffff\1\121",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\15\53\1\123\14\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\1\124\31\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\7\uffff\15\53\1\125\14\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\10\53\1\127\12\53\1\126\6\53",
            "\12\53\7\uffff\10\53\1\131\12\53\1\130\6\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\21\53\1\132\10\53",
            "\12\53\7\uffff\21\53\1\133\10\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\21\53\1\134\10\53",
            "",
            "",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\136\6\53",
            "",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\16\53\1\137\13\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\16\53\1\140\13\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\24\53\1\141\5\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\10\53\1\142\21\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\6\53\1\143\23\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\22\53\1\144\7\53",
            "\12\53\7\uffff\15\53\1\145\14\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\22\53\1\146\7\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\21\53\1\147\10\53",
            "\12\53\7\uffff\22\53\1\150\7\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\151\25\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\22\53\1\152\7\53",
            "\12\53\7\uffff\4\53\1\153\25\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\22\53\1\154\7\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\155\25\53",
            "\12\53\7\uffff\4\53\1\156\25\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\157\25\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\13\53\1\161\16\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\16\53\1\162\13\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\1\53\1\163\30\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\3\53\1\164\26\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\15\53\1\165\14\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\10\53\1\166\21\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\170\6\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\23\53\1\172\6\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\21\53\1\173\10\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\174\6\53",
            "\12\53\7\uffff\21\53\1\175\10\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\23\53\1\176\6\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\1\u0081\31\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\13\53\1\u0083\16\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\13\53\1\u0084\16\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u0086\25\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\6\53\1\u0087\23\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\15\53\1\u008a\14\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\22\53\1\u008b\7\53",
            "\12\53\7\uffff\15\53\1\u008c\14\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\22\53\1\u008d\7\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\3\53\1\u008e\26\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u0090\25\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\3\53\1\u0091\26\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\15\53\1\u0092\14\53",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\u0094\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\u0096\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u009a\25\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\7\53\1\u009c\3\53\1\u009d\2\53\1\u009b\13\53",
            "",
            "\12\53\7\uffff\7\53\1\u009f\3\53\1\u00a0\2\53\1\u009e\13\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\3\53\1\u00a1\26\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\u00a2\6\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\10\53\1\u00a3\21\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\16\53\1\u00a4\13\53",
            "\12\53\7\uffff\23\53\1\u00a5\6\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\10\53\1\u00a6\21\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\16\53\1\u00a7\13\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\7\53\1\u00a9\22\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\6\53\1\u00aa\23\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\26\53\1\u00ab\3\53",
            "\12\53\7\uffff\7\53\1\u00ac\22\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\6\53\1\u00ad\23\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\26\53\1\u00ae\3\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u00af\25\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\7\53\1\u00b0\22\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u00b1\25\53",
            "\12\53\7\uffff\4\53\1\u00b2\25\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\7\53\1\u00b3\22\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\4\53\1\u00b4\25\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\21\53\1\u00b5\10\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u00b6\25\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\21\53\1\u00b7\10\53",
            "\12\53\7\uffff\21\53\1\u00b8\10\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\4\53\1\u00b9\25\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\21\53\1\u00ba\10\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\21\53\1\u00bc\10\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\21\53\1\u00bf\10\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | RULE_TIDENTIFIER | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_37 = input.LA(1);

                        s = -1;
                        if ( ((LA13_37>='\u0000' && LA13_37<='\uFFFF')) ) {s = 79;}

                        else s = 40;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_36 = input.LA(1);

                        s = -1;
                        if ( ((LA13_36>='\u0000' && LA13_36<='\uFFFF')) ) {s = 79;}

                        else s = 40;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='c') ) {s = 1;}

                        else if ( (LA13_0=='C') ) {s = 2;}

                        else if ( (LA13_0=='=') ) {s = 3;}

                        else if ( (LA13_0==';') ) {s = 4;}

                        else if ( (LA13_0=='[') ) {s = 5;}

                        else if ( (LA13_0==']') ) {s = 6;}

                        else if ( (LA13_0=='#') ) {s = 7;}

                        else if ( (LA13_0=='{') ) {s = 8;}

                        else if ( (LA13_0=='}') ) {s = 9;}

                        else if ( (LA13_0=='e') ) {s = 10;}

                        else if ( (LA13_0=='E') ) {s = 11;}

                        else if ( (LA13_0=='p') ) {s = 12;}

                        else if ( (LA13_0=='P') ) {s = 13;}

                        else if ( (LA13_0=='t') ) {s = 14;}

                        else if ( (LA13_0=='(') ) {s = 15;}

                        else if ( (LA13_0==',') ) {s = 16;}

                        else if ( (LA13_0==')') ) {s = 17;}

                        else if ( (LA13_0=='@') ) {s = 18;}

                        else if ( (LA13_0=='i') ) {s = 19;}

                        else if ( (LA13_0==':') ) {s = 20;}

                        else if ( (LA13_0=='+') ) {s = 21;}

                        else if ( (LA13_0=='-') ) {s = 22;}

                        else if ( (LA13_0=='b') ) {s = 23;}

                        else if ( (LA13_0=='_') ) {s = 24;}

                        else if ( (LA13_0=='d') ) {s = 25;}

                        else if ( (LA13_0=='v') ) {s = 26;}

                        else if ( (LA13_0=='s') ) {s = 27;}

                        else if ( (LA13_0=='u') ) {s = 28;}

                        else if ( (LA13_0=='N') ) {s = 29;}

                        else if ( (LA13_0=='.') ) {s = 30;}

                        else if ( (LA13_0=='!') ) {s = 31;}

                        else if ( (LA13_0=='~') ) {s = 32;}

                        else if ( ((LA13_0>='A' && LA13_0<='B')||LA13_0=='D'||(LA13_0>='F' && LA13_0<='M')||LA13_0=='O'||(LA13_0>='Q' && LA13_0<='Z')||LA13_0=='a'||(LA13_0>='f' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='o')||(LA13_0>='q' && LA13_0<='r')||(LA13_0>='w' && LA13_0<='z')) ) {s = 33;}

                        else if ( (LA13_0=='^') ) {s = 34;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 35;}

                        else if ( (LA13_0=='\"') ) {s = 36;}

                        else if ( (LA13_0=='\'') ) {s = 37;}

                        else if ( (LA13_0=='/') ) {s = 38;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 39;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||(LA13_0>='$' && LA13_0<='&')||LA13_0=='*'||LA13_0=='<'||(LA13_0>='>' && LA13_0<='?')||LA13_0=='\\'||LA13_0=='`'||LA13_0=='|'||(LA13_0>='\u007F' && LA13_0<='\uFFFF')) ) {s = 40;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}