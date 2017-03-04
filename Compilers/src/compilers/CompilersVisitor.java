package compilers;
// Generated from Compilers.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CompilersParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CompilersVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CompilersParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CompilersParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilersParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(CompilersParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilersParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(CompilersParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilersParser#structDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaration(CompilersParser.StructDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilersParser#varType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarType(CompilersParser.VarTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilersParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(CompilersParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilersParser#methodType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodType(CompilersParser.MethodTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilersParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(CompilersParser.ParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilersParser#parameterType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterType(CompilersParser.ParameterTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilersParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CompilersParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilersParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CompilersParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilersParser#assignation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignation(CompilersParser.AssignationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilersParser#whileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileBlock(CompilersParser.WhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilersParser#returnBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnBlock(CompilersParser.ReturnBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilersParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(CompilersParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilersParser#scan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScan(CompilersParser.ScanContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilersParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(CompilersParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilersParser#elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBlock(CompilersParser.ElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilersParser#location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocation(CompilersParser.LocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilersParser#dotLocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotLocation(CompilersParser.DotLocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilersParser#declaredVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaredVariable(CompilersParser.DeclaredVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilersParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(CompilersParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilersParser#arrayVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayVariable(CompilersParser.ArrayVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilersParser#expressionInP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionInP(CompilersParser.ExpressionInPContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilersParser#nExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNExpression(CompilersParser.NExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilersParser#orExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(CompilersParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilersParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(CompilersParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilersParser#equalsExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualsExpression(CompilersParser.EqualsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilersParser#relationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationExpression(CompilersParser.RelationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilersParser#addSubsExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubsExpression(CompilersParser.AddSubsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilersParser#mulDivExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExpression(CompilersParser.MulDivExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilersParser#prExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrExpression(CompilersParser.PrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilersParser#basicExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicExpression(CompilersParser.BasicExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilersParser#basic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic(CompilersParser.BasicContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilersParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(CompilersParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilersParser#declaredMethodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaredMethodCall(CompilersParser.DeclaredMethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilersParser#as_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAs_op(CompilersParser.As_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilersParser#md_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMd_op(CompilersParser.Md_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilersParser#pr_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPr_op(CompilersParser.Pr_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilersParser#rel_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_op(CompilersParser.Rel_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilersParser#eq_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq_op(CompilersParser.Eq_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilersParser#cond_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_op(CompilersParser.Cond_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilersParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(CompilersParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilersParser#int_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_literal(CompilersParser.Int_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilersParser#char_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar_literal(CompilersParser.Char_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilersParser#bool_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_literal(CompilersParser.Bool_literalContext ctx);
}