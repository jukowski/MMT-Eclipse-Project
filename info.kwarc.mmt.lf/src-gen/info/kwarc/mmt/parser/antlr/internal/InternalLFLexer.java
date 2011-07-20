package info.kwarc.mmt.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLFLexer extends Lexer {
    public static final int RULE_SP=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_CID=9;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=7;
    public static final int RULE_ML_COMMENT=5;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_MULTIPLEDOT=12;
    public static final int T__32=32;
    public static final int T__16=16;
    public static final int T__33=33;
    public static final int T__15=15;
    public static final int T__34=34;
    public static final int T__18=18;
    public static final int T__35=35;
    public static final int T__17=17;
    public static final int T__36=36;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ML2_COMMENT=6;
    public static final int RULE_INT=11;
    public static final int RULE_DOUBLEDOT=8;

    // delegates
    // delegators

    public InternalLFLexer() {;} 
    public InternalLFLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalLFLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:11:7: ( '/' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:11:9: '/'
            {
            match('/'); 

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
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:12:7: ( '.' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:12:9: '.'
            {
            match('.'); 

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
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:13:7: ( ':' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:13:9: ':'
            {
            match(':'); 

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
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:14:7: ( '\"' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:14:9: '\"'
            {
            match('\"'); 

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
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:15:7: ( '%' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:15:9: '%'
            {
            match('%'); 

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
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:16:7: ( 'namespace' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:16:9: 'namespace'
            {
            match("namespace"); 


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
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:17:7: ( '=' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:17:9: '='
            {
            match('='); 

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
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:18:7: ( 'read' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:18:9: 'read'
            {
            match("read"); 


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
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:19:7: ( '->' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:19:9: '->'
            {
            match("->"); 


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
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:20:7: ( '{' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:20:9: '{'
            {
            match('{'); 

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
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:21:7: ( '}' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:21:9: '}'
            {
            match('}'); 

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
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:22:7: ( 'sig' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:22:9: 'sig'
            {
            match("sig"); 


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
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:23:7: ( 'meta' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:23:9: 'meta'
            {
            match("meta"); 


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
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:24:7: ( 'abbrev' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:24:9: 'abbrev'
            {
            match("abbrev"); 


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
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:25:7: ( 'name' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:25:9: 'name'
            {
            match("name"); 


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
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:26:7: ( 'pattern' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:26:9: 'pattern'
            {
            match("pattern"); 


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
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:27:7: ( 'infix' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:27:9: 'infix'
            {
            match("infix"); 


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
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:28:7: ( 'prefix' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:28:9: 'prefix'
            {
            match("prefix"); 


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
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:29:7: ( 'postfix' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:29:9: 'postfix'
            {
            match("postfix"); 


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
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:30:7: ( ':=' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:30:9: ':='
            {
            match(":="); 


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
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:31:7: ( 'include' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:31:9: 'include'
            {
            match("include"); 


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
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:32:7: ( 'struct' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:32:9: 'struct'
            {
            match("struct"); 


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
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:33:7: ( 'open' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:33:9: 'open'
            {
            match("open"); 


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
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:34:7: ( 'view' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:34:9: 'view'
            {
            match("view"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1837:10: ( ( '0' .. '9' )+ )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1837:12: ( '0' .. '9' )+
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1837:12: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1837:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_SP"
    public final void mRULE_SP() throws RecognitionException {
        try {
            int _type = RULE_SP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1839:9: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1839:11: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SP"

    // $ANTLR start "RULE_DOUBLEDOT"
    public final void mRULE_DOUBLEDOT() throws RecognitionException {
        try {
            int _type = RULE_DOUBLEDOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1841:16: ( '..' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1841:18: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLEDOT"

    // $ANTLR start "RULE_MULTIPLEDOT"
    public final void mRULE_MULTIPLEDOT() throws RecognitionException {
        try {
            int _type = RULE_MULTIPLEDOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1843:18: ( RULE_DOUBLEDOT ( '.' )+ )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1843:20: RULE_DOUBLEDOT ( '.' )+
            {
            mRULE_DOUBLEDOT(); 
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1843:35: ( '.' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='.') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1843:35: '.'
            	    {
            	    match('.'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MULTIPLEDOT"

    // $ANTLR start "RULE_CID"
    public final void mRULE_CID() throws RecognitionException {
        try {
            int _type = RULE_CID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1845:10: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '_' | '#' | '?' )+ )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1845:12: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '_' | '#' | '?' )+
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1845:12: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '_' | '#' | '?' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='#'||LA3_0=='-'||(LA3_0>='0' && LA3_0<='9')||LA3_0=='?'||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:
            	    {
            	    if ( input.LA(1)=='#'||input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='?'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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
    // $ANTLR end "RULE_CID"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1847:17: ( '%{' ( options {greedy=false; } : . )* '}%' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1847:19: '%{' ( options {greedy=false; } : . )* '}%'
            {
            match("%{"); 

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1847:24: ( options {greedy=false; } : . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='}') ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1=='%') ) {
                        alt4=2;
                    }
                    else if ( ((LA4_1>='\u0000' && LA4_1<='$')||(LA4_1>='&' && LA4_1<='\uFFFF')) ) {
                        alt4=1;
                    }


                }
                else if ( ((LA4_0>='\u0000' && LA4_0<='|')||(LA4_0>='~' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1847:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match("}%"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_ML2_COMMENT"
    public final void mRULE_ML2_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML2_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1849:18: ( '%*' ( options {greedy=false; } : . )* '*%' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1849:20: '%*' ( options {greedy=false; } : . )* '*%'
            {
            match("%*"); 

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1849:25: ( options {greedy=false; } : . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='*') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='%') ) {
                        alt5=2;
                    }
                    else if ( ((LA5_1>='\u0000' && LA5_1<='$')||(LA5_1>='&' && LA5_1<='\uFFFF')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0>='\u0000' && LA5_0<=')')||(LA5_0>='+' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1849:53: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match("*%"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML2_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1851:17: ( '%' ( ' ' | '%' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1851:19: '%' ( ' ' | '%' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('%'); 
            if ( input.LA(1)==' '||input.LA(1)=='%' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1851:33: (~ ( ( '\\n' | '\\r' ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1851:33: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop6;
                }
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1851:49: ( ( '\\r' )? '\\n' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\n'||LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1851:50: ( '\\r' )? '\\n'
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1851:50: ( '\\r' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='\r') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1851:50: '\\r'
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

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1853:16: ( . )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1853:18: .
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
        // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | RULE_INT | RULE_SP | RULE_DOUBLEDOT | RULE_MULTIPLEDOT | RULE_CID | RULE_ML_COMMENT | RULE_ML2_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER )
        int alt9=33;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:154: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 26 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:163: RULE_SP
                {
                mRULE_SP(); 

                }
                break;
            case 27 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:171: RULE_DOUBLEDOT
                {
                mRULE_DOUBLEDOT(); 

                }
                break;
            case 28 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:186: RULE_MULTIPLEDOT
                {
                mRULE_MULTIPLEDOT(); 

                }
                break;
            case 29 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:203: RULE_CID
                {
                mRULE_CID(); 

                }
                break;
            case 30 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:212: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 31 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:228: RULE_ML2_COMMENT
                {
                mRULE_ML2_COMMENT(); 

                }
                break;
            case 32 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:245: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 33 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:261: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\2\uffff\1\31\1\33\1\uffff\1\40\1\42\1\uffff\2\42\2\uffff\7\42\1"+
        "\62\4\uffff\1\65\10\uffff\1\42\2\uffff\1\42\3\uffff\12\42\1\uffff"+
        "\1\62\3\uffff\2\42\1\106\12\42\1\122\1\123\1\uffff\1\42\1\125\6"+
        "\42\1\134\1\135\1\42\2\uffff\1\42\1\uffff\4\42\1\144\1\42\2\uffff"+
        "\1\42\1\147\1\150\1\42\1\152\1\42\1\uffff\2\42\2\uffff\1\156\1\uffff"+
        "\1\157\1\160\1\42\3\uffff\1\162\1\uffff";
    static final String DFA9_eofS =
        "\163\uffff";
    static final String DFA9_minS =
        "\1\0\1\uffff\1\56\1\75\1\uffff\1\40\1\141\1\uffff\1\145\1\76\2\uffff"+
        "\1\151\1\145\1\142\1\141\1\156\1\160\1\151\1\43\4\uffff\1\56\10"+
        "\uffff\1\155\2\uffff\1\141\3\uffff\1\147\1\162\1\164\1\142\1\164"+
        "\1\145\1\163\1\143\2\145\1\uffff\1\43\3\uffff\1\145\1\144\1\43\1"+
        "\165\1\141\1\162\1\164\1\146\1\164\1\151\1\154\1\156\1\167\2\43"+
        "\1\uffff\1\143\1\43\2\145\1\151\1\146\1\170\1\165\2\43\1\160\2\uffff"+
        "\1\164\1\uffff\1\166\1\162\1\170\1\151\1\43\1\144\2\uffff\1\141"+
        "\2\43\1\156\1\43\1\170\1\uffff\1\145\1\143\2\uffff\1\43\1\uffff"+
        "\2\43\1\145\3\uffff\1\43\1\uffff";
    static final String DFA9_maxS =
        "\1\uffff\1\uffff\1\56\1\75\1\uffff\1\173\1\141\1\uffff\1\145\1\76"+
        "\2\uffff\1\164\1\145\1\142\1\162\1\156\1\160\1\151\1\172\4\uffff"+
        "\1\56\10\uffff\1\155\2\uffff\1\141\3\uffff\1\147\1\162\1\164\1\142"+
        "\1\164\1\145\1\163\1\146\2\145\1\uffff\1\172\3\uffff\1\145\1\144"+
        "\1\172\1\165\1\141\1\162\1\164\1\146\1\164\1\151\1\154\1\156\1\167"+
        "\2\172\1\uffff\1\143\1\172\2\145\1\151\1\146\1\170\1\165\2\172\1"+
        "\160\2\uffff\1\164\1\uffff\1\166\1\162\1\170\1\151\1\172\1\144\2"+
        "\uffff\1\141\2\172\1\156\1\172\1\170\1\uffff\1\145\1\143\2\uffff"+
        "\1\172\1\uffff\2\172\1\145\3\uffff\1\172\1\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\2\uffff\1\4\2\uffff\1\7\2\uffff\1\12\1\13\10\uffff"+
        "\1\32\1\35\1\41\1\1\1\uffff\1\2\1\24\1\3\1\4\1\36\1\37\1\40\1\5"+
        "\1\uffff\1\35\1\7\1\uffff\1\11\1\12\1\13\12\uffff\1\31\1\uffff\1"+
        "\32\1\33\1\34\17\uffff\1\14\13\uffff\1\17\1\10\1\uffff\1\15\6\uffff"+
        "\1\27\1\30\6\uffff\1\21\2\uffff\1\26\1\16\1\uffff\1\22\3\uffff\1"+
        "\20\1\23\1\25\1\uffff\1\6";
    static final String DFA9_specialS =
        "\1\0\162\uffff}>";
    static final String[] DFA9_transitionS = {
            "\11\26\2\24\2\26\1\24\22\26\1\24\1\26\1\4\1\25\1\26\1\5\7\26"+
            "\1\11\1\2\1\1\12\23\1\3\2\26\1\7\1\26\1\25\1\26\32\25\4\26\1"+
            "\25\1\26\1\16\7\25\1\20\3\25\1\15\1\6\1\21\1\17\1\25\1\10\1"+
            "\14\2\25\1\22\4\25\1\12\1\26\1\13\uff82\26",
            "",
            "\1\30",
            "\1\32",
            "",
            "\1\37\4\uffff\1\37\4\uffff\1\36\120\uffff\1\35",
            "\1\41",
            "",
            "\1\44",
            "\1\45",
            "",
            "",
            "\1\50\12\uffff\1\51",
            "\1\52",
            "\1\53",
            "\1\54\15\uffff\1\56\2\uffff\1\55",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\42\11\uffff\1\42\2\uffff\12\63\5\uffff\1\42\1\uffff\32\42"+
            "\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "",
            "",
            "\1\66",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\67",
            "",
            "",
            "\1\70",
            "",
            "",
            "",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\101\2\uffff\1\100",
            "\1\102",
            "\1\103",
            "",
            "\1\42\11\uffff\1\42\2\uffff\12\63\5\uffff\1\42\1\uffff\32\42"+
            "\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "",
            "\1\104",
            "\1\105",
            "\1\42\11\uffff\1\42\2\uffff\12\42\5\uffff\1\42\1\uffff\32\42"+
            "\4\uffff\1\42\1\uffff\32\42",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\42\11\uffff\1\42\2\uffff\12\42\5\uffff\1\42\1\uffff\32\42"+
            "\4\uffff\1\42\1\uffff\22\42\1\121\7\42",
            "\1\42\11\uffff\1\42\2\uffff\12\42\5\uffff\1\42\1\uffff\32\42"+
            "\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\124",
            "\1\42\11\uffff\1\42\2\uffff\12\42\5\uffff\1\42\1\uffff\32\42"+
            "\4\uffff\1\42\1\uffff\32\42",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\42\11\uffff\1\42\2\uffff\12\42\5\uffff\1\42\1\uffff\32\42"+
            "\4\uffff\1\42\1\uffff\32\42",
            "\1\42\11\uffff\1\42\2\uffff\12\42\5\uffff\1\42\1\uffff\32\42"+
            "\4\uffff\1\42\1\uffff\32\42",
            "\1\136",
            "",
            "",
            "\1\137",
            "",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\42\11\uffff\1\42\2\uffff\12\42\5\uffff\1\42\1\uffff\32\42"+
            "\4\uffff\1\42\1\uffff\32\42",
            "\1\145",
            "",
            "",
            "\1\146",
            "\1\42\11\uffff\1\42\2\uffff\12\42\5\uffff\1\42\1\uffff\32\42"+
            "\4\uffff\1\42\1\uffff\32\42",
            "\1\42\11\uffff\1\42\2\uffff\12\42\5\uffff\1\42\1\uffff\32\42"+
            "\4\uffff\1\42\1\uffff\32\42",
            "\1\151",
            "\1\42\11\uffff\1\42\2\uffff\12\42\5\uffff\1\42\1\uffff\32\42"+
            "\4\uffff\1\42\1\uffff\32\42",
            "\1\153",
            "",
            "\1\154",
            "\1\155",
            "",
            "",
            "\1\42\11\uffff\1\42\2\uffff\12\42\5\uffff\1\42\1\uffff\32\42"+
            "\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\42\11\uffff\1\42\2\uffff\12\42\5\uffff\1\42\1\uffff\32\42"+
            "\4\uffff\1\42\1\uffff\32\42",
            "\1\42\11\uffff\1\42\2\uffff\12\42\5\uffff\1\42\1\uffff\32\42"+
            "\4\uffff\1\42\1\uffff\32\42",
            "\1\161",
            "",
            "",
            "",
            "\1\42\11\uffff\1\42\2\uffff\12\42\5\uffff\1\42\1\uffff\32\42"+
            "\4\uffff\1\42\1\uffff\32\42",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | RULE_INT | RULE_SP | RULE_DOUBLEDOT | RULE_MULTIPLEDOT | RULE_CID | RULE_ML_COMMENT | RULE_ML2_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_0 = input.LA(1);

                        s = -1;
                        if ( (LA9_0=='/') ) {s = 1;}

                        else if ( (LA9_0=='.') ) {s = 2;}

                        else if ( (LA9_0==':') ) {s = 3;}

                        else if ( (LA9_0=='\"') ) {s = 4;}

                        else if ( (LA9_0=='%') ) {s = 5;}

                        else if ( (LA9_0=='n') ) {s = 6;}

                        else if ( (LA9_0=='=') ) {s = 7;}

                        else if ( (LA9_0=='r') ) {s = 8;}

                        else if ( (LA9_0=='-') ) {s = 9;}

                        else if ( (LA9_0=='{') ) {s = 10;}

                        else if ( (LA9_0=='}') ) {s = 11;}

                        else if ( (LA9_0=='s') ) {s = 12;}

                        else if ( (LA9_0=='m') ) {s = 13;}

                        else if ( (LA9_0=='a') ) {s = 14;}

                        else if ( (LA9_0=='p') ) {s = 15;}

                        else if ( (LA9_0=='i') ) {s = 16;}

                        else if ( (LA9_0=='o') ) {s = 17;}

                        else if ( (LA9_0=='v') ) {s = 18;}

                        else if ( ((LA9_0>='0' && LA9_0<='9')) ) {s = 19;}

                        else if ( ((LA9_0>='\t' && LA9_0<='\n')||LA9_0=='\r'||LA9_0==' ') ) {s = 20;}

                        else if ( (LA9_0=='#'||LA9_0=='?'||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='b' && LA9_0<='h')||(LA9_0>='j' && LA9_0<='l')||LA9_0=='q'||(LA9_0>='t' && LA9_0<='u')||(LA9_0>='w' && LA9_0<='z')) ) {s = 21;}

                        else if ( ((LA9_0>='\u0000' && LA9_0<='\b')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\u001F')||LA9_0=='!'||LA9_0=='$'||(LA9_0>='&' && LA9_0<=',')||(LA9_0>=';' && LA9_0<='<')||LA9_0=='>'||LA9_0=='@'||(LA9_0>='[' && LA9_0<='^')||LA9_0=='`'||LA9_0=='|'||(LA9_0>='~' && LA9_0<='\uFFFF')) ) {s = 22;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}