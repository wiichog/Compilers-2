package compilers;
import java.util.*;

public class CompilersEval extends CompilersBaseVisitor<String> {
	public int EnvironmentCounter = 0;
	public Stack<Integer> EnvironmentStack = new Stack<Integer>();
	public Map<String,String[]> SymbolTable = new HashMap<String,String[]>();	
	
	@Override 
	public String visitProgram(CompilersParser.ProgramContext ctx) { 
		//System.out.println("I visited visitProgram");
		EnvironmentCounter = EnvironmentCounter + 1;
		String[] SymbolInformation = {ctx.getChild(1).getText(),"",Integer.toString(EnvironmentCounter)};
		SymbolTable.put(ctx.getChild(1).getText() + Integer.toString(EnvironmentCounter), SymbolInformation);
		//System.out.println(Arrays.toString(SymbolTable.get(ctx.getChild(1).getText())));
		EnvironmentStack.push(EnvironmentCounter);
		return visitChildren(ctx);
	}
	
	@Override 
	public String visitVarDeclaration(CompilersParser.VarDeclarationContext ctx) { 
		//System.out.println("I visited visitVarDeclaration");
		//System.out.println("******************************************");
		//System.out.println("Type " + ctx.getChild(0).getText());
		//System.out.println("Name " + ctx.getChild(1).getText());
		//System.out.println("Counter " + Integer.toString(EnvironmentCounter));
		//System.out.println("ctx " + ctx.getText());
		//System.out.println("******************************************");
		String[] SymbolInformation = {ctx.getChild(1).getText(),ctx.getChild(0).getText(),Integer.toString(EnvironmentCounter)};
		SymbolTable.put(ctx.getChild(1).getText() + Integer.toString(EnvironmentCounter), SymbolInformation);
		//System.out.println("******************************************");
		//for (Map.Entry entry : SymbolTable.entrySet()) {
		//	    System.out.println(entry.getKey() + ", " + Arrays.toString(SymbolTable.get(entry.getKey())));
		//   }
		//System.out.println("******************************************");
		return visitChildren(ctx); 
		
	}
	
	@Override 
	public String visitStructDeclaration(CompilersParser.StructDeclarationContext ctx) { 
				//System.out.println("I visited visitStructDeclaration");
				EnvironmentCounter = EnvironmentCounter + 1;
				String[] SymbolInformation = {ctx.getChild(1).getText(),"struc",Integer.toString(EnvironmentCounter)};
				SymbolTable.put(ctx.getChild(1).getText(), SymbolInformation);
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitMethodDeclaration(CompilersParser.MethodDeclarationContext ctx) { 
				//System.out.println("I visited visitMethodDeclaration");
				EnvironmentCounter = EnvironmentCounter + 1;
				String Cadena = "";
				for(int i=3; i<ctx.children.size()-2;i++){
					try{
						//String ParameterType = ctx.getChild(i).getChild(0).getText();
						//String ParameterName = ctx.getChild(i).getChild(1).getText();
						//System.out.println(ctx.getText());
						Cadena = Cadena + "," + ctx.getChild(i).getChild(1).getText();
						}
					catch(Exception e){}
				}
				try{
				Cadena = Cadena.substring(1,Cadena.length());}catch(Exception e){}
				String[] SymbolInformation = {ctx.getChild(1).getText(),ctx.getChild(0).getText(),Integer.toString(EnvironmentCounter), Cadena};
				SymbolTable.put(ctx.getChild(1).getText() + Integer.toString(EnvironmentCounter), SymbolInformation);
				//System.out.println("******************************************");
				//for (Map.Entry entry : SymbolTable.entrySet()) {
				//	    System.out.println(entry.getKey() + ", " + Arrays.toString(SymbolTable.get(entry.getKey())));
				//   }
				//System.out.println("******************************************");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitParameter(CompilersParser.ParameterContext ctx) { 
				//System.out.println("I visited visitParameterDeclaration");
				String[] SymbolInformation = {ctx.getChild(1).getText(),ctx.getChild(0).getText(),Integer.toString(EnvironmentCounter)};
				SymbolTable.put(ctx.getChild(1).getText() + Integer.toString(EnvironmentCounter), SymbolInformation);
				//System.out.println("******************************************");
				//for (Map.Entry entry : SymbolTable.entrySet()) {
				//	    System.out.println(entry.getKey() + ", " + Arrays.toString(SymbolTable.get(entry.getKey())));
				//   }
				//System.out.println("******************************************");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitBlock(CompilersParser.BlockContext ctx) { 
				//System.out.println("I visited visitBlock");
				//String[] SymbolInformation = {ctx.getChild(1).getText(),ctx.getChild(0).getText(),Integer.toString(EnvironmentCounter)};
				//SymbolTable.put(ctx.getChild(1).getText() + Integer.toString(EnvironmentCounter), SymbolInformation);
				//System.out.println(ctx.getText());
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitStatement(CompilersParser.StatementContext ctx) { 
				//System.out.println("I visited visitStatement");
				//System.out.println(ctx.getText());
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitAssignation(CompilersParser.AssignationContext ctx) { 
				//System.out.println("I visited visitAssignation");
				if(visit(ctx.getChild(0)).equals(visit(ctx.getChild(2)))){
					System.out.println(visit(ctx.getChild(0)));
				}
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitWhileBlock(CompilersParser.WhileBlockContext ctx) { 
				//System.out.println("I visited visitWhileBlock");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitReturnBlock(CompilersParser.ReturnBlockContext ctx) { 
				//System.out.println("I visited visitReturnBlock");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitPrint(CompilersParser.PrintContext ctx) { 
				//System.out.println("I visited visitPrint");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitScan(CompilersParser.ScanContext ctx) { 
				//System.out.println("I visited visitScan");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitMyIf(CompilersParser.MyIfContext ctx) { 
				//System.out.println("I visited visitMyIf");
				//System.out.println(ctx.getText());
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitElseBlock(CompilersParser.ElseBlockContext ctx) { 
				//System.out.println("I visited visitElseBlock");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitLocation(CompilersParser.LocationContext ctx) { 
				//System.out.println("I visited visitLocation");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitDotLocation(CompilersParser.DotLocationContext ctx) { 
				//System.out.println("I visited visitDotLocation");
				String[] ctxInformation = SymbolTable.get(ctx.getChild(0).getText() + Integer.toString(EnvironmentCounter));
				String[] FatherInformation = SymbolTable.get(ctxInformation[1]);
				String FatherScope = FatherInformation[2];
				String[] ctxRealInformation = SymbolTable.get(ctx.getChild(2).getText() + FatherScope);
				//System.out.println("The type for " + ctx.getChild(2).getText() + FatherScope + " is " + ctxRealInformation[1]);
				return ctxRealInformation[1]; 
	}
	
	@Override 
	public String visitDeclaredVariable(CompilersParser.DeclaredVariableContext ctx) { 
				//System.out.println("I visited visitDeclaredVariable");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitVariable(CompilersParser.VariableContext ctx) { 
				String Key = ctx.getText()+Integer.toString(EnvironmentCounter);
				String[] SymbolInformation = SymbolTable.get(Key);
				return SymbolInformation[1];
	}
	
	@Override 
	public String visitArrayVariable(CompilersParser.ArrayVariableContext ctx) { 
				//System.out.println("I visited visitArrayVariable");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitExpressionInP(CompilersParser.ExpressionInPContext ctx) { 
				//System.out.println("I visited visitExpressionInP");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitNExpression(CompilersParser.NExpressionContext ctx) { 
				//System.out.println("I visited visitNExpression");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitExpression(CompilersParser.ExpressionContext ctx) { 
				//System.out.println("I visited visitOrExpression");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitAndExpression(CompilersParser.AndExpressionContext ctx) { 
				//System.out.println("I visited visitAndExpression");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitEqualsExpression(CompilersParser.EqualsExpressionContext ctx) { 
				//System.out.println("I visited visitEqualsExpression");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitRelationExpression(CompilersParser.RelationExpressionContext ctx) { 
				//System.out.println("I visited visitRelationExpression");
				//System.out.println(ctx.getText());
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitAddSubsExpression(CompilersParser.AddSubsExpressionContext ctx) { 
				//System.out.println("I visited visitAddSubsExpression");
				//System.out.println("Imprimiendo" + ctx.getChild(0).getText());
				String type = null;
				if(ctx.children.size()>1){
					for(int i =0;i<ctx.children.size();i++){
						if(i % 2 == 0){
							if(type==null){
								type = visit(ctx.getChild(i));
							}
							else if(type.equals(visit(ctx.getChild(i)))&&(!ctx.getChild(i).equals("boolean")));
							else{
								return "Error de asignacion en la linea "+ctx.getStart().getLine();
								}
									  }
															}
								return type;
										 }
				else{
					return visit(ctx.getChild(0));
				}
	}
	
	@Override 
	public String visitMulDivExpression(CompilersParser.MulDivExpressionContext ctx) { 
				//System.out.println("I visited visitMulDivExpression");
		String type = null;
		if(ctx.children.size()>1){
			for(int i =0;i<ctx.children.size();i++){
				if(i % 2 == 0){
					if(type==null){
						type = visit(ctx.getChild(i));
					}
					else if(type.equals(visit(ctx.getChild(i)))&&(!ctx.getChild(i).equals("boolean")));
					else{
						return "Error de asignacion en la linea "+ctx.getStart().getLine();
						}
							  }
													}
						return type;
								 }
		else{
			return visit(ctx.getChild(0));
		}
	}
	
	@Override 
	public String visitPrExpression(CompilersParser.PrExpressionContext ctx) { 
				//System.out.println("I visited visitPrExpression");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitBasicExpression(CompilersParser.BasicExpressionContext ctx) { 
				//System.out.println("I visited visitBasicExpression");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitBasic(CompilersParser.BasicContext ctx) { 
				//System.out.println("I visited visitBasic");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitArg(CompilersParser.ArgContext ctx) { 
				//System.out.println("I visited visitArg");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitMethodCall(CompilersParser.MethodCallContext ctx) { 
				//System.out.println("I visited visitDeclaredMethodCall");
				String ctxString = ctx.getText();
				//System.out.println("******************************************");
				for (Map.Entry<String,String[]> e : SymbolTable.entrySet()){
					if (e.getKey().startsWith("suma")) {
						String[] SymbolInformation = SymbolTable.get(e.getKey());
						String answer = ctxString.substring(ctxString.indexOf("(")+1,ctxString.indexOf(")"));
						if(SymbolInformation[3].equals(answer)){
							return SymbolInformation[1];
						}
					  }
				}
				//System.out.println("******************************************");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitAs_op(CompilersParser.As_opContext ctx) { 
				//System.out.println("I visited visitAs_op");
				//System.out.println(ctx.getText());
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitMd_op(CompilersParser.Md_opContext ctx) { 
				//System.out.println("I visited visitMd_op");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitPr_op(CompilersParser.Pr_opContext ctx) { 
				//System.out.println("I visited visitPr_op");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitRel_op(CompilersParser.Rel_opContext ctx) { 
				//System.out.println("I visited visitRel_op");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitEq_op(CompilersParser.Eq_opContext ctx) { 
				//System.out.println("I visited visitEq_op");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitCond_op(CompilersParser.Cond_opContext ctx) { 
				//System.out.println("I visited visitCond_op");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitLiteral(CompilersParser.LiteralContext ctx) { 
				//System.out.println("I visited visitLiteral");
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitInt_literal(CompilersParser.Int_literalContext ctx) { 
				//System.out.println("I visited visitInt_literal");
				return "int"; 
	}
	
	@Override 
	public String visitChar_literal(CompilersParser.Char_literalContext ctx) { 
				//System.out.println("I visited visitChar_literal");
				return "char"; 
	}
	
	@Override 
	public String visitBool_literal(CompilersParser.Bool_literalContext ctx) { 
				//System.out.println("I visited visitBool_literal");
				return "boolean"; 
	}

}
