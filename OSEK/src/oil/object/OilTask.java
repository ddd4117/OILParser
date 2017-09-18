package oil.object;

import java.util.ArrayList;
import java.util.List;

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
  private int priority = 1;

  /**
   * AUTOSTART = {TRUE, FALSE}
   */
  private boolean autostart = false;

  private String appMode = null;

  /**
   * activation count, integer
   */
  private int activation = 1;

  /**
   * SCHEDULE = {FULL, NON}
   */
  private boolean schedule = false;

  /**
   * EXTENDED = true or false
   */
  private boolean extended = false;

  // temporarily added for YAML -Seongjun Park
  private int stackSize = 0x250;

  /**
   * list of names of accessible resources
   */
  private List<String> accessibleResources = new ArrayList<>();

  /**
   * list of names of accessible events
   */
  private List<String> accessibleEvents = new ArrayList<>();

  public OilTask() {
  }
  
  public OilTask(OilTask task) throws InvalidOilException {
    this.setName(task.getName());
    this.priority = task.priority;
    this.autostart = task.autostart;
    this.appMode = task.appMode;
    this.activation = task.activation;
    this.schedule = task.schedule;
    this.extended = task.extended;
    this.stackSize = task.stackSize;
    for(String res : task.accessibleResources) {
      this.accessibleResources.add(res);
    }
    for(String ev : task.accessibleEvents) {
      this.accessibleEvents.add(ev);
    }
  }

  public void addResource(String res) {
    this.accessibleResources.add(res);
  }

  public void addEvent(String evt) {
    if (!this.extended) {
      this.extended = true;
    }
    this.accessibleEvents.add(evt);
  }

  /**
   * @param autostart the autostart to set
   */
  public void setAutostart(boolean autostart) {
    this.autostart = autostart;
  }

  /**
   * @param appMode an APPMODE to set
   */
  public void setAppMode(String appMode) {
    this.appMode = appMode;
  }

  /**
   * @param activation the activation to set
   * @throws InvalidOilException invalid activation value
   */
  public void setActivation(int activation) throws InvalidOilException {
    OilSpecValidator.validateUint32(activation);
    this.activation = activation;
  }

  /**
   * @param schedule the schedule to set
   */
  public void setSchedule(boolean schedule) {
    this.schedule = schedule;
  }

  /**
   * @param priority the priority to set
   * @throws InvalidOilException invalid integer range
   */
  public void setPriority(int priority) throws InvalidOilException {
    OilSpecValidator.validateUint32(priority);
    this.priority = priority;
  }

  /**
   * @return the accessibleResources
   */
  public List<String> getAccessingResources() {
    return accessibleResources;
  }

  /**
   * @return the accessibleEvents
   */
  public List<String> getAccessingEvents() {
    return accessibleEvents;
  }

  /**
   * Checks whether this task owns an event given as argument
   *
   * @param e An OIL Event
   * @return true if this task owns the event
   */
  public boolean isOwnsEvent(OilEvent e) {
    for (String eName : this.accessibleEvents) {
      if (eName.equals(e.getName())) {
        return true;
      }
    }
    return false;
  }

  /**
   * @return the priority
   */
  public int getPriority() {
    return priority;
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
   * @return the autostart
   */
  public boolean isAutostart() {
    return autostart;
  }

  /**
   * @return APPMODE
   * @throws IllegalAccessException when this task is not an AUTOSTART task
   */
  public String getAppMode() throws IllegalAccessException {
    if (this.appMode == null) {
      throw new IllegalAccessException("only autostart tasks can have APPMODE");
    }
    return this.appMode;
  }

  /**
   * @return the activation
   */
  public int getActivation() {
    return activation;
  }

  /**
   * @return the schedule
   */
  public boolean isSchedule() {
    return schedule;
  }

  /**
   * @return the extended
   */
  public boolean isExtended() {
    return extended;
  }

  // temporarily added for YAML -Seongjun Park
  public int getStackSize() {
    return this.stackSize;
  }

  /**
   * update isExtended value of this task by checking whether it has any
   * accessing events
   */
  public void updateIsExtended() {
    this.extended = this.accessibleEvents.isEmpty();
  }

  @Override
  public String toString() {
    return "OilTask: " + this.getName() + ", " + getPriority() + ", "
        + isAutostart() + ", " + getActivation() + ", " + isSchedule() + ", "
        + isExtended() + ", " + getAccessingResources() + ", "
        + getAccessingEvents();
  }

  @Override
  public void addAttribute(String name, String value)
      throws NumberFormatException, InvalidOilException {
    switch (name) {
      case "PRIORITY":
        setPriority(Integer.parseInt(value));
        break;
      case "AUTOSTART":
        setAutostart(value.contains("TRUE"));
        if (this.autostart) {
        /*
         * if autostart is true, set APPMODE. the last word that follows `=` is
         * appmode.
         */
          String[] splitList = value.split("=");
          setAppMode(splitList[splitList.length - 1]);
        }
        break;
      case "SCHEDULE":
        // FULL or NON
        setSchedule("FULL".equals(value));
        break;
      case "ACTIVATION":
        setActivation(Integer.parseInt(value));
        break;
      case "RESOURCE":
        addResource(value);
        break;
      case "EVENT":
        addEvent(value);
        break;
      default:
        break;
    }
  }
}
