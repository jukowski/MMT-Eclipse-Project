package info.kwarc.mmt.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLFLexer extends Lexer {
    public static final int RULE_QUOTE=6;
    public static final int RULE_PERCENT=4;
    public static final int RULE_LBRACKET=11;
    public static final int RULE_LSBRACKET=9;
    public static final int EOF=-1;
    public static final int RULE_INFIXRIGHT=30;
    public static final int RULE_ILLEGAL_TOKEN=22;
    public static final int RULE_ASSIGN=17;
    public static final int RULE_LARROW=15;
    public static final int RULE_UNKNOWNDIRECTIVE=27;
    public static final int RULE_DOT=13;
    public static final int RULE_ML2_COMMENT=26;
    public static final int RULE_INFIXNONE=28;
    public static final int RULE_RBRACKET=12;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__44=44;
    public static final int RULE_RCBRACKET=8;
    public static final int T__45=45;
    public static final int RULE_LCBRACKET=7;
    public static final int RULE_RSBRACKET=10;
    public static final int RULE_UNDERSCORE=19;
    public static final int RULE_URISTRING=21;
    public static final int RULE_CID=20;
    public static final int RULE_LINESP=23;
    public static final int RULE_ML_COMMENT=25;
    public static final int RULE_COLON=5;
    public static final int T__32=32;
    public static final int RULE_TYPE=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_ARROW=14;
    public static final int RULE_INFIXLEFT=29;
    public static final int RULE_LINE_COMMENT=31;
    public static final int RULE_LINEDELIM=24;
    public static final int RULE_EQUALS=16;

    // delegates
    // delegators

    public InternalLFLexer() {;} 
    public InternalLFLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalLFLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g"; }

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:11:7: ( '%struct' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:11:9: '%struct'
            {
            match("%struct"); 


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
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:12:7: ( '%meta' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:12:9: '%meta'
            {
            match("%meta"); 


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
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13:7: ( '%include' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13:9: '%include'
            {
            match("%include"); 


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
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:14:7: ( '%namespace' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:14:9: '%namespace'
            {
            match("%namespace"); 


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
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:15:7: ( '%read' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:15:9: '%read'
            {
            match("%read"); 


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
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:16:7: ( '%sig' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:16:9: '%sig'
            {
            match("%sig"); 


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
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:17:7: ( '%view' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:17:9: '%view'
            {
            match("%view"); 


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
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:18:7: ( '%implicit' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:18:9: '%implicit'
            {
            match("%implicit"); 


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
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:19:7: ( '%open' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:19:9: '%open'
            {
            match("%open"); 


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
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:20:7: ( '%as' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:20:9: '%as'
            {
            match("%as"); 


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
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:21:7: ( '%abbrev' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:21:9: '%abbrev'
            {
            match("%abbrev"); 


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
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:22:7: ( '%name' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:22:9: '%name'
            {
            match("%name"); 


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
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:23:7: ( '%prefix' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:23:9: '%prefix'
            {
            match("%prefix"); 


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
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:24:7: ( '%postfix' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:24:9: '%postfix'
            {
            match("%postfix"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13916:17: ( '%{' ( options {greedy=false; } : . )* '}%' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13916:19: '%{' ( options {greedy=false; } : . )* '}%'
            {
            match("%{"); 

            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13916:24: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='}') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='%') ) {
                        alt1=2;
                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='$')||(LA1_1>='&' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='|')||(LA1_0>='~' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13916:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
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
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13918:18: ( '%*' ( options {greedy=false; } : . )* '*%' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13918:20: '%*' ( options {greedy=false; } : . )* '*%'
            {
            match("%*"); 

            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13918:25: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='*') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='%') ) {
                        alt2=2;
                    }
                    else if ( ((LA2_1>='\u0000' && LA2_1<='$')||(LA2_1>='&' && LA2_1<='\uFFFF')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0>='\u0000' && LA2_0<=')')||(LA2_0>='+' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13918:53: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
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

    // $ANTLR start "RULE_LINE_COMMENT"
    public final void mRULE_LINE_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13920:19: ( RULE_PERCENT ( ( RULE_LINESP | RULE_PERCENT ) (~ ( ( '\\r' | '\\n' ) ) )* )? ( '\\r' )? '\\n' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13920:21: RULE_PERCENT ( ( RULE_LINESP | RULE_PERCENT ) (~ ( ( '\\r' | '\\n' ) ) )* )? ( '\\r' )? '\\n'
            {
            mRULE_PERCENT(); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13920:34: ( ( RULE_LINESP | RULE_PERCENT ) (~ ( ( '\\r' | '\\n' ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\t'||LA4_0==' '||LA4_0=='%') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13920:35: ( RULE_LINESP | RULE_PERCENT ) (~ ( ( '\\r' | '\\n' ) ) )*
                    {
                    if ( input.LA(1)=='\t'||input.LA(1)==' '||input.LA(1)=='%' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13920:62: (~ ( ( '\\r' | '\\n' ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13920:62: ~ ( ( '\\r' | '\\n' ) )
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
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13920:80: ( '\\r' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\r') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13920:80: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LINE_COMMENT"

    // $ANTLR start "RULE_PERCENT"
    public final void mRULE_PERCENT() throws RecognitionException {
        try {
            int _type = RULE_PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13922:14: ( '%' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13922:16: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PERCENT"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            int _type = RULE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13924:12: ( ':' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13924:14: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON"

    // $ANTLR start "RULE_QUOTE"
    public final void mRULE_QUOTE() throws RecognitionException {
        try {
            int _type = RULE_QUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13926:12: ( '\"' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13926:14: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_QUOTE"

    // $ANTLR start "RULE_LCBRACKET"
    public final void mRULE_LCBRACKET() throws RecognitionException {
        try {
            int _type = RULE_LCBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13928:16: ( '{' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13928:18: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LCBRACKET"

    // $ANTLR start "RULE_RCBRACKET"
    public final void mRULE_RCBRACKET() throws RecognitionException {
        try {
            int _type = RULE_RCBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13930:16: ( '}' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13930:18: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RCBRACKET"

    // $ANTLR start "RULE_LSBRACKET"
    public final void mRULE_LSBRACKET() throws RecognitionException {
        try {
            int _type = RULE_LSBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13932:16: ( '[' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13932:18: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LSBRACKET"

    // $ANTLR start "RULE_RSBRACKET"
    public final void mRULE_RSBRACKET() throws RecognitionException {
        try {
            int _type = RULE_RSBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13934:16: ( ']' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13934:18: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RSBRACKET"

    // $ANTLR start "RULE_LBRACKET"
    public final void mRULE_LBRACKET() throws RecognitionException {
        try {
            int _type = RULE_LBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13936:15: ( '(' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13936:17: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LBRACKET"

    // $ANTLR start "RULE_RBRACKET"
    public final void mRULE_RBRACKET() throws RecognitionException {
        try {
            int _type = RULE_RBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13938:15: ( ')' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13938:17: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RBRACKET"

    // $ANTLR start "RULE_DOT"
    public final void mRULE_DOT() throws RecognitionException {
        try {
            int _type = RULE_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13940:10: ( '.' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13940:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOT"

    // $ANTLR start "RULE_LINESP"
    public final void mRULE_LINESP() throws RecognitionException {
        try {
            int _type = RULE_LINESP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13942:13: ( ( ' ' | '\\t' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13942:15: ( ' ' | '\\t' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
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
    // $ANTLR end "RULE_LINESP"

    // $ANTLR start "RULE_LINEDELIM"
    public final void mRULE_LINEDELIM() throws RecognitionException {
        try {
            int _type = RULE_LINEDELIM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13944:16: ( ( '\\r' )? '\\n' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13944:18: ( '\\r' )? '\\n'
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13944:18: ( '\\r' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13944:18: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LINEDELIM"

    // $ANTLR start "RULE_ARROW"
    public final void mRULE_ARROW() throws RecognitionException {
        try {
            int _type = RULE_ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13946:12: ( '->' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13946:14: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ARROW"

    // $ANTLR start "RULE_LARROW"
    public final void mRULE_LARROW() throws RecognitionException {
        try {
            int _type = RULE_LARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13948:13: ( '<-' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13948:15: '<-'
            {
            match("<-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LARROW"

    // $ANTLR start "RULE_EQUALS"
    public final void mRULE_EQUALS() throws RecognitionException {
        try {
            int _type = RULE_EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13950:13: ( '=' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13950:15: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQUALS"

    // $ANTLR start "RULE_ASSIGN"
    public final void mRULE_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13952:13: ( ':=' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13952:15: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ASSIGN"

    // $ANTLR start "RULE_TYPE"
    public final void mRULE_TYPE() throws RecognitionException {
        try {
            int _type = RULE_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13954:11: ( 'type' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13954:13: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TYPE"

    // $ANTLR start "RULE_UNDERSCORE"
    public final void mRULE_UNDERSCORE() throws RecognitionException {
        try {
            int _type = RULE_UNDERSCORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13956:17: ( '_' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13956:19: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNDERSCORE"

    // $ANTLR start "RULE_CID"
    public final void mRULE_CID() throws RecognitionException {
        try {
            int _type = RULE_CID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13958:10: ( (~ ( ( RULE_LINESP | '\\r' | '\\n' | RULE_DOT | RULE_COLON | RULE_LBRACKET | RULE_RBRACKET | RULE_LSBRACKET | RULE_RSBRACKET | RULE_LCBRACKET | RULE_RCBRACKET | RULE_PERCENT | RULE_QUOTE ) ) )+ )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13958:12: (~ ( ( RULE_LINESP | '\\r' | '\\n' | RULE_DOT | RULE_COLON | RULE_LBRACKET | RULE_RBRACKET | RULE_LSBRACKET | RULE_RSBRACKET | RULE_LCBRACKET | RULE_RCBRACKET | RULE_PERCENT | RULE_QUOTE ) ) )+
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13958:12: (~ ( ( RULE_LINESP | '\\r' | '\\n' | RULE_DOT | RULE_COLON | RULE_LBRACKET | RULE_RBRACKET | RULE_LSBRACKET | RULE_RSBRACKET | RULE_LCBRACKET | RULE_RCBRACKET | RULE_PERCENT | RULE_QUOTE ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\b')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\u001F')||LA7_0=='!'||(LA7_0>='#' && LA7_0<='$')||(LA7_0>='&' && LA7_0<='\'')||(LA7_0>='*' && LA7_0<='-')||(LA7_0>='/' && LA7_0<='9')||(LA7_0>=';' && LA7_0<='Z')||LA7_0=='\\'||(LA7_0>='^' && LA7_0<='z')||LA7_0=='|'||(LA7_0>='~' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13958:12: ~ ( ( RULE_LINESP | '\\r' | '\\n' | RULE_DOT | RULE_COLON | RULE_LBRACKET | RULE_RBRACKET | RULE_LSBRACKET | RULE_RSBRACKET | RULE_LCBRACKET | RULE_RCBRACKET | RULE_PERCENT | RULE_QUOTE ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||input.LA(1)=='!'||(input.LA(1)>='#' && input.LA(1)<='$')||(input.LA(1)>='&' && input.LA(1)<='\'')||(input.LA(1)>='*' && input.LA(1)<='-')||(input.LA(1)>='/' && input.LA(1)<='9')||(input.LA(1)>=';' && input.LA(1)<='Z')||input.LA(1)=='\\'||(input.LA(1)>='^' && input.LA(1)<='z')||input.LA(1)=='|'||(input.LA(1)>='~' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CID"

    // $ANTLR start "RULE_UNKNOWNDIRECTIVE"
    public final void mRULE_UNKNOWNDIRECTIVE() throws RecognitionException {
        try {
            int _type = RULE_UNKNOWNDIRECTIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13960:23: ( '%' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+ )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13960:25: '%' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
            {
            match('%'); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13960:29: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:
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
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNKNOWNDIRECTIVE"

    // $ANTLR start "RULE_URISTRING"
    public final void mRULE_URISTRING() throws RecognitionException {
        try {
            int _type = RULE_URISTRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13962:16: ( RULE_QUOTE ( options {greedy=false; } : . )* RULE_QUOTE )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13962:18: RULE_QUOTE ( options {greedy=false; } : . )* RULE_QUOTE
            {
            mRULE_QUOTE(); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13962:29: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\"') ) {
                    alt9=2;
                }
                else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13962:57: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            mRULE_QUOTE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_URISTRING"

    // $ANTLR start "RULE_INFIXNONE"
    public final void mRULE_INFIXNONE() throws RecognitionException {
        try {
            int _type = RULE_INFIXNONE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13964:16: ( '%infix' ( RULE_LINESP )+ 'none' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13964:18: '%infix' ( RULE_LINESP )+ 'none'
            {
            match("%infix"); 

            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13964:27: ( RULE_LINESP )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\t'||LA10_0==' ') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13964:27: RULE_LINESP
            	    {
            	    mRULE_LINESP(); 

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            match("none"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INFIXNONE"

    // $ANTLR start "RULE_INFIXLEFT"
    public final void mRULE_INFIXLEFT() throws RecognitionException {
        try {
            int _type = RULE_INFIXLEFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13966:16: ( '%infix' ( RULE_LINESP )+ 'left' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13966:18: '%infix' ( RULE_LINESP )+ 'left'
            {
            match("%infix"); 

            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13966:27: ( RULE_LINESP )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='\t'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13966:27: RULE_LINESP
            	    {
            	    mRULE_LINESP(); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            match("left"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INFIXLEFT"

    // $ANTLR start "RULE_INFIXRIGHT"
    public final void mRULE_INFIXRIGHT() throws RecognitionException {
        try {
            int _type = RULE_INFIXRIGHT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13968:17: ( '%infix' ( RULE_LINESP )+ 'right' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13968:19: '%infix' ( RULE_LINESP )+ 'right'
            {
            match("%infix"); 

            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13968:28: ( RULE_LINESP )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='\t'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13968:28: RULE_LINESP
            	    {
            	    mRULE_LINESP(); 

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

            match("right"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INFIXRIGHT"

    // $ANTLR start "RULE_ILLEGAL_TOKEN"
    public final void mRULE_ILLEGAL_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_ILLEGAL_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13970:20: ( . )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:13970:22: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ILLEGAL_TOKEN"

    public void mTokens() throws RecognitionException {
        // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1:8: ( T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | RULE_ML_COMMENT | RULE_ML2_COMMENT | RULE_LINE_COMMENT | RULE_PERCENT | RULE_COLON | RULE_QUOTE | RULE_LCBRACKET | RULE_RCBRACKET | RULE_LSBRACKET | RULE_RSBRACKET | RULE_LBRACKET | RULE_RBRACKET | RULE_DOT | RULE_LINESP | RULE_LINEDELIM | RULE_ARROW | RULE_LARROW | RULE_EQUALS | RULE_ASSIGN | RULE_TYPE | RULE_UNDERSCORE | RULE_CID | RULE_UNKNOWNDIRECTIVE | RULE_URISTRING | RULE_INFIXNONE | RULE_INFIXLEFT | RULE_INFIXRIGHT | RULE_ILLEGAL_TOKEN )
        int alt13=42;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1:10: T__32
                {
                mT__32(); 

                }
                break;
            case 2 :
                // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1:16: T__33
                {
                mT__33(); 

                }
                break;
            case 3 :
                // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1:22: T__34
                {
                mT__34(); 

                }
                break;
            case 4 :
                // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1:28: T__35
                {
                mT__35(); 

                }
                break;
            case 5 :
                // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1:34: T__36
                {
                mT__36(); 

                }
                break;
            case 6 :
                // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1:40: T__37
                {
                mT__37(); 

                }
                break;
            case 7 :
                // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1:46: T__38
                {
                mT__38(); 

                }
                break;
            case 8 :
                // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1:52: T__39
                {
                mT__39(); 

                }
                break;
            case 9 :
                // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1:58: T__40
                {
                mT__40(); 

                }
                break;
            case 10 :
                // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1:64: T__41
                {
                mT__41(); 

                }
                break;
            case 11 :
                // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1:70: T__42
                {
                mT__42(); 

                }
                break;
            case 12 :
                // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1:76: T__43
                {
                mT__43(); 

                }
                break;
            case 13 :
                // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1:82: T__44
                {
                mT__44(); 

                }
                break;
            case 14 :
                // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1:88: T__45
                {
                mT__45(); 

                }
                break;
            case 15 :
                // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1:94: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 16 :
                // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1:110: RULE_ML2_COMMENT
                {
                mRULE_ML2_COMMENT(); 

                }
                break;
            case 17 :
                // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1:127: RULE_LINE_COMMENT
                {
                mRULE_LINE_COMMENT(); 

                }
                break;
            case 18 :
                // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1:145: RULE_PERCENT
                {
                mRULE_PERCENT(); 

                }
                break;
            case 19 :
                // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1:158: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 20 :
                // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1:169: RULE_QUOTE
                {
                mRULE_QUOTE(); 

                }
                break;
            case 21 :
                // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1:180: RULE_LCBRACKET
                {
                mRULE_LCBRACKET(); 

                }
                break;
            case 22 :
                // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1:195: RULE_RCBRACKET
                {
                mRULE_RCBRACKET(); 

                }
                break;
            case 23 :
                // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1:210: RULE_LSBRACKET
                {
                mRULE_LSBRACKET(); 

                }
                break;
            case 24 :
                // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1:225: RULE_RSBRACKET
                {
                mRULE_RSBRACKET(); 

                }
                break;
            case 25 :
                // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1:240: RULE_LBRACKET
                {
                mRULE_LBRACKET(); 

                }
                break;
            case 26 :
                // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1:254: RULE_RBRACKET
                {
                mRULE_RBRACKET(); 

                }
                break;
            case 27 :
                // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1:268: RULE_DOT
                {
                mRULE_DOT(); 

                }
                break;
            case 28 :
                // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1:277: RULE_LINESP
                {
                mRULE_LINESP(); 

                }
                break;
            case 29 :
                // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1:289: RULE_LINEDELIM
                {
                mRULE_LINEDELIM(); 

                }
                break;
            case 30 :
                // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1:304: RULE_ARROW
                {
                mRULE_ARROW(); 

                }
                break;
            case 31 :
                // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1:315: RULE_LARROW
                {
                mRULE_LARROW(); 

                }
                break;
            case 32 :
                // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1:327: RULE_EQUALS
                {
                mRULE_EQUALS(); 

                }
                break;
            case 33 :
                // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1:339: RULE_ASSIGN
                {
                mRULE_ASSIGN(); 

                }
                break;
            case 34 :
                // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1:351: RULE_TYPE
                {
                mRULE_TYPE(); 

                }
                break;
            case 35 :
                // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1:361: RULE_UNDERSCORE
                {
                mRULE_UNDERSCORE(); 

                }
                break;
            case 36 :
                // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1:377: RULE_CID
                {
                mRULE_CID(); 

                }
                break;
            case 37 :
                // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1:386: RULE_UNKNOWNDIRECTIVE
                {
                mRULE_UNKNOWNDIRECTIVE(); 

                }
                break;
            case 38 :
                // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1:408: RULE_URISTRING
                {
                mRULE_URISTRING(); 

                }
                break;
            case 39 :
                // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1:423: RULE_INFIXNONE
                {
                mRULE_INFIXNONE(); 

                }
                break;
            case 40 :
                // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1:438: RULE_INFIXLEFT
                {
                mRULE_INFIXLEFT(); 

                }
                break;
            case 41 :
                // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1:453: RULE_INFIXRIGHT
                {
                mRULE_INFIXRIGHT(); 

                }
                break;
            case 42 :
                // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1:469: RULE_ILLEGAL_TOKEN
                {
                mRULE_ILLEGAL_TOKEN(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\40\1\43\1\44\10\uffff\1\56\1\uffff\2\61\1\63\1\61\1\65"+
        "\1\uffff\11\37\23\uffff\1\103\1\uffff\1\104\1\uffff\1\61\1\uffff"+
        "\11\37\1\120\3\37\2\uffff\1\61\1\37\1\126\10\37\1\uffff\3\37\1\142"+
        "\1\37\1\uffff\1\144\3\37\1\151\1\152\1\153\1\154\3\37\1\uffff\1"+
        "\37\1\uffff\4\37\4\uffff\3\37\1\170\1\37\1\uffff\2\37\1\177\1\u0080"+
        "\1\37\1\uffff\1\u0082\3\uffff\2\37\2\uffff\1\u0085\1\uffff\1\u0086"+
        "\1\37\2\uffff\1\u0088\1\uffff";
    static final String DFA13_eofS =
        "\u0089\uffff";
    static final String DFA13_minS =
        "\1\0\1\11\1\75\1\0\10\uffff\1\12\1\uffff\1\76\1\55\1\0\1\171\1\0"+
        "\1\uffff\1\151\1\145\1\155\1\141\1\145\1\151\1\160\1\142\1\157\23"+
        "\uffff\1\0\1\uffff\1\0\1\uffff\1\160\1\uffff\1\162\1\147\1\164\1"+
        "\143\1\160\1\155\1\141\2\145\1\60\1\142\1\145\1\163\2\uffff\1\145"+
        "\1\165\1\60\1\141\1\154\1\151\1\154\1\145\1\144\1\167\1\156\1\uffff"+
        "\1\162\1\146\1\164\1\0\1\143\1\uffff\1\60\1\165\1\170\1\151\4\60"+
        "\1\145\1\151\1\146\1\uffff\1\164\1\uffff\1\144\1\11\1\143\1\160"+
        "\4\uffff\1\166\1\170\1\151\1\60\1\145\1\11\1\151\1\141\2\60\1\170"+
        "\1\uffff\1\60\3\uffff\1\164\1\143\2\uffff\1\60\1\uffff\1\60\1\145"+
        "\2\uffff\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\173\1\75\1\uffff\10\uffff\1\12\1\uffff\1\76\1\55\1\uffff"+
        "\1\171\1\uffff\1\uffff\1\164\1\145\1\156\1\141\1\145\1\151\1\160"+
        "\1\163\1\162\23\uffff\1\uffff\1\uffff\1\uffff\1\uffff\1\160\1\uffff"+
        "\1\162\1\147\1\164\1\146\1\160\1\155\1\141\2\145\1\172\1\142\1\145"+
        "\1\163\2\uffff\1\145\1\165\1\172\1\141\1\154\1\151\1\154\1\145\1"+
        "\144\1\167\1\156\1\uffff\1\162\1\146\1\164\1\uffff\1\143\1\uffff"+
        "\1\172\1\165\1\170\1\151\4\172\1\145\1\151\1\146\1\uffff\1\164\1"+
        "\uffff\1\144\1\40\1\143\1\160\4\uffff\1\166\1\170\1\151\1\172\1"+
        "\145\1\162\1\151\1\141\2\172\1\170\1\uffff\1\172\3\uffff\1\164\1"+
        "\143\2\uffff\1\172\1\uffff\1\172\1\145\2\uffff\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\4\uffff\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\uffff\1\35\5"+
        "\uffff\1\44\11\uffff\1\17\1\20\1\45\1\22\1\21\1\41\1\23\1\24\1\46"+
        "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\52\1\35\1\uffff\1\44"+
        "\1\uffff\1\40\1\uffff\1\43\15\uffff\1\36\1\37\13\uffff\1\12\5\uffff"+
        "\1\6\13\uffff\1\42\1\uffff\1\2\4\uffff\1\14\1\5\1\7\1\11\13\uffff"+
        "\1\1\1\uffff\1\47\1\50\1\51\2\uffff\1\13\1\15\1\uffff\1\3\2\uffff"+
        "\1\16\1\10\1\uffff\1\4";
    static final String DFA13_specialS =
        "\1\4\2\uffff\1\0\14\uffff\1\5\1\uffff\1\2\35\uffff\1\1\1\uffff\1"+
        "\6\41\uffff\1\3\64\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\23\1\13\1\15\2\23\1\14\22\23\1\13\1\23\1\3\2\23\1\1\2\23"+
            "\1\10\1\11\3\23\1\16\1\12\13\23\1\2\1\23\1\17\1\20\35\23\1\6"+
            "\1\23\1\7\1\23\1\22\24\23\1\21\6\23\1\4\1\23\1\5\uff82\23",
            "\2\41\2\uffff\1\41\22\uffff\1\41\4\uffff\1\41\4\uffff\1\36"+
            "\5\uffff\12\37\7\uffff\32\37\6\uffff\1\33\7\37\1\26\3\37\1\25"+
            "\1\27\1\32\1\34\1\37\1\30\1\24\2\37\1\31\4\37\1\35",
            "\1\42",
            "\0\45",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\57",
            "",
            "\1\60",
            "\1\62",
            "\11\61\2\uffff\2\61\1\uffff\22\61\1\uffff\1\61\1\uffff\2\61"+
            "\1\uffff\2\61\2\uffff\4\61\1\uffff\13\61\1\uffff\40\61\1\uffff"+
            "\1\61\1\uffff\35\61\1\uffff\1\61\1\uffff\uff82\61",
            "\1\64",
            "\11\61\2\uffff\2\61\1\uffff\22\61\1\uffff\1\61\1\uffff\2\61"+
            "\1\uffff\2\61\2\uffff\4\61\1\uffff\13\61\1\uffff\40\61\1\uffff"+
            "\1\61\1\uffff\35\61\1\uffff\1\61\1\uffff\uff82\61",
            "",
            "\1\67\12\uffff\1\66",
            "\1\70",
            "\1\72\1\71",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\100\20\uffff\1\77",
            "\1\102\2\uffff\1\101",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\11\61\2\uffff\2\61\1\uffff\22\61\1\uffff\1\61\1\uffff\2\61"+
            "\1\uffff\2\61\2\uffff\4\61\1\uffff\13\61\1\uffff\40\61\1\uffff"+
            "\1\61\1\uffff\35\61\1\uffff\1\61\1\uffff\uff82\61",
            "",
            "\11\61\2\uffff\2\61\1\uffff\22\61\1\uffff\1\61\1\uffff\2\61"+
            "\1\uffff\2\61\2\uffff\4\61\1\uffff\13\61\1\uffff\40\61\1\uffff"+
            "\1\61\1\uffff\35\61\1\uffff\1\61\1\uffff\uff82\61",
            "",
            "\1\105",
            "",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111\2\uffff\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "\1\121",
            "\1\122",
            "\1\123",
            "",
            "",
            "\1\124",
            "\1\125",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "",
            "\1\137",
            "\1\140",
            "\1\141",
            "\11\61\2\uffff\2\61\1\uffff\22\61\1\uffff\1\61\1\uffff\2\61"+
            "\1\uffff\2\61\2\uffff\4\61\1\uffff\13\61\1\uffff\40\61\1\uffff"+
            "\1\61\1\uffff\35\61\1\uffff\1\61\1\uffff\uff82\61",
            "\1\143",
            "",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "\1\145",
            "\1\146",
            "\1\147",
            "\12\37\7\uffff\32\37\6\uffff\22\37\1\150\7\37",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "\1\155",
            "\1\156",
            "\1\157",
            "",
            "\1\160",
            "",
            "\1\161",
            "\1\162\26\uffff\1\162",
            "\1\163",
            "\1\164",
            "",
            "",
            "",
            "",
            "\1\165",
            "\1\166",
            "\1\167",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "\1\171",
            "\1\162\26\uffff\1\162\113\uffff\1\173\1\uffff\1\172\3\uffff"+
            "\1\174",
            "\1\175",
            "\1\176",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "\1\u0081",
            "",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "",
            "",
            "",
            "\1\u0083",
            "\1\u0084",
            "",
            "",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "\1\u0087",
            "",
            "",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
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
            return "1:1: Tokens : ( T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | RULE_ML_COMMENT | RULE_ML2_COMMENT | RULE_LINE_COMMENT | RULE_PERCENT | RULE_COLON | RULE_QUOTE | RULE_LCBRACKET | RULE_RCBRACKET | RULE_LSBRACKET | RULE_RSBRACKET | RULE_LBRACKET | RULE_RBRACKET | RULE_DOT | RULE_LINESP | RULE_LINEDELIM | RULE_ARROW | RULE_LARROW | RULE_EQUALS | RULE_ASSIGN | RULE_TYPE | RULE_UNDERSCORE | RULE_CID | RULE_UNKNOWNDIRECTIVE | RULE_URISTRING | RULE_INFIXNONE | RULE_INFIXLEFT | RULE_INFIXRIGHT | RULE_ILLEGAL_TOKEN );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_3 = input.LA(1);

                        s = -1;
                        if ( ((LA13_3>='\u0000' && LA13_3<='\uFFFF')) ) {s = 37;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_48 = input.LA(1);

                        s = -1;
                        if ( ((LA13_48>='\u0000' && LA13_48<='\b')||(LA13_48>='\u000B' && LA13_48<='\f')||(LA13_48>='\u000E' && LA13_48<='\u001F')||LA13_48=='!'||(LA13_48>='#' && LA13_48<='$')||(LA13_48>='&' && LA13_48<='\'')||(LA13_48>='*' && LA13_48<='-')||(LA13_48>='/' && LA13_48<='9')||(LA13_48>=';' && LA13_48<='Z')||LA13_48=='\\'||(LA13_48>='^' && LA13_48<='z')||LA13_48=='|'||(LA13_48>='~' && LA13_48<='\uFFFF')) ) {s = 49;}

                        else s = 67;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_18 = input.LA(1);

                        s = -1;
                        if ( ((LA13_18>='\u0000' && LA13_18<='\b')||(LA13_18>='\u000B' && LA13_18<='\f')||(LA13_18>='\u000E' && LA13_18<='\u001F')||LA13_18=='!'||(LA13_18>='#' && LA13_18<='$')||(LA13_18>='&' && LA13_18<='\'')||(LA13_18>='*' && LA13_18<='-')||(LA13_18>='/' && LA13_18<='9')||(LA13_18>=';' && LA13_18<='Z')||LA13_18=='\\'||(LA13_18>='^' && LA13_18<='z')||LA13_18=='|'||(LA13_18>='~' && LA13_18<='\uFFFF')) ) {s = 49;}

                        else s = 53;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_84 = input.LA(1);

                        s = -1;
                        if ( ((LA13_84>='\u0000' && LA13_84<='\b')||(LA13_84>='\u000B' && LA13_84<='\f')||(LA13_84>='\u000E' && LA13_84<='\u001F')||LA13_84=='!'||(LA13_84>='#' && LA13_84<='$')||(LA13_84>='&' && LA13_84<='\'')||(LA13_84>='*' && LA13_84<='-')||(LA13_84>='/' && LA13_84<='9')||(LA13_84>=';' && LA13_84<='Z')||LA13_84=='\\'||(LA13_84>='^' && LA13_84<='z')||LA13_84=='|'||(LA13_84>='~' && LA13_84<='\uFFFF')) ) {s = 49;}

                        else s = 98;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='%') ) {s = 1;}

                        else if ( (LA13_0==':') ) {s = 2;}

                        else if ( (LA13_0=='\"') ) {s = 3;}

                        else if ( (LA13_0=='{') ) {s = 4;}

                        else if ( (LA13_0=='}') ) {s = 5;}

                        else if ( (LA13_0=='[') ) {s = 6;}

                        else if ( (LA13_0==']') ) {s = 7;}

                        else if ( (LA13_0=='(') ) {s = 8;}

                        else if ( (LA13_0==')') ) {s = 9;}

                        else if ( (LA13_0=='.') ) {s = 10;}

                        else if ( (LA13_0=='\t'||LA13_0==' ') ) {s = 11;}

                        else if ( (LA13_0=='\r') ) {s = 12;}

                        else if ( (LA13_0=='\n') ) {s = 13;}

                        else if ( (LA13_0=='-') ) {s = 14;}

                        else if ( (LA13_0=='<') ) {s = 15;}

                        else if ( (LA13_0=='=') ) {s = 16;}

                        else if ( (LA13_0=='t') ) {s = 17;}

                        else if ( (LA13_0=='_') ) {s = 18;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='$')||(LA13_0>='&' && LA13_0<='\'')||(LA13_0>='*' && LA13_0<=',')||(LA13_0>='/' && LA13_0<='9')||LA13_0==';'||(LA13_0>='>' && LA13_0<='Z')||LA13_0=='\\'||LA13_0=='^'||(LA13_0>='`' && LA13_0<='s')||(LA13_0>='u' && LA13_0<='z')||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 19;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA13_16 = input.LA(1);

                        s = -1;
                        if ( ((LA13_16>='\u0000' && LA13_16<='\b')||(LA13_16>='\u000B' && LA13_16<='\f')||(LA13_16>='\u000E' && LA13_16<='\u001F')||LA13_16=='!'||(LA13_16>='#' && LA13_16<='$')||(LA13_16>='&' && LA13_16<='\'')||(LA13_16>='*' && LA13_16<='-')||(LA13_16>='/' && LA13_16<='9')||(LA13_16>=';' && LA13_16<='Z')||LA13_16=='\\'||(LA13_16>='^' && LA13_16<='z')||LA13_16=='|'||(LA13_16>='~' && LA13_16<='\uFFFF')) ) {s = 49;}

                        else s = 51;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA13_50 = input.LA(1);

                        s = -1;
                        if ( ((LA13_50>='\u0000' && LA13_50<='\b')||(LA13_50>='\u000B' && LA13_50<='\f')||(LA13_50>='\u000E' && LA13_50<='\u001F')||LA13_50=='!'||(LA13_50>='#' && LA13_50<='$')||(LA13_50>='&' && LA13_50<='\'')||(LA13_50>='*' && LA13_50<='-')||(LA13_50>='/' && LA13_50<='9')||(LA13_50>=';' && LA13_50<='Z')||LA13_50=='\\'||(LA13_50>='^' && LA13_50<='z')||LA13_50=='|'||(LA13_50>='~' && LA13_50<='\uFFFF')) ) {s = 49;}

                        else s = 68;

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