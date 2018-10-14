package com.freecompiler.pascal;

import java.io.File;
import java.io.FileInputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import com.udojava.evalex.Expression;

public class Main {

	public static void main(String[] args) {
		try {
		
			
	    File file = new File("prg1.pas");
	    
        ANTLRInputStream stream = (!file.exists())
                ? new ANTLRInputStream(System.in)
                : new ANTLRInputStream(new FileInputStream(file));
                pascalLexer lexer = new pascalLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        pascalParser parser = new pascalParser(tokens);
        ParseTree tree = parser.program();
        System.out.println(tree);
        Interpreter interpreter = new Interpreter();
        interpreter.visit(tree);
        
    }
    catch (Exception ex) {
        System.out.println(ex.toString());
    }
	}

}
