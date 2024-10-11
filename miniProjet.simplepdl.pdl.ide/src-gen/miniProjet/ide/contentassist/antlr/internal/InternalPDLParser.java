package miniProjet.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import miniProjet.services.PDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPDLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'s2s'", "'f2s'", "'s2f'", "'f2f'", "'process'", "'{'", "'}'", "'wd'", "'ws'", "'from'", "'to'", "'note'", "'res'", "'quantity'", "'need'", "'used'"
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

    	public void setGrammarAccess(PDLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleProcess"
    // InternalPDL.g:53:1: entryRuleProcess : ruleProcess EOF ;
    public final void entryRuleProcess() throws RecognitionException {
        try {
            // InternalPDL.g:54:1: ( ruleProcess EOF )
            // InternalPDL.g:55:1: ruleProcess EOF
            {
             before(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            ruleProcess();

            state._fsp--;

             after(grammarAccess.getProcessRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalPDL.g:62:1: ruleProcess : ( ( rule__Process__Group__0 ) ) ;
    public final void ruleProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:66:2: ( ( ( rule__Process__Group__0 ) ) )
            // InternalPDL.g:67:2: ( ( rule__Process__Group__0 ) )
            {
            // InternalPDL.g:67:2: ( ( rule__Process__Group__0 ) )
            // InternalPDL.g:68:3: ( rule__Process__Group__0 )
            {
             before(grammarAccess.getProcessAccess().getGroup()); 
            // InternalPDL.g:69:3: ( rule__Process__Group__0 )
            // InternalPDL.g:69:4: rule__Process__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleProcessElement"
    // InternalPDL.g:78:1: entryRuleProcessElement : ruleProcessElement EOF ;
    public final void entryRuleProcessElement() throws RecognitionException {
        try {
            // InternalPDL.g:79:1: ( ruleProcessElement EOF )
            // InternalPDL.g:80:1: ruleProcessElement EOF
            {
             before(grammarAccess.getProcessElementRule()); 
            pushFollow(FOLLOW_1);
            ruleProcessElement();

            state._fsp--;

             after(grammarAccess.getProcessElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProcessElement"


    // $ANTLR start "ruleProcessElement"
    // InternalPDL.g:87:1: ruleProcessElement : ( ( rule__ProcessElement__Alternatives ) ) ;
    public final void ruleProcessElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:91:2: ( ( ( rule__ProcessElement__Alternatives ) ) )
            // InternalPDL.g:92:2: ( ( rule__ProcessElement__Alternatives ) )
            {
            // InternalPDL.g:92:2: ( ( rule__ProcessElement__Alternatives ) )
            // InternalPDL.g:93:3: ( rule__ProcessElement__Alternatives )
            {
             before(grammarAccess.getProcessElementAccess().getAlternatives()); 
            // InternalPDL.g:94:3: ( rule__ProcessElement__Alternatives )
            // InternalPDL.g:94:4: rule__ProcessElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ProcessElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProcessElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcessElement"


    // $ANTLR start "entryRuleWorkDefinition"
    // InternalPDL.g:103:1: entryRuleWorkDefinition : ruleWorkDefinition EOF ;
    public final void entryRuleWorkDefinition() throws RecognitionException {
        try {
            // InternalPDL.g:104:1: ( ruleWorkDefinition EOF )
            // InternalPDL.g:105:1: ruleWorkDefinition EOF
            {
             before(grammarAccess.getWorkDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkDefinition();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWorkDefinition"


    // $ANTLR start "ruleWorkDefinition"
    // InternalPDL.g:112:1: ruleWorkDefinition : ( ( rule__WorkDefinition__Group__0 ) ) ;
    public final void ruleWorkDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:116:2: ( ( ( rule__WorkDefinition__Group__0 ) ) )
            // InternalPDL.g:117:2: ( ( rule__WorkDefinition__Group__0 ) )
            {
            // InternalPDL.g:117:2: ( ( rule__WorkDefinition__Group__0 ) )
            // InternalPDL.g:118:3: ( rule__WorkDefinition__Group__0 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup()); 
            // InternalPDL.g:119:3: ( rule__WorkDefinition__Group__0 )
            // InternalPDL.g:119:4: rule__WorkDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkDefinition"


    // $ANTLR start "entryRuleWorkSequence"
    // InternalPDL.g:128:1: entryRuleWorkSequence : ruleWorkSequence EOF ;
    public final void entryRuleWorkSequence() throws RecognitionException {
        try {
            // InternalPDL.g:129:1: ( ruleWorkSequence EOF )
            // InternalPDL.g:130:1: ruleWorkSequence EOF
            {
             before(grammarAccess.getWorkSequenceRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkSequence();

            state._fsp--;

             after(grammarAccess.getWorkSequenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWorkSequence"


    // $ANTLR start "ruleWorkSequence"
    // InternalPDL.g:137:1: ruleWorkSequence : ( ( rule__WorkSequence__Group__0 ) ) ;
    public final void ruleWorkSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:141:2: ( ( ( rule__WorkSequence__Group__0 ) ) )
            // InternalPDL.g:142:2: ( ( rule__WorkSequence__Group__0 ) )
            {
            // InternalPDL.g:142:2: ( ( rule__WorkSequence__Group__0 ) )
            // InternalPDL.g:143:3: ( rule__WorkSequence__Group__0 )
            {
             before(grammarAccess.getWorkSequenceAccess().getGroup()); 
            // InternalPDL.g:144:3: ( rule__WorkSequence__Group__0 )
            // InternalPDL.g:144:4: rule__WorkSequence__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkSequence"


    // $ANTLR start "entryRuleGuidance"
    // InternalPDL.g:153:1: entryRuleGuidance : ruleGuidance EOF ;
    public final void entryRuleGuidance() throws RecognitionException {
        try {
            // InternalPDL.g:154:1: ( ruleGuidance EOF )
            // InternalPDL.g:155:1: ruleGuidance EOF
            {
             before(grammarAccess.getGuidanceRule()); 
            pushFollow(FOLLOW_1);
            ruleGuidance();

            state._fsp--;

             after(grammarAccess.getGuidanceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGuidance"


    // $ANTLR start "ruleGuidance"
    // InternalPDL.g:162:1: ruleGuidance : ( ( rule__Guidance__Group__0 ) ) ;
    public final void ruleGuidance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:166:2: ( ( ( rule__Guidance__Group__0 ) ) )
            // InternalPDL.g:167:2: ( ( rule__Guidance__Group__0 ) )
            {
            // InternalPDL.g:167:2: ( ( rule__Guidance__Group__0 ) )
            // InternalPDL.g:168:3: ( rule__Guidance__Group__0 )
            {
             before(grammarAccess.getGuidanceAccess().getGroup()); 
            // InternalPDL.g:169:3: ( rule__Guidance__Group__0 )
            // InternalPDL.g:169:4: rule__Guidance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGuidance"


    // $ANTLR start "entryRuleRessource"
    // InternalPDL.g:178:1: entryRuleRessource : ruleRessource EOF ;
    public final void entryRuleRessource() throws RecognitionException {
        try {
            // InternalPDL.g:179:1: ( ruleRessource EOF )
            // InternalPDL.g:180:1: ruleRessource EOF
            {
             before(grammarAccess.getRessourceRule()); 
            pushFollow(FOLLOW_1);
            ruleRessource();

            state._fsp--;

             after(grammarAccess.getRessourceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRessource"


    // $ANTLR start "ruleRessource"
    // InternalPDL.g:187:1: ruleRessource : ( ( rule__Ressource__Group__0 ) ) ;
    public final void ruleRessource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:191:2: ( ( ( rule__Ressource__Group__0 ) ) )
            // InternalPDL.g:192:2: ( ( rule__Ressource__Group__0 ) )
            {
            // InternalPDL.g:192:2: ( ( rule__Ressource__Group__0 ) )
            // InternalPDL.g:193:3: ( rule__Ressource__Group__0 )
            {
             before(grammarAccess.getRessourceAccess().getGroup()); 
            // InternalPDL.g:194:3: ( rule__Ressource__Group__0 )
            // InternalPDL.g:194:4: rule__Ressource__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ressource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRessourceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRessource"


    // $ANTLR start "entryRuleNeed"
    // InternalPDL.g:203:1: entryRuleNeed : ruleNeed EOF ;
    public final void entryRuleNeed() throws RecognitionException {
        try {
            // InternalPDL.g:204:1: ( ruleNeed EOF )
            // InternalPDL.g:205:1: ruleNeed EOF
            {
             before(grammarAccess.getNeedRule()); 
            pushFollow(FOLLOW_1);
            ruleNeed();

            state._fsp--;

             after(grammarAccess.getNeedRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNeed"


    // $ANTLR start "ruleNeed"
    // InternalPDL.g:212:1: ruleNeed : ( ( rule__Need__Group__0 ) ) ;
    public final void ruleNeed() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:216:2: ( ( ( rule__Need__Group__0 ) ) )
            // InternalPDL.g:217:2: ( ( rule__Need__Group__0 ) )
            {
            // InternalPDL.g:217:2: ( ( rule__Need__Group__0 ) )
            // InternalPDL.g:218:3: ( rule__Need__Group__0 )
            {
             before(grammarAccess.getNeedAccess().getGroup()); 
            // InternalPDL.g:219:3: ( rule__Need__Group__0 )
            // InternalPDL.g:219:4: rule__Need__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Need__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNeedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNeed"


    // $ANTLR start "ruleBOOLEAN"
    // InternalPDL.g:228:1: ruleBOOLEAN : ( ( rule__BOOLEAN__Alternatives ) ) ;
    public final void ruleBOOLEAN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:232:1: ( ( ( rule__BOOLEAN__Alternatives ) ) )
            // InternalPDL.g:233:2: ( ( rule__BOOLEAN__Alternatives ) )
            {
            // InternalPDL.g:233:2: ( ( rule__BOOLEAN__Alternatives ) )
            // InternalPDL.g:234:3: ( rule__BOOLEAN__Alternatives )
            {
             before(grammarAccess.getBOOLEANAccess().getAlternatives()); 
            // InternalPDL.g:235:3: ( rule__BOOLEAN__Alternatives )
            // InternalPDL.g:235:4: rule__BOOLEAN__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BOOLEAN__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBOOLEANAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBOOLEAN"


    // $ANTLR start "ruleWorkSequenceType"
    // InternalPDL.g:244:1: ruleWorkSequenceType : ( ( rule__WorkSequenceType__Alternatives ) ) ;
    public final void ruleWorkSequenceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:248:1: ( ( ( rule__WorkSequenceType__Alternatives ) ) )
            // InternalPDL.g:249:2: ( ( rule__WorkSequenceType__Alternatives ) )
            {
            // InternalPDL.g:249:2: ( ( rule__WorkSequenceType__Alternatives ) )
            // InternalPDL.g:250:3: ( rule__WorkSequenceType__Alternatives )
            {
             before(grammarAccess.getWorkSequenceTypeAccess().getAlternatives()); 
            // InternalPDL.g:251:3: ( rule__WorkSequenceType__Alternatives )
            // InternalPDL.g:251:4: rule__WorkSequenceType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequenceType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkSequenceType"


    // $ANTLR start "rule__ProcessElement__Alternatives"
    // InternalPDL.g:259:1: rule__ProcessElement__Alternatives : ( ( ruleWorkDefinition ) | ( ruleWorkSequence ) | ( ruleGuidance ) | ( ruleRessource ) | ( ruleNeed ) );
    public final void rule__ProcessElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:263:1: ( ( ruleWorkDefinition ) | ( ruleWorkSequence ) | ( ruleGuidance ) | ( ruleRessource ) | ( ruleNeed ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt1=1;
                }
                break;
            case 21:
                {
                alt1=2;
                }
                break;
            case 24:
                {
                alt1=3;
                }
                break;
            case 25:
                {
                alt1=4;
                }
                break;
            case 27:
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
                    // InternalPDL.g:264:2: ( ruleWorkDefinition )
                    {
                    // InternalPDL.g:264:2: ( ruleWorkDefinition )
                    // InternalPDL.g:265:3: ruleWorkDefinition
                    {
                     before(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleWorkDefinition();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPDL.g:270:2: ( ruleWorkSequence )
                    {
                    // InternalPDL.g:270:2: ( ruleWorkSequence )
                    // InternalPDL.g:271:3: ruleWorkSequence
                    {
                     before(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleWorkSequence();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPDL.g:276:2: ( ruleGuidance )
                    {
                    // InternalPDL.g:276:2: ( ruleGuidance )
                    // InternalPDL.g:277:3: ruleGuidance
                    {
                     before(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleGuidance();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPDL.g:282:2: ( ruleRessource )
                    {
                    // InternalPDL.g:282:2: ( ruleRessource )
                    // InternalPDL.g:283:3: ruleRessource
                    {
                     before(grammarAccess.getProcessElementAccess().getRessourceParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleRessource();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getRessourceParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPDL.g:288:2: ( ruleNeed )
                    {
                    // InternalPDL.g:288:2: ( ruleNeed )
                    // InternalPDL.g:289:3: ruleNeed
                    {
                     before(grammarAccess.getProcessElementAccess().getNeedParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleNeed();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getNeedParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessElement__Alternatives"


    // $ANTLR start "rule__BOOLEAN__Alternatives"
    // InternalPDL.g:298:1: rule__BOOLEAN__Alternatives : ( ( ( 'true' ) ) | ( ( 'false' ) ) );
    public final void rule__BOOLEAN__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:302:1: ( ( ( 'true' ) ) | ( ( 'false' ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalPDL.g:303:2: ( ( 'true' ) )
                    {
                    // InternalPDL.g:303:2: ( ( 'true' ) )
                    // InternalPDL.g:304:3: ( 'true' )
                    {
                     before(grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0()); 
                    // InternalPDL.g:305:3: ( 'true' )
                    // InternalPDL.g:305:4: 'true'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPDL.g:309:2: ( ( 'false' ) )
                    {
                    // InternalPDL.g:309:2: ( ( 'false' ) )
                    // InternalPDL.g:310:3: ( 'false' )
                    {
                     before(grammarAccess.getBOOLEANAccess().getFALSEEnumLiteralDeclaration_1()); 
                    // InternalPDL.g:311:3: ( 'false' )
                    // InternalPDL.g:311:4: 'false'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getBOOLEANAccess().getFALSEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOOLEAN__Alternatives"


    // $ANTLR start "rule__WorkSequenceType__Alternatives"
    // InternalPDL.g:319:1: rule__WorkSequenceType__Alternatives : ( ( ( 's2s' ) ) | ( ( 'f2s' ) ) | ( ( 's2f' ) ) | ( ( 'f2f' ) ) );
    public final void rule__WorkSequenceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:323:1: ( ( ( 's2s' ) ) | ( ( 'f2s' ) ) | ( ( 's2f' ) ) | ( ( 'f2f' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            case 16:
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
                    // InternalPDL.g:324:2: ( ( 's2s' ) )
                    {
                    // InternalPDL.g:324:2: ( ( 's2s' ) )
                    // InternalPDL.g:325:3: ( 's2s' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getStart2startEnumLiteralDeclaration_0()); 
                    // InternalPDL.g:326:3: ( 's2s' )
                    // InternalPDL.g:326:4: 's2s'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getStart2startEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPDL.g:330:2: ( ( 'f2s' ) )
                    {
                    // InternalPDL.g:330:2: ( ( 'f2s' ) )
                    // InternalPDL.g:331:3: ( 'f2s' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getFinish2startEnumLiteralDeclaration_1()); 
                    // InternalPDL.g:332:3: ( 'f2s' )
                    // InternalPDL.g:332:4: 'f2s'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getFinish2startEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPDL.g:336:2: ( ( 's2f' ) )
                    {
                    // InternalPDL.g:336:2: ( ( 's2f' ) )
                    // InternalPDL.g:337:3: ( 's2f' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getStart2finishEnumLiteralDeclaration_2()); 
                    // InternalPDL.g:338:3: ( 's2f' )
                    // InternalPDL.g:338:4: 's2f'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getStart2finishEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPDL.g:342:2: ( ( 'f2f' ) )
                    {
                    // InternalPDL.g:342:2: ( ( 'f2f' ) )
                    // InternalPDL.g:343:3: ( 'f2f' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getFinish2finishEnumLiteralDeclaration_3()); 
                    // InternalPDL.g:344:3: ( 'f2f' )
                    // InternalPDL.g:344:4: 'f2f'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getFinish2finishEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequenceType__Alternatives"


    // $ANTLR start "rule__Process__Group__0"
    // InternalPDL.g:352:1: rule__Process__Group__0 : rule__Process__Group__0__Impl rule__Process__Group__1 ;
    public final void rule__Process__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:356:1: ( rule__Process__Group__0__Impl rule__Process__Group__1 )
            // InternalPDL.g:357:2: rule__Process__Group__0__Impl rule__Process__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Process__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__0"


    // $ANTLR start "rule__Process__Group__0__Impl"
    // InternalPDL.g:364:1: rule__Process__Group__0__Impl : ( 'process' ) ;
    public final void rule__Process__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:368:1: ( ( 'process' ) )
            // InternalPDL.g:369:1: ( 'process' )
            {
            // InternalPDL.g:369:1: ( 'process' )
            // InternalPDL.g:370:2: 'process'
            {
             before(grammarAccess.getProcessAccess().getProcessKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getProcessKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__0__Impl"


    // $ANTLR start "rule__Process__Group__1"
    // InternalPDL.g:379:1: rule__Process__Group__1 : rule__Process__Group__1__Impl rule__Process__Group__2 ;
    public final void rule__Process__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:383:1: ( rule__Process__Group__1__Impl rule__Process__Group__2 )
            // InternalPDL.g:384:2: rule__Process__Group__1__Impl rule__Process__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__1"


    // $ANTLR start "rule__Process__Group__1__Impl"
    // InternalPDL.g:391:1: rule__Process__Group__1__Impl : ( ( rule__Process__NameAssignment_1 ) ) ;
    public final void rule__Process__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:395:1: ( ( ( rule__Process__NameAssignment_1 ) ) )
            // InternalPDL.g:396:1: ( ( rule__Process__NameAssignment_1 ) )
            {
            // InternalPDL.g:396:1: ( ( rule__Process__NameAssignment_1 ) )
            // InternalPDL.g:397:2: ( rule__Process__NameAssignment_1 )
            {
             before(grammarAccess.getProcessAccess().getNameAssignment_1()); 
            // InternalPDL.g:398:2: ( rule__Process__NameAssignment_1 )
            // InternalPDL.g:398:3: rule__Process__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__1__Impl"


    // $ANTLR start "rule__Process__Group__2"
    // InternalPDL.g:406:1: rule__Process__Group__2 : rule__Process__Group__2__Impl rule__Process__Group__3 ;
    public final void rule__Process__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:410:1: ( rule__Process__Group__2__Impl rule__Process__Group__3 )
            // InternalPDL.g:411:2: rule__Process__Group__2__Impl rule__Process__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Process__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__2"


    // $ANTLR start "rule__Process__Group__2__Impl"
    // InternalPDL.g:418:1: rule__Process__Group__2__Impl : ( '{' ) ;
    public final void rule__Process__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:422:1: ( ( '{' ) )
            // InternalPDL.g:423:1: ( '{' )
            {
            // InternalPDL.g:423:1: ( '{' )
            // InternalPDL.g:424:2: '{'
            {
             before(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__2__Impl"


    // $ANTLR start "rule__Process__Group__3"
    // InternalPDL.g:433:1: rule__Process__Group__3 : rule__Process__Group__3__Impl rule__Process__Group__4 ;
    public final void rule__Process__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:437:1: ( rule__Process__Group__3__Impl rule__Process__Group__4 )
            // InternalPDL.g:438:2: rule__Process__Group__3__Impl rule__Process__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Process__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__3"


    // $ANTLR start "rule__Process__Group__3__Impl"
    // InternalPDL.g:445:1: rule__Process__Group__3__Impl : ( ( rule__Process__ProcessElementsAssignment_3 )* ) ;
    public final void rule__Process__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:449:1: ( ( ( rule__Process__ProcessElementsAssignment_3 )* ) )
            // InternalPDL.g:450:1: ( ( rule__Process__ProcessElementsAssignment_3 )* )
            {
            // InternalPDL.g:450:1: ( ( rule__Process__ProcessElementsAssignment_3 )* )
            // InternalPDL.g:451:2: ( rule__Process__ProcessElementsAssignment_3 )*
            {
             before(grammarAccess.getProcessAccess().getProcessElementsAssignment_3()); 
            // InternalPDL.g:452:2: ( rule__Process__ProcessElementsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=20 && LA4_0<=21)||(LA4_0>=24 && LA4_0<=25)||LA4_0==27) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPDL.g:452:3: rule__Process__ProcessElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Process__ProcessElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getProcessElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__3__Impl"


    // $ANTLR start "rule__Process__Group__4"
    // InternalPDL.g:460:1: rule__Process__Group__4 : rule__Process__Group__4__Impl ;
    public final void rule__Process__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:464:1: ( rule__Process__Group__4__Impl )
            // InternalPDL.g:465:2: rule__Process__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__4"


    // $ANTLR start "rule__Process__Group__4__Impl"
    // InternalPDL.g:471:1: rule__Process__Group__4__Impl : ( '}' ) ;
    public final void rule__Process__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:475:1: ( ( '}' ) )
            // InternalPDL.g:476:1: ( '}' )
            {
            // InternalPDL.g:476:1: ( '}' )
            // InternalPDL.g:477:2: '}'
            {
             before(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__4__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__0"
    // InternalPDL.g:487:1: rule__WorkDefinition__Group__0 : rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1 ;
    public final void rule__WorkDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:491:1: ( rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1 )
            // InternalPDL.g:492:2: rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__WorkDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__0"


    // $ANTLR start "rule__WorkDefinition__Group__0__Impl"
    // InternalPDL.g:499:1: rule__WorkDefinition__Group__0__Impl : ( 'wd' ) ;
    public final void rule__WorkDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:503:1: ( ( 'wd' ) )
            // InternalPDL.g:504:1: ( 'wd' )
            {
            // InternalPDL.g:504:1: ( 'wd' )
            // InternalPDL.g:505:2: 'wd'
            {
             before(grammarAccess.getWorkDefinitionAccess().getWdKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getWdKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__1"
    // InternalPDL.g:514:1: rule__WorkDefinition__Group__1 : rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2 ;
    public final void rule__WorkDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:518:1: ( rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2 )
            // InternalPDL.g:519:2: rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__WorkDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__1"


    // $ANTLR start "rule__WorkDefinition__Group__1__Impl"
    // InternalPDL.g:526:1: rule__WorkDefinition__Group__1__Impl : ( ( rule__WorkDefinition__NameAssignment_1 ) ) ;
    public final void rule__WorkDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:530:1: ( ( ( rule__WorkDefinition__NameAssignment_1 ) ) )
            // InternalPDL.g:531:1: ( ( rule__WorkDefinition__NameAssignment_1 ) )
            {
            // InternalPDL.g:531:1: ( ( rule__WorkDefinition__NameAssignment_1 ) )
            // InternalPDL.g:532:2: ( rule__WorkDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameAssignment_1()); 
            // InternalPDL.g:533:2: ( rule__WorkDefinition__NameAssignment_1 )
            // InternalPDL.g:533:3: rule__WorkDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__2"
    // InternalPDL.g:541:1: rule__WorkDefinition__Group__2 : rule__WorkDefinition__Group__2__Impl rule__WorkDefinition__Group__3 ;
    public final void rule__WorkDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:545:1: ( rule__WorkDefinition__Group__2__Impl rule__WorkDefinition__Group__3 )
            // InternalPDL.g:546:2: rule__WorkDefinition__Group__2__Impl rule__WorkDefinition__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__WorkDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__2"


    // $ANTLR start "rule__WorkDefinition__Group__2__Impl"
    // InternalPDL.g:553:1: rule__WorkDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__WorkDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:557:1: ( ( '{' ) )
            // InternalPDL.g:558:1: ( '{' )
            {
            // InternalPDL.g:558:1: ( '{' )
            // InternalPDL.g:559:2: '{'
            {
             before(grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__2__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__3"
    // InternalPDL.g:568:1: rule__WorkDefinition__Group__3 : rule__WorkDefinition__Group__3__Impl rule__WorkDefinition__Group__4 ;
    public final void rule__WorkDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:572:1: ( rule__WorkDefinition__Group__3__Impl rule__WorkDefinition__Group__4 )
            // InternalPDL.g:573:2: rule__WorkDefinition__Group__3__Impl rule__WorkDefinition__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__WorkDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__3"


    // $ANTLR start "rule__WorkDefinition__Group__3__Impl"
    // InternalPDL.g:580:1: rule__WorkDefinition__Group__3__Impl : ( ( rule__WorkDefinition__NeedAssignment_3 )* ) ;
    public final void rule__WorkDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:584:1: ( ( ( rule__WorkDefinition__NeedAssignment_3 )* ) )
            // InternalPDL.g:585:1: ( ( rule__WorkDefinition__NeedAssignment_3 )* )
            {
            // InternalPDL.g:585:1: ( ( rule__WorkDefinition__NeedAssignment_3 )* )
            // InternalPDL.g:586:2: ( rule__WorkDefinition__NeedAssignment_3 )*
            {
             before(grammarAccess.getWorkDefinitionAccess().getNeedAssignment_3()); 
            // InternalPDL.g:587:2: ( rule__WorkDefinition__NeedAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==27) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPDL.g:587:3: rule__WorkDefinition__NeedAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__WorkDefinition__NeedAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getWorkDefinitionAccess().getNeedAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__3__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__4"
    // InternalPDL.g:595:1: rule__WorkDefinition__Group__4 : rule__WorkDefinition__Group__4__Impl ;
    public final void rule__WorkDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:599:1: ( rule__WorkDefinition__Group__4__Impl )
            // InternalPDL.g:600:2: rule__WorkDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__4"


    // $ANTLR start "rule__WorkDefinition__Group__4__Impl"
    // InternalPDL.g:606:1: rule__WorkDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__WorkDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:610:1: ( ( '}' ) )
            // InternalPDL.g:611:1: ( '}' )
            {
            // InternalPDL.g:611:1: ( '}' )
            // InternalPDL.g:612:2: '}'
            {
             before(grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__4__Impl"


    // $ANTLR start "rule__WorkSequence__Group__0"
    // InternalPDL.g:622:1: rule__WorkSequence__Group__0 : rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 ;
    public final void rule__WorkSequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:626:1: ( rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 )
            // InternalPDL.g:627:2: rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__WorkSequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__0"


    // $ANTLR start "rule__WorkSequence__Group__0__Impl"
    // InternalPDL.g:634:1: rule__WorkSequence__Group__0__Impl : ( 'ws' ) ;
    public final void rule__WorkSequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:638:1: ( ( 'ws' ) )
            // InternalPDL.g:639:1: ( 'ws' )
            {
            // InternalPDL.g:639:1: ( 'ws' )
            // InternalPDL.g:640:2: 'ws'
            {
             before(grammarAccess.getWorkSequenceAccess().getWsKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getWsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__0__Impl"


    // $ANTLR start "rule__WorkSequence__Group__1"
    // InternalPDL.g:649:1: rule__WorkSequence__Group__1 : rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 ;
    public final void rule__WorkSequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:653:1: ( rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 )
            // InternalPDL.g:654:2: rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__WorkSequence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__1"


    // $ANTLR start "rule__WorkSequence__Group__1__Impl"
    // InternalPDL.g:661:1: rule__WorkSequence__Group__1__Impl : ( ( rule__WorkSequence__LinkTypeAssignment_1 ) ) ;
    public final void rule__WorkSequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:665:1: ( ( ( rule__WorkSequence__LinkTypeAssignment_1 ) ) )
            // InternalPDL.g:666:1: ( ( rule__WorkSequence__LinkTypeAssignment_1 ) )
            {
            // InternalPDL.g:666:1: ( ( rule__WorkSequence__LinkTypeAssignment_1 ) )
            // InternalPDL.g:667:2: ( rule__WorkSequence__LinkTypeAssignment_1 )
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_1()); 
            // InternalPDL.g:668:2: ( rule__WorkSequence__LinkTypeAssignment_1 )
            // InternalPDL.g:668:3: rule__WorkSequence__LinkTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__LinkTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__1__Impl"


    // $ANTLR start "rule__WorkSequence__Group__2"
    // InternalPDL.g:676:1: rule__WorkSequence__Group__2 : rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3 ;
    public final void rule__WorkSequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:680:1: ( rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3 )
            // InternalPDL.g:681:2: rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__WorkSequence__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__2"


    // $ANTLR start "rule__WorkSequence__Group__2__Impl"
    // InternalPDL.g:688:1: rule__WorkSequence__Group__2__Impl : ( 'from' ) ;
    public final void rule__WorkSequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:692:1: ( ( 'from' ) )
            // InternalPDL.g:693:1: ( 'from' )
            {
            // InternalPDL.g:693:1: ( 'from' )
            // InternalPDL.g:694:2: 'from'
            {
             before(grammarAccess.getWorkSequenceAccess().getFromKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getFromKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__2__Impl"


    // $ANTLR start "rule__WorkSequence__Group__3"
    // InternalPDL.g:703:1: rule__WorkSequence__Group__3 : rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4 ;
    public final void rule__WorkSequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:707:1: ( rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4 )
            // InternalPDL.g:708:2: rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__WorkSequence__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__3"


    // $ANTLR start "rule__WorkSequence__Group__3__Impl"
    // InternalPDL.g:715:1: rule__WorkSequence__Group__3__Impl : ( ( rule__WorkSequence__PredecessorAssignment_3 ) ) ;
    public final void rule__WorkSequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:719:1: ( ( ( rule__WorkSequence__PredecessorAssignment_3 ) ) )
            // InternalPDL.g:720:1: ( ( rule__WorkSequence__PredecessorAssignment_3 ) )
            {
            // InternalPDL.g:720:1: ( ( rule__WorkSequence__PredecessorAssignment_3 ) )
            // InternalPDL.g:721:2: ( rule__WorkSequence__PredecessorAssignment_3 )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_3()); 
            // InternalPDL.g:722:2: ( rule__WorkSequence__PredecessorAssignment_3 )
            // InternalPDL.g:722:3: rule__WorkSequence__PredecessorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__PredecessorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__3__Impl"


    // $ANTLR start "rule__WorkSequence__Group__4"
    // InternalPDL.g:730:1: rule__WorkSequence__Group__4 : rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5 ;
    public final void rule__WorkSequence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:734:1: ( rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5 )
            // InternalPDL.g:735:2: rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__WorkSequence__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__4"


    // $ANTLR start "rule__WorkSequence__Group__4__Impl"
    // InternalPDL.g:742:1: rule__WorkSequence__Group__4__Impl : ( 'to' ) ;
    public final void rule__WorkSequence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:746:1: ( ( 'to' ) )
            // InternalPDL.g:747:1: ( 'to' )
            {
            // InternalPDL.g:747:1: ( 'to' )
            // InternalPDL.g:748:2: 'to'
            {
             before(grammarAccess.getWorkSequenceAccess().getToKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getToKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__4__Impl"


    // $ANTLR start "rule__WorkSequence__Group__5"
    // InternalPDL.g:757:1: rule__WorkSequence__Group__5 : rule__WorkSequence__Group__5__Impl ;
    public final void rule__WorkSequence__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:761:1: ( rule__WorkSequence__Group__5__Impl )
            // InternalPDL.g:762:2: rule__WorkSequence__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__5"


    // $ANTLR start "rule__WorkSequence__Group__5__Impl"
    // InternalPDL.g:768:1: rule__WorkSequence__Group__5__Impl : ( ( rule__WorkSequence__SuccessorAssignment_5 ) ) ;
    public final void rule__WorkSequence__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:772:1: ( ( ( rule__WorkSequence__SuccessorAssignment_5 ) ) )
            // InternalPDL.g:773:1: ( ( rule__WorkSequence__SuccessorAssignment_5 ) )
            {
            // InternalPDL.g:773:1: ( ( rule__WorkSequence__SuccessorAssignment_5 ) )
            // InternalPDL.g:774:2: ( rule__WorkSequence__SuccessorAssignment_5 )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_5()); 
            // InternalPDL.g:775:2: ( rule__WorkSequence__SuccessorAssignment_5 )
            // InternalPDL.g:775:3: rule__WorkSequence__SuccessorAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__SuccessorAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__5__Impl"


    // $ANTLR start "rule__Guidance__Group__0"
    // InternalPDL.g:784:1: rule__Guidance__Group__0 : rule__Guidance__Group__0__Impl rule__Guidance__Group__1 ;
    public final void rule__Guidance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:788:1: ( rule__Guidance__Group__0__Impl rule__Guidance__Group__1 )
            // InternalPDL.g:789:2: rule__Guidance__Group__0__Impl rule__Guidance__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Guidance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__0"


    // $ANTLR start "rule__Guidance__Group__0__Impl"
    // InternalPDL.g:796:1: rule__Guidance__Group__0__Impl : ( 'note' ) ;
    public final void rule__Guidance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:800:1: ( ( 'note' ) )
            // InternalPDL.g:801:1: ( 'note' )
            {
            // InternalPDL.g:801:1: ( 'note' )
            // InternalPDL.g:802:2: 'note'
            {
             before(grammarAccess.getGuidanceAccess().getNoteKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getNoteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__0__Impl"


    // $ANTLR start "rule__Guidance__Group__1"
    // InternalPDL.g:811:1: rule__Guidance__Group__1 : rule__Guidance__Group__1__Impl rule__Guidance__Group__2 ;
    public final void rule__Guidance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:815:1: ( rule__Guidance__Group__1__Impl rule__Guidance__Group__2 )
            // InternalPDL.g:816:2: rule__Guidance__Group__1__Impl rule__Guidance__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Guidance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__1"


    // $ANTLR start "rule__Guidance__Group__1__Impl"
    // InternalPDL.g:823:1: rule__Guidance__Group__1__Impl : ( ( rule__Guidance__TexteAssignment_1 ) ) ;
    public final void rule__Guidance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:827:1: ( ( ( rule__Guidance__TexteAssignment_1 ) ) )
            // InternalPDL.g:828:1: ( ( rule__Guidance__TexteAssignment_1 ) )
            {
            // InternalPDL.g:828:1: ( ( rule__Guidance__TexteAssignment_1 ) )
            // InternalPDL.g:829:2: ( rule__Guidance__TexteAssignment_1 )
            {
             before(grammarAccess.getGuidanceAccess().getTexteAssignment_1()); 
            // InternalPDL.g:830:2: ( rule__Guidance__TexteAssignment_1 )
            // InternalPDL.g:830:3: rule__Guidance__TexteAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__TexteAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getTexteAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__1__Impl"


    // $ANTLR start "rule__Guidance__Group__2"
    // InternalPDL.g:838:1: rule__Guidance__Group__2 : rule__Guidance__Group__2__Impl rule__Guidance__Group__3 ;
    public final void rule__Guidance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:842:1: ( rule__Guidance__Group__2__Impl rule__Guidance__Group__3 )
            // InternalPDL.g:843:2: rule__Guidance__Group__2__Impl rule__Guidance__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Guidance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__2"


    // $ANTLR start "rule__Guidance__Group__2__Impl"
    // InternalPDL.g:850:1: rule__Guidance__Group__2__Impl : ( '{' ) ;
    public final void rule__Guidance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:854:1: ( ( '{' ) )
            // InternalPDL.g:855:1: ( '{' )
            {
            // InternalPDL.g:855:1: ( '{' )
            // InternalPDL.g:856:2: '{'
            {
             before(grammarAccess.getGuidanceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__2__Impl"


    // $ANTLR start "rule__Guidance__Group__3"
    // InternalPDL.g:865:1: rule__Guidance__Group__3 : rule__Guidance__Group__3__Impl rule__Guidance__Group__4 ;
    public final void rule__Guidance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:869:1: ( rule__Guidance__Group__3__Impl rule__Guidance__Group__4 )
            // InternalPDL.g:870:2: rule__Guidance__Group__3__Impl rule__Guidance__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Guidance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__3"


    // $ANTLR start "rule__Guidance__Group__3__Impl"
    // InternalPDL.g:877:1: rule__Guidance__Group__3__Impl : ( ( rule__Guidance__ElementsAssignment_3 )* ) ;
    public final void rule__Guidance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:881:1: ( ( ( rule__Guidance__ElementsAssignment_3 )* ) )
            // InternalPDL.g:882:1: ( ( rule__Guidance__ElementsAssignment_3 )* )
            {
            // InternalPDL.g:882:1: ( ( rule__Guidance__ElementsAssignment_3 )* )
            // InternalPDL.g:883:2: ( rule__Guidance__ElementsAssignment_3 )*
            {
             before(grammarAccess.getGuidanceAccess().getElementsAssignment_3()); 
            // InternalPDL.g:884:2: ( rule__Guidance__ElementsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPDL.g:884:3: rule__Guidance__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Guidance__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getGuidanceAccess().getElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__3__Impl"


    // $ANTLR start "rule__Guidance__Group__4"
    // InternalPDL.g:892:1: rule__Guidance__Group__4 : rule__Guidance__Group__4__Impl ;
    public final void rule__Guidance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:896:1: ( rule__Guidance__Group__4__Impl )
            // InternalPDL.g:897:2: rule__Guidance__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__4"


    // $ANTLR start "rule__Guidance__Group__4__Impl"
    // InternalPDL.g:903:1: rule__Guidance__Group__4__Impl : ( '}' ) ;
    public final void rule__Guidance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:907:1: ( ( '}' ) )
            // InternalPDL.g:908:1: ( '}' )
            {
            // InternalPDL.g:908:1: ( '}' )
            // InternalPDL.g:909:2: '}'
            {
             before(grammarAccess.getGuidanceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__4__Impl"


    // $ANTLR start "rule__Ressource__Group__0"
    // InternalPDL.g:919:1: rule__Ressource__Group__0 : rule__Ressource__Group__0__Impl rule__Ressource__Group__1 ;
    public final void rule__Ressource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:923:1: ( rule__Ressource__Group__0__Impl rule__Ressource__Group__1 )
            // InternalPDL.g:924:2: rule__Ressource__Group__0__Impl rule__Ressource__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Ressource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ressource__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__0"


    // $ANTLR start "rule__Ressource__Group__0__Impl"
    // InternalPDL.g:931:1: rule__Ressource__Group__0__Impl : ( 'res' ) ;
    public final void rule__Ressource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:935:1: ( ( 'res' ) )
            // InternalPDL.g:936:1: ( 'res' )
            {
            // InternalPDL.g:936:1: ( 'res' )
            // InternalPDL.g:937:2: 'res'
            {
             before(grammarAccess.getRessourceAccess().getResKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRessourceAccess().getResKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__0__Impl"


    // $ANTLR start "rule__Ressource__Group__1"
    // InternalPDL.g:946:1: rule__Ressource__Group__1 : rule__Ressource__Group__1__Impl rule__Ressource__Group__2 ;
    public final void rule__Ressource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:950:1: ( rule__Ressource__Group__1__Impl rule__Ressource__Group__2 )
            // InternalPDL.g:951:2: rule__Ressource__Group__1__Impl rule__Ressource__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Ressource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ressource__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__1"


    // $ANTLR start "rule__Ressource__Group__1__Impl"
    // InternalPDL.g:958:1: rule__Ressource__Group__1__Impl : ( ( rule__Ressource__NameAssignment_1 ) ) ;
    public final void rule__Ressource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:962:1: ( ( ( rule__Ressource__NameAssignment_1 ) ) )
            // InternalPDL.g:963:1: ( ( rule__Ressource__NameAssignment_1 ) )
            {
            // InternalPDL.g:963:1: ( ( rule__Ressource__NameAssignment_1 ) )
            // InternalPDL.g:964:2: ( rule__Ressource__NameAssignment_1 )
            {
             before(grammarAccess.getRessourceAccess().getNameAssignment_1()); 
            // InternalPDL.g:965:2: ( rule__Ressource__NameAssignment_1 )
            // InternalPDL.g:965:3: rule__Ressource__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Ressource__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRessourceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__1__Impl"


    // $ANTLR start "rule__Ressource__Group__2"
    // InternalPDL.g:973:1: rule__Ressource__Group__2 : rule__Ressource__Group__2__Impl rule__Ressource__Group__3 ;
    public final void rule__Ressource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:977:1: ( rule__Ressource__Group__2__Impl rule__Ressource__Group__3 )
            // InternalPDL.g:978:2: rule__Ressource__Group__2__Impl rule__Ressource__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Ressource__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ressource__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__2"


    // $ANTLR start "rule__Ressource__Group__2__Impl"
    // InternalPDL.g:985:1: rule__Ressource__Group__2__Impl : ( 'quantity' ) ;
    public final void rule__Ressource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:989:1: ( ( 'quantity' ) )
            // InternalPDL.g:990:1: ( 'quantity' )
            {
            // InternalPDL.g:990:1: ( 'quantity' )
            // InternalPDL.g:991:2: 'quantity'
            {
             before(grammarAccess.getRessourceAccess().getQuantityKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRessourceAccess().getQuantityKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__2__Impl"


    // $ANTLR start "rule__Ressource__Group__3"
    // InternalPDL.g:1000:1: rule__Ressource__Group__3 : rule__Ressource__Group__3__Impl ;
    public final void rule__Ressource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1004:1: ( rule__Ressource__Group__3__Impl )
            // InternalPDL.g:1005:2: rule__Ressource__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ressource__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__3"


    // $ANTLR start "rule__Ressource__Group__3__Impl"
    // InternalPDL.g:1011:1: rule__Ressource__Group__3__Impl : ( ( rule__Ressource__QuantityAssignment_3 ) ) ;
    public final void rule__Ressource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1015:1: ( ( ( rule__Ressource__QuantityAssignment_3 ) ) )
            // InternalPDL.g:1016:1: ( ( rule__Ressource__QuantityAssignment_3 ) )
            {
            // InternalPDL.g:1016:1: ( ( rule__Ressource__QuantityAssignment_3 ) )
            // InternalPDL.g:1017:2: ( rule__Ressource__QuantityAssignment_3 )
            {
             before(grammarAccess.getRessourceAccess().getQuantityAssignment_3()); 
            // InternalPDL.g:1018:2: ( rule__Ressource__QuantityAssignment_3 )
            // InternalPDL.g:1018:3: rule__Ressource__QuantityAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Ressource__QuantityAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRessourceAccess().getQuantityAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__3__Impl"


    // $ANTLR start "rule__Need__Group__0"
    // InternalPDL.g:1027:1: rule__Need__Group__0 : rule__Need__Group__0__Impl rule__Need__Group__1 ;
    public final void rule__Need__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1031:1: ( rule__Need__Group__0__Impl rule__Need__Group__1 )
            // InternalPDL.g:1032:2: rule__Need__Group__0__Impl rule__Need__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Need__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Need__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Need__Group__0"


    // $ANTLR start "rule__Need__Group__0__Impl"
    // InternalPDL.g:1039:1: rule__Need__Group__0__Impl : ( 'need' ) ;
    public final void rule__Need__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1043:1: ( ( 'need' ) )
            // InternalPDL.g:1044:1: ( 'need' )
            {
            // InternalPDL.g:1044:1: ( 'need' )
            // InternalPDL.g:1045:2: 'need'
            {
             before(grammarAccess.getNeedAccess().getNeedKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getNeedAccess().getNeedKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Need__Group__0__Impl"


    // $ANTLR start "rule__Need__Group__1"
    // InternalPDL.g:1054:1: rule__Need__Group__1 : rule__Need__Group__1__Impl rule__Need__Group__2 ;
    public final void rule__Need__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1058:1: ( rule__Need__Group__1__Impl rule__Need__Group__2 )
            // InternalPDL.g:1059:2: rule__Need__Group__1__Impl rule__Need__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Need__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Need__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Need__Group__1"


    // $ANTLR start "rule__Need__Group__1__Impl"
    // InternalPDL.g:1066:1: rule__Need__Group__1__Impl : ( ( rule__Need__QuantityNeededAssignment_1 ) ) ;
    public final void rule__Need__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1070:1: ( ( ( rule__Need__QuantityNeededAssignment_1 ) ) )
            // InternalPDL.g:1071:1: ( ( rule__Need__QuantityNeededAssignment_1 ) )
            {
            // InternalPDL.g:1071:1: ( ( rule__Need__QuantityNeededAssignment_1 ) )
            // InternalPDL.g:1072:2: ( rule__Need__QuantityNeededAssignment_1 )
            {
             before(grammarAccess.getNeedAccess().getQuantityNeededAssignment_1()); 
            // InternalPDL.g:1073:2: ( rule__Need__QuantityNeededAssignment_1 )
            // InternalPDL.g:1073:3: rule__Need__QuantityNeededAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Need__QuantityNeededAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNeedAccess().getQuantityNeededAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Need__Group__1__Impl"


    // $ANTLR start "rule__Need__Group__2"
    // InternalPDL.g:1081:1: rule__Need__Group__2 : rule__Need__Group__2__Impl rule__Need__Group__3 ;
    public final void rule__Need__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1085:1: ( rule__Need__Group__2__Impl rule__Need__Group__3 )
            // InternalPDL.g:1086:2: rule__Need__Group__2__Impl rule__Need__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Need__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Need__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Need__Group__2"


    // $ANTLR start "rule__Need__Group__2__Impl"
    // InternalPDL.g:1093:1: rule__Need__Group__2__Impl : ( 'from' ) ;
    public final void rule__Need__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1097:1: ( ( 'from' ) )
            // InternalPDL.g:1098:1: ( 'from' )
            {
            // InternalPDL.g:1098:1: ( 'from' )
            // InternalPDL.g:1099:2: 'from'
            {
             before(grammarAccess.getNeedAccess().getFromKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getNeedAccess().getFromKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Need__Group__2__Impl"


    // $ANTLR start "rule__Need__Group__3"
    // InternalPDL.g:1108:1: rule__Need__Group__3 : rule__Need__Group__3__Impl rule__Need__Group__4 ;
    public final void rule__Need__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1112:1: ( rule__Need__Group__3__Impl rule__Need__Group__4 )
            // InternalPDL.g:1113:2: rule__Need__Group__3__Impl rule__Need__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Need__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Need__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Need__Group__3"


    // $ANTLR start "rule__Need__Group__3__Impl"
    // InternalPDL.g:1120:1: rule__Need__Group__3__Impl : ( ( rule__Need__RessourceAssignment_3 ) ) ;
    public final void rule__Need__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1124:1: ( ( ( rule__Need__RessourceAssignment_3 ) ) )
            // InternalPDL.g:1125:1: ( ( rule__Need__RessourceAssignment_3 ) )
            {
            // InternalPDL.g:1125:1: ( ( rule__Need__RessourceAssignment_3 ) )
            // InternalPDL.g:1126:2: ( rule__Need__RessourceAssignment_3 )
            {
             before(grammarAccess.getNeedAccess().getRessourceAssignment_3()); 
            // InternalPDL.g:1127:2: ( rule__Need__RessourceAssignment_3 )
            // InternalPDL.g:1127:3: rule__Need__RessourceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Need__RessourceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNeedAccess().getRessourceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Need__Group__3__Impl"


    // $ANTLR start "rule__Need__Group__4"
    // InternalPDL.g:1135:1: rule__Need__Group__4 : rule__Need__Group__4__Impl rule__Need__Group__5 ;
    public final void rule__Need__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1139:1: ( rule__Need__Group__4__Impl rule__Need__Group__5 )
            // InternalPDL.g:1140:2: rule__Need__Group__4__Impl rule__Need__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Need__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Need__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Need__Group__4"


    // $ANTLR start "rule__Need__Group__4__Impl"
    // InternalPDL.g:1147:1: rule__Need__Group__4__Impl : ( 'used' ) ;
    public final void rule__Need__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1151:1: ( ( 'used' ) )
            // InternalPDL.g:1152:1: ( 'used' )
            {
            // InternalPDL.g:1152:1: ( 'used' )
            // InternalPDL.g:1153:2: 'used'
            {
             before(grammarAccess.getNeedAccess().getUsedKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getNeedAccess().getUsedKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Need__Group__4__Impl"


    // $ANTLR start "rule__Need__Group__5"
    // InternalPDL.g:1162:1: rule__Need__Group__5 : rule__Need__Group__5__Impl ;
    public final void rule__Need__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1166:1: ( rule__Need__Group__5__Impl )
            // InternalPDL.g:1167:2: rule__Need__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Need__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Need__Group__5"


    // $ANTLR start "rule__Need__Group__5__Impl"
    // InternalPDL.g:1173:1: rule__Need__Group__5__Impl : ( ( rule__Need__UsedAssignment_5 ) ) ;
    public final void rule__Need__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1177:1: ( ( ( rule__Need__UsedAssignment_5 ) ) )
            // InternalPDL.g:1178:1: ( ( rule__Need__UsedAssignment_5 ) )
            {
            // InternalPDL.g:1178:1: ( ( rule__Need__UsedAssignment_5 ) )
            // InternalPDL.g:1179:2: ( rule__Need__UsedAssignment_5 )
            {
             before(grammarAccess.getNeedAccess().getUsedAssignment_5()); 
            // InternalPDL.g:1180:2: ( rule__Need__UsedAssignment_5 )
            // InternalPDL.g:1180:3: rule__Need__UsedAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Need__UsedAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getNeedAccess().getUsedAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Need__Group__5__Impl"


    // $ANTLR start "rule__Process__NameAssignment_1"
    // InternalPDL.g:1189:1: rule__Process__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Process__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1193:1: ( ( RULE_ID ) )
            // InternalPDL.g:1194:2: ( RULE_ID )
            {
            // InternalPDL.g:1194:2: ( RULE_ID )
            // InternalPDL.g:1195:3: RULE_ID
            {
             before(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__NameAssignment_1"


    // $ANTLR start "rule__Process__ProcessElementsAssignment_3"
    // InternalPDL.g:1204:1: rule__Process__ProcessElementsAssignment_3 : ( ruleProcessElement ) ;
    public final void rule__Process__ProcessElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1208:1: ( ( ruleProcessElement ) )
            // InternalPDL.g:1209:2: ( ruleProcessElement )
            {
            // InternalPDL.g:1209:2: ( ruleProcessElement )
            // InternalPDL.g:1210:3: ruleProcessElement
            {
             before(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleProcessElement();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__ProcessElementsAssignment_3"


    // $ANTLR start "rule__WorkDefinition__NameAssignment_1"
    // InternalPDL.g:1219:1: rule__WorkDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__WorkDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1223:1: ( ( RULE_ID ) )
            // InternalPDL.g:1224:2: ( RULE_ID )
            {
            // InternalPDL.g:1224:2: ( RULE_ID )
            // InternalPDL.g:1225:3: RULE_ID
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__NameAssignment_1"


    // $ANTLR start "rule__WorkDefinition__NeedAssignment_3"
    // InternalPDL.g:1234:1: rule__WorkDefinition__NeedAssignment_3 : ( ruleNeed ) ;
    public final void rule__WorkDefinition__NeedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1238:1: ( ( ruleNeed ) )
            // InternalPDL.g:1239:2: ( ruleNeed )
            {
            // InternalPDL.g:1239:2: ( ruleNeed )
            // InternalPDL.g:1240:3: ruleNeed
            {
             before(grammarAccess.getWorkDefinitionAccess().getNeedNeedParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNeed();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getNeedNeedParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__NeedAssignment_3"


    // $ANTLR start "rule__WorkSequence__LinkTypeAssignment_1"
    // InternalPDL.g:1249:1: rule__WorkSequence__LinkTypeAssignment_1 : ( ruleWorkSequenceType ) ;
    public final void rule__WorkSequence__LinkTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1253:1: ( ( ruleWorkSequenceType ) )
            // InternalPDL.g:1254:2: ( ruleWorkSequenceType )
            {
            // InternalPDL.g:1254:2: ( ruleWorkSequenceType )
            // InternalPDL.g:1255:3: ruleWorkSequenceType
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkSequenceType();

            state._fsp--;

             after(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__LinkTypeAssignment_1"


    // $ANTLR start "rule__WorkSequence__PredecessorAssignment_3"
    // InternalPDL.g:1264:1: rule__WorkSequence__PredecessorAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__WorkSequence__PredecessorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1268:1: ( ( ( RULE_ID ) ) )
            // InternalPDL.g:1269:2: ( ( RULE_ID ) )
            {
            // InternalPDL.g:1269:2: ( ( RULE_ID ) )
            // InternalPDL.g:1270:3: ( RULE_ID )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_3_0()); 
            // InternalPDL.g:1271:3: ( RULE_ID )
            // InternalPDL.g:1272:4: RULE_ID
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__PredecessorAssignment_3"


    // $ANTLR start "rule__WorkSequence__SuccessorAssignment_5"
    // InternalPDL.g:1283:1: rule__WorkSequence__SuccessorAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__WorkSequence__SuccessorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1287:1: ( ( ( RULE_ID ) ) )
            // InternalPDL.g:1288:2: ( ( RULE_ID ) )
            {
            // InternalPDL.g:1288:2: ( ( RULE_ID ) )
            // InternalPDL.g:1289:3: ( RULE_ID )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_5_0()); 
            // InternalPDL.g:1290:3: ( RULE_ID )
            // InternalPDL.g:1291:4: RULE_ID
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__SuccessorAssignment_5"


    // $ANTLR start "rule__Guidance__TexteAssignment_1"
    // InternalPDL.g:1302:1: rule__Guidance__TexteAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Guidance__TexteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1306:1: ( ( RULE_STRING ) )
            // InternalPDL.g:1307:2: ( RULE_STRING )
            {
            // InternalPDL.g:1307:2: ( RULE_STRING )
            // InternalPDL.g:1308:3: RULE_STRING
            {
             before(grammarAccess.getGuidanceAccess().getTexteSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getTexteSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__TexteAssignment_1"


    // $ANTLR start "rule__Guidance__ElementsAssignment_3"
    // InternalPDL.g:1317:1: rule__Guidance__ElementsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Guidance__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1321:1: ( ( ( RULE_ID ) ) )
            // InternalPDL.g:1322:2: ( ( RULE_ID ) )
            {
            // InternalPDL.g:1322:2: ( ( RULE_ID ) )
            // InternalPDL.g:1323:3: ( RULE_ID )
            {
             before(grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_3_0()); 
            // InternalPDL.g:1324:3: ( RULE_ID )
            // InternalPDL.g:1325:4: RULE_ID
            {
             before(grammarAccess.getGuidanceAccess().getElementsProcessElementIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getElementsProcessElementIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__ElementsAssignment_3"


    // $ANTLR start "rule__Ressource__NameAssignment_1"
    // InternalPDL.g:1336:1: rule__Ressource__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Ressource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1340:1: ( ( RULE_ID ) )
            // InternalPDL.g:1341:2: ( RULE_ID )
            {
            // InternalPDL.g:1341:2: ( RULE_ID )
            // InternalPDL.g:1342:3: RULE_ID
            {
             before(grammarAccess.getRessourceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRessourceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__NameAssignment_1"


    // $ANTLR start "rule__Ressource__QuantityAssignment_3"
    // InternalPDL.g:1351:1: rule__Ressource__QuantityAssignment_3 : ( RULE_INT ) ;
    public final void rule__Ressource__QuantityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1355:1: ( ( RULE_INT ) )
            // InternalPDL.g:1356:2: ( RULE_INT )
            {
            // InternalPDL.g:1356:2: ( RULE_INT )
            // InternalPDL.g:1357:3: RULE_INT
            {
             before(grammarAccess.getRessourceAccess().getQuantityINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRessourceAccess().getQuantityINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__QuantityAssignment_3"


    // $ANTLR start "rule__Need__QuantityNeededAssignment_1"
    // InternalPDL.g:1366:1: rule__Need__QuantityNeededAssignment_1 : ( RULE_INT ) ;
    public final void rule__Need__QuantityNeededAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1370:1: ( ( RULE_INT ) )
            // InternalPDL.g:1371:2: ( RULE_INT )
            {
            // InternalPDL.g:1371:2: ( RULE_INT )
            // InternalPDL.g:1372:3: RULE_INT
            {
             before(grammarAccess.getNeedAccess().getQuantityNeededINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNeedAccess().getQuantityNeededINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Need__QuantityNeededAssignment_1"


    // $ANTLR start "rule__Need__RessourceAssignment_3"
    // InternalPDL.g:1381:1: rule__Need__RessourceAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Need__RessourceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1385:1: ( ( ( RULE_ID ) ) )
            // InternalPDL.g:1386:2: ( ( RULE_ID ) )
            {
            // InternalPDL.g:1386:2: ( ( RULE_ID ) )
            // InternalPDL.g:1387:3: ( RULE_ID )
            {
             before(grammarAccess.getNeedAccess().getRessourceRessourceCrossReference_3_0()); 
            // InternalPDL.g:1388:3: ( RULE_ID )
            // InternalPDL.g:1389:4: RULE_ID
            {
             before(grammarAccess.getNeedAccess().getRessourceRessourceIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNeedAccess().getRessourceRessourceIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getNeedAccess().getRessourceRessourceCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Need__RessourceAssignment_3"


    // $ANTLR start "rule__Need__UsedAssignment_5"
    // InternalPDL.g:1400:1: rule__Need__UsedAssignment_5 : ( ruleBOOLEAN ) ;
    public final void rule__Need__UsedAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1404:1: ( ( ruleBOOLEAN ) )
            // InternalPDL.g:1405:2: ( ruleBOOLEAN )
            {
            // InternalPDL.g:1405:2: ( ruleBOOLEAN )
            // InternalPDL.g:1406:3: ruleBOOLEAN
            {
             before(grammarAccess.getNeedAccess().getUsedBOOLEANEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleBOOLEAN();

            state._fsp--;

             after(grammarAccess.getNeedAccess().getUsedBOOLEANEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Need__UsedAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000B380000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000B300002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001800L});

}