package sselab.nusek.oil;

import java.util.ArrayList;
import java.util.List;

/**
 * An abstract class for OIL Objects
 * 
 * @author Taejoon
 * @author Dongwoo Kim - add id of object
 * @version 4/25/2017
 */
public abstract class OilObject {

	// DW MOD 160708
	private int id;
	private List<OilObject> obj = new ArrayList<>();
	private List<OilAttribute> attr = new ArrayList<>();
	private String value = null;
	private String name = null;

	public OilAttribute findAttr(String name) {
		for (OilAttribute attr : this.attr) {
			if (attr.getName().equals(name))
				return attr;
		}
		return null;
	}

	public OilObject findObj(String name) {
		for (OilObject temp : this.obj) {
			if (temp.getName().equals(name))
				return temp;
		}
		return null;
	}

	public String allObjectString(OilObject a, String space) {
		String temp = "";

		if (a instanceof OilAlarm) {
			temp += space + "ALARM " + a.getName() + "{\n";
		} else if (a instanceof OilAppMode) {
			temp += space + "APPMODE " + a.getName() + "{\n";
		} else if (a instanceof OilCounter) {
			temp += space + "COUNTER " + a.getName() + "{\n";
		} else if (a instanceof OilEvent) {
			temp += space + "EVENT " + a.getName() + "{\n";
		} else if (a instanceof OilISR) {
			temp += space + "ISR " + a.getName() + "{\n";
		} else if (a instanceof OilResource) {
			temp += space + "RESOURCE " + a.getName() + "{\n";
		} else if (a instanceof OilTask){
			temp += space + "TASK " + a.getName() + "{\n";
		}

		for (OilAttribute attr : a.getAttr()) {
			temp += space + "\t" + attr.getName() + " = " + attr.getValue() + ";\n";
		}

		for (OilObject obj : a.getObj()) {
			temp += space + "\t" + obj.getName() + " = " + obj.getValue() + " {\n";
			temp += allObjectString(obj, space + "\t");
		}
		temp += space + "};\n";
		return temp;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void addObj(OilObject objparam) {
		obj.add(objparam);
	}

	public void addAttr(OilAttribute attrparam) {
		this.attr.add(attrparam);
	}

	public List<OilObject> getObj() {
		return obj;
	}

	public void setObj(List<OilObject> obj) {
		this.obj = obj;
	}

	public List<OilAttribute> getAttr() {
		return attr;
	}

	public void setAttr(List<OilAttribute> attr) {
		this.attr = attr;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param name
	 *            the name to set
	 * @throws InvalidOilException
	 *             invalid name
	 */
	public void setName(String name) throws InvalidOilException {
		OilSpecValidator.validateId(name);
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	@Override
	public abstract String toString();

}
