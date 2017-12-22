package sselab.nusek.oil;

import java.util.ArrayList;

import org.antlr.v4.parse.ANTLRParser.parserRule_return;
import org.w3c.dom.css.Counter;

/**
 * Oil Counter
 * 
 * @author Wooyong Choi
 * @version 1/8/2016
 */

/**
 * Oil Alarm
 * 
 * @author Taehyun Lee
 * @version 11/27/2017
 */
public class OilAlarm extends OilObject {
	public OilAlarm() {
	}

	/**
	 * Alarm called by API later
	 * 
	 * @param name
	 * @param counter
	 * @param action
	 * @throws InvalidOilException
	 */
	public OilAlarm(String name, String counter, String action) throws InvalidOilException {
		setName(name);
		setCounter(counter);
		setAction(action);
	}

	/**
	 * Alarm starting immediately
	 * 
	 * @param name
	 * @param counter
	 * @param action
	 * @param alarmTime
	 * @param cycleTime
	 * @param appMode
	 * @throws InvalidOilException
	 */
	public OilAlarm(String name, String counter, String action, int alarmTime, int cycleTime, String appMode)
			throws InvalidOilException {
		this.setName(name);
		setCounter(counter);
		setAction(action);
		setAutostart(true);
		setAlarmTime(alarmTime);
		setCycleTime(cycleTime);
		setAppMode(appMode);
	}

	/**
	 * @param alarm
	 * @throws InvalidOilException
	 */
	public OilAlarm(OilAlarm alarm) throws InvalidOilException {
		this.setName(alarm.getName());
		setCounter(alarm.getCounter());
		setAction(alarm.getAction());
		setAutostart(alarm.isAutostart());
		setAlarmTime(alarm.getAlarmTime());
		setCycleTime(alarm.getCycleTime());
		setAppMode(alarm.getAppMode());
	}

	/**
	 * @return bigger compressed value
	 */
	public int getMaxCompressedStCy() {
		int max = Math.max(getCompressedStart(), getCompressedCycle());
		if (max == 0)
			max = 10;
		return max;
	}

	/**
	 * Calculate compressed start
	 * 
	 * @return compressed start
	 */
	public int getCompressedStart() {
		if (!isAutostart() || getAlarmTime() == 0)
			return 0;

		return getAlarmTime() / 100;
	}

	/**
	 * Calculate compressed cycle
	 * 
	 * @return compressed cycle
	 */
	public int getCompressedCycle() {
		if (!isAutostart() || getCycleTime() == 0)
			return 0;

		return getCycleTime() / 100;
	}

	/** default value is SystemCounter **/
	public String getCounter() {
		OilAttribute attr = this.findAttr("COUNTER");
		String value = "SystemCounter";
		if (attr != null)
			value = attr.getValue();
		return value;
	}

	public void setCounter(String value) {
		OilAttribute attr = this.findAttr("COUNTER");
		if (attr == null) {
			this.addAttr(new OilAttribute("COUNTER", value));
			return;
		}
		attr.setValue(value);
	}

	public boolean isAutostart() {
		OilObject obj = this.findObj("AUTOSTART");
		Boolean value = false;
		if (obj != null)
			value = Boolean.parseBoolean(obj.getValue());
		return value;
	}

	public void setAutostart(boolean autostart) {
		OilObject obj = this.findObj("AUTOSTART");
		if (obj == null) {
			this.addObj(new OilObject_Attribute("AUTOSTART", Boolean.toString(autostart)));
			return;
		}
		obj.setValue(Boolean.toString(autostart));
	}

	public int getAlarmTime() {
		OilObject obj = this.findObj("AUTOSTART");
		Integer value = 0;
		if (obj == null) {
			OilAttribute attr = this.findAttr("ALARMTIME");
			if (attr != null)
				value = Integer.parseInt(attr.getValue());

			return value;
		} else {
			OilAttribute attr = obj.findAttr("ALARMTIME");
			if (attr != null)
				value = Integer.parseInt(attr.getValue());
			return value;
		}
	}

	public void setAlarmTime(int alarmTime) {
		OilObject obj = this.findObj("AUTOSTART");
		if (obj == null) {
			obj = new OilObject_Attribute("AUTOSTART", "TRUE");
			this.addObj(obj);
		}

		OilAttribute attr = obj.findAttr("ALARMTIME");
		if (attr == null) {
			obj.addAttr(new OilAttribute("ALARMTIME", Integer.toString(alarmTime)));
		} else {
			attr.setValue(Integer.toString(alarmTime));
		}
	}

	public int getCycleTime() {
		OilObject obj = this.findObj("AUTOSTART");
		Integer value = 0;
		if (obj == null) {
			OilAttribute attr = this.findAttr("CYCLETIME");
			if (attr != null)
				value = Integer.parseInt(attr.getValue());
			return value;
		} else {
			OilAttribute attr = obj.findAttr("CYCLETIME");
			if (attr != null)
				value = Integer.parseInt(attr.getValue());
			return value;
		}

	}

	public void setCycleTime(int cycleTime) {
		OilObject obj = this.findObj("AUTOSTART");
		if (obj == null) {
			obj = new OilObject_Attribute("AUTOSTART", "TRUE");
			this.addObj(obj);
		}

		OilAttribute attr = obj.findAttr("CYCLETIME");
		if (attr == null) {
			obj.addAttr(new OilAttribute("CYCLETIME", Integer.toString(cycleTime)));
		} else {
			attr.setValue(Integer.toString(cycleTime));
		}
	}

	public String getAppMode() {
		OilObject obj = this.findObj("AUTOSTART");
		if (obj == null) {
			OilAttribute attr = this.findAttr("APPMODE");
			if (attr != null)
				return attr.getValue();
			return "";
		} else {
			OilAttribute attr = obj.findAttr("APPMODE");
			if (attr != null)
				return attr.getValue();
			return "";
		}

	}

	public void setAppMode(String appMode) {
		OilObject obj = this.findObj("AUTOSTART");
		if (obj == null)
			return;

		OilAttribute attr = obj.findAttr("APPMODE");
		if (attr != null)
			attr.setValue(appMode);
		else {
			OilAttribute temp = new OilAttribute("APPMODE", appMode);
			this.addAttr(temp);
		}
	}

	public String getAction() {
		OilObject obj = this.findObj("ACTION");
		if (obj != null)
			return obj.getValue();
		return "ALARMCALLBACK"; // default value
	}

	public void setAction(String action) {
		OilObject obj = this.findObj("ACTION");
		if(obj == null)
		{
			this.addObj(new OilObject_Attribute("ACTION", action));
			return;
		}
		obj.setValue(action);
	}

	/** Task is in ACTION OBJECT **/
	public String getTask() {
		OilObject obj = this.findObj("ACTION");
		if (obj == null)
			return null;

		OilAttribute attr = obj.findAttr("TASK");
		if (attr != null)
			return attr.getValue();
		return null;
	}

	public void setTask(String task) {
		OilObject obj = this.findObj("ACTION");
		if (obj == null)
		{
			obj = new OilObject_Attribute("ACTION", "ACTIVATETASK");
			this.addObj(obj);
		}

		OilAttribute attr = obj.findAttr("TASK");
		if(attr == null){
			obj.addAttr(new OilAttribute("TASK", task));
		}
		else{
			attr.setValue(task);
		}
	}

	public String getEvent() {
		OilObject obj = this.findObj("ACTION");
		if(obj == null) return "";
		OilAttribute attr = obj.findAttr("EVENT");

		if (attr != null)
			return attr.getValue();
		return "";
	}

	public void setEvent(String event) {
		OilObject obj = this.findObj("ACTION");
		if (obj == null)
		{
			obj = new OilObject_Attribute("ACTION", "SETEVENT");
			this.addObj(obj);
		}
		
		OilAttribute attr = obj.findAttr("EVENT");
		if(attr == null){
			obj.addAttr(new OilAttribute("EVENT", event));
		}
		else{
			attr.setValue(event);
		}
	}

	public String getAlarmCallBack() {
		OilObject obj = this.findObj("ACTION");
		if(obj == null) return "";
		OilAttribute attr = obj.findAttr("ALARMCALLBACK");
		if (attr != null)
			return attr.getValue();
		return "";
	}

	public void setAlarmCallBack(String alarmcallback) {
		OilObject obj = this.findObj("ACTION");
		if (obj == null)
		{
			obj = new OilObject_Attribute("ACTION", "ALARMCALLBACK");
			this.addObj(obj);
		}
		
		
		OilAttribute attr = obj.findAttr("ALARMCALLBACK");
		if(attr == null){
			obj.addAttr(new OilAttribute("ALARMCALLBACK", alarmcallback));
		}
		else{
			attr.setValue(alarmcallback);
		}
	}

	@Override
	public String toString() {
		return "OilAlarm: " + this.getName() + ", " + getCounter() + ", " + getAction().toString() + ", "
				+ isAutostart() + ", " + getAlarmTime() + ", " + getCycleTime() + ", " + getAppMode() + " ,"
				+ this.getTask();
	}
	
	public String allObjectString(OilObject a, String space) {
		String temp = "";
		if (a instanceof OilAlarm) {
			temp += space + "ALARM " + a.getName() + "{\n";
		}

		for (OilAttribute attr : a.getAttr()) {
			if( a.getName().equals("ACTION"))
			{
				switch(a.getValue()){
				case "ALARMCALLBACK":
					break;
				case "ACTIVATETASK":
					break;
				case "SETEVENT":
					break;
				}
			}
			temp += space + "\t" + attr.getName() + " = " + attr.getValue() + ";\n";
		}

		for (OilObject obj : a.getObj()) {
			if(obj.getName().equals("AUTOSTART") && obj.getValue().toUpperCase().equals("FALSE")){
				temp +=space + "\t" + obj.getName() + " = " + obj.getValue() + ";\n";
				continue;
			}
			else {
				temp += space + "\t" + obj.getName() + " = " + obj.getValue() + " {\n";
				temp += allObjectString(obj, space + "\t");
			}
		}
		temp += space + "};\n";
		return temp;
	}

}
