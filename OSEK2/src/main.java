import java.io.IOException;

import sselab.nusek.oil.OilSpec;
import sselab.nusek.oil.antlr.OilLexer;
import sselab.nusek.oil.antlr.OilParser;

public class main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OilSpec spec = null;
		OilLexer lexer = null;
		try {
			lexer = new OilLexer("conf1.oil");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		OilParser parser = new OilParser(lexer);
		parser.parse();
		spec = parser.getOilSpec();
//		System.out.println(spec.toString());
		//setOilSpec(spec);
	}
}