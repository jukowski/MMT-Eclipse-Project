package info.kwarc.mmt.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import info.kwarc.mmt.services.LFGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLFParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SP", "RULE_ML_COMMENT", "RULE_ML2_COMMENT", "RULE_SL_COMMENT", "RULE_CID", "RULE_ANY_OTHER", "RULE_INT", "'../'", "'/'", "'.'", "'://'", "'\"'", "'%namespace'", "'='", "':'", "'{'", "'}'", "'<'", "'->'", "'%'", "'-'", "'\\''", "'%sig'", "':='", "'%include'", "'%struct'", "'%infix'", "'%prefix'", "'%meta'", "'%abbrev'", "'%open'"
    };
    public static final int RULE_SP=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=9;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_CID=8;
    public static final int RULE_SL_COMMENT=7;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=5;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ML2_COMMENT=6;
    public static final int RULE_INT=10;

    // delegates
    // delegators


        public InternalLFParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLFParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLFParser.tokenNames; }
    public String getGrammarFileName() { return "../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g"; }



     	private LFGrammarAccess grammarAccess;
     	
        public InternalLFParser(TokenStream input, LFGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected LFGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_declarations_0_1= rulenamespaceDeclaration | lv_declarations_0_2= rulesignatureDeclaration | lv_declarations_0_3= ruleJUSTSPACE ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_declarations_0_1 = null;

        EObject lv_declarations_0_2 = null;

        EObject lv_declarations_0_3 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:79:28: ( ( ( (lv_declarations_0_1= rulenamespaceDeclaration | lv_declarations_0_2= rulesignatureDeclaration | lv_declarations_0_3= ruleJUSTSPACE ) ) )* )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:80:1: ( ( (lv_declarations_0_1= rulenamespaceDeclaration | lv_declarations_0_2= rulesignatureDeclaration | lv_declarations_0_3= ruleJUSTSPACE ) ) )*
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:80:1: ( ( (lv_declarations_0_1= rulenamespaceDeclaration | lv_declarations_0_2= rulesignatureDeclaration | lv_declarations_0_3= ruleJUSTSPACE ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_SP && LA2_0<=RULE_SL_COMMENT)||LA2_0==16||LA2_0==26) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:81:1: ( (lv_declarations_0_1= rulenamespaceDeclaration | lv_declarations_0_2= rulesignatureDeclaration | lv_declarations_0_3= ruleJUSTSPACE ) )
            	    {
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:81:1: ( (lv_declarations_0_1= rulenamespaceDeclaration | lv_declarations_0_2= rulesignatureDeclaration | lv_declarations_0_3= ruleJUSTSPACE ) )
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:82:1: (lv_declarations_0_1= rulenamespaceDeclaration | lv_declarations_0_2= rulesignatureDeclaration | lv_declarations_0_3= ruleJUSTSPACE )
            	    {
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:82:1: (lv_declarations_0_1= rulenamespaceDeclaration | lv_declarations_0_2= rulesignatureDeclaration | lv_declarations_0_3= ruleJUSTSPACE )
            	    int alt1=3;
            	    switch ( input.LA(1) ) {
            	    case 16:
            	        {
            	        alt1=1;
            	        }
            	        break;
            	    case 26:
            	        {
            	        alt1=2;
            	        }
            	        break;
            	    case RULE_SP:
            	    case RULE_ML_COMMENT:
            	    case RULE_ML2_COMMENT:
            	    case RULE_SL_COMMENT:
            	        {
            	        alt1=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt1) {
            	        case 1 :
            	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:83:3: lv_declarations_0_1= rulenamespaceDeclaration
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getModelAccess().getDeclarationsNamespaceDeclarationParserRuleCall_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_rulenamespaceDeclaration_in_ruleModel132);
            	            lv_declarations_0_1=rulenamespaceDeclaration();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"declarations",
            	                    		lv_declarations_0_1, 
            	                    		"namespaceDeclaration");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:98:8: lv_declarations_0_2= rulesignatureDeclaration
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getModelAccess().getDeclarationsSignatureDeclarationParserRuleCall_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_rulesignatureDeclaration_in_ruleModel151);
            	            lv_declarations_0_2=rulesignatureDeclaration();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"declarations",
            	                    		lv_declarations_0_2, 
            	                    		"signatureDeclaration");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:113:8: lv_declarations_0_3= ruleJUSTSPACE
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getModelAccess().getDeclarationsJUSTSPACEParserRuleCall_0_2()); 
            	            	    
            	            pushFollow(FOLLOW_ruleJUSTSPACE_in_ruleModel170);
            	            lv_declarations_0_3=ruleJUSTSPACE();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"declarations",
            	                    		lv_declarations_0_3, 
            	                    		"JUSTSPACE");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleWS"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:139:1: entryRuleWS returns [String current=null] : iv_ruleWS= ruleWS EOF ;
    public final String entryRuleWS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleWS = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:140:2: (iv_ruleWS= ruleWS EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:141:2: iv_ruleWS= ruleWS EOF
            {
             newCompositeNode(grammarAccess.getWSRule()); 
            pushFollow(FOLLOW_ruleWS_in_entryRuleWS210);
            iv_ruleWS=ruleWS();

            state._fsp--;

             current =iv_ruleWS.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWS221); 

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
    // $ANTLR end "entryRuleWS"


    // $ANTLR start "ruleWS"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:148:1: ruleWS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SP_0= RULE_SP | this_ML_COMMENT_1= RULE_ML_COMMENT | this_ML2_COMMENT_2= RULE_ML2_COMMENT | this_SL_COMMENT_3= RULE_SL_COMMENT ) ;
    public final AntlrDatatypeRuleToken ruleWS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SP_0=null;
        Token this_ML_COMMENT_1=null;
        Token this_ML2_COMMENT_2=null;
        Token this_SL_COMMENT_3=null;

         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:151:28: ( (this_SP_0= RULE_SP | this_ML_COMMENT_1= RULE_ML_COMMENT | this_ML2_COMMENT_2= RULE_ML2_COMMENT | this_SL_COMMENT_3= RULE_SL_COMMENT ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:152:1: (this_SP_0= RULE_SP | this_ML_COMMENT_1= RULE_ML_COMMENT | this_ML2_COMMENT_2= RULE_ML2_COMMENT | this_SL_COMMENT_3= RULE_SL_COMMENT )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:152:1: (this_SP_0= RULE_SP | this_ML_COMMENT_1= RULE_ML_COMMENT | this_ML2_COMMENT_2= RULE_ML2_COMMENT | this_SL_COMMENT_3= RULE_SL_COMMENT )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RULE_SP:
                {
                alt3=1;
                }
                break;
            case RULE_ML_COMMENT:
                {
                alt3=2;
                }
                break;
            case RULE_ML2_COMMENT:
                {
                alt3=3;
                }
                break;
            case RULE_SL_COMMENT:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:152:6: this_SP_0= RULE_SP
                    {
                    this_SP_0=(Token)match(input,RULE_SP,FOLLOW_RULE_SP_in_ruleWS261); 

                    		current.merge(this_SP_0);
                        
                     
                        newLeafNode(this_SP_0, grammarAccess.getWSAccess().getSPTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:160:10: this_ML_COMMENT_1= RULE_ML_COMMENT
                    {
                    this_ML_COMMENT_1=(Token)match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_ruleWS287); 

                    		current.merge(this_ML_COMMENT_1);
                        
                     
                        newLeafNode(this_ML_COMMENT_1, grammarAccess.getWSAccess().getML_COMMENTTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:168:10: this_ML2_COMMENT_2= RULE_ML2_COMMENT
                    {
                    this_ML2_COMMENT_2=(Token)match(input,RULE_ML2_COMMENT,FOLLOW_RULE_ML2_COMMENT_in_ruleWS313); 

                    		current.merge(this_ML2_COMMENT_2);
                        
                     
                        newLeafNode(this_ML2_COMMENT_2, grammarAccess.getWSAccess().getML2_COMMENTTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:176:10: this_SL_COMMENT_3= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_3=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleWS339); 

                    		current.merge(this_SL_COMMENT_3);
                        
                     
                        newLeafNode(this_SL_COMMENT_3, grammarAccess.getWSAccess().getSL_COMMENTTerminalRuleCall_3()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWS"


    // $ANTLR start "entryRuleNAMESPACE"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:191:1: entryRuleNAMESPACE returns [String current=null] : iv_ruleNAMESPACE= ruleNAMESPACE EOF ;
    public final String entryRuleNAMESPACE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNAMESPACE = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:192:2: (iv_ruleNAMESPACE= ruleNAMESPACE EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:193:2: iv_ruleNAMESPACE= ruleNAMESPACE EOF
            {
             newCompositeNode(grammarAccess.getNAMESPACERule()); 
            pushFollow(FOLLOW_ruleNAMESPACE_in_entryRuleNAMESPACE385);
            iv_ruleNAMESPACE=ruleNAMESPACE();

            state._fsp--;

             current =iv_ruleNAMESPACE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNAMESPACE396); 

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
    // $ANTLR end "entryRuleNAMESPACE"


    // $ANTLR start "ruleNAMESPACE"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:200:1: ruleNAMESPACE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '../' )* this_CID_1= RULE_CID ( (kw= '/' | kw= '.' ) this_CID_4= RULE_CID )* ) ;
    public final AntlrDatatypeRuleToken ruleNAMESPACE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_CID_1=null;
        Token this_CID_4=null;

         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:203:28: ( ( (kw= '../' )* this_CID_1= RULE_CID ( (kw= '/' | kw= '.' ) this_CID_4= RULE_CID )* ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:204:1: ( (kw= '../' )* this_CID_1= RULE_CID ( (kw= '/' | kw= '.' ) this_CID_4= RULE_CID )* )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:204:1: ( (kw= '../' )* this_CID_1= RULE_CID ( (kw= '/' | kw= '.' ) this_CID_4= RULE_CID )* )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:204:2: (kw= '../' )* this_CID_1= RULE_CID ( (kw= '/' | kw= '.' ) this_CID_4= RULE_CID )*
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:204:2: (kw= '../' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==11) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:205:2: kw= '../'
            	    {
            	    kw=(Token)match(input,11,FOLLOW_11_in_ruleNAMESPACE435); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getNAMESPACEAccess().getFullStopFullStopSolidusKeyword_0()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            this_CID_1=(Token)match(input,RULE_CID,FOLLOW_RULE_CID_in_ruleNAMESPACE452); 

            		current.merge(this_CID_1);
                
             
                newLeafNode(this_CID_1, grammarAccess.getNAMESPACEAccess().getCIDTerminalRuleCall_1()); 
                
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:217:1: ( (kw= '/' | kw= '.' ) this_CID_4= RULE_CID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13) ) {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2==RULE_CID) ) {
                        alt6=1;
                    }


                }
                else if ( (LA6_0==12) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:217:2: (kw= '/' | kw= '.' ) this_CID_4= RULE_CID
            	    {
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:217:2: (kw= '/' | kw= '.' )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==12) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==13) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:218:2: kw= '/'
            	            {
            	            kw=(Token)match(input,12,FOLLOW_12_in_ruleNAMESPACE472); 

            	                    current.merge(kw);
            	                    newLeafNode(kw, grammarAccess.getNAMESPACEAccess().getSolidusKeyword_2_0_0()); 
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:225:2: kw= '.'
            	            {
            	            kw=(Token)match(input,13,FOLLOW_13_in_ruleNAMESPACE491); 

            	                    current.merge(kw);
            	                    newLeafNode(kw, grammarAccess.getNAMESPACEAccess().getFullStopKeyword_2_0_1()); 
            	                

            	            }
            	            break;

            	    }

            	    this_CID_4=(Token)match(input,RULE_CID,FOLLOW_RULE_CID_in_ruleNAMESPACE507); 

            	    		current.merge(this_CID_4);
            	        
            	     
            	        newLeafNode(this_CID_4, grammarAccess.getNAMESPACEAccess().getCIDTerminalRuleCall_2_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNAMESPACE"


    // $ANTLR start "entryRuleURI"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:245:1: entryRuleURI returns [String current=null] : iv_ruleURI= ruleURI EOF ;
    public final String entryRuleURI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURI = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:246:2: (iv_ruleURI= ruleURI EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:247:2: iv_ruleURI= ruleURI EOF
            {
             newCompositeNode(grammarAccess.getURIRule()); 
            pushFollow(FOLLOW_ruleURI_in_entryRuleURI555);
            iv_ruleURI=ruleURI();

            state._fsp--;

             current =iv_ruleURI.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURI566); 

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
    // $ANTLR end "entryRuleURI"


    // $ANTLR start "ruleURI"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:254:1: ruleURI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_CID_0= RULE_CID kw= '://' )? this_NAMESPACE_2= ruleNAMESPACE ) ;
    public final AntlrDatatypeRuleToken ruleURI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_NAMESPACE_2 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:257:28: ( ( (this_CID_0= RULE_CID kw= '://' )? this_NAMESPACE_2= ruleNAMESPACE ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:258:1: ( (this_CID_0= RULE_CID kw= '://' )? this_NAMESPACE_2= ruleNAMESPACE )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:258:1: ( (this_CID_0= RULE_CID kw= '://' )? this_NAMESPACE_2= ruleNAMESPACE )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:258:2: (this_CID_0= RULE_CID kw= '://' )? this_NAMESPACE_2= ruleNAMESPACE
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:258:2: (this_CID_0= RULE_CID kw= '://' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_CID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==14) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:258:7: this_CID_0= RULE_CID kw= '://'
                    {
                    this_CID_0=(Token)match(input,RULE_CID,FOLLOW_RULE_CID_in_ruleURI607); 

                    		current.merge(this_CID_0);
                        
                     
                        newLeafNode(this_CID_0, grammarAccess.getURIAccess().getCIDTerminalRuleCall_0_0()); 
                        
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleURI625); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getURIAccess().getColonSolidusSolidusKeyword_0_1()); 
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getURIAccess().getNAMESPACEParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleNAMESPACE_in_ruleURI649);
            this_NAMESPACE_2=ruleNAMESPACE();

            state._fsp--;


            		current.merge(this_NAMESPACE_2);
                
             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleURI"


    // $ANTLR start "entryRuleURISTRING"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:290:1: entryRuleURISTRING returns [String current=null] : iv_ruleURISTRING= ruleURISTRING EOF ;
    public final String entryRuleURISTRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURISTRING = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:291:2: (iv_ruleURISTRING= ruleURISTRING EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:292:2: iv_ruleURISTRING= ruleURISTRING EOF
            {
             newCompositeNode(grammarAccess.getURISTRINGRule()); 
            pushFollow(FOLLOW_ruleURISTRING_in_entryRuleURISTRING695);
            iv_ruleURISTRING=ruleURISTRING();

            state._fsp--;

             current =iv_ruleURISTRING.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURISTRING706); 

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
    // $ANTLR end "entryRuleURISTRING"


    // $ANTLR start "ruleURISTRING"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:299:1: ruleURISTRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\"' this_URI_1= ruleURI kw= '\"' ) ;
    public final AntlrDatatypeRuleToken ruleURISTRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_URI_1 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:302:28: ( (kw= '\"' this_URI_1= ruleURI kw= '\"' ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:303:1: (kw= '\"' this_URI_1= ruleURI kw= '\"' )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:303:1: (kw= '\"' this_URI_1= ruleURI kw= '\"' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:304:2: kw= '\"' this_URI_1= ruleURI kw= '\"'
            {
            kw=(Token)match(input,15,FOLLOW_15_in_ruleURISTRING744); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getURISTRINGAccess().getQuotationMarkKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getURISTRINGAccess().getURIParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleURI_in_ruleURISTRING766);
            this_URI_1=ruleURI();

            state._fsp--;


            		current.merge(this_URI_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,15,FOLLOW_15_in_ruleURISTRING784); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getURISTRINGAccess().getQuotationMarkKeyword_2()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleURISTRING"


    // $ANTLR start "entryRuleJUSTSPACE"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:334:1: entryRuleJUSTSPACE returns [EObject current=null] : iv_ruleJUSTSPACE= ruleJUSTSPACE EOF ;
    public final EObject entryRuleJUSTSPACE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJUSTSPACE = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:335:2: (iv_ruleJUSTSPACE= ruleJUSTSPACE EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:336:2: iv_ruleJUSTSPACE= ruleJUSTSPACE EOF
            {
             newCompositeNode(grammarAccess.getJUSTSPACERule()); 
            pushFollow(FOLLOW_ruleJUSTSPACE_in_entryRuleJUSTSPACE824);
            iv_ruleJUSTSPACE=ruleJUSTSPACE();

            state._fsp--;

             current =iv_ruleJUSTSPACE; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJUSTSPACE834); 

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
    // $ANTLR end "entryRuleJUSTSPACE"


    // $ANTLR start "ruleJUSTSPACE"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:343:1: ruleJUSTSPACE returns [EObject current=null] : ( (lv_J_0_0= ruleWS ) ) ;
    public final EObject ruleJUSTSPACE() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_J_0_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:346:28: ( ( (lv_J_0_0= ruleWS ) ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:347:1: ( (lv_J_0_0= ruleWS ) )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:347:1: ( (lv_J_0_0= ruleWS ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:348:1: (lv_J_0_0= ruleWS )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:348:1: (lv_J_0_0= ruleWS )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:349:3: lv_J_0_0= ruleWS
            {
             
            	        newCompositeNode(grammarAccess.getJUSTSPACEAccess().getJWSParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleWS_in_ruleJUSTSPACE879);
            lv_J_0_0=ruleWS();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJUSTSPACERule());
            	        }
                   		set(
                   			current, 
                   			"J",
                    		lv_J_0_0, 
                    		"WS");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJUSTSPACE"


    // $ANTLR start "entryRulenamespaceDeclaration"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:373:1: entryRulenamespaceDeclaration returns [EObject current=null] : iv_rulenamespaceDeclaration= rulenamespaceDeclaration EOF ;
    public final EObject entryRulenamespaceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenamespaceDeclaration = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:374:2: (iv_rulenamespaceDeclaration= rulenamespaceDeclaration EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:375:2: iv_rulenamespaceDeclaration= rulenamespaceDeclaration EOF
            {
             newCompositeNode(grammarAccess.getNamespaceDeclarationRule()); 
            pushFollow(FOLLOW_rulenamespaceDeclaration_in_entryRulenamespaceDeclaration914);
            iv_rulenamespaceDeclaration=rulenamespaceDeclaration();

            state._fsp--;

             current =iv_rulenamespaceDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenamespaceDeclaration924); 

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
    // $ANTLR end "entryRulenamespaceDeclaration"


    // $ANTLR start "rulenamespaceDeclaration"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:382:1: rulenamespaceDeclaration returns [EObject current=null] : (otherlv_0= '%namespace' ( ruleWS )+ ( ( (lv_name_2_0= RULE_CID ) ) ( ruleWS )* otherlv_4= '=' ( ruleWS )* )? ( (lv_uri_6_0= ruleURISTRING ) ) ( ruleWS )* otherlv_8= '.' ruleWS ) ;
    public final EObject rulenamespaceDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_uri_6_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:385:28: ( (otherlv_0= '%namespace' ( ruleWS )+ ( ( (lv_name_2_0= RULE_CID ) ) ( ruleWS )* otherlv_4= '=' ( ruleWS )* )? ( (lv_uri_6_0= ruleURISTRING ) ) ( ruleWS )* otherlv_8= '.' ruleWS ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:386:1: (otherlv_0= '%namespace' ( ruleWS )+ ( ( (lv_name_2_0= RULE_CID ) ) ( ruleWS )* otherlv_4= '=' ( ruleWS )* )? ( (lv_uri_6_0= ruleURISTRING ) ) ( ruleWS )* otherlv_8= '.' ruleWS )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:386:1: (otherlv_0= '%namespace' ( ruleWS )+ ( ( (lv_name_2_0= RULE_CID ) ) ( ruleWS )* otherlv_4= '=' ( ruleWS )* )? ( (lv_uri_6_0= ruleURISTRING ) ) ( ruleWS )* otherlv_8= '.' ruleWS )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:386:3: otherlv_0= '%namespace' ( ruleWS )+ ( ( (lv_name_2_0= RULE_CID ) ) ( ruleWS )* otherlv_4= '=' ( ruleWS )* )? ( (lv_uri_6_0= ruleURISTRING ) ) ( ruleWS )* otherlv_8= '.' ruleWS
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_rulenamespaceDeclaration961); 

                	newLeafNode(otherlv_0, grammarAccess.getNamespaceDeclarationAccess().getNamespaceKeyword_0());
                
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:390:1: ( ruleWS )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_SP && LA8_0<=RULE_SL_COMMENT)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:391:5: ruleWS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_1()); 
            	        
            	    pushFollow(FOLLOW_ruleWS_in_rulenamespaceDeclaration978);
            	    ruleWS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

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

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:398:3: ( ( (lv_name_2_0= RULE_CID ) ) ( ruleWS )* otherlv_4= '=' ( ruleWS )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_CID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:398:4: ( (lv_name_2_0= RULE_CID ) ) ( ruleWS )* otherlv_4= '=' ( ruleWS )*
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:398:4: ( (lv_name_2_0= RULE_CID ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:399:1: (lv_name_2_0= RULE_CID )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:399:1: (lv_name_2_0= RULE_CID )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:400:3: lv_name_2_0= RULE_CID
                    {
                    lv_name_2_0=(Token)match(input,RULE_CID,FOLLOW_RULE_CID_in_rulenamespaceDeclaration997); 

                    			newLeafNode(lv_name_2_0, grammarAccess.getNamespaceDeclarationAccess().getNameCIDTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNamespaceDeclarationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_0, 
                            		"CID");
                    	    

                    }


                    }

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:416:2: ( ruleWS )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>=RULE_SP && LA9_0<=RULE_SL_COMMENT)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:417:5: ruleWS
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_2_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleWS_in_rulenamespaceDeclaration1019);
                    	    ruleWS();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_rulenamespaceDeclaration1032); 

                        	newLeafNode(otherlv_4, grammarAccess.getNamespaceDeclarationAccess().getEqualsSignKeyword_2_2());
                        
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:428:1: ( ruleWS )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>=RULE_SP && LA10_0<=RULE_SL_COMMENT)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:429:5: ruleWS
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_2_3()); 
                    	        
                    	    pushFollow(FOLLOW_ruleWS_in_rulenamespaceDeclaration1049);
                    	    ruleWS();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:436:5: ( (lv_uri_6_0= ruleURISTRING ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:437:1: (lv_uri_6_0= ruleURISTRING )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:437:1: (lv_uri_6_0= ruleURISTRING )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:438:3: lv_uri_6_0= ruleURISTRING
            {
             
            	        newCompositeNode(grammarAccess.getNamespaceDeclarationAccess().getUriURISTRINGParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleURISTRING_in_rulenamespaceDeclaration1073);
            lv_uri_6_0=ruleURISTRING();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNamespaceDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"uri",
                    		lv_uri_6_0, 
                    		"URISTRING");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:454:2: ( ruleWS )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_SP && LA12_0<=RULE_SL_COMMENT)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:455:5: ruleWS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_4()); 
            	        
            	    pushFollow(FOLLOW_ruleWS_in_rulenamespaceDeclaration1090);
            	    ruleWS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_8=(Token)match(input,13,FOLLOW_13_in_rulenamespaceDeclaration1103); 

                	newLeafNode(otherlv_8, grammarAccess.getNamespaceDeclarationAccess().getFullStopKeyword_5());
                
             
                    newCompositeNode(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_6()); 
                
            pushFollow(FOLLOW_ruleWS_in_rulenamespaceDeclaration1119);
            ruleWS();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulenamespaceDeclaration"


    // $ANTLR start "entryRuleGID"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:484:1: entryRuleGID returns [String current=null] : iv_ruleGID= ruleGID EOF ;
    public final String entryRuleGID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGID = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:485:2: (iv_ruleGID= ruleGID EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:486:2: iv_ruleGID= ruleGID EOF
            {
             newCompositeNode(grammarAccess.getGIDRule()); 
            pushFollow(FOLLOW_ruleGID_in_entryRuleGID1157);
            iv_ruleGID=ruleGID();

            state._fsp--;

             current =iv_ruleGID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGID1168); 

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
    // $ANTLR end "entryRuleGID"


    // $ANTLR start "ruleGID"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:493:1: ruleGID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CID_0= RULE_CID | this_ANY_OTHER_1= RULE_ANY_OTHER )+ ;
    public final AntlrDatatypeRuleToken ruleGID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CID_0=null;
        Token this_ANY_OTHER_1=null;

         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:496:28: ( (this_CID_0= RULE_CID | this_ANY_OTHER_1= RULE_ANY_OTHER )+ )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:497:1: (this_CID_0= RULE_CID | this_ANY_OTHER_1= RULE_ANY_OTHER )+
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:497:1: (this_CID_0= RULE_CID | this_ANY_OTHER_1= RULE_ANY_OTHER )+
            int cnt13=0;
            loop13:
            do {
                int alt13=3;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_CID) ) {
                    alt13=1;
                }
                else if ( (LA13_0==RULE_ANY_OTHER) ) {
                    alt13=2;
                }


                switch (alt13) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:497:6: this_CID_0= RULE_CID
            	    {
            	    this_CID_0=(Token)match(input,RULE_CID,FOLLOW_RULE_CID_in_ruleGID1208); 

            	    		current.merge(this_CID_0);
            	        
            	     
            	        newLeafNode(this_CID_0, grammarAccess.getGIDAccess().getCIDTerminalRuleCall_0()); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:505:10: this_ANY_OTHER_1= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_1=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleGID1234); 

            	    		current.merge(this_ANY_OTHER_1);
            	        
            	     
            	        newLeafNode(this_ANY_OTHER_1, grammarAccess.getGIDAccess().getANY_OTHERTerminalRuleCall_1()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGID"


    // $ANTLR start "entryRuleSOMETHING"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:520:1: entryRuleSOMETHING returns [String current=null] : iv_ruleSOMETHING= ruleSOMETHING EOF ;
    public final String entryRuleSOMETHING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSOMETHING = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:521:2: (iv_ruleSOMETHING= ruleSOMETHING EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:522:2: iv_ruleSOMETHING= ruleSOMETHING EOF
            {
             newCompositeNode(grammarAccess.getSOMETHINGRule()); 
            pushFollow(FOLLOW_ruleSOMETHING_in_entryRuleSOMETHING1281);
            iv_ruleSOMETHING=ruleSOMETHING();

            state._fsp--;

             current =iv_ruleSOMETHING.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSOMETHING1292); 

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
    // $ANTLR end "entryRuleSOMETHING"


    // $ANTLR start "ruleSOMETHING"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:529:1: ruleSOMETHING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ANY_OTHER_0= RULE_ANY_OTHER | this_CID_1= RULE_CID | this_INT_2= RULE_INT | (kw= '.' this_CID_4= RULE_CID ) | kw= ':' | kw= '{' | kw= '}' | kw= '=' | kw= '<' | kw= '->' | kw= '%' | kw= '-' | kw= '\\'' | this_WS_14= ruleWS ) ;
    public final AntlrDatatypeRuleToken ruleSOMETHING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ANY_OTHER_0=null;
        Token this_CID_1=null;
        Token this_INT_2=null;
        Token kw=null;
        Token this_CID_4=null;
        AntlrDatatypeRuleToken this_WS_14 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:532:28: ( (this_ANY_OTHER_0= RULE_ANY_OTHER | this_CID_1= RULE_CID | this_INT_2= RULE_INT | (kw= '.' this_CID_4= RULE_CID ) | kw= ':' | kw= '{' | kw= '}' | kw= '=' | kw= '<' | kw= '->' | kw= '%' | kw= '-' | kw= '\\'' | this_WS_14= ruleWS ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:533:1: (this_ANY_OTHER_0= RULE_ANY_OTHER | this_CID_1= RULE_CID | this_INT_2= RULE_INT | (kw= '.' this_CID_4= RULE_CID ) | kw= ':' | kw= '{' | kw= '}' | kw= '=' | kw= '<' | kw= '->' | kw= '%' | kw= '-' | kw= '\\'' | this_WS_14= ruleWS )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:533:1: (this_ANY_OTHER_0= RULE_ANY_OTHER | this_CID_1= RULE_CID | this_INT_2= RULE_INT | (kw= '.' this_CID_4= RULE_CID ) | kw= ':' | kw= '{' | kw= '}' | kw= '=' | kw= '<' | kw= '->' | kw= '%' | kw= '-' | kw= '\\'' | this_WS_14= ruleWS )
            int alt14=14;
            switch ( input.LA(1) ) {
            case RULE_ANY_OTHER:
                {
                alt14=1;
                }
                break;
            case RULE_CID:
                {
                alt14=2;
                }
                break;
            case RULE_INT:
                {
                alt14=3;
                }
                break;
            case 13:
                {
                alt14=4;
                }
                break;
            case 18:
                {
                alt14=5;
                }
                break;
            case 19:
                {
                alt14=6;
                }
                break;
            case 20:
                {
                alt14=7;
                }
                break;
            case 17:
                {
                alt14=8;
                }
                break;
            case 21:
                {
                alt14=9;
                }
                break;
            case 22:
                {
                alt14=10;
                }
                break;
            case 23:
                {
                alt14=11;
                }
                break;
            case 24:
                {
                alt14=12;
                }
                break;
            case 25:
                {
                alt14=13;
                }
                break;
            case RULE_SP:
            case RULE_ML_COMMENT:
            case RULE_ML2_COMMENT:
            case RULE_SL_COMMENT:
                {
                alt14=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:533:6: this_ANY_OTHER_0= RULE_ANY_OTHER
                    {
                    this_ANY_OTHER_0=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleSOMETHING1332); 

                    		current.merge(this_ANY_OTHER_0);
                        
                     
                        newLeafNode(this_ANY_OTHER_0, grammarAccess.getSOMETHINGAccess().getANY_OTHERTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:541:10: this_CID_1= RULE_CID
                    {
                    this_CID_1=(Token)match(input,RULE_CID,FOLLOW_RULE_CID_in_ruleSOMETHING1358); 

                    		current.merge(this_CID_1);
                        
                     
                        newLeafNode(this_CID_1, grammarAccess.getSOMETHINGAccess().getCIDTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:549:10: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSOMETHING1384); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getSOMETHINGAccess().getINTTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:557:6: (kw= '.' this_CID_4= RULE_CID )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:557:6: (kw= '.' this_CID_4= RULE_CID )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:558:2: kw= '.' this_CID_4= RULE_CID
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleSOMETHING1409); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSOMETHINGAccess().getFullStopKeyword_3_0()); 
                        
                    this_CID_4=(Token)match(input,RULE_CID,FOLLOW_RULE_CID_in_ruleSOMETHING1424); 

                    		current.merge(this_CID_4);
                        
                     
                        newLeafNode(this_CID_4, grammarAccess.getSOMETHINGAccess().getCIDTerminalRuleCall_3_1()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:572:2: kw= ':'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleSOMETHING1449); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSOMETHINGAccess().getColonKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:579:2: kw= '{'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleSOMETHING1468); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSOMETHINGAccess().getLeftCurlyBracketKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:586:2: kw= '}'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleSOMETHING1487); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSOMETHINGAccess().getRightCurlyBracketKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:593:2: kw= '='
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleSOMETHING1506); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSOMETHINGAccess().getEqualsSignKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:600:2: kw= '<'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleSOMETHING1525); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSOMETHINGAccess().getLessThanSignKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:607:2: kw= '->'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleSOMETHING1544); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSOMETHINGAccess().getHyphenMinusGreaterThanSignKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:614:2: kw= '%'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleSOMETHING1563); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSOMETHINGAccess().getPercentSignKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:621:2: kw= '-'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleSOMETHING1582); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSOMETHINGAccess().getHyphenMinusKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:628:2: kw= '\\''
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleSOMETHING1601); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSOMETHINGAccess().getApostropheKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:635:5: this_WS_14= ruleWS
                    {
                     
                            newCompositeNode(grammarAccess.getSOMETHINGAccess().getWSParserRuleCall_13()); 
                        
                    pushFollow(FOLLOW_ruleWS_in_ruleSOMETHING1629);
                    this_WS_14=ruleWS();

                    state._fsp--;


                    		current.merge(this_WS_14);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSOMETHING"


    // $ANTLR start "entryRulesignatureDeclaration"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:655:1: entryRulesignatureDeclaration returns [EObject current=null] : iv_rulesignatureDeclaration= rulesignatureDeclaration EOF ;
    public final EObject entryRulesignatureDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesignatureDeclaration = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:656:2: (iv_rulesignatureDeclaration= rulesignatureDeclaration EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:657:2: iv_rulesignatureDeclaration= rulesignatureDeclaration EOF
            {
             newCompositeNode(grammarAccess.getSignatureDeclarationRule()); 
            pushFollow(FOLLOW_rulesignatureDeclaration_in_entryRulesignatureDeclaration1676);
            iv_rulesignatureDeclaration=rulesignatureDeclaration();

            state._fsp--;

             current =iv_rulesignatureDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesignatureDeclaration1686); 

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
    // $ANTLR end "entryRulesignatureDeclaration"


    // $ANTLR start "rulesignatureDeclaration"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:664:1: rulesignatureDeclaration returns [EObject current=null] : (otherlv_0= '%sig' ( ruleWS )+ ( (lv_sigName_2_0= RULE_CID ) ) ( ruleWS )* otherlv_4= '=' ( ruleWS )* otherlv_6= '{' ( ruleWS )* ( (lv_sigDefinitions_8_0= rulesigDefinitions ) )* otherlv_9= '}' ( ruleWS )* otherlv_11= '.' ruleWS ) ;
    public final EObject rulesignatureDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_sigName_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_sigDefinitions_8_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:667:28: ( (otherlv_0= '%sig' ( ruleWS )+ ( (lv_sigName_2_0= RULE_CID ) ) ( ruleWS )* otherlv_4= '=' ( ruleWS )* otherlv_6= '{' ( ruleWS )* ( (lv_sigDefinitions_8_0= rulesigDefinitions ) )* otherlv_9= '}' ( ruleWS )* otherlv_11= '.' ruleWS ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:668:1: (otherlv_0= '%sig' ( ruleWS )+ ( (lv_sigName_2_0= RULE_CID ) ) ( ruleWS )* otherlv_4= '=' ( ruleWS )* otherlv_6= '{' ( ruleWS )* ( (lv_sigDefinitions_8_0= rulesigDefinitions ) )* otherlv_9= '}' ( ruleWS )* otherlv_11= '.' ruleWS )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:668:1: (otherlv_0= '%sig' ( ruleWS )+ ( (lv_sigName_2_0= RULE_CID ) ) ( ruleWS )* otherlv_4= '=' ( ruleWS )* otherlv_6= '{' ( ruleWS )* ( (lv_sigDefinitions_8_0= rulesigDefinitions ) )* otherlv_9= '}' ( ruleWS )* otherlv_11= '.' ruleWS )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:668:3: otherlv_0= '%sig' ( ruleWS )+ ( (lv_sigName_2_0= RULE_CID ) ) ( ruleWS )* otherlv_4= '=' ( ruleWS )* otherlv_6= '{' ( ruleWS )* ( (lv_sigDefinitions_8_0= rulesigDefinitions ) )* otherlv_9= '}' ( ruleWS )* otherlv_11= '.' ruleWS
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_rulesignatureDeclaration1723); 

                	newLeafNode(otherlv_0, grammarAccess.getSignatureDeclarationAccess().getSigKeyword_0());
                
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:672:1: ( ruleWS )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_SP && LA15_0<=RULE_SL_COMMENT)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:673:5: ruleWS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_1()); 
            	        
            	    pushFollow(FOLLOW_ruleWS_in_rulesignatureDeclaration1740);
            	    ruleWS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:680:3: ( (lv_sigName_2_0= RULE_CID ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:681:1: (lv_sigName_2_0= RULE_CID )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:681:1: (lv_sigName_2_0= RULE_CID )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:682:3: lv_sigName_2_0= RULE_CID
            {
            lv_sigName_2_0=(Token)match(input,RULE_CID,FOLLOW_RULE_CID_in_rulesignatureDeclaration1758); 

            			newLeafNode(lv_sigName_2_0, grammarAccess.getSignatureDeclarationAccess().getSigNameCIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSignatureDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"sigName",
                    		lv_sigName_2_0, 
                    		"CID");
            	    

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:698:2: ( ruleWS )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_SP && LA16_0<=RULE_SL_COMMENT)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:699:5: ruleWS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_3()); 
            	        
            	    pushFollow(FOLLOW_ruleWS_in_rulesignatureDeclaration1780);
            	    ruleWS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_rulesignatureDeclaration1793); 

                	newLeafNode(otherlv_4, grammarAccess.getSignatureDeclarationAccess().getEqualsSignKeyword_4());
                
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:710:1: ( ruleWS )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_SP && LA17_0<=RULE_SL_COMMENT)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:711:5: ruleWS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_5()); 
            	        
            	    pushFollow(FOLLOW_ruleWS_in_rulesignatureDeclaration1810);
            	    ruleWS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_6=(Token)match(input,19,FOLLOW_19_in_rulesignatureDeclaration1823); 

                	newLeafNode(otherlv_6, grammarAccess.getSignatureDeclarationAccess().getLeftCurlyBracketKeyword_6());
                
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:722:1: ( ruleWS )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_SP && LA18_0<=RULE_SL_COMMENT)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:723:5: ruleWS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_7()); 
            	        
            	    pushFollow(FOLLOW_ruleWS_in_rulesignatureDeclaration1840);
            	    ruleWS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:730:3: ( (lv_sigDefinitions_8_0= rulesigDefinitions ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_CID && LA19_0<=RULE_ANY_OTHER)||(LA19_0>=28 && LA19_0<=33)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:731:1: (lv_sigDefinitions_8_0= rulesigDefinitions )
            	    {
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:731:1: (lv_sigDefinitions_8_0= rulesigDefinitions )
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:732:3: lv_sigDefinitions_8_0= rulesigDefinitions
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSignatureDeclarationAccess().getSigDefinitionsSigDefinitionsParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulesigDefinitions_in_rulesignatureDeclaration1862);
            	    lv_sigDefinitions_8_0=rulesigDefinitions();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSignatureDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sigDefinitions",
            	            		lv_sigDefinitions_8_0, 
            	            		"sigDefinitions");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_9=(Token)match(input,20,FOLLOW_20_in_rulesignatureDeclaration1875); 

                	newLeafNode(otherlv_9, grammarAccess.getSignatureDeclarationAccess().getRightCurlyBracketKeyword_9());
                
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:752:1: ( ruleWS )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_SP && LA20_0<=RULE_SL_COMMENT)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:753:5: ruleWS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_10()); 
            	        
            	    pushFollow(FOLLOW_ruleWS_in_rulesignatureDeclaration1892);
            	    ruleWS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_11=(Token)match(input,13,FOLLOW_13_in_rulesignatureDeclaration1905); 

                	newLeafNode(otherlv_11, grammarAccess.getSignatureDeclarationAccess().getFullStopKeyword_11());
                
             
                    newCompositeNode(grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_12()); 
                
            pushFollow(FOLLOW_ruleWS_in_rulesignatureDeclaration1921);
            ruleWS();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesignatureDeclaration"


    // $ANTLR start "entryRulesigDefinitions"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:780:1: entryRulesigDefinitions returns [EObject current=null] : iv_rulesigDefinitions= rulesigDefinitions EOF ;
    public final EObject entryRulesigDefinitions() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesigDefinitions = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:781:2: (iv_rulesigDefinitions= rulesigDefinitions EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:782:2: iv_rulesigDefinitions= rulesigDefinitions EOF
            {
             newCompositeNode(grammarAccess.getSigDefinitionsRule()); 
            pushFollow(FOLLOW_rulesigDefinitions_in_entryRulesigDefinitions1956);
            iv_rulesigDefinitions=rulesigDefinitions();

            state._fsp--;

             current =iv_rulesigDefinitions; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesigDefinitions1966); 

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
    // $ANTLR end "entryRulesigDefinitions"


    // $ANTLR start "rulesigDefinitions"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:789:1: rulesigDefinitions returns [EObject current=null] : ( ( ( (lv_symbName_0_0= ruleGID ) ) ( ruleWS )* (otherlv_2= ':' | otherlv_3= ':=' | otherlv_4= '=' ) ( ruleSOMETHING )* otherlv_6= '.' ruleWS ) | (otherlv_8= '%include' ( ruleWS )+ ( (lv_namespace_10_0= ruleNAMESPACE ) ) ( ( ruleWS )+ ruleincludeOps )? otherlv_13= '.' ruleWS ) | (otherlv_15= '%struct' ( ruleWS )+ ( (lv_structName_17_0= ruleGID ) ) ( ruleWS )* otherlv_19= ':' ( ruleSOMETHING )* ( ruleincludeOps )? otherlv_22= '.' ruleWS ) | ( (otherlv_24= '%infix' | otherlv_25= '%prefix' ) ( ( ruleWS )+ ( (lv_type_27_0= ruleGID ) ) )? ( ruleWS )+ ( (lv_precendece_29_0= RULE_INT ) ) ( ruleSOMETHING )* otherlv_31= '.' ruleWS ) | ( ( ( (lv_tmp_33_1= '%meta' | lv_tmp_33_2= '%abbrev' ) ) ) ( ruleSOMETHING )* otherlv_35= '.' ruleWS ) ) ;
    public final EObject rulesigDefinitions() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_19=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token lv_precendece_29_0=null;
        Token otherlv_31=null;
        Token lv_tmp_33_1=null;
        Token lv_tmp_33_2=null;
        Token otherlv_35=null;
        AntlrDatatypeRuleToken lv_symbName_0_0 = null;

        AntlrDatatypeRuleToken lv_namespace_10_0 = null;

        AntlrDatatypeRuleToken lv_structName_17_0 = null;

        AntlrDatatypeRuleToken lv_type_27_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:792:28: ( ( ( ( (lv_symbName_0_0= ruleGID ) ) ( ruleWS )* (otherlv_2= ':' | otherlv_3= ':=' | otherlv_4= '=' ) ( ruleSOMETHING )* otherlv_6= '.' ruleWS ) | (otherlv_8= '%include' ( ruleWS )+ ( (lv_namespace_10_0= ruleNAMESPACE ) ) ( ( ruleWS )+ ruleincludeOps )? otherlv_13= '.' ruleWS ) | (otherlv_15= '%struct' ( ruleWS )+ ( (lv_structName_17_0= ruleGID ) ) ( ruleWS )* otherlv_19= ':' ( ruleSOMETHING )* ( ruleincludeOps )? otherlv_22= '.' ruleWS ) | ( (otherlv_24= '%infix' | otherlv_25= '%prefix' ) ( ( ruleWS )+ ( (lv_type_27_0= ruleGID ) ) )? ( ruleWS )+ ( (lv_precendece_29_0= RULE_INT ) ) ( ruleSOMETHING )* otherlv_31= '.' ruleWS ) | ( ( ( (lv_tmp_33_1= '%meta' | lv_tmp_33_2= '%abbrev' ) ) ) ( ruleSOMETHING )* otherlv_35= '.' ruleWS ) ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:793:1: ( ( ( (lv_symbName_0_0= ruleGID ) ) ( ruleWS )* (otherlv_2= ':' | otherlv_3= ':=' | otherlv_4= '=' ) ( ruleSOMETHING )* otherlv_6= '.' ruleWS ) | (otherlv_8= '%include' ( ruleWS )+ ( (lv_namespace_10_0= ruleNAMESPACE ) ) ( ( ruleWS )+ ruleincludeOps )? otherlv_13= '.' ruleWS ) | (otherlv_15= '%struct' ( ruleWS )+ ( (lv_structName_17_0= ruleGID ) ) ( ruleWS )* otherlv_19= ':' ( ruleSOMETHING )* ( ruleincludeOps )? otherlv_22= '.' ruleWS ) | ( (otherlv_24= '%infix' | otherlv_25= '%prefix' ) ( ( ruleWS )+ ( (lv_type_27_0= ruleGID ) ) )? ( ruleWS )+ ( (lv_precendece_29_0= RULE_INT ) ) ( ruleSOMETHING )* otherlv_31= '.' ruleWS ) | ( ( ( (lv_tmp_33_1= '%meta' | lv_tmp_33_2= '%abbrev' ) ) ) ( ruleSOMETHING )* otherlv_35= '.' ruleWS ) )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:793:1: ( ( ( (lv_symbName_0_0= ruleGID ) ) ( ruleWS )* (otherlv_2= ':' | otherlv_3= ':=' | otherlv_4= '=' ) ( ruleSOMETHING )* otherlv_6= '.' ruleWS ) | (otherlv_8= '%include' ( ruleWS )+ ( (lv_namespace_10_0= ruleNAMESPACE ) ) ( ( ruleWS )+ ruleincludeOps )? otherlv_13= '.' ruleWS ) | (otherlv_15= '%struct' ( ruleWS )+ ( (lv_structName_17_0= ruleGID ) ) ( ruleWS )* otherlv_19= ':' ( ruleSOMETHING )* ( ruleincludeOps )? otherlv_22= '.' ruleWS ) | ( (otherlv_24= '%infix' | otherlv_25= '%prefix' ) ( ( ruleWS )+ ( (lv_type_27_0= ruleGID ) ) )? ( ruleWS )+ ( (lv_precendece_29_0= RULE_INT ) ) ( ruleSOMETHING )* otherlv_31= '.' ruleWS ) | ( ( ( (lv_tmp_33_1= '%meta' | lv_tmp_33_2= '%abbrev' ) ) ) ( ruleSOMETHING )* otherlv_35= '.' ruleWS ) )
            int alt38=5;
            switch ( input.LA(1) ) {
            case RULE_CID:
            case RULE_ANY_OTHER:
                {
                alt38=1;
                }
                break;
            case 28:
                {
                alt38=2;
                }
                break;
            case 29:
                {
                alt38=3;
                }
                break;
            case 30:
            case 31:
                {
                alt38=4;
                }
                break;
            case 32:
            case 33:
                {
                alt38=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:793:2: ( ( (lv_symbName_0_0= ruleGID ) ) ( ruleWS )* (otherlv_2= ':' | otherlv_3= ':=' | otherlv_4= '=' ) ( ruleSOMETHING )* otherlv_6= '.' ruleWS )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:793:2: ( ( (lv_symbName_0_0= ruleGID ) ) ( ruleWS )* (otherlv_2= ':' | otherlv_3= ':=' | otherlv_4= '=' ) ( ruleSOMETHING )* otherlv_6= '.' ruleWS )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:793:3: ( (lv_symbName_0_0= ruleGID ) ) ( ruleWS )* (otherlv_2= ':' | otherlv_3= ':=' | otherlv_4= '=' ) ( ruleSOMETHING )* otherlv_6= '.' ruleWS
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:793:3: ( (lv_symbName_0_0= ruleGID ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:794:1: (lv_symbName_0_0= ruleGID )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:794:1: (lv_symbName_0_0= ruleGID )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:795:3: lv_symbName_0_0= ruleGID
                    {
                     
                    	        newCompositeNode(grammarAccess.getSigDefinitionsAccess().getSymbNameGIDParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGID_in_rulesigDefinitions2013);
                    lv_symbName_0_0=ruleGID();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSigDefinitionsRule());
                    	        }
                           		set(
                           			current, 
                           			"symbName",
                            		lv_symbName_0_0, 
                            		"GID");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:811:2: ( ruleWS )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( ((LA21_0>=RULE_SP && LA21_0<=RULE_SL_COMMENT)) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:812:5: ruleWS
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_0_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleWS_in_rulesigDefinitions2030);
                    	    ruleWS();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:819:3: (otherlv_2= ':' | otherlv_3= ':=' | otherlv_4= '=' )
                    int alt22=3;
                    switch ( input.LA(1) ) {
                    case 18:
                        {
                        alt22=1;
                        }
                        break;
                    case 27:
                        {
                        alt22=2;
                        }
                        break;
                    case 17:
                        {
                        alt22=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }

                    switch (alt22) {
                        case 1 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:819:5: otherlv_2= ':'
                            {
                            otherlv_2=(Token)match(input,18,FOLLOW_18_in_rulesigDefinitions2044); 

                                	newLeafNode(otherlv_2, grammarAccess.getSigDefinitionsAccess().getColonKeyword_0_2_0());
                                

                            }
                            break;
                        case 2 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:824:7: otherlv_3= ':='
                            {
                            otherlv_3=(Token)match(input,27,FOLLOW_27_in_rulesigDefinitions2062); 

                                	newLeafNode(otherlv_3, grammarAccess.getSigDefinitionsAccess().getColonEqualsSignKeyword_0_2_1());
                                

                            }
                            break;
                        case 3 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:829:7: otherlv_4= '='
                            {
                            otherlv_4=(Token)match(input,17,FOLLOW_17_in_rulesigDefinitions2080); 

                                	newLeafNode(otherlv_4, grammarAccess.getSigDefinitionsAccess().getEqualsSignKeyword_0_2_2());
                                

                            }
                            break;

                    }

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:833:2: ( ruleSOMETHING )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==13) ) {
                            int LA23_1 = input.LA(2);

                            if ( (LA23_1==RULE_CID) ) {
                                alt23=1;
                            }


                        }
                        else if ( ((LA23_0>=RULE_SP && LA23_0<=RULE_INT)||(LA23_0>=17 && LA23_0<=25)) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:834:5: ruleSOMETHING
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getSigDefinitionsAccess().getSOMETHINGParserRuleCall_0_3()); 
                    	        
                    	    pushFollow(FOLLOW_ruleSOMETHING_in_rulesigDefinitions2098);
                    	    ruleSOMETHING();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,13,FOLLOW_13_in_rulesigDefinitions2111); 

                        	newLeafNode(otherlv_6, grammarAccess.getSigDefinitionsAccess().getFullStopKeyword_0_4());
                        
                     
                            newCompositeNode(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_0_5()); 
                        
                    pushFollow(FOLLOW_ruleWS_in_rulesigDefinitions2127);
                    ruleWS();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:854:6: (otherlv_8= '%include' ( ruleWS )+ ( (lv_namespace_10_0= ruleNAMESPACE ) ) ( ( ruleWS )+ ruleincludeOps )? otherlv_13= '.' ruleWS )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:854:6: (otherlv_8= '%include' ( ruleWS )+ ( (lv_namespace_10_0= ruleNAMESPACE ) ) ( ( ruleWS )+ ruleincludeOps )? otherlv_13= '.' ruleWS )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:854:8: otherlv_8= '%include' ( ruleWS )+ ( (lv_namespace_10_0= ruleNAMESPACE ) ) ( ( ruleWS )+ ruleincludeOps )? otherlv_13= '.' ruleWS
                    {
                    otherlv_8=(Token)match(input,28,FOLLOW_28_in_rulesigDefinitions2146); 

                        	newLeafNode(otherlv_8, grammarAccess.getSigDefinitionsAccess().getIncludeKeyword_1_0());
                        
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:858:1: ( ruleWS )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( ((LA24_0>=RULE_SP && LA24_0<=RULE_SL_COMMENT)) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:859:5: ruleWS
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_1_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleWS_in_rulesigDefinitions2163);
                    	    ruleWS();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt24 >= 1 ) break loop24;
                                EarlyExitException eee =
                                    new EarlyExitException(24, input);
                                throw eee;
                        }
                        cnt24++;
                    } while (true);

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:866:3: ( (lv_namespace_10_0= ruleNAMESPACE ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:867:1: (lv_namespace_10_0= ruleNAMESPACE )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:867:1: (lv_namespace_10_0= ruleNAMESPACE )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:868:3: lv_namespace_10_0= ruleNAMESPACE
                    {
                     
                    	        newCompositeNode(grammarAccess.getSigDefinitionsAccess().getNamespaceNAMESPACEParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNAMESPACE_in_rulesigDefinitions2185);
                    lv_namespace_10_0=ruleNAMESPACE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSigDefinitionsRule());
                    	        }
                           		set(
                           			current, 
                           			"namespace",
                            		lv_namespace_10_0, 
                            		"NAMESPACE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:884:2: ( ( ruleWS )+ ruleincludeOps )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( ((LA26_0>=RULE_SP && LA26_0<=RULE_SL_COMMENT)) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:884:3: ( ruleWS )+ ruleincludeOps
                            {
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:884:3: ( ruleWS )+
                            int cnt25=0;
                            loop25:
                            do {
                                int alt25=2;
                                int LA25_0 = input.LA(1);

                                if ( ((LA25_0>=RULE_SP && LA25_0<=RULE_SL_COMMENT)) ) {
                                    alt25=1;
                                }


                                switch (alt25) {
                            	case 1 :
                            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:885:5: ruleWS
                            	    {
                            	     
                            	            newCompositeNode(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_1_3_0()); 
                            	        
                            	    pushFollow(FOLLOW_ruleWS_in_rulesigDefinitions2203);
                            	    ruleWS();

                            	    state._fsp--;

                            	     
                            	            afterParserOrEnumRuleCall();
                            	        

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt25 >= 1 ) break loop25;
                                        EarlyExitException eee =
                                            new EarlyExitException(25, input);
                                        throw eee;
                                }
                                cnt25++;
                            } while (true);

                             
                                    newCompositeNode(grammarAccess.getSigDefinitionsAccess().getIncludeOpsParserRuleCall_1_3_1()); 
                                
                            pushFollow(FOLLOW_ruleincludeOps_in_rulesigDefinitions2220);
                            ruleincludeOps();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,13,FOLLOW_13_in_rulesigDefinitions2233); 

                        	newLeafNode(otherlv_13, grammarAccess.getSigDefinitionsAccess().getFullStopKeyword_1_4());
                        
                     
                            newCompositeNode(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_1_5()); 
                        
                    pushFollow(FOLLOW_ruleWS_in_rulesigDefinitions2249);
                    ruleWS();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:913:6: (otherlv_15= '%struct' ( ruleWS )+ ( (lv_structName_17_0= ruleGID ) ) ( ruleWS )* otherlv_19= ':' ( ruleSOMETHING )* ( ruleincludeOps )? otherlv_22= '.' ruleWS )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:913:6: (otherlv_15= '%struct' ( ruleWS )+ ( (lv_structName_17_0= ruleGID ) ) ( ruleWS )* otherlv_19= ':' ( ruleSOMETHING )* ( ruleincludeOps )? otherlv_22= '.' ruleWS )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:913:8: otherlv_15= '%struct' ( ruleWS )+ ( (lv_structName_17_0= ruleGID ) ) ( ruleWS )* otherlv_19= ':' ( ruleSOMETHING )* ( ruleincludeOps )? otherlv_22= '.' ruleWS
                    {
                    otherlv_15=(Token)match(input,29,FOLLOW_29_in_rulesigDefinitions2268); 

                        	newLeafNode(otherlv_15, grammarAccess.getSigDefinitionsAccess().getStructKeyword_2_0());
                        
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:917:1: ( ruleWS )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( ((LA27_0>=RULE_SP && LA27_0<=RULE_SL_COMMENT)) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:918:5: ruleWS
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_2_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleWS_in_rulesigDefinitions2285);
                    	    ruleWS();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt27 >= 1 ) break loop27;
                                EarlyExitException eee =
                                    new EarlyExitException(27, input);
                                throw eee;
                        }
                        cnt27++;
                    } while (true);

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:925:3: ( (lv_structName_17_0= ruleGID ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:926:1: (lv_structName_17_0= ruleGID )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:926:1: (lv_structName_17_0= ruleGID )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:927:3: lv_structName_17_0= ruleGID
                    {
                     
                    	        newCompositeNode(grammarAccess.getSigDefinitionsAccess().getStructNameGIDParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGID_in_rulesigDefinitions2307);
                    lv_structName_17_0=ruleGID();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSigDefinitionsRule());
                    	        }
                           		set(
                           			current, 
                           			"structName",
                            		lv_structName_17_0, 
                            		"GID");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:943:2: ( ruleWS )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( ((LA28_0>=RULE_SP && LA28_0<=RULE_SL_COMMENT)) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:944:5: ruleWS
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_2_3()); 
                    	        
                    	    pushFollow(FOLLOW_ruleWS_in_rulesigDefinitions2324);
                    	    ruleWS();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,18,FOLLOW_18_in_rulesigDefinitions2337); 

                        	newLeafNode(otherlv_19, grammarAccess.getSigDefinitionsAccess().getColonKeyword_2_4());
                        
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:955:1: ( ruleSOMETHING )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==13) ) {
                            int LA29_2 = input.LA(2);

                            if ( (LA29_2==RULE_CID) ) {
                                alt29=1;
                            }


                        }
                        else if ( ((LA29_0>=RULE_SP && LA29_0<=RULE_INT)||(LA29_0>=17 && LA29_0<=25)) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:956:5: ruleSOMETHING
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getSigDefinitionsAccess().getSOMETHINGParserRuleCall_2_5()); 
                    	        
                    	    pushFollow(FOLLOW_ruleSOMETHING_in_rulesigDefinitions2354);
                    	    ruleSOMETHING();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:963:3: ( ruleincludeOps )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==34) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:964:5: ruleincludeOps
                            {
                             
                                    newCompositeNode(grammarAccess.getSigDefinitionsAccess().getIncludeOpsParserRuleCall_2_6()); 
                                
                            pushFollow(FOLLOW_ruleincludeOps_in_rulesigDefinitions2372);
                            ruleincludeOps();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    otherlv_22=(Token)match(input,13,FOLLOW_13_in_rulesigDefinitions2385); 

                        	newLeafNode(otherlv_22, grammarAccess.getSigDefinitionsAccess().getFullStopKeyword_2_7());
                        
                     
                            newCompositeNode(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_2_8()); 
                        
                    pushFollow(FOLLOW_ruleWS_in_rulesigDefinitions2401);
                    ruleWS();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 4 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:984:6: ( (otherlv_24= '%infix' | otherlv_25= '%prefix' ) ( ( ruleWS )+ ( (lv_type_27_0= ruleGID ) ) )? ( ruleWS )+ ( (lv_precendece_29_0= RULE_INT ) ) ( ruleSOMETHING )* otherlv_31= '.' ruleWS )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:984:6: ( (otherlv_24= '%infix' | otherlv_25= '%prefix' ) ( ( ruleWS )+ ( (lv_type_27_0= ruleGID ) ) )? ( ruleWS )+ ( (lv_precendece_29_0= RULE_INT ) ) ( ruleSOMETHING )* otherlv_31= '.' ruleWS )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:984:7: (otherlv_24= '%infix' | otherlv_25= '%prefix' ) ( ( ruleWS )+ ( (lv_type_27_0= ruleGID ) ) )? ( ruleWS )+ ( (lv_precendece_29_0= RULE_INT ) ) ( ruleSOMETHING )* otherlv_31= '.' ruleWS
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:984:7: (otherlv_24= '%infix' | otherlv_25= '%prefix' )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==30) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==31) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:984:9: otherlv_24= '%infix'
                            {
                            otherlv_24=(Token)match(input,30,FOLLOW_30_in_rulesigDefinitions2421); 

                                	newLeafNode(otherlv_24, grammarAccess.getSigDefinitionsAccess().getInfixKeyword_3_0_0());
                                

                            }
                            break;
                        case 2 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:989:7: otherlv_25= '%prefix'
                            {
                            otherlv_25=(Token)match(input,31,FOLLOW_31_in_rulesigDefinitions2439); 

                                	newLeafNode(otherlv_25, grammarAccess.getSigDefinitionsAccess().getPrefixKeyword_3_0_1());
                                

                            }
                            break;

                    }

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:993:2: ( ( ruleWS )+ ( (lv_type_27_0= ruleGID ) ) )?
                    int alt33=2;
                    alt33 = dfa33.predict(input);
                    switch (alt33) {
                        case 1 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:993:3: ( ruleWS )+ ( (lv_type_27_0= ruleGID ) )
                            {
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:993:3: ( ruleWS )+
                            int cnt32=0;
                            loop32:
                            do {
                                int alt32=2;
                                int LA32_0 = input.LA(1);

                                if ( ((LA32_0>=RULE_SP && LA32_0<=RULE_SL_COMMENT)) ) {
                                    alt32=1;
                                }


                                switch (alt32) {
                            	case 1 :
                            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:994:5: ruleWS
                            	    {
                            	     
                            	            newCompositeNode(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_3_1_0()); 
                            	        
                            	    pushFollow(FOLLOW_ruleWS_in_rulesigDefinitions2458);
                            	    ruleWS();

                            	    state._fsp--;

                            	     
                            	            afterParserOrEnumRuleCall();
                            	        

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt32 >= 1 ) break loop32;
                                        EarlyExitException eee =
                                            new EarlyExitException(32, input);
                                        throw eee;
                                }
                                cnt32++;
                            } while (true);

                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1001:3: ( (lv_type_27_0= ruleGID ) )
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1002:1: (lv_type_27_0= ruleGID )
                            {
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1002:1: (lv_type_27_0= ruleGID )
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1003:3: lv_type_27_0= ruleGID
                            {
                             
                            	        newCompositeNode(grammarAccess.getSigDefinitionsAccess().getTypeGIDParserRuleCall_3_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleGID_in_rulesigDefinitions2480);
                            lv_type_27_0=ruleGID();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getSigDefinitionsRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"type",
                                    		lv_type_27_0, 
                                    		"GID");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1019:4: ( ruleWS )+
                    int cnt34=0;
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( ((LA34_0>=RULE_SP && LA34_0<=RULE_SL_COMMENT)) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1020:5: ruleWS
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_3_2()); 
                    	        
                    	    pushFollow(FOLLOW_ruleWS_in_rulesigDefinitions2499);
                    	    ruleWS();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt34 >= 1 ) break loop34;
                                EarlyExitException eee =
                                    new EarlyExitException(34, input);
                                throw eee;
                        }
                        cnt34++;
                    } while (true);

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1027:3: ( (lv_precendece_29_0= RULE_INT ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1028:1: (lv_precendece_29_0= RULE_INT )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1028:1: (lv_precendece_29_0= RULE_INT )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1029:3: lv_precendece_29_0= RULE_INT
                    {
                    lv_precendece_29_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulesigDefinitions2517); 

                    			newLeafNode(lv_precendece_29_0, grammarAccess.getSigDefinitionsAccess().getPrecendeceINTTerminalRuleCall_3_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSigDefinitionsRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"precendece",
                            		lv_precendece_29_0, 
                            		"INT");
                    	    

                    }


                    }

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1045:2: ( ruleSOMETHING )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==13) ) {
                            int LA35_1 = input.LA(2);

                            if ( (LA35_1==RULE_CID) ) {
                                alt35=1;
                            }


                        }
                        else if ( ((LA35_0>=RULE_SP && LA35_0<=RULE_INT)||(LA35_0>=17 && LA35_0<=25)) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1046:5: ruleSOMETHING
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getSigDefinitionsAccess().getSOMETHINGParserRuleCall_3_4()); 
                    	        
                    	    pushFollow(FOLLOW_ruleSOMETHING_in_rulesigDefinitions2539);
                    	    ruleSOMETHING();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_31=(Token)match(input,13,FOLLOW_13_in_rulesigDefinitions2552); 

                        	newLeafNode(otherlv_31, grammarAccess.getSigDefinitionsAccess().getFullStopKeyword_3_5());
                        
                     
                            newCompositeNode(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_3_6()); 
                        
                    pushFollow(FOLLOW_ruleWS_in_rulesigDefinitions2568);
                    ruleWS();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 5 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1066:6: ( ( ( (lv_tmp_33_1= '%meta' | lv_tmp_33_2= '%abbrev' ) ) ) ( ruleSOMETHING )* otherlv_35= '.' ruleWS )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1066:6: ( ( ( (lv_tmp_33_1= '%meta' | lv_tmp_33_2= '%abbrev' ) ) ) ( ruleSOMETHING )* otherlv_35= '.' ruleWS )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1066:7: ( ( (lv_tmp_33_1= '%meta' | lv_tmp_33_2= '%abbrev' ) ) ) ( ruleSOMETHING )* otherlv_35= '.' ruleWS
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1066:7: ( ( (lv_tmp_33_1= '%meta' | lv_tmp_33_2= '%abbrev' ) ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1067:1: ( (lv_tmp_33_1= '%meta' | lv_tmp_33_2= '%abbrev' ) )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1067:1: ( (lv_tmp_33_1= '%meta' | lv_tmp_33_2= '%abbrev' ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1068:1: (lv_tmp_33_1= '%meta' | lv_tmp_33_2= '%abbrev' )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1068:1: (lv_tmp_33_1= '%meta' | lv_tmp_33_2= '%abbrev' )
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==32) ) {
                        alt36=1;
                    }
                    else if ( (LA36_0==33) ) {
                        alt36=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 0, input);

                        throw nvae;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1069:3: lv_tmp_33_1= '%meta'
                            {
                            lv_tmp_33_1=(Token)match(input,32,FOLLOW_32_in_rulesigDefinitions2595); 

                                    newLeafNode(lv_tmp_33_1, grammarAccess.getSigDefinitionsAccess().getTmpMetaKeyword_4_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getSigDefinitionsRule());
                            	        }
                                   		setWithLastConsumed(current, "tmp", lv_tmp_33_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1081:8: lv_tmp_33_2= '%abbrev'
                            {
                            lv_tmp_33_2=(Token)match(input,33,FOLLOW_33_in_rulesigDefinitions2624); 

                                    newLeafNode(lv_tmp_33_2, grammarAccess.getSigDefinitionsAccess().getTmpAbbrevKeyword_4_0_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getSigDefinitionsRule());
                            	        }
                                   		setWithLastConsumed(current, "tmp", lv_tmp_33_2, null);
                            	    

                            }
                            break;

                    }


                    }


                    }

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1096:2: ( ruleSOMETHING )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==13) ) {
                            int LA37_1 = input.LA(2);

                            if ( (LA37_1==RULE_CID) ) {
                                alt37=1;
                            }


                        }
                        else if ( ((LA37_0>=RULE_SP && LA37_0<=RULE_INT)||(LA37_0>=17 && LA37_0<=25)) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1097:5: ruleSOMETHING
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getSigDefinitionsAccess().getSOMETHINGParserRuleCall_4_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleSOMETHING_in_rulesigDefinitions2657);
                    	    ruleSOMETHING();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_35=(Token)match(input,13,FOLLOW_13_in_rulesigDefinitions2670); 

                        	newLeafNode(otherlv_35, grammarAccess.getSigDefinitionsAccess().getFullStopKeyword_4_2());
                        
                     
                            newCompositeNode(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_4_3()); 
                        
                    pushFollow(FOLLOW_ruleWS_in_rulesigDefinitions2686);
                    ruleWS();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesigDefinitions"


    // $ANTLR start "entryRuleincludeOps"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1124:1: entryRuleincludeOps returns [String current=null] : iv_ruleincludeOps= ruleincludeOps EOF ;
    public final String entryRuleincludeOps() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleincludeOps = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1125:2: (iv_ruleincludeOps= ruleincludeOps EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1126:2: iv_ruleincludeOps= ruleincludeOps EOF
            {
             newCompositeNode(grammarAccess.getIncludeOpsRule()); 
            pushFollow(FOLLOW_ruleincludeOps_in_entryRuleincludeOps2723);
            iv_ruleincludeOps=ruleincludeOps();

            state._fsp--;

             current =iv_ruleincludeOps.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleincludeOps2734); 

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
    // $ANTLR end "entryRuleincludeOps"


    // $ANTLR start "ruleincludeOps"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1133:1: ruleincludeOps returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '%open' (this_SOMETHING_1= ruleSOMETHING )* ) ;
    public final AntlrDatatypeRuleToken ruleincludeOps() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_SOMETHING_1 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1136:28: ( (kw= '%open' (this_SOMETHING_1= ruleSOMETHING )* ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1137:1: (kw= '%open' (this_SOMETHING_1= ruleSOMETHING )* )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1137:1: (kw= '%open' (this_SOMETHING_1= ruleSOMETHING )* )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1138:2: kw= '%open' (this_SOMETHING_1= ruleSOMETHING )*
            {
            kw=(Token)match(input,34,FOLLOW_34_in_ruleincludeOps2772); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getIncludeOpsAccess().getOpenKeyword_0()); 
                
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1143:1: (this_SOMETHING_1= ruleSOMETHING )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==13) ) {
                    int LA39_1 = input.LA(2);

                    if ( (LA39_1==RULE_CID) ) {
                        alt39=1;
                    }


                }
                else if ( ((LA39_0>=RULE_SP && LA39_0<=RULE_INT)||(LA39_0>=17 && LA39_0<=25)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1144:5: this_SOMETHING_1= ruleSOMETHING
            	    {
            	     
            	            newCompositeNode(grammarAccess.getIncludeOpsAccess().getSOMETHINGParserRuleCall_1()); 
            	        
            	    pushFollow(FOLLOW_ruleSOMETHING_in_ruleincludeOps2795);
            	    this_SOMETHING_1=ruleSOMETHING();

            	    state._fsp--;


            	    		current.merge(this_SOMETHING_1);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleincludeOps"

    // Delegated rules


    protected DFA33 dfa33 = new DFA33(this);
    static final String DFA33_eotS =
        "\7\uffff";
    static final String DFA33_eofS =
        "\7\uffff";
    static final String DFA33_minS =
        "\5\4\2\uffff";
    static final String DFA33_maxS =
        "\1\7\4\12\2\uffff";
    static final String DFA33_acceptS =
        "\5\uffff\1\2\1\1";
    static final String DFA33_specialS =
        "\7\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\1\1\2\1\3\1\4",
            "\1\1\1\2\1\3\1\4\2\6\1\5",
            "\1\1\1\2\1\3\1\4\2\6\1\5",
            "\1\1\1\2\1\3\1\4\2\6\1\5",
            "\1\1\1\2\1\3\1\4\2\6\1\5",
            "",
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "993:2: ( ( ruleWS )+ ( (lv_type_27_0= ruleGID ) ) )?";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenamespaceDeclaration_in_ruleModel132 = new BitSet(new long[]{0x00000000040100F2L});
    public static final BitSet FOLLOW_rulesignatureDeclaration_in_ruleModel151 = new BitSet(new long[]{0x00000000040100F2L});
    public static final BitSet FOLLOW_ruleJUSTSPACE_in_ruleModel170 = new BitSet(new long[]{0x00000000040100F2L});
    public static final BitSet FOLLOW_ruleWS_in_entryRuleWS210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWS221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SP_in_ruleWS261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleWS287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML2_COMMENT_in_ruleWS313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleWS339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNAMESPACE_in_entryRuleNAMESPACE385 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNAMESPACE396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleNAMESPACE435 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_RULE_CID_in_ruleNAMESPACE452 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_12_in_ruleNAMESPACE472 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_13_in_ruleNAMESPACE491 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_CID_in_ruleNAMESPACE507 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_ruleURI_in_entryRuleURI555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURI566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CID_in_ruleURI607 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleURI625 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ruleNAMESPACE_in_ruleURI649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURISTRING_in_entryRuleURISTRING695 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURISTRING706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleURISTRING744 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ruleURI_in_ruleURISTRING766 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleURISTRING784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJUSTSPACE_in_entryRuleJUSTSPACE824 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJUSTSPACE834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_ruleJUSTSPACE879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenamespaceDeclaration_in_entryRulenamespaceDeclaration914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenamespaceDeclaration924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulenamespaceDeclaration961 = new BitSet(new long[]{0x00000000040181F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulenamespaceDeclaration978 = new BitSet(new long[]{0x00000000040181F0L});
    public static final BitSet FOLLOW_RULE_CID_in_rulenamespaceDeclaration997 = new BitSet(new long[]{0x00000000040300F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulenamespaceDeclaration1019 = new BitSet(new long[]{0x00000000040300F0L});
    public static final BitSet FOLLOW_17_in_rulenamespaceDeclaration1032 = new BitSet(new long[]{0x00000000040181F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulenamespaceDeclaration1049 = new BitSet(new long[]{0x00000000040181F0L});
    public static final BitSet FOLLOW_ruleURISTRING_in_rulenamespaceDeclaration1073 = new BitSet(new long[]{0x00000000040120F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulenamespaceDeclaration1090 = new BitSet(new long[]{0x00000000040120F0L});
    public static final BitSet FOLLOW_13_in_rulenamespaceDeclaration1103 = new BitSet(new long[]{0x00000000040100F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulenamespaceDeclaration1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGID_in_entryRuleGID1157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGID1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CID_in_ruleGID1208 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleGID1234 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_ruleSOMETHING_in_entryRuleSOMETHING1281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSOMETHING1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleSOMETHING1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CID_in_ruleSOMETHING1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSOMETHING1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleSOMETHING1409 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_CID_in_ruleSOMETHING1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleSOMETHING1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleSOMETHING1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleSOMETHING1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleSOMETHING1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleSOMETHING1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleSOMETHING1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleSOMETHING1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleSOMETHING1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleSOMETHING1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_ruleSOMETHING1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignatureDeclaration_in_entryRulesignatureDeclaration1676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesignatureDeclaration1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulesignatureDeclaration1723 = new BitSet(new long[]{0x00000000040101F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulesignatureDeclaration1740 = new BitSet(new long[]{0x00000000040101F0L});
    public static final BitSet FOLLOW_RULE_CID_in_rulesignatureDeclaration1758 = new BitSet(new long[]{0x00000000040300F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulesignatureDeclaration1780 = new BitSet(new long[]{0x00000000040300F0L});
    public static final BitSet FOLLOW_17_in_rulesignatureDeclaration1793 = new BitSet(new long[]{0x00000000040900F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulesignatureDeclaration1810 = new BitSet(new long[]{0x00000000040900F0L});
    public static final BitSet FOLLOW_19_in_rulesignatureDeclaration1823 = new BitSet(new long[]{0x00000003F41103F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulesignatureDeclaration1840 = new BitSet(new long[]{0x00000003F41103F0L});
    public static final BitSet FOLLOW_rulesigDefinitions_in_rulesignatureDeclaration1862 = new BitSet(new long[]{0x00000003F0100300L});
    public static final BitSet FOLLOW_20_in_rulesignatureDeclaration1875 = new BitSet(new long[]{0x00000000040120F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulesignatureDeclaration1892 = new BitSet(new long[]{0x00000000040120F0L});
    public static final BitSet FOLLOW_13_in_rulesignatureDeclaration1905 = new BitSet(new long[]{0x00000000040100F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulesignatureDeclaration1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigDefinitions_in_entryRulesigDefinitions1956 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesigDefinitions1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGID_in_rulesigDefinitions2013 = new BitSet(new long[]{0x000000000C0700F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulesigDefinitions2030 = new BitSet(new long[]{0x000000000C0700F0L});
    public static final BitSet FOLLOW_18_in_rulesigDefinitions2044 = new BitSet(new long[]{0x0000000007FF27F0L});
    public static final BitSet FOLLOW_27_in_rulesigDefinitions2062 = new BitSet(new long[]{0x0000000007FF27F0L});
    public static final BitSet FOLLOW_17_in_rulesigDefinitions2080 = new BitSet(new long[]{0x0000000007FF27F0L});
    public static final BitSet FOLLOW_ruleSOMETHING_in_rulesigDefinitions2098 = new BitSet(new long[]{0x0000000007FF27F0L});
    public static final BitSet FOLLOW_13_in_rulesigDefinitions2111 = new BitSet(new long[]{0x00000000040100F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulesigDefinitions2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulesigDefinitions2146 = new BitSet(new long[]{0x00000000040109F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulesigDefinitions2163 = new BitSet(new long[]{0x00000000040109F0L});
    public static final BitSet FOLLOW_ruleNAMESPACE_in_rulesigDefinitions2185 = new BitSet(new long[]{0x00000004040120F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulesigDefinitions2203 = new BitSet(new long[]{0x00000004040100F0L});
    public static final BitSet FOLLOW_ruleincludeOps_in_rulesigDefinitions2220 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulesigDefinitions2233 = new BitSet(new long[]{0x00000000040100F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulesigDefinitions2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulesigDefinitions2268 = new BitSet(new long[]{0x00000000040103F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulesigDefinitions2285 = new BitSet(new long[]{0x00000000040103F0L});
    public static final BitSet FOLLOW_ruleGID_in_rulesigDefinitions2307 = new BitSet(new long[]{0x00000000040500F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulesigDefinitions2324 = new BitSet(new long[]{0x00000000040500F0L});
    public static final BitSet FOLLOW_18_in_rulesigDefinitions2337 = new BitSet(new long[]{0x0000000407FF27F0L});
    public static final BitSet FOLLOW_ruleSOMETHING_in_rulesigDefinitions2354 = new BitSet(new long[]{0x0000000407FF27F0L});
    public static final BitSet FOLLOW_ruleincludeOps_in_rulesigDefinitions2372 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulesigDefinitions2385 = new BitSet(new long[]{0x00000000040100F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulesigDefinitions2401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulesigDefinitions2421 = new BitSet(new long[]{0x00000000040107F0L});
    public static final BitSet FOLLOW_31_in_rulesigDefinitions2439 = new BitSet(new long[]{0x00000000040107F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulesigDefinitions2458 = new BitSet(new long[]{0x00000000040103F0L});
    public static final BitSet FOLLOW_ruleGID_in_rulesigDefinitions2480 = new BitSet(new long[]{0x00000000040104F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulesigDefinitions2499 = new BitSet(new long[]{0x00000000040104F0L});
    public static final BitSet FOLLOW_RULE_INT_in_rulesigDefinitions2517 = new BitSet(new long[]{0x0000000007FF27F0L});
    public static final BitSet FOLLOW_ruleSOMETHING_in_rulesigDefinitions2539 = new BitSet(new long[]{0x0000000007FF27F0L});
    public static final BitSet FOLLOW_13_in_rulesigDefinitions2552 = new BitSet(new long[]{0x00000000040100F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulesigDefinitions2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulesigDefinitions2595 = new BitSet(new long[]{0x0000000007FF27F0L});
    public static final BitSet FOLLOW_33_in_rulesigDefinitions2624 = new BitSet(new long[]{0x0000000007FF27F0L});
    public static final BitSet FOLLOW_ruleSOMETHING_in_rulesigDefinitions2657 = new BitSet(new long[]{0x0000000007FF27F0L});
    public static final BitSet FOLLOW_13_in_rulesigDefinitions2670 = new BitSet(new long[]{0x00000000040100F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulesigDefinitions2686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleincludeOps_in_entryRuleincludeOps2723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleincludeOps2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleincludeOps2772 = new BitSet(new long[]{0x0000000007FF27F2L});
    public static final BitSet FOLLOW_ruleSOMETHING_in_ruleincludeOps2795 = new BitSet(new long[]{0x0000000007FF27F2L});

}