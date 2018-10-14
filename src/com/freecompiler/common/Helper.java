package com.freecompiler.common;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.freecompiler.pascal.Interpreter;
import com.freecompiler.pascal.pascalParser.ProcedureDeclarationContext;
import com.udojava.evalex.Expression;

public class Helper {

	public static Interpreter interpreter=null;
	public static boolean tryParseInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch(NumberFormatException nfe) {
            return false;
        }
    }
	
	
	public static void AssignVarType(VariableType V,String type)
	{
		type=type.toLowerCase();
		switch(type)
    	{
    		case "integer":
    			V.type=VarType.Integer;
    			V.value=(int)0;
    		break;
    		case "string":
    			V.type=VarType.String;
    			V.value=(String)"";
        		break;
    		case "boolean":
    			V.type=VarType.Boolean;
    			V.value=(Boolean)false;
    			break;
    		case "byte":
    			V.type=VarType.Byte;
    			V.value=(byte)0;
    			break;
    		case "cardinal":
    			break;
    		case "char":
    			V.type=VarType.Char;
    			V.value=(char)0;
    			break;
    		case "currency":
    			throw new RuntimeException(type+" Type not implemented");
    		//	break;
    		case "extended":
    			throw new RuntimeException(type+" Type not implemented");
    		//	break;
    		case "int64":
    			V.type=VarType.Int64;
    			V.value=(int)0;
    			break;
    		case "longint":
    			V.type=VarType.Longint;
    			V.value=(double)0;
    			break;
    		case "pointer":
    			throw new RuntimeException(type+" Type not implemented");
    		//	break;
    		case "real":
    			V.type=VarType.Real;
    			V.value=(float)0.0f;
    			break;
    		case "shortint":
    			V.type=VarType.Shortint;
    			V.value=(short)0.0f;
    			break;
    		case "smallint":
    			throw new RuntimeException(type+" Type not implemented");
    		//	break;
    		case "word":
    			throw new RuntimeException(type+" Type not implemented");
    		//	break;
    		
    	}	
	}
	public static void DefineVarObjectInt(String varname,String type,List<VariableType> VarList)
	{
		String[] name=varname.toLowerCase().split(",");
		type=type.toLowerCase();
		for(int i=0;i<name.length;i++)
		{
			switch(type)
	    	{
	    		case "integer":
	    			VariableType intT= new VariableType(name[i],(int)0,VarType.Integer);
	    			VarList.add(intT);
	    		break;
	    		case "string":
	    			VariableType strT= new VariableType(name[i],"",VarType.String);
	    			VarList.add(strT);
	        		break;
	    		case "boolean":
	    			VariableType boolT= new VariableType(name[i],false,VarType.Boolean);
	    			VarList.add(boolT);
	    			break;
	    		case "byte":
	    			VariableType byteT= new VariableType(name[i],(byte)0,VarType.Byte);
	    			VarList.add(byteT);
	    			break;
	    		case "cardinal":
	    			break;
	    		case "char":
	    			VariableType charT= new VariableType(name[i],(char)0,VarType.Char);
	    			VarList.add(charT);
	    			break;
	    		case "currency":
	    			throw new RuntimeException(type+" Type not implemented");
	    		//	break;
	    		case "extended":
	    			throw new RuntimeException(type+" Type not implemented");
	    		//	break;
	    		case "int64":
	    			VariableType int64T= new VariableType(name[i],(long)0,VarType.Int64);
	    			VarList.add(int64T);
	    			break;
	    		case "longint":
	    			VariableType longintT= new VariableType(name[i],(long)0,VarType.Longint);
	    			VarList.add(longintT);
	    			break;
	    		case "pointer":
	    			throw new RuntimeException(type+" Type not implemented");
	    		//	break;
	    		case "real":
	    			VariableType realT= new VariableType(name[i],(float)0,VarType.Real);
	    			VarList.add(realT);
	    			break;
	    		case "shortint":
	    			VariableType shortintT= new VariableType(name[i],(short)0,VarType.Real);
	    			VarList.add(shortintT);
	    			break;
	    		case "smallint":
	    			throw new RuntimeException(type+" Type not implemented");
	    		//	break;
	    		case "word":
	    			throw new RuntimeException(type+" Type not implemented");
	    		//	break;
	    		
	    	}
		}
	}
	
	public static void DefineVarObject(String name,String type)
	{
		if (interpreter.CurrentPrc!=null)
		DefineVarObjectInt(name,type,interpreter.CurrentPrc.IntVarList);
		if (interpreter.CurrentFunct!=null)
		DefineVarObjectInt(name,type,interpreter.CurrentPrc.IntVarList);
		else if (interpreter.CurrentPrc==null)
			DefineVarObjectInt(name,type,interpreter.VarList);
		
	}
	
	public static void EvalAssignPrcPram(String arg,ProcedureType prc)
	{
		if (prc.ParNum==0)
			return;
		String[] args=arg.split(",");
		if (prc==null)throw new RuntimeException("EvalAssignPrcPram Null Procedure Value " );
		if(prc.ParNum!=args.length) throw new RuntimeException(prc.name
				+ "wrong parameters numebrs \n the procedure expects  " +prc.IntVarList.size() );
		for(int i=0;i<prc.ParNum;i++)
		{
			AssignVarValue(prc.IntVarList.get(i).name,args[i]);
		}
	}
	
	public static void EvalAssignFunctPram(String arg,FunctionType funct)
	{
		if (funct.ParNum==0)
			return;
		String[] args=arg.split(",");
		if (funct==null)throw new RuntimeException("EvalAssignFunctPram Null Procedure Value " );
		if(funct.ParNum!=args.length) throw new RuntimeException(funct.name
				+ "wrong parameters numebrs \n the procedure expects  " +funct.IntVarList.size() );
		for(int i=0;i<funct.ParNum;i++)
		{
			AssignVarValue(funct.IntVarList.get(i).name,args[i]);
		}
	}
	public static void EvalAssignFunctPram(List<BigDecimal> parameters,FunctionType funct)
	{
		
		if (funct==null)throw new RuntimeException("EvalAssignFunctPram Null Procedure Value " );
		if(funct.ParNum!=parameters.size()) throw new RuntimeException(funct.name
				+ "  wrong parameters numebrs \n the procedure expects  " +funct.IntVarList.size() );
		//first var position 0 is result
		for(int i=0;i<funct.ParNum;i++)
		{
			AssignVarValue(funct.IntVarList.get(i+1).name,parameters.get(i).toString());
		}
	}
	
	public static void AssignVarValue(String name,String value)
	{
		VariableType V =Helper.FindVarByName(name);
 	   if (V!=null)
 	   {
 		   switch (V.type) {
					case Integer:
						Expression e= new Expression(value.toLowerCase());					
						V.value=(int) e.eval().intValue();
						
						break;
					case String:
						V.value=value.replaceAll("'","");
						break;
			
 		   } // switch
 	   }
	}
	
	 public static VariableType FindVarByNameInt(String name,List<VariableType> VarList)
	 {
		 VariableType var=null;
		 name=name.toLowerCase();
		// System.out.println("----------------------");
		  for(int i=0;i<VarList.size();i++)
		  {
			// System.out.println(name+"="+VarList.get(i).name);
			  if (VarList.get(i).name.equals(name))
				  return VarList.get(i);
		  }
		 return var;
	 }
	 
	 public static VariableType FindVarByName(String name)
	 {
		 VariableType var=null;
		 if (interpreter.CurrentPrc!=null)
		 {
			 var= FindVarByNameInt(name,interpreter.CurrentPrc.IntVarList);
		 }
		 if (interpreter.CurrentFunct!=null)
		 {
			 var= FindVarByNameInt(name,interpreter.CurrentFunct.IntVarList);
		 }	 
		 if (var==null)
			 var= FindVarByNameInt(name,interpreter.VarList);
		 return var;
	 }
	 

	 public static ProcedureType FindPrcByName(String name)
	 {
		 ProcedureType prc=null;
		 name=name.toLowerCase();
		// System.out.println("----------------------");
		  for(int i=0;i<interpreter.PrcList.size();i++)
		  {
			System.out.println(name+"="+interpreter.PrcList.get(i).name);
			  if (interpreter.PrcList.get(i).name.equals(name))
				  return interpreter.PrcList.get(i);
		  }
		 return prc;
	 }
	 
	 public static FunctionType FindFunctByName(String name)
	 {
		 FunctionType funct=null;
		 name=name.toLowerCase();
		// System.out.println("----------------------");
		  for(int i=0;i<interpreter.FunctList.size();i++)
		  {
			// System.out.println(name+"="+VarList.get(i).name);
			  if (interpreter.FunctList.get(i).name.equals(name))
				  return interpreter.FunctList.get(i);
		  }
		 return funct;
	 }
	 
	 public static String GetVarNumberValue(String name)
	 {
		 VariableType var=FindVarByName(name);
		  if (var!=null)
			  return  var.value.toString();
		  return "";
	 }
	
		 
	public static void ExecProcedure(String procname, String arg)
	{
		procname=procname.toLowerCase();
	//	System.out.println("exec ->"+procname);
		
		switch (procname)
		{
		case "writeln":
			InternalProcedure.writeln(arg);
			break;
		}
		
		
		
		
	}

	// this procedure is invoked by the eval function in expression row 1738
	public static void CallFunction(FunctionType funct,List<BigDecimal> parameters) {
		if (funct==null)
			throw new RuntimeException("null function: " );
		FunctionType oldFunct=interpreter.CurrentFunct;
		ProcedureType oldPrc=interpreter.CurrentPrc;
		interpreter.CurrentFunct=funct;
		interpreter.CurrentPrc=null;
		EvalAssignFunctPram(parameters,funct);
		interpreter.visit(funct.value);
		interpreter.CurrentFunct=oldFunct;
		interpreter.CurrentPrc=oldPrc;
	}
	public static void CallProcedure(ProcedureType prc,String arg) {
		ProcedureType oldPrc=interpreter.CurrentPrc;
		FunctionType oldFunct=interpreter.CurrentFunct;
		interpreter.CurrentPrc=prc;
		interpreter.CurrentFunct=null;
		// check if the procedure has parameters to assign
		
		 Helper.EvalAssignPrcPram(arg,prc);
		 interpreter.visit(prc.value);
		  interpreter.CurrentPrc=oldPrc;
		  interpreter.CurrentFunct=oldFunct;
	}
}

