package object;

import java.util.List;


/**
 * OIL Resource
 * 
 * @author Taejoon Byun
 * @version 2/23/2015
 */
public class OilResource extends OilObject {

  /** ceiling priority */
  private int prio = -1;

  /** resource property: either one of {STANDARD, LINKED, INTERNAL}. */
  private ResourceProperty property;

  public OilResource() {
  }

  /**
   * @param name
   *          name of this resource
   * @param property
   *          resource property
   * @throws InvalidOilException
   *           failed to set name
   */
  public OilResource(String name, ResourceProperty property)
      throws InvalidOilException {
    this.property = property;
    this.setName(name);
  }

  public OilResource(OilResource resource) throws InvalidOilException {
    this.setName(resource.getName());
    this.prio = resource.prio;
    this.property = resource.property;
  }

  /**
   * set the priority of this resource to the maximum priority value among all
   * the tasks that access this resource
   * 
   * @param tasks
   *          the set of all {#@code OilTask}s
   */
  public void setCeilingPriority(List<OilTask> tasks, List<OilISR> isrs) {
    // a temporary value of the maximum priority. start from the smallest value
    int tmpMaxPrio = -1;
    for (OilTask t : tasks) {
      for (String res : t.getAccessingResources()) {
        // if the task t accesses this resource
        if (this.getName().equals(res) && t.getPriority() > tmpMaxPrio) {
          // compare the priority of the task t with the local maximum and
          // change the priority of the local maximum to the one of the task t
          tmpMaxPrio = t.getPriority();
        }
      }
    }
    for (OilISR ISR : isrs) {
      for (String res : ISR.getAccessibleResources()) {
        // if the task t accesses this resource
        if (this.getName().equals(res) && ISR.getPriority() > tmpMaxPrio) {
          // compare the priority of the task t with the local maximum and
          // change the priority of the local maximum to the one of the task t
          tmpMaxPrio = ISR.getPriority();
        }
      }
    }
    this.prio = tmpMaxPrio;
  }

  /**
   * @return the prio
   */
  public int getPrio() {
    return prio;
  }

  /**
   * @return the resource property
   */
  public String getProperty() {
    return this.property.toString();
  }

  /**
   * Set Resource property
   * 
   * @param property
   *          a property to set
   */
  public void setProperty(ResourceProperty property) {
    this.property = property;
  }

  @Override
  public String toString() {
    return "OilResource: " + this.getName() + " " + this.getPrio();
  }

  @Override
  public void addAttribute(String name, String value) {
    if ("RESOURCEPROPERTY".equals(name)) {
      this.property = ResourceProperty.toEnum(value);
    } else {
      throw new IllegalArgumentException();
    }
  }

  public enum ResourceProperty {
    STANDARD("STANDARD"), LINKED("LINKED"), INTERNAL("INTERNAL");

    private String text;

    ResourceProperty(String text) {
      this.text = text;
    }

    @Override
    public String toString() {
      return text;
    }

    public static ResourceProperty toEnum(String prop) {
      switch (prop) {
      case "STANDARD":
        return STANDARD;
      case "LINKED":
        return LINKED;
      case "INTERNAL":
        return INTERNAL;
      }
      throw new IllegalArgumentException("Inavlid resource property");
    }
  }
}
