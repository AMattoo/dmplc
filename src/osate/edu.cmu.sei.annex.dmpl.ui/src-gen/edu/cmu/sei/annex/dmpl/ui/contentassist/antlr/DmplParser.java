/*
 * generated by Xtext
 */
package edu.cmu.sei.annex.dmpl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import edu.cmu.sei.annex.dmpl.services.DmplGrammarAccess;

public class DmplParser extends AbstractContentAssistParser {
	
	@Inject
	private DmplGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected edu.cmu.sei.annex.dmpl.ui.contentassist.antlr.internal.InternalDmplParser createParser() {
		edu.cmu.sei.annex.dmpl.ui.contentassist.antlr.internal.InternalDmplParser result = new edu.cmu.sei.annex.dmpl.ui.contentassist.antlr.internal.InternalDmplParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getProgramElementAccess().getAlternatives(), "rule__ProgramElement__Alternatives");
					put(grammarAccess.getConstantAccess().getAlternatives_0(), "rule__Constant__Alternatives_0");
					put(grammarAccess.getNumberConstAccess().getAlternatives(), "rule__NumberConst__Alternatives");
					put(grammarAccess.getFnPrototypeAccess().getExternAlternatives_0_0(), "rule__FnPrototype__ExternAlternatives_0_0");
					put(grammarAccess.getFnPrototypeAccess().getPureAlternatives_1_0(), "rule__FnPrototype__PureAlternatives_1_0");
					put(grammarAccess.getDoubleAccess().getAlternatives(), "rule__Double__Alternatives");
					put(grammarAccess.getSignEnumAccess().getAlternatives(), "rule__SignEnum__Alternatives");
					put(grammarAccess.getSignAccess().getAlternatives(), "rule__Sign__Alternatives");
					put(grammarAccess.getProgramAccess().getGroup(), "rule__Program__Group__0");
					put(grammarAccess.getDmplSubclauseAccess().getGroup(), "rule__DmplSubclause__Group__0");
					put(grammarAccess.getConstantAccess().getGroup(), "rule__Constant__Group__0");
					put(grammarAccess.getIntConstAccess().getGroup(), "rule__IntConst__Group__0");
					put(grammarAccess.getDoubleConstAccess().getGroup(), "rule__DoubleConst__Group__0");
					put(grammarAccess.getProcNoAttrAccess().getGroup(), "rule__ProcNoAttr__Group__0");
					put(grammarAccess.getFnPrototypeAccess().getGroup(), "rule__FnPrototype__Group__0");
					put(grammarAccess.getFnPrototypeNoDecorsAccess().getGroup(), "rule__FnPrototypeNoDecors__Group__0");
					put(grammarAccess.getDoubleAccess().getGroup_1(), "rule__Double__Group_1__0");
					put(grammarAccess.getProgramAccess().getProgramElementsAssignment_1(), "rule__Program__ProgramElementsAssignment_1");
					put(grammarAccess.getDmplSubclauseAccess().getProgramAssignment_1(), "rule__DmplSubclause__ProgramAssignment_1");
					put(grammarAccess.getConstantAccess().getNameAssignment_1(), "rule__Constant__NameAssignment_1");
					put(grammarAccess.getConstantAccess().getValueAssignment_3(), "rule__Constant__ValueAssignment_3");
					put(grammarAccess.getIntConstAccess().getSignAssignment_0(), "rule__IntConst__SignAssignment_0");
					put(grammarAccess.getIntConstAccess().getValueAssignment_1(), "rule__IntConst__ValueAssignment_1");
					put(grammarAccess.getDoubleConstAccess().getSignAssignment_0(), "rule__DoubleConst__SignAssignment_0");
					put(grammarAccess.getDoubleConstAccess().getValueAssignment_1(), "rule__DoubleConst__ValueAssignment_1");
					put(grammarAccess.getProcedureAccess().getProcedureAssignment(), "rule__Procedure__ProcedureAssignment");
					put(grammarAccess.getProcNoAttrAccess().getPrototypeAssignment_0(), "rule__ProcNoAttr__PrototypeAssignment_0");
					put(grammarAccess.getFnPrototypeAccess().getExternAssignment_0(), "rule__FnPrototype__ExternAssignment_0");
					put(grammarAccess.getFnPrototypeAccess().getPureAssignment_1(), "rule__FnPrototype__PureAssignment_1");
					put(grammarAccess.getFnPrototypeAccess().getPrototypeAssignment_2(), "rule__FnPrototype__PrototypeAssignment_2");
					put(grammarAccess.getFnPrototypeNoDecorsAccess().getNameAssignment_1(), "rule__FnPrototypeNoDecors__NameAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			edu.cmu.sei.annex.dmpl.ui.contentassist.antlr.internal.InternalDmplParser typedParser = (edu.cmu.sei.annex.dmpl.ui.contentassist.antlr.internal.InternalDmplParser) parser;
			typedParser.entryRuleProgram();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public DmplGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(DmplGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}