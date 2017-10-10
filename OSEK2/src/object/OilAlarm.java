package object;

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
  private alarmAction action = alarmAction.ACB;

  /** Autostart for OilAlarm */
  private boolean autostart = false;

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
  public OilAlarm(String name, String counter, alarmAction action)
      throws InvalidOilException {
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
  public OilAlarm(String name, String counter, alarmAction action,
      int alarmTime, int cycleTime, String appMode) throws InvalidOilException {
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
  	switch(list_name){
  	case "ACTION":
  		if (list_value == "SETEVENT")
  			action.event = value;
  		else if(list_value == "ACTIVATETASK")
  			action.task = value;
  		else if(list_value == "alarmCallBack")
  			action.alarmCallBack = value;
  		else{}
  			/* error case*/
 	default:
 		/* error case */
		break;
  	}
  }
  @Override
  public void addAttribute(String name, String value)
	      throws NumberFormatException, InvalidOilException {
	    switch (name) {
	    case "COUNTER":
	      setCounter(value);
	      break;
	    case "TASK":
	      action.task = value;
	      break;
	    case "AUTOSTART":
	        if(value == "TRUE")
	          setAutostart(true);
	        else
	        	setAutostart(false);
	      break;
	    case "ALARMTIME":
	    	if(this.autostart)
	    		setAlarmTime(Integer.parseInt(value));
	    	break;
	    case "CYCLETIME":
	      setCycleTime(Integer.parseInt(value));
	      break;
	    case "APPMODE":
	      setAppMode(value);
	      break;
	    case "ACTION":
		      if (value == "SETEVENT") {
		        setAction(OilAlarm.alarmAction.toEnum(value));
		      }
		      else if (value == "ACTIVATETASK") {
		        setAction(OilAlarm.alarmAction.toEnum(value));
		      }
		      else if (value == "ALARMCALLBACK"){
		        setAction(OilAlarm.alarmAction.toEnum(value));
		      }
		      else{ /* error case */}
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
   * @return compressed start
   */
  public int getCompressedStart() {
    if (!autostart || alarmTime == 0)
      return 0;
    
    return alarmTime / 100;
  }
  
  /**
   * Calculate compressed cycle
   * @return compressed cycle
   */
  public int getCompressedCycle() {
    if (!autostart || cycleTime == 0)
      return 0;
    
    return cycleTime / 100;
  }

  @Override
  public String toString() {
    return "OilAlarm: " + this.getName() + ", " + getCounter() + ", "
        + getAction().toString() + ", " + isAutostart() + ", " + getAlarmTime()
        + ", " + getCycleTime() + ", " + getAppMode();
  }

  public enum alarmAction {
    AT("ACTIVATETASK"), SE("SETEVENT"), ACB("ALARMCALLBACK");

    private String text;
    private String alarmCallBack;
    private String task;
    private String event;

    alarmAction(String signal) {
      this.text = signal;
      alarmCallBack = "";
      task = "";
      event = "";
    }

    alarmAction(String signal, String param) {
      this(signal);
      if (signal == "ACTIVATETASK")
        task = param;
      else
        alarmCallBack = param;
    }
    
    alarmAction(String signal, String task, String event) {
      this(signal);
      this.task = task;
      this.event = event;
    }

    public static alarmAction toEnum(String prop) {
      switch (prop) {
      case "ACTIVATETASK":
        return AT;
      case "SETEVENT":
        return SE;
      case "ALARMCALLBACK":
        return ACB;
      }
      throw new IllegalArgumentException("Invalid alarm action");
    }
    
    public String toString() {
      return text;
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
  }

  public String getCounter() {
    return counter;
  }

  public void setCounter(String value) {
    this.counter = value;
  }

  public alarmAction getAction() {
    return action;
  }

  public void setAction(alarmAction action) {
    this.action = action;
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


  
  

}
