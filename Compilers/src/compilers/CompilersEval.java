package compilers;
import java.util.*;

import javax.swing.JOptionPane;

import com.sun.xml.internal.ws.util.StringUtils;

public class CompilersEval extends CompilersBaseVisitor<String> {
	public int EnvironmentCounter = 0;
	public String EnvironmentName = "";
	public String ParentName = "";
	//public Map<String,String[]> SymbolTable = new HashMap<String,String[]>();	
	public Map<String,LinkedHashMap<String,String[]>> GlobalTable = new LinkedHashMap<String,LinkedHashMap<String,String[]>>();
	
	@Override 
	public String visitProgram(CompilersParser.ProgramContext ctx) { 
		//System.out.println("I visited visitProgram");
		EnvironmentName = ctx.getChild(1).getText() + Integer.toString(EnvironmentCounter);
		GlobalTable.put(EnvironmentName,new LinkedHashMap<String,String[]>());
		Map<String,String[]> SymbolTable = GlobalTable.get(EnvironmentName);
		String[] SymbolInformation = {ctx.getChild(1).getText(),"",Integer.toString(EnvironmentCounter)};
		SymbolTable.put(ctx.getChild(1).getText() + Integer.toString(EnvironmentCounter), SymbolInformation);
		visitChildren(ctx);
		return "";
	}
	
	@Override 
	public String visitVarDeclaration(CompilersParser.VarDeclarationContext ctx) { 
		//System.out.println("I visited visitVarDeclaration");
		Map<String,String[]> SymbolTable = GlobalTable.get(EnvironmentName);
		if(SymbolTable.containsKey(ctx.getChild(1).getText() + Integer.toString(EnvironmentCounter))){
			String Error = "Variable  "+ ctx.getChild(1).getText() +" is already declared at line "+ ctx.getStart().getLine() + " on method visitVarDeclaration";
			JOptionPane.showMessageDialog(null, Error, "ERROR", JOptionPane.INFORMATION_MESSAGE);
		}
		else{
		String[] SymbolInformation = {ctx.getChild(1).getText(),ctx.getChild(0).getText(),Integer.toString(EnvironmentCounter)};
		SymbolTable.put(ctx.getChild(1).getText() + Integer.toString(EnvironmentCounter), SymbolInformation);
		}
		return visitChildren(ctx); 
		
	}
	
	@Override 
	public String visitStructDeclaration(CompilersParser.StructDeclarationContext ctx) { 
				//System.out.println("I visited visitStructDeclaration");
				Map<String,String[]> SymbolTable = GlobalTable.get(EnvironmentName);
				if(SymbolTable.containsKey(ctx.getChild(1).getText())){
					String Error = "Struc  "+ ctx.getChild(1).getText() +" is already declared at line "+ ctx.getStart().getLine() + " on method visitVarDeclaration";
					JOptionPane.showMessageDialog(null, Error, "ERROR", JOptionPane.INFORMATION_MESSAGE);
				}
				else{
				String[] SymbolInformation = {ctx.getChild(1).getText(),"struc",Integer.toString(EnvironmentCounter)};
				SymbolTable.put(ctx.getChild(1).getText(), SymbolInformation);
				}
				EnvironmentCounter = EnvironmentCounter + 1;
				ParentName = EnvironmentName;
				EnvironmentName = ctx.getChild(1).getText() + Integer.toString(EnvironmentCounter);
				GlobalTable.put(EnvironmentName,new LinkedHashMap<String,String[]>());
				visitChildren(ctx);
				EnvironmentName = ParentName;
				return ""; 
	}
	
	@Override 
	public String visitMethodDeclaration(CompilersParser.MethodDeclarationContext ctx) { 
				//System.out.println("I visited visitMethodDeclaration");
				//System.out.println(ctx.getText());
				Map<String,String[]> SymbolTable = GlobalTable.get(EnvironmentName);
				String Cadena = "";
				boolean insert = true;
				for(int i=3; i<ctx.children.size()-2;i++){
					try{
						Cadena = Cadena + "," + ctx.getChild(i).getChild(0).getText();
						}
					catch(Exception e){}
				}
				try{
				Cadena = Cadena.substring(1,Cadena.length());}catch(Exception e){}
				String[] Sample = null;
				for (Map.Entry<String,String[]> e : SymbolTable.entrySet()){
					if (e.getKey().startsWith(ctx.getChild(1).getText())) {
						Sample = SymbolTable.get(e.getKey());
						int TypeOfNewMethodint =0;
						int TypeOfNewMethodbool =0;
						int TypeOfNewMethodchar =0;
						int TypeOfTableMethodint =0;
						int TypeOfTableMethodbool =0;
						int TypeOfTableMethodchar =0;
						String[] TypeOfNewMethod = Cadena.split(",");
						String[] TypeOfTableMethod = Sample[3].split(",");
						for(int i=0;i<TypeOfNewMethod.length;i++){
							if(TypeOfNewMethod[i].equals("int")){
								TypeOfNewMethodint += 1;
							}
							if(TypeOfNewMethod[i].equals("char")){
								TypeOfNewMethodchar += 1;
							}
							if(TypeOfNewMethod[i].equals("boolean")){
								TypeOfNewMethodbool += 1;
							}
							if(TypeOfTableMethod[i].equals("int")){
								TypeOfTableMethodint += 1;
							}
							if(TypeOfNewMethod[i].equals("char")){
								TypeOfTableMethodchar += 1;
							}
							if(TypeOfNewMethod[i].equals("boolean")){
								TypeOfTableMethodbool += 1;
							}
						}
						if(TypeOfNewMethodint==TypeOfTableMethodint && TypeOfNewMethodbool==TypeOfTableMethodbool && TypeOfNewMethodchar==TypeOfTableMethodchar && Sample[0].equals(ctx.getChild(1).getText())){
							insert = false;
						}
					}
				}
				if(insert==true){
				String[] SymbolInformation = {ctx.getChild(1).getText(),ctx.getChild(0).getText(),Integer.toString(EnvironmentCounter), Cadena};
				SymbolTable.put(ctx.getChild(1).getText() + Integer.toString(EnvironmentCounter), SymbolInformation);
				EnvironmentCounter = EnvironmentCounter + 1;
				ParentName = EnvironmentName;
				EnvironmentName = ctx.getChild(1).getText() + Integer.toString(EnvironmentCounter);
				GlobalTable.put(EnvironmentName,new LinkedHashMap<String,String[]>());
				visitChildren(ctx);
				EnvironmentName = ParentName;
				}
				else{
					String Error = "Method "+ ctx.getChild(1).getText() +" is already declared at line "+ ctx.getStart().getLine() + " on method visitMethodDeclaration";
					JOptionPane.showMessageDialog(null, Error, "ERROR", JOptionPane.INFORMATION_MESSAGE);
				}
				return ""; 
	}
	
	@Override 
	public String visitParameterDeclaration(CompilersParser.ParameterDeclarationContext ctx) { 
		Map<String,String[]> LocalTable = GlobalTable.get(EnvironmentName);
		if(LocalTable.containsKey(ctx.getChild(1).getText() + Integer.toString(EnvironmentCounter))){
			String Error = "Parameter  "+ ctx.getChild(1).getText() +" is already declared at line "+ ctx.getStart().getLine() + " on method visitVarDeclaration";
			JOptionPane.showMessageDialog(null, Error, "ERROR", JOptionPane.INFORMATION_MESSAGE);
		}
		else{
		String[] SymbolInformation = {ctx.getChild(1).getText(),ctx.getChild(0).getText(),Integer.toString(EnvironmentCounter)};
		LocalTable.put(ctx.getChild(1).getText() + Integer.toString(EnvironmentCounter), SymbolInformation);
		}
		return visitChildren(ctx); 
	}
	
	@Override 
	public String visitParameterType(CompilersParser.ParameterTypeContext ctx) { 
				//System.out.println("I visited visitParameterDeclaration");
				return ctx.getText(); 
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
		Map<String,String[]> SymbolTable = GlobalTable.get(EnvironmentName);
				try{
					String TypeRight = "";
					String TypeLeft = "";
					String MethodNameRight = ctx.getChild(2).getText();
					if(MethodNameRight.contains("(")){
						MethodNameRight = ctx.getChild(2).getText().substring(0, ctx.getChild(2).getText().indexOf("("));
					}
					if(MethodNameRight.contains("[")){
						MethodNameRight = ctx.getChild(2).getText().substring(0, ctx.getChild(2).getText().indexOf("["));
					}
					TypeRight = VisitSymbolTable(MethodNameRight,EnvironmentName);
					if(TypeRight.equals("")){
						TypeRight = visit(ctx.getChild(2));
					}
					String MethodNameLeft = ctx.getChild(0).getText();
					if(MethodNameLeft.contains("(")){
						MethodNameLeft = ctx.getChild(0).getText().substring(0, ctx.getChild(0).getText().indexOf("("));
					}
					if(MethodNameLeft.contains("[")){
						MethodNameLeft = ctx.getChild(0).getText().substring(0, ctx.getChild(0).getText().indexOf("["));
					}
					TypeLeft = VisitSymbolTable(MethodNameLeft,EnvironmentName);
					if(TypeLeft.equals("")){
						TypeLeft = visit(ctx.getChild(0));
					}
				if(!(TypeLeft.equals(TypeRight))){
					String Error = "The type for "+ ctx.getChild(0).getText() +" and the type of " + ctx.getChild(2).getText() + " is not the same at line "+ ctx.getStart().getLine() + " on method visitAssignation";
					JOptionPane.showMessageDialog(null, Error, "ERROR", JOptionPane.INFORMATION_MESSAGE);
				}}
				catch(Exception e){
					try{
						String TypeForMethod = "";
						String[] MethodInformation = null;
						String NameOfMethod = ctx.getChild(2).getText().substring(0, ctx.getChild(2).getText().indexOf("("));
						for (Map.Entry<String,String[]> es : SymbolTable.entrySet()){
							if (es.getKey().startsWith(NameOfMethod)) {
								MethodInformation = SymbolTable.get(es.getKey());
								TypeForMethod = MethodInformation[1];
							}
							}
						if(!(visit(ctx.getChild(0)).equals(TypeForMethod))){
							String Error = "The type for "+ ctx.getChild(0).getText() +" and the type of " + ctx.getChild(2).getText() + " is not the same at line "+ ctx.getStart().getLine() + " on method visitAssignation";
							JOptionPane.showMessageDialog(null, Error, "ERROR", JOptionPane.INFORMATION_MESSAGE);
						}
					}catch(Exception e1){}
				}
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitWhileBlock(CompilersParser.WhileBlockContext ctx) {
				EnvironmentCounter = EnvironmentCounter + 1;
				
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
	public String visitIfBlock(CompilersParser.IfBlockContext ctx) { 
				EnvironmentCounter = EnvironmentCounter + 1;
				//System.out.println("I visited visitMyIf");
				//System.out.println(ctx.getText());
				return visitChildren(ctx); 
	}
	
	@Override 
	public String visitElseBlock(CompilersParser.ElseBlockContext ctx) { 
				EnvironmentCounter = EnvironmentCounter + 1;
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
				Map<String,String[]> SymbolTable = GlobalTable.get(EnvironmentName);
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
		Map<String,String[]> SymbolTable = GlobalTable.get(EnvironmentName);
		String type = VisitSymbolTable(ctx.getText(),EnvironmentName);
		if(type.equals("")){
			String errorMessage = "Variable "+ ctx.getText() +" NOT declared at line " + ctx.getStart().getLine() + " on method visitVariable";
			JOptionPane.showMessageDialog(null, errorMessage, "ERROR", JOptionPane.INFORMATION_MESSAGE);
			return null;
		}
		else{
			return type;
		}
		
	}
	
	@Override 
	public String visitArrayVariable(CompilersParser.ArrayVariableContext ctx) { 
		//System.out.println("I visited visitArrayVariable");
		if(!(visit(ctx.getChild(2)).equals("int"))){
			String errorMessage = "The asignation on array "+ ctx.getChild(0).getText() +" doesnt have an int inside [] at line " + ctx.getStart().getLine() + " on method visitArrayVariable";
			JOptionPane.showMessageDialog(null, errorMessage, "ERROR", JOptionPane.INFORMATION_MESSAGE);
		}
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
	public String visitOrExpression(CompilersParser.OrExpressionContext ctx) { 
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
				if(ctx.children.size()>1){
					if(visit(ctx.getChild(0)).equals(visit(ctx.getChild(2)))){
						return visit(ctx.getChild(2));
					}
					else{
						String errorMessage = "The type for " + ctx.getChild(0) + " and the type for " + ctx.getChild(2) + " are not the same at line " + ctx.getStart().getLine();
						JOptionPane.showMessageDialog(null, errorMessage, "ERROR", JOptionPane.INFORMATION_MESSAGE);
					}
				}
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
				String type = null;
				if(ctx.children.size()>1){
					for(int i =0;i<ctx.children.size();i++){
						if(i % 2 == 0){
							if(type==null){
								//System.out.println("prueba " + ctx.getChild(i).getText());
								//System.out.println("type " + visit(ctx.getChild(i)));
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
	public String visitDeclaredMethodCall(CompilersParser.DeclaredMethodCallContext ctx) { 
		//System.out.println("I visited visitMethodCall");
		//System.out.println("This is CTX " + ctx.getText());
		String MethodName = ctx.getText();
		MethodName = MethodName.substring(0,MethodName.indexOf("("));
		String MethodType = VisitSymbolTable(MethodName,EnvironmentName);
		if(MethodType.equals("")){
			MethodType = BringMethodType(MethodName);
		}
		if(MethodType.equals("")){
			String errorMessage = "The method " + MethodName + " is not declared at line " + ctx.getStart().getLine();
			JOptionPane.showMessageDialog(null, errorMessage, "ERROR", JOptionPane.INFORMATION_MESSAGE);
		}
		String ParametersType = "";
		for(int i=2;i<ctx.children.size();i=i+2){
			ParametersType = ParametersType + "," + visit(ctx.getChild(i).getChild(0));
		}
		ParametersType = ParametersType.substring(1, ParametersType.length());
		String ParametersSimbolTable = BringParametersType(MethodName);
		//if(ParametersSimbolTable.equals("")){
		//	ParametersSimbolTable = BringParametersType(MethodName);
		//}
		if(!(ParametersType.equals(ParametersSimbolTable))){
			String errorMessage = "Sending a diferent number of parameters in method " + MethodName + " at line " + ctx.getStart().getLine();
			JOptionPane.showMessageDialog(null, errorMessage, "ERROR", JOptionPane.INFORMATION_MESSAGE);
		}
		return MethodType; 
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
	
	public String VisitSymbolTable(String Key,String ScopeName){
		Map<String,String[]> SymbolTable = GlobalTable.get(ScopeName);
		String[] Information = null;
		for (Map.Entry<String,String[]> e : SymbolTable.entrySet()){
			//System.out.println("SymbolTable " + e.getKey());
			if (e.getKey().startsWith(Key)) {
				Information = SymbolTable.get(e.getKey());
				return Information[1];
			}
			
		}
	
		return "";
	}
	
	public String getTypeParameters(String Key, String ScopeName){
		Map<String,String[]> SymbolTable = GlobalTable.get(ScopeName);
		String[] Information = null;
		for (Map.Entry<String,String[]> e : SymbolTable.entrySet()){
			if (e.getKey().startsWith(Key)) {
				Information = SymbolTable.get(e.getKey());
				return Information[3];
			}
			
		}
		return "";
	}
	
	public String BringMethodType(String MethodName){
		for (Map.Entry<String,LinkedHashMap<String,String[]>> e : GlobalTable.entrySet()){
			if (e.getKey().startsWith("program")) {
				Map<String,String[]> MethodInformation = GlobalTable.get(e.getKey());
				for(Map.Entry<String, String[]> entry : MethodInformation.entrySet()){
					if(entry.getKey().startsWith(MethodName)){
						String[] Information = MethodInformation.get(entry.getKey());
						return Information[1];
					}
				}
			}
			
		}
		return "";
	}
	
	public String BringParametersType(String MethodName){
		for (Map.Entry<String,LinkedHashMap<String,String[]>> e : GlobalTable.entrySet()){
			//System.out.println("SymbolTable " + e.getKey());
			if (e.getKey().startsWith("program")) {
				Map<String,String[]> MethodInformation = GlobalTable.get(e.getKey());
				for(Map.Entry<String, String[]> entry : MethodInformation.entrySet()){
					if(entry.getKey().startsWith(MethodName)){
						String[] Information = MethodInformation.get(entry.getKey());
						return Information[3];
					}
				}
			}
			
		}
		return "";
	}

}