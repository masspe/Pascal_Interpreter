package com.freecompiler.common;

import com.udojava.evalex.Expression;

public class InternalProcedure {

	public static void writeln(String arg )
	{
		String[] args=arg.split(",");
		for(int i=0;i<args.length;i++)
		{
			if (args[i].indexOf("'")>-1)
				System.out.print(args[i].replace("'", ""));				
			else
			{
				Expression e= new Expression(args[i].toLowerCase());	
				System.out.println();
				System.out.print( e.eval().intValue());
			}
		}
		System.out.println("");
	}
}
