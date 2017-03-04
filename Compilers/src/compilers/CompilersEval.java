package compilers;
import java.util.*;

public class CompilersEval extends CompilersBaseVisitor<String> {

	@Override 
	public String visitProgram(CompilersParser.ProgramContext ctx) { 
				System.out.println("I visited visitProgram");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitDeclaration(CompilersParser.DeclarationContext ctx) { 
				System.out.println("I visited visitDeclaration");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitVarDeclaration(CompilersParser.VarDeclarationContext ctx) { 
				System.out.println("I visited visitVarDeclaration");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitStructDeclaration(CompilersParser.StructDeclarationContext ctx) { 
				System.out.println("I visited visitStructDeclaration");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitVarType(CompilersParser.VarTypeContext ctx) { 
				System.out.println("I visited visitVarType");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitMethodDeclaration(CompilersParser.MethodDeclarationContext ctx) { 
				System.out.println("I visited visitMethodDeclaration");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitMethodType(CompilersParser.MethodTypeContext ctx) { 
				System.out.println("I visited visitMethodType");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitParameterDeclaration(CompilersParser.ParameterDeclarationContext ctx) { 
				System.out.println("I visited visitParameterDeclaration");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitParameterType(CompilersParser.ParameterTypeContext ctx) { 
				System.out.println("I visited visitParameterType");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitBlock(CompilersParser.BlockContext ctx) { 
				System.out.println("I visited visitBlock");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitStatement(CompilersParser.StatementContext ctx) { 
				System.out.println("I visited visitStatement");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitAssignation(CompilersParser.AssignationContext ctx) { 
				System.out.println("I visited visitAssignation");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitWhileBlock(CompilersParser.WhileBlockContext ctx) { 
				System.out.println("I visited visitWhileBlock");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitReturnBlock(CompilersParser.ReturnBlockContext ctx) { 
				System.out.println("I visited visitReturnBlock");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitPrint(CompilersParser.PrintContext ctx) { 
				System.out.println("I visited visitPrint");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitScan(CompilersParser.ScanContext ctx) { 
				System.out.println("I visited visitScan");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitIfBlock(CompilersParser.IfBlockContext ctx) { 
				System.out.println("I visited visitIfBlock");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitElseBlock(CompilersParser.ElseBlockContext ctx) { 
				System.out.println("I visited visitElseBlock");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitLocation(CompilersParser.LocationContext ctx) { 
				System.out.println("I visited visitLocation");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitDotLocation(CompilersParser.DotLocationContext ctx) { 
				System.out.println("I visited visitDotLocation");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitDeclaredVariable(CompilersParser.DeclaredVariableContext ctx) { 
				System.out.println("I visited visitDeclaredVariable");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitVariable(CompilersParser.VariableContext ctx) { 
				System.out.println("I visited visitVariable");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitArrayVariable(CompilersParser.ArrayVariableContext ctx) { 
				System.out.println("I visited visitArrayVariable");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitExpressionInP(CompilersParser.ExpressionInPContext ctx) { 
				System.out.println("I visited visitExpressionInP");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitNExpression(CompilersParser.NExpressionContext ctx) { 
				System.out.println("I visited visitNExpression");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitOrExpression(CompilersParser.OrExpressionContext ctx) { 
				System.out.println("I visited visitOrExpression");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitAndExpression(CompilersParser.AndExpressionContext ctx) { 
				System.out.println("I visited visitAndExpression");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitEqualsExpression(CompilersParser.EqualsExpressionContext ctx) { 
				System.out.println("I visited visitEqualsExpression");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitRelationExpression(CompilersParser.RelationExpressionContext ctx) { 
				System.out.println("I visited visitRelationExpression");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitAddSubsExpression(CompilersParser.AddSubsExpressionContext ctx) { 
				System.out.println("I visited visitAddSubsExpression");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitMulDivExpression(CompilersParser.MulDivExpressionContext ctx) { 
				System.out.println("I visited visitMulDivExpression");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitPrExpression(CompilersParser.PrExpressionContext ctx) { 
				System.out.println("I visited visitPrExpression");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitBasicExpression(CompilersParser.BasicExpressionContext ctx) { 
				System.out.println("I visited visitBasicExpression");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitBasic(CompilersParser.BasicContext ctx) { 
				System.out.println("I visited visitBasic");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitArg(CompilersParser.ArgContext ctx) { 
				System.out.println("I visited visitArg");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitDeclaredMethodCall(CompilersParser.DeclaredMethodCallContext ctx) { 
				System.out.println("I visited visitDeclaredMethodCall");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitAs_op(CompilersParser.As_opContext ctx) { 
				System.out.println("I visited visitAs_op");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitMd_op(CompilersParser.Md_opContext ctx) { 
				System.out.println("I visited visitMd_op");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitPr_op(CompilersParser.Pr_opContext ctx) { 
				System.out.println("I visited visitPr_op");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitRel_op(CompilersParser.Rel_opContext ctx) { 
				System.out.println("I visited visitRel_op");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitEq_op(CompilersParser.Eq_opContext ctx) { 
				System.out.println("I visited visitEq_op");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitCond_op(CompilersParser.Cond_opContext ctx) { 
				System.out.println("I visited visitCond_op");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitLiteral(CompilersParser.LiteralContext ctx) { 
				System.out.println("I visited visitLiteral");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitInt_literal(CompilersParser.Int_literalContext ctx) { 
				System.out.println("I visited visitInt_literal");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitChar_literal(CompilersParser.Char_literalContext ctx) { 
				System.out.println("I visited visitChar_literal");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitBool_literal(CompilersParser.Bool_literalContext ctx) { 
				System.out.println("I visited visitBool_literal");
				return visitChildren(ctx); 
	}

}
