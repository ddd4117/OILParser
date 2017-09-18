import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
public class OILRunner {

	public static void main(String[] args) {

			CharStream input = null;
			try {
				input = new ANTLRFileStream("test1.oil");
			} catch (IOException e) {
				// TODO Auto-generated catch blockasdsa
				e.printStackTrace();
			}
			OILLexer lexer = new OILLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			OILParser parser = new OILParser(tokens);
			
			
			ParseTree tree = parser.file();
			System.out.println(tree.toStringTree(parser));
			
	}

}
