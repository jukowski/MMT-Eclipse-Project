package info.kwarc.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalElfLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_URI=5;
    public static final int Tokens=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=8;
    public static final int RULE_STRING=7;
    public static final int RULE_ML2_COMMENT=9;
    public static final int RULE_INT=6;
    public static final int T13=13;
    public static final int T14=14;
    public static final int RULE_WS=11;
    public static final int T15=15;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T19=19;
    public InternalElfLexer() {;} 
    public InternalElfLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g"; }

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:10:5: ( '%namespace' )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:10:7: '%namespace'
            {
            match("%namespace"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:11:5: ( '.' )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:11:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:12:5: ( '=' )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:12:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:13:5: ( '%sig' )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:13:7: '%sig'
            {
            match("%sig"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:14:5: ( '{' )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:14:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:15:5: ( '}' )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:15:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:16:5: ( ':' )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:16:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:990:10: ( ( '0' .. '9' )+ )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:990:12: ( '0' .. '9' )+
            {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:990:12: ( '0' .. '9' )+
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
            	    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:990:13: '0' .. '9'
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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_URI
    public final void mRULE_URI() throws RecognitionException {
        try {
            int _type = RULE_URI;
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:992:10: ( '\"' ( 'a' .. 'z' | 'A' .. 'Z' | '/' | ':' | '.' | '-' | '%' )+ '\"' )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:992:12: '\"' ( 'a' .. 'z' | 'A' .. 'Z' | '/' | ':' | '.' | '-' | '%' )+ '\"'
            {
            match('\"'); 
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:992:16: ( 'a' .. 'z' | 'A' .. 'Z' | '/' | ':' | '.' | '-' | '%' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='%'||(LA2_0>='-' && LA2_0<='/')||LA2_0==':'||(LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:
            	    {
            	    if ( input.LA(1)=='%'||(input.LA(1)>='-' && input.LA(1)<='/')||input.LA(1)==':'||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


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

            match('\"'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_URI

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:994:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:994:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:994:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\"') ) {
                alt5=1;
            }
            else if ( (LA5_0=='\'') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("994:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:994:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:994:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop3:
                    do {
                        int alt3=3;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='\\') ) {
                            alt3=1;
                        }
                        else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFE')) ) {
                            alt3=2;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:994:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:994:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:994:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:994:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='&')||(LA4_0>='(' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:994:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:994:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:996:17: ( '%{' ( options {greedy=false; } : . )* '}%' )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:996:19: '%{' ( options {greedy=false; } : . )* '}%'
            {
            match("%{"); 

            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:996:24: ( options {greedy=false; } : . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='}') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='%') ) {
                        alt6=2;
                    }
                    else if ( ((LA6_1>='\u0000' && LA6_1<='$')||(LA6_1>='&' && LA6_1<='\uFFFE')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0>='\u0000' && LA6_0<='|')||(LA6_0>='~' && LA6_0<='\uFFFE')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:996:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match("}%"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_ML2_COMMENT
    public final void mRULE_ML2_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML2_COMMENT;
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:998:18: ( '%*' ( options {greedy=false; } : . )* '*%' )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:998:20: '%*' ( options {greedy=false; } : . )* '*%'
            {
            match("%*"); 

            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:998:25: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='%') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='$')||(LA7_1>='&' && LA7_1<='\uFFFE')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:998:53: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*%"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML2_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:1000:17: ( '%' ( ' ' | '%' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:1000:19: '%' ( ' ' | '%' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('%'); 
            if ( input.LA(1)==' '||input.LA(1)=='%' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:1000:33: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:1000:33: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:1000:49: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:1000:50: ( '\\r' )? '\\n'
                    {
                    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:1000:50: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:1000:50: '\\r'
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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:1002:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:1002:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:1002:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


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


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:1004:9: ( (~ ( ( '\"' | '\\'' | '%' | '*' | '{' | '}' | '.' | '[' | ']' | '=' | ':' | ' ' ) ) )* )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:1004:11: (~ ( ( '\"' | '\\'' | '%' | '*' | '{' | '}' | '.' | '[' | ']' | '=' | ':' | ' ' ) ) )*
            {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:1004:11: (~ ( ( '\"' | '\\'' | '%' | '*' | '{' | '}' | '.' | '[' | ']' | '=' | ':' | ' ' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='$')||LA12_0=='&'||(LA12_0>='(' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='-')||(LA12_0>='/' && LA12_0<='9')||(LA12_0>=';' && LA12_0<='<')||(LA12_0>='>' && LA12_0<='Z')||LA12_0=='\\'||(LA12_0>='^' && LA12_0<='z')||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFE')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:1004:11: ~ ( ( '\"' | '\\'' | '%' | '*' | '{' | '}' | '.' | '[' | ']' | '=' | ':' | ' ' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\u001F')||input.LA(1)=='!'||(input.LA(1)>='#' && input.LA(1)<='$')||input.LA(1)=='&'||(input.LA(1)>='(' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='-')||(input.LA(1)>='/' && input.LA(1)<='9')||(input.LA(1)>=';' && input.LA(1)<='<')||(input.LA(1)>='>' && input.LA(1)<='Z')||input.LA(1)=='\\'||(input.LA(1)>='^' && input.LA(1)<='z')||input.LA(1)=='|'||(input.LA(1)>='~' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:1006:16: ( . )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:1006:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:1:8: ( T13 | T14 | T15 | T16 | T17 | T18 | T19 | RULE_INT | RULE_URI | RULE_STRING | RULE_ML_COMMENT | RULE_ML2_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ID | RULE_ANY_OTHER )
        int alt13=16;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:1:10: T13
                {
                mT13(); 

                }
                break;
            case 2 :
                // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:1:14: T14
                {
                mT14(); 

                }
                break;
            case 3 :
                // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:1:18: T15
                {
                mT15(); 

                }
                break;
            case 4 :
                // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:1:22: T16
                {
                mT16(); 

                }
                break;
            case 5 :
                // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:1:26: T17
                {
                mT17(); 

                }
                break;
            case 6 :
                // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:1:30: T18
                {
                mT18(); 

                }
                break;
            case 7 :
                // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:1:34: T19
                {
                mT19(); 

                }
                break;
            case 8 :
                // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:1:38: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 9 :
                // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:1:47: RULE_URI
                {
                mRULE_URI(); 

                }
                break;
            case 10 :
                // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:1:56: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 11 :
                // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:1:68: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 12 :
                // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:1:84: RULE_ML2_COMMENT
                {
                mRULE_ML2_COMMENT(); 

                }
                break;
            case 13 :
                // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:1:101: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 14 :
                // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:1:117: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 15 :
                // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:1:125: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 16 :
                // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:1:133: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\15\1\16\5\uffff\1\31\2\16\1\35\17\uffff\1\31\3\uffff\1\35\2\uffff";
    static final String DFA13_eofS =
        "\41\uffff";
    static final String DFA13_minS =
        "\1\0\1\40\5\uffff\4\0\17\uffff\1\0\1\uffff\1\0\1\uffff\1\0\2\uffff";
    static final String DFA13_maxS =
        "\1\ufffe\1\173\5\uffff\4\ufffe\17\uffff\1\ufffe\1\uffff\1\ufffe"+
        "\1\uffff\1\ufffe\2\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\1\3\1\5\1\6\1\7\4\uffff\1\16\2\17\1\20\1\4\1\15\1\14"+
        "\1\1\1\13\1\2\1\3\1\5\1\6\1\7\1\10\1\uffff\1\12\1\uffff\1\16\1\uffff"+
        "\2\11";
    static final String DFA13_specialS =
        "\41\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\14\2\12\2\14\1\12\22\14\1\13\1\14\1\10\2\14\1\1\1\14\1\11"+
            "\2\14\1\16\3\14\1\2\1\14\12\7\1\6\2\14\1\3\35\14\1\16\1\14\1"+
            "\16\35\14\1\4\1\14\1\5\uff81\14",
            "\1\20\4\uffff\1\20\4\uffff\1\21\103\uffff\1\22\4\uffff\1\17"+
            "\7\uffff\1\23",
            "",
            "",
            "",
            "",
            "",
            "\40\15\1\uffff\1\15\1\uffff\2\15\1\uffff\1\15\1\uffff\2\15\1"+
            "\uffff\3\15\1\uffff\1\15\12\32\1\uffff\2\15\1\uffff\35\15\1"+
            "\uffff\1\15\1\uffff\35\15\1\uffff\1\15\1\uffff\uff81\15",
            "\45\33\1\34\7\33\3\34\12\33\1\34\6\33\32\34\6\33\32\34\uff84"+
            "\33",
            "\uffff\33",
            "\11\15\2\36\2\15\1\36\22\15\1\uffff\1\15\1\uffff\2\15\1\uffff"+
            "\1\15\1\uffff\2\15\1\uffff\3\15\1\uffff\13\15\1\uffff\2\15\1"+
            "\uffff\35\15\1\uffff\1\15\1\uffff\35\15\1\uffff\1\15\1\uffff"+
            "\uff81\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\40\15\1\uffff\1\15\1\uffff\2\15\1\uffff\1\15\1\uffff\2\15\1"+
            "\uffff\3\15\1\uffff\1\15\12\32\1\uffff\2\15\1\uffff\35\15\1"+
            "\uffff\1\15\1\uffff\35\15\1\uffff\1\15\1\uffff\uff81\15",
            "",
            "\42\33\1\37\2\33\1\34\7\33\3\34\12\33\1\34\6\33\32\34\6\33\32"+
            "\34\uff84\33",
            "",
            "\11\15\2\36\2\15\1\36\22\15\1\uffff\1\15\1\uffff\2\15\1\uffff"+
            "\1\15\1\uffff\2\15\1\uffff\3\15\1\uffff\13\15\1\uffff\2\15\1"+
            "\uffff\35\15\1\uffff\1\15\1\uffff\35\15\1\uffff\1\15\1\uffff"+
            "\uff81\15",
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
            return "1:1: Tokens : ( T13 | T14 | T15 | T16 | T17 | T18 | T19 | RULE_INT | RULE_URI | RULE_STRING | RULE_ML_COMMENT | RULE_ML2_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ID | RULE_ANY_OTHER );";
        }
    }
 

}