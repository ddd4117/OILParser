package sselab.nusek.oil.file.parserControl;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;

import sselab.nusek.oil.InvalidOilException;
import sselab.nusek.oil.OilAttribute;
import sselab.nusek.oil.OilObject;
import sselab.nusek.oil.OilObject_Attribute;
import sselab.nusek.oil.OilSpec;
import sselab.nusek.oil.antlr.OilParser;

public class SecondParser {
	private static OilObject currentObject = null;
	private static OilSpec oil;
	private static OilParserControl ctl;
	ParseTree tree;
	public SecondParser(ParseTree tree)
	{
		currentObject = null;
		this.oil = new OilSpec();
		this.ctl = new OilParserControl();
		this.tree = tree;
	}
	
	
	public static void parse(ParseTree tree, int level, OilObject obj) {
		if (tree instanceof RuleNode) {
			/** SET CPU NAME **/
			if (((RuleNode) tree).getRuleContext().getRuleIndex() == OilParser.RULE_application_definition) {
//				System.out.println(level + " " + tree.getChild(0).getText() + " " + tree.getChild(1).getText());
				try {
					oil.setCpuName(tree.getChild(1).getText());
				} catch (InvalidOilException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			/** create object & set object name **/
			else if (((RuleNode) tree).getRuleContext().getRuleIndex() == OilParser.RULE_object_name) {
//				System.out.println(level + " " + tree.getChild(0).getText() + " " + tree.getChild(1).getText());
				
				if(currentObject != null)
					ctl.finalizeOilObjCreation(currentObject, oil);
				
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
				// System.out.println(level + " \t" + tree.getText());
				boolean hasList = hasList(tree);
				String name = tree.getChild(0).getText();
				String value = tree.getChild(2).getText();

				if (!hasList) {
					if (level == 0) {
//						System.out.println("\t" + level + " " + name + " " + value);
						//ctl.addAttribute(currentObject, name, value);
						currentObject.addAttr(new OilAttribute(name,value));
					} else {
//						System.out.println("\t" + level + " " + name + " " + value);
//						ctl.addAttribute(currentObject, name, value);
						obj.addAttr(new OilAttribute(name, value));
					}
				}
				if (hasList) {
					OilObject temp = new OilObject_Attribute();
					value = value.split("\\{")[0];
					try {
						temp.setName(name);
						temp.setValue(value);
					} catch (InvalidOilException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					if (level == 0) {
//						System.out.println("\t" + level + " " + name + " " + value);
						currentObject.addObj(temp);
						//ctl.addAttribute(currentObject, name, value);
					}
					else{
						obj.addObj(temp);
					}
					for (int i = 0; i < tree.getChildCount(); ++i) {
						parse(tree.getChild(i), level + 1, temp);
					}
					return;
				}
			}
		}
		for (int i = 0; i < tree.getChildCount(); ++i) {
			parse(tree.getChild(i), level, obj);
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

	public OilSpec start() {
		this.parse(tree, 0, null);
		ctl.finalizeOilObjCreation(currentObject, oil);
		ctl.finailize(oil);
		oil.updateCeilingPriority();
//		System.out.println(oil.getAlarms().get(0).toString());
//		System.out.println(oil.getTasks().get(0).allObjectString(oil.getTasks().get(0), ""));
//		System.out.println(oil.getAlarms().get(0).allObjectString(oil.getAlarms().get(0), ""));
//		System.out.println(oil.toString());
//		System.out.println(oil.getOs().allObjectString(oil.getOs(), ""));
		return oil;
	}
}
