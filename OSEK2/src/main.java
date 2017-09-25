import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharStream input = null;
		try {
			input = new ANTLRFileStream("test2.oil");
		} catch (IOException e) {
			// TODO Auto-generated catch blockasdsaasdsadsa
			e.printStackTrace();
		}
		SyntaxLexer lexer = new SyntaxLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		SyntaxParser parser = new SyntaxParser(tokens);
		
		
		ParseTree tree = parser.file();
		//System.out.println(tree.getText());
 		//System.out.println(tree.toStringTree(parser));
	}

}
