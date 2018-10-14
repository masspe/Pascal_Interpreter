package com.freecompiler.pascal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.TerminalNode;

import com.freecompiler.common.FunctionType;
import com.freecompiler.common.Helper;
import com.freecompiler.common.ProcedureType;
import com.freecompiler.common.VarType;
import com.freecompiler.common.VariableType;
import com.freecompiler.pascal.pascalParser.*;
import com.udojava.evalex.Expression;

public  class Interpreter extends pascalBaseVisitor<Integer> {
	 
	   public List<VariableType> VarList;
	   public List<ProcedureType> PrcList;
	   public List<FunctionType> FunctList;
	   public String ProgramName;
	   public ProcedureType CurrentPrc=null;
	   public FunctionType CurrentFunct=null;

	    
	    @Override
	    public Integer visitProgram( ProgramContext ctx) {
	    try
	    {
	        Integer result = 0;
	      //  System.out.println("Program root :"+ name+ ":" + ctx.children.size());
	        
	        VarList =new ArrayList<VariableType>() ;
	        PrcList = new ArrayList<ProcedureType>();
	        FunctList = new ArrayList<FunctionType>();	        
	        Helper.interpreter=this;
	        for(int i=0;i< ctx.children.size();i++)
	        	
	        {
	        	//System.out.println("--->"+ctx.getChild(i).getText());
	        	visit(ctx.getChild(i));
	        }
	        for(int i=0;i< VarList.size();i++)
	        
	        {
	        	System.out.println("END PROGRAM:" + VarList.get(i).name + "="+ VarList.get(i).value);
	        }
	        return result;
	    }
	    catch (Exception ex) {
	    		System.out.println("visitProgram"+ex.toString());
	    	}
	    return 0;
	    }

	    @Override
	    public Integer   visitProgramHeading( ProgramHeadingContext ctx) {
	    	try
	    	{
	      
	        Integer result = 0;
	      //  System.out.println("    head " + ctx.getParent().getClass()+ ":"+ name+ ":" + ctx.children.size());
	        if (ctx.children.size()>2)
	        	ProgramName=ctx.getChild(1).getText();
	     //   System.out.println("Program Name :"+ProgramName);
	        for(int i=0;i< ctx.children.size();i++)
	        {
	        	//System.out.println("--->"+ctx.getChild(i).getText());
	        	visit(ctx.getChild(i));
	        }
	        return result;
	    }
	    catch (Exception ex) {
	    		System.out.println("visitProgramHeading"+ex.toString());
	    	}
	    return 0;
	    }

   

    
    // Insert the Procedure in the global List
    @Override
    public Integer visitProcedureDeclaration( ProcedureDeclarationContext ctx) {
    	try 
    	{
        
        Integer result = 0;
        //System.out.println("Procedure Declaration " + ctx.getParent().getClass()+ ":"+ name+ ":" + ctx.children.size());
     /*  for(int i=0;i< ctx.children.size();i++)
        {
        	System.out.println(ctx.getChild(i).getClass()+":"+ctx.getChild(i).getText()+":"+i);
     //   	visit(ctx.getChild(i));
        }*/
        // Store the esecution in the ProcedureType var
        // InsertProc Param into stack
        
        PrcList.add(new ProcedureType(ctx.getChild(1).getText().toLowerCase()
        		,ctx.getChild(4)
        		,ctx.getChild(2).getText()));
        
        return result;
    }
    catch (Exception ex) {
    	
    		System.out.println("visitProcedureDeclaration"+ex.toString());
    	}
    return 0;
    }
    
    @Override
    public Integer visitFormalParameterList( FormalParameterListContext ctx) {
    	try 
    	{
        
        Integer result = 0;
        //System.out.println("Procedure Declaration " + ctx.getParent().getClass()+ ":"+ name+ ":" + ctx.children.size());
       for(int i=0;i< ctx.children.size();i++)
        {
         	System.out.println(ctx.getChild(i).getClass()+":"+ctx.getChild(i).getText()+":"+i);
        	visit(ctx.getChild(i));
        }
        // Store the esecution in the ProcedureType var
      
        return result;
    }
    catch (Exception ex) {
    		System.out.println("visitProcedureDeclaration"+ex.toString());
    	}
    return 0;
    }
    
    @Override
    public Integer visitFormalParameterSection( FormalParameterSectionContext ctx) {
    	try 
    	{
        
        Integer result = 0;
        //System.out.println("Procedure Declaration " + ctx.getParent().getClass()+ ":"+ name+ ":" + ctx.children.size());
       for(int i=0;i< ctx.children.size();i++)
        {
     //    	System.out.println(ctx.getChild(i).getClass()+":"+ctx.getChild(i).getText()+":"+i);
        	visit(ctx.getChild(i));
        }
        // Store the esecution in the ProcedureType var
      
        return result;
    }
    catch (Exception ex) {
    		System.out.println("visitFormalParameterSection"+ex.toString());
    	}
    return 0;
    }
    
    @Override
    public Integer visitParameterGroup( ParameterGroupContext ctx) {
    	try 
    	{
        
        Integer result = 0;
        //System.out.println("Procedure Declaration " + ctx.getParent().getClass()+ ":"+ name+ ":" + ctx.children.size());
       for(int i=ctx.children.size()-1;i>=0;i--)
        {
         //	System.out.println(ctx.getChild(i).getClass()+":"+ctx.getChild(i).getText()+":"+i);
        	visit(ctx.getChild(i));
        }
        // Store the esecution in the ProcedureType var
      
        return result;
    }
    catch (Exception ex) {
    		System.out.println("visitParameterGroup"+ex.toString());
    	}
    return 0;
    }
    
    @Override
    public Integer visitIdentifierList( IdentifierListContext ctx) {
    	try 
    	{
        
        Integer result = 0;
        //System.out.println("Procedure Declaration " + ctx.getParent().getClass()+ ":"+ name+ ":" + ctx.children.size());
       for(int i=0;i< ctx.children.size();i++)
        {
         //	System.out.println(ctx.getChild(i).getClass()+":"+ctx.getChild(i).getText()+":"+i);
        	visit(ctx.getChild(i));
        }
        // Store the esecution in the ProcedureType var
      
        return result;
    }
    catch (Exception ex) {
    		System.out.println("visitIdentifierList"+ex.toString());
    	}
    return 0;
    }
    
    // identifier name
    @Override
    public Integer visitIdentifier( IdentifierContext ctx) {
    	try 
    	{
        
        Integer result = 0;
        
        return result;
    }
    catch (Exception ex) {
    		System.out.println("visitIdentifier"+ex.toString());
    	}
    return 0;
    }
    
    // invoked in order to identify the var type
    @Override
    public Integer visitTypeIdentifier( TypeIdentifierContext ctx) {
    	try 
    	{
        
        Integer result = 0;
        VariableType v= new VariableType("",(int)0,VarType.Integer);
     
        
        return result;
    }
    catch (Exception ex) {
    		System.out.println("visitProcedureDeclaration"+ex.toString());
    	}
    return 0;
    }
    
    @Override
    public Integer visitFunctionDeclaration(pascalParser.FunctionDeclarationContext ctx)
    {
    	try 
    	{
        
        Integer result = 0;
        //System.out.println("Procedure Declaration " + ctx.getParent().getClass()+ ":"+ name+ ":" + ctx.children.size());
        /*for(int i=0;i< ctx.children.size();i++)
        {
        		System.out.println("PF:"+ctx.getChild(i).getText()+":"+i);
        	visit(ctx.getChild(i));
        }*/
        // Store the esecution in the ProcedureType var
        if ( ctx.children.size()>2)
        	FunctList.add(new FunctionType(ctx.getChild(1).getText(),ctx.getChild(6),ctx.getChild(2).getText(),ctx.getChild(4).getText()));
        else
        	FunctList.add(new FunctionType(ctx.getChild(1).getText(),ctx.getChild(6),"",ctx.getChild(4).getText()));
        return result;
    }
    catch (Exception ex) {
    		System.out.println("visitFunctionDeclaration"+ex.toString());
    	}
    return 0;
    }
    
    
    @Override
    public Integer visitVariableDeclaration( VariableDeclarationContext ctx) {
    	try
    	{
    	
        Integer result = 0;
     //  System.out.println("Var: " + ctx.getParent().getClass() +  ":" + ctx.children.size());
       
      if (ctx.children.size()==3)
       {
    	  Helper.DefineVarObject(ctx.getChild(0).getText(), ctx.getChild(2).getText());
    			 
       }
        
        return result;
    }
    catch (Exception ex) {
    		System.out.println("visitVariableDeclaration"+ex.toString());
    	}
    return 0;
    }
    
  
    
    
    @Override
    public Integer visitVariableDeclarationPart( VariableDeclarationPartContext ctx) {
    	try
    	{
    	
        Integer result = 0;
    //    System.out.println("      Part: " + ctx.getParent().getClass() + ":"+ name+ ":" + ctx.children.size());
        for(int i=0;i< ctx.children.size();i++)
        {
        	visit(ctx.getChild(i));
        }
        return result;
    }
    catch (Exception ex) {
    		System.out.println("visitVariableDeclarationPart"+ex.toString());
    	}
    return 0;
    }
    
    @Override
    public Integer visitBlock( BlockContext ctx) {
    	try
    	{
    	
    	
       
      //  System.out.println("Block: " + ctx.getParent().getClass() + ":"+ name+ ":" + ctx.children.size());
        for(int i=0;i< ctx.children.size();i++)
        {
        //	System.out.println("-->"+ctx.getChild(i).getText()+":"+i);
        	visit(ctx.getChild(i));
        }
        return 0;
    }
    catch (Exception ex) {
    		System.out.println("visitBlock"+ex.toString());
    	}
    return 0;
    }
  
    @Override
    public Integer visitProcedureStatement( ProcedureStatementContext ctx) {
    	try
    	{
    	
        Integer result = 0;
        System.out.println("Proc Stm: " + ctx.getParent().getClass() +  ":" + ctx.children.size());
       
        ProcedureType prc=Helper.FindPrcByName(ctx.getChild(0).getText());
		if (prc!=null)
		{
			Helper.CallProcedure(prc, ctx.getChild(2).getText());
		}
		else
		{
        if (ctx.children.size()>2)
        	Helper.ExecProcedure(ctx.getChild(0).getText(),ctx.getChild(2).getText());
        else
        	Helper.ExecProcedure(ctx.getChild(0).getText(),"");
		}
        for(int i=0;i< ctx.children.size();i++)
        {
        //	System.out.println("-->"+ctx.getChild(i).getText()+":"+i);
        	visit(ctx.getChild(i));
        }
        CurrentPrc=null;
        return result;
    }
    catch (Exception ex) {
    		System.out.println("visitProcedure"+ex.toString());
    	}
    return 0;	
    }
    
    @Override
    public Integer visitSimpleStatement( SimpleStatementContext ctx) {
    	try
    	{
    	
        Integer result = 0;
  //      System.out.println("     Simple Stm: " + ctx.getParent().getClass() + ":"+ name + ":" + ctx.children.size());
       for(int i=0;i< ctx.children.size();i++)
        {
        	visit(ctx.getChild(i));
        }
        return result;
    }
    catch (Exception ex) {
    		System.out.println("visitSimple"+ex.toString());
    	}
    return 0;
    }
    
    @Override
    public Integer visitUnlabelledStatement( UnlabelledStatementContext ctx) {
    	try
    	{   	
    	
    	
        Integer result = 0;
    //    System.out.println("UnLabeled Stm: " + ctx.getParent().getClass() + ":"+ name + ":" + ctx.children.size());
        
        for(int i=0;i< ctx.children.size();i++)
        {
        	visit(ctx.getChild(i));
        }
        return result;
    }
    catch (Exception ex) {
    		System.out.println("visitUnlabelled"+ex.toString());
    	}
    return 0;	
    }
 
    @Override
    public Integer visitVariable( pascalParser.VariableContext ctx) {
    	try
    	{
    	
    //	System.out.println("variable :" + ctx.getParent().getClass()+ ":"+ name+ ":" + ctx.children.size());

       for (int i = 0; i < ctx.identifier().size(); i++) {
      //      System.out.println(ctx.getText());
            
            if(ctx.getText().equals("integer")) {
               /* if(!map.containsKey(ctx.identifier(i).getText())) {
                    map.put(ctx.identifier(i).getText(), new Integer(0));
                  if ()
                }*/
            }
        }
        for(int i=0;i< ctx.children.size();i++)
        {
        	
        //	System.out.println("--------------------------"+ctx.getChild(i).getText());
        	visit(ctx.getChild(i));
        }
        return 0;
    }
    catch (Exception ex) {
    		System.out.println("visitVariable"+ex.toString());
    	}
    return 0;
    }
   
    
    
    @Override
    public Integer visitAssignmentStatement( pascalParser.AssignmentStatementContext ctx) {
    	
        Integer result = 0;
        try
        {
   //     System.out.println("        Assign: " + ctx.getParent().getClass() + ":"+ name + ":" + ctx.children.size());
       if (ctx.children.size()>2)
       {
    	   Helper.AssignVarValue(ctx.getChild(0).getText(), ctx.getChild(2).getText());
       }
        
        
        for(int i=0;i< ctx.children.size();i++)
        { 
        	//System.out.println("assign: "+i+":"+ ctx.getChild(i).getText());
        	visit(ctx.getChild(i));
        }
        
        return result;
    }
    catch (Exception ex) {
    		System.out.println("visitAssignmentStatement"+ex.toString());
    	}
    return 0;
    }
  
    // conditional Statement
    //IF 
    @Override
    public Integer  visitIfStatement(pascalParser.IfStatementContext ctx)
    {
    	try
    	{        	
            Integer result = 0;
        //    System.out.println(name +":" + ctx.getParent().getClass() + ":"+ name + ":" + ctx.children.size());
            String toEval=ctx.getChild(1).getText().replaceAll("=","==");
            Expression e = new Expression(toEval);
        
       
            if (e.eval().intValue()==1)
            	visit(ctx.getChild(3));
            else
            	if(ctx.children.size()>4)
            		visit(ctx.getChild(5));
         /*   	
            for(int i=0;i< ctx.children.size();i++)
            {
            	System.out.println("if: "+i+":"+ ctx.getChild(i).getText());
            	visit(ctx.getChild(i));
            }
            */
            return result;
    		
    	}
    	 catch (Exception ex) {
     		System.out.println("visitIfStatement"+ex.toString());
     	}
     return 0;
    }
    
    // conditional Statement
    //case 
    @Override
    public Integer  visitCaseStatement(pascalParser.CaseStatementContext ctx)
    {
    	try
    	{        	
            Integer result = 0;
          //  System.out.println("case:" + ctx.getParent().getClass() + ":"+ ctx.getClass() + ":" + ctx.children.size());
            if (ctx.children.size()<6)
            	new RuntimeException("For loop incomplete ");
          /*  Expression e = new Expression(toEval);
        
       
            if (e.eval().intValue()==1)
            	visit(ctx.getChild(3));
            else
            	if(ctx.children.size()>4)
            		visit(ctx.getChild(5));
         /*/   	
            String Eval=ctx.getChild(1).getText()+"=";
            for(int i=3;i< ctx.children.size();i+=2)
            {
            	
            		String[] v= ctx.getChild(i).getText().toLowerCase().split(":");
	            	if (v.length==2)
	            	{
		            	Expression e=new Expression(Eval+v[0]);
		            	if (e.eval().intValue()==1)
		            	{
		            		visit(ctx.getChild(i));
		            		break;
		            	}
	            	}
	            	else if (ctx.getChild(i).getText().toLowerCase().equals("else"))
	            	{
	            		visit(ctx.getChild(i+1));
	            		break;
	            	}
            	
           	//	System.out.println("case: "+i+":   "+ ctx.getChild(i).getText());
            	//visit(ctx.getChild(i));
            }
            
            return result;
    		
    	}
    	 catch (Exception ex) {
     		System.out.println("visitIfStatement"+ex.toString());
     	}
     return 0;
    }
    
    // FOR
    @Override
    public Integer   visitForStatement(pascalParser.ForStatementContext ctx)
    {
		    	try
		    	{		    				        	
		            Integer result = 0;
		           // System.out.println(name +":" + ctx.getParent().getClass() + ":"+ name + ":" + ctx.children.size());
		            if (ctx.children.size()<6)
		            	new RuntimeException("For loop incomplete ");
		            String[] p=ctx.getChild(3).getText().toLowerCase().split("to");                       
		            Helper.AssignVarValue(ctx.getChild(1).getText(), p[0]);
		            Expression s1=new Expression(p[0]);
		            Expression e1=new Expression(p[1]);
		            int s=s1.eval().intValue();
		            int e=e1.eval().intValue();
		            for (int k=s;k<=e;k++)
		            {
		            	Helper.AssignVarValue(ctx.getChild(1).getText(), Integer.toString(k));
		            	visit(ctx.getChild(5));
		            }
		         /*   for(int i=0;i< ctx.children.size();i++)
		            {
		            //	System.out.println("if: "+i+":"+ ctx.getChild(i).getText());
		            	//visit(ctx.getChild(i));
		            }
		           */ 
		        return result;
				
			}
			 catch (Exception ex) {
		 		System.out.println("visitIfStatement"+ex.toString());
		 	}
    	return 0;
    }
    
 
 // WHILE
    @Override
    public Integer    visitWhileStatement(pascalParser.WhileStatementContext ctx)
    {
		    	try
		    	{		    				        	
		            Integer result = 0;
		         //  System.out.println("while:" + ctx.getParent().getClass() + ":"+  ctx.getClass()  + ":" + ctx.children.size());
		           if (ctx.children.size()<3)
		            	new RuntimeException("While loop incomplete ");
		           
		            Expression e=new Expression(ctx.getChild(1).getText());
		            while (e.eval().intValue()==1)
		            	visit(ctx.getChild(3));
		          /*
		            for(int i=0;i< ctx.children.size();i++)
		            {
		            	System.out.println("if: "+i+":"+ ctx.getChild(i).getText());
		            	//visit(ctx.getChild(i));
		            }
		           */
		        return result;
				
			}
			 catch (Exception ex) {
		 		System.out.println("visitWhileStatement"+ex.toString());
		 	}
    	return 0;
    }
    
 // WHILE
    @Override
    public Integer   visitRepeatStatement(pascalParser.RepeatStatementContext ctx)
    {
		    	try
		    	{		    				        	
		            Integer result = 0;
		           System.out.println("repeat until:" + ctx.getParent().getClass() + ":"+  ctx.getClass()  + ":" + ctx.children.size());
		           if (ctx.children.size()<3)
		            	new RuntimeException("repeat until loop incomplete ");
		         
		            Expression e=new Expression(ctx.getChild(3).getText());
		            do
		            {
		            	visit(ctx.getChild(1));
		            }
		            while (e.eval().intValue()==0);	
		          
		        /*    for(int i=0;i< ctx.children.size();i++)
		            {
		            	System.out.println("if: "+i+":"+ ctx.getChild(i).getText());
		            	//visit(ctx.getChild(i));
		            }
		          */ 
		        return result;
				
			}
			 catch (Exception ex) {
		 		System.out.println("visitIfStatement"+ex.toString());
		 	}
    	return 0;
    }

}// end 










