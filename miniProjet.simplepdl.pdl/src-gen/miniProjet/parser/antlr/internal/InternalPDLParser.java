package miniProjet.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import miniProjet.services.PDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPDLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'process'", "'{'", "'}'", "'wd'", "'ws'", "'from'", "'to'", "'note'", "'res'", "'quantity'", "'need'", "'used'", "'true'", "'false'", "'s2s'", "'f2s'", "'s2f'", "'f2f'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPDLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPDLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPDLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPDL.g"; }



     	private PDLGrammarAccess grammarAccess;

        public InternalPDLParser(TokenStream input, PDLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Process";
       	}

       	@Override
       	protected PDLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProcess"
    // InternalPDL.g:65:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // InternalPDL.g:65:48: (iv_ruleProcess= ruleProcess EOF )
            // InternalPDL.g:66:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalPDL.g:72:1: ruleProcess returns [EObject current=null] : (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_processElements_3_0 = null;



        	enterRule();

        try {
            // InternalPDL.g:78:2: ( (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) )* otherlv_4= '}' ) )
            // InternalPDL.g:79:2: (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) )* otherlv_4= '}' )
            {
            // InternalPDL.g:79:2: (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) )* otherlv_4= '}' )
            // InternalPDL.g:80:3: otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getProcessKeyword_0());
            		
            // InternalPDL.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPDL.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPDL.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalPDL.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPDL.g:106:3: ( (lv_processElements_3_0= ruleProcessElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=15)||(LA1_0>=18 && LA1_0<=19)||LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPDL.g:107:4: (lv_processElements_3_0= ruleProcessElement )
            	    {
            	    // InternalPDL.g:107:4: (lv_processElements_3_0= ruleProcessElement )
            	    // InternalPDL.g:108:5: lv_processElements_3_0= ruleProcessElement
            	    {

            	    					newCompositeNode(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_processElements_3_0=ruleProcessElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProcessRule());
            	    					}
            	    					add(
            	    						current,
            	    						"processElements",
            	    						lv_processElements_3_0,
            	    						"miniProjet.PDL.ProcessElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleProcessElement"
    // InternalPDL.g:133:1: entryRuleProcessElement returns [EObject current=null] : iv_ruleProcessElement= ruleProcessElement EOF ;
    public final EObject entryRuleProcessElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessElement = null;


        try {
            // InternalPDL.g:133:55: (iv_ruleProcessElement= ruleProcessElement EOF )
            // InternalPDL.g:134:2: iv_ruleProcessElement= ruleProcessElement EOF
            {
             newCompositeNode(grammarAccess.getProcessElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessElement=ruleProcessElement();

            state._fsp--;

             current =iv_ruleProcessElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProcessElement"


    // $ANTLR start "ruleProcessElement"
    // InternalPDL.g:140:1: ruleProcessElement returns [EObject current=null] : (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Guidance_2= ruleGuidance | this_Ressource_3= ruleRessource | this_Need_4= ruleNeed ) ;
    public final EObject ruleProcessElement() throws RecognitionException {
        EObject current = null;

        EObject this_WorkDefinition_0 = null;

        EObject this_WorkSequence_1 = null;

        EObject this_Guidance_2 = null;

        EObject this_Ressource_3 = null;

        EObject this_Need_4 = null;



        	enterRule();

        try {
            // InternalPDL.g:146:2: ( (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Guidance_2= ruleGuidance | this_Ressource_3= ruleRessource | this_Need_4= ruleNeed ) )
            // InternalPDL.g:147:2: (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Guidance_2= ruleGuidance | this_Ressource_3= ruleRessource | this_Need_4= ruleNeed )
            {
            // InternalPDL.g:147:2: (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Guidance_2= ruleGuidance | this_Ressource_3= ruleRessource | this_Need_4= ruleNeed )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 18:
                {
                alt2=3;
                }
                break;
            case 19:
                {
                alt2=4;
                }
                break;
            case 21:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalPDL.g:148:3: this_WorkDefinition_0= ruleWorkDefinition
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_WorkDefinition_0=ruleWorkDefinition();

                    state._fsp--;


                    			current = this_WorkDefinition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPDL.g:157:3: this_WorkSequence_1= ruleWorkSequence
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_WorkSequence_1=ruleWorkSequence();

                    state._fsp--;


                    			current = this_WorkSequence_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPDL.g:166:3: this_Guidance_2= ruleGuidance
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Guidance_2=ruleGuidance();

                    state._fsp--;


                    			current = this_Guidance_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPDL.g:175:3: this_Ressource_3= ruleRessource
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getRessourceParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Ressource_3=ruleRessource();

                    state._fsp--;


                    			current = this_Ressource_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalPDL.g:184:3: this_Need_4= ruleNeed
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getNeedParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Need_4=ruleNeed();

                    state._fsp--;


                    			current = this_Need_4;
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
    // $ANTLR end "ruleProcessElement"


    // $ANTLR start "entryRuleWorkDefinition"
    // InternalPDL.g:196:1: entryRuleWorkDefinition returns [EObject current=null] : iv_ruleWorkDefinition= ruleWorkDefinition EOF ;
    public final EObject entryRuleWorkDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkDefinition = null;


        try {
            // InternalPDL.g:196:55: (iv_ruleWorkDefinition= ruleWorkDefinition EOF )
            // InternalPDL.g:197:2: iv_ruleWorkDefinition= ruleWorkDefinition EOF
            {
             newCompositeNode(grammarAccess.getWorkDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkDefinition=ruleWorkDefinition();

            state._fsp--;

             current =iv_ruleWorkDefinition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWorkDefinition"


    // $ANTLR start "ruleWorkDefinition"
    // InternalPDL.g:203:1: ruleWorkDefinition returns [EObject current=null] : (otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_need_3_0= ruleNeed ) )* otherlv_4= '}' ) ;
    public final EObject ruleWorkDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_need_3_0 = null;



        	enterRule();

        try {
            // InternalPDL.g:209:2: ( (otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_need_3_0= ruleNeed ) )* otherlv_4= '}' ) )
            // InternalPDL.g:210:2: (otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_need_3_0= ruleNeed ) )* otherlv_4= '}' )
            {
            // InternalPDL.g:210:2: (otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_need_3_0= ruleNeed ) )* otherlv_4= '}' )
            // InternalPDL.g:211:3: otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_need_3_0= ruleNeed ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkDefinitionAccess().getWdKeyword_0());
            		
            // InternalPDL.g:215:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPDL.g:216:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPDL.g:216:4: (lv_name_1_0= RULE_ID )
            // InternalPDL.g:217:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPDL.g:237:3: ( (lv_need_3_0= ruleNeed ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPDL.g:238:4: (lv_need_3_0= ruleNeed )
            	    {
            	    // InternalPDL.g:238:4: (lv_need_3_0= ruleNeed )
            	    // InternalPDL.g:239:5: lv_need_3_0= ruleNeed
            	    {

            	    					newCompositeNode(grammarAccess.getWorkDefinitionAccess().getNeedNeedParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_need_3_0=ruleNeed();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"need",
            	    						lv_need_3_0,
            	    						"miniProjet.PDL.Need");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleWorkDefinition"


    // $ANTLR start "entryRuleWorkSequence"
    // InternalPDL.g:264:1: entryRuleWorkSequence returns [EObject current=null] : iv_ruleWorkSequence= ruleWorkSequence EOF ;
    public final EObject entryRuleWorkSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkSequence = null;


        try {
            // InternalPDL.g:264:53: (iv_ruleWorkSequence= ruleWorkSequence EOF )
            // InternalPDL.g:265:2: iv_ruleWorkSequence= ruleWorkSequence EOF
            {
             newCompositeNode(grammarAccess.getWorkSequenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkSequence=ruleWorkSequence();

            state._fsp--;

             current =iv_ruleWorkSequence; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWorkSequence"


    // $ANTLR start "ruleWorkSequence"
    // InternalPDL.g:271:1: ruleWorkSequence returns [EObject current=null] : (otherlv_0= 'ws' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleWorkSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Enumerator lv_linkType_1_0 = null;



        	enterRule();

        try {
            // InternalPDL.g:277:2: ( (otherlv_0= 'ws' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalPDL.g:278:2: (otherlv_0= 'ws' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalPDL.g:278:2: (otherlv_0= 'ws' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) )
            // InternalPDL.g:279:3: otherlv_0= 'ws' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkSequenceAccess().getWsKeyword_0());
            		
            // InternalPDL.g:283:3: ( (lv_linkType_1_0= ruleWorkSequenceType ) )
            // InternalPDL.g:284:4: (lv_linkType_1_0= ruleWorkSequenceType )
            {
            // InternalPDL.g:284:4: (lv_linkType_1_0= ruleWorkSequenceType )
            // InternalPDL.g:285:5: lv_linkType_1_0= ruleWorkSequenceType
            {

            					newCompositeNode(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_linkType_1_0=ruleWorkSequenceType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorkSequenceRule());
            					}
            					set(
            						current,
            						"linkType",
            						lv_linkType_1_0,
            						"miniProjet.PDL.WorkSequenceType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkSequenceAccess().getFromKeyword_2());
            		
            // InternalPDL.g:306:3: ( (otherlv_3= RULE_ID ) )
            // InternalPDL.g:307:4: (otherlv_3= RULE_ID )
            {
            // InternalPDL.g:307:4: (otherlv_3= RULE_ID )
            // InternalPDL.g:308:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkSequenceRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_3, grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getWorkSequenceAccess().getToKeyword_4());
            		
            // InternalPDL.g:323:3: ( (otherlv_5= RULE_ID ) )
            // InternalPDL.g:324:4: (otherlv_5= RULE_ID )
            {
            // InternalPDL.g:324:4: (otherlv_5= RULE_ID )
            // InternalPDL.g:325:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkSequenceRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_5_0());
            				

            }


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
    // $ANTLR end "ruleWorkSequence"


    // $ANTLR start "entryRuleGuidance"
    // InternalPDL.g:340:1: entryRuleGuidance returns [EObject current=null] : iv_ruleGuidance= ruleGuidance EOF ;
    public final EObject entryRuleGuidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuidance = null;


        try {
            // InternalPDL.g:340:49: (iv_ruleGuidance= ruleGuidance EOF )
            // InternalPDL.g:341:2: iv_ruleGuidance= ruleGuidance EOF
            {
             newCompositeNode(grammarAccess.getGuidanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGuidance=ruleGuidance();

            state._fsp--;

             current =iv_ruleGuidance; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGuidance"


    // $ANTLR start "ruleGuidance"
    // InternalPDL.g:347:1: ruleGuidance returns [EObject current=null] : (otherlv_0= 'note' ( (lv_texte_1_0= RULE_STRING ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' ) ;
    public final EObject ruleGuidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_texte_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalPDL.g:353:2: ( (otherlv_0= 'note' ( (lv_texte_1_0= RULE_STRING ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' ) )
            // InternalPDL.g:354:2: (otherlv_0= 'note' ( (lv_texte_1_0= RULE_STRING ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' )
            {
            // InternalPDL.g:354:2: (otherlv_0= 'note' ( (lv_texte_1_0= RULE_STRING ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' )
            // InternalPDL.g:355:3: otherlv_0= 'note' ( (lv_texte_1_0= RULE_STRING ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getGuidanceAccess().getNoteKeyword_0());
            		
            // InternalPDL.g:359:3: ( (lv_texte_1_0= RULE_STRING ) )
            // InternalPDL.g:360:4: (lv_texte_1_0= RULE_STRING )
            {
            // InternalPDL.g:360:4: (lv_texte_1_0= RULE_STRING )
            // InternalPDL.g:361:5: lv_texte_1_0= RULE_STRING
            {
            lv_texte_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_texte_1_0, grammarAccess.getGuidanceAccess().getTexteSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGuidanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"texte",
            						lv_texte_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getGuidanceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPDL.g:381:3: ( (otherlv_3= RULE_ID ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPDL.g:382:4: (otherlv_3= RULE_ID )
            	    {
            	    // InternalPDL.g:382:4: (otherlv_3= RULE_ID )
            	    // InternalPDL.g:383:5: otherlv_3= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getGuidanceRule());
            	    					}
            	    				
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    					newLeafNode(otherlv_3, grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_3_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getGuidanceAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleGuidance"


    // $ANTLR start "entryRuleRessource"
    // InternalPDL.g:402:1: entryRuleRessource returns [EObject current=null] : iv_ruleRessource= ruleRessource EOF ;
    public final EObject entryRuleRessource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRessource = null;


        try {
            // InternalPDL.g:402:50: (iv_ruleRessource= ruleRessource EOF )
            // InternalPDL.g:403:2: iv_ruleRessource= ruleRessource EOF
            {
             newCompositeNode(grammarAccess.getRessourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRessource=ruleRessource();

            state._fsp--;

             current =iv_ruleRessource; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRessource"


    // $ANTLR start "ruleRessource"
    // InternalPDL.g:409:1: ruleRessource returns [EObject current=null] : (otherlv_0= 'res' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'quantity' ( (lv_quantity_3_0= RULE_INT ) ) ) ;
    public final EObject ruleRessource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_quantity_3_0=null;


        	enterRule();

        try {
            // InternalPDL.g:415:2: ( (otherlv_0= 'res' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'quantity' ( (lv_quantity_3_0= RULE_INT ) ) ) )
            // InternalPDL.g:416:2: (otherlv_0= 'res' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'quantity' ( (lv_quantity_3_0= RULE_INT ) ) )
            {
            // InternalPDL.g:416:2: (otherlv_0= 'res' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'quantity' ( (lv_quantity_3_0= RULE_INT ) ) )
            // InternalPDL.g:417:3: otherlv_0= 'res' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'quantity' ( (lv_quantity_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRessourceAccess().getResKeyword_0());
            		
            // InternalPDL.g:421:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPDL.g:422:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPDL.g:422:4: (lv_name_1_0= RULE_ID )
            // InternalPDL.g:423:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRessourceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRessourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getRessourceAccess().getQuantityKeyword_2());
            		
            // InternalPDL.g:443:3: ( (lv_quantity_3_0= RULE_INT ) )
            // InternalPDL.g:444:4: (lv_quantity_3_0= RULE_INT )
            {
            // InternalPDL.g:444:4: (lv_quantity_3_0= RULE_INT )
            // InternalPDL.g:445:5: lv_quantity_3_0= RULE_INT
            {
            lv_quantity_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_quantity_3_0, grammarAccess.getRessourceAccess().getQuantityINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRessourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"quantity",
            						lv_quantity_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


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
    // $ANTLR end "ruleRessource"


    // $ANTLR start "entryRuleNeed"
    // InternalPDL.g:465:1: entryRuleNeed returns [EObject current=null] : iv_ruleNeed= ruleNeed EOF ;
    public final EObject entryRuleNeed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNeed = null;


        try {
            // InternalPDL.g:465:45: (iv_ruleNeed= ruleNeed EOF )
            // InternalPDL.g:466:2: iv_ruleNeed= ruleNeed EOF
            {
             newCompositeNode(grammarAccess.getNeedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNeed=ruleNeed();

            state._fsp--;

             current =iv_ruleNeed; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNeed"


    // $ANTLR start "ruleNeed"
    // InternalPDL.g:472:1: ruleNeed returns [EObject current=null] : (otherlv_0= 'need' ( (lv_quantityNeeded_1_0= RULE_INT ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'used' ( (lv_used_5_0= ruleBOOLEAN ) ) ) ;
    public final EObject ruleNeed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_quantityNeeded_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Enumerator lv_used_5_0 = null;



        	enterRule();

        try {
            // InternalPDL.g:478:2: ( (otherlv_0= 'need' ( (lv_quantityNeeded_1_0= RULE_INT ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'used' ( (lv_used_5_0= ruleBOOLEAN ) ) ) )
            // InternalPDL.g:479:2: (otherlv_0= 'need' ( (lv_quantityNeeded_1_0= RULE_INT ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'used' ( (lv_used_5_0= ruleBOOLEAN ) ) )
            {
            // InternalPDL.g:479:2: (otherlv_0= 'need' ( (lv_quantityNeeded_1_0= RULE_INT ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'used' ( (lv_used_5_0= ruleBOOLEAN ) ) )
            // InternalPDL.g:480:3: otherlv_0= 'need' ( (lv_quantityNeeded_1_0= RULE_INT ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'used' ( (lv_used_5_0= ruleBOOLEAN ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getNeedAccess().getNeedKeyword_0());
            		
            // InternalPDL.g:484:3: ( (lv_quantityNeeded_1_0= RULE_INT ) )
            // InternalPDL.g:485:4: (lv_quantityNeeded_1_0= RULE_INT )
            {
            // InternalPDL.g:485:4: (lv_quantityNeeded_1_0= RULE_INT )
            // InternalPDL.g:486:5: lv_quantityNeeded_1_0= RULE_INT
            {
            lv_quantityNeeded_1_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_quantityNeeded_1_0, grammarAccess.getNeedAccess().getQuantityNeededINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNeedRule());
            					}
            					setWithLastConsumed(
            						current,
            						"quantityNeeded",
            						lv_quantityNeeded_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getNeedAccess().getFromKeyword_2());
            		
            // InternalPDL.g:506:3: ( (otherlv_3= RULE_ID ) )
            // InternalPDL.g:507:4: (otherlv_3= RULE_ID )
            {
            // InternalPDL.g:507:4: (otherlv_3= RULE_ID )
            // InternalPDL.g:508:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNeedRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_3, grammarAccess.getNeedAccess().getRessourceRessourceCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getNeedAccess().getUsedKeyword_4());
            		
            // InternalPDL.g:523:3: ( (lv_used_5_0= ruleBOOLEAN ) )
            // InternalPDL.g:524:4: (lv_used_5_0= ruleBOOLEAN )
            {
            // InternalPDL.g:524:4: (lv_used_5_0= ruleBOOLEAN )
            // InternalPDL.g:525:5: lv_used_5_0= ruleBOOLEAN
            {

            					newCompositeNode(grammarAccess.getNeedAccess().getUsedBOOLEANEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_used_5_0=ruleBOOLEAN();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNeedRule());
            					}
            					set(
            						current,
            						"used",
            						lv_used_5_0,
            						"miniProjet.PDL.BOOLEAN");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleNeed"


    // $ANTLR start "ruleBOOLEAN"
    // InternalPDL.g:546:1: ruleBOOLEAN returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBOOLEAN() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalPDL.g:552:2: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // InternalPDL.g:553:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // InternalPDL.g:553:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            else if ( (LA5_0==24) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalPDL.g:554:3: (enumLiteral_0= 'true' )
                    {
                    // InternalPDL.g:554:3: (enumLiteral_0= 'true' )
                    // InternalPDL.g:555:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPDL.g:562:3: (enumLiteral_1= 'false' )
                    {
                    // InternalPDL.g:562:3: (enumLiteral_1= 'false' )
                    // InternalPDL.g:563:4: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getBOOLEANAccess().getFALSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBOOLEANAccess().getFALSEEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleBOOLEAN"


    // $ANTLR start "ruleWorkSequenceType"
    // InternalPDL.g:573:1: ruleWorkSequenceType returns [Enumerator current=null] : ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 'f2s' ) | (enumLiteral_2= 's2f' ) | (enumLiteral_3= 'f2f' ) ) ;
    public final Enumerator ruleWorkSequenceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalPDL.g:579:2: ( ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 'f2s' ) | (enumLiteral_2= 's2f' ) | (enumLiteral_3= 'f2f' ) ) )
            // InternalPDL.g:580:2: ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 'f2s' ) | (enumLiteral_2= 's2f' ) | (enumLiteral_3= 'f2f' ) )
            {
            // InternalPDL.g:580:2: ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 'f2s' ) | (enumLiteral_2= 's2f' ) | (enumLiteral_3= 'f2f' ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt6=1;
                }
                break;
            case 26:
                {
                alt6=2;
                }
                break;
            case 27:
                {
                alt6=3;
                }
                break;
            case 28:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalPDL.g:581:3: (enumLiteral_0= 's2s' )
                    {
                    // InternalPDL.g:581:3: (enumLiteral_0= 's2s' )
                    // InternalPDL.g:582:4: enumLiteral_0= 's2s'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getStart2startEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWorkSequenceTypeAccess().getStart2startEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPDL.g:589:3: (enumLiteral_1= 'f2s' )
                    {
                    // InternalPDL.g:589:3: (enumLiteral_1= 'f2s' )
                    // InternalPDL.g:590:4: enumLiteral_1= 'f2s'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getFinish2startEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWorkSequenceTypeAccess().getFinish2startEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPDL.g:597:3: (enumLiteral_2= 's2f' )
                    {
                    // InternalPDL.g:597:3: (enumLiteral_2= 's2f' )
                    // InternalPDL.g:598:4: enumLiteral_2= 's2f'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getStart2finishEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getWorkSequenceTypeAccess().getStart2finishEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalPDL.g:605:3: (enumLiteral_3= 'f2f' )
                    {
                    // InternalPDL.g:605:3: (enumLiteral_3= 'f2f' )
                    // InternalPDL.g:606:4: enumLiteral_3= 'f2f'
                    {
                    enumLiteral_3=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getFinish2finishEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getWorkSequenceTypeAccess().getFinish2finishEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleWorkSequenceType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000002CE000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001800000L});

}