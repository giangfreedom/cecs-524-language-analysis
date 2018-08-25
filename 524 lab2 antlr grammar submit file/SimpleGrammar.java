/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;


/**
 *
 * @author Giang Truong
 */
public class SimpleGrammar {
    /**
     * @param args the command line arguments
     */

    /**
     *
     * @param args the command line arguments
     * @throws java.io.IOException
     */

    /**
     *
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws org.antlr.runtime.RecognitionException
     */
    public static void main(String[] args) throws IOException, RecognitionException {
        simplegrammarLexer lexer = new simplegrammarLexer(new ANTLRFileStream(args[4]));
        
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        simplegrammarParser parser = new simplegrammarParser(tokens);
        
        try {
			parser.program();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
