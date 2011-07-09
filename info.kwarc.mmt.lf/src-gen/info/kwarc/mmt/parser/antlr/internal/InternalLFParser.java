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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_WS", "RULE_ML_COMMENT", "RULE_ML2_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'.'", "'://'", "'/'", "'\"'", "'%read'", "'%namespace'", "'='", "'%sig'", "'{'", "'}'", "':'", "':='", "'%include'", "'%struct'", "'%view'", "'->'"
    };
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_declarations_0_1= rulenamespaceDeclaration | lv_declarations_0_2= rulesignatureDeclaration | lv_declarations_0_3= rulereadDeclaration | lv_declarations_0_4= ruleviewDeclaration ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_declarations_0_1 = null;

        EObject lv_declarations_0_2 = null;

        EObject lv_declarations_0_3 = null;

        EObject lv_declarations_0_4 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:79:28: ( ( ( (lv_declarations_0_1= rulenamespaceDeclaration | lv_declarations_0_2= rulesignatureDeclaration | lv_declarations_0_3= rulereadDeclaration | lv_declarations_0_4= ruleviewDeclaration ) ) )* )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:80:1: ( ( (lv_declarations_0_1= rulenamespaceDeclaration | lv_declarations_0_2= rulesignatureDeclaration | lv_declarations_0_3= rulereadDeclaration | lv_declarations_0_4= ruleviewDeclaration ) ) )*
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:80:1: ( ( (lv_declarations_0_1= rulenamespaceDeclaration | lv_declarations_0_2= rulesignatureDeclaration | lv_declarations_0_3= rulereadDeclaration | lv_declarations_0_4= ruleviewDeclaration ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=15 && LA2_0<=16)||LA2_0==18||LA2_0==25) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:81:1: ( (lv_declarations_0_1= rulenamespaceDeclaration | lv_declarations_0_2= rulesignatureDeclaration | lv_declarations_0_3= rulereadDeclaration | lv_declarations_0_4= ruleviewDeclaration ) )
            	    {
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:81:1: ( (lv_declarations_0_1= rulenamespaceDeclaration | lv_declarations_0_2= rulesignatureDeclaration | lv_declarations_0_3= rulereadDeclaration | lv_declarations_0_4= ruleviewDeclaration ) )
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:82:1: (lv_declarations_0_1= rulenamespaceDeclaration | lv_declarations_0_2= rulesignatureDeclaration | lv_declarations_0_3= rulereadDeclaration | lv_declarations_0_4= ruleviewDeclaration )
            	    {
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:82:1: (lv_declarations_0_1= rulenamespaceDeclaration | lv_declarations_0_2= rulesignatureDeclaration | lv_declarations_0_3= rulereadDeclaration | lv_declarations_0_4= ruleviewDeclaration )
            	    int alt1=4;
            	    switch ( input.LA(1) ) {
            	    case 16:
            	        {
            	        alt1=1;
            	        }
            	        break;
            	    case 18:
            	        {
            	        alt1=2;
            	        }
            	        break;
            	    case 15:
            	        {
            	        alt1=3;
            	        }
            	        break;
            	    case 25:
            	        {
            	        alt1=4;
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
            	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:113:8: lv_declarations_0_3= rulereadDeclaration
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getModelAccess().getDeclarationsReadDeclarationParserRuleCall_0_2()); 
            	            	    
            	            pushFollow(FOLLOW_rulereadDeclaration_in_ruleModel170);
            	            lv_declarations_0_3=rulereadDeclaration();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"declarations",
            	                    		lv_declarations_0_3, 
            	                    		"readDeclaration");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:128:8: lv_declarations_0_4= ruleviewDeclaration
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getModelAccess().getDeclarationsViewDeclarationParserRuleCall_0_3()); 
            	            	    
            	            pushFollow(FOLLOW_ruleviewDeclaration_in_ruleModel189);
            	            lv_declarations_0_4=ruleviewDeclaration();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"declarations",
            	                    		lv_declarations_0_4, 
            	                    		"viewDeclaration");
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


    // $ANTLR start "entryRuleNAMESPACE"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:154:1: entryRuleNAMESPACE returns [String current=null] : iv_ruleNAMESPACE= ruleNAMESPACE EOF ;
    public final String entryRuleNAMESPACE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNAMESPACE = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:155:2: (iv_ruleNAMESPACE= ruleNAMESPACE EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:156:2: iv_ruleNAMESPACE= ruleNAMESPACE EOF
            {
             newCompositeNode(grammarAccess.getNAMESPACERule()); 
            pushFollow(FOLLOW_ruleNAMESPACE_in_entryRuleNAMESPACE229);
            iv_ruleNAMESPACE=ruleNAMESPACE();

            state._fsp--;

             current =iv_ruleNAMESPACE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNAMESPACE240); 

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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:163:1: ruleNAMESPACE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleNAMESPACE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:166:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:167:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:167:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:167:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNAMESPACE280); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getNAMESPACEAccess().getIDTerminalRuleCall_0()); 
                
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:174:1: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    int LA3_2 = input.LA(2);

                    if ( (LA3_2==RULE_ID) ) {
                        int LA3_3 = input.LA(3);

                        if ( (LA3_3==EOF||LA3_3==11||(LA3_3>=13 && LA3_3<=14)||LA3_3==17||LA3_3==26) ) {
                            alt3=1;
                        }


                    }


                }


                switch (alt3) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:175:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,11,FOLLOW_11_in_ruleNAMESPACE299); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getNAMESPACEAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNAMESPACE314); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getNAMESPACEAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop3;
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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:195:1: entryRuleURI returns [String current=null] : iv_ruleURI= ruleURI EOF ;
    public final String entryRuleURI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURI = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:196:2: (iv_ruleURI= ruleURI EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:197:2: iv_ruleURI= ruleURI EOF
            {
             newCompositeNode(grammarAccess.getURIRule()); 
            pushFollow(FOLLOW_ruleURI_in_entryRuleURI362);
            iv_ruleURI=ruleURI();

            state._fsp--;

             current =iv_ruleURI.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURI373); 

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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:204:1: ruleURI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= '://' )? this_NAMESPACE_2= ruleNAMESPACE (kw= '/' this_ID_4= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleURI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_4=null;
        AntlrDatatypeRuleToken this_NAMESPACE_2 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:207:28: ( ( (this_ID_0= RULE_ID kw= '://' )? this_NAMESPACE_2= ruleNAMESPACE (kw= '/' this_ID_4= RULE_ID )* ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:208:1: ( (this_ID_0= RULE_ID kw= '://' )? this_NAMESPACE_2= ruleNAMESPACE (kw= '/' this_ID_4= RULE_ID )* )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:208:1: ( (this_ID_0= RULE_ID kw= '://' )? this_NAMESPACE_2= ruleNAMESPACE (kw= '/' this_ID_4= RULE_ID )* )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:208:2: (this_ID_0= RULE_ID kw= '://' )? this_NAMESPACE_2= ruleNAMESPACE (kw= '/' this_ID_4= RULE_ID )*
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:208:2: (this_ID_0= RULE_ID kw= '://' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==12) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:208:7: this_ID_0= RULE_ID kw= '://'
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleURI414); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getURIAccess().getIDTerminalRuleCall_0_0()); 
                        
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleURI432); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getURIAccess().getColonSolidusSolidusKeyword_0_1()); 
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getURIAccess().getNAMESPACEParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleNAMESPACE_in_ruleURI456);
            this_NAMESPACE_2=ruleNAMESPACE();

            state._fsp--;


            		current.merge(this_NAMESPACE_2);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:232:1: (kw= '/' this_ID_4= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:233:2: kw= '/' this_ID_4= RULE_ID
            	    {
            	    kw=(Token)match(input,13,FOLLOW_13_in_ruleURI475); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getURIAccess().getSolidusKeyword_2_0()); 
            	        
            	    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleURI490); 

            	    		current.merge(this_ID_4);
            	        
            	     
            	        newLeafNode(this_ID_4, grammarAccess.getURIAccess().getIDTerminalRuleCall_2_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleURI"


    // $ANTLR start "entryRuleURISTRING"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:253:1: entryRuleURISTRING returns [String current=null] : iv_ruleURISTRING= ruleURISTRING EOF ;
    public final String entryRuleURISTRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURISTRING = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:254:2: (iv_ruleURISTRING= ruleURISTRING EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:255:2: iv_ruleURISTRING= ruleURISTRING EOF
            {
             newCompositeNode(grammarAccess.getURISTRINGRule()); 
            pushFollow(FOLLOW_ruleURISTRING_in_entryRuleURISTRING538);
            iv_ruleURISTRING=ruleURISTRING();

            state._fsp--;

             current =iv_ruleURISTRING.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURISTRING549); 

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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:262:1: ruleURISTRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\"' this_URI_1= ruleURI kw= '\"' ) ;
    public final AntlrDatatypeRuleToken ruleURISTRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_URI_1 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:265:28: ( (kw= '\"' this_URI_1= ruleURI kw= '\"' ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:266:1: (kw= '\"' this_URI_1= ruleURI kw= '\"' )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:266:1: (kw= '\"' this_URI_1= ruleURI kw= '\"' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:267:2: kw= '\"' this_URI_1= ruleURI kw= '\"'
            {
            kw=(Token)match(input,14,FOLLOW_14_in_ruleURISTRING587); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getURISTRINGAccess().getQuotationMarkKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getURISTRINGAccess().getURIParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleURI_in_ruleURISTRING609);
            this_URI_1=ruleURI();

            state._fsp--;


            		current.merge(this_URI_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,14,FOLLOW_14_in_ruleURISTRING627); 

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


    // $ANTLR start "entryRulereadDeclaration"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:297:1: entryRulereadDeclaration returns [EObject current=null] : iv_rulereadDeclaration= rulereadDeclaration EOF ;
    public final EObject entryRulereadDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulereadDeclaration = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:298:2: (iv_rulereadDeclaration= rulereadDeclaration EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:299:2: iv_rulereadDeclaration= rulereadDeclaration EOF
            {
             newCompositeNode(grammarAccess.getReadDeclarationRule()); 
            pushFollow(FOLLOW_rulereadDeclaration_in_entryRulereadDeclaration667);
            iv_rulereadDeclaration=rulereadDeclaration();

            state._fsp--;

             current =iv_rulereadDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulereadDeclaration677); 

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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:306:1: rulereadDeclaration returns [EObject current=null] : (otherlv_0= '%read' ( (lv_file_1_0= ruleURISTRING ) ) otherlv_2= '.' ) ;
    public final EObject rulereadDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_file_1_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:309:28: ( (otherlv_0= '%read' ( (lv_file_1_0= ruleURISTRING ) ) otherlv_2= '.' ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:310:1: (otherlv_0= '%read' ( (lv_file_1_0= ruleURISTRING ) ) otherlv_2= '.' )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:310:1: (otherlv_0= '%read' ( (lv_file_1_0= ruleURISTRING ) ) otherlv_2= '.' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:310:3: otherlv_0= '%read' ( (lv_file_1_0= ruleURISTRING ) ) otherlv_2= '.'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_rulereadDeclaration714); 

                	newLeafNode(otherlv_0, grammarAccess.getReadDeclarationAccess().getReadKeyword_0());
                
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:314:1: ( (lv_file_1_0= ruleURISTRING ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:315:1: (lv_file_1_0= ruleURISTRING )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:315:1: (lv_file_1_0= ruleURISTRING )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:316:3: lv_file_1_0= ruleURISTRING
            {
             
            	        newCompositeNode(grammarAccess.getReadDeclarationAccess().getFileURISTRINGParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleURISTRING_in_rulereadDeclaration735);
            lv_file_1_0=ruleURISTRING();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReadDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"file",
                    		lv_file_1_0, 
                    		"URISTRING");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_11_in_rulereadDeclaration747); 

                	newLeafNode(otherlv_2, grammarAccess.getReadDeclarationAccess().getFullStopKeyword_2());
                

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


    // $ANTLR start "entryRulenamespaceDeclaration"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:344:1: entryRulenamespaceDeclaration returns [EObject current=null] : iv_rulenamespaceDeclaration= rulenamespaceDeclaration EOF ;
    public final EObject entryRulenamespaceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenamespaceDeclaration = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:345:2: (iv_rulenamespaceDeclaration= rulenamespaceDeclaration EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:346:2: iv_rulenamespaceDeclaration= rulenamespaceDeclaration EOF
            {
             newCompositeNode(grammarAccess.getNamespaceDeclarationRule()); 
            pushFollow(FOLLOW_rulenamespaceDeclaration_in_entryRulenamespaceDeclaration783);
            iv_rulenamespaceDeclaration=rulenamespaceDeclaration();

            state._fsp--;

             current =iv_rulenamespaceDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenamespaceDeclaration793); 

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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:353:1: rulenamespaceDeclaration returns [EObject current=null] : (otherlv_0= '%namespace' ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )? ( (lv_uri_3_0= ruleURISTRING ) ) otherlv_4= '.' ) ;
    public final EObject rulenamespaceDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_uri_3_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:356:28: ( (otherlv_0= '%namespace' ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )? ( (lv_uri_3_0= ruleURISTRING ) ) otherlv_4= '.' ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:357:1: (otherlv_0= '%namespace' ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )? ( (lv_uri_3_0= ruleURISTRING ) ) otherlv_4= '.' )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:357:1: (otherlv_0= '%namespace' ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )? ( (lv_uri_3_0= ruleURISTRING ) ) otherlv_4= '.' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:357:3: otherlv_0= '%namespace' ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )? ( (lv_uri_3_0= ruleURISTRING ) ) otherlv_4= '.'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_rulenamespaceDeclaration830); 

                	newLeafNode(otherlv_0, grammarAccess.getNamespaceDeclarationAccess().getNamespaceKeyword_0());
                
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:361:1: ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:361:2: ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '='
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:361:2: ( (lv_name_1_0= RULE_ID ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:362:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:362:1: (lv_name_1_0= RULE_ID )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:363:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulenamespaceDeclaration848); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getNamespaceDeclarationAccess().getNameIDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNamespaceDeclarationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_rulenamespaceDeclaration865); 

                        	newLeafNode(otherlv_2, grammarAccess.getNamespaceDeclarationAccess().getEqualsSignKeyword_1_1());
                        

                    }
                    break;

            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:383:3: ( (lv_uri_3_0= ruleURISTRING ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:384:1: (lv_uri_3_0= ruleURISTRING )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:384:1: (lv_uri_3_0= ruleURISTRING )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:385:3: lv_uri_3_0= ruleURISTRING
            {
             
            	        newCompositeNode(grammarAccess.getNamespaceDeclarationAccess().getUriURISTRINGParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleURISTRING_in_rulenamespaceDeclaration888);
            lv_uri_3_0=ruleURISTRING();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNamespaceDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"uri",
                    		lv_uri_3_0, 
                    		"URISTRING");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,11,FOLLOW_11_in_rulenamespaceDeclaration900); 

                	newLeafNode(otherlv_4, grammarAccess.getNamespaceDeclarationAccess().getFullStopKeyword_3());
                

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


    // $ANTLR start "entryRulesignatureDeclaration"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:413:1: entryRulesignatureDeclaration returns [EObject current=null] : iv_rulesignatureDeclaration= rulesignatureDeclaration EOF ;
    public final EObject entryRulesignatureDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesignatureDeclaration = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:414:2: (iv_rulesignatureDeclaration= rulesignatureDeclaration EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:415:2: iv_rulesignatureDeclaration= rulesignatureDeclaration EOF
            {
             newCompositeNode(grammarAccess.getSignatureDeclarationRule()); 
            pushFollow(FOLLOW_rulesignatureDeclaration_in_entryRulesignatureDeclaration936);
            iv_rulesignatureDeclaration=rulesignatureDeclaration();

            state._fsp--;

             current =iv_rulesignatureDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesignatureDeclaration946); 

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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:422:1: rulesignatureDeclaration returns [EObject current=null] : (otherlv_0= '%sig' ( (lv_sigName_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '{' ( (lv_sigDefinitions_4_0= rulesigDefinitions ) )* otherlv_5= '}' otherlv_6= '.' ) ;
    public final EObject rulesignatureDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_sigName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_sigDefinitions_4_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:425:28: ( (otherlv_0= '%sig' ( (lv_sigName_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '{' ( (lv_sigDefinitions_4_0= rulesigDefinitions ) )* otherlv_5= '}' otherlv_6= '.' ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:426:1: (otherlv_0= '%sig' ( (lv_sigName_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '{' ( (lv_sigDefinitions_4_0= rulesigDefinitions ) )* otherlv_5= '}' otherlv_6= '.' )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:426:1: (otherlv_0= '%sig' ( (lv_sigName_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '{' ( (lv_sigDefinitions_4_0= rulesigDefinitions ) )* otherlv_5= '}' otherlv_6= '.' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:426:3: otherlv_0= '%sig' ( (lv_sigName_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '{' ( (lv_sigDefinitions_4_0= rulesigDefinitions ) )* otherlv_5= '}' otherlv_6= '.'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_rulesignatureDeclaration983); 

                	newLeafNode(otherlv_0, grammarAccess.getSignatureDeclarationAccess().getSigKeyword_0());
                
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:430:1: ( (lv_sigName_1_0= RULE_ID ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:431:1: (lv_sigName_1_0= RULE_ID )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:431:1: (lv_sigName_1_0= RULE_ID )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:432:3: lv_sigName_1_0= RULE_ID
            {
            lv_sigName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulesignatureDeclaration1000); 

            			newLeafNode(lv_sigName_1_0, grammarAccess.getSignatureDeclarationAccess().getSigNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSignatureDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"sigName",
                    		lv_sigName_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_rulesignatureDeclaration1017); 

                	newLeafNode(otherlv_2, grammarAccess.getSignatureDeclarationAccess().getEqualsSignKeyword_2());
                
            otherlv_3=(Token)match(input,19,FOLLOW_19_in_rulesignatureDeclaration1029); 

                	newLeafNode(otherlv_3, grammarAccess.getSignatureDeclarationAccess().getLeftCurlyBracketKeyword_3());
                
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:456:1: ( (lv_sigDefinitions_4_0= rulesigDefinitions ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||(LA7_0>=23 && LA7_0<=24)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:457:1: (lv_sigDefinitions_4_0= rulesigDefinitions )
            	    {
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:457:1: (lv_sigDefinitions_4_0= rulesigDefinitions )
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:458:3: lv_sigDefinitions_4_0= rulesigDefinitions
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSignatureDeclarationAccess().getSigDefinitionsSigDefinitionsParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulesigDefinitions_in_rulesignatureDeclaration1050);
            	    lv_sigDefinitions_4_0=rulesigDefinitions();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSignatureDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sigDefinitions",
            	            		lv_sigDefinitions_4_0, 
            	            		"sigDefinitions");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_rulesignatureDeclaration1063); 

                	newLeafNode(otherlv_5, grammarAccess.getSignatureDeclarationAccess().getRightCurlyBracketKeyword_5());
                
            otherlv_6=(Token)match(input,11,FOLLOW_11_in_rulesignatureDeclaration1075); 

                	newLeafNode(otherlv_6, grammarAccess.getSignatureDeclarationAccess().getFullStopKeyword_6());
                

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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:490:1: entryRulesigDefinitions returns [EObject current=null] : iv_rulesigDefinitions= rulesigDefinitions EOF ;
    public final EObject entryRulesigDefinitions() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesigDefinitions = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:491:2: (iv_rulesigDefinitions= rulesigDefinitions EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:492:2: iv_rulesigDefinitions= rulesigDefinitions EOF
            {
             newCompositeNode(grammarAccess.getSigDefinitionsRule()); 
            pushFollow(FOLLOW_rulesigDefinitions_in_entryRulesigDefinitions1111);
            iv_rulesigDefinitions=rulesigDefinitions();

            state._fsp--;

             current =iv_rulesigDefinitions; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesigDefinitions1121); 

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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:499:1: rulesigDefinitions returns [EObject current=null] : ( ( ( (lv_symbName_0_0= RULE_ID ) ) (otherlv_1= ':' | otherlv_2= ':=' ) ( ( (lv_type_3_0= RULE_ID ) ) otherlv_4= '=' )? ruleNAMESPACE otherlv_6= '.' ) | (otherlv_7= '%include' ( (lv_namespace_8_0= ruleNAMESPACE ) ) otherlv_9= '.' ) | (otherlv_10= '%struct' ( (lv_structName_11_0= RULE_ID ) ) otherlv_12= ':' ( (lv_namespace_13_0= ruleNAMESPACE ) ) otherlv_14= '.' ) ) ;
    public final EObject rulesigDefinitions() throws RecognitionException {
        EObject current = null;

        Token lv_symbName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_structName_11_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_namespace_8_0 = null;

        AntlrDatatypeRuleToken lv_namespace_13_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:502:28: ( ( ( ( (lv_symbName_0_0= RULE_ID ) ) (otherlv_1= ':' | otherlv_2= ':=' ) ( ( (lv_type_3_0= RULE_ID ) ) otherlv_4= '=' )? ruleNAMESPACE otherlv_6= '.' ) | (otherlv_7= '%include' ( (lv_namespace_8_0= ruleNAMESPACE ) ) otherlv_9= '.' ) | (otherlv_10= '%struct' ( (lv_structName_11_0= RULE_ID ) ) otherlv_12= ':' ( (lv_namespace_13_0= ruleNAMESPACE ) ) otherlv_14= '.' ) ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:503:1: ( ( ( (lv_symbName_0_0= RULE_ID ) ) (otherlv_1= ':' | otherlv_2= ':=' ) ( ( (lv_type_3_0= RULE_ID ) ) otherlv_4= '=' )? ruleNAMESPACE otherlv_6= '.' ) | (otherlv_7= '%include' ( (lv_namespace_8_0= ruleNAMESPACE ) ) otherlv_9= '.' ) | (otherlv_10= '%struct' ( (lv_structName_11_0= RULE_ID ) ) otherlv_12= ':' ( (lv_namespace_13_0= ruleNAMESPACE ) ) otherlv_14= '.' ) )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:503:1: ( ( ( (lv_symbName_0_0= RULE_ID ) ) (otherlv_1= ':' | otherlv_2= ':=' ) ( ( (lv_type_3_0= RULE_ID ) ) otherlv_4= '=' )? ruleNAMESPACE otherlv_6= '.' ) | (otherlv_7= '%include' ( (lv_namespace_8_0= ruleNAMESPACE ) ) otherlv_9= '.' ) | (otherlv_10= '%struct' ( (lv_structName_11_0= RULE_ID ) ) otherlv_12= ':' ( (lv_namespace_13_0= ruleNAMESPACE ) ) otherlv_14= '.' ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt10=1;
                }
                break;
            case 23:
                {
                alt10=2;
                }
                break;
            case 24:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:503:2: ( ( (lv_symbName_0_0= RULE_ID ) ) (otherlv_1= ':' | otherlv_2= ':=' ) ( ( (lv_type_3_0= RULE_ID ) ) otherlv_4= '=' )? ruleNAMESPACE otherlv_6= '.' )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:503:2: ( ( (lv_symbName_0_0= RULE_ID ) ) (otherlv_1= ':' | otherlv_2= ':=' ) ( ( (lv_type_3_0= RULE_ID ) ) otherlv_4= '=' )? ruleNAMESPACE otherlv_6= '.' )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:503:3: ( (lv_symbName_0_0= RULE_ID ) ) (otherlv_1= ':' | otherlv_2= ':=' ) ( ( (lv_type_3_0= RULE_ID ) ) otherlv_4= '=' )? ruleNAMESPACE otherlv_6= '.'
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:503:3: ( (lv_symbName_0_0= RULE_ID ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:504:1: (lv_symbName_0_0= RULE_ID )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:504:1: (lv_symbName_0_0= RULE_ID )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:505:3: lv_symbName_0_0= RULE_ID
                    {
                    lv_symbName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulesigDefinitions1164); 

                    			newLeafNode(lv_symbName_0_0, grammarAccess.getSigDefinitionsAccess().getSymbNameIDTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSigDefinitionsRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"symbName",
                            		lv_symbName_0_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:521:2: (otherlv_1= ':' | otherlv_2= ':=' )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==21) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==22) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:521:4: otherlv_1= ':'
                            {
                            otherlv_1=(Token)match(input,21,FOLLOW_21_in_rulesigDefinitions1182); 

                                	newLeafNode(otherlv_1, grammarAccess.getSigDefinitionsAccess().getColonKeyword_0_1_0());
                                

                            }
                            break;
                        case 2 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:526:7: otherlv_2= ':='
                            {
                            otherlv_2=(Token)match(input,22,FOLLOW_22_in_rulesigDefinitions1200); 

                                	newLeafNode(otherlv_2, grammarAccess.getSigDefinitionsAccess().getColonEqualsSignKeyword_0_1_1());
                                

                            }
                            break;

                    }

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:530:2: ( ( (lv_type_3_0= RULE_ID ) ) otherlv_4= '=' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_ID) ) {
                        int LA9_1 = input.LA(2);

                        if ( (LA9_1==17) ) {
                            alt9=1;
                        }
                    }
                    switch (alt9) {
                        case 1 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:530:3: ( (lv_type_3_0= RULE_ID ) ) otherlv_4= '='
                            {
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:530:3: ( (lv_type_3_0= RULE_ID ) )
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:531:1: (lv_type_3_0= RULE_ID )
                            {
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:531:1: (lv_type_3_0= RULE_ID )
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:532:3: lv_type_3_0= RULE_ID
                            {
                            lv_type_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulesigDefinitions1219); 

                            			newLeafNode(lv_type_3_0, grammarAccess.getSigDefinitionsAccess().getTypeIDTerminalRuleCall_0_2_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getSigDefinitionsRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"type",
                                    		lv_type_3_0, 
                                    		"ID");
                            	    

                            }


                            }

                            otherlv_4=(Token)match(input,17,FOLLOW_17_in_rulesigDefinitions1236); 

                                	newLeafNode(otherlv_4, grammarAccess.getSigDefinitionsAccess().getEqualsSignKeyword_0_2_1());
                                

                            }
                            break;

                    }

                     
                            newCompositeNode(grammarAccess.getSigDefinitionsAccess().getNAMESPACEParserRuleCall_0_3()); 
                        
                    pushFollow(FOLLOW_ruleNAMESPACE_in_rulesigDefinitions1254);
                    ruleNAMESPACE();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                    otherlv_6=(Token)match(input,11,FOLLOW_11_in_rulesigDefinitions1265); 

                        	newLeafNode(otherlv_6, grammarAccess.getSigDefinitionsAccess().getFullStopKeyword_0_4());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:565:6: (otherlv_7= '%include' ( (lv_namespace_8_0= ruleNAMESPACE ) ) otherlv_9= '.' )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:565:6: (otherlv_7= '%include' ( (lv_namespace_8_0= ruleNAMESPACE ) ) otherlv_9= '.' )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:565:8: otherlv_7= '%include' ( (lv_namespace_8_0= ruleNAMESPACE ) ) otherlv_9= '.'
                    {
                    otherlv_7=(Token)match(input,23,FOLLOW_23_in_rulesigDefinitions1285); 

                        	newLeafNode(otherlv_7, grammarAccess.getSigDefinitionsAccess().getIncludeKeyword_1_0());
                        
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:569:1: ( (lv_namespace_8_0= ruleNAMESPACE ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:570:1: (lv_namespace_8_0= ruleNAMESPACE )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:570:1: (lv_namespace_8_0= ruleNAMESPACE )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:571:3: lv_namespace_8_0= ruleNAMESPACE
                    {
                     
                    	        newCompositeNode(grammarAccess.getSigDefinitionsAccess().getNamespaceNAMESPACEParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNAMESPACE_in_rulesigDefinitions1306);
                    lv_namespace_8_0=ruleNAMESPACE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSigDefinitionsRule());
                    	        }
                           		set(
                           			current, 
                           			"namespace",
                            		lv_namespace_8_0, 
                            		"NAMESPACE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,11,FOLLOW_11_in_rulesigDefinitions1318); 

                        	newLeafNode(otherlv_9, grammarAccess.getSigDefinitionsAccess().getFullStopKeyword_1_2());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:592:6: (otherlv_10= '%struct' ( (lv_structName_11_0= RULE_ID ) ) otherlv_12= ':' ( (lv_namespace_13_0= ruleNAMESPACE ) ) otherlv_14= '.' )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:592:6: (otherlv_10= '%struct' ( (lv_structName_11_0= RULE_ID ) ) otherlv_12= ':' ( (lv_namespace_13_0= ruleNAMESPACE ) ) otherlv_14= '.' )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:592:8: otherlv_10= '%struct' ( (lv_structName_11_0= RULE_ID ) ) otherlv_12= ':' ( (lv_namespace_13_0= ruleNAMESPACE ) ) otherlv_14= '.'
                    {
                    otherlv_10=(Token)match(input,24,FOLLOW_24_in_rulesigDefinitions1338); 

                        	newLeafNode(otherlv_10, grammarAccess.getSigDefinitionsAccess().getStructKeyword_2_0());
                        
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:596:1: ( (lv_structName_11_0= RULE_ID ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:597:1: (lv_structName_11_0= RULE_ID )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:597:1: (lv_structName_11_0= RULE_ID )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:598:3: lv_structName_11_0= RULE_ID
                    {
                    lv_structName_11_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulesigDefinitions1355); 

                    			newLeafNode(lv_structName_11_0, grammarAccess.getSigDefinitionsAccess().getStructNameIDTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSigDefinitionsRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"structName",
                            		lv_structName_11_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_12=(Token)match(input,21,FOLLOW_21_in_rulesigDefinitions1372); 

                        	newLeafNode(otherlv_12, grammarAccess.getSigDefinitionsAccess().getColonKeyword_2_2());
                        
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:618:1: ( (lv_namespace_13_0= ruleNAMESPACE ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:619:1: (lv_namespace_13_0= ruleNAMESPACE )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:619:1: (lv_namespace_13_0= ruleNAMESPACE )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:620:3: lv_namespace_13_0= ruleNAMESPACE
                    {
                     
                    	        newCompositeNode(grammarAccess.getSigDefinitionsAccess().getNamespaceNAMESPACEParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNAMESPACE_in_rulesigDefinitions1393);
                    lv_namespace_13_0=ruleNAMESPACE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSigDefinitionsRule());
                    	        }
                           		set(
                           			current, 
                           			"namespace",
                            		lv_namespace_13_0, 
                            		"NAMESPACE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_14=(Token)match(input,11,FOLLOW_11_in_rulesigDefinitions1405); 

                        	newLeafNode(otherlv_14, grammarAccess.getSigDefinitionsAccess().getFullStopKeyword_2_4());
                        

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


    // $ANTLR start "entryRuleviewDeclaration"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:650:1: entryRuleviewDeclaration returns [EObject current=null] : iv_ruleviewDeclaration= ruleviewDeclaration EOF ;
    public final EObject entryRuleviewDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleviewDeclaration = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:651:2: (iv_ruleviewDeclaration= ruleviewDeclaration EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:652:2: iv_ruleviewDeclaration= ruleviewDeclaration EOF
            {
             newCompositeNode(grammarAccess.getViewDeclarationRule()); 
            pushFollow(FOLLOW_ruleviewDeclaration_in_entryRuleviewDeclaration1444);
            iv_ruleviewDeclaration=ruleviewDeclaration();

            state._fsp--;

             current =iv_ruleviewDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleviewDeclaration1454); 

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
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:659:1: ruleviewDeclaration returns [EObject current=null] : (otherlv_0= '%view' ( (lv_viewID_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_from_3_0= ruleNAMESPACE ) ) otherlv_4= '->' ( (lv_to_5_0= ruleNAMESPACE ) ) otherlv_6= '=' otherlv_7= '{' ( (lv_viewDefinitions_8_0= rulesigDefinitions ) ) otherlv_9= '}' otherlv_10= '.' ) ;
    public final EObject ruleviewDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_viewID_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_from_3_0 = null;

        AntlrDatatypeRuleToken lv_to_5_0 = null;

        EObject lv_viewDefinitions_8_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:662:28: ( (otherlv_0= '%view' ( (lv_viewID_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_from_3_0= ruleNAMESPACE ) ) otherlv_4= '->' ( (lv_to_5_0= ruleNAMESPACE ) ) otherlv_6= '=' otherlv_7= '{' ( (lv_viewDefinitions_8_0= rulesigDefinitions ) ) otherlv_9= '}' otherlv_10= '.' ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:663:1: (otherlv_0= '%view' ( (lv_viewID_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_from_3_0= ruleNAMESPACE ) ) otherlv_4= '->' ( (lv_to_5_0= ruleNAMESPACE ) ) otherlv_6= '=' otherlv_7= '{' ( (lv_viewDefinitions_8_0= rulesigDefinitions ) ) otherlv_9= '}' otherlv_10= '.' )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:663:1: (otherlv_0= '%view' ( (lv_viewID_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_from_3_0= ruleNAMESPACE ) ) otherlv_4= '->' ( (lv_to_5_0= ruleNAMESPACE ) ) otherlv_6= '=' otherlv_7= '{' ( (lv_viewDefinitions_8_0= rulesigDefinitions ) ) otherlv_9= '}' otherlv_10= '.' )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:663:3: otherlv_0= '%view' ( (lv_viewID_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_from_3_0= ruleNAMESPACE ) ) otherlv_4= '->' ( (lv_to_5_0= ruleNAMESPACE ) ) otherlv_6= '=' otherlv_7= '{' ( (lv_viewDefinitions_8_0= rulesigDefinitions ) ) otherlv_9= '}' otherlv_10= '.'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleviewDeclaration1491); 

                	newLeafNode(otherlv_0, grammarAccess.getViewDeclarationAccess().getViewKeyword_0());
                
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:667:1: ( (lv_viewID_1_0= RULE_ID ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:668:1: (lv_viewID_1_0= RULE_ID )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:668:1: (lv_viewID_1_0= RULE_ID )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:669:3: lv_viewID_1_0= RULE_ID
            {
            lv_viewID_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleviewDeclaration1508); 

            			newLeafNode(lv_viewID_1_0, grammarAccess.getViewDeclarationAccess().getViewIDIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getViewDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"viewID",
                    		lv_viewID_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleviewDeclaration1525); 

                	newLeafNode(otherlv_2, grammarAccess.getViewDeclarationAccess().getColonKeyword_2());
                
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:689:1: ( (lv_from_3_0= ruleNAMESPACE ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:690:1: (lv_from_3_0= ruleNAMESPACE )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:690:1: (lv_from_3_0= ruleNAMESPACE )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:691:3: lv_from_3_0= ruleNAMESPACE
            {
             
            	        newCompositeNode(grammarAccess.getViewDeclarationAccess().getFromNAMESPACEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleNAMESPACE_in_ruleviewDeclaration1546);
            lv_from_3_0=ruleNAMESPACE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getViewDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"from",
                    		lv_from_3_0, 
                    		"NAMESPACE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleviewDeclaration1558); 

                	newLeafNode(otherlv_4, grammarAccess.getViewDeclarationAccess().getHyphenMinusGreaterThanSignKeyword_4());
                
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:711:1: ( (lv_to_5_0= ruleNAMESPACE ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:712:1: (lv_to_5_0= ruleNAMESPACE )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:712:1: (lv_to_5_0= ruleNAMESPACE )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:713:3: lv_to_5_0= ruleNAMESPACE
            {
             
            	        newCompositeNode(grammarAccess.getViewDeclarationAccess().getToNAMESPACEParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleNAMESPACE_in_ruleviewDeclaration1579);
            lv_to_5_0=ruleNAMESPACE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getViewDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"to",
                    		lv_to_5_0, 
                    		"NAMESPACE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleviewDeclaration1591); 

                	newLeafNode(otherlv_6, grammarAccess.getViewDeclarationAccess().getEqualsSignKeyword_6());
                
            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleviewDeclaration1603); 

                	newLeafNode(otherlv_7, grammarAccess.getViewDeclarationAccess().getLeftCurlyBracketKeyword_7());
                
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:737:1: ( (lv_viewDefinitions_8_0= rulesigDefinitions ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:738:1: (lv_viewDefinitions_8_0= rulesigDefinitions )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:738:1: (lv_viewDefinitions_8_0= rulesigDefinitions )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:739:3: lv_viewDefinitions_8_0= rulesigDefinitions
            {
             
            	        newCompositeNode(grammarAccess.getViewDeclarationAccess().getViewDefinitionsSigDefinitionsParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_rulesigDefinitions_in_ruleviewDeclaration1624);
            lv_viewDefinitions_8_0=rulesigDefinitions();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getViewDeclarationRule());
            	        }
                   		add(
                   			current, 
                   			"viewDefinitions",
                    		lv_viewDefinitions_8_0, 
                    		"sigDefinitions");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleviewDeclaration1636); 

                	newLeafNode(otherlv_9, grammarAccess.getViewDeclarationAccess().getRightCurlyBracketKeyword_9());
                
            otherlv_10=(Token)match(input,11,FOLLOW_11_in_ruleviewDeclaration1648); 

                	newLeafNode(otherlv_10, grammarAccess.getViewDeclarationAccess().getFullStopKeyword_10());
                

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
    public static final BitSet FOLLOW_rulenamespaceDeclaration_in_ruleModel132 = new BitSet(new long[]{0x0000000002058002L});
    public static final BitSet FOLLOW_rulesignatureDeclaration_in_ruleModel151 = new BitSet(new long[]{0x0000000002058002L});
    public static final BitSet FOLLOW_rulereadDeclaration_in_ruleModel170 = new BitSet(new long[]{0x0000000002058002L});
    public static final BitSet FOLLOW_ruleviewDeclaration_in_ruleModel189 = new BitSet(new long[]{0x0000000002058002L});
    public static final BitSet FOLLOW_ruleNAMESPACE_in_entryRuleNAMESPACE229 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNAMESPACE240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNAMESPACE280 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_ruleNAMESPACE299 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNAMESPACE314 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleURI_in_entryRuleURI362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURI373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleURI414 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleURI432 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNAMESPACE_in_ruleURI456 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleURI475 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleURI490 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleURISTRING_in_entryRuleURISTRING538 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURISTRING549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleURISTRING587 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleURI_in_ruleURISTRING609 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleURISTRING627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulereadDeclaration_in_entryRulereadDeclaration667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulereadDeclaration677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulereadDeclaration714 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleURISTRING_in_rulereadDeclaration735 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_rulereadDeclaration747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenamespaceDeclaration_in_entryRulenamespaceDeclaration783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenamespaceDeclaration793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulenamespaceDeclaration830 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulenamespaceDeclaration848 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulenamespaceDeclaration865 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleURISTRING_in_rulenamespaceDeclaration888 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_rulenamespaceDeclaration900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignatureDeclaration_in_entryRulesignatureDeclaration936 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesignatureDeclaration946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulesignatureDeclaration983 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulesignatureDeclaration1000 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulesignatureDeclaration1017 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulesignatureDeclaration1029 = new BitSet(new long[]{0x0000000001900010L});
    public static final BitSet FOLLOW_rulesigDefinitions_in_rulesignatureDeclaration1050 = new BitSet(new long[]{0x0000000001900010L});
    public static final BitSet FOLLOW_20_in_rulesignatureDeclaration1063 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_rulesignatureDeclaration1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigDefinitions_in_entryRulesigDefinitions1111 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesigDefinitions1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulesigDefinitions1164 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_rulesigDefinitions1182 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_22_in_rulesigDefinitions1200 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulesigDefinitions1219 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulesigDefinitions1236 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNAMESPACE_in_rulesigDefinitions1254 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_rulesigDefinitions1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rulesigDefinitions1285 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNAMESPACE_in_rulesigDefinitions1306 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_rulesigDefinitions1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulesigDefinitions1338 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulesigDefinitions1355 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulesigDefinitions1372 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNAMESPACE_in_rulesigDefinitions1393 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_rulesigDefinitions1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleviewDeclaration_in_entryRuleviewDeclaration1444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleviewDeclaration1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleviewDeclaration1491 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleviewDeclaration1508 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleviewDeclaration1525 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNAMESPACE_in_ruleviewDeclaration1546 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleviewDeclaration1558 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNAMESPACE_in_ruleviewDeclaration1579 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleviewDeclaration1591 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleviewDeclaration1603 = new BitSet(new long[]{0x0000000001800010L});
    public static final BitSet FOLLOW_rulesigDefinitions_in_ruleviewDeclaration1624 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleviewDeclaration1636 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleviewDeclaration1648 = new BitSet(new long[]{0x0000000000000002L});

}