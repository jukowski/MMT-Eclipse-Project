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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SP", "RULE_ML_COMMENT", "RULE_ML2_COMMENT", "RULE_SL_COMMENT", "RULE_CID", "RULE_ANY_OTHER", "RULE_INT", "'../'", "'/'", "'.'", "'://'", "'\"'", "'%namespace'", "'='", "'%read'", "'..'", "':'", "'<'", "'->'", "'%'", "'-'", "'%sig'", "'{'", "'}'", "':='", "'%include'", "'%struct'", "'%meta'", "'%abbrev'", "'%name'", "'%pattern'", "'%infix'", "'prefix'", "'%open'", "'%view'"
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
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
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

                if ( ((LA2_0>=RULE_SP && LA2_0<=RULE_SL_COMMENT)||LA2_0==16||LA2_0==18||LA2_0==25||LA2_0==38) ) {
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
            	    switch ( input.LA(1) ) {
            	    case 16:
            	        {
            	        alt1=1;
            	        }
            	        break;
            	    case 25:
            	        {
            	        alt1=2;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt1=3;
            	        }
            	        break;
            	    case 18:
            	        {
            	        alt1=4;
            	        }
            	        break;
            	    case RULE_SP:
            	    case RULE_ML_COMMENT:
            	    case RULE_ML2_COMMENT:
            	    case RULE_SL_COMMENT:
            	        {
            	        alt1=5;
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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:230:1: ruleNAMESPACE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '../' )* this_CID_1= RULE_CID ( (kw= '/' | kw= '.' ) this_CID_4= RULE_CID )* ) ;
    public final AntlrDatatypeRuleToken ruleNAMESPACE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_CID_1=null;
        Token this_CID_4=null;

         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:233:28: ( ( (kw= '../' )* this_CID_1= RULE_CID ( (kw= '/' | kw= '.' ) this_CID_4= RULE_CID )* ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:234:1: ( (kw= '../' )* this_CID_1= RULE_CID ( (kw= '/' | kw= '.' ) this_CID_4= RULE_CID )* )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:234:1: ( (kw= '../' )* this_CID_1= RULE_CID ( (kw= '/' | kw= '.' ) this_CID_4= RULE_CID )* )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:234:2: (kw= '../' )* this_CID_1= RULE_CID ( (kw= '/' | kw= '.' ) this_CID_4= RULE_CID )*
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:234:2: (kw= '../' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==11) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:235:2: kw= '../'
            	    {
            	    kw=(Token)match(input,11,FOLLOW_11_in_ruleNAMESPACE473); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getNAMESPACEAccess().getFullStopFullStopSolidusKeyword_0()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            this_CID_1=(Token)match(input,RULE_CID,FOLLOW_RULE_CID_in_ruleNAMESPACE490); 

            		current.merge(this_CID_1);
                
             
                newLeafNode(this_CID_1, grammarAccess.getNAMESPACEAccess().getCIDTerminalRuleCall_1()); 
                
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:247:1: ( (kw= '/' | kw= '.' ) this_CID_4= RULE_CID )*
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
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:247:2: (kw= '/' | kw= '.' ) this_CID_4= RULE_CID
            	    {
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:247:2: (kw= '/' | kw= '.' )
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
            	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:248:2: kw= '/'
            	            {
            	            kw=(Token)match(input,12,FOLLOW_12_in_ruleNAMESPACE510); 

            	                    current.merge(kw);
            	                    newLeafNode(kw, grammarAccess.getNAMESPACEAccess().getSolidusKeyword_2_0_0()); 
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:255:2: kw= '.'
            	            {
            	            kw=(Token)match(input,13,FOLLOW_13_in_ruleNAMESPACE529); 

            	                    current.merge(kw);
            	                    newLeafNode(kw, grammarAccess.getNAMESPACEAccess().getFullStopKeyword_2_0_1()); 
            	                

            	            }
            	            break;

            	    }

            	    this_CID_4=(Token)match(input,RULE_CID,FOLLOW_RULE_CID_in_ruleNAMESPACE545); 

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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:275:1: entryRuleURI returns [String current=null] : iv_ruleURI= ruleURI EOF ;
    public final String entryRuleURI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURI = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:276:2: (iv_ruleURI= ruleURI EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:277:2: iv_ruleURI= ruleURI EOF
            {
             newCompositeNode(grammarAccess.getURIRule()); 
            pushFollow(FOLLOW_ruleURI_in_entryRuleURI593);
            iv_ruleURI=ruleURI();

            state._fsp--;

             current =iv_ruleURI.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURI604); 

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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:284:1: ruleURI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_CID_0= RULE_CID kw= '://' )? this_NAMESPACE_2= ruleNAMESPACE ) ;
    public final AntlrDatatypeRuleToken ruleURI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_NAMESPACE_2 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:287:28: ( ( (this_CID_0= RULE_CID kw= '://' )? this_NAMESPACE_2= ruleNAMESPACE ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:288:1: ( (this_CID_0= RULE_CID kw= '://' )? this_NAMESPACE_2= ruleNAMESPACE )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:288:1: ( (this_CID_0= RULE_CID kw= '://' )? this_NAMESPACE_2= ruleNAMESPACE )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:288:2: (this_CID_0= RULE_CID kw= '://' )? this_NAMESPACE_2= ruleNAMESPACE
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:288:2: (this_CID_0= RULE_CID kw= '://' )?
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
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:288:7: this_CID_0= RULE_CID kw= '://'
                    {
                    this_CID_0=(Token)match(input,RULE_CID,FOLLOW_RULE_CID_in_ruleURI645); 

                    		current.merge(this_CID_0);
                        
                     
                        newLeafNode(this_CID_0, grammarAccess.getURIAccess().getCIDTerminalRuleCall_0_0()); 
                        
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleURI663); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getURIAccess().getColonSolidusSolidusKeyword_0_1()); 
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getURIAccess().getNAMESPACEParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleNAMESPACE_in_ruleURI687);
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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:320:1: entryRuleURISTRING returns [String current=null] : iv_ruleURISTRING= ruleURISTRING EOF ;
    public final String entryRuleURISTRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURISTRING = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:321:2: (iv_ruleURISTRING= ruleURISTRING EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:322:2: iv_ruleURISTRING= ruleURISTRING EOF
            {
             newCompositeNode(grammarAccess.getURISTRINGRule()); 
            pushFollow(FOLLOW_ruleURISTRING_in_entryRuleURISTRING733);
            iv_ruleURISTRING=ruleURISTRING();

            state._fsp--;

             current =iv_ruleURISTRING.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURISTRING744); 

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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:329:1: ruleURISTRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\"' this_URI_1= ruleURI kw= '\"' ) ;
    public final AntlrDatatypeRuleToken ruleURISTRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_URI_1 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:332:28: ( (kw= '\"' this_URI_1= ruleURI kw= '\"' ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:333:1: (kw= '\"' this_URI_1= ruleURI kw= '\"' )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:333:1: (kw= '\"' this_URI_1= ruleURI kw= '\"' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:334:2: kw= '\"' this_URI_1= ruleURI kw= '\"'
            {
            kw=(Token)match(input,15,FOLLOW_15_in_ruleURISTRING782); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getURISTRINGAccess().getQuotationMarkKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getURISTRINGAccess().getURIParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleURI_in_ruleURISTRING804);
            this_URI_1=ruleURI();

            state._fsp--;


            		current.merge(this_URI_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,15,FOLLOW_15_in_ruleURISTRING822); 

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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:364:1: entryRuleJUSTSPACE returns [EObject current=null] : iv_ruleJUSTSPACE= ruleJUSTSPACE EOF ;
    public final EObject entryRuleJUSTSPACE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJUSTSPACE = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:365:2: (iv_ruleJUSTSPACE= ruleJUSTSPACE EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:366:2: iv_ruleJUSTSPACE= ruleJUSTSPACE EOF
            {
             newCompositeNode(grammarAccess.getJUSTSPACERule()); 
            pushFollow(FOLLOW_ruleJUSTSPACE_in_entryRuleJUSTSPACE862);
            iv_ruleJUSTSPACE=ruleJUSTSPACE();

            state._fsp--;

             current =iv_ruleJUSTSPACE; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJUSTSPACE872); 

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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:373:1: ruleJUSTSPACE returns [EObject current=null] : ( (lv_J_0_0= ruleWS ) ) ;
    public final EObject ruleJUSTSPACE() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_J_0_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:376:28: ( ( (lv_J_0_0= ruleWS ) ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:377:1: ( (lv_J_0_0= ruleWS ) )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:377:1: ( (lv_J_0_0= ruleWS ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:378:1: (lv_J_0_0= ruleWS )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:378:1: (lv_J_0_0= ruleWS )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:379:3: lv_J_0_0= ruleWS
            {
             
            	        newCompositeNode(grammarAccess.getJUSTSPACEAccess().getJWSParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleWS_in_ruleJUSTSPACE917);
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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:403:1: entryRulenamespaceDeclaration returns [EObject current=null] : iv_rulenamespaceDeclaration= rulenamespaceDeclaration EOF ;
    public final EObject entryRulenamespaceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenamespaceDeclaration = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:404:2: (iv_rulenamespaceDeclaration= rulenamespaceDeclaration EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:405:2: iv_rulenamespaceDeclaration= rulenamespaceDeclaration EOF
            {
             newCompositeNode(grammarAccess.getNamespaceDeclarationRule()); 
            pushFollow(FOLLOW_rulenamespaceDeclaration_in_entryRulenamespaceDeclaration952);
            iv_rulenamespaceDeclaration=rulenamespaceDeclaration();

            state._fsp--;

             current =iv_rulenamespaceDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenamespaceDeclaration962); 

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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:412:1: rulenamespaceDeclaration returns [EObject current=null] : (otherlv_0= '%namespace' ( ruleWS )+ ( ( (lv_name_2_0= RULE_CID ) ) ( ruleWS )* otherlv_4= '=' ( ruleWS )* )? ( (lv_uri_6_0= ruleURISTRING ) ) ( ruleWS )* otherlv_8= '.' ruleWS ) ;
    public final EObject rulenamespaceDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_uri_6_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:415:28: ( (otherlv_0= '%namespace' ( ruleWS )+ ( ( (lv_name_2_0= RULE_CID ) ) ( ruleWS )* otherlv_4= '=' ( ruleWS )* )? ( (lv_uri_6_0= ruleURISTRING ) ) ( ruleWS )* otherlv_8= '.' ruleWS ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:416:1: (otherlv_0= '%namespace' ( ruleWS )+ ( ( (lv_name_2_0= RULE_CID ) ) ( ruleWS )* otherlv_4= '=' ( ruleWS )* )? ( (lv_uri_6_0= ruleURISTRING ) ) ( ruleWS )* otherlv_8= '.' ruleWS )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:416:1: (otherlv_0= '%namespace' ( ruleWS )+ ( ( (lv_name_2_0= RULE_CID ) ) ( ruleWS )* otherlv_4= '=' ( ruleWS )* )? ( (lv_uri_6_0= ruleURISTRING ) ) ( ruleWS )* otherlv_8= '.' ruleWS )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:416:3: otherlv_0= '%namespace' ( ruleWS )+ ( ( (lv_name_2_0= RULE_CID ) ) ( ruleWS )* otherlv_4= '=' ( ruleWS )* )? ( (lv_uri_6_0= ruleURISTRING ) ) ( ruleWS )* otherlv_8= '.' ruleWS
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_rulenamespaceDeclaration999); 

                	newLeafNode(otherlv_0, grammarAccess.getNamespaceDeclarationAccess().getNamespaceKeyword_0());
                
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:420:1: ( ruleWS )+
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
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:421:5: ruleWS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_1()); 
            	        
            	    pushFollow(FOLLOW_ruleWS_in_rulenamespaceDeclaration1016);
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

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:428:3: ( ( (lv_name_2_0= RULE_CID ) ) ( ruleWS )* otherlv_4= '=' ( ruleWS )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_CID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:428:4: ( (lv_name_2_0= RULE_CID ) ) ( ruleWS )* otherlv_4= '=' ( ruleWS )*
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:428:4: ( (lv_name_2_0= RULE_CID ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:429:1: (lv_name_2_0= RULE_CID )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:429:1: (lv_name_2_0= RULE_CID )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:430:3: lv_name_2_0= RULE_CID
                    {
                    lv_name_2_0=(Token)match(input,RULE_CID,FOLLOW_RULE_CID_in_rulenamespaceDeclaration1035); 

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

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:446:2: ( ruleWS )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>=RULE_SP && LA9_0<=RULE_SL_COMMENT)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:447:5: ruleWS
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_2_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleWS_in_rulenamespaceDeclaration1057);
                    	    ruleWS();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_rulenamespaceDeclaration1070); 

                        	newLeafNode(otherlv_4, grammarAccess.getNamespaceDeclarationAccess().getEqualsSignKeyword_2_2());
                        
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:458:1: ( ruleWS )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>=RULE_SP && LA10_0<=RULE_SL_COMMENT)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:459:5: ruleWS
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_2_3()); 
                    	        
                    	    pushFollow(FOLLOW_ruleWS_in_rulenamespaceDeclaration1087);
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

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:466:5: ( (lv_uri_6_0= ruleURISTRING ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:467:1: (lv_uri_6_0= ruleURISTRING )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:467:1: (lv_uri_6_0= ruleURISTRING )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:468:3: lv_uri_6_0= ruleURISTRING
            {
             
            	        newCompositeNode(grammarAccess.getNamespaceDeclarationAccess().getUriURISTRINGParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleURISTRING_in_rulenamespaceDeclaration1111);
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

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:484:2: ( ruleWS )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_SP && LA12_0<=RULE_SL_COMMENT)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:485:5: ruleWS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_4()); 
            	        
            	    pushFollow(FOLLOW_ruleWS_in_rulenamespaceDeclaration1128);
            	    ruleWS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_8=(Token)match(input,13,FOLLOW_13_in_rulenamespaceDeclaration1141); 

                	newLeafNode(otherlv_8, grammarAccess.getNamespaceDeclarationAccess().getFullStopKeyword_5());
                
             
                    newCompositeNode(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_6()); 
                
            pushFollow(FOLLOW_ruleWS_in_rulenamespaceDeclaration1157);
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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:512:1: entryRulereadDeclaration returns [EObject current=null] : iv_rulereadDeclaration= rulereadDeclaration EOF ;
    public final EObject entryRulereadDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulereadDeclaration = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:513:2: (iv_rulereadDeclaration= rulereadDeclaration EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:514:2: iv_rulereadDeclaration= rulereadDeclaration EOF
            {
             newCompositeNode(grammarAccess.getReadDeclarationRule()); 
            pushFollow(FOLLOW_rulereadDeclaration_in_entryRulereadDeclaration1192);
            iv_rulereadDeclaration=rulereadDeclaration();

            state._fsp--;

             current =iv_rulereadDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulereadDeclaration1202); 

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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:521:1: rulereadDeclaration returns [EObject current=null] : (otherlv_0= '%read' ( ruleWS )+ ( (lv_file_2_0= ruleURISTRING ) ) ( ruleWS )* otherlv_4= '.' ruleWS ) ;
    public final EObject rulereadDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_file_2_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:524:28: ( (otherlv_0= '%read' ( ruleWS )+ ( (lv_file_2_0= ruleURISTRING ) ) ( ruleWS )* otherlv_4= '.' ruleWS ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:525:1: (otherlv_0= '%read' ( ruleWS )+ ( (lv_file_2_0= ruleURISTRING ) ) ( ruleWS )* otherlv_4= '.' ruleWS )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:525:1: (otherlv_0= '%read' ( ruleWS )+ ( (lv_file_2_0= ruleURISTRING ) ) ( ruleWS )* otherlv_4= '.' ruleWS )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:525:3: otherlv_0= '%read' ( ruleWS )+ ( (lv_file_2_0= ruleURISTRING ) ) ( ruleWS )* otherlv_4= '.' ruleWS
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_rulereadDeclaration1239); 

                	newLeafNode(otherlv_0, grammarAccess.getReadDeclarationAccess().getReadKeyword_0());
                
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:529:1: ( ruleWS )+
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
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:530:5: ruleWS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getReadDeclarationAccess().getWSParserRuleCall_1()); 
            	        
            	    pushFollow(FOLLOW_ruleWS_in_rulereadDeclaration1256);
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

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:537:3: ( (lv_file_2_0= ruleURISTRING ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:538:1: (lv_file_2_0= ruleURISTRING )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:538:1: (lv_file_2_0= ruleURISTRING )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:539:3: lv_file_2_0= ruleURISTRING
            {
             
            	        newCompositeNode(grammarAccess.getReadDeclarationAccess().getFileURISTRINGParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleURISTRING_in_rulereadDeclaration1278);
            lv_file_2_0=ruleURISTRING();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReadDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"file",
                    		lv_file_2_0, 
                    		"URISTRING");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:555:2: ( ruleWS )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_SP && LA14_0<=RULE_SL_COMMENT)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:556:5: ruleWS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getReadDeclarationAccess().getWSParserRuleCall_3()); 
            	        
            	    pushFollow(FOLLOW_ruleWS_in_rulereadDeclaration1295);
            	    ruleWS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_rulereadDeclaration1308); 

                	newLeafNode(otherlv_4, grammarAccess.getReadDeclarationAccess().getFullStopKeyword_4());
                
             
                    newCompositeNode(grammarAccess.getReadDeclarationAccess().getWSParserRuleCall_5()); 
                
            pushFollow(FOLLOW_ruleWS_in_rulereadDeclaration1324);
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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:583:1: entryRuleGID returns [String current=null] : iv_ruleGID= ruleGID EOF ;
    public final String entryRuleGID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGID = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:584:2: (iv_ruleGID= ruleGID EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:585:2: iv_ruleGID= ruleGID EOF
            {
             newCompositeNode(grammarAccess.getGIDRule()); 
            pushFollow(FOLLOW_ruleGID_in_entryRuleGID1360);
            iv_ruleGID=ruleGID();

            state._fsp--;

             current =iv_ruleGID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGID1371); 

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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:592:1: ruleGID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_CID_0= RULE_CID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_INT_2= RULE_INT )+ | (kw= '..' (kw= '.' )* ) ) ;
    public final AntlrDatatypeRuleToken ruleGID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CID_0=null;
        Token this_ANY_OTHER_1=null;
        Token this_INT_2=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:595:28: ( ( (this_CID_0= RULE_CID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_INT_2= RULE_INT )+ | (kw= '..' (kw= '.' )* ) ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:596:1: ( (this_CID_0= RULE_CID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_INT_2= RULE_INT )+ | (kw= '..' (kw= '.' )* ) )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:596:1: ( (this_CID_0= RULE_CID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_INT_2= RULE_INT )+ | (kw= '..' (kw= '.' )* ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_CID && LA17_0<=RULE_INT)) ) {
                alt17=1;
            }
            else if ( (LA17_0==19) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:596:2: (this_CID_0= RULE_CID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_INT_2= RULE_INT )+
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:596:2: (this_CID_0= RULE_CID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_INT_2= RULE_INT )+
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
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:596:7: this_CID_0= RULE_CID
                    	    {
                    	    this_CID_0=(Token)match(input,RULE_CID,FOLLOW_RULE_CID_in_ruleGID1412); 

                    	    		current.merge(this_CID_0);
                    	        
                    	     
                    	        newLeafNode(this_CID_0, grammarAccess.getGIDAccess().getCIDTerminalRuleCall_0_0()); 
                    	        

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:604:10: this_ANY_OTHER_1= RULE_ANY_OTHER
                    	    {
                    	    this_ANY_OTHER_1=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleGID1438); 

                    	    		current.merge(this_ANY_OTHER_1);
                    	        
                    	     
                    	        newLeafNode(this_ANY_OTHER_1, grammarAccess.getGIDAccess().getANY_OTHERTerminalRuleCall_0_1()); 
                    	        

                    	    }
                    	    break;
                    	case 3 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:612:10: this_INT_2= RULE_INT
                    	    {
                    	    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleGID1464); 

                    	    		current.merge(this_INT_2);
                    	        
                    	     
                    	        newLeafNode(this_INT_2, grammarAccess.getGIDAccess().getINTTerminalRuleCall_0_2()); 
                    	        

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


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:620:6: (kw= '..' (kw= '.' )* )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:620:6: (kw= '..' (kw= '.' )* )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:621:2: kw= '..' (kw= '.' )*
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleGID1491); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getGIDAccess().getFullStopFullStopKeyword_1_0()); 
                        
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:626:1: (kw= '.' )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==13) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:627:2: kw= '.'
                    	    {
                    	    kw=(Token)match(input,13,FOLLOW_13_in_ruleGID1505); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getGIDAccess().getFullStopKeyword_1_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
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
    // $ANTLR end "ruleGID"


    // $ANTLR start "entryRuleSOMETHING"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:640:1: entryRuleSOMETHING returns [String current=null] : iv_ruleSOMETHING= ruleSOMETHING EOF ;
    public final String entryRuleSOMETHING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSOMETHING = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:641:2: (iv_ruleSOMETHING= ruleSOMETHING EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:642:2: iv_ruleSOMETHING= ruleSOMETHING EOF
            {
             newCompositeNode(grammarAccess.getSOMETHINGRule()); 
            pushFollow(FOLLOW_ruleSOMETHING_in_entryRuleSOMETHING1549);
            iv_ruleSOMETHING=ruleSOMETHING();

            state._fsp--;

             current =iv_ruleSOMETHING.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSOMETHING1560); 

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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:649:1: ruleSOMETHING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ANY_OTHER_0= RULE_ANY_OTHER | this_CID_1= RULE_CID | this_INT_2= RULE_INT | (kw= '.' this_CID_4= RULE_CID ) | kw= ':' | kw= '=' | kw= '<' | kw= '->' | kw= '%' | kw= '-' | (kw= '..' (kw= '.' )* this_WS_13= ruleWS ) | this_WS_14= ruleWS ) ;
    public final AntlrDatatypeRuleToken ruleSOMETHING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ANY_OTHER_0=null;
        Token this_CID_1=null;
        Token this_INT_2=null;
        Token kw=null;
        Token this_CID_4=null;
        AntlrDatatypeRuleToken this_WS_13 = null;

        AntlrDatatypeRuleToken this_WS_14 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:652:28: ( (this_ANY_OTHER_0= RULE_ANY_OTHER | this_CID_1= RULE_CID | this_INT_2= RULE_INT | (kw= '.' this_CID_4= RULE_CID ) | kw= ':' | kw= '=' | kw= '<' | kw= '->' | kw= '%' | kw= '-' | (kw= '..' (kw= '.' )* this_WS_13= ruleWS ) | this_WS_14= ruleWS ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:653:1: (this_ANY_OTHER_0= RULE_ANY_OTHER | this_CID_1= RULE_CID | this_INT_2= RULE_INT | (kw= '.' this_CID_4= RULE_CID ) | kw= ':' | kw= '=' | kw= '<' | kw= '->' | kw= '%' | kw= '-' | (kw= '..' (kw= '.' )* this_WS_13= ruleWS ) | this_WS_14= ruleWS )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:653:1: (this_ANY_OTHER_0= RULE_ANY_OTHER | this_CID_1= RULE_CID | this_INT_2= RULE_INT | (kw= '.' this_CID_4= RULE_CID ) | kw= ':' | kw= '=' | kw= '<' | kw= '->' | kw= '%' | kw= '-' | (kw= '..' (kw= '.' )* this_WS_13= ruleWS ) | this_WS_14= ruleWS )
            int alt19=12;
            switch ( input.LA(1) ) {
            case RULE_ANY_OTHER:
                {
                alt19=1;
                }
                break;
            case RULE_CID:
                {
                alt19=2;
                }
                break;
            case RULE_INT:
                {
                alt19=3;
                }
                break;
            case 13:
                {
                alt19=4;
                }
                break;
            case 20:
                {
                alt19=5;
                }
                break;
            case 17:
                {
                alt19=6;
                }
                break;
            case 21:
                {
                alt19=7;
                }
                break;
            case 22:
                {
                alt19=8;
                }
                break;
            case 23:
                {
                alt19=9;
                }
                break;
            case 24:
                {
                alt19=10;
                }
                break;
            case 19:
                {
                alt19=11;
                }
                break;
            case RULE_SP:
            case RULE_ML_COMMENT:
            case RULE_ML2_COMMENT:
            case RULE_SL_COMMENT:
                {
                alt19=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:653:6: this_ANY_OTHER_0= RULE_ANY_OTHER
                    {
                    this_ANY_OTHER_0=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleSOMETHING1600); 

                    		current.merge(this_ANY_OTHER_0);
                        
                     
                        newLeafNode(this_ANY_OTHER_0, grammarAccess.getSOMETHINGAccess().getANY_OTHERTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:661:10: this_CID_1= RULE_CID
                    {
                    this_CID_1=(Token)match(input,RULE_CID,FOLLOW_RULE_CID_in_ruleSOMETHING1626); 

                    		current.merge(this_CID_1);
                        
                     
                        newLeafNode(this_CID_1, grammarAccess.getSOMETHINGAccess().getCIDTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:669:10: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSOMETHING1652); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getSOMETHINGAccess().getINTTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:677:6: (kw= '.' this_CID_4= RULE_CID )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:677:6: (kw= '.' this_CID_4= RULE_CID )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:678:2: kw= '.' this_CID_4= RULE_CID
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleSOMETHING1677); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSOMETHINGAccess().getFullStopKeyword_3_0()); 
                        
                    this_CID_4=(Token)match(input,RULE_CID,FOLLOW_RULE_CID_in_ruleSOMETHING1692); 

                    		current.merge(this_CID_4);
                        
                     
                        newLeafNode(this_CID_4, grammarAccess.getSOMETHINGAccess().getCIDTerminalRuleCall_3_1()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:692:2: kw= ':'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleSOMETHING1717); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSOMETHINGAccess().getColonKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:699:2: kw= '='
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleSOMETHING1736); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSOMETHINGAccess().getEqualsSignKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:706:2: kw= '<'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleSOMETHING1755); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSOMETHINGAccess().getLessThanSignKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:713:2: kw= '->'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleSOMETHING1774); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSOMETHINGAccess().getHyphenMinusGreaterThanSignKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:720:2: kw= '%'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleSOMETHING1793); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSOMETHINGAccess().getPercentSignKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:727:2: kw= '-'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleSOMETHING1812); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSOMETHINGAccess().getHyphenMinusKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:733:6: (kw= '..' (kw= '.' )* this_WS_13= ruleWS )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:733:6: (kw= '..' (kw= '.' )* this_WS_13= ruleWS )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:734:2: kw= '..' (kw= '.' )* this_WS_13= ruleWS
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleSOMETHING1832); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSOMETHINGAccess().getFullStopFullStopKeyword_10_0()); 
                        
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:739:1: (kw= '.' )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==13) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:740:2: kw= '.'
                    	    {
                    	    kw=(Token)match(input,13,FOLLOW_13_in_ruleSOMETHING1846); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getSOMETHINGAccess().getFullStopKeyword_10_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                     
                            newCompositeNode(grammarAccess.getSOMETHINGAccess().getWSParserRuleCall_10_2()); 
                        
                    pushFollow(FOLLOW_ruleWS_in_ruleSOMETHING1870);
                    this_WS_13=ruleWS();

                    state._fsp--;


                    		current.merge(this_WS_13);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 12 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:758:5: this_WS_14= ruleWS
                    {
                     
                            newCompositeNode(grammarAccess.getSOMETHINGAccess().getWSParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleWS_in_ruleSOMETHING1904);
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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:778:1: entryRulesignatureDeclaration returns [EObject current=null] : iv_rulesignatureDeclaration= rulesignatureDeclaration EOF ;
    public final EObject entryRulesignatureDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesignatureDeclaration = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:779:2: (iv_rulesignatureDeclaration= rulesignatureDeclaration EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:780:2: iv_rulesignatureDeclaration= rulesignatureDeclaration EOF
            {
             newCompositeNode(grammarAccess.getSignatureDeclarationRule()); 
            pushFollow(FOLLOW_rulesignatureDeclaration_in_entryRulesignatureDeclaration1951);
            iv_rulesignatureDeclaration=rulesignatureDeclaration();

            state._fsp--;

             current =iv_rulesignatureDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesignatureDeclaration1961); 

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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:787:1: rulesignatureDeclaration returns [EObject current=null] : (otherlv_0= '%sig' ( ruleWS )+ ( (lv_sigName_2_0= ruleGID ) ) ( ruleWS )* otherlv_4= '=' ( ruleWS )* otherlv_6= '{' ( (lv_sigDefinitions_7_0= rulesigDefinitions ) )* otherlv_8= '}' ( ruleWS )* otherlv_10= '.' ruleWS ) ;
    public final EObject rulesignatureDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_sigName_2_0 = null;

        EObject lv_sigDefinitions_7_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:790:28: ( (otherlv_0= '%sig' ( ruleWS )+ ( (lv_sigName_2_0= ruleGID ) ) ( ruleWS )* otherlv_4= '=' ( ruleWS )* otherlv_6= '{' ( (lv_sigDefinitions_7_0= rulesigDefinitions ) )* otherlv_8= '}' ( ruleWS )* otherlv_10= '.' ruleWS ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:791:1: (otherlv_0= '%sig' ( ruleWS )+ ( (lv_sigName_2_0= ruleGID ) ) ( ruleWS )* otherlv_4= '=' ( ruleWS )* otherlv_6= '{' ( (lv_sigDefinitions_7_0= rulesigDefinitions ) )* otherlv_8= '}' ( ruleWS )* otherlv_10= '.' ruleWS )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:791:1: (otherlv_0= '%sig' ( ruleWS )+ ( (lv_sigName_2_0= ruleGID ) ) ( ruleWS )* otherlv_4= '=' ( ruleWS )* otherlv_6= '{' ( (lv_sigDefinitions_7_0= rulesigDefinitions ) )* otherlv_8= '}' ( ruleWS )* otherlv_10= '.' ruleWS )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:791:3: otherlv_0= '%sig' ( ruleWS )+ ( (lv_sigName_2_0= ruleGID ) ) ( ruleWS )* otherlv_4= '=' ( ruleWS )* otherlv_6= '{' ( (lv_sigDefinitions_7_0= rulesigDefinitions ) )* otherlv_8= '}' ( ruleWS )* otherlv_10= '.' ruleWS
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_rulesignatureDeclaration1998); 

                	newLeafNode(otherlv_0, grammarAccess.getSignatureDeclarationAccess().getSigKeyword_0());
                
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:795:1: ( ruleWS )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_SP && LA20_0<=RULE_SL_COMMENT)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:796:5: ruleWS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_1()); 
            	        
            	    pushFollow(FOLLOW_ruleWS_in_rulesignatureDeclaration2015);
            	    ruleWS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:803:3: ( (lv_sigName_2_0= ruleGID ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:804:1: (lv_sigName_2_0= ruleGID )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:804:1: (lv_sigName_2_0= ruleGID )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:805:3: lv_sigName_2_0= ruleGID
            {
             
            	        newCompositeNode(grammarAccess.getSignatureDeclarationAccess().getSigNameGIDParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleGID_in_rulesignatureDeclaration2037);
            lv_sigName_2_0=ruleGID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSignatureDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"sigName",
                    		lv_sigName_2_0, 
                    		"GID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:821:2: ( ruleWS )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_SP && LA21_0<=RULE_SL_COMMENT)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:822:5: ruleWS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_3()); 
            	        
            	    pushFollow(FOLLOW_ruleWS_in_rulesignatureDeclaration2054);
            	    ruleWS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_rulesignatureDeclaration2067); 

                	newLeafNode(otherlv_4, grammarAccess.getSignatureDeclarationAccess().getEqualsSignKeyword_4());
                
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:833:1: ( ruleWS )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_SP && LA22_0<=RULE_SL_COMMENT)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:834:5: ruleWS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_5()); 
            	        
            	    pushFollow(FOLLOW_ruleWS_in_rulesignatureDeclaration2084);
            	    ruleWS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_6=(Token)match(input,26,FOLLOW_26_in_rulesignatureDeclaration2097); 

                	newLeafNode(otherlv_6, grammarAccess.getSignatureDeclarationAccess().getLeftCurlyBracketKeyword_6());
                
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:845:1: ( (lv_sigDefinitions_7_0= rulesigDefinitions ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_SP && LA23_0<=RULE_INT)||LA23_0==19||(LA23_0>=29 && LA23_0<=36)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:846:1: (lv_sigDefinitions_7_0= rulesigDefinitions )
            	    {
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:846:1: (lv_sigDefinitions_7_0= rulesigDefinitions )
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:847:3: lv_sigDefinitions_7_0= rulesigDefinitions
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSignatureDeclarationAccess().getSigDefinitionsSigDefinitionsParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulesigDefinitions_in_rulesignatureDeclaration2118);
            	    lv_sigDefinitions_7_0=rulesigDefinitions();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSignatureDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sigDefinitions",
            	            		lv_sigDefinitions_7_0, 
            	            		"sigDefinitions");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_8=(Token)match(input,27,FOLLOW_27_in_rulesignatureDeclaration2131); 

                	newLeafNode(otherlv_8, grammarAccess.getSignatureDeclarationAccess().getRightCurlyBracketKeyword_8());
                
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:867:1: ( ruleWS )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=RULE_SP && LA24_0<=RULE_SL_COMMENT)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:868:5: ruleWS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_9()); 
            	        
            	    pushFollow(FOLLOW_ruleWS_in_rulesignatureDeclaration2148);
            	    ruleWS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_10=(Token)match(input,13,FOLLOW_13_in_rulesignatureDeclaration2161); 

                	newLeafNode(otherlv_10, grammarAccess.getSignatureDeclarationAccess().getFullStopKeyword_10());
                
             
                    newCompositeNode(grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_11()); 
                
            pushFollow(FOLLOW_ruleWS_in_rulesignatureDeclaration2177);
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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:895:1: entryRulesigDefinitions returns [EObject current=null] : iv_rulesigDefinitions= rulesigDefinitions EOF ;
    public final EObject entryRulesigDefinitions() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesigDefinitions = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:896:2: (iv_rulesigDefinitions= rulesigDefinitions EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:897:2: iv_rulesigDefinitions= rulesigDefinitions EOF
            {
             newCompositeNode(grammarAccess.getSigDefinitionsRule()); 
            pushFollow(FOLLOW_rulesigDefinitions_in_entryRulesigDefinitions2212);
            iv_rulesigDefinitions=rulesigDefinitions();

            state._fsp--;

             current =iv_rulesigDefinitions; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesigDefinitions2222); 

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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:904:1: rulesigDefinitions returns [EObject current=null] : ( ( ( (lv_symbName_0_0= ruleGID ) ) ( ruleWS )* (otherlv_2= ':' | otherlv_3= ':=' | otherlv_4= '=' ) ( ruleSOMETHING )* otherlv_6= '.' ruleWS ) | (otherlv_8= '%include' ( ruleWS )+ ( (lv_namespace_10_0= ruleNAMESPACE ) ) ( ( ruleWS )+ ruleincludeOps )? otherlv_13= '.' ruleWS ) | (otherlv_15= '%struct' ( ruleWS )+ ( (lv_structName_17_0= ruleGID ) ) ( ruleWS )* otherlv_19= ':' ( ruleSOMETHING )* ( ruleincludeOps )? otherlv_22= '.' ruleWS ) | ( ( ( (lv_tmp_24_1= '%meta' | lv_tmp_24_2= '%abbrev' | lv_tmp_24_3= '%name' | lv_tmp_24_4= '%pattern' | lv_tmp_24_5= '%infix' | lv_tmp_24_6= 'prefix' ) ) ) ( ruleSOMETHING )* otherlv_26= '.' ruleWS ) | this_JUSTSPACE_28= ruleJUSTSPACE ) ;
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
        Token lv_tmp_24_1=null;
        Token lv_tmp_24_2=null;
        Token lv_tmp_24_3=null;
        Token lv_tmp_24_4=null;
        Token lv_tmp_24_5=null;
        Token lv_tmp_24_6=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_symbName_0_0 = null;

        AntlrDatatypeRuleToken lv_namespace_10_0 = null;

        AntlrDatatypeRuleToken lv_structName_17_0 = null;

        EObject this_JUSTSPACE_28 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:907:28: ( ( ( ( (lv_symbName_0_0= ruleGID ) ) ( ruleWS )* (otherlv_2= ':' | otherlv_3= ':=' | otherlv_4= '=' ) ( ruleSOMETHING )* otherlv_6= '.' ruleWS ) | (otherlv_8= '%include' ( ruleWS )+ ( (lv_namespace_10_0= ruleNAMESPACE ) ) ( ( ruleWS )+ ruleincludeOps )? otherlv_13= '.' ruleWS ) | (otherlv_15= '%struct' ( ruleWS )+ ( (lv_structName_17_0= ruleGID ) ) ( ruleWS )* otherlv_19= ':' ( ruleSOMETHING )* ( ruleincludeOps )? otherlv_22= '.' ruleWS ) | ( ( ( (lv_tmp_24_1= '%meta' | lv_tmp_24_2= '%abbrev' | lv_tmp_24_3= '%name' | lv_tmp_24_4= '%pattern' | lv_tmp_24_5= '%infix' | lv_tmp_24_6= 'prefix' ) ) ) ( ruleSOMETHING )* otherlv_26= '.' ruleWS ) | this_JUSTSPACE_28= ruleJUSTSPACE ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:908:1: ( ( ( (lv_symbName_0_0= ruleGID ) ) ( ruleWS )* (otherlv_2= ':' | otherlv_3= ':=' | otherlv_4= '=' ) ( ruleSOMETHING )* otherlv_6= '.' ruleWS ) | (otherlv_8= '%include' ( ruleWS )+ ( (lv_namespace_10_0= ruleNAMESPACE ) ) ( ( ruleWS )+ ruleincludeOps )? otherlv_13= '.' ruleWS ) | (otherlv_15= '%struct' ( ruleWS )+ ( (lv_structName_17_0= ruleGID ) ) ( ruleWS )* otherlv_19= ':' ( ruleSOMETHING )* ( ruleincludeOps )? otherlv_22= '.' ruleWS ) | ( ( ( (lv_tmp_24_1= '%meta' | lv_tmp_24_2= '%abbrev' | lv_tmp_24_3= '%name' | lv_tmp_24_4= '%pattern' | lv_tmp_24_5= '%infix' | lv_tmp_24_6= 'prefix' ) ) ) ( ruleSOMETHING )* otherlv_26= '.' ruleWS ) | this_JUSTSPACE_28= ruleJUSTSPACE )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:908:1: ( ( ( (lv_symbName_0_0= ruleGID ) ) ( ruleWS )* (otherlv_2= ':' | otherlv_3= ':=' | otherlv_4= '=' ) ( ruleSOMETHING )* otherlv_6= '.' ruleWS ) | (otherlv_8= '%include' ( ruleWS )+ ( (lv_namespace_10_0= ruleNAMESPACE ) ) ( ( ruleWS )+ ruleincludeOps )? otherlv_13= '.' ruleWS ) | (otherlv_15= '%struct' ( ruleWS )+ ( (lv_structName_17_0= ruleGID ) ) ( ruleWS )* otherlv_19= ':' ( ruleSOMETHING )* ( ruleincludeOps )? otherlv_22= '.' ruleWS ) | ( ( ( (lv_tmp_24_1= '%meta' | lv_tmp_24_2= '%abbrev' | lv_tmp_24_3= '%name' | lv_tmp_24_4= '%pattern' | lv_tmp_24_5= '%infix' | lv_tmp_24_6= 'prefix' ) ) ) ( ruleSOMETHING )* otherlv_26= '.' ruleWS ) | this_JUSTSPACE_28= ruleJUSTSPACE )
            int alt37=5;
            switch ( input.LA(1) ) {
            case RULE_CID:
            case RULE_ANY_OTHER:
            case RULE_INT:
            case 19:
                {
                alt37=1;
                }
                break;
            case 29:
                {
                alt37=2;
                }
                break;
            case 30:
                {
                alt37=3;
                }
                break;
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
                {
                alt37=4;
                }
                break;
            case RULE_SP:
            case RULE_ML_COMMENT:
            case RULE_ML2_COMMENT:
            case RULE_SL_COMMENT:
                {
                alt37=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:908:2: ( ( (lv_symbName_0_0= ruleGID ) ) ( ruleWS )* (otherlv_2= ':' | otherlv_3= ':=' | otherlv_4= '=' ) ( ruleSOMETHING )* otherlv_6= '.' ruleWS )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:908:2: ( ( (lv_symbName_0_0= ruleGID ) ) ( ruleWS )* (otherlv_2= ':' | otherlv_3= ':=' | otherlv_4= '=' ) ( ruleSOMETHING )* otherlv_6= '.' ruleWS )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:908:3: ( (lv_symbName_0_0= ruleGID ) ) ( ruleWS )* (otherlv_2= ':' | otherlv_3= ':=' | otherlv_4= '=' ) ( ruleSOMETHING )* otherlv_6= '.' ruleWS
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:908:3: ( (lv_symbName_0_0= ruleGID ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:909:1: (lv_symbName_0_0= ruleGID )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:909:1: (lv_symbName_0_0= ruleGID )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:910:3: lv_symbName_0_0= ruleGID
                    {
                     
                    	        newCompositeNode(grammarAccess.getSigDefinitionsAccess().getSymbNameGIDParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGID_in_rulesigDefinitions2269);
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

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:926:2: ( ruleWS )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( ((LA25_0>=RULE_SP && LA25_0<=RULE_SL_COMMENT)) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:927:5: ruleWS
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_0_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleWS_in_rulesigDefinitions2286);
                    	    ruleWS();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:934:3: (otherlv_2= ':' | otherlv_3= ':=' | otherlv_4= '=' )
                    int alt26=3;
                    switch ( input.LA(1) ) {
                    case 20:
                        {
                        alt26=1;
                        }
                        break;
                    case 28:
                        {
                        alt26=2;
                        }
                        break;
                    case 17:
                        {
                        alt26=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;
                    }

                    switch (alt26) {
                        case 1 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:934:5: otherlv_2= ':'
                            {
                            otherlv_2=(Token)match(input,20,FOLLOW_20_in_rulesigDefinitions2300); 

                                	newLeafNode(otherlv_2, grammarAccess.getSigDefinitionsAccess().getColonKeyword_0_2_0());
                                

                            }
                            break;
                        case 2 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:939:7: otherlv_3= ':='
                            {
                            otherlv_3=(Token)match(input,28,FOLLOW_28_in_rulesigDefinitions2318); 

                                	newLeafNode(otherlv_3, grammarAccess.getSigDefinitionsAccess().getColonEqualsSignKeyword_0_2_1());
                                

                            }
                            break;
                        case 3 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:944:7: otherlv_4= '='
                            {
                            otherlv_4=(Token)match(input,17,FOLLOW_17_in_rulesigDefinitions2336); 

                                	newLeafNode(otherlv_4, grammarAccess.getSigDefinitionsAccess().getEqualsSignKeyword_0_2_2());
                                

                            }
                            break;

                    }

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:948:2: ( ruleSOMETHING )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==13) ) {
                            int LA27_1 = input.LA(2);

                            if ( (LA27_1==RULE_CID) ) {
                                alt27=1;
                            }


                        }
                        else if ( ((LA27_0>=RULE_SP && LA27_0<=RULE_INT)||LA27_0==17||(LA27_0>=19 && LA27_0<=24)) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:949:5: ruleSOMETHING
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getSigDefinitionsAccess().getSOMETHINGParserRuleCall_0_3()); 
                    	        
                    	    pushFollow(FOLLOW_ruleSOMETHING_in_rulesigDefinitions2354);
                    	    ruleSOMETHING();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,13,FOLLOW_13_in_rulesigDefinitions2367); 

                        	newLeafNode(otherlv_6, grammarAccess.getSigDefinitionsAccess().getFullStopKeyword_0_4());
                        
                     
                            newCompositeNode(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_0_5()); 
                        
                    pushFollow(FOLLOW_ruleWS_in_rulesigDefinitions2383);
                    ruleWS();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:969:6: (otherlv_8= '%include' ( ruleWS )+ ( (lv_namespace_10_0= ruleNAMESPACE ) ) ( ( ruleWS )+ ruleincludeOps )? otherlv_13= '.' ruleWS )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:969:6: (otherlv_8= '%include' ( ruleWS )+ ( (lv_namespace_10_0= ruleNAMESPACE ) ) ( ( ruleWS )+ ruleincludeOps )? otherlv_13= '.' ruleWS )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:969:8: otherlv_8= '%include' ( ruleWS )+ ( (lv_namespace_10_0= ruleNAMESPACE ) ) ( ( ruleWS )+ ruleincludeOps )? otherlv_13= '.' ruleWS
                    {
                    otherlv_8=(Token)match(input,29,FOLLOW_29_in_rulesigDefinitions2402); 

                        	newLeafNode(otherlv_8, grammarAccess.getSigDefinitionsAccess().getIncludeKeyword_1_0());
                        
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:973:1: ( ruleWS )+
                    int cnt28=0;
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( ((LA28_0>=RULE_SP && LA28_0<=RULE_SL_COMMENT)) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:974:5: ruleWS
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_1_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleWS_in_rulesigDefinitions2419);
                    	    ruleWS();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt28 >= 1 ) break loop28;
                                EarlyExitException eee =
                                    new EarlyExitException(28, input);
                                throw eee;
                        }
                        cnt28++;
                    } while (true);

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:981:3: ( (lv_namespace_10_0= ruleNAMESPACE ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:982:1: (lv_namespace_10_0= ruleNAMESPACE )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:982:1: (lv_namespace_10_0= ruleNAMESPACE )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:983:3: lv_namespace_10_0= ruleNAMESPACE
                    {
                     
                    	        newCompositeNode(grammarAccess.getSigDefinitionsAccess().getNamespaceNAMESPACEParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNAMESPACE_in_rulesigDefinitions2441);
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

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:999:2: ( ( ruleWS )+ ruleincludeOps )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( ((LA30_0>=RULE_SP && LA30_0<=RULE_SL_COMMENT)) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:999:3: ( ruleWS )+ ruleincludeOps
                            {
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:999:3: ( ruleWS )+
                            int cnt29=0;
                            loop29:
                            do {
                                int alt29=2;
                                int LA29_0 = input.LA(1);

                                if ( ((LA29_0>=RULE_SP && LA29_0<=RULE_SL_COMMENT)) ) {
                                    alt29=1;
                                }


                                switch (alt29) {
                            	case 1 :
                            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1000:5: ruleWS
                            	    {
                            	     
                            	            newCompositeNode(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_1_3_0()); 
                            	        
                            	    pushFollow(FOLLOW_ruleWS_in_rulesigDefinitions2459);
                            	    ruleWS();

                            	    state._fsp--;

                            	     
                            	            afterParserOrEnumRuleCall();
                            	        

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt29 >= 1 ) break loop29;
                                        EarlyExitException eee =
                                            new EarlyExitException(29, input);
                                        throw eee;
                                }
                                cnt29++;
                            } while (true);

                             
                                    newCompositeNode(grammarAccess.getSigDefinitionsAccess().getIncludeOpsParserRuleCall_1_3_1()); 
                                
                            pushFollow(FOLLOW_ruleincludeOps_in_rulesigDefinitions2476);
                            ruleincludeOps();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,13,FOLLOW_13_in_rulesigDefinitions2489); 

                        	newLeafNode(otherlv_13, grammarAccess.getSigDefinitionsAccess().getFullStopKeyword_1_4());
                        
                     
                            newCompositeNode(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_1_5()); 
                        
                    pushFollow(FOLLOW_ruleWS_in_rulesigDefinitions2505);
                    ruleWS();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1028:6: (otherlv_15= '%struct' ( ruleWS )+ ( (lv_structName_17_0= ruleGID ) ) ( ruleWS )* otherlv_19= ':' ( ruleSOMETHING )* ( ruleincludeOps )? otherlv_22= '.' ruleWS )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1028:6: (otherlv_15= '%struct' ( ruleWS )+ ( (lv_structName_17_0= ruleGID ) ) ( ruleWS )* otherlv_19= ':' ( ruleSOMETHING )* ( ruleincludeOps )? otherlv_22= '.' ruleWS )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1028:8: otherlv_15= '%struct' ( ruleWS )+ ( (lv_structName_17_0= ruleGID ) ) ( ruleWS )* otherlv_19= ':' ( ruleSOMETHING )* ( ruleincludeOps )? otherlv_22= '.' ruleWS
                    {
                    otherlv_15=(Token)match(input,30,FOLLOW_30_in_rulesigDefinitions2524); 

                        	newLeafNode(otherlv_15, grammarAccess.getSigDefinitionsAccess().getStructKeyword_2_0());
                        
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1032:1: ( ruleWS )+
                    int cnt31=0;
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( ((LA31_0>=RULE_SP && LA31_0<=RULE_SL_COMMENT)) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1033:5: ruleWS
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_2_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleWS_in_rulesigDefinitions2541);
                    	    ruleWS();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt31 >= 1 ) break loop31;
                                EarlyExitException eee =
                                    new EarlyExitException(31, input);
                                throw eee;
                        }
                        cnt31++;
                    } while (true);

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1040:3: ( (lv_structName_17_0= ruleGID ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1041:1: (lv_structName_17_0= ruleGID )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1041:1: (lv_structName_17_0= ruleGID )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1042:3: lv_structName_17_0= ruleGID
                    {
                     
                    	        newCompositeNode(grammarAccess.getSigDefinitionsAccess().getStructNameGIDParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGID_in_rulesigDefinitions2563);
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

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1058:2: ( ruleWS )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( ((LA32_0>=RULE_SP && LA32_0<=RULE_SL_COMMENT)) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1059:5: ruleWS
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_2_3()); 
                    	        
                    	    pushFollow(FOLLOW_ruleWS_in_rulesigDefinitions2580);
                    	    ruleWS();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,20,FOLLOW_20_in_rulesigDefinitions2593); 

                        	newLeafNode(otherlv_19, grammarAccess.getSigDefinitionsAccess().getColonKeyword_2_4());
                        
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1070:1: ( ruleSOMETHING )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==13) ) {
                            int LA33_2 = input.LA(2);

                            if ( (LA33_2==RULE_CID) ) {
                                alt33=1;
                            }


                        }
                        else if ( ((LA33_0>=RULE_SP && LA33_0<=RULE_INT)||LA33_0==17||(LA33_0>=19 && LA33_0<=24)) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1071:5: ruleSOMETHING
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getSigDefinitionsAccess().getSOMETHINGParserRuleCall_2_5()); 
                    	        
                    	    pushFollow(FOLLOW_ruleSOMETHING_in_rulesigDefinitions2610);
                    	    ruleSOMETHING();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1078:3: ( ruleincludeOps )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==37) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1079:5: ruleincludeOps
                            {
                             
                                    newCompositeNode(grammarAccess.getSigDefinitionsAccess().getIncludeOpsParserRuleCall_2_6()); 
                                
                            pushFollow(FOLLOW_ruleincludeOps_in_rulesigDefinitions2628);
                            ruleincludeOps();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    otherlv_22=(Token)match(input,13,FOLLOW_13_in_rulesigDefinitions2641); 

                        	newLeafNode(otherlv_22, grammarAccess.getSigDefinitionsAccess().getFullStopKeyword_2_7());
                        
                     
                            newCompositeNode(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_2_8()); 
                        
                    pushFollow(FOLLOW_ruleWS_in_rulesigDefinitions2657);
                    ruleWS();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 4 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1099:6: ( ( ( (lv_tmp_24_1= '%meta' | lv_tmp_24_2= '%abbrev' | lv_tmp_24_3= '%name' | lv_tmp_24_4= '%pattern' | lv_tmp_24_5= '%infix' | lv_tmp_24_6= 'prefix' ) ) ) ( ruleSOMETHING )* otherlv_26= '.' ruleWS )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1099:6: ( ( ( (lv_tmp_24_1= '%meta' | lv_tmp_24_2= '%abbrev' | lv_tmp_24_3= '%name' | lv_tmp_24_4= '%pattern' | lv_tmp_24_5= '%infix' | lv_tmp_24_6= 'prefix' ) ) ) ( ruleSOMETHING )* otherlv_26= '.' ruleWS )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1099:7: ( ( (lv_tmp_24_1= '%meta' | lv_tmp_24_2= '%abbrev' | lv_tmp_24_3= '%name' | lv_tmp_24_4= '%pattern' | lv_tmp_24_5= '%infix' | lv_tmp_24_6= 'prefix' ) ) ) ( ruleSOMETHING )* otherlv_26= '.' ruleWS
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1099:7: ( ( (lv_tmp_24_1= '%meta' | lv_tmp_24_2= '%abbrev' | lv_tmp_24_3= '%name' | lv_tmp_24_4= '%pattern' | lv_tmp_24_5= '%infix' | lv_tmp_24_6= 'prefix' ) ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1100:1: ( (lv_tmp_24_1= '%meta' | lv_tmp_24_2= '%abbrev' | lv_tmp_24_3= '%name' | lv_tmp_24_4= '%pattern' | lv_tmp_24_5= '%infix' | lv_tmp_24_6= 'prefix' ) )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1100:1: ( (lv_tmp_24_1= '%meta' | lv_tmp_24_2= '%abbrev' | lv_tmp_24_3= '%name' | lv_tmp_24_4= '%pattern' | lv_tmp_24_5= '%infix' | lv_tmp_24_6= 'prefix' ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1101:1: (lv_tmp_24_1= '%meta' | lv_tmp_24_2= '%abbrev' | lv_tmp_24_3= '%name' | lv_tmp_24_4= '%pattern' | lv_tmp_24_5= '%infix' | lv_tmp_24_6= 'prefix' )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1101:1: (lv_tmp_24_1= '%meta' | lv_tmp_24_2= '%abbrev' | lv_tmp_24_3= '%name' | lv_tmp_24_4= '%pattern' | lv_tmp_24_5= '%infix' | lv_tmp_24_6= 'prefix' )
                    int alt35=6;
                    switch ( input.LA(1) ) {
                    case 31:
                        {
                        alt35=1;
                        }
                        break;
                    case 32:
                        {
                        alt35=2;
                        }
                        break;
                    case 33:
                        {
                        alt35=3;
                        }
                        break;
                    case 34:
                        {
                        alt35=4;
                        }
                        break;
                    case 35:
                        {
                        alt35=5;
                        }
                        break;
                    case 36:
                        {
                        alt35=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }

                    switch (alt35) {
                        case 1 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1102:3: lv_tmp_24_1= '%meta'
                            {
                            lv_tmp_24_1=(Token)match(input,31,FOLLOW_31_in_rulesigDefinitions2684); 

                                    newLeafNode(lv_tmp_24_1, grammarAccess.getSigDefinitionsAccess().getTmpMetaKeyword_3_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getSigDefinitionsRule());
                            	        }
                                   		setWithLastConsumed(current, "tmp", lv_tmp_24_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1114:8: lv_tmp_24_2= '%abbrev'
                            {
                            lv_tmp_24_2=(Token)match(input,32,FOLLOW_32_in_rulesigDefinitions2713); 

                                    newLeafNode(lv_tmp_24_2, grammarAccess.getSigDefinitionsAccess().getTmpAbbrevKeyword_3_0_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getSigDefinitionsRule());
                            	        }
                                   		setWithLastConsumed(current, "tmp", lv_tmp_24_2, null);
                            	    

                            }
                            break;
                        case 3 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1126:8: lv_tmp_24_3= '%name'
                            {
                            lv_tmp_24_3=(Token)match(input,33,FOLLOW_33_in_rulesigDefinitions2742); 

                                    newLeafNode(lv_tmp_24_3, grammarAccess.getSigDefinitionsAccess().getTmpNameKeyword_3_0_0_2());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getSigDefinitionsRule());
                            	        }
                                   		setWithLastConsumed(current, "tmp", lv_tmp_24_3, null);
                            	    

                            }
                            break;
                        case 4 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1138:8: lv_tmp_24_4= '%pattern'
                            {
                            lv_tmp_24_4=(Token)match(input,34,FOLLOW_34_in_rulesigDefinitions2771); 

                                    newLeafNode(lv_tmp_24_4, grammarAccess.getSigDefinitionsAccess().getTmpPatternKeyword_3_0_0_3());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getSigDefinitionsRule());
                            	        }
                                   		setWithLastConsumed(current, "tmp", lv_tmp_24_4, null);
                            	    

                            }
                            break;
                        case 5 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1150:8: lv_tmp_24_5= '%infix'
                            {
                            lv_tmp_24_5=(Token)match(input,35,FOLLOW_35_in_rulesigDefinitions2800); 

                                    newLeafNode(lv_tmp_24_5, grammarAccess.getSigDefinitionsAccess().getTmpInfixKeyword_3_0_0_4());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getSigDefinitionsRule());
                            	        }
                                   		setWithLastConsumed(current, "tmp", lv_tmp_24_5, null);
                            	    

                            }
                            break;
                        case 6 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1162:8: lv_tmp_24_6= 'prefix'
                            {
                            lv_tmp_24_6=(Token)match(input,36,FOLLOW_36_in_rulesigDefinitions2829); 

                                    newLeafNode(lv_tmp_24_6, grammarAccess.getSigDefinitionsAccess().getTmpPrefixKeyword_3_0_0_5());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getSigDefinitionsRule());
                            	        }
                                   		setWithLastConsumed(current, "tmp", lv_tmp_24_6, null);
                            	    

                            }
                            break;

                    }


                    }


                    }

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1177:2: ( ruleSOMETHING )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==13) ) {
                            int LA36_1 = input.LA(2);

                            if ( (LA36_1==RULE_CID) ) {
                                alt36=1;
                            }


                        }
                        else if ( ((LA36_0>=RULE_SP && LA36_0<=RULE_INT)||LA36_0==17||(LA36_0>=19 && LA36_0<=24)) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1178:5: ruleSOMETHING
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getSigDefinitionsAccess().getSOMETHINGParserRuleCall_3_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleSOMETHING_in_rulesigDefinitions2862);
                    	    ruleSOMETHING();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,13,FOLLOW_13_in_rulesigDefinitions2875); 

                        	newLeafNode(otherlv_26, grammarAccess.getSigDefinitionsAccess().getFullStopKeyword_3_2());
                        
                     
                            newCompositeNode(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_3_3()); 
                        
                    pushFollow(FOLLOW_ruleWS_in_rulesigDefinitions2891);
                    ruleWS();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 5 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1199:5: this_JUSTSPACE_28= ruleJUSTSPACE
                    {
                     
                            newCompositeNode(grammarAccess.getSigDefinitionsAccess().getJUSTSPACEParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleJUSTSPACE_in_rulesigDefinitions2919);
                    this_JUSTSPACE_28=ruleJUSTSPACE();

                    state._fsp--;

                     
                            current = this_JUSTSPACE_28; 
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
    // $ANTLR end "rulesigDefinitions"


    // $ANTLR start "entryRuleincludeOps"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1215:1: entryRuleincludeOps returns [String current=null] : iv_ruleincludeOps= ruleincludeOps EOF ;
    public final String entryRuleincludeOps() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleincludeOps = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1216:2: (iv_ruleincludeOps= ruleincludeOps EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1217:2: iv_ruleincludeOps= ruleincludeOps EOF
            {
             newCompositeNode(grammarAccess.getIncludeOpsRule()); 
            pushFollow(FOLLOW_ruleincludeOps_in_entryRuleincludeOps2955);
            iv_ruleincludeOps=ruleincludeOps();

            state._fsp--;

             current =iv_ruleincludeOps.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleincludeOps2966); 

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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1224:1: ruleincludeOps returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '%open' (this_SOMETHING_1= ruleSOMETHING )* ) ;
    public final AntlrDatatypeRuleToken ruleincludeOps() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_SOMETHING_1 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1227:28: ( (kw= '%open' (this_SOMETHING_1= ruleSOMETHING )* ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1228:1: (kw= '%open' (this_SOMETHING_1= ruleSOMETHING )* )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1228:1: (kw= '%open' (this_SOMETHING_1= ruleSOMETHING )* )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1229:2: kw= '%open' (this_SOMETHING_1= ruleSOMETHING )*
            {
            kw=(Token)match(input,37,FOLLOW_37_in_ruleincludeOps3004); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getIncludeOpsAccess().getOpenKeyword_0()); 
                
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1234:1: (this_SOMETHING_1= ruleSOMETHING )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==13) ) {
                    int LA38_1 = input.LA(2);

                    if ( (LA38_1==RULE_CID) ) {
                        alt38=1;
                    }


                }
                else if ( ((LA38_0>=RULE_SP && LA38_0<=RULE_INT)||LA38_0==17||(LA38_0>=19 && LA38_0<=24)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1235:5: this_SOMETHING_1= ruleSOMETHING
            	    {
            	     
            	            newCompositeNode(grammarAccess.getIncludeOpsAccess().getSOMETHINGParserRuleCall_1()); 
            	        
            	    pushFollow(FOLLOW_ruleSOMETHING_in_ruleincludeOps3027);
            	    this_SOMETHING_1=ruleSOMETHING();

            	    state._fsp--;


            	    		current.merge(this_SOMETHING_1);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop38;
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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1255:1: entryRuleviewDeclaration returns [EObject current=null] : iv_ruleviewDeclaration= ruleviewDeclaration EOF ;
    public final EObject entryRuleviewDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleviewDeclaration = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1256:2: (iv_ruleviewDeclaration= ruleviewDeclaration EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1257:2: iv_ruleviewDeclaration= ruleviewDeclaration EOF
            {
             newCompositeNode(grammarAccess.getViewDeclarationRule()); 
            pushFollow(FOLLOW_ruleviewDeclaration_in_entryRuleviewDeclaration3076);
            iv_ruleviewDeclaration=ruleviewDeclaration();

            state._fsp--;

             current =iv_ruleviewDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleviewDeclaration3086); 

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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1264:1: ruleviewDeclaration returns [EObject current=null] : (otherlv_0= '%view' ( ruleWS )+ ( (lv_viewID_2_0= ruleGID ) ) ( ruleWS )* otherlv_4= ':' ( ruleWS )* ( (lv_from_6_0= ruleNAMESPACE ) ) ( ruleWS )* otherlv_8= '->' ( ruleWS )* ( (lv_to_10_0= ruleNAMESPACE ) ) ( ruleWS )* otherlv_12= '=' ( ruleWS )* otherlv_14= '{' ( (lv_viewDefinitions_15_0= rulesigDefinitions ) )* otherlv_16= '}' ( ruleWS )* otherlv_18= '.' ruleWS ) ;
    public final EObject ruleviewDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_viewID_2_0 = null;

        AntlrDatatypeRuleToken lv_from_6_0 = null;

        AntlrDatatypeRuleToken lv_to_10_0 = null;

        EObject lv_viewDefinitions_15_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1267:28: ( (otherlv_0= '%view' ( ruleWS )+ ( (lv_viewID_2_0= ruleGID ) ) ( ruleWS )* otherlv_4= ':' ( ruleWS )* ( (lv_from_6_0= ruleNAMESPACE ) ) ( ruleWS )* otherlv_8= '->' ( ruleWS )* ( (lv_to_10_0= ruleNAMESPACE ) ) ( ruleWS )* otherlv_12= '=' ( ruleWS )* otherlv_14= '{' ( (lv_viewDefinitions_15_0= rulesigDefinitions ) )* otherlv_16= '}' ( ruleWS )* otherlv_18= '.' ruleWS ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1268:1: (otherlv_0= '%view' ( ruleWS )+ ( (lv_viewID_2_0= ruleGID ) ) ( ruleWS )* otherlv_4= ':' ( ruleWS )* ( (lv_from_6_0= ruleNAMESPACE ) ) ( ruleWS )* otherlv_8= '->' ( ruleWS )* ( (lv_to_10_0= ruleNAMESPACE ) ) ( ruleWS )* otherlv_12= '=' ( ruleWS )* otherlv_14= '{' ( (lv_viewDefinitions_15_0= rulesigDefinitions ) )* otherlv_16= '}' ( ruleWS )* otherlv_18= '.' ruleWS )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1268:1: (otherlv_0= '%view' ( ruleWS )+ ( (lv_viewID_2_0= ruleGID ) ) ( ruleWS )* otherlv_4= ':' ( ruleWS )* ( (lv_from_6_0= ruleNAMESPACE ) ) ( ruleWS )* otherlv_8= '->' ( ruleWS )* ( (lv_to_10_0= ruleNAMESPACE ) ) ( ruleWS )* otherlv_12= '=' ( ruleWS )* otherlv_14= '{' ( (lv_viewDefinitions_15_0= rulesigDefinitions ) )* otherlv_16= '}' ( ruleWS )* otherlv_18= '.' ruleWS )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1268:3: otherlv_0= '%view' ( ruleWS )+ ( (lv_viewID_2_0= ruleGID ) ) ( ruleWS )* otherlv_4= ':' ( ruleWS )* ( (lv_from_6_0= ruleNAMESPACE ) ) ( ruleWS )* otherlv_8= '->' ( ruleWS )* ( (lv_to_10_0= ruleNAMESPACE ) ) ( ruleWS )* otherlv_12= '=' ( ruleWS )* otherlv_14= '{' ( (lv_viewDefinitions_15_0= rulesigDefinitions ) )* otherlv_16= '}' ( ruleWS )* otherlv_18= '.' ruleWS
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleviewDeclaration3123); 

                	newLeafNode(otherlv_0, grammarAccess.getViewDeclarationAccess().getViewKeyword_0());
                
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1272:1: ( ruleWS )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=RULE_SP && LA39_0<=RULE_SL_COMMENT)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1273:5: ruleWS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_1()); 
            	        
            	    pushFollow(FOLLOW_ruleWS_in_ruleviewDeclaration3140);
            	    ruleWS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1280:3: ( (lv_viewID_2_0= ruleGID ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1281:1: (lv_viewID_2_0= ruleGID )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1281:1: (lv_viewID_2_0= ruleGID )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1282:3: lv_viewID_2_0= ruleGID
            {
             
            	        newCompositeNode(grammarAccess.getViewDeclarationAccess().getViewIDGIDParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleGID_in_ruleviewDeclaration3162);
            lv_viewID_2_0=ruleGID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getViewDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"viewID",
                    		lv_viewID_2_0, 
                    		"GID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1298:2: ( ruleWS )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=RULE_SP && LA40_0<=RULE_SL_COMMENT)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1299:5: ruleWS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_3()); 
            	        
            	    pushFollow(FOLLOW_ruleWS_in_ruleviewDeclaration3179);
            	    ruleWS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleviewDeclaration3192); 

                	newLeafNode(otherlv_4, grammarAccess.getViewDeclarationAccess().getColonKeyword_4());
                
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1310:1: ( ruleWS )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=RULE_SP && LA41_0<=RULE_SL_COMMENT)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1311:5: ruleWS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_5()); 
            	        
            	    pushFollow(FOLLOW_ruleWS_in_ruleviewDeclaration3209);
            	    ruleWS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1318:3: ( (lv_from_6_0= ruleNAMESPACE ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1319:1: (lv_from_6_0= ruleNAMESPACE )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1319:1: (lv_from_6_0= ruleNAMESPACE )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1320:3: lv_from_6_0= ruleNAMESPACE
            {
             
            	        newCompositeNode(grammarAccess.getViewDeclarationAccess().getFromNAMESPACEParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleNAMESPACE_in_ruleviewDeclaration3231);
            lv_from_6_0=ruleNAMESPACE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getViewDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"from",
                    		lv_from_6_0, 
                    		"NAMESPACE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1336:2: ( ruleWS )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=RULE_SP && LA42_0<=RULE_SL_COMMENT)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1337:5: ruleWS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_7()); 
            	        
            	    pushFollow(FOLLOW_ruleWS_in_ruleviewDeclaration3248);
            	    ruleWS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleviewDeclaration3261); 

                	newLeafNode(otherlv_8, grammarAccess.getViewDeclarationAccess().getHyphenMinusGreaterThanSignKeyword_8());
                
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1348:1: ( ruleWS )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=RULE_SP && LA43_0<=RULE_SL_COMMENT)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1349:5: ruleWS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_9()); 
            	        
            	    pushFollow(FOLLOW_ruleWS_in_ruleviewDeclaration3278);
            	    ruleWS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1356:3: ( (lv_to_10_0= ruleNAMESPACE ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1357:1: (lv_to_10_0= ruleNAMESPACE )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1357:1: (lv_to_10_0= ruleNAMESPACE )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1358:3: lv_to_10_0= ruleNAMESPACE
            {
             
            	        newCompositeNode(grammarAccess.getViewDeclarationAccess().getToNAMESPACEParserRuleCall_10_0()); 
            	    
            pushFollow(FOLLOW_ruleNAMESPACE_in_ruleviewDeclaration3300);
            lv_to_10_0=ruleNAMESPACE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getViewDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"to",
                    		lv_to_10_0, 
                    		"NAMESPACE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1374:2: ( ruleWS )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=RULE_SP && LA44_0<=RULE_SL_COMMENT)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1375:5: ruleWS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_11()); 
            	        
            	    pushFollow(FOLLOW_ruleWS_in_ruleviewDeclaration3317);
            	    ruleWS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleviewDeclaration3330); 

                	newLeafNode(otherlv_12, grammarAccess.getViewDeclarationAccess().getEqualsSignKeyword_12());
                
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1386:1: ( ruleWS )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=RULE_SP && LA45_0<=RULE_SL_COMMENT)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1387:5: ruleWS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_13()); 
            	        
            	    pushFollow(FOLLOW_ruleWS_in_ruleviewDeclaration3347);
            	    ruleWS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            otherlv_14=(Token)match(input,26,FOLLOW_26_in_ruleviewDeclaration3360); 

                	newLeafNode(otherlv_14, grammarAccess.getViewDeclarationAccess().getLeftCurlyBracketKeyword_14());
                
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1398:1: ( (lv_viewDefinitions_15_0= rulesigDefinitions ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=RULE_SP && LA46_0<=RULE_INT)||LA46_0==19||(LA46_0>=29 && LA46_0<=36)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1399:1: (lv_viewDefinitions_15_0= rulesigDefinitions )
            	    {
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1399:1: (lv_viewDefinitions_15_0= rulesigDefinitions )
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1400:3: lv_viewDefinitions_15_0= rulesigDefinitions
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getViewDeclarationAccess().getViewDefinitionsSigDefinitionsParserRuleCall_15_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulesigDefinitions_in_ruleviewDeclaration3381);
            	    lv_viewDefinitions_15_0=rulesigDefinitions();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getViewDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"viewDefinitions",
            	            		lv_viewDefinitions_15_0, 
            	            		"sigDefinitions");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            otherlv_16=(Token)match(input,27,FOLLOW_27_in_ruleviewDeclaration3394); 

                	newLeafNode(otherlv_16, grammarAccess.getViewDeclarationAccess().getRightCurlyBracketKeyword_16());
                
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1420:1: ( ruleWS )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=RULE_SP && LA47_0<=RULE_SL_COMMENT)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1421:5: ruleWS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_17()); 
            	        
            	    pushFollow(FOLLOW_ruleWS_in_ruleviewDeclaration3411);
            	    ruleWS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            otherlv_18=(Token)match(input,13,FOLLOW_13_in_ruleviewDeclaration3424); 

                	newLeafNode(otherlv_18, grammarAccess.getViewDeclarationAccess().getFullStopKeyword_18());
                
             
                    newCompositeNode(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_19()); 
                
            pushFollow(FOLLOW_ruleWS_in_ruleviewDeclaration3440);
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


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenamespaceDeclaration_in_ruleModel132 = new BitSet(new long[]{0x00000040020500F2L});
    public static final BitSet FOLLOW_rulesignatureDeclaration_in_ruleModel151 = new BitSet(new long[]{0x00000040020500F2L});
    public static final BitSet FOLLOW_ruleviewDeclaration_in_ruleModel170 = new BitSet(new long[]{0x00000040020500F2L});
    public static final BitSet FOLLOW_rulereadDeclaration_in_ruleModel189 = new BitSet(new long[]{0x00000040020500F2L});
    public static final BitSet FOLLOW_ruleJUSTSPACE_in_ruleModel208 = new BitSet(new long[]{0x00000040020500F2L});
    public static final BitSet FOLLOW_ruleWS_in_entryRuleWS248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWS259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SP_in_ruleWS299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleWS325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML2_COMMENT_in_ruleWS351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleWS377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNAMESPACE_in_entryRuleNAMESPACE423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNAMESPACE434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleNAMESPACE473 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_RULE_CID_in_ruleNAMESPACE490 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_12_in_ruleNAMESPACE510 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_13_in_ruleNAMESPACE529 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_CID_in_ruleNAMESPACE545 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_ruleURI_in_entryRuleURI593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURI604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CID_in_ruleURI645 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleURI663 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ruleNAMESPACE_in_ruleURI687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURISTRING_in_entryRuleURISTRING733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURISTRING744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleURISTRING782 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ruleURI_in_ruleURISTRING804 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleURISTRING822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJUSTSPACE_in_entryRuleJUSTSPACE862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJUSTSPACE872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_ruleJUSTSPACE917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenamespaceDeclaration_in_entryRulenamespaceDeclaration952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenamespaceDeclaration962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulenamespaceDeclaration999 = new BitSet(new long[]{0x00000040020581F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulenamespaceDeclaration1016 = new BitSet(new long[]{0x00000040020581F0L});
    public static final BitSet FOLLOW_RULE_CID_in_rulenamespaceDeclaration1035 = new BitSet(new long[]{0x00000040020700F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulenamespaceDeclaration1057 = new BitSet(new long[]{0x00000040020700F0L});
    public static final BitSet FOLLOW_17_in_rulenamespaceDeclaration1070 = new BitSet(new long[]{0x00000040020581F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulenamespaceDeclaration1087 = new BitSet(new long[]{0x00000040020581F0L});
    public static final BitSet FOLLOW_ruleURISTRING_in_rulenamespaceDeclaration1111 = new BitSet(new long[]{0x00000040020520F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulenamespaceDeclaration1128 = new BitSet(new long[]{0x00000040020520F0L});
    public static final BitSet FOLLOW_13_in_rulenamespaceDeclaration1141 = new BitSet(new long[]{0x00000040020500F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulenamespaceDeclaration1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulereadDeclaration_in_entryRulereadDeclaration1192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulereadDeclaration1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulereadDeclaration1239 = new BitSet(new long[]{0x00000040020581F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulereadDeclaration1256 = new BitSet(new long[]{0x00000040020581F0L});
    public static final BitSet FOLLOW_ruleURISTRING_in_rulereadDeclaration1278 = new BitSet(new long[]{0x00000040020520F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulereadDeclaration1295 = new BitSet(new long[]{0x00000040020520F0L});
    public static final BitSet FOLLOW_13_in_rulereadDeclaration1308 = new BitSet(new long[]{0x00000040020500F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulereadDeclaration1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGID_in_entryRuleGID1360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGID1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CID_in_ruleGID1412 = new BitSet(new long[]{0x0000000000000702L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleGID1438 = new BitSet(new long[]{0x0000000000000702L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleGID1464 = new BitSet(new long[]{0x0000000000000702L});
    public static final BitSet FOLLOW_19_in_ruleGID1491 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleGID1505 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleSOMETHING_in_entryRuleSOMETHING1549 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSOMETHING1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleSOMETHING1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CID_in_ruleSOMETHING1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSOMETHING1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleSOMETHING1677 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_CID_in_ruleSOMETHING1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleSOMETHING1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleSOMETHING1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleSOMETHING1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleSOMETHING1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleSOMETHING1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleSOMETHING1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleSOMETHING1832 = new BitSet(new long[]{0x00000040020520F0L});
    public static final BitSet FOLLOW_13_in_ruleSOMETHING1846 = new BitSet(new long[]{0x00000040020520F0L});
    public static final BitSet FOLLOW_ruleWS_in_ruleSOMETHING1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_ruleSOMETHING1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignatureDeclaration_in_entryRulesignatureDeclaration1951 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesignatureDeclaration1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulesignatureDeclaration1998 = new BitSet(new long[]{0x00000040020D07F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulesignatureDeclaration2015 = new BitSet(new long[]{0x00000040020D07F0L});
    public static final BitSet FOLLOW_ruleGID_in_rulesignatureDeclaration2037 = new BitSet(new long[]{0x00000040020700F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulesignatureDeclaration2054 = new BitSet(new long[]{0x00000040020700F0L});
    public static final BitSet FOLLOW_17_in_rulesignatureDeclaration2067 = new BitSet(new long[]{0x00000040060500F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulesignatureDeclaration2084 = new BitSet(new long[]{0x00000040060500F0L});
    public static final BitSet FOLLOW_26_in_rulesignatureDeclaration2097 = new BitSet(new long[]{0x0000005FEA0D07F0L});
    public static final BitSet FOLLOW_rulesigDefinitions_in_rulesignatureDeclaration2118 = new BitSet(new long[]{0x0000005FEA0D07F0L});
    public static final BitSet FOLLOW_27_in_rulesignatureDeclaration2131 = new BitSet(new long[]{0x00000040020520F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulesignatureDeclaration2148 = new BitSet(new long[]{0x00000040020520F0L});
    public static final BitSet FOLLOW_13_in_rulesignatureDeclaration2161 = new BitSet(new long[]{0x00000040020500F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulesignatureDeclaration2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigDefinitions_in_entryRulesigDefinitions2212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesigDefinitions2222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGID_in_rulesigDefinitions2269 = new BitSet(new long[]{0x00000040121700F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulesigDefinitions2286 = new BitSet(new long[]{0x00000040121700F0L});
    public static final BitSet FOLLOW_20_in_rulesigDefinitions2300 = new BitSet(new long[]{0x0000004003FF27F0L});
    public static final BitSet FOLLOW_28_in_rulesigDefinitions2318 = new BitSet(new long[]{0x0000004003FF27F0L});
    public static final BitSet FOLLOW_17_in_rulesigDefinitions2336 = new BitSet(new long[]{0x0000004003FF27F0L});
    public static final BitSet FOLLOW_ruleSOMETHING_in_rulesigDefinitions2354 = new BitSet(new long[]{0x0000004003FF27F0L});
    public static final BitSet FOLLOW_13_in_rulesigDefinitions2367 = new BitSet(new long[]{0x00000040020500F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulesigDefinitions2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulesigDefinitions2402 = new BitSet(new long[]{0x00000040020509F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulesigDefinitions2419 = new BitSet(new long[]{0x00000040020509F0L});
    public static final BitSet FOLLOW_ruleNAMESPACE_in_rulesigDefinitions2441 = new BitSet(new long[]{0x00000060020520F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulesigDefinitions2459 = new BitSet(new long[]{0x00000060020500F0L});
    public static final BitSet FOLLOW_ruleincludeOps_in_rulesigDefinitions2476 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulesigDefinitions2489 = new BitSet(new long[]{0x00000040020500F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulesigDefinitions2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulesigDefinitions2524 = new BitSet(new long[]{0x00000040020D07F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulesigDefinitions2541 = new BitSet(new long[]{0x00000040020D07F0L});
    public static final BitSet FOLLOW_ruleGID_in_rulesigDefinitions2563 = new BitSet(new long[]{0x00000040021500F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulesigDefinitions2580 = new BitSet(new long[]{0x00000040021500F0L});
    public static final BitSet FOLLOW_20_in_rulesigDefinitions2593 = new BitSet(new long[]{0x0000006003FF27F0L});
    public static final BitSet FOLLOW_ruleSOMETHING_in_rulesigDefinitions2610 = new BitSet(new long[]{0x0000006003FF27F0L});
    public static final BitSet FOLLOW_ruleincludeOps_in_rulesigDefinitions2628 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulesigDefinitions2641 = new BitSet(new long[]{0x00000040020500F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulesigDefinitions2657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rulesigDefinitions2684 = new BitSet(new long[]{0x0000004003FF27F0L});
    public static final BitSet FOLLOW_32_in_rulesigDefinitions2713 = new BitSet(new long[]{0x0000004003FF27F0L});
    public static final BitSet FOLLOW_33_in_rulesigDefinitions2742 = new BitSet(new long[]{0x0000004003FF27F0L});
    public static final BitSet FOLLOW_34_in_rulesigDefinitions2771 = new BitSet(new long[]{0x0000004003FF27F0L});
    public static final BitSet FOLLOW_35_in_rulesigDefinitions2800 = new BitSet(new long[]{0x0000004003FF27F0L});
    public static final BitSet FOLLOW_36_in_rulesigDefinitions2829 = new BitSet(new long[]{0x0000004003FF27F0L});
    public static final BitSet FOLLOW_ruleSOMETHING_in_rulesigDefinitions2862 = new BitSet(new long[]{0x0000004003FF27F0L});
    public static final BitSet FOLLOW_13_in_rulesigDefinitions2875 = new BitSet(new long[]{0x00000040020500F0L});
    public static final BitSet FOLLOW_ruleWS_in_rulesigDefinitions2891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJUSTSPACE_in_rulesigDefinitions2919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleincludeOps_in_entryRuleincludeOps2955 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleincludeOps2966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleincludeOps3004 = new BitSet(new long[]{0x0000004003FF27F2L});
    public static final BitSet FOLLOW_ruleSOMETHING_in_ruleincludeOps3027 = new BitSet(new long[]{0x0000004003FF27F2L});
    public static final BitSet FOLLOW_ruleviewDeclaration_in_entryRuleviewDeclaration3076 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleviewDeclaration3086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleviewDeclaration3123 = new BitSet(new long[]{0x00000040020D07F0L});
    public static final BitSet FOLLOW_ruleWS_in_ruleviewDeclaration3140 = new BitSet(new long[]{0x00000040020D07F0L});
    public static final BitSet FOLLOW_ruleGID_in_ruleviewDeclaration3162 = new BitSet(new long[]{0x00000040021500F0L});
    public static final BitSet FOLLOW_ruleWS_in_ruleviewDeclaration3179 = new BitSet(new long[]{0x00000040021500F0L});
    public static final BitSet FOLLOW_20_in_ruleviewDeclaration3192 = new BitSet(new long[]{0x00000040020509F0L});
    public static final BitSet FOLLOW_ruleWS_in_ruleviewDeclaration3209 = new BitSet(new long[]{0x00000040020509F0L});
    public static final BitSet FOLLOW_ruleNAMESPACE_in_ruleviewDeclaration3231 = new BitSet(new long[]{0x00000040024500F0L});
    public static final BitSet FOLLOW_ruleWS_in_ruleviewDeclaration3248 = new BitSet(new long[]{0x00000040024500F0L});
    public static final BitSet FOLLOW_22_in_ruleviewDeclaration3261 = new BitSet(new long[]{0x00000040020509F0L});
    public static final BitSet FOLLOW_ruleWS_in_ruleviewDeclaration3278 = new BitSet(new long[]{0x00000040020509F0L});
    public static final BitSet FOLLOW_ruleNAMESPACE_in_ruleviewDeclaration3300 = new BitSet(new long[]{0x00000040020700F0L});
    public static final BitSet FOLLOW_ruleWS_in_ruleviewDeclaration3317 = new BitSet(new long[]{0x00000040020700F0L});
    public static final BitSet FOLLOW_17_in_ruleviewDeclaration3330 = new BitSet(new long[]{0x00000040060500F0L});
    public static final BitSet FOLLOW_ruleWS_in_ruleviewDeclaration3347 = new BitSet(new long[]{0x00000040060500F0L});
    public static final BitSet FOLLOW_26_in_ruleviewDeclaration3360 = new BitSet(new long[]{0x0000005FEA0D07F0L});
    public static final BitSet FOLLOW_rulesigDefinitions_in_ruleviewDeclaration3381 = new BitSet(new long[]{0x0000005FEA0D07F0L});
    public static final BitSet FOLLOW_27_in_ruleviewDeclaration3394 = new BitSet(new long[]{0x00000040020520F0L});
    public static final BitSet FOLLOW_ruleWS_in_ruleviewDeclaration3411 = new BitSet(new long[]{0x00000040020520F0L});
    public static final BitSet FOLLOW_13_in_ruleviewDeclaration3424 = new BitSet(new long[]{0x00000040020500F0L});
    public static final BitSet FOLLOW_ruleWS_in_ruleviewDeclaration3440 = new BitSet(new long[]{0x0000000000000002L});

}