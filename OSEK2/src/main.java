import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import sselab.nusek.oil.*;
import sselab.nusek.oil.OilSpec;
import sselab.nusek.oil.file.OilLexer;
import sselab.nusek.oil.file.OilParser;
import sselab.nusek.oil.file.parserControl.OilParserControl;

public class main {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		OilSpec spec = null;
		OilLexer lexer = null;

		try {
			lexer = new OilLexer("conf.oil");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		OilParser parser = new OilParser(lexer);
		ParseTree tree = parser.parse();
		parse(tree, 0);

		// spec = parser.getOilSpec();
		// System.out.println(spec.toString());
	}

	private static void parse(ParseTree tree, int level) {
		OilObject currentObject;
		OilSpec oil = new OilSpec();
		OilParserControl ctl = new OilParserControl();
		if (tree instanceof RuleNode) {
			if (((RuleNode) tree).getRuleContext().getRuleIndex() == OilParser.RULE_application_definition) {
				
				System.out.println(tree.getChild(1).getText());
			}
			else if (((RuleNode) tree).getRuleContext().getRuleIndex() == OilParser.RULE_parameter) {
				System.out.println(level + "\t" + tree.getText());
				if (hasList(tree)) {
					for (int i = 0; i < tree.getChildCount(); ++i) {
						parse(tree.getChild(i), level + 1);
					}
					return;
				}
			} else if (((RuleNode) tree).getRuleContext().getRuleIndex() == OilParser.RULE_object) {

				System.out.println(tree.getText());
			}
		}
		for (int i = 0; i < tree.getChildCount(); ++i) {
			parse(tree.getChild(i), level);
		}
	}

	private static boolean hasList(ParseTree tree) {
		if (tree instanceof RuleNode) {
			if (((RuleNode) tree).getRuleContext().getRuleIndex() == OilParser.RULE_parameter_list) {
				return true;
			}
		}
		for (int i = 0; i < tree.getChildCount(); ++i) {
			if (hasList(tree.getChild(i)))
				return true;
		}
		return false;
	}
}
