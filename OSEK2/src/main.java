import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import object.OilSpec;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharStream input = null;
		try {
			input = new ANTLRFileStream("sselab.oil");
		} catch (IOException e) {
			// TODO Auto-generated catch
			e.printStackTrace();
		}
		OilLexer lexer = new OilLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		OilParser parser = new OilParser(tokens);

		
		ParseTree tree = parser.file();
		OilSpec spec = parser.getOilSpec();
		System.out.println(spec.toString());
		//System.out.println(tree.getText());
 		//System.out.println(tree.toStringTree(parser));
	}

}
