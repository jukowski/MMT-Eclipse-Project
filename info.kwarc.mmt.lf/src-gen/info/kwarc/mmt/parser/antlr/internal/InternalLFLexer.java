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
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ML2_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int RULE_WS=6;

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

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:11:7: ( '.' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:11:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:12:7: ( '://' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:12:9: '://'
            {
            match("://"); 


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
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:13:7: ( '/' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:13:9: '/'
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:15:7: ( '%read' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:15:9: '%read'
            {
            match("%read"); 


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
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:16:7: ( '%namespace' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:16:9: '%namespace'
            {
            match("%namespace"); 


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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:18:7: ( '%sig' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:18:9: '%sig'
            {
            match("%sig"); 


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
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:19:7: ( '{' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:19:9: '{'
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
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:20:7: ( '}' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:20:9: '}'
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
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:21:7: ( ':' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:21:9: ':'
            {
            match(':'); 

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
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:22:7: ( ':=' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:22:9: ':='
            {
            match(":="); 


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
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:23:7: ( '%include' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:23:9: '%include'
            {
            match("%include"); 


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
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:24:7: ( '%struct' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:24:9: '%struct'
            {
            match("%struct"); 


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
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:25:7: ( '%view' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:25:9: '%view'
            {
            match("%view"); 


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
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:26:7: ( '->' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:26:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:770:10: ( ( '0' .. '9' )+ )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:770:12: ( '0' .. '9' )+
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:770:12: ( '0' .. '9' )+
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
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:770:13: '0' .. '9'
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:772:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:772:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:772:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\t' && LA2_0<='\n')||LA2_0=='\r'||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:
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
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:774:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:774:11: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:774:11: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:776:17: ( '%{' ( options {greedy=false; } : . )* '}%' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:776:19: '%{' ( options {greedy=false; } : . )* '}%'
            {
            match("%{"); 

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:776:24: ( options {greedy=false; } : . )*
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
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:776:52: .
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
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:778:18: ( '%*' ( options {greedy=false; } : . )* '*%' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:778:20: '%*' ( options {greedy=false; } : . )* '*%'
            {
            match("%*"); 

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:778:25: ( options {greedy=false; } : . )*
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
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:778:53: .
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
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:780:17: ( '%' ( ' ' | '%' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:780:19: '%' ( ' ' | '%' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('%'); 
            if ( input.LA(1)==' '||input.LA(1)=='%' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:780:33: (~ ( ( '\\n' | '\\r' ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:780:33: ~ ( ( '\\n' | '\\r' ) )
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

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:780:49: ( ( '\\r' )? '\\n' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\n'||LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:780:50: ( '\\r' )? '\\n'
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:780:50: ( '\\r' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='\r') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:780:50: '\\r'
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
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:782:16: ( . )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:782:18: .
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
        // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | RULE_INT | RULE_WS | RULE_ID | RULE_ML_COMMENT | RULE_ML2_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER )
        int alt9=23;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:106: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 18 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:115: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 19 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:123: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 20 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:131: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 21 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:147: RULE_ML2_COMMENT
                {
                mRULE_ML2_COMMENT(); 

                }
                break;
            case 22 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:164: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 23 :
                // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1:180: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\1\15\1\uffff\1\22\2\uffff\1\16\3\uffff\1\16\1\41\27\uffff\1\41"+
        "\3\uffff";
    static final String DFA9_eofS =
        "\46\uffff";
    static final String DFA9_minS =
        "\1\0\1\uffff\1\57\2\uffff\1\40\3\uffff\1\76\1\60\14\uffff\1\151"+
        "\12\uffff\1\60\3\uffff";
    static final String DFA9_maxS =
        "\1\uffff\1\uffff\1\75\2\uffff\1\173\3\uffff\1\76\1\172\14\uffff"+
        "\1\164\12\uffff\1\172\3\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\uffff\1\7\1\11\1\12\2\uffff\1\22"+
        "\2\23\1\27\1\1\1\2\1\14\1\13\1\3\1\4\1\5\1\6\1\uffff\1\15\1\17\1"+
        "\24\1\25\1\26\1\7\1\11\1\12\1\20\1\21\1\uffff\1\22\1\10\1\16";
    static final String DFA9_specialS =
        "\1\0\45\uffff}>";
    static final String[] DFA9_transitionS = {
            "\11\16\2\13\2\16\1\13\22\16\1\13\1\16\1\4\2\16\1\5\7\16\1\11"+
            "\1\1\1\3\12\12\1\2\2\16\1\6\3\16\32\14\6\16\32\14\1\7\1\16\1"+
            "\10\uff82\16",
            "",
            "\1\20\15\uffff\1\21",
            "",
            "",
            "\1\34\4\uffff\1\34\4\uffff\1\33\76\uffff\1\30\4\uffff\1\26"+
            "\3\uffff\1\25\1\27\2\uffff\1\31\4\uffff\1\32",
            "",
            "",
            "",
            "\1\40",
            "\12\42\7\uffff\32\15\6\uffff\32\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\44\12\uffff\1\45",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\42\7\uffff\32\15\6\uffff\32\15",
            "",
            "",
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
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | RULE_INT | RULE_WS | RULE_ID | RULE_ML_COMMENT | RULE_ML2_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_0 = input.LA(1);

                        s = -1;
                        if ( (LA9_0=='.') ) {s = 1;}

                        else if ( (LA9_0==':') ) {s = 2;}

                        else if ( (LA9_0=='/') ) {s = 3;}

                        else if ( (LA9_0=='\"') ) {s = 4;}

                        else if ( (LA9_0=='%') ) {s = 5;}

                        else if ( (LA9_0=='=') ) {s = 6;}

                        else if ( (LA9_0=='{') ) {s = 7;}

                        else if ( (LA9_0=='}') ) {s = 8;}

                        else if ( (LA9_0=='-') ) {s = 9;}

                        else if ( ((LA9_0>='0' && LA9_0<='9')) ) {s = 10;}

                        else if ( ((LA9_0>='\t' && LA9_0<='\n')||LA9_0=='\r'||LA9_0==' ') ) {s = 11;}

                        else if ( ((LA9_0>='A' && LA9_0<='Z')||(LA9_0>='a' && LA9_0<='z')) ) {s = 12;}

                        else if ( ((LA9_0>='\u0000' && LA9_0<='\b')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\u001F')||LA9_0=='!'||(LA9_0>='#' && LA9_0<='$')||(LA9_0>='&' && LA9_0<=',')||(LA9_0>=';' && LA9_0<='<')||(LA9_0>='>' && LA9_0<='@')||(LA9_0>='[' && LA9_0<='`')||LA9_0=='|'||(LA9_0>='~' && LA9_0<='\uFFFF')) ) {s = 14;}

                        else s = 13;

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