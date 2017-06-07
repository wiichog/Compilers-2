package compilers;
import java.util.*;
import java.io.*;

public class CompilersMidCode extends CompilersBaseVisitor<String> {
	public Map<String,LinkedHashMap<String,String[]>> Methods = new LinkedHashMap<String,LinkedHashMap<String,String[]>>();
	public Map<String,LinkedHashMap<String,String[]>> SymbolTable = new LinkedHashMap<String,LinkedHashMap<String,String[]>>();
	public ArrayList<String> MethodName = new ArrayList<String>();
	public Stack<String> TemporalStack = new Stack<String>();
	public String EnvironmentName = "";
	public String ParentName = "";
	public int AssignationCounter = 0;
	public int TemporalCounter = 0;
	public int IfCounter= 0;
	public int WhileCounter = 0;
	public int OffSet = 0;
	public int LabelCounter = 0;
	public boolean IfFlag = false;
	public boolean Flag = false;
	public boolean Arg=false;
	public boolean WhileFlag=false;
	public String TempParent = "";
	public Stack<String> End = new Stack<String>();
	public BufferedWriter bw;
	public Map<String,String> OffsetVariable = new LinkedHashMap<String,String>();
	
	public CompilersMidCode(Map<String, LinkedHashMap<String, String[]>> mapTree){
		this.SymbolTable = mapTree;	
		try{bw = new BufferedWriter(new FileWriter(new File("MidCode.md")));}
		catch(Exception e){}
	}
	
	@Override 
	public String visitProgram(CompilersParser.ProgramContext ctx) { 
		try{
		AssignationCounter=0;
		EnvironmentName = ctx.getChild(1).getText();
		MethodName.add(EnvironmentName);
		ParentName = EnvironmentName;
		Methods.put(EnvironmentName,new LinkedHashMap<String,String[]>());
		ParentName = EnvironmentName;
		visitChildren(ctx);
		bw.close();
		}catch(Exception e){}
 		return ""; 
	}
	
	@Override 
	public String visitStructDeclaration(CompilersParser.StructDeclarationContext ctx){ 
 		//System.out.println("I visited visitStructDeclaration");
 		//System.out.println("This is ctx " + ctx.getText());
		AssignationCounter=0;
		EnvironmentName = ctx.getChild(1).getText();
		MethodName.add(EnvironmentName);
		ParentName = EnvironmentName;
		Methods.put(EnvironmentName,new LinkedHashMap<String,String[]>());
		ParentName = EnvironmentName;
		visitChildren(ctx);
 		return ""; 
 }
	
	@Override 
	public String visitMethodDeclaration(CompilersParser.MethodDeclarationContext ctx){ 
 		//System.out.println("I visited visitMethodDeclaration");
 		//System.out.println("This is ctx " + ctx.getText());
		try{
		bw.write("\n");
		bw.write("FUNCTION " + ctx.getChild(1).getText() + ":\n");
		AssignationCounter = 0;
		EnvironmentName = ctx.getChild(1).getText();
		MethodName.add(EnvironmentName);
		Methods.put(EnvironmentName,new LinkedHashMap<String,String[]>());
		ParentName = EnvironmentName;
		visitChildren(ctx);
		bw.write("END FUNCTION " + ctx.getChild(1).getText() + "\n");
		}
		catch(Exception e){}
 		return ""; 
 }

	@Override 
	public String visitVarDeclaration(CompilersParser.VarDeclarationContext ctx){ 
 		//System.out.println("I visited visitVarDeclaration");
 		//System.out.println("This is ctx " + ctx.getText());
		//try{
		//Map<String,String[]> Quadruplets = Methods.get(EnvironmentName);
		//if(ctx.children.size()<4){
		//	AssignationCounter++;
		//	bw.write("t"+Integer.toString(TemporalCounter) + " = " + "fp[" + OffSet + "]" +" == 0; \n");
		//	TemporalCounter ++;
			if(ctx.getChild(0).getChild(0).getText().equals("int")){
				OffSet = OffSet +8;
			}
			else if(ctx.getChild(0).getChild(0).getText().equals("char")){
				OffSet = OffSet +4;
			}
			else if(ctx.getChild(0).getChild(0).getText().equals("boolean")){
				OffSet = OffSet +1;
			}
		//	String[] Triplet = {ctx.getChild(1).getText(),"","0"};
		//	Quadruplets.put(Integer.toString(AssignationCounter) + "," + ctx.getChild(0).getText()+","+"=", Triplet);
		//}
		//}
		//catch(Exception e){}
 		return visitChildren(ctx); 
 }
	
	
	
	@Override 
	public String visitParameterDeclaration(CompilersParser.ParameterDeclarationContext ctx){ 
 		//System.out.println("I visited visitParameterDeclaration");
 		//System.out.println("This is ctx " + ctx.getText());
		//try{
		//AssignationCounter++;
		//bw.write("t"+Integer.toString(TemporalCounter) + " = " + "fp[" + OffSet + "]" +" == 0; \n");
		//TemporalCounter ++;
		//if(ctx.getChild(0).getChild(0).getText().equals("int")){
		//	OffSet = OffSet +8;
		//}
		//else if(ctx.getChild(0).getChild(0).getText().equals("char")){
		///	OffSet = OffSet +4;
		//}
		//else if(ctx.getChild(0).getChild(0).getText().equals("boolean")){
		//	OffSet = OffSet +1;
		//}}
		//catch(Exception e){}
 		return visitChildren(ctx); 
 }
	
	
	@Override
	public String visitAssignation(CompilersParser.AssignationContext ctx){ 
		//System.out.println("I visited visitAssignation");
 		//System.out.println("This is ctx " + ctx.getText());
		Map<String,String[]> Quadruplets = Methods.get(EnvironmentName);
	 	if(ctx.getChild(2).getText().contains("(") && ctx.getChild(2).getText().contains("[")){
			visitChildren(ctx);
			AssignationCounter++;
			String[] Triplet1 = {"T"+Integer.toString(TemporalCounter-1),"",ctx.getChild(2).getText()};
			Quadruplets.put(Integer.toString(AssignationCounter) + "," + ctx.getChild(0).getText()+","+"=", Triplet1);
		}
		else if(ctx.getChild(2).getText().contains("(") && !(ctx.getChild(0).getText().contains("["))){//
			visitChildren(ctx);
		}
		else if(ctx.getChild(0).getText().contains("[") && !(ctx.getChild(2).getText().contains("["))){//y[4] = 1;
			visitChildren(ctx);
			AssignationCounter++;
			String[] Triplet1 = {"T"+Integer.toString(TemporalCounter),"",ctx.getChild(2).getText()};
			Quadruplets.put(Integer.toString(AssignationCounter) + "," + ctx.getChild(0).getText()+","+"=", Triplet1);
		}
		else if(ctx.getChild(2).getText().contains("[") && !(ctx.getChild(0).getText().contains("["))){//a = y[5]
			visitChildren(ctx);
			AssignationCounter++;
			String[] Triplet1 = {ctx.getChild(0).getText(),"","T"+Integer.toString(TemporalCounter)};
			Quadruplets.put(Integer.toString(AssignationCounter) + "," + ctx.getChild(0).getText()+","+"=", Triplet1);
		}	
		else if(ctx.getChild(2).getText().contains("[") && (ctx.getChild(0).getText().contains("["))){//y[4] = y[1];
			visitChildren(ctx);
			TemporalCounter ++;
			AssignationCounter++;
			String[] Triplet = {"T"+Integer.toString(TemporalCounter-2),"T"+Integer.toString(TemporalCounter-1),"T"+Integer.toString(TemporalCounter)};
			Quadruplets.put(Integer.toString(AssignationCounter) + "," + ctx.getChild(0).getText()+","+"+", Triplet);
			AssignationCounter++;
			String[] Triplet1 = {"T"+Integer.toString(TemporalCounter-3),"","T"+Integer.toString(TemporalCounter)};
			Quadruplets.put(Integer.toString(AssignationCounter) + "," + ctx.getChild(0).getText()+","+"+", Triplet1);
		}
		else{//
			
			TemporalCounter ++;
			AssignationCounter++;
			try{
				bw.write("\t"+bringOffsetVariable(ctx.getChild(0).getText()) + ctx.getChild(1).getText() + ctx.getChild(2).getText() + "; \n");
			}
			catch(Exception e){
				
			}
			visitChildren(ctx);
			String[] Triplet = {ctx.getChild(0).getText(),"",ctx.getChild(2).getText()};
			Quadruplets.put(Integer.toString(AssignationCounter) + "," + ctx.getChild(1).getText()+","+"=", Triplet);
		}
 		return ""; 
 }
	
	@Override 
	public String visitWhileBlock(CompilersParser.WhileBlockContext ctx){ 
 		//System.out.println("I visited visitWhileBlock");
 		//System.out.println("This is ctx " + ctx.getText());
		try{
		WhileCounter++;
		AssignationCounter++;
		String Name = "";
		Name = ParentName + "," + "while" + WhileCounter  + "," + ctx.getChild(2).getText();
 		Methods.put(Name,new LinkedHashMap<String,String[]>());
 		Map<String,String[]> Quadruplets = Methods.get(Name);
 		String[] Triplet = {ctx.getChild(0).getText(),"",ctx.getChild(2).getText()};
		Quadruplets.put(Integer.toString(AssignationCounter) + "," + ctx.getChild(1).getText()+","+"=", Triplet);
		EnvironmentName = Name;
		bw.write("STARTWHILE_" + WhileCounter + ";\n");
		WhileFlag=true;
		visitChildren(ctx);
		bw.write("ENDWHILE_" + WhileCounter+ ";\n");
		}
		catch(Exception e){}
 		return ""; 
 }
	
	@Override 
	public String visitReturnBlock(CompilersParser.ReturnBlockContext ctx){ 
 		//System.out.println("I visited visitReturnBlock");
 		//System.out.println("This is ctx " + ctx.getText());
		try{
		Map<String,String[]> Quadruplets = Methods.get(EnvironmentName);
		AssignationCounter++;
		String[] Triplet = {"","",ctx.getChild(1).getText()};
		bw.write("RETURN " + ctx.getChild(1).getText() + "\n");
		Quadruplets.put(Integer.toString(AssignationCounter) + "," + ctx.getChild(1).getText()+","+"RETURN", Triplet);
		}
		catch(Exception e){
			
		}
 		return visitChildren(ctx); 
 }
	
	
	@Override 
	public String visitIfBlock(CompilersParser.IfBlockContext ctx){ 
 		//System.out.println("I visited visitIfBlock");
 		//System.out.println("This is ctx " + ctx.getText());
		try{
		IfCounter ++;
		LabelCounter ++;
		TempParent = ParentName;
		ParentName = ParentName + "," + "if" + IfCounter  + "," + ctx.getChild(2).getText();
 		Methods.put(ParentName,new LinkedHashMap<String,String[]>());
 		Flag=true;
 		visit(ctx.getChild(2));
 		Flag=false;
 		IfFlag = true;
 		bw.write("\t"+"IF t" + TemporalCounter + " > " + 0 + " GOTO LABEL_TRUE_"+ LabelCounter + "\n");
 		bw.write("\t"+"GOTO LABEL_FALSE_"+ LabelCounter + "\n");
 		visitChildren(ctx);
 		bw.write("\t"+"ENDIF_"+ IfCounter +"\n");
 		//EnvironmentName = ParentName;
 		ParentName = TempParent;
 		ParentName = ParentName + "," + "else"+ IfCounter + "," + ctx.getChild(2).getText();
 		}
		catch(Exception e){}
 		//ParentName=TempParent;
 		return ""; 
 }
	
	@Override 
	public String visitElseBlock(CompilersParser.ElseBlockContext ctx){ 
 		//System.out.println("I visited visitElseBlock");
 		//System.out.println("This is ctx " + ctx.getText());
		try{
			bw.write("LABEL_FALSE_"+ LabelCounter + ":\n");
			visitChildren(ctx);
			bw.write("\t"+"GOTO END_IF"+ IfCounter + "\n");
		}
		catch(Exception e){
			
		}
 		Methods.put(ParentName,new LinkedHashMap<String,String[]>());
 		//EnvironmentName = ParentName;

 		ParentName = TempParent;
 		return ""; 
 }
	
	@Override 
	public String visitDeclaration(CompilersParser.DeclarationContext ctx){ 
 		//System.out.println("I visited visitDeclaration");
 		//System.out.println("This is ctx " + ctx.getText());
		return visitChildren(ctx); 
 }
	
	@Override 
	public String visitVarType(CompilersParser.VarTypeContext ctx){ 
 		//System.out.println("I visited visitVarType");
 		//System.out.println("This is ctx " + ctx.getText());
 		return visitChildren(ctx); 
 }
	
	
	
	@Override 
	public String visitMethodType(CompilersParser.MethodTypeContext ctx){ 
 		//System.out.println("I visited visitMethodType");
 		//System.out.println("This is ctx " + ctx.getText());
 		return visitChildren(ctx); 
 }
	
	@Override 
	public String visitParameterType(CompilersParser.ParameterTypeContext ctx){ 
 		//System.out.println("I visited visitParameterType");
 		//System.out.println("This is ctx " + ctx.getText());
 		return visitChildren(ctx); 
 }
	
	@Override 
	public String visitBlock(CompilersParser.BlockContext ctx){ 
 		//System.out.println("I visited visitBlock");
 		//System.out.println("This is ctx " + ctx.getText());
		try{
			if(IfFlag==true){
				bw.write("LABEL_TRUE_"+ LabelCounter + ":\n");
				visitChildren(ctx);
				bw.write("\t"+"GOTO END_IF"+ IfCounter + "\n");
				IfFlag=false;	
			}
			if(WhileFlag==true){
				LabelCounter++;
				bw.write("\t"+"IF t" + TemporalCounter + " > " + 0 + " GOTO LABEL_TRUE_"+ LabelCounter + "\n");
		 		bw.write("\t"+"GOTO LABEL_FALSE_"+ LabelCounter + "\n");
				visitChildren(ctx);
				bw.write("\t"+"GOTO ENDWHILE_"+ WhileCounter + "\n");
				WhileFlag=false;	
			}
			else{
				visitChildren(ctx);
			}
		}
		catch(Exception e){
			
		}
 		return ""; 
 }
	
	@Override 
	public String visitStatement(CompilersParser.StatementContext ctx){ 
 		//System.out.println("I visited visitStatement");
 		//System.out.println("This is ctx " + ctx.getText());
 		return visitChildren(ctx); 
 }
	
	@Override 
	public String visitPrint(CompilersParser.PrintContext ctx){ 
 		//System.out.println("I visited visitPrint");
 		//System.out.println("This is ctx " + ctx.getText());
 		return visitChildren(ctx); 
 }
	
	@Override 
	public String visitScan(CompilersParser.ScanContext ctx){ 
 		//System.out.println("I visited visitScan");
 		//System.out.println("This is ctx " + ctx.getText());
 		return visitChildren(ctx); 
 }
	
	@Override 
	public String visitElseTailBlock(CompilersParser.ElseTailBlockContext ctx){ 
 		//System.out.println("I visited visitElseTailBlock");
 		//System.out.println("This is ctx " + ctx.getText());
 		return visitChildren(ctx);
 }
	
	@Override 
	public String visitLocation(CompilersParser.LocationContext ctx){ 
 		//System.out.println("I visited visitLocation");
 		//System.out.println("This is ctx " + ctx.getText());
 		return visitChildren(ctx); 
 }
	
	@Override 
	public String visitDotLocation(CompilersParser.DotLocationContext ctx){ 
 		//System.out.println("I visited visitDotLocation");
 		//System.out.println("This is ctx " + ctx.getText());
 		return visitChildren(ctx); 
 }
	
	@Override 
	public String visitDeclaredVariable(CompilersParser.DeclaredVariableContext ctx){ 
 		//System.out.println("I visited visitDeclaredVariable");
 		//System.out.println("This is ctx " + ctx.getText());
 		return visitChildren(ctx); 
 }
	
	@Override 
	public String visitVariable(CompilersParser.VariableContext ctx){ 
 		//System.out.println("I visited visitVariable");
 		//System.out.println("This is ctx " + ctx.getText());
 		return visitChildren(ctx); 
 }
	
	@Override 
	public String visitArrayVariable(CompilersParser.ArrayVariableContext ctx){ 
 		//System.out.println("I visited visitArrayVariable");
 		//System.out.println("This is ctx " + ctx.getText());
		Map<String,String[]> Quadruplets = Methods.get(EnvironmentName);
		TemporalCounter ++;
		AssignationCounter++;
		String[] Triplet = {ctx.getChild(2).getText(),"8","T"+Integer.toString(TemporalCounter)};
		Quadruplets.put(Integer.toString(AssignationCounter) + "," + ctx.getChild(0).getText()+","+"*", Triplet);
		return ""; 
 }
	
	@Override 
	public String visitExpressionInP(CompilersParser.ExpressionInPContext ctx){ 
 		//System.out.println("I visited visitExpressionInP");
 		//System.out.println("This is ctx " + ctx.getText());
 		return visitChildren(ctx); 
 }
	
	@Override 
	public String visitNExpression(CompilersParser.NExpressionContext ctx){ 
 		//System.out.println("I visited visitNExpression");
 		//System.out.println("This is ctx " + ctx.getText());
 		return visitChildren(ctx); 
 }
	
	@Override 
	public String visitOrExpression(CompilersParser.OrExpressionContext ctx){ 
 		//System.out.println("I visited visitOrExpression");
 		//System.out.println("This is ctx " + ctx.getText());
 		return visitChildren(ctx); 
 }
	
	@Override 
	public String visitAndExpression(CompilersParser.AndExpressionContext ctx){ 
 		//System.out.println("I visited visitAndExpression");
 		//System.out.println("This is ctx " + ctx.getText());
 		return visitChildren(ctx); 
 }
	
	@Override 
	public String visitEqualsExpression(CompilersParser.EqualsExpressionContext ctx){ 
 		//System.out.println("I visited visitEqualsExpression");
 		//System.out.println("This is ctx " + ctx.getText());
		try{
			if(ctx.children.size()>1){
				Map<String,String[]> Quadruplets = Methods.get(EnvironmentName);
				TemporalCounter ++;
				AssignationCounter++;
				String[] Triplet = {ctx.getChild(0).getText(),ctx.getChild(2).getText(),"T"+Integer.toString(TemporalCounter)};
				Quadruplets.put(Integer.toString(AssignationCounter) + "," + ctx.getChild(0).getText()+","+ctx.getChild(1).getText(), Triplet);
			if(ctx.children.size()>2 && Flag==true){
				bw.write("\t"+"t"+Integer.toString(TemporalCounter) + " = " + "fp[" + OffSet + "]" + ctx.getChild(1).getText() + ctx.getChild(2).getText() + "; \n");
			}
			}}
		catch(Exception e){}
 		return visitChildren(ctx); 
 }
	
	@Override 
	public String visitRelationExpression(CompilersParser.RelationExpressionContext ctx){ 
 		//System.out.println("I visited visitRelationExpression");
 		//System.out.println("This is ctx " + ctx.getText());
		try{
			if(ctx.children.size()>2){
				TemporalCounter++;
				bw.write("\t"+"t"+Integer.toString(TemporalCounter) + " = " + "fp[" + OffSet + "]" + ctx.getChild(1).getText() + ctx.getChild(2).getText() + "; \n");
				//IfFlag=true;
			}
		}
		catch(Exception e){}
 		return visitChildren(ctx); 
 }
	
	@Override 
	public String visitAddSubsExpression(CompilersParser.AddSubsExpressionContext ctx){ 
 		//System.out.println("I visited visitAddSubsExpression");
 		//System.out.println("This is ctx " + ctx.getText());
		visitChildren(ctx);
		try{
			if(TemporalStack.size()>1){
			TemporalCounter++;
			bw.write("\t"+"t"+Integer.toString(TemporalCounter) + " = " + TemporalStack.pop().toString() + " + " + TemporalStack.pop().toString() + "; \n");
		}}
		catch(Exception e){
			
		}
		return "";
 }
	
	@Override 
	public String visitMulDivExpression(CompilersParser.MulDivExpressionContext ctx){ 
 		//System.out.println("I visited visitMulDivExpression");
 		//System.out.println("This is ctx " + ctx.getText());
 		return visitChildren(ctx); 
 }
	
	@Override 
	public String visitPrExpression(CompilersParser.PrExpressionContext ctx){ 
 		//System.out.println("I visited visitPrExpression");
 		//System.out.println("This is ctx " + ctx.getText());
 		return visitChildren(ctx); 
 }
	
	@Override 
	public String visitBasicExpression(CompilersParser.BasicExpressionContext ctx){ 
 		//System.out.println("I visited visitBasicExpression");
 		//System.out.println("This is ctx " + ctx.getText());
 		return visitChildren(ctx); 
 }
	
	@Override 
	public String visitBasic(CompilersParser.BasicContext ctx){ 
 		//System.out.println("I visited visitBasic");
 		//System.out.println("This is ctx " + ctx.getText());
 		return visitChildren(ctx); 
 }
	
	@Override 
	public String visitArg(CompilersParser.ArgContext ctx){ 
 		//System.out.println("I visited visitArg");
 		//System.out.println("This is ctx " + ctx.getText());
		try{
			TemporalCounter ++;
			bw.write("\t"+"t"+Integer.toString(TemporalCounter) + " = " + bringOffsetVariable(ctx.getChild(0).getText()) + "; \n");
			bw.write("\t PARAM " +"t"+Integer.toString(TemporalCounter) + "; \n");
			TemporalStack.push("t"+Integer.toString(TemporalCounter));
			End.push("t"+Integer.toString(TemporalCounter));
			
		}
		catch(Exception e){
			
		}
		visitChildren(ctx);
		return ""; 
 }
	
	@Override 
	public String visitDeclaredMethodCall(CompilersParser.DeclaredMethodCallContext ctx){ 
 		//System.out.println("I visited visitDeclaredMethodCall");
 		//System.out.println("This is ctx " + ctx.getText());
 		//System.out.println("EnvironmentName " + EnvironmentName);
		visit(ctx.getChild(2));
		Map<String,String[]> Quadruplets = Methods.get(EnvironmentName);
		//visit(ctx.getChild(2));
		try{
			bw.write("\t CALL " + ctx.getChild(0).getText() + "; \n");
			for(int i=2;i<ctx.children.size();i=i+2){
				AssignationCounter++;
				TemporalCounter ++;
				String[] Triplet1 = {"","","T"+Integer.toString(TemporalCounter)};
				Quadruplets.put(Integer.toString(AssignationCounter) + "," + ctx.getChild(i).getText()+","+"PARAM", Triplet1);
			}
			
		}
		catch(Exception e){
		}
		
		AssignationCounter++;
		String[] Triplet = {"","",ctx.getChild(0).getText()};
		Quadruplets.put(Integer.toString(AssignationCounter) + "," + ctx.getChild(0).getText()+","+"CALL", Triplet);
 		return ""; 
 }
	
	@Override 
	public String visitAs_op(CompilersParser.As_opContext ctx){ 
 		//System.out.println("I visited visitAs_op");
 		//System.out.println("This is ctx " + ctx.getText());
 		return visitChildren(ctx); 
 }
	
	@Override 
	public String visitMd_op(CompilersParser.Md_opContext ctx){ 
 		//System.out.println("I visited visitMd_op");
 		//System.out.println("This is ctx " + ctx.getText());
 		return visitChildren(ctx); 
 }
	
	@Override 
	public String visitPr_op(CompilersParser.Pr_opContext ctx){ 
 		//System.out.println("I visited visitPr_op");
 		//System.out.println("This is ctx " + ctx.getText());
 		return visitChildren(ctx); 
 }
	
	@Override 
	public String visitRel_op(CompilersParser.Rel_opContext ctx){ 
 		//System.out.println("I visited visitRel_op");
 		//System.out.println("This is ctx " + ctx.getText());
 		return visitChildren(ctx); 
 }
	
	@Override 
	public String visitEq_op(CompilersParser.Eq_opContext ctx){ 
 		//System.out.println("I visited visitEq_op");
 		//System.out.println("This is ctx " + ctx.getText());
 		return ctx.getText(); 
 }
	
	@Override 
	public String visitCond_op(CompilersParser.Cond_opContext ctx){ 
 		//System.out.println("I visited visitCond_op");
 		//System.out.println("This is ctx " + ctx.getText());
 		return visitChildren(ctx); 
 }
	
	@Override 
	public String visitLiteral(CompilersParser.LiteralContext ctx){ 
 		//System.out.println("I visited visitLiteral");
 		//System.out.println("This is ctx " + ctx.getText());
 		return visitChildren(ctx); 
 }
	
	@Override 
	public String visitInt_literal(CompilersParser.Int_literalContext ctx){ 
 		//System.out.println("I visited visitInt_literal");
 		//System.out.println("This is ctx " + ctx.getText());
 		return visitChildren(ctx); 
 }
	
	@Override 
	public String visitChar_literal(CompilersParser.Char_literalContext ctx){ 
 		//System.out.println("I visited visitChar_literal");
 		//System.out.println("This is ctx " + ctx.getText());
 		return visitChildren(ctx); 
 }
	
	@Override 
	public String visitBool_literal(CompilersParser.Bool_literalContext ctx){ 
 		//System.out.println("I visited visitBool_literal");
 		//System.out.println("This is ctx " + ctx.getText());
 		return visitChildren(ctx); 
 }
	
	public String bringOffsetVariable(String VariableName){
		for (Map.Entry<String,LinkedHashMap<String,String[]>> e : SymbolTable.entrySet()){
			//System.out.println("SymbolTable " + e.getKey());
			Map<String,String[]> MethodInformation = SymbolTable.get(e.getKey());
				for(Map.Entry<String, String[]> entry : MethodInformation.entrySet()){
					if(entry.getKey().startsWith(VariableName)){
						String[] Information = MethodInformation.get(entry.getKey());
						return Information[3];
					}
				}
			}
		return "";
	}

}
