package sselab.nusek.oil;

import java.util.ArrayList;

import org.w3c.dom.css.Counter;

/**
 * Oil Counter
 * 
 * @author Wooyong Choi
 * @version 1/8/2016
 */
public class OilAlarm extends OilObject {

	/** OilCounter for OilAlarm */
	private String counter = "SystemCounter";

	/** Action(AT, SE, ACB) for OilAlarm */
	private OilAlarmAction action = new OilAlarmAction();
	// private alarmAction action = alarmAction.ACB;

	/** Autostart for OilAlarm */
	private boolean autostart = false;
	private String task = "";

	/** Time to start for OilAlarm */
	private int alarmTime = 0;

	/** Cycle for OilAlarm */
	private int cycleTime = 0;

	/** Appmode for OilAlarm */
	private String appMode = null;

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
	public OilAlarm(String name, String counter, OilAlarmAction action) throws InvalidOilException {
		setName(name);
		this.counter = counter;
		this.action = action;
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
	public OilAlarm(String name, String counter, OilAlarmAction action, int alarmTime, int cycleTime, String appMode)
			throws InvalidOilException {
		this.setName(name);
		this.counter = counter;
		this.action = action;
		this.autostart = true;
		this.alarmTime = alarmTime;
		this.cycleTime = cycleTime;
		this.appMode = appMode;
	}

	/**
	 * @param alarm
	 * @throws InvalidOilException
	 */
	public OilAlarm(OilAlarm alarm) throws InvalidOilException {
		this.setName(alarm.getName());
		this.counter = alarm.counter;
		this.action = alarm.action;
		this.autostart = alarm.autostart;
		this.alarmTime = alarm.alarmTime;
		this.cycleTime = alarm.cycleTime;
		this.appMode = alarm.appMode;
	}

	@Override
	public void addAttribute(String list_name, String list_value, String name, String value)
			throws NumberFormatException, InvalidOilException {
		// TODO Auto-generated method stub
		list_name = list_name.toUpperCase();
		name = name.toUpperCase();
		switch (list_name) {
		case "ACTION":
			this.action.setAction(list_value);
			if (list_value.equals("SETEVENT"))
			{
			  switch (name) {
			  case "TASK":
			    this.action.setTask(value);
			    break;
			  case "EVENT":
			    this.action.setEvent(value);
			    break;
			  }
			}
			else if (list_value.equals("ACTIVATETASK"))
				this.action.setTask(value);
			else if (list_value.equals("ALARMCALLBACK"))
				this.action.setAlarmCallBack(value);
			else {
			}
			/* error case */
		case "AUTOSTART":
			if (list_value.equals("TRUE")) {
				setAutostart(true);
				switch (name) {
				case "APPMODE":
					setAppMode(value);
					break;
				case "ALARMTIME":
					setAlarmTime(Integer.parseInt(value));
					break;
				case "CYCLETIME":
					setCycleTime(Integer.parseInt(value));
					break;
				}
			} 
		default:
			/* error case */
			break;
		}
	}

	@Override
	public void addAttribute(String name, String value) throws NumberFormatException, InvalidOilException {
		name = name.toUpperCase();
		switch (name) {
		case "COUNTER":
			setCounter(value);
			break;
		case "TASK":
			this.action.setTask(value);
			break;
		case "AUTOSTART":
			if (value.equals("TRUE"))
				setAutostart(true);
			else
				setAutostart(false);
			break;
		case "ALARMTIME":
			if (this.autostart)
				setAlarmTime(Integer.parseInt(value));
			break;
		case "CYCLETIME":
			setCycleTime(Integer.parseInt(value));
			break;
		case "APPMODE":
			setAppMode(value);
			break;
		case "ACTION":
			if (name.equals("SETEVENT"))
				this.action.setEvent(value);
			else if (name.equals("ACTIVATETASK"))
				this.action.setTask(value);
			else if (name.equals("ALARMCALLBACK"))
				this.action.setAlarmCallBack(value);
			else {
				/* error case */}
			break;
		default:
			break;
		}
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
		if (!autostart || alarmTime == 0)
			return 0;

		return alarmTime / 100;
	}

	/**
	 * Calculate compressed cycle
	 * 
	 * @return compressed cycle
	 */
	public int getCompressedCycle() {
		if (!autostart || cycleTime == 0)
			return 0;

		return cycleTime / 100;
	}

	@Override
	public String toString() {
		return "OilAlarm: " + this.getName() + ", " + getCounter() + ", " + getAction().toString() + ", "
				+ isAutostart() + ", " + getAlarmTime() + ", " + getCycleTime() + ", " + getAppMode() + " ,"
				+ this.action.getTask();
	}

	public String getCounter() {
		return counter;
	}

	public void setCounter(String value) {
		this.counter = value;
	}

	public boolean isAutostart() {
		return autostart;
	}

	public void setAutostart(boolean autostart) {
		this.autostart = autostart;
	}

	public int getAlarmTime() {
		return alarmTime;
	}

	public void setAlarmTime(int alarmTime) {
		this.alarmTime = alarmTime;
	}

	public int getCycleTime() {
		return cycleTime;
	}

	public void setCycleTime(int cycleTime) {
		this.cycleTime = cycleTime;
	}

	public String getAppMode() {
		return appMode;
	}

	public void setAppMode(String appMode) {
		this.appMode = appMode;
	}


	public OilAlarmAction getAction() {
		return action;
	}

	public void setAction(OilAlarmAction action) {
		this.action = action;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

}
