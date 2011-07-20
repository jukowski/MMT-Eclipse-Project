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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SP", "RULE_ML_COMMENT", "RULE_ML2_COMMENT", "RULE_SL_COMMENT", "RULE_DOUBLEDOT", "RULE_CID", "RULE_ANY_OTHER", "RULE_INT", "RULE_MULTIPLEDOT", "'/'", "'.'", "':'", "'\"'", "'%'", "'namespace'", "'='", "'read'", "'->'", "'{'", "'}'", "'sig'", "'meta'", "'abbrev'", "'name'", "'pattern'", "'infix'", "'prefix'", "'postfix'", "':='", "'include'", "'struct'", "'open'", "'view'"
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
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_CID=9;
    public static final int RULE_SL_COMMENT=7;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=5;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int RULE_MULTIPLEDOT=12;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ML2_COMMENT=6;
    public static final int RULE_INT=11;
    public static final int RULE_DOUBLEDOT=8;

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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_declarations_0_1= rulenamespaceDeclaration | lv_declarations_0_2= rulesignatureDeclaration | lv_declarations_0_3= ruleviewDeclaration | lv_declarations_0_4= rulereadDeclaration | lv_declarations_0_5= ruleJUSTSPACE ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_declarations_0_1 = null;

        EObject lv_declarations_0_2 = null;

        EObject lv_declarations_0_3 = null;

        EObject lv_declarations_0_4 = null;

        EObject lv_declarations_0_5 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:79:28: ( ( ( (lv_declarations_0_1= rulenamespaceDeclaration | lv_declarations_0_2= rulesignatureDeclaration | lv_declarations_0_3= ruleviewDeclaration | lv_declarations_0_4= rulereadDeclaration | lv_declarations_0_5= ruleJUSTSPACE ) ) )* )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:80:1: ( ( (lv_declarations_0_1= rulenamespaceDeclaration | lv_declarations_0_2= rulesignatureDeclaration | lv_declarations_0_3= ruleviewDeclaration | lv_declarations_0_4= rulereadDeclaration | lv_declarations_0_5= ruleJUSTSPACE ) ) )*
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:80:1: ( ( (lv_declarations_0_1= rulenamespaceDeclaration | lv_declarations_0_2= rulesignatureDeclaration | lv_declarations_0_3= ruleviewDeclaration | lv_declarations_0_4= rulereadDeclaration | lv_declarations_0_5= ruleJUSTSPACE ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_SP && LA2_0<=RULE_SL_COMMENT)||LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:81:1: ( (lv_declarations_0_1= rulenamespaceDeclaration | lv_declarations_0_2= rulesignatureDeclaration | lv_declarations_0_3= ruleviewDeclaration | lv_declarations_0_4= rulereadDeclaration | lv_declarations_0_5= ruleJUSTSPACE ) )
            	    {
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:81:1: ( (lv_declarations_0_1= rulenamespaceDeclaration | lv_declarations_0_2= rulesignatureDeclaration | lv_declarations_0_3= ruleviewDeclaration | lv_declarations_0_4= rulereadDeclaration | lv_declarations_0_5= ruleJUSTSPACE ) )
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:82:1: (lv_declarations_0_1= rulenamespaceDeclaration | lv_declarations_0_2= rulesignatureDeclaration | lv_declarations_0_3= ruleviewDeclaration | lv_declarations_0_4= rulereadDeclaration | lv_declarations_0_5= ruleJUSTSPACE )
            	    {
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:82:1: (lv_declarations_0_1= rulenamespaceDeclaration | lv_declarations_0_2= rulesignatureDeclaration | lv_declarations_0_3= ruleviewDeclaration | lv_declarations_0_4= rulereadDeclaration | lv_declarations_0_5= ruleJUSTSPACE )
            	    int alt1=5;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==17) ) {
            	        switch ( input.LA(2) ) {
            	        case 36:
            	            {
            	            alt1=3;
            	            }
            	            break;
            	        case 24:
            	            {
            	            alt1=2;
            	            }
            	            break;
            	        case 20:
            	            {
            	            alt1=4;
            	            }
            	            break;
            	        case 18:
            	            {
            	            alt1=1;
            	            }
            	            break;
            	        default:
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 1, 1, input);

            	            throw nvae;
            	        }

            	    }
            	    else if ( ((LA1_0>=RULE_SP && LA1_0<=RULE_SL_COMMENT)) ) {
            	        alt1=5;
            	    }
            	    else {
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
            	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:113:8: lv_declarations_0_3= ruleviewDeclaration
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getModelAccess().getDeclarationsViewDeclarationParserRuleCall_0_2()); 
            	            	    
            	            pushFollow(FOLLOW_ruleviewDeclaration_in_ruleModel170);
            	            lv_declarations_0_3=ruleviewDeclaration();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"declarations",
            	                    		lv_declarations_0_3, 
            	                    		"viewDeclaration");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:128:8: lv_declarations_0_4= rulereadDeclaration
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getModelAccess().getDeclarationsReadDeclarationParserRuleCall_0_3()); 
            	            	    
            	            pushFollow(FOLLOW_rulereadDeclaration_in_ruleModel189);
            	            lv_declarations_0_4=rulereadDeclaration();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"declarations",
            	                    		lv_declarations_0_4, 
            	                    		"readDeclaration");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 5 :
            	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:143:8: lv_declarations_0_5= ruleJUSTSPACE
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getModelAccess().getDeclarationsJUSTSPACEParserRuleCall_0_4()); 
            	            	    
            	            pushFollow(FOLLOW_ruleJUSTSPACE_in_ruleModel208);
            	            lv_declarations_0_5=ruleJUSTSPACE();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"declarations",
            	                    		lv_declarations_0_5, 
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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:169:1: entryRuleWS returns [String current=null] : iv_ruleWS= ruleWS EOF ;
    public final String entryRuleWS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleWS = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:170:2: (iv_ruleWS= ruleWS EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:171:2: iv_ruleWS= ruleWS EOF
            {
             newCompositeNode(grammarAccess.getWSRule()); 
            pushFollow(FOLLOW_ruleWS_in_entryRuleWS248);
            iv_ruleWS=ruleWS();

            state._fsp--;

             current =iv_ruleWS.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWS259); 

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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:178:1: ruleWS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SP_0= RULE_SP | this_ML_COMMENT_1= RULE_ML_COMMENT | this_ML2_COMMENT_2= RULE_ML2_COMMENT | this_SL_COMMENT_3= RULE_SL_COMMENT ) ;
    public final AntlrDatatypeRuleToken ruleWS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SP_0=null;
        Token this_ML_COMMENT_1=null;
        Token this_ML2_COMMENT_2=null;
        Token this_SL_COMMENT_3=null;

         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:181:28: ( (this_SP_0= RULE_SP | this_ML_COMMENT_1= RULE_ML_COMMENT | this_ML2_COMMENT_2= RULE_ML2_COMMENT | this_SL_COMMENT_3= RULE_SL_COMMENT ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:182:1: (this_SP_0= RULE_SP | this_ML_COMMENT_1= RULE_ML_COMMENT | this_ML2_COMMENT_2= RULE_ML2_COMMENT | this_SL_COMMENT_3= RULE_SL_COMMENT )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:182:1: (this_SP_0= RULE_SP | this_ML_COMMENT_1= RULE_ML_COMMENT | this_ML2_COMMENT_2= RULE_ML2_COMMENT | this_SL_COMMENT_3= RULE_SL_COMMENT )
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
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:182:6: this_SP_0= RULE_SP
                    {
                    this_SP_0=(Token)match(input,RULE_SP,FOLLOW_RULE_SP_in_ruleWS299); 

                    		current.merge(this_SP_0);
                        
                     
                        newLeafNode(this_SP_0, grammarAccess.getWSAccess().getSPTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:190:10: this_ML_COMMENT_1= RULE_ML_COMMENT
                    {
                    this_ML_COMMENT_1=(Token)match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_ruleWS325); 

                    		current.merge(this_ML_COMMENT_1);
                        
                     
                        newLeafNode(this_ML_COMMENT_1, grammarAccess.getWSAccess().getML_COMMENTTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:198:10: this_ML2_COMMENT_2= RULE_ML2_COMMENT
                    {
                    this_ML2_COMMENT_2=(Token)match(input,RULE_ML2_COMMENT,FOLLOW_RULE_ML2_COMMENT_in_ruleWS351); 

                    		current.merge(this_ML2_COMMENT_2);
                        
                     
                        newLeafNode(this_ML2_COMMENT_2, grammarAccess.getWSAccess().getML2_COMMENTTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:206:10: this_SL_COMMENT_3= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_3=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleWS377); 

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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:221:1: entryRuleNAMESPACE returns [String current=null] : iv_ruleNAMESPACE= ruleNAMESPACE EOF ;
    public final String entryRuleNAMESPACE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNAMESPACE = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:222:2: (iv_ruleNAMESPACE= ruleNAMESPACE EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:223:2: iv_ruleNAMESPACE= ruleNAMESPACE EOF
            {
             newCompositeNode(grammarAccess.getNAMESPACERule()); 
            pushFollow(FOLLOW_ruleNAMESPACE_in_entryRuleNAMESPACE423);
            iv_ruleNAMESPACE=ruleNAMESPACE();

            state._fsp--;

             current =iv_ruleNAMESPACE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNAMESPACE434); 

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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:230:1: ruleNAMESPACE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_doubleDot_0= RULE_DOUBLEDOT kw= '/' )* this_CID_2= RULE_CID ( (kw= '/' | kw= '.' ) this_CID_5= RULE_CID )* ) ;
    public final AntlrDatatypeRuleToken ruleNAMESPACE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_doubleDot_0=null;
        Token kw=null;
        Token this_CID_2=null;
        Token this_CID_5=null;

         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:233:28: ( ( (this_doubleDot_0= RULE_DOUBLEDOT kw= '/' )* this_CID_2= RULE_CID ( (kw= '/' | kw= '.' ) this_CID_5= RULE_CID )* ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:234:1: ( (this_doubleDot_0= RULE_DOUBLEDOT kw= '/' )* this_CID_2= RULE_CID ( (kw= '/' | kw= '.' ) this_CID_5= RULE_CID )* )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:234:1: ( (this_doubleDot_0= RULE_DOUBLEDOT kw= '/' )* this_CID_2= RULE_CID ( (kw= '/' | kw= '.' ) this_CID_5= RULE_CID )* )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:234:2: (this_doubleDot_0= RULE_DOUBLEDOT kw= '/' )* this_CID_2= RULE_CID ( (kw= '/' | kw= '.' ) this_CID_5= RULE_CID )*
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:234:2: (this_doubleDot_0= RULE_DOUBLEDOT kw= '/' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_DOUBLEDOT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:234:7: this_doubleDot_0= RULE_DOUBLEDOT kw= '/'
            	    {
            	    this_doubleDot_0=(Token)match(input,RULE_DOUBLEDOT,FOLLOW_RULE_DOUBLEDOT_in_ruleNAMESPACE475); 

            	    		current.merge(this_doubleDot_0);
            	        
            	     
            	        newLeafNode(this_doubleDot_0, grammarAccess.getNAMESPACEAccess().getDoubleDotTerminalRuleCall_0_0()); 
            	        
            	    kw=(Token)match(input,13,FOLLOW_13_in_ruleNAMESPACE493); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getNAMESPACEAccess().getSolidusKeyword_0_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            this_CID_2=(Token)match(input,RULE_CID,FOLLOW_RULE_CID_in_ruleNAMESPACE510); 

            		current.merge(this_CID_2);
                
             
                newLeafNode(this_CID_2, grammarAccess.getNAMESPACEAccess().getCIDTerminalRuleCall_1()); 
                
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:254:1: ( (kw= '/' | kw= '.' ) this_CID_5= RULE_CID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2==RULE_CID) ) {
                        alt6=1;
                    }


                }
                else if ( (LA6_0==13) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:254:2: (kw= '/' | kw= '.' ) this_CID_5= RULE_CID
            	    {
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:254:2: (kw= '/' | kw= '.' )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==13) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==14) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:255:2: kw= '/'
            	            {
            	            kw=(Token)match(input,13,FOLLOW_13_in_ruleNAMESPACE530); 

            	                    current.merge(kw);
            	                    newLeafNode(kw, grammarAccess.getNAMESPACEAccess().getSolidusKeyword_2_0_0()); 
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:262:2: kw= '.'
            	            {
            	            kw=(Token)match(input,14,FOLLOW_14_in_ruleNAMESPACE549); 

            	                    current.merge(kw);
            	                    newLeafNode(kw, grammarAccess.getNAMESPACEAccess().getFullStopKeyword_2_0_1()); 
            	                

            	            }
            	            break;

            	    }

            	    this_CID_5=(Token)match(input,RULE_CID,FOLLOW_RULE_CID_in_ruleNAMESPACE565); 

            	    		current.merge(this_CID_5);
            	        
            	     
            	        newLeafNode(this_CID_5, grammarAccess.getNAMESPACEAccess().getCIDTerminalRuleCall_2_1()); 
            	        

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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:282:1: entryRuleURI returns [String current=null] : iv_ruleURI= ruleURI EOF ;
    public final String entryRuleURI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURI = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:283:2: (iv_ruleURI= ruleURI EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:284:2: iv_ruleURI= ruleURI EOF
            {
             newCompositeNode(grammarAccess.getURIRule()); 
            pushFollow(FOLLOW_ruleURI_in_entryRuleURI613);
            iv_ruleURI=ruleURI();

            state._fsp--;

             current =iv_ruleURI.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURI624); 

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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:291:1: ruleURI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_CID_0= RULE_CID kw= ':' kw= '/' kw= '/' )? this_NAMESPACE_4= ruleNAMESPACE ) ;
    public final AntlrDatatypeRuleToken ruleURI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_NAMESPACE_4 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:294:28: ( ( (this_CID_0= RULE_CID kw= ':' kw= '/' kw= '/' )? this_NAMESPACE_4= ruleNAMESPACE ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:295:1: ( (this_CID_0= RULE_CID kw= ':' kw= '/' kw= '/' )? this_NAMESPACE_4= ruleNAMESPACE )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:295:1: ( (this_CID_0= RULE_CID kw= ':' kw= '/' kw= '/' )? this_NAMESPACE_4= ruleNAMESPACE )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:295:2: (this_CID_0= RULE_CID kw= ':' kw= '/' kw= '/' )? this_NAMESPACE_4= ruleNAMESPACE
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:295:2: (this_CID_0= RULE_CID kw= ':' kw= '/' kw= '/' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_CID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==15) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:295:7: this_CID_0= RULE_CID kw= ':' kw= '/' kw= '/'
                    {
                    this_CID_0=(Token)match(input,RULE_CID,FOLLOW_RULE_CID_in_ruleURI665); 

                    		current.merge(this_CID_0);
                        
                     
                        newLeafNode(this_CID_0, grammarAccess.getURIAccess().getCIDTerminalRuleCall_0_0()); 
                        
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleURI683); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getURIAccess().getColonKeyword_0_1()); 
                        
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleURI696); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getURIAccess().getSolidusKeyword_0_2()); 
                        
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleURI709); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getURIAccess().getSolidusKeyword_0_3()); 
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getURIAccess().getNAMESPACEParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleNAMESPACE_in_ruleURI733);
            this_NAMESPACE_4=ruleNAMESPACE();

            state._fsp--;


            		current.merge(this_NAMESPACE_4);
                
             
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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:339:1: entryRuleURISTRING returns [String current=null] : iv_ruleURISTRING= ruleURISTRING EOF ;
    public final String entryRuleURISTRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURISTRING = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:340:2: (iv_ruleURISTRING= ruleURISTRING EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:341:2: iv_ruleURISTRING= ruleURISTRING EOF
            {
             newCompositeNode(grammarAccess.getURISTRINGRule()); 
            pushFollow(FOLLOW_ruleURISTRING_in_entryRuleURISTRING779);
            iv_ruleURISTRING=ruleURISTRING();

            state._fsp--;

             current =iv_ruleURISTRING.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURISTRING790); 

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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:348:1: ruleURISTRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\"' this_URI_1= ruleURI kw= '\"' ) ;
    public final AntlrDatatypeRuleToken ruleURISTRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_URI_1 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:351:28: ( (kw= '\"' this_URI_1= ruleURI kw= '\"' ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:352:1: (kw= '\"' this_URI_1= ruleURI kw= '\"' )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:352:1: (kw= '\"' this_URI_1= ruleURI kw= '\"' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:353:2: kw= '\"' this_URI_1= ruleURI kw= '\"'
            {
            kw=(Token)match(input,16,FOLLOW_16_in_ruleURISTRING828); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getURISTRINGAccess().getQuotationMarkKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getURISTRINGAccess().getURIParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleURI_in_ruleURISTRING850);
            this_URI_1=ruleURI();

            state._fsp--;


            		current.merge(this_URI_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,16,FOLLOW_16_in_ruleURISTRING868); 

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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:383:1: entryRuleJUSTSPACE returns [EObject current=null] : iv_ruleJUSTSPACE= ruleJUSTSPACE EOF ;
    public final EObject entryRuleJUSTSPACE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJUSTSPACE = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:384:2: (iv_ruleJUSTSPACE= ruleJUSTSPACE EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:385:2: iv_ruleJUSTSPACE= ruleJUSTSPACE EOF
            {
             newCompositeNode(grammarAccess.getJUSTSPACERule()); 
            pushFollow(FOLLOW_ruleJUSTSPACE_in_entryRuleJUSTSPACE908);
            iv_ruleJUSTSPACE=ruleJUSTSPACE();

            state._fsp--;

             current =iv_ruleJUSTSPACE; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJUSTSPACE918); 

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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:392:1: ruleJUSTSPACE returns [EObject current=null] : ( (lv_J_0_0= ruleWS ) ) ;
    public final EObject ruleJUSTSPACE() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_J_0_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:395:28: ( ( (lv_J_0_0= ruleWS ) ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:396:1: ( (lv_J_0_0= ruleWS ) )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:396:1: ( (lv_J_0_0= ruleWS ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:397:1: (lv_J_0_0= ruleWS )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:397:1: (lv_J_0_0= ruleWS )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:398:3: lv_J_0_0= ruleWS
            {
             
            	        newCompositeNode(grammarAccess.getJUSTSPACEAccess().getJWSParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleWS_in_ruleJUSTSPACE963);
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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:422:1: entryRulenamespaceDeclaration returns [EObject current=null] : iv_rulenamespaceDeclaration= rulenamespaceDeclaration EOF ;
    public final EObject entryRulenamespaceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenamespaceDeclaration = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:423:2: (iv_rulenamespaceDeclaration= rulenamespaceDeclaration EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:424:2: iv_rulenamespaceDeclaration= rulenamespaceDeclaration EOF
            {
             newCompositeNode(grammarAccess.getNamespaceDeclarationRule()); 
            pushFollow(FOLLOW_rulenamespaceDeclaration_in_entryRulenamespaceDeclaration998);
            iv_rulenamespaceDeclaration=rulenamespaceDeclaration();

            state._fsp--;

             current =iv_rulenamespaceDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenamespaceDeclaration1008); 

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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:431:1: rulenamespaceDeclaration returns [EObject current=null] : (otherlv_0= '%' otherlv_1= 'namespace' ( ruleWS )+ ( ( (lv_name_3_0= RULE_CID ) ) ( ruleWS )* otherlv_5= '=' ( ruleWS )* )? ( (lv_uri_7_0= ruleURISTRING ) ) ( ruleWS )* otherlv_9= '.' ruleWS ) ;
    public final EObject rulenamespaceDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_uri_7_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:434:28: ( (otherlv_0= '%' otherlv_1= 'namespace' ( ruleWS )+ ( ( (lv_name_3_0= RULE_CID ) ) ( ruleWS )* otherlv_5= '=' ( ruleWS )* )? ( (lv_uri_7_0= ruleURISTRING ) ) ( ruleWS )* otherlv_9= '.' ruleWS ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:435:1: (otherlv_0= '%' otherlv_1= 'namespace' ( ruleWS )+ ( ( (lv_name_3_0= RULE_CID ) ) ( ruleWS )* otherlv_5= '=' ( ruleWS )* )? ( (lv_uri_7_0= ruleURISTRING ) ) ( ruleWS )* otherlv_9= '.' ruleWS )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:435:1: (otherlv_0= '%' otherlv_1= 'namespace' ( ruleWS )+ ( ( (lv_name_3_0= RULE_CID ) ) ( ruleWS )* otherlv_5= '=' ( ruleWS )* )? ( (lv_uri_7_0= ruleURISTRING ) ) ( ruleWS )* otherlv_9= '.' ruleWS )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:435:3: otherlv_0= '%' otherlv_1= 'namespace' ( ruleWS )+ ( ( (lv_name_3_0= RULE_CID ) ) ( ruleWS )* otherlv_5= '=' ( ruleWS )* )? ( (lv_uri_7_0= ruleURISTRING ) ) ( ruleWS )* otherlv_9= '.' ruleWS
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_rulenamespaceDeclaration1045); 

                	newLeafNode(otherlv_0, grammarAccess.getNamespaceDeclarationAccess().getPercentSignKeyword_0());
                
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_rulenamespaceDeclaration1057); 

                	newLeafNode(otherlv_1, grammarAccess.getNamespaceDeclarationAccess().getNamespaceKeyword_1());
                
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:443:1: ( ruleWS )+
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
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:444:5: ruleWS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_2()); 
            	        
            	    pushFollow(FOLLOW_ruleWS_in_rulenamespaceDeclaration1074);
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

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:451:3: ( ( (lv_name_3_0= RULE_CID ) ) ( ruleWS )* otherlv_5= '=' ( ruleWS )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_CID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:451:4: ( (lv_name_3_0= RULE_CID ) ) ( ruleWS )* otherlv_5= '=' ( ruleWS )*
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:451:4: ( (lv_name_3_0= RULE_CID ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:452:1: (lv_name_3_0= RULE_CID )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:452:1: (lv_name_3_0= RULE_CID )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:453:3: lv_name_3_0= RULE_CID
                    {
                    lv_name_3_0=(Token)match(input,RULE_CID,FOLLOW_RULE_CID_in_rulenamespaceDeclaration1093); 

                    			newLeafNode(lv_name_3_0, grammarAccess.getNamespaceDeclarationAccess().getNameCIDTerminalRuleCall_3_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNamespaceDeclarationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_3_0, 
                            		"CID");
                    	    

                    }


                    }

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:469:2: ( ruleWS )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>=RULE_SP && LA9_0<=RULE_SL_COMMENT)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:470:5: ruleWS
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_3_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleWS_in_rulenamespaceDeclaration1115);
                    	    ruleWS();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,19,FOLLOW_19_in_rulenamespaceDeclaration1128); 

                        	newLeafNode(otherlv_5, grammarAccess.getNamespaceDeclarationAccess().getEqualsSignKeyword_3_2());
                        
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:481:1: ( ruleWS )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>=RULE_SP && LA10_0<=RULE_SL_COMMENT)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:482:5: ruleWS
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_3_3()); 
                    	        
                    	    pushFollow(FOLLOW_ruleWS_in_rulenamespaceDeclaration1145);
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

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:489:5: ( (lv_uri_7_0= ruleURISTRING ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:490:1: (lv_uri_7_0= ruleURISTRING )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:490:1: (lv_uri_7_0= ruleURISTRING )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:491:3: lv_uri_7_0= ruleURISTRING
            {
             
            	        newCompositeNode(grammarAccess.getNamespaceDeclarationAccess().getUriURISTRINGParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleURISTRING_in_rulenamespaceDeclaration1169);
            lv_uri_7_0=ruleURISTRING();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNamespaceDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"uri",
                    		lv_uri_7_0, 
                    		"URISTRING");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:507:2: ( ruleWS )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_SP && LA12_0<=RULE_SL_COMMENT)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:508:5: ruleWS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_5()); 
            	        
            	    pushFollow(FOLLOW_ruleWS_in_rulenamespaceDeclaration1186);
            	    ruleWS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_14_in_rulenamespaceDeclaration1199); 

                	newLeafNode(otherlv_9, grammarAccess.getNamespaceDeclarationAccess().getFullStopKeyword_6());
                
             
                    newCompositeNode(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_7()); 
                
            pushFollow(FOLLOW_ruleWS_in_rulenamespaceDeclaration1215);
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


    // $ANTLR start "entryRulereadDeclaration"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:535:1: entryRulereadDeclaration returns [EObject current=null] : iv_rulereadDeclaration= rulereadDeclaration EOF ;
    public final EObject entryRulereadDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulereadDeclaration = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:536:2: (iv_rulereadDeclaration= rulereadDeclaration EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:537:2: iv_rulereadDeclaration= rulereadDeclaration EOF
            {
             newCompositeNode(grammarAccess.getReadDeclarationRule()); 
            pushFollow(FOLLOW_rulereadDeclaration_in_entryRulereadDeclaration1250);
            iv_rulereadDeclaration=rulereadDeclaration();

            state._fsp--;

             current =iv_rulereadDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulereadDeclaration1260); 

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
    // $ANTLR end "entryRulereadDeclaration"


    // $ANTLR start "rulereadDeclaration"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:544:1: rulereadDeclaration returns [EObject current=null] : (otherlv_0= '%' otherlv_1= 'read' ( ruleWS )+ ( (lv_file_3_0= ruleURISTRING ) ) ( ruleWS )* otherlv_5= '.' ruleWS ) ;
    public final EObject rulereadDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_file_3_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:547:28: ( (otherlv_0= '%' otherlv_1= 'read' ( ruleWS )+ ( (lv_file_3_0= ruleURISTRING ) ) ( ruleWS )* otherlv_5= '.' ruleWS ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:548:1: (otherlv_0= '%' otherlv_1= 'read' ( ruleWS )+ ( (lv_file_3_0= ruleURISTRING ) ) ( ruleWS )* otherlv_5= '.' ruleWS )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:548:1: (otherlv_0= '%' otherlv_1= 'read' ( ruleWS )+ ( (lv_file_3_0= ruleURISTRING ) ) ( ruleWS )* otherlv_5= '.' ruleWS )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:548:3: otherlv_0= '%' otherlv_1= 'read' ( ruleWS )+ ( (lv_file_3_0= ruleURISTRING ) ) ( ruleWS )* otherlv_5= '.' ruleWS
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_rulereadDeclaration1297); 

                	newLeafNode(otherlv_0, grammarAccess.getReadDeclarationAccess().getPercentSignKeyword_0());
                
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_rulereadDeclaration1309); 

                	newLeafNode(otherlv_1, grammarAccess.getReadDeclarationAccess().getReadKeyword_1());
                
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:556:1: ( ruleWS )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_SP && LA13_0<=RULE_SL_COMMENT)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:557:5: ruleWS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getReadDeclarationAccess().getWSParserRuleCall_2()); 
            	        
            	    pushFollow(FOLLOW_ruleWS_in_rulereadDeclaration1326);
            	    ruleWS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

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

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:564:3: ( (lv_file_3_0= ruleURISTRING ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:565:1: (lv_file_3_0= ruleURISTRING )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:565:1: (lv_file_3_0= ruleURISTRING )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:566:3: lv_file_3_0= ruleURISTRING
            {
             
            	        newCompositeNode(grammarAccess.getReadDeclarationAccess().getFileURISTRINGParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleURISTRING_in_rulereadDeclaration1348);
            lv_file_3_0=ruleURISTRING();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReadDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"file",
                    		lv_file_3_0, 
                    		"URISTRING");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:582:2: ( ruleWS )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_SP && LA14_0<=RULE_SL_COMMENT)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:583:5: ruleWS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getReadDeclarationAccess().getWSParserRuleCall_4()); 
            	        
            	    pushFollow(FOLLOW_ruleWS_in_rulereadDeclaration1365);
            	    ruleWS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_rulereadDeclaration1378); 

                	newLeafNode(otherlv_5, grammarAccess.getReadDeclarationAccess().getFullStopKeyword_5());
                
             
                    newCompositeNode(grammarAccess.getReadDeclarationAccess().getWSParserRuleCall_6()); 
                
            pushFollow(FOLLOW_ruleWS_in_rulereadDeclaration1394);
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
    // $ANTLR end "rulereadDeclaration"


    // $ANTLR start "entryRuleGID"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:610:1: entryRuleGID returns [String current=null] : iv_ruleGID= ruleGID EOF ;
    public final String entryRuleGID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGID = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:611:2: (iv_ruleGID= ruleGID EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:612:2: iv_ruleGID= ruleGID EOF
            {
             newCompositeNode(grammarAccess.getGIDRule()); 
            pushFollow(FOLLOW_ruleGID_in_entryRuleGID1430);
            iv_ruleGID=ruleGID();

            state._fsp--;

             current =iv_ruleGID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGID1441); 

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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:619:1: ruleGID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_CID_0= RULE_CID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_INT_2= RULE_INT )+ ( (kw= '=' )+ this_WS_4= ruleWS )? ) | (kw= '=' (kw= '=' )+ this_WS_7= ruleWS ) | this_multipleDot_8= RULE_MULTIPLEDOT | this_doubleDot_9= RULE_DOUBLEDOT ) ;
    public final AntlrDatatypeRuleToken ruleGID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CID_0=null;
        Token this_ANY_OTHER_1=null;
        Token this_INT_2=null;
        Token kw=null;
        Token this_multipleDot_8=null;
        Token this_doubleDot_9=null;
        AntlrDatatypeRuleToken this_WS_4 = null;

        AntlrDatatypeRuleToken this_WS_7 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:622:28: ( ( ( (this_CID_0= RULE_CID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_INT_2= RULE_INT )+ ( (kw= '=' )+ this_WS_4= ruleWS )? ) | (kw= '=' (kw= '=' )+ this_WS_7= ruleWS ) | this_multipleDot_8= RULE_MULTIPLEDOT | this_doubleDot_9= RULE_DOUBLEDOT ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:623:1: ( ( (this_CID_0= RULE_CID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_INT_2= RULE_INT )+ ( (kw= '=' )+ this_WS_4= ruleWS )? ) | (kw= '=' (kw= '=' )+ this_WS_7= ruleWS ) | this_multipleDot_8= RULE_MULTIPLEDOT | this_doubleDot_9= RULE_DOUBLEDOT )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:623:1: ( ( (this_CID_0= RULE_CID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_INT_2= RULE_INT )+ ( (kw= '=' )+ this_WS_4= ruleWS )? ) | (kw= '=' (kw= '=' )+ this_WS_7= ruleWS ) | this_multipleDot_8= RULE_MULTIPLEDOT | this_doubleDot_9= RULE_DOUBLEDOT )
            int alt19=4;
            switch ( input.LA(1) ) {
            case RULE_CID:
            case RULE_ANY_OTHER:
            case RULE_INT:
                {
                alt19=1;
                }
                break;
            case 19:
                {
                alt19=2;
                }
                break;
            case RULE_MULTIPLEDOT:
                {
                alt19=3;
                }
                break;
            case RULE_DOUBLEDOT:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:623:2: ( (this_CID_0= RULE_CID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_INT_2= RULE_INT )+ ( (kw= '=' )+ this_WS_4= ruleWS )? )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:623:2: ( (this_CID_0= RULE_CID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_INT_2= RULE_INT )+ ( (kw= '=' )+ this_WS_4= ruleWS )? )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:623:3: (this_CID_0= RULE_CID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_INT_2= RULE_INT )+ ( (kw= '=' )+ this_WS_4= ruleWS )?
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:623:3: (this_CID_0= RULE_CID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_INT_2= RULE_INT )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=4;
                        switch ( input.LA(1) ) {
                        case RULE_CID:
                            {
                            alt15=1;
                            }
                            break;
                        case RULE_ANY_OTHER:
                            {
                            alt15=2;
                            }
                            break;
                        case RULE_INT:
                            {
                            alt15=3;
                            }
                            break;

                        }

                        switch (alt15) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:623:8: this_CID_0= RULE_CID
                    	    {
                    	    this_CID_0=(Token)match(input,RULE_CID,FOLLOW_RULE_CID_in_ruleGID1483); 

                    	    		current.merge(this_CID_0);
                    	        
                    	     
                    	        newLeafNode(this_CID_0, grammarAccess.getGIDAccess().getCIDTerminalRuleCall_0_0_0()); 
                    	        

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:631:10: this_ANY_OTHER_1= RULE_ANY_OTHER
                    	    {
                    	    this_ANY_OTHER_1=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleGID1509); 

                    	    		current.merge(this_ANY_OTHER_1);
                    	        
                    	     
                    	        newLeafNode(this_ANY_OTHER_1, grammarAccess.getGIDAccess().getANY_OTHERTerminalRuleCall_0_0_1()); 
                    	        

                    	    }
                    	    break;
                    	case 3 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:639:10: this_INT_2= RULE_INT
                    	    {
                    	    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleGID1535); 

                    	    		current.merge(this_INT_2);
                    	        
                    	     
                    	        newLeafNode(this_INT_2, grammarAccess.getGIDAccess().getINTTerminalRuleCall_0_0_2()); 
                    	        

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

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:646:3: ( (kw= '=' )+ this_WS_4= ruleWS )?
                    int alt17=2;
                    alt17 = dfa17.predict(input);
                    switch (alt17) {
                        case 1 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:646:4: (kw= '=' )+ this_WS_4= ruleWS
                            {
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:646:4: (kw= '=' )+
                            int cnt16=0;
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( (LA16_0==19) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:647:2: kw= '='
                            	    {
                            	    kw=(Token)match(input,19,FOLLOW_19_in_ruleGID1557); 

                            	            current.merge(kw);
                            	            newLeafNode(kw, grammarAccess.getGIDAccess().getEqualsSignKeyword_0_1_0()); 
                            	        

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt16 >= 1 ) break loop16;
                                        EarlyExitException eee =
                                            new EarlyExitException(16, input);
                                        throw eee;
                                }
                                cnt16++;
                            } while (true);

                             
                                    newCompositeNode(grammarAccess.getGIDAccess().getWSParserRuleCall_0_1_1()); 
                                
                            pushFollow(FOLLOW_ruleWS_in_ruleGID1581);
                            this_WS_4=ruleWS();

                            state._fsp--;


                            		current.merge(this_WS_4);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:664:6: (kw= '=' (kw= '=' )+ this_WS_7= ruleWS )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:664:6: (kw= '=' (kw= '=' )+ this_WS_7= ruleWS )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:665:2: kw= '=' (kw= '=' )+ this_WS_7= ruleWS
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleGID1609); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getGIDAccess().getEqualsSignKeyword_1_0()); 
                        
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:670:1: (kw= '=' )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==19) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:671:2: kw= '='
                    	    {
                    	    kw=(Token)match(input,19,FOLLOW_19_in_ruleGID1623); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getGIDAccess().getEqualsSignKeyword_1_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);

                     
                            newCompositeNode(grammarAccess.getGIDAccess().getWSParserRuleCall_1_2()); 
                        
                    pushFollow(FOLLOW_ruleWS_in_ruleGID1647);
                    this_WS_7=ruleWS();

                    state._fsp--;


                    		current.merge(this_WS_7);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:688:10: this_multipleDot_8= RULE_MULTIPLEDOT
                    {
                    this_multipleDot_8=(Token)match(input,RULE_MULTIPLEDOT,FOLLOW_RULE_MULTIPLEDOT_in_ruleGID1674); 

                    		current.merge(this_multipleDot_8);
                        
                     
                        newLeafNode(this_multipleDot_8, grammarAccess.getGIDAccess().getMultipleDotTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:696:10: this_doubleDot_9= RULE_DOUBLEDOT
                    {
                    this_doubleDot_9=(Token)match(input,RULE_DOUBLEDOT,FOLLOW_RULE_DOUBLEDOT_in_ruleGID1700); 

                    		current.merge(this_doubleDot_9);
                        
                     
                        newLeafNode(this_doubleDot_9, grammarAccess.getGIDAccess().getDoubleDotTerminalRuleCall_3()); 
                        

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
    // $ANTLR end "ruleGID"


    // $ANTLR start "entryRuleSOMETHING"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:711:1: entryRuleSOMETHING returns [String current=null] : iv_ruleSOMETHING= ruleSOMETHING EOF ;
    public final String entryRuleSOMETHING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSOMETHING = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:712:2: (iv_ruleSOMETHING= ruleSOMETHING EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:713:2: iv_ruleSOMETHING= ruleSOMETHING EOF
            {
             newCompositeNode(grammarAccess.getSOMETHINGRule()); 
            pushFollow(FOLLOW_ruleSOMETHING_in_entryRuleSOMETHING1746);
            iv_ruleSOMETHING=ruleSOMETHING();

            state._fsp--;

             current =iv_ruleSOMETHING.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSOMETHING1757); 

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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:720:1: ruleSOMETHING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ANY_OTHER_0= RULE_ANY_OTHER | this_CID_1= RULE_CID | this_INT_2= RULE_INT | (kw= '.' (this_CID_4= RULE_CID | this_ANY_OTHER_5= RULE_ANY_OTHER ) ) | kw= ':' | kw= '=' | kw= '->' | kw= '%' | (kw= '{' (this_SOMETHING2_11= ruleSOMETHING2 )* kw= '}' ) | this_multipleDot_13= RULE_MULTIPLEDOT | this_doubleDot_14= RULE_DOUBLEDOT | this_WS_15= ruleWS ) ;
    public final AntlrDatatypeRuleToken ruleSOMETHING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ANY_OTHER_0=null;
        Token this_CID_1=null;
        Token this_INT_2=null;
        Token kw=null;
        Token this_CID_4=null;
        Token this_ANY_OTHER_5=null;
        Token this_multipleDot_13=null;
        Token this_doubleDot_14=null;
        AntlrDatatypeRuleToken this_SOMETHING2_11 = null;

        AntlrDatatypeRuleToken this_WS_15 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:723:28: ( (this_ANY_OTHER_0= RULE_ANY_OTHER | this_CID_1= RULE_CID | this_INT_2= RULE_INT | (kw= '.' (this_CID_4= RULE_CID | this_ANY_OTHER_5= RULE_ANY_OTHER ) ) | kw= ':' | kw= '=' | kw= '->' | kw= '%' | (kw= '{' (this_SOMETHING2_11= ruleSOMETHING2 )* kw= '}' ) | this_multipleDot_13= RULE_MULTIPLEDOT | this_doubleDot_14= RULE_DOUBLEDOT | this_WS_15= ruleWS ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:724:1: (this_ANY_OTHER_0= RULE_ANY_OTHER | this_CID_1= RULE_CID | this_INT_2= RULE_INT | (kw= '.' (this_CID_4= RULE_CID | this_ANY_OTHER_5= RULE_ANY_OTHER ) ) | kw= ':' | kw= '=' | kw= '->' | kw= '%' | (kw= '{' (this_SOMETHING2_11= ruleSOMETHING2 )* kw= '}' ) | this_multipleDot_13= RULE_MULTIPLEDOT | this_doubleDot_14= RULE_DOUBLEDOT | this_WS_15= ruleWS )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:724:1: (this_ANY_OTHER_0= RULE_ANY_OTHER | this_CID_1= RULE_CID | this_INT_2= RULE_INT | (kw= '.' (this_CID_4= RULE_CID | this_ANY_OTHER_5= RULE_ANY_OTHER ) ) | kw= ':' | kw= '=' | kw= '->' | kw= '%' | (kw= '{' (this_SOMETHING2_11= ruleSOMETHING2 )* kw= '}' ) | this_multipleDot_13= RULE_MULTIPLEDOT | this_doubleDot_14= RULE_DOUBLEDOT | this_WS_15= ruleWS )
            int alt22=12;
            switch ( input.LA(1) ) {
            case RULE_ANY_OTHER:
                {
                alt22=1;
                }
                break;
            case RULE_CID:
                {
                alt22=2;
                }
                break;
            case RULE_INT:
                {
                alt22=3;
                }
                break;
            case 14:
                {
                alt22=4;
                }
                break;
            case 15:
                {
                alt22=5;
                }
                break;
            case 19:
                {
                alt22=6;
                }
                break;
            case 21:
                {
                alt22=7;
                }
                break;
            case 17:
                {
                alt22=8;
                }
                break;
            case 22:
                {
                alt22=9;
                }
                break;
            case RULE_MULTIPLEDOT:
                {
                alt22=10;
                }
                break;
            case RULE_DOUBLEDOT:
                {
                alt22=11;
                }
                break;
            case RULE_SP:
            case RULE_ML_COMMENT:
            case RULE_ML2_COMMENT:
            case RULE_SL_COMMENT:
                {
                alt22=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:724:6: this_ANY_OTHER_0= RULE_ANY_OTHER
                    {
                    this_ANY_OTHER_0=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleSOMETHING1797); 

                    		current.merge(this_ANY_OTHER_0);
                        
                     
                        newLeafNode(this_ANY_OTHER_0, grammarAccess.getSOMETHINGAccess().getANY_OTHERTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:732:10: this_CID_1= RULE_CID
                    {
                    this_CID_1=(Token)match(input,RULE_CID,FOLLOW_RULE_CID_in_ruleSOMETHING1823); 

                    		current.merge(this_CID_1);
                        
                     
                        newLeafNode(this_CID_1, grammarAccess.getSOMETHINGAccess().getCIDTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:740:10: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSOMETHING1849); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getSOMETHINGAccess().getINTTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:748:6: (kw= '.' (this_CID_4= RULE_CID | this_ANY_OTHER_5= RULE_ANY_OTHER ) )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:748:6: (kw= '.' (this_CID_4= RULE_CID | this_ANY_OTHER_5= RULE_ANY_OTHER ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:749:2: kw= '.' (this_CID_4= RULE_CID | this_ANY_OTHER_5= RULE_ANY_OTHER )
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleSOMETHING1874); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSOMETHINGAccess().getFullStopKeyword_3_0()); 
                        
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:754:1: (this_CID_4= RULE_CID | this_ANY_OTHER_5= RULE_ANY_OTHER )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==RULE_CID) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==RULE_ANY_OTHER) ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:754:6: this_CID_4= RULE_CID
                            {
                            this_CID_4=(Token)match(input,RULE_CID,FOLLOW_RULE_CID_in_ruleSOMETHING1890); 

                            		current.merge(this_CID_4);
                                
                             
                                newLeafNode(this_CID_4, grammarAccess.getSOMETHINGAccess().getCIDTerminalRuleCall_3_1_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:762:10: this_ANY_OTHER_5= RULE_ANY_OTHER
                            {
                            this_ANY_OTHER_5=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleSOMETHING1916); 

                            		current.merge(this_ANY_OTHER_5);
                                
                             
                                newLeafNode(this_ANY_OTHER_5, grammarAccess.getSOMETHINGAccess().getANY_OTHERTerminalRuleCall_3_1_1()); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:771:2: kw= ':'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleSOMETHING1942); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSOMETHINGAccess().getColonKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:778:2: kw= '='
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleSOMETHING1961); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSOMETHINGAccess().getEqualsSignKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:785:2: kw= '->'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleSOMETHING1980); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSOMETHINGAccess().getHyphenMinusGreaterThanSignKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:792:2: kw= '%'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleSOMETHING1999); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSOMETHINGAccess().getPercentSignKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:798:6: (kw= '{' (this_SOMETHING2_11= ruleSOMETHING2 )* kw= '}' )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:798:6: (kw= '{' (this_SOMETHING2_11= ruleSOMETHING2 )* kw= '}' )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:799:2: kw= '{' (this_SOMETHING2_11= ruleSOMETHING2 )* kw= '}'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleSOMETHING2019); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSOMETHINGAccess().getLeftCurlyBracketKeyword_8_0()); 
                        
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:804:1: (this_SOMETHING2_11= ruleSOMETHING2 )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( ((LA21_0>=RULE_SP && LA21_0<=RULE_MULTIPLEDOT)||(LA21_0>=14 && LA21_0<=15)||LA21_0==17||LA21_0==19||(LA21_0>=21 && LA21_0<=22)) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:805:5: this_SOMETHING2_11= ruleSOMETHING2
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getSOMETHINGAccess().getSOMETHING2ParserRuleCall_8_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleSOMETHING2_in_ruleSOMETHING2042);
                    	    this_SOMETHING2_11=ruleSOMETHING2();

                    	    state._fsp--;


                    	    		current.merge(this_SOMETHING2_11);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    kw=(Token)match(input,23,FOLLOW_23_in_ruleSOMETHING2062); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSOMETHINGAccess().getRightCurlyBracketKeyword_8_2()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:822:10: this_multipleDot_13= RULE_MULTIPLEDOT
                    {
                    this_multipleDot_13=(Token)match(input,RULE_MULTIPLEDOT,FOLLOW_RULE_MULTIPLEDOT_in_ruleSOMETHING2084); 

                    		current.merge(this_multipleDot_13);
                        
                     
                        newLeafNode(this_multipleDot_13, grammarAccess.getSOMETHINGAccess().getMultipleDotTerminalRuleCall_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:830:10: this_doubleDot_14= RULE_DOUBLEDOT
                    {
                    this_doubleDot_14=(Token)match(input,RULE_DOUBLEDOT,FOLLOW_RULE_DOUBLEDOT_in_ruleSOMETHING2110); 

                    		current.merge(this_doubleDot_14);
                        
                     
                        newLeafNode(this_doubleDot_14, grammarAccess.getSOMETHINGAccess().getDoubleDotTerminalRuleCall_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:839:5: this_WS_15= ruleWS
                    {
                     
                            newCompositeNode(grammarAccess.getSOMETHINGAccess().getWSParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleWS_in_ruleSOMETHING2143);
                    this_WS_15=ruleWS();

                    state._fsp--;


                    		current.merge(this_WS_15);
                        
                     
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


    // $ANTLR start "entryRuleSOMETHING2"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:857:1: entryRuleSOMETHING2 returns [String current=null] : iv_ruleSOMETHING2= ruleSOMETHING2 EOF ;
    public final String entryRuleSOMETHING2() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSOMETHING2 = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:858:2: (iv_ruleSOMETHING2= ruleSOMETHING2 EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:859:2: iv_ruleSOMETHING2= ruleSOMETHING2 EOF
            {
             newCompositeNode(grammarAccess.getSOMETHING2Rule()); 
            pushFollow(FOLLOW_ruleSOMETHING2_in_entryRuleSOMETHING22189);
            iv_ruleSOMETHING2=ruleSOMETHING2();

            state._fsp--;

             current =iv_ruleSOMETHING2.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSOMETHING22200); 

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
    // $ANTLR end "entryRuleSOMETHING2"


    // $ANTLR start "ruleSOMETHING2"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:866:1: ruleSOMETHING2 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ANY_OTHER_0= RULE_ANY_OTHER | this_CID_1= RULE_CID | this_INT_2= RULE_INT | kw= '.' | kw= ':' | kw= '=' | kw= '->' | kw= '%' | (kw= '{' (this_SOMETHING2_9= ruleSOMETHING2 )* kw= '}' ) | this_multipleDot_11= RULE_MULTIPLEDOT | this_doubleDot_12= RULE_DOUBLEDOT | this_WS_13= ruleWS ) ;
    public final AntlrDatatypeRuleToken ruleSOMETHING2() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ANY_OTHER_0=null;
        Token this_CID_1=null;
        Token this_INT_2=null;
        Token kw=null;
        Token this_multipleDot_11=null;
        Token this_doubleDot_12=null;
        AntlrDatatypeRuleToken this_SOMETHING2_9 = null;

        AntlrDatatypeRuleToken this_WS_13 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:869:28: ( (this_ANY_OTHER_0= RULE_ANY_OTHER | this_CID_1= RULE_CID | this_INT_2= RULE_INT | kw= '.' | kw= ':' | kw= '=' | kw= '->' | kw= '%' | (kw= '{' (this_SOMETHING2_9= ruleSOMETHING2 )* kw= '}' ) | this_multipleDot_11= RULE_MULTIPLEDOT | this_doubleDot_12= RULE_DOUBLEDOT | this_WS_13= ruleWS ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:870:1: (this_ANY_OTHER_0= RULE_ANY_OTHER | this_CID_1= RULE_CID | this_INT_2= RULE_INT | kw= '.' | kw= ':' | kw= '=' | kw= '->' | kw= '%' | (kw= '{' (this_SOMETHING2_9= ruleSOMETHING2 )* kw= '}' ) | this_multipleDot_11= RULE_MULTIPLEDOT | this_doubleDot_12= RULE_DOUBLEDOT | this_WS_13= ruleWS )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:870:1: (this_ANY_OTHER_0= RULE_ANY_OTHER | this_CID_1= RULE_CID | this_INT_2= RULE_INT | kw= '.' | kw= ':' | kw= '=' | kw= '->' | kw= '%' | (kw= '{' (this_SOMETHING2_9= ruleSOMETHING2 )* kw= '}' ) | this_multipleDot_11= RULE_MULTIPLEDOT | this_doubleDot_12= RULE_DOUBLEDOT | this_WS_13= ruleWS )
            int alt24=12;
            switch ( input.LA(1) ) {
            case RULE_ANY_OTHER:
                {
                alt24=1;
                }
                break;
            case RULE_CID:
                {
                alt24=2;
                }
                break;
            case RULE_INT:
                {
                alt24=3;
                }
                break;
            case 14:
                {
                alt24=4;
                }
                break;
            case 15:
                {
                alt24=5;
                }
                break;
            case 19:
                {
                alt24=6;
                }
                break;
            case 21:
                {
                alt24=7;
                }
                break;
            case 17:
                {
                alt24=8;
                }
                break;
            case 22:
                {
                alt24=9;
                }
                break;
            case RULE_MULTIPLEDOT:
                {
                alt24=10;
                }
                break;
            case RULE_DOUBLEDOT:
                {
                alt24=11;
                }
                break;
            case RULE_SP:
            case RULE_ML_COMMENT:
            case RULE_ML2_COMMENT:
            case RULE_SL_COMMENT:
                {
                alt24=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:870:6: this_ANY_OTHER_0= RULE_ANY_OTHER
                    {
                    this_ANY_OTHER_0=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleSOMETHING22240); 

                    		current.merge(this_ANY_OTHER_0);
                        
                     
                        newLeafNode(this_ANY_OTHER_0, grammarAccess.getSOMETHING2Access().getANY_OTHERTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:878:10: this_CID_1= RULE_CID
                    {
                    this_CID_1=(Token)match(input,RULE_CID,FOLLOW_RULE_CID_in_ruleSOMETHING22266); 

                    		current.merge(this_CID_1);
                        
                     
                        newLeafNode(this_CID_1, grammarAccess.getSOMETHING2Access().getCIDTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:886:10: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSOMETHING22292); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getSOMETHING2Access().getINTTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:895:2: kw= '.'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleSOMETHING22316); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSOMETHING2Access().getFullStopKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:902:2: kw= ':'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleSOMETHING22335); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSOMETHING2Access().getColonKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:909:2: kw= '='
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleSOMETHING22354); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSOMETHING2Access().getEqualsSignKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:916:2: kw= '->'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleSOMETHING22373); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSOMETHING2Access().getHyphenMinusGreaterThanSignKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:923:2: kw= '%'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleSOMETHING22392); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSOMETHING2Access().getPercentSignKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:929:6: (kw= '{' (this_SOMETHING2_9= ruleSOMETHING2 )* kw= '}' )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:929:6: (kw= '{' (this_SOMETHING2_9= ruleSOMETHING2 )* kw= '}' )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:930:2: kw= '{' (this_SOMETHING2_9= ruleSOMETHING2 )* kw= '}'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleSOMETHING22412); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSOMETHING2Access().getLeftCurlyBracketKeyword_8_0()); 
                        
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:935:1: (this_SOMETHING2_9= ruleSOMETHING2 )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( ((LA23_0>=RULE_SP && LA23_0<=RULE_MULTIPLEDOT)||(LA23_0>=14 && LA23_0<=15)||LA23_0==17||LA23_0==19||(LA23_0>=21 && LA23_0<=22)) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:936:5: this_SOMETHING2_9= ruleSOMETHING2
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getSOMETHING2Access().getSOMETHING2ParserRuleCall_8_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleSOMETHING2_in_ruleSOMETHING22435);
                    	    this_SOMETHING2_9=ruleSOMETHING2();

                    	    state._fsp--;


                    	    		current.merge(this_SOMETHING2_9);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    kw=(Token)match(input,23,FOLLOW_23_in_ruleSOMETHING22455); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSOMETHING2Access().getRightCurlyBracketKeyword_8_2()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:953:10: this_multipleDot_11= RULE_MULTIPLEDOT
                    {
                    this_multipleDot_11=(Token)match(input,RULE_MULTIPLEDOT,FOLLOW_RULE_MULTIPLEDOT_in_ruleSOMETHING22477); 

                    		current.merge(this_multipleDot_11);
                        
                     
                        newLeafNode(this_multipleDot_11, grammarAccess.getSOMETHING2Access().getMultipleDotTerminalRuleCall_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:961:10: this_doubleDot_12= RULE_DOUBLEDOT
                    {
                    this_doubleDot_12=(Token)match(input,RULE_DOUBLEDOT,FOLLOW_RULE_DOUBLEDOT_in_ruleSOMETHING22503); 

                    		current.merge(this_doubleDot_12);
                        
                     
                        newLeafNode(this_doubleDot_12, grammarAccess.getSOMETHING2Access().getDoubleDotTerminalRuleCall_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:970:5: this_WS_13= ruleWS
                    {
                     
                            newCompositeNode(grammarAccess.getSOMETHING2Access().getWSParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleWS_in_ruleSOMETHING22536);
                    this_WS_13=ruleWS();

                    state._fsp--;


                    		current.merge(this_WS_13);
                        
                     
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
    // $ANTLR end "ruleSOMETHING2"


    // $ANTLR start "entryRulesignatureDeclaration"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:990:1: entryRulesignatureDeclaration returns [EObject current=null] : iv_rulesignatureDeclaration= rulesignatureDeclaration EOF ;
    public final EObject entryRulesignatureDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesignatureDeclaration = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:991:2: (iv_rulesignatureDeclaration= rulesignatureDeclaration EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:992:2: iv_rulesignatureDeclaration= rulesignatureDeclaration EOF
            {
             newCompositeNode(grammarAccess.getSignatureDeclarationRule()); 
            pushFollow(FOLLOW_rulesignatureDeclaration_in_entryRulesignatureDeclaration2583);
            iv_rulesignatureDeclaration=rulesignatureDeclaration();

            state._fsp--;

             current =iv_rulesignatureDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesignatureDeclaration2593); 

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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:999:1: rulesignatureDeclaration returns [EObject current=null] : ( (otherlv_0= '%' otherlv_1= 'sig' ( ruleWS )+ ( (lv_sigName_3_0= ruleGID ) ) ) ( ruleWS )* otherlv_5= '=' ( ruleWS )* ( (lv_defs_7_0= rulesigDefinitions ) ) ( ruleWS )* otherlv_9= '.' ) ;
    public final EObject rulesignatureDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_sigName_3_0 = null;

        EObject lv_defs_7_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1002:28: ( ( (otherlv_0= '%' otherlv_1= 'sig' ( ruleWS )+ ( (lv_sigName_3_0= ruleGID ) ) ) ( ruleWS )* otherlv_5= '=' ( ruleWS )* ( (lv_defs_7_0= rulesigDefinitions ) ) ( ruleWS )* otherlv_9= '.' ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1003:1: ( (otherlv_0= '%' otherlv_1= 'sig' ( ruleWS )+ ( (lv_sigName_3_0= ruleGID ) ) ) ( ruleWS )* otherlv_5= '=' ( ruleWS )* ( (lv_defs_7_0= rulesigDefinitions ) ) ( ruleWS )* otherlv_9= '.' )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1003:1: ( (otherlv_0= '%' otherlv_1= 'sig' ( ruleWS )+ ( (lv_sigName_3_0= ruleGID ) ) ) ( ruleWS )* otherlv_5= '=' ( ruleWS )* ( (lv_defs_7_0= rulesigDefinitions ) ) ( ruleWS )* otherlv_9= '.' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1003:2: (otherlv_0= '%' otherlv_1= 'sig' ( ruleWS )+ ( (lv_sigName_3_0= ruleGID ) ) ) ( ruleWS )* otherlv_5= '=' ( ruleWS )* ( (lv_defs_7_0= rulesigDefinitions ) ) ( ruleWS )* otherlv_9= '.'
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1003:2: (otherlv_0= '%' otherlv_1= 'sig' ( ruleWS )+ ( (lv_sigName_3_0= ruleGID ) ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1003:4: otherlv_0= '%' otherlv_1= 'sig' ( ruleWS )+ ( (lv_sigName_3_0= ruleGID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_rulesignatureDeclaration2631); 

                	newLeafNode(otherlv_0, grammarAccess.getSignatureDeclarationAccess().getPercentSignKeyword_0_0());
                
            otherlv_1=(Token)match(input,24,FOLLOW_24_in_rulesignatureDeclaration2643); 

                	newLeafNode(otherlv_1, grammarAccess.getSignatureDeclarationAccess().getSigKeyword_0_1());
                
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1011:1: ( ruleWS )+
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
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1012:5: ruleWS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_0_2()); 
            	        
            	    pushFollow(FOLLOW_ruleWS_in_rulesignatureDeclaration2660);
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

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1019:3: ( (lv_sigName_3_0= ruleGID ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1020:1: (lv_sigName_3_0= ruleGID )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1020:1: (lv_sigName_3_0= ruleGID )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1021:3: lv_sigName_3_0= ruleGID
            {
             
            	        newCompositeNode(grammarAccess.getSignatureDeclarationAccess().getSigNameGIDParserRuleCall_0_3_0()); 
            	    
            pushFollow(FOLLOW_ruleGID_in_rulesignatureDeclaration2682);
            lv_sigName_3_0=ruleGID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSignatureDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"sigName",
                    		lv_sigName_3_0, 
                    		"GID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1037:3: ( ruleWS )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=RULE_SP && LA26_0<=RULE_SL_COMMENT)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1038:5: ruleWS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_1()); 
            	        
            	    pushFollow(FOLLOW_ruleWS_in_rulesignatureDeclaration2700);
            	    ruleWS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_rulesignatureDeclaration2713); 

                	newLeafNode(otherlv_5, grammarAccess.getSignatureDeclarationAccess().getEqualsSignKeyword_2());
                
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1049:1: ( ruleWS )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_SP && LA27_0<=RULE_SL_COMMENT)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1050:5: ruleWS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_3()); 
            	        
            	    pushFollow(FOLLOW_ruleWS_in_rulesignatureDeclaration2730);
            	    ruleWS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1057:3: ( (lv_defs_7_0= rulesigDefinitions ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1058:1: (lv_defs_7_0= rulesigDefinitions )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1058:1: (lv_defs_7_0= rulesigDefinitions )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1059:3: lv_defs_7_0= rulesigDefinitions
            {
             
            	        newCompositeNode(grammarAccess.getSignatureDeclarationAccess().getDefsSigDefinitionsParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_rulesigDefinitions_in_rulesignatureDeclaration2752);
            lv_defs_7_0=rulesigDefinitions();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSignatureDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"defs",
                    		lv_defs_7_0, 
                    		"sigDefinitions");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1075:2: ( ruleWS )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=RULE_SP && LA28_0<=RULE_SL_COMMENT)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1076:5: ruleWS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_5()); 
            	        
            	    pushFollow(FOLLOW_ruleWS_in_rulesignatureDeclaration2769);
            	    ruleWS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_14_in_rulesignatureDeclaration2782); 

                	newLeafNode(otherlv_9, grammarAccess.getSignatureDeclarationAccess().getFullStopKeyword_6());
                

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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1095:1: entryRulesigDefinitions returns [EObject current=null] : iv_rulesigDefinitions= rulesigDefinitions EOF ;
    public final EObject entryRulesigDefinitions() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesigDefinitions = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1096:2: (iv_rulesigDefinitions= rulesigDefinitions EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1097:2: iv_rulesigDefinitions= rulesigDefinitions EOF
            {
             newCompositeNode(grammarAccess.getSigDefinitionsRule()); 
            pushFollow(FOLLOW_rulesigDefinitions_in_entryRulesigDefinitions2818);
            iv_rulesigDefinitions=rulesigDefinitions();

            state._fsp--;

             current =iv_rulesigDefinitions; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesigDefinitions2828); 

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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1104:1: rulesigDefinitions returns [EObject current=null] : (otherlv_0= '{' ( ruleWS )* ( (lv_constucts_2_0= rulesigConstruct ) ) (otherlv_3= '.' ( ruleWS )+ ( (lv_constucts_5_0= rulesigConstruct ) ) )* (otherlv_6= '.' ( ruleWS )* )? otherlv_8= '}' ) ;
    public final EObject rulesigDefinitions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_constucts_2_0 = null;

        EObject lv_constucts_5_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1107:28: ( (otherlv_0= '{' ( ruleWS )* ( (lv_constucts_2_0= rulesigConstruct ) ) (otherlv_3= '.' ( ruleWS )+ ( (lv_constucts_5_0= rulesigConstruct ) ) )* (otherlv_6= '.' ( ruleWS )* )? otherlv_8= '}' ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1108:1: (otherlv_0= '{' ( ruleWS )* ( (lv_constucts_2_0= rulesigConstruct ) ) (otherlv_3= '.' ( ruleWS )+ ( (lv_constucts_5_0= rulesigConstruct ) ) )* (otherlv_6= '.' ( ruleWS )* )? otherlv_8= '}' )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1108:1: (otherlv_0= '{' ( ruleWS )* ( (lv_constucts_2_0= rulesigConstruct ) ) (otherlv_3= '.' ( ruleWS )+ ( (lv_constucts_5_0= rulesigConstruct ) ) )* (otherlv_6= '.' ( ruleWS )* )? otherlv_8= '}' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1108:3: otherlv_0= '{' ( ruleWS )* ( (lv_constucts_2_0= rulesigConstruct ) ) (otherlv_3= '.' ( ruleWS )+ ( (lv_constucts_5_0= rulesigConstruct ) ) )* (otherlv_6= '.' ( ruleWS )* )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_rulesigDefinitions2865); 

                	newLeafNode(otherlv_0, grammarAccess.getSigDefinitionsAccess().getLeftCurlyBracketKeyword_0());
                
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1112:1: ( ruleWS )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=RULE_SP && LA29_0<=RULE_SL_COMMENT)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1113:5: ruleWS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_1()); 
            	        
            	    pushFollow(FOLLOW_ruleWS_in_rulesigDefinitions2882);
            	    ruleWS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1120:3: ( (lv_constucts_2_0= rulesigConstruct ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1121:1: (lv_constucts_2_0= rulesigConstruct )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1121:1: (lv_constucts_2_0= rulesigConstruct )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1122:3: lv_constucts_2_0= rulesigConstruct
            {
             
            	        newCompositeNode(grammarAccess.getSigDefinitionsAccess().getConstuctsSigConstructParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulesigConstruct_in_rulesigDefinitions2904);
            lv_constucts_2_0=rulesigConstruct();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSigDefinitionsRule());
            	        }
                   		add(
                   			current, 
                   			"constucts",
                    		lv_constucts_2_0, 
                    		"sigConstruct");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1138:2: (otherlv_3= '.' ( ruleWS )+ ( (lv_constucts_5_0= rulesigConstruct ) ) )*
            loop31:
            do {
                int alt31=2;
                alt31 = dfa31.predict(input);
                switch (alt31) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1138:4: otherlv_3= '.' ( ruleWS )+ ( (lv_constucts_5_0= rulesigConstruct ) )
            	    {
            	    otherlv_3=(Token)match(input,14,FOLLOW_14_in_rulesigDefinitions2917); 

            	        	newLeafNode(otherlv_3, grammarAccess.getSigDefinitionsAccess().getFullStopKeyword_3_0());
            	        
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1142:1: ( ruleWS )+
            	    int cnt30=0;
            	    loop30:
            	    do {
            	        int alt30=2;
            	        int LA30_0 = input.LA(1);

            	        if ( ((LA30_0>=RULE_SP && LA30_0<=RULE_SL_COMMENT)) ) {
            	            alt30=1;
            	        }


            	        switch (alt30) {
            	    	case 1 :
            	    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1143:5: ruleWS
            	    	    {
            	    	     
            	    	            newCompositeNode(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_3_1()); 
            	    	        
            	    	    pushFollow(FOLLOW_ruleWS_in_rulesigDefinitions2934);
            	    	    ruleWS();

            	    	    state._fsp--;

            	    	     
            	    	            afterParserOrEnumRuleCall();
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt30 >= 1 ) break loop30;
            	                EarlyExitException eee =
            	                    new EarlyExitException(30, input);
            	                throw eee;
            	        }
            	        cnt30++;
            	    } while (true);

            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1150:3: ( (lv_constucts_5_0= rulesigConstruct ) )
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1151:1: (lv_constucts_5_0= rulesigConstruct )
            	    {
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1151:1: (lv_constucts_5_0= rulesigConstruct )
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1152:3: lv_constucts_5_0= rulesigConstruct
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSigDefinitionsAccess().getConstuctsSigConstructParserRuleCall_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulesigConstruct_in_rulesigDefinitions2956);
            	    lv_constucts_5_0=rulesigConstruct();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSigDefinitionsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"constucts",
            	            		lv_constucts_5_0, 
            	            		"sigConstruct");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1168:4: (otherlv_6= '.' ( ruleWS )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==14) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1168:6: otherlv_6= '.' ( ruleWS )*
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_rulesigDefinitions2971); 

                        	newLeafNode(otherlv_6, grammarAccess.getSigDefinitionsAccess().getFullStopKeyword_4_0());
                        
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1172:1: ( ruleWS )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( ((LA32_0>=RULE_SP && LA32_0<=RULE_SL_COMMENT)) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1173:5: ruleWS
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_4_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleWS_in_rulesigDefinitions2988);
                    	    ruleWS();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,23,FOLLOW_23_in_rulesigDefinitions3003); 

                	newLeafNode(otherlv_8, grammarAccess.getSigDefinitionsAccess().getRightCurlyBracketKeyword_5());
                

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


    // $ANTLR start "entryRulesigConstruct"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1192:1: entryRulesigConstruct returns [EObject current=null] : iv_rulesigConstruct= rulesigConstruct EOF ;
    public final EObject entryRulesigConstruct() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesigConstruct = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1193:2: (iv_rulesigConstruct= rulesigConstruct EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1194:2: iv_rulesigConstruct= rulesigConstruct EOF
            {
             newCompositeNode(grammarAccess.getSigConstructRule()); 
            pushFollow(FOLLOW_rulesigConstruct_in_entryRulesigConstruct3039);
            iv_rulesigConstruct=rulesigConstruct();

            state._fsp--;

             current =iv_rulesigConstruct; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesigConstruct3049); 

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
    // $ANTLR end "entryRulesigConstruct"


    // $ANTLR start "rulesigConstruct"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1201:1: rulesigConstruct returns [EObject current=null] : (this_classicSymbolConstruct_0= ruleclassicSymbolConstruct | this_includeConstruct_1= ruleincludeConstruct | this_structConstruct_2= rulestructConstruct | (otherlv_3= '%' ( ( (lv_tmp_4_1= 'meta' | lv_tmp_4_2= 'abbrev' | lv_tmp_4_3= 'name' | lv_tmp_4_4= 'pattern' | lv_tmp_4_5= 'infix' | lv_tmp_4_6= 'prefix' | lv_tmp_4_7= 'postfix' ) ) ) ( ruleSOMETHING )* ) ) ;
    public final EObject rulesigConstruct() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token lv_tmp_4_1=null;
        Token lv_tmp_4_2=null;
        Token lv_tmp_4_3=null;
        Token lv_tmp_4_4=null;
        Token lv_tmp_4_5=null;
        Token lv_tmp_4_6=null;
        Token lv_tmp_4_7=null;
        EObject this_classicSymbolConstruct_0 = null;

        EObject this_includeConstruct_1 = null;

        EObject this_structConstruct_2 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1204:28: ( (this_classicSymbolConstruct_0= ruleclassicSymbolConstruct | this_includeConstruct_1= ruleincludeConstruct | this_structConstruct_2= rulestructConstruct | (otherlv_3= '%' ( ( (lv_tmp_4_1= 'meta' | lv_tmp_4_2= 'abbrev' | lv_tmp_4_3= 'name' | lv_tmp_4_4= 'pattern' | lv_tmp_4_5= 'infix' | lv_tmp_4_6= 'prefix' | lv_tmp_4_7= 'postfix' ) ) ) ( ruleSOMETHING )* ) ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1205:1: (this_classicSymbolConstruct_0= ruleclassicSymbolConstruct | this_includeConstruct_1= ruleincludeConstruct | this_structConstruct_2= rulestructConstruct | (otherlv_3= '%' ( ( (lv_tmp_4_1= 'meta' | lv_tmp_4_2= 'abbrev' | lv_tmp_4_3= 'name' | lv_tmp_4_4= 'pattern' | lv_tmp_4_5= 'infix' | lv_tmp_4_6= 'prefix' | lv_tmp_4_7= 'postfix' ) ) ) ( ruleSOMETHING )* ) )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1205:1: (this_classicSymbolConstruct_0= ruleclassicSymbolConstruct | this_includeConstruct_1= ruleincludeConstruct | this_structConstruct_2= rulestructConstruct | (otherlv_3= '%' ( ( (lv_tmp_4_1= 'meta' | lv_tmp_4_2= 'abbrev' | lv_tmp_4_3= 'name' | lv_tmp_4_4= 'pattern' | lv_tmp_4_5= 'infix' | lv_tmp_4_6= 'prefix' | lv_tmp_4_7= 'postfix' ) ) ) ( ruleSOMETHING )* ) )
            int alt36=4;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=RULE_DOUBLEDOT && LA36_0<=RULE_MULTIPLEDOT)||LA36_0==19) ) {
                alt36=1;
            }
            else if ( (LA36_0==17) ) {
                switch ( input.LA(2) ) {
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                    {
                    alt36=4;
                    }
                    break;
                case 33:
                    {
                    alt36=2;
                    }
                    break;
                case 34:
                    {
                    alt36=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1206:5: this_classicSymbolConstruct_0= ruleclassicSymbolConstruct
                    {
                     
                            newCompositeNode(grammarAccess.getSigConstructAccess().getClassicSymbolConstructParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleclassicSymbolConstruct_in_rulesigConstruct3096);
                    this_classicSymbolConstruct_0=ruleclassicSymbolConstruct();

                    state._fsp--;

                     
                            current = this_classicSymbolConstruct_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1216:5: this_includeConstruct_1= ruleincludeConstruct
                    {
                     
                            newCompositeNode(grammarAccess.getSigConstructAccess().getIncludeConstructParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleincludeConstruct_in_rulesigConstruct3123);
                    this_includeConstruct_1=ruleincludeConstruct();

                    state._fsp--;

                     
                            current = this_includeConstruct_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1226:5: this_structConstruct_2= rulestructConstruct
                    {
                     
                            newCompositeNode(grammarAccess.getSigConstructAccess().getStructConstructParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulestructConstruct_in_rulesigConstruct3150);
                    this_structConstruct_2=rulestructConstruct();

                    state._fsp--;

                     
                            current = this_structConstruct_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1235:6: (otherlv_3= '%' ( ( (lv_tmp_4_1= 'meta' | lv_tmp_4_2= 'abbrev' | lv_tmp_4_3= 'name' | lv_tmp_4_4= 'pattern' | lv_tmp_4_5= 'infix' | lv_tmp_4_6= 'prefix' | lv_tmp_4_7= 'postfix' ) ) ) ( ruleSOMETHING )* )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1235:6: (otherlv_3= '%' ( ( (lv_tmp_4_1= 'meta' | lv_tmp_4_2= 'abbrev' | lv_tmp_4_3= 'name' | lv_tmp_4_4= 'pattern' | lv_tmp_4_5= 'infix' | lv_tmp_4_6= 'prefix' | lv_tmp_4_7= 'postfix' ) ) ) ( ruleSOMETHING )* )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1235:8: otherlv_3= '%' ( ( (lv_tmp_4_1= 'meta' | lv_tmp_4_2= 'abbrev' | lv_tmp_4_3= 'name' | lv_tmp_4_4= 'pattern' | lv_tmp_4_5= 'infix' | lv_tmp_4_6= 'prefix' | lv_tmp_4_7= 'postfix' ) ) ) ( ruleSOMETHING )*
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_rulesigConstruct3168); 

                        	newLeafNode(otherlv_3, grammarAccess.getSigConstructAccess().getPercentSignKeyword_3_0());
                        
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1239:1: ( ( (lv_tmp_4_1= 'meta' | lv_tmp_4_2= 'abbrev' | lv_tmp_4_3= 'name' | lv_tmp_4_4= 'pattern' | lv_tmp_4_5= 'infix' | lv_tmp_4_6= 'prefix' | lv_tmp_4_7= 'postfix' ) ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1240:1: ( (lv_tmp_4_1= 'meta' | lv_tmp_4_2= 'abbrev' | lv_tmp_4_3= 'name' | lv_tmp_4_4= 'pattern' | lv_tmp_4_5= 'infix' | lv_tmp_4_6= 'prefix' | lv_tmp_4_7= 'postfix' ) )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1240:1: ( (lv_tmp_4_1= 'meta' | lv_tmp_4_2= 'abbrev' | lv_tmp_4_3= 'name' | lv_tmp_4_4= 'pattern' | lv_tmp_4_5= 'infix' | lv_tmp_4_6= 'prefix' | lv_tmp_4_7= 'postfix' ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1241:1: (lv_tmp_4_1= 'meta' | lv_tmp_4_2= 'abbrev' | lv_tmp_4_3= 'name' | lv_tmp_4_4= 'pattern' | lv_tmp_4_5= 'infix' | lv_tmp_4_6= 'prefix' | lv_tmp_4_7= 'postfix' )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1241:1: (lv_tmp_4_1= 'meta' | lv_tmp_4_2= 'abbrev' | lv_tmp_4_3= 'name' | lv_tmp_4_4= 'pattern' | lv_tmp_4_5= 'infix' | lv_tmp_4_6= 'prefix' | lv_tmp_4_7= 'postfix' )
                    int alt34=7;
                    switch ( input.LA(1) ) {
                    case 25:
                        {
                        alt34=1;
                        }
                        break;
                    case 26:
                        {
                        alt34=2;
                        }
                        break;
                    case 27:
                        {
                        alt34=3;
                        }
                        break;
                    case 28:
                        {
                        alt34=4;
                        }
                        break;
                    case 29:
                        {
                        alt34=5;
                        }
                        break;
                    case 30:
                        {
                        alt34=6;
                        }
                        break;
                    case 31:
                        {
                        alt34=7;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }

                    switch (alt34) {
                        case 1 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1242:3: lv_tmp_4_1= 'meta'
                            {
                            lv_tmp_4_1=(Token)match(input,25,FOLLOW_25_in_rulesigConstruct3188); 

                                    newLeafNode(lv_tmp_4_1, grammarAccess.getSigConstructAccess().getTmpMetaKeyword_3_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getSigConstructRule());
                            	        }
                                   		setWithLastConsumed(current, "tmp", lv_tmp_4_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1254:8: lv_tmp_4_2= 'abbrev'
                            {
                            lv_tmp_4_2=(Token)match(input,26,FOLLOW_26_in_rulesigConstruct3217); 

                                    newLeafNode(lv_tmp_4_2, grammarAccess.getSigConstructAccess().getTmpAbbrevKeyword_3_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getSigConstructRule());
                            	        }
                                   		setWithLastConsumed(current, "tmp", lv_tmp_4_2, null);
                            	    

                            }
                            break;
                        case 3 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1266:8: lv_tmp_4_3= 'name'
                            {
                            lv_tmp_4_3=(Token)match(input,27,FOLLOW_27_in_rulesigConstruct3246); 

                                    newLeafNode(lv_tmp_4_3, grammarAccess.getSigConstructAccess().getTmpNameKeyword_3_1_0_2());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getSigConstructRule());
                            	        }
                                   		setWithLastConsumed(current, "tmp", lv_tmp_4_3, null);
                            	    

                            }
                            break;
                        case 4 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1278:8: lv_tmp_4_4= 'pattern'
                            {
                            lv_tmp_4_4=(Token)match(input,28,FOLLOW_28_in_rulesigConstruct3275); 

                                    newLeafNode(lv_tmp_4_4, grammarAccess.getSigConstructAccess().getTmpPatternKeyword_3_1_0_3());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getSigConstructRule());
                            	        }
                                   		setWithLastConsumed(current, "tmp", lv_tmp_4_4, null);
                            	    

                            }
                            break;
                        case 5 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1290:8: lv_tmp_4_5= 'infix'
                            {
                            lv_tmp_4_5=(Token)match(input,29,FOLLOW_29_in_rulesigConstruct3304); 

                                    newLeafNode(lv_tmp_4_5, grammarAccess.getSigConstructAccess().getTmpInfixKeyword_3_1_0_4());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getSigConstructRule());
                            	        }
                                   		setWithLastConsumed(current, "tmp", lv_tmp_4_5, null);
                            	    

                            }
                            break;
                        case 6 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1302:8: lv_tmp_4_6= 'prefix'
                            {
                            lv_tmp_4_6=(Token)match(input,30,FOLLOW_30_in_rulesigConstruct3333); 

                                    newLeafNode(lv_tmp_4_6, grammarAccess.getSigConstructAccess().getTmpPrefixKeyword_3_1_0_5());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getSigConstructRule());
                            	        }
                                   		setWithLastConsumed(current, "tmp", lv_tmp_4_6, null);
                            	    

                            }
                            break;
                        case 7 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1314:8: lv_tmp_4_7= 'postfix'
                            {
                            lv_tmp_4_7=(Token)match(input,31,FOLLOW_31_in_rulesigConstruct3362); 

                                    newLeafNode(lv_tmp_4_7, grammarAccess.getSigConstructAccess().getTmpPostfixKeyword_3_1_0_6());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getSigConstructRule());
                            	        }
                                   		setWithLastConsumed(current, "tmp", lv_tmp_4_7, null);
                            	    

                            }
                            break;

                    }


                    }


                    }

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1329:2: ( ruleSOMETHING )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==14) ) {
                            int LA35_1 = input.LA(2);

                            if ( ((LA35_1>=RULE_CID && LA35_1<=RULE_ANY_OTHER)) ) {
                                alt35=1;
                            }


                        }
                        else if ( ((LA35_0>=RULE_SP && LA35_0<=RULE_MULTIPLEDOT)||LA35_0==15||LA35_0==17||LA35_0==19||(LA35_0>=21 && LA35_0<=22)) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1330:5: ruleSOMETHING
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getSigConstructAccess().getSOMETHINGParserRuleCall_3_2()); 
                    	        
                    	    pushFollow(FOLLOW_ruleSOMETHING_in_rulesigConstruct3395);
                    	    ruleSOMETHING();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


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
    // $ANTLR end "rulesigConstruct"


    // $ANTLR start "entryRuleclassicSymbolConstruct"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1345:1: entryRuleclassicSymbolConstruct returns [EObject current=null] : iv_ruleclassicSymbolConstruct= ruleclassicSymbolConstruct EOF ;
    public final EObject entryRuleclassicSymbolConstruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleclassicSymbolConstruct = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1346:2: (iv_ruleclassicSymbolConstruct= ruleclassicSymbolConstruct EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1347:2: iv_ruleclassicSymbolConstruct= ruleclassicSymbolConstruct EOF
            {
             newCompositeNode(grammarAccess.getClassicSymbolConstructRule()); 
            pushFollow(FOLLOW_ruleclassicSymbolConstruct_in_entryRuleclassicSymbolConstruct3433);
            iv_ruleclassicSymbolConstruct=ruleclassicSymbolConstruct();

            state._fsp--;

             current =iv_ruleclassicSymbolConstruct; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleclassicSymbolConstruct3443); 

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
    // $ANTLR end "entryRuleclassicSymbolConstruct"


    // $ANTLR start "ruleclassicSymbolConstruct"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1354:1: ruleclassicSymbolConstruct returns [EObject current=null] : ( ( (lv_symbName_0_0= ruleGID ) ) ( ruleWS )* (otherlv_2= ':' | otherlv_3= ':=' | otherlv_4= '=' ) ( ruleSOMETHING )* ) ;
    public final EObject ruleclassicSymbolConstruct() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_symbName_0_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1357:28: ( ( ( (lv_symbName_0_0= ruleGID ) ) ( ruleWS )* (otherlv_2= ':' | otherlv_3= ':=' | otherlv_4= '=' ) ( ruleSOMETHING )* ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1358:1: ( ( (lv_symbName_0_0= ruleGID ) ) ( ruleWS )* (otherlv_2= ':' | otherlv_3= ':=' | otherlv_4= '=' ) ( ruleSOMETHING )* )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1358:1: ( ( (lv_symbName_0_0= ruleGID ) ) ( ruleWS )* (otherlv_2= ':' | otherlv_3= ':=' | otherlv_4= '=' ) ( ruleSOMETHING )* )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1358:2: ( (lv_symbName_0_0= ruleGID ) ) ( ruleWS )* (otherlv_2= ':' | otherlv_3= ':=' | otherlv_4= '=' ) ( ruleSOMETHING )*
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1358:2: ( (lv_symbName_0_0= ruleGID ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1359:1: (lv_symbName_0_0= ruleGID )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1359:1: (lv_symbName_0_0= ruleGID )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1360:3: lv_symbName_0_0= ruleGID
            {
             
            	        newCompositeNode(grammarAccess.getClassicSymbolConstructAccess().getSymbNameGIDParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleGID_in_ruleclassicSymbolConstruct3489);
            lv_symbName_0_0=ruleGID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClassicSymbolConstructRule());
            	        }
                   		set(
                   			current, 
                   			"symbName",
                    		lv_symbName_0_0, 
                    		"GID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1376:2: ( ruleWS )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=RULE_SP && LA37_0<=RULE_SL_COMMENT)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1377:5: ruleWS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getClassicSymbolConstructAccess().getWSParserRuleCall_1()); 
            	        
            	    pushFollow(FOLLOW_ruleWS_in_ruleclassicSymbolConstruct3506);
            	    ruleWS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1384:3: (otherlv_2= ':' | otherlv_3= ':=' | otherlv_4= '=' )
            int alt38=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt38=1;
                }
                break;
            case 32:
                {
                alt38=2;
                }
                break;
            case 19:
                {
                alt38=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1384:5: otherlv_2= ':'
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleclassicSymbolConstruct3520); 

                        	newLeafNode(otherlv_2, grammarAccess.getClassicSymbolConstructAccess().getColonKeyword_2_0());
                        

                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1389:7: otherlv_3= ':='
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleclassicSymbolConstruct3538); 

                        	newLeafNode(otherlv_3, grammarAccess.getClassicSymbolConstructAccess().getColonEqualsSignKeyword_2_1());
                        

                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1394:7: otherlv_4= '='
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleclassicSymbolConstruct3556); 

                        	newLeafNode(otherlv_4, grammarAccess.getClassicSymbolConstructAccess().getEqualsSignKeyword_2_2());
                        

                    }
                    break;

            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1398:2: ( ruleSOMETHING )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==14) ) {
                    int LA39_1 = input.LA(2);

                    if ( ((LA39_1>=RULE_CID && LA39_1<=RULE_ANY_OTHER)) ) {
                        alt39=1;
                    }


                }
                else if ( ((LA39_0>=RULE_SP && LA39_0<=RULE_MULTIPLEDOT)||LA39_0==15||LA39_0==17||LA39_0==19||(LA39_0>=21 && LA39_0<=22)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1399:5: ruleSOMETHING
            	    {
            	     
            	            newCompositeNode(grammarAccess.getClassicSymbolConstructAccess().getSOMETHINGParserRuleCall_3()); 
            	        
            	    pushFollow(FOLLOW_ruleSOMETHING_in_ruleclassicSymbolConstruct3574);
            	    ruleSOMETHING();

            	    state._fsp--;

            	     
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
    // $ANTLR end "ruleclassicSymbolConstruct"


    // $ANTLR start "entryRuleincludeConstruct"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1414:1: entryRuleincludeConstruct returns [EObject current=null] : iv_ruleincludeConstruct= ruleincludeConstruct EOF ;
    public final EObject entryRuleincludeConstruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleincludeConstruct = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1415:2: (iv_ruleincludeConstruct= ruleincludeConstruct EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1416:2: iv_ruleincludeConstruct= ruleincludeConstruct EOF
            {
             newCompositeNode(grammarAccess.getIncludeConstructRule()); 
            pushFollow(FOLLOW_ruleincludeConstruct_in_entryRuleincludeConstruct3611);
            iv_ruleincludeConstruct=ruleincludeConstruct();

            state._fsp--;

             current =iv_ruleincludeConstruct; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleincludeConstruct3621); 

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
    // $ANTLR end "entryRuleincludeConstruct"


    // $ANTLR start "ruleincludeConstruct"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1423:1: ruleincludeConstruct returns [EObject current=null] : (otherlv_0= '%' otherlv_1= 'include' ( ruleWS )+ ( ( ruleNAMESPACE ) ) ( ( ruleWS )+ ruleincludeOps )? ) ;
    public final EObject ruleincludeConstruct() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1426:28: ( (otherlv_0= '%' otherlv_1= 'include' ( ruleWS )+ ( ( ruleNAMESPACE ) ) ( ( ruleWS )+ ruleincludeOps )? ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1427:1: (otherlv_0= '%' otherlv_1= 'include' ( ruleWS )+ ( ( ruleNAMESPACE ) ) ( ( ruleWS )+ ruleincludeOps )? )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1427:1: (otherlv_0= '%' otherlv_1= 'include' ( ruleWS )+ ( ( ruleNAMESPACE ) ) ( ( ruleWS )+ ruleincludeOps )? )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1427:3: otherlv_0= '%' otherlv_1= 'include' ( ruleWS )+ ( ( ruleNAMESPACE ) ) ( ( ruleWS )+ ruleincludeOps )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleincludeConstruct3658); 

                	newLeafNode(otherlv_0, grammarAccess.getIncludeConstructAccess().getPercentSignKeyword_0());
                
            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleincludeConstruct3670); 

                	newLeafNode(otherlv_1, grammarAccess.getIncludeConstructAccess().getIncludeKeyword_1());
                
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1435:1: ( ruleWS )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=RULE_SP && LA40_0<=RULE_SL_COMMENT)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1436:5: ruleWS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getIncludeConstructAccess().getWSParserRuleCall_2()); 
            	        
            	    pushFollow(FOLLOW_ruleWS_in_ruleincludeConstruct3687);
            	    ruleWS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

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

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1443:3: ( ( ruleNAMESPACE ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1444:1: ( ruleNAMESPACE )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1444:1: ( ruleNAMESPACE )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1445:3: ruleNAMESPACE
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIncludeConstructRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getIncludeConstructAccess().getNamespaceSignatureDeclarationCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleNAMESPACE_in_ruleincludeConstruct3711);
            ruleNAMESPACE();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1458:2: ( ( ruleWS )+ ruleincludeOps )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_SP && LA42_0<=RULE_SL_COMMENT)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1458:3: ( ruleWS )+ ruleincludeOps
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1458:3: ( ruleWS )+
                    int cnt41=0;
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( ((LA41_0>=RULE_SP && LA41_0<=RULE_SL_COMMENT)) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1459:5: ruleWS
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getIncludeConstructAccess().getWSParserRuleCall_4_0()); 
                    	        
                    	    pushFollow(FOLLOW_ruleWS_in_ruleincludeConstruct3729);
                    	    ruleWS();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt41 >= 1 ) break loop41;
                                EarlyExitException eee =
                                    new EarlyExitException(41, input);
                                throw eee;
                        }
                        cnt41++;
                    } while (true);

                     
                            newCompositeNode(grammarAccess.getIncludeConstructAccess().getIncludeOpsParserRuleCall_4_1()); 
                        
                    pushFollow(FOLLOW_ruleincludeOps_in_ruleincludeConstruct3746);
                    ruleincludeOps();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleincludeConstruct"


    // $ANTLR start "entryRulestructConstruct"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1482:1: entryRulestructConstruct returns [EObject current=null] : iv_rulestructConstruct= rulestructConstruct EOF ;
    public final EObject entryRulestructConstruct() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestructConstruct = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1483:2: (iv_rulestructConstruct= rulestructConstruct EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1484:2: iv_rulestructConstruct= rulestructConstruct EOF
            {
             newCompositeNode(grammarAccess.getStructConstructRule()); 
            pushFollow(FOLLOW_rulestructConstruct_in_entryRulestructConstruct3783);
            iv_rulestructConstruct=rulestructConstruct();

            state._fsp--;

             current =iv_rulestructConstruct; 
            match(input,EOF,FOLLOW_EOF_in_entryRulestructConstruct3793); 

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
    // $ANTLR end "entryRulestructConstruct"


    // $ANTLR start "rulestructConstruct"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1491:1: rulestructConstruct returns [EObject current=null] : (otherlv_0= '%' otherlv_1= 'struct' ( ruleWS )+ ( (lv_structName_3_0= ruleGID ) ) ( ruleWS )* (otherlv_5= ':' | otherlv_6= ':=' ) ( ruleWS )* ( ( ruleNAMESPACE ) ) ( ruleSOMETHING )* ( (lv_incOpt_10_0= ruleincludeOps ) )? ) ;
    public final EObject rulestructConstruct() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_structName_3_0 = null;

        AntlrDatatypeRuleToken lv_incOpt_10_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1494:28: ( (otherlv_0= '%' otherlv_1= 'struct' ( ruleWS )+ ( (lv_structName_3_0= ruleGID ) ) ( ruleWS )* (otherlv_5= ':' | otherlv_6= ':=' ) ( ruleWS )* ( ( ruleNAMESPACE ) ) ( ruleSOMETHING )* ( (lv_incOpt_10_0= ruleincludeOps ) )? ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1495:1: (otherlv_0= '%' otherlv_1= 'struct' ( ruleWS )+ ( (lv_structName_3_0= ruleGID ) ) ( ruleWS )* (otherlv_5= ':' | otherlv_6= ':=' ) ( ruleWS )* ( ( ruleNAMESPACE ) ) ( ruleSOMETHING )* ( (lv_incOpt_10_0= ruleincludeOps ) )? )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1495:1: (otherlv_0= '%' otherlv_1= 'struct' ( ruleWS )+ ( (lv_structName_3_0= ruleGID ) ) ( ruleWS )* (otherlv_5= ':' | otherlv_6= ':=' ) ( ruleWS )* ( ( ruleNAMESPACE ) ) ( ruleSOMETHING )* ( (lv_incOpt_10_0= ruleincludeOps ) )? )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1495:3: otherlv_0= '%' otherlv_1= 'struct' ( ruleWS )+ ( (lv_structName_3_0= ruleGID ) ) ( ruleWS )* (otherlv_5= ':' | otherlv_6= ':=' ) ( ruleWS )* ( ( ruleNAMESPACE ) ) ( ruleSOMETHING )* ( (lv_incOpt_10_0= ruleincludeOps ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_rulestructConstruct3830); 

                	newLeafNode(otherlv_0, grammarAccess.getStructConstructAccess().getPercentSignKeyword_0());
                
            otherlv_1=(Token)match(input,34,FOLLOW_34_in_rulestructConstruct3842); 

                	newLeafNode(otherlv_1, grammarAccess.getStructConstructAccess().getStructKeyword_1());
                
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1503:1: ( ruleWS )+
            int cnt43=0;
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=RULE_SP && LA43_0<=RULE_SL_COMMENT)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1504:5: ruleWS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getStructConstructAccess().getWSParserRuleCall_2()); 
            	        
            	    pushFollow(FOLLOW_ruleWS_in_rulestructConstruct3859);
            	    ruleWS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt43 >= 1 ) break loop43;
                        EarlyExitException eee =
                            new EarlyExitException(43, input);
                        throw eee;
                }
                cnt43++;
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1511:3: ( (lv_structName_3_0= ruleGID ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1512:1: (lv_structName_3_0= ruleGID )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1512:1: (lv_structName_3_0= ruleGID )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1513:3: lv_structName_3_0= ruleGID
            {
             
            	        newCompositeNode(grammarAccess.getStructConstructAccess().getStructNameGIDParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleGID_in_rulestructConstruct3881);
            lv_structName_3_0=ruleGID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStructConstructRule());
            	        }
                   		set(
                   			current, 
                   			"structName",
                    		lv_structName_3_0, 
                    		"GID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1529:2: ( ruleWS )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=RULE_SP && LA44_0<=RULE_SL_COMMENT)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1530:5: ruleWS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getStructConstructAccess().getWSParserRuleCall_4()); 
            	        
            	    pushFollow(FOLLOW_ruleWS_in_rulestructConstruct3898);
            	    ruleWS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1537:3: (otherlv_5= ':' | otherlv_6= ':=' )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==15) ) {
                alt45=1;
            }
            else if ( (LA45_0==32) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1537:5: otherlv_5= ':'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_rulestructConstruct3912); 

                        	newLeafNode(otherlv_5, grammarAccess.getStructConstructAccess().getColonKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1542:7: otherlv_6= ':='
                    {
                    otherlv_6=(Token)match(input,32,FOLLOW_32_in_rulestructConstruct3930); 

                        	newLeafNode(otherlv_6, grammarAccess.getStructConstructAccess().getColonEqualsSignKeyword_5_1());
                        

                    }
                    break;

            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1546:2: ( ruleWS )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=RULE_SP && LA46_0<=RULE_SL_COMMENT)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1547:5: ruleWS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getStructConstructAccess().getWSParserRuleCall_6()); 
            	        
            	    pushFollow(FOLLOW_ruleWS_in_rulestructConstruct3948);
            	    ruleWS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1554:3: ( ( ruleNAMESPACE ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1555:1: ( ruleNAMESPACE )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1555:1: ( ruleNAMESPACE )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1556:3: ruleNAMESPACE
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStructConstructRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getStructConstructAccess().getNamespaceSignatureDeclarationCrossReference_7_0()); 
            	    
            pushFollow(FOLLOW_ruleNAMESPACE_in_rulestructConstruct3972);
            ruleNAMESPACE();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1569:2: ( ruleSOMETHING )*
            loop47:
            do {
                int alt47=2;
                switch ( input.LA(1) ) {
                case 17:
                    {
                    int LA47_1 = input.LA(2);

                    if ( (LA47_1==EOF||(LA47_1>=RULE_SP && LA47_1<=RULE_MULTIPLEDOT)||(LA47_1>=14 && LA47_1<=15)||LA47_1==17||LA47_1==19||(LA47_1>=21 && LA47_1<=23)) ) {
                        alt47=1;
                    }


                    }
                    break;
                case 14:
                    {
                    int LA47_2 = input.LA(2);

                    if ( ((LA47_2>=RULE_CID && LA47_2<=RULE_ANY_OTHER)) ) {
                        alt47=1;
                    }


                    }
                    break;
                case RULE_SP:
                case RULE_ML_COMMENT:
                case RULE_ML2_COMMENT:
                case RULE_SL_COMMENT:
                case RULE_DOUBLEDOT:
                case RULE_CID:
                case RULE_ANY_OTHER:
                case RULE_INT:
                case RULE_MULTIPLEDOT:
                case 15:
                case 19:
                case 21:
                case 22:
                    {
                    alt47=1;
                    }
                    break;

                }

                switch (alt47) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1570:5: ruleSOMETHING
            	    {
            	     
            	            newCompositeNode(grammarAccess.getStructConstructAccess().getSOMETHINGParserRuleCall_8()); 
            	        
            	    pushFollow(FOLLOW_ruleSOMETHING_in_rulestructConstruct3989);
            	    ruleSOMETHING();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1577:3: ( (lv_incOpt_10_0= ruleincludeOps ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==17) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1578:1: (lv_incOpt_10_0= ruleincludeOps )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1578:1: (lv_incOpt_10_0= ruleincludeOps )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1579:3: lv_incOpt_10_0= ruleincludeOps
                    {
                     
                    	        newCompositeNode(grammarAccess.getStructConstructAccess().getIncOptIncludeOpsParserRuleCall_9_0()); 
                    	    
                    pushFollow(FOLLOW_ruleincludeOps_in_rulestructConstruct4011);
                    lv_incOpt_10_0=ruleincludeOps();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStructConstructRule());
                    	        }
                           		set(
                           			current, 
                           			"incOpt",
                            		lv_incOpt_10_0, 
                            		"includeOps");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

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
    // $ANTLR end "rulestructConstruct"


    // $ANTLR start "entryRuleincludeOps"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1603:1: entryRuleincludeOps returns [String current=null] : iv_ruleincludeOps= ruleincludeOps EOF ;
    public final String entryRuleincludeOps() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleincludeOps = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1604:2: (iv_ruleincludeOps= ruleincludeOps EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1605:2: iv_ruleincludeOps= ruleincludeOps EOF
            {
             newCompositeNode(grammarAccess.getIncludeOpsRule()); 
            pushFollow(FOLLOW_ruleincludeOps_in_entryRuleincludeOps4049);
            iv_ruleincludeOps=ruleincludeOps();

            state._fsp--;

             current =iv_ruleincludeOps.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleincludeOps4060); 

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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1612:1: ruleincludeOps returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '%' kw= 'open' (this_SOMETHING_2= ruleSOMETHING )* ) ;
    public final AntlrDatatypeRuleToken ruleincludeOps() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_SOMETHING_2 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1615:28: ( (kw= '%' kw= 'open' (this_SOMETHING_2= ruleSOMETHING )* ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1616:1: (kw= '%' kw= 'open' (this_SOMETHING_2= ruleSOMETHING )* )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1616:1: (kw= '%' kw= 'open' (this_SOMETHING_2= ruleSOMETHING )* )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1617:2: kw= '%' kw= 'open' (this_SOMETHING_2= ruleSOMETHING )*
            {
            kw=(Token)match(input,17,FOLLOW_17_in_ruleincludeOps4098); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getIncludeOpsAccess().getPercentSignKeyword_0()); 
                
            kw=(Token)match(input,35,FOLLOW_35_in_ruleincludeOps4111); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getIncludeOpsAccess().getOpenKeyword_1()); 
                
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1628:1: (this_SOMETHING_2= ruleSOMETHING )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==14) ) {
                    int LA49_1 = input.LA(2);

                    if ( ((LA49_1>=RULE_CID && LA49_1<=RULE_ANY_OTHER)) ) {
                        alt49=1;
                    }


                }
                else if ( ((LA49_0>=RULE_SP && LA49_0<=RULE_MULTIPLEDOT)||LA49_0==15||LA49_0==17||LA49_0==19||(LA49_0>=21 && LA49_0<=22)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1629:5: this_SOMETHING_2= ruleSOMETHING
            	    {
            	     
            	            newCompositeNode(grammarAccess.getIncludeOpsAccess().getSOMETHINGParserRuleCall_2()); 
            	        
            	    pushFollow(FOLLOW_ruleSOMETHING_in_ruleincludeOps4134);
            	    this_SOMETHING_2=ruleSOMETHING();

            	    state._fsp--;


            	    		current.merge(this_SOMETHING_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop49;
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


    // $ANTLR start "entryRuleviewDeclaration"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1649:1: entryRuleviewDeclaration returns [EObject current=null] : iv_ruleviewDeclaration= ruleviewDeclaration EOF ;
    public final EObject entryRuleviewDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleviewDeclaration = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1650:2: (iv_ruleviewDeclaration= ruleviewDeclaration EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1651:2: iv_ruleviewDeclaration= ruleviewDeclaration EOF
            {
             newCompositeNode(grammarAccess.getViewDeclarationRule()); 
            pushFollow(FOLLOW_ruleviewDeclaration_in_entryRuleviewDeclaration4183);
            iv_ruleviewDeclaration=ruleviewDeclaration();

            state._fsp--;

             current =iv_ruleviewDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleviewDeclaration4193); 

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
    // $ANTLR end "entryRuleviewDeclaration"


    // $ANTLR start "ruleviewDeclaration"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1658:1: ruleviewDeclaration returns [EObject current=null] : (otherlv_0= '%' otherlv_1= 'view' ( ruleWS )+ ( (lv_viewID_3_0= ruleGID ) ) ( ruleWS )* otherlv_5= ':' ( ruleWS )* ( (lv_from_7_0= ruleNAMESPACE ) ) ( ruleWS )* otherlv_9= '->' ( ruleWS )* ( (lv_to_11_0= ruleNAMESPACE ) ) ( ruleWS )* otherlv_13= '=' ( ruleWS )* ( (lv_viewDefs_15_0= rulesigDefinitions ) ) ( ruleWS )* otherlv_17= '.' ruleWS ) ;
    public final EObject ruleviewDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        Token otherlv_13=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_viewID_3_0 = null;

        AntlrDatatypeRuleToken lv_from_7_0 = null;

        AntlrDatatypeRuleToken lv_to_11_0 = null;

        EObject lv_viewDefs_15_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1661:28: ( (otherlv_0= '%' otherlv_1= 'view' ( ruleWS )+ ( (lv_viewID_3_0= ruleGID ) ) ( ruleWS )* otherlv_5= ':' ( ruleWS )* ( (lv_from_7_0= ruleNAMESPACE ) ) ( ruleWS )* otherlv_9= '->' ( ruleWS )* ( (lv_to_11_0= ruleNAMESPACE ) ) ( ruleWS )* otherlv_13= '=' ( ruleWS )* ( (lv_viewDefs_15_0= rulesigDefinitions ) ) ( ruleWS )* otherlv_17= '.' ruleWS ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1662:1: (otherlv_0= '%' otherlv_1= 'view' ( ruleWS )+ ( (lv_viewID_3_0= ruleGID ) ) ( ruleWS )* otherlv_5= ':' ( ruleWS )* ( (lv_from_7_0= ruleNAMESPACE ) ) ( ruleWS )* otherlv_9= '->' ( ruleWS )* ( (lv_to_11_0= ruleNAMESPACE ) ) ( ruleWS )* otherlv_13= '=' ( ruleWS )* ( (lv_viewDefs_15_0= rulesigDefinitions ) ) ( ruleWS )* otherlv_17= '.' ruleWS )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1662:1: (otherlv_0= '%' otherlv_1= 'view' ( ruleWS )+ ( (lv_viewID_3_0= ruleGID ) ) ( ruleWS )* otherlv_5= ':' ( ruleWS )* ( (lv_from_7_0= ruleNAMESPACE ) ) ( ruleWS )* otherlv_9= '->' ( ruleWS )* ( (lv_to_11_0= ruleNAMESPACE ) ) ( ruleWS )* otherlv_13= '=' ( ruleWS )* ( (lv_viewDefs_15_0= rulesigDefinitions ) ) ( ruleWS )* otherlv_17= '.' ruleWS )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1662:3: otherlv_0= '%' otherlv_1= 'view' ( ruleWS )+ ( (lv_viewID_3_0= ruleGID ) ) ( ruleWS )* otherlv_5= ':' ( ruleWS )* ( (lv_from_7_0= ruleNAMESPACE ) ) ( ruleWS )* otherlv_9= '->' ( ruleWS )* ( (lv_to_11_0= ruleNAMESPACE ) ) ( ruleWS )* otherlv_13= '=' ( ruleWS )* ( (lv_viewDefs_15_0= rulesigDefinitions ) ) ( ruleWS )* otherlv_17= '.' ruleWS
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleviewDeclaration4230); 

                	newLeafNode(otherlv_0, grammarAccess.getViewDeclarationAccess().getPercentSignKeyword_0());
                
            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleviewDeclaration4242); 

                	newLeafNode(otherlv_1, grammarAccess.getViewDeclarationAccess().getViewKeyword_1());
                
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1670:1: ( ruleWS )+
            int cnt50=0;
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=RULE_SP && LA50_0<=RULE_SL_COMMENT)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1671:5: ruleWS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_2()); 
            	        
            	    pushFollow(FOLLOW_ruleWS_in_ruleviewDeclaration4259);
            	    ruleWS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt50 >= 1 ) break loop50;
                        EarlyExitException eee =
                            new EarlyExitException(50, input);
                        throw eee;
                }
                cnt50++;
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1678:3: ( (lv_viewID_3_0= ruleGID ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1679:1: (lv_viewID_3_0= ruleGID )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1679:1: (lv_viewID_3_0= ruleGID )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1680:3: lv_viewID_3_0= ruleGID
            {
             
            	        newCompositeNode(grammarAccess.getViewDeclarationAccess().getViewIDGIDParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleGID_in_ruleviewDeclaration4281);
            lv_viewID_3_0=ruleGID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getViewDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"viewID",
                    		lv_viewID_3_0, 
                    		"GID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1696:2: ( ruleWS )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=RULE_SP && LA51_0<=RULE_SL_COMMENT)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1697:5: ruleWS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_4()); 
            	        
            	    pushFollow(FOLLOW_ruleWS_in_ruleviewDeclaration4298);
            	    ruleWS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleviewDeclaration4311); 

                	newLeafNode(otherlv_5, grammarAccess.getViewDeclarationAccess().getColonKeyword_5());
                
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1708:1: ( ruleWS )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>=RULE_SP && LA52_0<=RULE_SL_COMMENT)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1709:5: ruleWS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_6()); 
            	        
            	    pushFollow(FOLLOW_ruleWS_in_ruleviewDeclaration4328);
            	    ruleWS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1716:3: ( (lv_from_7_0= ruleNAMESPACE ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1717:1: (lv_from_7_0= ruleNAMESPACE )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1717:1: (lv_from_7_0= ruleNAMESPACE )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1718:3: lv_from_7_0= ruleNAMESPACE
            {
             
            	        newCompositeNode(grammarAccess.getViewDeclarationAccess().getFromNAMESPACEParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleNAMESPACE_in_ruleviewDeclaration4350);
            lv_from_7_0=ruleNAMESPACE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getViewDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"from",
                    		lv_from_7_0, 
                    		"NAMESPACE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1734:2: ( ruleWS )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=RULE_SP && LA53_0<=RULE_SL_COMMENT)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1735:5: ruleWS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_8()); 
            	        
            	    pushFollow(FOLLOW_ruleWS_in_ruleviewDeclaration4367);
            	    ruleWS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleviewDeclaration4380); 

                	newLeafNode(otherlv_9, grammarAccess.getViewDeclarationAccess().getHyphenMinusGreaterThanSignKeyword_9());
                
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1746:1: ( ruleWS )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=RULE_SP && LA54_0<=RULE_SL_COMMENT)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1747:5: ruleWS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_10()); 
            	        
            	    pushFollow(FOLLOW_ruleWS_in_ruleviewDeclaration4397);
            	    ruleWS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1754:3: ( (lv_to_11_0= ruleNAMESPACE ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1755:1: (lv_to_11_0= ruleNAMESPACE )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1755:1: (lv_to_11_0= ruleNAMESPACE )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1756:3: lv_to_11_0= ruleNAMESPACE
            {
             
            	        newCompositeNode(grammarAccess.getViewDeclarationAccess().getToNAMESPACEParserRuleCall_11_0()); 
            	    
            pushFollow(FOLLOW_ruleNAMESPACE_in_ruleviewDeclaration4419);
            lv_to_11_0=ruleNAMESPACE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getViewDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"to",
                    		lv_to_11_0, 
                    		"NAMESPACE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1772:2: ( ruleWS )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>=RULE_SP && LA55_0<=RULE_SL_COMMENT)) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1773:5: ruleWS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_12()); 
            	        
            	    pushFollow(FOLLOW_ruleWS_in_ruleviewDeclaration4436);
            	    ruleWS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            otherlv_13=(Token)match(input,19,FOLLOW_19_in_ruleviewDeclaration4449); 

                	newLeafNode(otherlv_13, grammarAccess.getViewDeclarationAccess().getEqualsSignKeyword_13());
                
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1784:1: ( ruleWS )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>=RULE_SP && LA56_0<=RULE_SL_COMMENT)) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1785:5: ruleWS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_14()); 
            	        
            	    pushFollow(FOLLOW_ruleWS_in_ruleviewDeclaration4466);
            	    ruleWS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1792:3: ( (lv_viewDefs_15_0= rulesigDefinitions ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1793:1: (lv_viewDefs_15_0= rulesigDefinitions )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1793:1: (lv_viewDefs_15_0= rulesigDefinitions )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1794:3: lv_viewDefs_15_0= rulesigDefinitions
            {
             
            	        newCompositeNode(grammarAccess.getViewDeclarationAccess().getViewDefsSigDefinitionsParserRuleCall_15_0()); 
            	    
            pushFollow(FOLLOW_rulesigDefinitions_in_ruleviewDeclaration4488);
            lv_viewDefs_15_0=rulesigDefinitions();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getViewDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"viewDefs",
                    		lv_viewDefs_15_0, 
                    		"sigDefinitions");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1810:2: ( ruleWS )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( ((LA57_0>=RULE_SP && LA57_0<=RULE_SL_COMMENT)) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1811:5: ruleWS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_16()); 
            	        
            	    pushFollow(FOLLOW_ruleWS_in_ruleviewDeclaration4505);
            	    ruleWS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            otherlv_17=(Token)match(input,14,FOLLOW_14_in_ruleviewDeclaration4518); 

                	newLeafNode(otherlv_17, grammarAccess.getViewDeclarationAccess().getFullStopKeyword_17());
                
             
                    newCompositeNode(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_18()); 
                
            pushFollow(FOLLOW_ruleWS_in_ruleviewDeclaration4534);
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
    // $ANTLR end "ruleviewDeclaration"

    // Delegated rules


    protected DFA17 dfa17 = new DFA17(this);
    protected DFA31 dfa31 = new DFA31(this);
    static final String DFA17_eotS =
        "\30\uffff";
    static final String DFA17_eofS =
        "\2\2\1\uffff\4\10\1\2\1\23\2\uffff\4\2\4\10\1\uffff\4\2";
    static final String DFA17_minS =
        "\2\4\1\uffff\5\4\1\0\2\uffff\10\4\1\uffff\4\4";
    static final String DFA17_maxS =
        "\1\40\1\27\1\uffff\4\40\1\27\1\0\2\uffff\10\40\1\uffff\4\40";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\6\uffff\2\1\10\uffff\1\1\4\uffff";
    static final String DFA17_specialS =
        "\30\uffff}>";
    static final String[] DFA17_transitionS = {
            "\4\2\7\uffff\1\2\3\uffff\1\1\14\uffff\1\2",
            "\1\3\1\4\1\5\1\6\5\2\1\uffff\2\2\1\uffff\1\2\1\uffff\1\7\1"+
            "\uffff\3\2",
            "",
            "\1\13\1\14\1\15\1\16\5\2\1\uffff\1\2\1\11\1\uffff\1\2\1\uffff"+
            "\1\12\1\uffff\3\2\10\uffff\1\12",
            "\1\13\1\14\1\15\1\16\5\2\1\uffff\1\2\1\11\1\uffff\1\2\1\uffff"+
            "\1\12\1\uffff\3\2\10\uffff\1\12",
            "\1\13\1\14\1\15\1\16\5\2\1\uffff\1\2\1\11\1\uffff\1\2\1\uffff"+
            "\1\12\1\uffff\3\2\10\uffff\1\12",
            "\1\13\1\14\1\15\1\16\5\2\1\uffff\1\2\1\11\1\uffff\1\2\1\uffff"+
            "\1\12\1\uffff\3\2\10\uffff\1\12",
            "\1\17\1\20\1\21\1\22\5\2\1\uffff\2\2\1\uffff\1\2\1\uffff\1"+
            "\7\1\uffff\3\2",
            "\1\uffff",
            "",
            "",
            "\1\13\1\14\1\15\1\16\5\2\1\uffff\1\2\1\11\1\uffff\1\2\1\uffff"+
            "\1\12\1\uffff\3\2\10\uffff\1\12",
            "\1\13\1\14\1\15\1\16\5\2\1\uffff\1\2\1\11\1\uffff\1\2\1\uffff"+
            "\1\12\1\uffff\3\2\10\uffff\1\12",
            "\1\13\1\14\1\15\1\16\5\2\1\uffff\1\2\1\11\1\uffff\1\2\1\uffff"+
            "\1\12\1\uffff\3\2\10\uffff\1\12",
            "\1\13\1\14\1\15\1\16\5\2\1\uffff\1\2\1\11\1\uffff\1\2\1\uffff"+
            "\1\12\1\uffff\3\2\10\uffff\1\12",
            "\1\24\1\25\1\26\1\27\5\2\1\uffff\1\2\1\11\1\uffff\1\2\1\uffff"+
            "\1\12\1\uffff\3\2\10\uffff\1\12",
            "\1\24\1\25\1\26\1\27\5\2\1\uffff\1\2\1\11\1\uffff\1\2\1\uffff"+
            "\1\12\1\uffff\3\2\10\uffff\1\12",
            "\1\24\1\25\1\26\1\27\5\2\1\uffff\1\2\1\11\1\uffff\1\2\1\uffff"+
            "\1\12\1\uffff\3\2\10\uffff\1\12",
            "\1\24\1\25\1\26\1\27\5\2\1\uffff\1\2\1\11\1\uffff\1\2\1\uffff"+
            "\1\12\1\uffff\3\2\10\uffff\1\12",
            "",
            "\1\24\1\25\1\26\1\27\5\2\1\uffff\1\2\1\11\1\uffff\1\2\1\uffff"+
            "\1\12\1\uffff\3\2\10\uffff\1\23",
            "\1\24\1\25\1\26\1\27\5\2\1\uffff\1\2\1\11\1\uffff\1\2\1\uffff"+
            "\1\12\1\uffff\3\2\10\uffff\1\23",
            "\1\24\1\25\1\26\1\27\5\2\1\uffff\1\2\1\11\1\uffff\1\2\1\uffff"+
            "\1\12\1\uffff\3\2\10\uffff\1\23",
            "\1\24\1\25\1\26\1\27\5\2\1\uffff\1\2\1\11\1\uffff\1\2\1\uffff"+
            "\1\12\1\uffff\3\2\10\uffff\1\23"
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "646:3: ( (kw= '=' )+ this_WS_4= ruleWS )?";
        }
    }
    static final String DFA31_eotS =
        "\10\uffff";
    static final String DFA31_eofS =
        "\10\uffff";
    static final String DFA31_minS =
        "\1\16\1\4\1\uffff\4\4\1\uffff";
    static final String DFA31_maxS =
        "\2\27\1\uffff\4\27\1\uffff";
    static final String DFA31_acceptS =
        "\2\uffff\1\2\4\uffff\1\1";
    static final String DFA31_specialS =
        "\10\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\1\10\uffff\1\2",
            "\1\3\1\4\1\5\1\6\17\uffff\1\2",
            "",
            "\1\3\1\4\1\5\1\6\5\7\4\uffff\1\7\1\uffff\1\7\3\uffff\1\2",
            "\1\3\1\4\1\5\1\6\5\7\4\uffff\1\7\1\uffff\1\7\3\uffff\1\2",
            "\1\3\1\4\1\5\1\6\5\7\4\uffff\1\7\1\uffff\1\7\3\uffff\1\2",
            "\1\3\1\4\1\5\1\6\5\7\4\uffff\1\7\1\uffff\1\7\3\uffff\1\2",
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "()* loopback of 1138:2: (otherlv_3= '.' ( ruleWS )+ ( (lv_constucts_5_0= rulesigConstruct ) ) )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenamespaceDeclaration_in_ruleModel132 = new BitSet(new long[]{0x00000000000200F2L});
    public static final BitSet FOLLOW_rulesignatureDeclaration_in_ruleModel151 = new BitSet(new long[]{0x00000000000200F2L});
    public static final BitSet FOLLOW_ruleviewDeclaration_in_ruleModel170 = new BitSet(new long[]{0x00000000000200F2L});
    public static final BitSet FOLLOW_rulereadDeclaration_in_ruleModel189 = new BitSet(new long[]{0x00000000000200F2L});
    public static final BitSet FOLLOW_ruleJUSTSPACE_in_ruleModel208 = new BitSet(new long[]{0x00000000000200F2L});
    public static final BitSet FOLLOW_ruleWS_in_entryRuleWS248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWS259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SP_in_ruleWS299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleWS325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML2_COMMENT_in_ruleWS351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleWS377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNAMESPACE_in_entryRuleNAMESPACE423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNAMESPACE434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLEDOT_in_ruleNAMESPACE475 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleNAMESPACE493 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RULE_CID_in_ruleNAMESPACE510 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_13_in_ruleNAMESPACE530 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_14_in_ruleNAMESPACE549 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_CID_in_ruleNAMESPACE565 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_ruleURI_in_entryRuleURI613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURI624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CID_in_ruleURI665 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleURI683 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleURI696 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleURI709 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_ruleNAMESPACE_in_ruleURI733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURISTRING_in_entryRuleURISTRING779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURISTRING790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleURISTRING828 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_ruleURI_in_ruleURISTRING850 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleURISTRING868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJUSTSPACE_in_entryRuleJUSTSPACE908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJUSTSPACE918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_ruleJUSTSPACE963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenamespaceDeclaration_in_entryRulenamespaceDeclaration998 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenamespaceDeclaration1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulenamespaceDeclaration1045 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulenamespaceDeclaration1057 = new BitSet(new long[]{0x00000000000302F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulenamespaceDeclaration1074 = new BitSet(new long[]{0x00000000000302F0L});
    public static final BitSet FOLLOW_RULE_CID_in_rulenamespaceDeclaration1093 = new BitSet(new long[]{0x00000000000A00F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulenamespaceDeclaration1115 = new BitSet(new long[]{0x00000000000A00F0L});
    public static final BitSet FOLLOW_19_in_rulenamespaceDeclaration1128 = new BitSet(new long[]{0x00000000000302F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulenamespaceDeclaration1145 = new BitSet(new long[]{0x00000000000302F0L});
    public static final BitSet FOLLOW_ruleURISTRING_in_rulenamespaceDeclaration1169 = new BitSet(new long[]{0x00000000000240F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulenamespaceDeclaration1186 = new BitSet(new long[]{0x00000000000240F0L});
    public static final BitSet FOLLOW_14_in_rulenamespaceDeclaration1199 = new BitSet(new long[]{0x00000000000200F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulenamespaceDeclaration1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulereadDeclaration_in_entryRulereadDeclaration1250 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulereadDeclaration1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulereadDeclaration1297 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulereadDeclaration1309 = new BitSet(new long[]{0x00000000000302F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulereadDeclaration1326 = new BitSet(new long[]{0x00000000000302F0L});
    public static final BitSet FOLLOW_ruleURISTRING_in_rulereadDeclaration1348 = new BitSet(new long[]{0x00000000000240F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulereadDeclaration1365 = new BitSet(new long[]{0x00000000000240F0L});
    public static final BitSet FOLLOW_14_in_rulereadDeclaration1378 = new BitSet(new long[]{0x00000000000200F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulereadDeclaration1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGID_in_entryRuleGID1430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGID1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CID_in_ruleGID1483 = new BitSet(new long[]{0x0000000000080E02L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleGID1509 = new BitSet(new long[]{0x0000000000080E02L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleGID1535 = new BitSet(new long[]{0x0000000000080E02L});
    public static final BitSet FOLLOW_19_in_ruleGID1557 = new BitSet(new long[]{0x00000000000A00F0L});
    public static final BitSet FOLLOW_ruleWS_in_ruleGID1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleGID1609 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGID1623 = new BitSet(new long[]{0x00000000000A00F0L});
    public static final BitSet FOLLOW_ruleWS_in_ruleGID1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTIPLEDOT_in_ruleGID1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLEDOT_in_ruleGID1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSOMETHING_in_entryRuleSOMETHING1746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSOMETHING1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleSOMETHING1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CID_in_ruleSOMETHING1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSOMETHING1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSOMETHING1874 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_RULE_CID_in_ruleSOMETHING1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleSOMETHING1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSOMETHING1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleSOMETHING1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleSOMETHING1980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleSOMETHING1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleSOMETHING2019 = new BitSet(new long[]{0x0000000000EADFF0L});
    public static final BitSet FOLLOW_ruleSOMETHING2_in_ruleSOMETHING2042 = new BitSet(new long[]{0x0000000000EADFF0L});
    public static final BitSet FOLLOW_23_in_ruleSOMETHING2062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTIPLEDOT_in_ruleSOMETHING2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLEDOT_in_ruleSOMETHING2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_ruleSOMETHING2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSOMETHING2_in_entryRuleSOMETHING22189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSOMETHING22200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleSOMETHING22240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CID_in_ruleSOMETHING22266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSOMETHING22292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSOMETHING22316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSOMETHING22335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleSOMETHING22354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleSOMETHING22373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleSOMETHING22392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleSOMETHING22412 = new BitSet(new long[]{0x0000000000EADFF0L});
    public static final BitSet FOLLOW_ruleSOMETHING2_in_ruleSOMETHING22435 = new BitSet(new long[]{0x0000000000EADFF0L});
    public static final BitSet FOLLOW_23_in_ruleSOMETHING22455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTIPLEDOT_in_ruleSOMETHING22477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLEDOT_in_ruleSOMETHING22503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_ruleSOMETHING22536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignatureDeclaration_in_entryRulesignatureDeclaration2583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesignatureDeclaration2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulesignatureDeclaration2631 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulesignatureDeclaration2643 = new BitSet(new long[]{0x00000000000A1FF0L});
    public static final BitSet FOLLOW_ruleWS_in_rulesignatureDeclaration2660 = new BitSet(new long[]{0x00000000000A1FF0L});
    public static final BitSet FOLLOW_ruleGID_in_rulesignatureDeclaration2682 = new BitSet(new long[]{0x00000000000A00F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulesignatureDeclaration2700 = new BitSet(new long[]{0x00000000000A00F0L});
    public static final BitSet FOLLOW_19_in_rulesignatureDeclaration2713 = new BitSet(new long[]{0x00000000004200F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulesignatureDeclaration2730 = new BitSet(new long[]{0x00000000004200F0L});
    public static final BitSet FOLLOW_rulesigDefinitions_in_rulesignatureDeclaration2752 = new BitSet(new long[]{0x00000000000240F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulesignatureDeclaration2769 = new BitSet(new long[]{0x00000000000240F0L});
    public static final BitSet FOLLOW_14_in_rulesignatureDeclaration2782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigDefinitions_in_entryRulesigDefinitions2818 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesigDefinitions2828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulesigDefinitions2865 = new BitSet(new long[]{0x00000000000A1FF0L});
    public static final BitSet FOLLOW_ruleWS_in_rulesigDefinitions2882 = new BitSet(new long[]{0x00000000000A1FF0L});
    public static final BitSet FOLLOW_rulesigConstruct_in_rulesigDefinitions2904 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_14_in_rulesigDefinitions2917 = new BitSet(new long[]{0x00000000000A1FF0L});
    public static final BitSet FOLLOW_ruleWS_in_rulesigDefinitions2934 = new BitSet(new long[]{0x00000000000A1FF0L});
    public static final BitSet FOLLOW_rulesigConstruct_in_rulesigDefinitions2956 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_14_in_rulesigDefinitions2971 = new BitSet(new long[]{0x00000000008200F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulesigDefinitions2988 = new BitSet(new long[]{0x00000000008200F0L});
    public static final BitSet FOLLOW_23_in_rulesigDefinitions3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigConstruct_in_entryRulesigConstruct3039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesigConstruct3049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleclassicSymbolConstruct_in_rulesigConstruct3096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleincludeConstruct_in_rulesigConstruct3123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestructConstruct_in_rulesigConstruct3150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulesigConstruct3168 = new BitSet(new long[]{0x00000000FE000000L});
    public static final BitSet FOLLOW_25_in_rulesigConstruct3188 = new BitSet(new long[]{0x00000000006ADFF2L});
    public static final BitSet FOLLOW_26_in_rulesigConstruct3217 = new BitSet(new long[]{0x00000000006ADFF2L});
    public static final BitSet FOLLOW_27_in_rulesigConstruct3246 = new BitSet(new long[]{0x00000000006ADFF2L});
    public static final BitSet FOLLOW_28_in_rulesigConstruct3275 = new BitSet(new long[]{0x00000000006ADFF2L});
    public static final BitSet FOLLOW_29_in_rulesigConstruct3304 = new BitSet(new long[]{0x00000000006ADFF2L});
    public static final BitSet FOLLOW_30_in_rulesigConstruct3333 = new BitSet(new long[]{0x00000000006ADFF2L});
    public static final BitSet FOLLOW_31_in_rulesigConstruct3362 = new BitSet(new long[]{0x00000000006ADFF2L});
    public static final BitSet FOLLOW_ruleSOMETHING_in_rulesigConstruct3395 = new BitSet(new long[]{0x00000000006ADFF2L});
    public static final BitSet FOLLOW_ruleclassicSymbolConstruct_in_entryRuleclassicSymbolConstruct3433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleclassicSymbolConstruct3443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGID_in_ruleclassicSymbolConstruct3489 = new BitSet(new long[]{0x00000001000A80F0L});
    public static final BitSet FOLLOW_ruleWS_in_ruleclassicSymbolConstruct3506 = new BitSet(new long[]{0x00000001000A80F0L});
    public static final BitSet FOLLOW_15_in_ruleclassicSymbolConstruct3520 = new BitSet(new long[]{0x00000000006ADFF2L});
    public static final BitSet FOLLOW_32_in_ruleclassicSymbolConstruct3538 = new BitSet(new long[]{0x00000000006ADFF2L});
    public static final BitSet FOLLOW_19_in_ruleclassicSymbolConstruct3556 = new BitSet(new long[]{0x00000000006ADFF2L});
    public static final BitSet FOLLOW_ruleSOMETHING_in_ruleclassicSymbolConstruct3574 = new BitSet(new long[]{0x00000000006ADFF2L});
    public static final BitSet FOLLOW_ruleincludeConstruct_in_entryRuleincludeConstruct3611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleincludeConstruct3621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleincludeConstruct3658 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleincludeConstruct3670 = new BitSet(new long[]{0x00000000000203F0L});
    public static final BitSet FOLLOW_ruleWS_in_ruleincludeConstruct3687 = new BitSet(new long[]{0x00000000000203F0L});
    public static final BitSet FOLLOW_ruleNAMESPACE_in_ruleincludeConstruct3711 = new BitSet(new long[]{0x00000000000200F2L});
    public static final BitSet FOLLOW_ruleWS_in_ruleincludeConstruct3729 = new BitSet(new long[]{0x00000000000200F0L});
    public static final BitSet FOLLOW_ruleincludeOps_in_ruleincludeConstruct3746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestructConstruct_in_entryRulestructConstruct3783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestructConstruct3793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulestructConstruct3830 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_rulestructConstruct3842 = new BitSet(new long[]{0x00000000000A1FF0L});
    public static final BitSet FOLLOW_ruleWS_in_rulestructConstruct3859 = new BitSet(new long[]{0x00000000000A1FF0L});
    public static final BitSet FOLLOW_ruleGID_in_rulestructConstruct3881 = new BitSet(new long[]{0x00000001000280F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulestructConstruct3898 = new BitSet(new long[]{0x00000001000280F0L});
    public static final BitSet FOLLOW_15_in_rulestructConstruct3912 = new BitSet(new long[]{0x00000000000203F0L});
    public static final BitSet FOLLOW_32_in_rulestructConstruct3930 = new BitSet(new long[]{0x00000000000203F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulestructConstruct3948 = new BitSet(new long[]{0x00000000000203F0L});
    public static final BitSet FOLLOW_ruleNAMESPACE_in_rulestructConstruct3972 = new BitSet(new long[]{0x00000000006ADFF2L});
    public static final BitSet FOLLOW_ruleSOMETHING_in_rulestructConstruct3989 = new BitSet(new long[]{0x00000000006ADFF2L});
    public static final BitSet FOLLOW_ruleincludeOps_in_rulestructConstruct4011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleincludeOps_in_entryRuleincludeOps4049 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleincludeOps4060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleincludeOps4098 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleincludeOps4111 = new BitSet(new long[]{0x00000000006ADFF2L});
    public static final BitSet FOLLOW_ruleSOMETHING_in_ruleincludeOps4134 = new BitSet(new long[]{0x00000000006ADFF2L});
    public static final BitSet FOLLOW_ruleviewDeclaration_in_entryRuleviewDeclaration4183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleviewDeclaration4193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleviewDeclaration4230 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleviewDeclaration4242 = new BitSet(new long[]{0x00000000000A1FF0L});
    public static final BitSet FOLLOW_ruleWS_in_ruleviewDeclaration4259 = new BitSet(new long[]{0x00000000000A1FF0L});
    public static final BitSet FOLLOW_ruleGID_in_ruleviewDeclaration4281 = new BitSet(new long[]{0x00000000000280F0L});
    public static final BitSet FOLLOW_ruleWS_in_ruleviewDeclaration4298 = new BitSet(new long[]{0x00000000000280F0L});
    public static final BitSet FOLLOW_15_in_ruleviewDeclaration4311 = new BitSet(new long[]{0x00000000000203F0L});
    public static final BitSet FOLLOW_ruleWS_in_ruleviewDeclaration4328 = new BitSet(new long[]{0x00000000000203F0L});
    public static final BitSet FOLLOW_ruleNAMESPACE_in_ruleviewDeclaration4350 = new BitSet(new long[]{0x00000000002200F0L});
    public static final BitSet FOLLOW_ruleWS_in_ruleviewDeclaration4367 = new BitSet(new long[]{0x00000000002200F0L});
    public static final BitSet FOLLOW_21_in_ruleviewDeclaration4380 = new BitSet(new long[]{0x00000000000203F0L});
    public static final BitSet FOLLOW_ruleWS_in_ruleviewDeclaration4397 = new BitSet(new long[]{0x00000000000203F0L});
    public static final BitSet FOLLOW_ruleNAMESPACE_in_ruleviewDeclaration4419 = new BitSet(new long[]{0x00000000000A00F0L});
    public static final BitSet FOLLOW_ruleWS_in_ruleviewDeclaration4436 = new BitSet(new long[]{0x00000000000A00F0L});
    public static final BitSet FOLLOW_19_in_ruleviewDeclaration4449 = new BitSet(new long[]{0x00000000004200F0L});
    public static final BitSet FOLLOW_ruleWS_in_ruleviewDeclaration4466 = new BitSet(new long[]{0x00000000004200F0L});
    public static final BitSet FOLLOW_rulesigDefinitions_in_ruleviewDeclaration4488 = new BitSet(new long[]{0x00000000000240F0L});
    public static final BitSet FOLLOW_ruleWS_in_ruleviewDeclaration4505 = new BitSet(new long[]{0x00000000000240F0L});
    public static final BitSet FOLLOW_14_in_ruleviewDeclaration4518 = new BitSet(new long[]{0x00000000000200F0L});
    public static final BitSet FOLLOW_ruleWS_in_ruleviewDeclaration4534 = new BitSet(new long[]{0x0000000000000002L});

}