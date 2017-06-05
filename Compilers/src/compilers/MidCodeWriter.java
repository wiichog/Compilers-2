package compilers;
import java.util.*;

public class MidCodeWriter {
	public Map<String,LinkedHashMap<String,String[]>> Quadruplets = new LinkedHashMap<String,LinkedHashMap<String,String[]>>();
	public ArrayList<String> MethodNames = new ArrayList<String>();

	public MidCodeWriter(Map<String,LinkedHashMap<String,String[]>> Quadruplets,ArrayList<String> MethodNames){
		this.Quadruplets = Quadruplets;
		this.MethodNames = MethodNames;
	}
	
	public void Writer(){
		for(int i=0;i<MethodNames.size();i++){
			String MethodName = MethodNames.get(i);
			LinkedHashMap<String,String[]> Triplets = Quadruplets.get(MethodName);
			String[] MethodNameInformation = MethodName.split(",");
			if(!(MethodNameInformation.length==1)){
				//posicion 0 de MethodInformation metodo al que pertenece
				//Posicion 1 de Method Information 
				
			}
			for(Map.Entry e : Triplets.entrySet()){
  		    	String[] Key = e.getKey().toString().split(",");
  		    	//Posicion 0 del key es el numero de instruccion
  		    	//Posicion 1 del key es el tipo de dato
  		    	//Posicion 2 del key es la operacion
  		    	if(Key[2].equals("*")){
  		    		
  		    	}
				if(Key[2].equals("+")){
				  		    		
				  		    	}
				if(Key[2].equals("PARAMETER")){
						
					}
				if(Key[2].equals("==")){
						
					}
				if(Key[2].equals("RETURN")){
					
				}
				if(Key[2].equals("==")){
					
				}
				if(Key[2].equals("==")){
					
				}

  		    }
			
			
		}
	}
}
