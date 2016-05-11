/*
 * generated by Xtext
 */
package edu.cmu.sei.annex.dmpl.serializer;

import com.google.inject.Inject;
import edu.cmu.sei.annex.dmpl.services.DmplGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class DmplSyntacticSequencer extends AbstractSyntacticSequencer {

	protected DmplGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Constant_CONSTKeyword_0_1_or_ConstKeyword_0_0;
	protected AbstractElementAlias match_Node_NODEKeyword_0_1_or_NodeKeyword_0_0;
	protected AbstractElementAlias match_Node_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_Stmt_FORALL_DISTINCT_NODE_PAIRKeyword_9_1_1_or_Forall_distinct_node_pairKeyword_9_1_0;
	protected AbstractElementAlias match_TerminalExpr_LeftParenthesisKeyword_8_0_a;
	protected AbstractElementAlias match_TerminalExpr_LeftParenthesisKeyword_8_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (DmplGrammarAccess) access;
		match_Constant_CONSTKeyword_0_1_or_ConstKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getConstantAccess().getCONSTKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getConstantAccess().getConstKeyword_0_0()));
		match_Node_NODEKeyword_0_1_or_NodeKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getNodeAccess().getNODEKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getNodeAccess().getNodeKeyword_0_0()));
		match_Node_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getNodeAccess().getSemicolonKeyword_2_0()));
		match_Stmt_FORALL_DISTINCT_NODE_PAIRKeyword_9_1_1_or_Forall_distinct_node_pairKeyword_9_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getStmtAccess().getFORALL_DISTINCT_NODE_PAIRKeyword_9_1_1()), new TokenAlias(false, false, grammarAccess.getStmtAccess().getForall_distinct_node_pairKeyword_9_1_0()));
		match_TerminalExpr_LeftParenthesisKeyword_8_0_a = new TokenAlias(true, true, grammarAccess.getTerminalExprAccess().getLeftParenthesisKeyword_8_0());
		match_TerminalExpr_LeftParenthesisKeyword_8_0_p = new TokenAlias(true, false, grammarAccess.getTerminalExprAccess().getLeftParenthesisKeyword_8_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Constant_CONSTKeyword_0_1_or_ConstKeyword_0_0.equals(syntax))
				emit_Constant_CONSTKeyword_0_1_or_ConstKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Node_NODEKeyword_0_1_or_NodeKeyword_0_0.equals(syntax))
				emit_Node_NODEKeyword_0_1_or_NodeKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Node_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_Node_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Stmt_FORALL_DISTINCT_NODE_PAIRKeyword_9_1_1_or_Forall_distinct_node_pairKeyword_9_1_0.equals(syntax))
				emit_Stmt_FORALL_DISTINCT_NODE_PAIRKeyword_9_1_1_or_Forall_distinct_node_pairKeyword_9_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TerminalExpr_LeftParenthesisKeyword_8_0_a.equals(syntax))
				emit_TerminalExpr_LeftParenthesisKeyword_8_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TerminalExpr_LeftParenthesisKeyword_8_0_p.equals(syntax))
				emit_TerminalExpr_LeftParenthesisKeyword_8_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'const' | 'CONST'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) name=TIDENTIFIER
	 */
	protected void emit_Constant_CONSTKeyword_0_1_or_ConstKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'node' | 'NODE'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) name=TIDENTIFIER
	 */
	protected void emit_Node_NODEKeyword_0_1_or_NodeKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';' | ('{' '}')
	 *
	 * This ambiguous syntax occurs at:
	 *     name=TIDENTIFIER (ambiguity) (rule end)
	 */
	protected void emit_Node_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'forall_distinct_node_pair' | 'FORALL_DISTINCT_NODE_PAIR'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '(' node1=TIDENTIFIER
	 */
	protected void emit_Stmt_FORALL_DISTINCT_NODE_PAIRKeyword_9_1_1_or_Forall_distinct_node_pairKeyword_9_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '#N' (rule start)
	 *     (rule start) (ambiguity) 'id' (rule start)
	 *     (rule start) (ambiguity) function=BuiltInFunction
	 *     (rule start) (ambiguity) name=TIDENTIFIER
	 *     (rule start) (ambiguity) namespace=TIDENTIFIER
	 *     (rule start) (ambiguity) operator=UnaryOperator
	 *     (rule start) (ambiguity) value=Double
	 *     (rule start) (ambiguity) value=INT
	 *     (rule start) (ambiguity) {AdditiveExpr.left=}
	 *     (rule start) (ambiguity) {AndExpr.left=}
	 *     (rule start) (ambiguity) {BitwiseAndExpr.left=}
	 *     (rule start) (ambiguity) {BitwiseOrExpr.left=}
	 *     (rule start) (ambiguity) {CompareExpr.left=}
	 *     (rule start) (ambiguity) {EqualityExpr.left=}
	 *     (rule start) (ambiguity) {MultiplicativeExpr.left=}
	 *     (rule start) (ambiguity) {OrExpr.left=}
	 *     (rule start) (ambiguity) {ShiftExpr.left=}
	 *     (rule start) (ambiguity) {TernaryExpr.condition=}
	 *     (rule start) (ambiguity) {XorExpr.left=}
	 */
	protected void emit_TerminalExpr_LeftParenthesisKeyword_8_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) {AdditiveExpr.left=}
	 *     (rule start) (ambiguity) {AndExpr.left=}
	 *     (rule start) (ambiguity) {BitwiseAndExpr.left=}
	 *     (rule start) (ambiguity) {BitwiseOrExpr.left=}
	 *     (rule start) (ambiguity) {CompareExpr.left=}
	 *     (rule start) (ambiguity) {EqualityExpr.left=}
	 *     (rule start) (ambiguity) {MultiplicativeExpr.left=}
	 *     (rule start) (ambiguity) {OrExpr.left=}
	 *     (rule start) (ambiguity) {ShiftExpr.left=}
	 *     (rule start) (ambiguity) {TernaryExpr.condition=}
	 *     (rule start) (ambiguity) {XorExpr.left=}
	 */
	protected void emit_TerminalExpr_LeftParenthesisKeyword_8_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
