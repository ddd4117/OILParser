import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import sselab.nusek.oil.*;
import sselab.nusek.oil.file.OilLexer;
import sselab.nusek.oil.file.OilParser;
import sselab.nusek.oil.file.parserControl.OilParserControl;

public class main {
	private static OilObject currentObject = null;
	private static OilSpec oil = new OilSpec();
	private static OilParserControl ctl = new OilParserControl();
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
		if (tree instanceof RuleNode) {
			/** SET CPU NAME **/
			if (((RuleNode) tree).getRuleContext().getRuleIndex() == OilParser.RULE_application_definition) {
				System.out.println(level + " " + tree.getChild(0).getText() + " " +tree.getChild(1).getText());
				try {
					oil.setCpuName(tree.getChild(1).getText());
				} catch (InvalidOilException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			/** create object & set object name **/
			else if (((RuleNode) tree).getRuleContext().getRuleIndex() == OilParser.RULE_object_name) {
				System.out.println(level + " "+tree.getChild(0).getText() + " " + tree.getChild(1).getText());
				currentObject = ctl.makeObject(tree.getChild(0).getText());
				try {
					currentObject.setName(tree.getChild(1).getText());
				} catch (InvalidOilException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			/** SET attribute name & value of Object **/
			else if (((RuleNode) tree).getRuleContext().getRuleIndex() == OilParser.RULE_parameter) {
//				System.out.println(level + "\t" + tree.getText());
				boolean hasList = hasList(tree);
				String name = tree.getChild(0).getText();
				String value = tree.getChild(2).getText();
				ctl.addAttribute(currentObject, name, value, hasList);
				if (hasList) {
					for (int i = 0; i < tree.getChildCount(); ++i) {
						parse(tree.getChild(i), level + 1);
					}
					return;
				}
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
