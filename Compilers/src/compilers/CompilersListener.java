package compilers;
// Generated from Compilers.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CompilersParser}.
 */
public interface CompilersListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CompilersParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CompilersParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CompilersParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilersParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CompilersParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CompilersParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilersParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(CompilersParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(CompilersParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilersParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(CompilersParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(CompilersParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilersParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVarType(CompilersParser.VarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVarType(CompilersParser.VarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilersParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(CompilersParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(CompilersParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilersParser#methodType}.
	 * @param ctx the parse tree
	 */
	void enterMethodType(CompilersParser.MethodTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#methodType}.
	 * @param ctx the parse tree
	 */
	void exitMethodType(CompilersParser.MethodTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilersParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(CompilersParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(CompilersParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilersParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void enterParameterType(CompilersParser.ParameterTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void exitParameterType(CompilersParser.ParameterTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilersParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CompilersParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CompilersParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilersParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CompilersParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CompilersParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilersParser#assignation}.
	 * @param ctx the parse tree
	 */
	void enterAssignation(CompilersParser.AssignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#assignation}.
	 * @param ctx the parse tree
	 */
	void exitAssignation(CompilersParser.AssignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilersParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void enterWhileBlock(CompilersParser.WhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void exitWhileBlock(CompilersParser.WhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilersParser#returnBlock}.
	 * @param ctx the parse tree
	 */
	void enterReturnBlock(CompilersParser.ReturnBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#returnBlock}.
	 * @param ctx the parse tree
	 */
	void exitReturnBlock(CompilersParser.ReturnBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilersParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(CompilersParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(CompilersParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilersParser#scan}.
	 * @param ctx the parse tree
	 */
	void enterScan(CompilersParser.ScanContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#scan}.
	 * @param ctx the parse tree
	 */
	void exitScan(CompilersParser.ScanContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilersParser#myIf}.
	 * @param ctx the parse tree
	 */
	void enterMyIf(CompilersParser.MyIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#myIf}.
	 * @param ctx the parse tree
	 */
	void exitMyIf(CompilersParser.MyIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilersParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(CompilersParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(CompilersParser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilersParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(CompilersParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(CompilersParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilersParser#dotLocation}.
	 * @param ctx the parse tree
	 */
	void enterDotLocation(CompilersParser.DotLocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#dotLocation}.
	 * @param ctx the parse tree
	 */
	void exitDotLocation(CompilersParser.DotLocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilersParser#declaredVariable}.
	 * @param ctx the parse tree
	 */
	void enterDeclaredVariable(CompilersParser.DeclaredVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#declaredVariable}.
	 * @param ctx the parse tree
	 */
	void exitDeclaredVariable(CompilersParser.DeclaredVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilersParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(CompilersParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(CompilersParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilersParser#arrayVariable}.
	 * @param ctx the parse tree
	 */
	void enterArrayVariable(CompilersParser.ArrayVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#arrayVariable}.
	 * @param ctx the parse tree
	 */
	void exitArrayVariable(CompilersParser.ArrayVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilersParser#expressionInP}.
	 * @param ctx the parse tree
	 */
	void enterExpressionInP(CompilersParser.ExpressionInPContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#expressionInP}.
	 * @param ctx the parse tree
	 */
	void exitExpressionInP(CompilersParser.ExpressionInPContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilersParser#nExpression}.
	 * @param ctx the parse tree
	 */
	void enterNExpression(CompilersParser.NExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#nExpression}.
	 * @param ctx the parse tree
	 */
	void exitNExpression(CompilersParser.NExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilersParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CompilersParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CompilersParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilersParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(CompilersParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(CompilersParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilersParser#equalsExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualsExpression(CompilersParser.EqualsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#equalsExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualsExpression(CompilersParser.EqualsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilersParser#relationExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationExpression(CompilersParser.RelationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#relationExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationExpression(CompilersParser.RelationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilersParser#addSubsExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubsExpression(CompilersParser.AddSubsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#addSubsExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubsExpression(CompilersParser.AddSubsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilersParser#mulDivExpression}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpression(CompilersParser.MulDivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#mulDivExpression}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpression(CompilersParser.MulDivExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilersParser#prExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrExpression(CompilersParser.PrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#prExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrExpression(CompilersParser.PrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilersParser#basicExpression}.
	 * @param ctx the parse tree
	 */
	void enterBasicExpression(CompilersParser.BasicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#basicExpression}.
	 * @param ctx the parse tree
	 */
	void exitBasicExpression(CompilersParser.BasicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilersParser#basic}.
	 * @param ctx the parse tree
	 */
	void enterBasic(CompilersParser.BasicContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#basic}.
	 * @param ctx the parse tree
	 */
	void exitBasic(CompilersParser.BasicContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilersParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(CompilersParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(CompilersParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilersParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(CompilersParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(CompilersParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilersParser#as_op}.
	 * @param ctx the parse tree
	 */
	void enterAs_op(CompilersParser.As_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#as_op}.
	 * @param ctx the parse tree
	 */
	void exitAs_op(CompilersParser.As_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilersParser#md_op}.
	 * @param ctx the parse tree
	 */
	void enterMd_op(CompilersParser.Md_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#md_op}.
	 * @param ctx the parse tree
	 */
	void exitMd_op(CompilersParser.Md_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilersParser#pr_op}.
	 * @param ctx the parse tree
	 */
	void enterPr_op(CompilersParser.Pr_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#pr_op}.
	 * @param ctx the parse tree
	 */
	void exitPr_op(CompilersParser.Pr_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilersParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRel_op(CompilersParser.Rel_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRel_op(CompilersParser.Rel_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilersParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void enterEq_op(CompilersParser.Eq_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void exitEq_op(CompilersParser.Eq_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilersParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void enterCond_op(CompilersParser.Cond_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void exitCond_op(CompilersParser.Cond_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilersParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(CompilersParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(CompilersParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilersParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void enterInt_literal(CompilersParser.Int_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void exitInt_literal(CompilersParser.Int_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilersParser#char_literal}.
	 * @param ctx the parse tree
	 */
	void enterChar_literal(CompilersParser.Char_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#char_literal}.
	 * @param ctx the parse tree
	 */
	void exitChar_literal(CompilersParser.Char_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilersParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void enterBool_literal(CompilersParser.Bool_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilersParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void exitBool_literal(CompilersParser.Bool_literalContext ctx);
}