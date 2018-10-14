package com.freecompiler.common;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;

import com.freecompiler.pascal.pascalParser.FunctionDeclarationContext;
import com.freecompiler.pascal.pascalParser.ProcedureDeclarationContext;

public class FunctionType {

	public String name;
	public ParseTree value;
	public List<VariableType> IntVarList=new ArrayList<VariableType>();
	public int ParNum=0;
		
	public FunctionType(String name,ParseTree value,String arg,String vType )
	{
		// Define result with the same name of the function:
		Helper.DefineVarObjectInt(name,vType,IntVarList);
		this.name=name.toLowerCase();
		this.value=value;
		String[] args=arg.replace("(", "").replace(")", "").trim().split(";");
		
		for (int i=0;i<args.length;i++)
		{
			String[] v=args[i].split(":");			
			if (v.length==2)
			{
				 String[] vm=v[0].split(",");
				for (int l=0;l<vm.length;l++)
				{
				Helper.DefineVarObjectInt(vm[l],v[1],IntVarList);
				}
			}
		}
		ParNum = IntVarList.size()-1;
		
		
	}
	
}
