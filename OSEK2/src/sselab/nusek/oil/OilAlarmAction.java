package sselab.nusek.oil;

import sselab.nusek.oil.OilAlarm;

public class OilAlarmAction {
	private String text;
	private String alarmCallBack;
	private String task;
	private String event;
	private String action = "ALARMCALLBACK";
	
	
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getAlarmCallBack() {
		return alarmCallBack;
	}
	public void setAlarmCallBack(String alarmCallBack) {
		this.alarmCallBack = alarmCallBack;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}

	public String toString()
	{
		return this.action;
	}
	
}
