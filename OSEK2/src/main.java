import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import sselab.nusek.oil.OilSpec;
import sselab.nusek.oil.file.OilLexer;
import sselab.nusek.oil.file.OilParser;

public class main {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		OilSpec spec = null;
		OilLexer lexer = null;
		
			try {
				lexer = new OilLexer("conf.oil");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			OilParser parser = new OilParser(lexer);
			ParseTree tree = parser.parse();
			spec = parser.getOilSpec();
			System.out.println(spec.toString());
	}
}
