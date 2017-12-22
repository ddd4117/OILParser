package sselab.nusek.oil;

import java.util.ArrayList;
import java.util.List;

import org.stringtemplate.v4.debug.AddAttributeEvent;

/**
 * OIL task
 *
 * @author Taejoon Byun, Seongjun Park
 * @version 4/11/2015
 */
public class OilTask extends OilObject {

	/**
	 * priority of this task, integer
	 */
	// private int priority = 1;
	//
	// /**
	// * AUTOSTART = {TRUE, FALSE}
	// */
	// private boolean autostart = false;
	//
	// public String appMode = null;
	//
	// /**
	// * activation count, integer
	// */
	// private int activation = 1;
	//
	// /**
	// * SCHEDULE = {FULL, NON}
	// */
	// private boolean schedule = false;
	//
	// /**
	// * EXTENDED = true or false
	// */
	// private boolean extended = false;
	//
	// // temporarily added for YAML -Seongjun Park
	// private int stackSize = 0x250;
	//
	// /**
	// * list of names of accessible resources
	// */
	// private List<String> accessibleResources = new ArrayList<>();
	//
	// /**
	// * list of names of accessible events
	// */
	// private List<String> accessibleEvents = new ArrayList<>();

	public OilTask() {
	}

	public OilTask(OilTask task) throws InvalidOilException {
		this.setName(task.getName());
		setPriority(task.getPriority());
		// this.priority = task.priority;
		// this.autostart = task.autostart;
		setAutostart(task.isAutostart());
		setAppMode(task.getAppMode());
		// this.activation = task.activation;
		setActivation(task.getActivation());
		// this.schedule = task.schedule;
		setSchedule(task.isSchedule());
		// this.extended = task.extended;
		setExtended(task.isExtended());
		// this.stackSize = task.stackSize;
		setStackSize(task.getStackSize());
		for (String res : task.getAccessibleResources()) {
			this.getAccessibleResources().add(res);
			// this.accessibleResources.add(res);
		}
		for (String ev : task.getAccessibleEvents()) {
			this.getAccessibleEvents().add(ev);
			// this.accessibleEvents.add(ev);
		}
	}

	public void addResource(String res) {
		OilObject obj = findObj("RESOURCE");
		if (obj == null) {
			OilObject_Attribute temp = new OilObject_Attribute("RESOURCE");
			this.addObj(temp);
		}
		obj.addAttr(new OilAttribute("RESOURCE", res));
	}

	public void addEvent(String evt) {
		if (!isExtended())
			setExtended(true);
		OilObject obj = findObj("EVENT");
		if (obj == null) {
			OilObject_Attribute temp = new OilObject_Attribute("EVENT");
			this.addObj(temp);
		}
		obj.addAttr(new OilAttribute("EVENT", evt));
	}

	/**
	 * @param autostart
	 *            the autostart to set
	 */
	public void setAutostart(boolean autostart) {
		OilObject obj = findObj("AUTOSTART");
		
		if(obj == null)
		{
			this.addObj(new OilObject_Attribute("AUTOSTART", Boolean.toString(autostart)));
		}
		else
		{
			obj.setValue(Boolean.toString(autostart));
		}
	}

	public boolean isAutostart() {
		Boolean value = false;
		OilObject obj = findObj("AUTOSTART");
		OilAttribute attr = this.findAttr("AUTOSTART");
		if (attr != null) {
			obj = new OilObject_Attribute("AUTOSTART", attr.getValue());
			this.addObj(obj);
			this.getAttr().remove(attr);
		}
		if (obj != null) {
			value = Boolean.parseBoolean(obj.getValue());
		}
		return value;
	}

	/**
	 * @param schedule
	 *            the schedule to set
	 */
	public void setSchedule(boolean schedule) {
		OilAttribute attr = findAttr("SCHEDULE");
		if (attr == null) {
			this.addAttr(new OilAttribute("SCHEDULE", Boolean.toString(schedule)));
			return;
		}
		attr.setValue(Boolean.toString(schedule));
	}

	/**
	 * @return the schedule
	 */
	public boolean isSchedule() {
		Boolean value = false;
		OilAttribute attr = findAttr("SCHEDULE");
		if (attr != null) {
			String temp = attr.getValue();
			if (temp.equals("FULL") || temp.equals("true"))
				value = true;
		}
		return value;
	}

	/**
	 * @param priority
	 *            the priority to set
	 * @throws InvalidOilException
	 *             invalid integer range
	 */
	public void setPriority(int priority) throws InvalidOilException {
		OilSpecValidator.validateUint32(priority);
		OilAttribute attr = this.findAttr("PRIORITY");
		if (attr != null)
			attr.setValue(Integer.toString(priority));
		else {
			OilAttribute temp = new OilAttribute("PRIORITY", Integer.toString(priority));
			this.addAttr(temp);
		}
	}

	/**
	 * @return the priority
	 */
	public int getPriority() {
		OilAttribute attr = findAttr("PRIORITY");
		int value = 1;
		if (attr != null) {
			String temp = attr.getValue().toUpperCase();
			if (temp.contains("0X")) {
				temp = temp.replaceFirst("^0X", "");
				value = Integer.parseInt(temp, 16);
			} else
				value = Integer.parseInt(attr.getValue());
		}
		return value;
	}

	/**
	 * @return the accessibleResources
	 */
	public List<String> getAccessingResources() {
		OilObject obj = findObj("RESOURCE");
		List<String> temp = new ArrayList<String>();
		if (obj != null) {
			for (OilAttribute attr : obj.getAttr()) {
				temp.add(attr.getValue());
			}
		}
		return temp;
	}

	public List<String> getAccessibleResources() {
		OilObject obj = findObj("RESOURCE");
		List<String> temp = new ArrayList<String>();
		if (obj != null) {
			for (OilAttribute attr : obj.getAttr()) {
				temp.add(attr.getValue());
			}
		}
		return temp;
	}

	public void setAccessibleResources(List<String> accessibleResources) {
		OilObject obj = findObj("RESOURCE");
		List<OilAttribute> temp = new ArrayList<OilAttribute>();
		for (String attr : accessibleResources) {
			temp.add(new OilAttribute("RESOURCE", attr));
		}
		obj.setAttr(temp);
	}

	/**
	 * @return the accessibleEvents
	 */
	public List<String> getAccessingEvents() {
		List<String> temp = new ArrayList<String>();
		for (OilAttribute attr : this.getAttr()) {
			if (attr.getName().equals("EVENT"))
				temp.add(attr.getValue());
		}
		return temp;
	}

	public List<String> getAccessibleEvents() {
		List<String> temp = new ArrayList<String>();
		for (OilAttribute attr : this.getAttr()) {
			if (attr.getName().equals("EVENT"))
				temp.add(attr.getValue());
		}
		return temp;
	}

	public void setAccessibleEvents(List<String> accessibleEvents) {
		OilObject obj = findObj("EVENT");
		List<OilAttribute> temp = new ArrayList<OilAttribute>();
		for (String attr : accessibleEvents) {
			temp.add(new OilAttribute("EVENT", attr));
		}
		obj.setAttr(temp);
	}

	/**
	 * Checks whether this task owns an event given as argument
	 *
	 * @param e
	 *            An OIL Event
	 * @return true if this task owns the event
	 */
	public boolean isOwnsEvent(OilEvent e) {
		for (String eName : this.getAccessibleEvents()) {
			if (eName.equals(e.getName())) {
				return true;
			}
		}
		return false;
	}

	public boolean containsEvent(OilEvent evt) {
		for (String oe : getAccessingEvents()) {
			if (oe.equals(evt.getName())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @return APPMODE
	 * @throws IllegalAccessException
	 *             when this task is not an AUTOSTART task
	 */
	public String getAppMode() {
		OilObject obj = findObj("AUTOSTART");
		if (obj == null)
			return "standard";
		OilAttribute attr = obj.findAttr("APPMODE");
		if(attr == null)
			return "standard";
		
		return attr.getValue();
	}

	/**
	 * @param appMode
	 *            an APPMODE to set
	 */
	public void setAppMode(String appMode) {
		OilObject obj = findObj("AUTOSTART");
		if (obj == null) {
			obj = new OilObject_Attribute("AUTOSTART", "TRUE");
		}
		OilAttribute attr = obj.findAttr("APPMODE");
		if (attr == null) {
			OilAttribute temp = new OilAttribute("APPMODE", appMode);
			obj.addAttr(temp);
		} else {
			attr.setValue(appMode);
		}
	}

	/**
	 * @return the activation
	 */
	public int getActivation() {
		int value = 1;

		OilAttribute attr = findAttr("ACTIVATION");
		if (attr != null)
			value = Integer.parseInt(attr.getValue());
		return value;
	}

	/**
	 * @param activation
	 *            the activation to set
	 * @throws InvalidOilException
	 *             invalid activation value
	 */
	public void setActivation(int activation) throws InvalidOilException {
		OilSpecValidator.validateUint32(activation);
		OilAttribute attr = findAttr("ACTIVATION");
		if (attr == null)
			this.addAttr(new OilAttribute("ACTIVATION", Integer.toString(activation)));
		else
			attr.setValue(Integer.toString(activation));
	}

	/**
	 * @return the extended
	 */
	public boolean isExtended() {
		boolean value = false;
		OilAttribute attr = findAttr("EXTENDED");
		if (attr != null)
			value = Boolean.parseBoolean(attr.getValue());
		return value;
	}

	public void setExtended(boolean extended) {
		OilAttribute attr = findAttr("EXTENDED");
		if (attr == null)
			this.addAttr(new OilAttribute("EXTENDED", Boolean.toString(extended)));
		else
			attr.setValue(Boolean.toString(extended));
	}

	// temporarily added for YAML -Seongjun Park
	public int getStackSize() {
		int value = 0x250;
		OilAttribute attr = findAttr("STACKSIZE");
		if (attr != null)
			value = Integer.parseInt(attr.getValue());
		return value;
	}

	public void setStackSize(int stackSize) {
		OilAttribute attr = findAttr("STACKSIZE");
		if (attr == null)
			this.addAttr(new OilAttribute("STACKSIZE", Integer.toString(stackSize)));
		else
			attr.setValue(Integer.toString(stackSize));
	}

	/**
	 * update isExtended value of this task by checking whether it has any
	 * accessing events
	 */
	public void updateIsExtended() {
		setExtended(this.getAccessibleEvents().isEmpty());
	}

	@Override
	public String toString() {
		return "OilTask: " + this.getName() + ", " + getPriority() + ", " + isAutostart() + ", " + getActivation()
				+ ", " + isSchedule() + ", " + isExtended() + ", " + getAccessingResources() + ", "
				+ getAccessingEvents();
	}

	public String allObjectString(OilObject a, String space) {
		String temp = "";
		if (a instanceof OilTask) {
			temp += space + "TASK " + a.getName() + "{\n";
		}

		for (OilAttribute attr : a.getAttr()) {
			temp += space + "\t" + attr.getName() + " = " + attr.getValue() + ";\n";
		}

		for (OilObject obj : a.getObj()) {
			if (obj.getName().equals("RESOURCE") || obj.getName().equals("EVENT")) {
				temp += allObjectString(obj, space);
			} 
			else  if(obj.getName().equals("AUTOSTART") && obj.getValue().toUpperCase().equals("FALSE")){
				temp +=space + "\t" + obj.getName() + " = " + obj.getValue() + ";\n";
				continue;
			}
			else {
				temp += space + "\t" + obj.getName() + " = " + obj.getValue() + " {\n";
				temp += allObjectString(obj, space + "\t");
			}
		}
		if (!a.getName().equals("RESOURCE") && !a.getName().equals("EVENT"))
			temp += space + "};\n";
		return temp;
	}

}
