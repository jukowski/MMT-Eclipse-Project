package info.kwarc.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import info.kwarc.services.ElfGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalElfParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_URI", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_ML2_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'%namespace'", "'='", "'.'", "'%sig'", "'{'", "'}'", "':'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=7;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_ML2_COMMENT=9;
    public static final int RULE_INT=6;
    public static final int RULE_WS=11;
    public static final int RULE_URI=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

        public InternalElfParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g"; }



     	private ElfGrammarAccess grammarAccess;
     	
        public InternalElfParser(TokenStream input, IAstFactory factory, ElfGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("info/kwarc/parser/antlr/internal/InternalElf.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected ElfGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleModel
    // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:77:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:78:2: (iv_ruleModel= ruleModel EOF )
            // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:79:2: iv_ruleModel= ruleModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelRule(), currentNode); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();
            _fsp--;

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
    // $ANTLR end entryRuleModel


    // $ANTLR start ruleModel
    // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:86:1: ruleModel returns [EObject current=null] : ( ( (lv_declarations_0_1= rulenamespaceDeclaration | lv_declarations_0_2= rulesignatureDeclaration ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_declarations_0_1 = null;

        EObject lv_declarations_0_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:91:6: ( ( ( (lv_declarations_0_1= rulenamespaceDeclaration | lv_declarations_0_2= rulesignatureDeclaration ) ) )* )
            // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:92:1: ( ( (lv_declarations_0_1= rulenamespaceDeclaration | lv_declarations_0_2= rulesignatureDeclaration ) ) )*
            {
            // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:92:1: ( ( (lv_declarations_0_1= rulenamespaceDeclaration | lv_declarations_0_2= rulesignatureDeclaration ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13||LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:93:1: ( (lv_declarations_0_1= rulenamespaceDeclaration | lv_declarations_0_2= rulesignatureDeclaration ) )
            	    {
            	    // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:93:1: ( (lv_declarations_0_1= rulenamespaceDeclaration | lv_declarations_0_2= rulesignatureDeclaration ) )
            	    // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:94:1: (lv_declarations_0_1= rulenamespaceDeclaration | lv_declarations_0_2= rulesignatureDeclaration )
            	    {
            	    // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:94:1: (lv_declarations_0_1= rulenamespaceDeclaration | lv_declarations_0_2= rulesignatureDeclaration )
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==13) ) {
            	        alt1=1;
            	    }
            	    else if ( (LA1_0==16) ) {
            	        alt1=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("94:1: (lv_declarations_0_1= rulenamespaceDeclaration | lv_declarations_0_2= rulesignatureDeclaration )", 1, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:95:3: lv_declarations_0_1= rulenamespaceDeclaration
            	            {
            	             
            	            	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getDeclarationsNamespaceDeclarationParserRuleCall_0_0(), currentNode); 
            	            	    
            	            pushFollow(FOLLOW_rulenamespaceDeclaration_in_ruleModel132);
            	            lv_declarations_0_1=rulenamespaceDeclaration();
            	            _fsp--;


            	            	        if (current==null) {
            	            	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	            	        }
            	            	        try {
            	            	       		add(
            	            	       			current, 
            	            	       			"declarations",
            	            	        		lv_declarations_0_1, 
            	            	        		"namespaceDeclaration", 
            	            	        		currentNode);
            	            	        } catch (ValueConverterException vce) {
            	            				handleValueConverterException(vce);
            	            	        }
            	            	        currentNode = currentNode.getParent();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:116:8: lv_declarations_0_2= rulesignatureDeclaration
            	            {
            	             
            	            	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getDeclarationsSignatureDeclarationParserRuleCall_0_1(), currentNode); 
            	            	    
            	            pushFollow(FOLLOW_rulesignatureDeclaration_in_ruleModel151);
            	            lv_declarations_0_2=rulesignatureDeclaration();
            	            _fsp--;


            	            	        if (current==null) {
            	            	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	            	        }
            	            	        try {
            	            	       		add(
            	            	       			current, 
            	            	       			"declarations",
            	            	        		lv_declarations_0_2, 
            	            	        		"signatureDeclaration", 
            	            	        		currentNode);
            	            	        } catch (ValueConverterException vce) {
            	            				handleValueConverterException(vce);
            	            	        }
            	            	        currentNode = currentNode.getParent();
            	            	    

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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModel


    // $ANTLR start entryRulenamespaceDeclaration
    // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:148:1: entryRulenamespaceDeclaration returns [EObject current=null] : iv_rulenamespaceDeclaration= rulenamespaceDeclaration EOF ;
    public final EObject entryRulenamespaceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenamespaceDeclaration = null;


        try {
            // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:149:2: (iv_rulenamespaceDeclaration= rulenamespaceDeclaration EOF )
            // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:150:2: iv_rulenamespaceDeclaration= rulenamespaceDeclaration EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNamespaceDeclarationRule(), currentNode); 
            pushFollow(FOLLOW_rulenamespaceDeclaration_in_entryRulenamespaceDeclaration190);
            iv_rulenamespaceDeclaration=rulenamespaceDeclaration();
            _fsp--;

             current =iv_rulenamespaceDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenamespaceDeclaration200); 

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
    // $ANTLR end entryRulenamespaceDeclaration


    // $ANTLR start rulenamespaceDeclaration
    // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:157:1: rulenamespaceDeclaration returns [EObject current=null] : ( '%namespace' ( ( ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_uri_3_0= RULE_URI ) ) ) | ( (lv_uri_4_0= RULE_URI ) ) ) '.' ) ;
    public final EObject rulenamespaceDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_uri_3_0=null;
        Token lv_uri_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:162:6: ( ( '%namespace' ( ( ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_uri_3_0= RULE_URI ) ) ) | ( (lv_uri_4_0= RULE_URI ) ) ) '.' ) )
            // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:163:1: ( '%namespace' ( ( ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_uri_3_0= RULE_URI ) ) ) | ( (lv_uri_4_0= RULE_URI ) ) ) '.' )
            {
            // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:163:1: ( '%namespace' ( ( ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_uri_3_0= RULE_URI ) ) ) | ( (lv_uri_4_0= RULE_URI ) ) ) '.' )
            // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:163:3: '%namespace' ( ( ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_uri_3_0= RULE_URI ) ) ) | ( (lv_uri_4_0= RULE_URI ) ) ) '.'
            {
            match(input,13,FOLLOW_13_in_rulenamespaceDeclaration235); 

                    createLeafNode(grammarAccess.getNamespaceDeclarationAccess().getNamespaceKeyword_0(), null); 
                
            // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:167:1: ( ( ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_uri_3_0= RULE_URI ) ) ) | ( (lv_uri_4_0= RULE_URI ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_URI) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("167:1: ( ( ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_uri_3_0= RULE_URI ) ) ) | ( (lv_uri_4_0= RULE_URI ) ) )", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:167:2: ( ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_uri_3_0= RULE_URI ) ) )
                    {
                    // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:167:2: ( ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_uri_3_0= RULE_URI ) ) )
                    // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:167:3: ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_uri_3_0= RULE_URI ) )
                    {
                    // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:167:3: ( (lv_name_1_0= RULE_ID ) )
                    // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:168:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:168:1: (lv_name_1_0= RULE_ID )
                    // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:169:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulenamespaceDeclaration254); 

                    			createLeafNode(grammarAccess.getNamespaceDeclarationAccess().getNameIDTerminalRuleCall_1_0_0_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getNamespaceDeclarationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_1_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,14,FOLLOW_14_in_rulenamespaceDeclaration269); 

                            createLeafNode(grammarAccess.getNamespaceDeclarationAccess().getEqualsSignKeyword_1_0_1(), null); 
                        
                    // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:195:1: ( (lv_uri_3_0= RULE_URI ) )
                    // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:196:1: (lv_uri_3_0= RULE_URI )
                    {
                    // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:196:1: (lv_uri_3_0= RULE_URI )
                    // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:197:3: lv_uri_3_0= RULE_URI
                    {
                    lv_uri_3_0=(Token)input.LT(1);
                    match(input,RULE_URI,FOLLOW_RULE_URI_in_rulenamespaceDeclaration286); 

                    			createLeafNode(grammarAccess.getNamespaceDeclarationAccess().getUriURITerminalRuleCall_1_0_2_0(), "uri"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getNamespaceDeclarationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"uri",
                    	        		lv_uri_3_0, 
                    	        		"URI", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:220:6: ( (lv_uri_4_0= RULE_URI ) )
                    {
                    // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:220:6: ( (lv_uri_4_0= RULE_URI ) )
                    // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:221:1: (lv_uri_4_0= RULE_URI )
                    {
                    // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:221:1: (lv_uri_4_0= RULE_URI )
                    // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:222:3: lv_uri_4_0= RULE_URI
                    {
                    lv_uri_4_0=(Token)input.LT(1);
                    match(input,RULE_URI,FOLLOW_RULE_URI_in_rulenamespaceDeclaration315); 

                    			createLeafNode(grammarAccess.getNamespaceDeclarationAccess().getUriURITerminalRuleCall_1_1_0(), "uri"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getNamespaceDeclarationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"uri",
                    	        		lv_uri_4_0, 
                    	        		"URI", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,15,FOLLOW_15_in_rulenamespaceDeclaration331); 

                    createLeafNode(grammarAccess.getNamespaceDeclarationAccess().getFullStopKeyword_2(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulenamespaceDeclaration


    // $ANTLR start entryRulesignatureDeclaration
    // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:256:1: entryRulesignatureDeclaration returns [EObject current=null] : iv_rulesignatureDeclaration= rulesignatureDeclaration EOF ;
    public final EObject entryRulesignatureDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesignatureDeclaration = null;


        try {
            // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:257:2: (iv_rulesignatureDeclaration= rulesignatureDeclaration EOF )
            // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:258:2: iv_rulesignatureDeclaration= rulesignatureDeclaration EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSignatureDeclarationRule(), currentNode); 
            pushFollow(FOLLOW_rulesignatureDeclaration_in_entryRulesignatureDeclaration367);
            iv_rulesignatureDeclaration=rulesignatureDeclaration();
            _fsp--;

             current =iv_rulesignatureDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesignatureDeclaration377); 

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
    // $ANTLR end entryRulesignatureDeclaration


    // $ANTLR start rulesignatureDeclaration
    // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:265:1: rulesignatureDeclaration returns [EObject current=null] : ( '%sig' ( (lv_sigName_1_0= RULE_ID ) ) '=' '{' ( (lv_sigDefinitions_4_0= rulesigDefinitions ) )* '}' '.' ) ;
    public final EObject rulesignatureDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_sigName_1_0=null;
        EObject lv_sigDefinitions_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:270:6: ( ( '%sig' ( (lv_sigName_1_0= RULE_ID ) ) '=' '{' ( (lv_sigDefinitions_4_0= rulesigDefinitions ) )* '}' '.' ) )
            // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:271:1: ( '%sig' ( (lv_sigName_1_0= RULE_ID ) ) '=' '{' ( (lv_sigDefinitions_4_0= rulesigDefinitions ) )* '}' '.' )
            {
            // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:271:1: ( '%sig' ( (lv_sigName_1_0= RULE_ID ) ) '=' '{' ( (lv_sigDefinitions_4_0= rulesigDefinitions ) )* '}' '.' )
            // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:271:3: '%sig' ( (lv_sigName_1_0= RULE_ID ) ) '=' '{' ( (lv_sigDefinitions_4_0= rulesigDefinitions ) )* '}' '.'
            {
            match(input,16,FOLLOW_16_in_rulesignatureDeclaration412); 

                    createLeafNode(grammarAccess.getSignatureDeclarationAccess().getSigKeyword_0(), null); 
                
            // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:275:1: ( (lv_sigName_1_0= RULE_ID ) )
            // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:276:1: (lv_sigName_1_0= RULE_ID )
            {
            // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:276:1: (lv_sigName_1_0= RULE_ID )
            // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:277:3: lv_sigName_1_0= RULE_ID
            {
            lv_sigName_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulesignatureDeclaration429); 

            			createLeafNode(grammarAccess.getSignatureDeclarationAccess().getSigNameIDTerminalRuleCall_1_0(), "sigName"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSignatureDeclarationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"sigName",
            	        		lv_sigName_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,14,FOLLOW_14_in_rulesignatureDeclaration444); 

                    createLeafNode(grammarAccess.getSignatureDeclarationAccess().getEqualsSignKeyword_2(), null); 
                
            match(input,17,FOLLOW_17_in_rulesignatureDeclaration454); 

                    createLeafNode(grammarAccess.getSignatureDeclarationAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:307:1: ( (lv_sigDefinitions_4_0= rulesigDefinitions ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:308:1: (lv_sigDefinitions_4_0= rulesigDefinitions )
            	    {
            	    // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:308:1: (lv_sigDefinitions_4_0= rulesigDefinitions )
            	    // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:309:3: lv_sigDefinitions_4_0= rulesigDefinitions
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSignatureDeclarationAccess().getSigDefinitionsSigDefinitionsParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulesigDefinitions_in_rulesignatureDeclaration475);
            	    lv_sigDefinitions_4_0=rulesigDefinitions();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSignatureDeclarationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"sigDefinitions",
            	    	        		lv_sigDefinitions_4_0, 
            	    	        		"sigDefinitions", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match(input,18,FOLLOW_18_in_rulesignatureDeclaration486); 

                    createLeafNode(grammarAccess.getSignatureDeclarationAccess().getRightCurlyBracketKeyword_5(), null); 
                
            match(input,15,FOLLOW_15_in_rulesignatureDeclaration496); 

                    createLeafNode(grammarAccess.getSignatureDeclarationAccess().getFullStopKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulesignatureDeclaration


    // $ANTLR start entryRulesigDefinitions
    // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:347:1: entryRulesigDefinitions returns [EObject current=null] : iv_rulesigDefinitions= rulesigDefinitions EOF ;
    public final EObject entryRulesigDefinitions() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesigDefinitions = null;


        try {
            // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:348:2: (iv_rulesigDefinitions= rulesigDefinitions EOF )
            // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:349:2: iv_rulesigDefinitions= rulesigDefinitions EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSigDefinitionsRule(), currentNode); 
            pushFollow(FOLLOW_rulesigDefinitions_in_entryRulesigDefinitions532);
            iv_rulesigDefinitions=rulesigDefinitions();
            _fsp--;

             current =iv_rulesigDefinitions; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesigDefinitions542); 

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
    // $ANTLR end entryRulesigDefinitions


    // $ANTLR start rulesigDefinitions
    // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:356:1: rulesigDefinitions returns [EObject current=null] : ( ( (lv_symbName_0_0= RULE_ID ) ) ':' ( (lv_type_2_0= RULE_ID ) ) ( '=' ( RULE_ID )+ )? '.' ) ;
    public final EObject rulesigDefinitions() throws RecognitionException {
        EObject current = null;

        Token lv_symbName_0_0=null;
        Token lv_type_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:361:6: ( ( ( (lv_symbName_0_0= RULE_ID ) ) ':' ( (lv_type_2_0= RULE_ID ) ) ( '=' ( RULE_ID )+ )? '.' ) )
            // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:362:1: ( ( (lv_symbName_0_0= RULE_ID ) ) ':' ( (lv_type_2_0= RULE_ID ) ) ( '=' ( RULE_ID )+ )? '.' )
            {
            // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:362:1: ( ( (lv_symbName_0_0= RULE_ID ) ) ':' ( (lv_type_2_0= RULE_ID ) ) ( '=' ( RULE_ID )+ )? '.' )
            // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:362:2: ( (lv_symbName_0_0= RULE_ID ) ) ':' ( (lv_type_2_0= RULE_ID ) ) ( '=' ( RULE_ID )+ )? '.'
            {
            // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:362:2: ( (lv_symbName_0_0= RULE_ID ) )
            // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:363:1: (lv_symbName_0_0= RULE_ID )
            {
            // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:363:1: (lv_symbName_0_0= RULE_ID )
            // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:364:3: lv_symbName_0_0= RULE_ID
            {
            lv_symbName_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulesigDefinitions584); 

            			createLeafNode(grammarAccess.getSigDefinitionsAccess().getSymbNameIDTerminalRuleCall_0_0(), "symbName"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSigDefinitionsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"symbName",
            	        		lv_symbName_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,19,FOLLOW_19_in_rulesigDefinitions599); 

                    createLeafNode(grammarAccess.getSigDefinitionsAccess().getColonKeyword_1(), null); 
                
            // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:390:1: ( (lv_type_2_0= RULE_ID ) )
            // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:391:1: (lv_type_2_0= RULE_ID )
            {
            // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:391:1: (lv_type_2_0= RULE_ID )
            // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:392:3: lv_type_2_0= RULE_ID
            {
            lv_type_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulesigDefinitions616); 

            			createLeafNode(grammarAccess.getSigDefinitionsAccess().getTypeIDTerminalRuleCall_2_0(), "type"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSigDefinitionsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"type",
            	        		lv_type_2_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:414:2: ( '=' ( RULE_ID )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:414:4: '=' ( RULE_ID )+
                    {
                    match(input,14,FOLLOW_14_in_rulesigDefinitions632); 

                            createLeafNode(grammarAccess.getSigDefinitionsAccess().getEqualsSignKeyword_3_0(), null); 
                        
                    // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:418:1: ( RULE_ID )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g:418:2: RULE_ID
                    	    {
                    	    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulesigDefinitions642); 
                    	     
                    	        createLeafNode(grammarAccess.getSigDefinitionsAccess().getIDTerminalRuleCall_3_1(), null); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }
                    break;

            }

            match(input,15,FOLLOW_15_in_rulesigDefinitions655); 

                    createLeafNode(grammarAccess.getSigDefinitionsAccess().getFullStopKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulesigDefinitions


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenamespaceDeclaration_in_ruleModel132 = new BitSet(new long[]{0x0000000000012002L});
    public static final BitSet FOLLOW_rulesignatureDeclaration_in_ruleModel151 = new BitSet(new long[]{0x0000000000012002L});
    public static final BitSet FOLLOW_rulenamespaceDeclaration_in_entryRulenamespaceDeclaration190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenamespaceDeclaration200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rulenamespaceDeclaration235 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_rulenamespaceDeclaration254 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulenamespaceDeclaration269 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_URI_in_rulenamespaceDeclaration286 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_URI_in_rulenamespaceDeclaration315 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulenamespaceDeclaration331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignatureDeclaration_in_entryRulesignatureDeclaration367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesignatureDeclaration377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulesignatureDeclaration412 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulesignatureDeclaration429 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulesignatureDeclaration444 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulesignatureDeclaration454 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_rulesigDefinitions_in_rulesignatureDeclaration475 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_18_in_rulesignatureDeclaration486 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulesignatureDeclaration496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigDefinitions_in_entryRulesigDefinitions532 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesigDefinitions542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulesigDefinitions584 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulesigDefinitions599 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulesigDefinitions616 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_rulesigDefinitions632 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulesigDefinitions642 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_rulesigDefinitions655 = new BitSet(new long[]{0x0000000000000002L});

}