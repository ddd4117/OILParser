package sselab.nusek.oil;

import java.util.List;

/**
 * OIL Resource
 * 
 * @author Taejoon Byun
 * @version 2/23/2015
 */
public class OilResource extends OilObject {

	/** ceiling priority */
	// private int prio = -1;

	/** resource property: either one of {STANDARD, LINKED, INTERNAL}. */
	// private ResourceProperty property = ResourceProperty.STANDARD;

	public OilResource() {

	}

	/**
	 * @param name
	 *            name of this resource
	 * @param property
	 *            resource property
	 * @throws InvalidOilException
	 *             failed to set name
	 */
	public OilResource(String name, String property) throws InvalidOilException {
		setProperty(property);
		setName(name);
	}

	public OilResource(OilResource resource) throws InvalidOilException {
		this.setName(resource.getName());
		setPrio(resource.getPrio());
		setProperty(resource.getProperty());
	}

	/**
	 * set the priority of this resource to the maximum priority value among all
	 * the tasks that access this resource
	 * 
	 * @param tasks
	 *            the set of all {#@code OilTask}s
	 */
	public void setCeilingPriority(List<OilTask> tasks, List<OilISR> isrs) {
		// a temporary value of the maximum priority. start from the smallest
		// value
		int tmpMaxPrio = -1;
		for (OilTask t : tasks) {
			for (String res : t.getAccessingResources()) {
				// if the task t accesses this resource
				if (this.getName().equals(res) && t.getPriority() > tmpMaxPrio) {
					// compare the priority of the task t with the local maximum
					// and
					// change the priority of the local maximum to the one of
					// the task t
					tmpMaxPrio = t.getPriority();
				}
			}
		}
		for (OilISR ISR : isrs) {
			for (String res : ISR.getAccessibleResources()) {
				// if the task t accesses this resource
				if (this.getName().equals(res) && ISR.getPriority() > tmpMaxPrio) {
					// compare the priority of the task t with the local maximum
					// and
					// change the priority of the local maximum to the one of
					// the task t
					tmpMaxPrio = ISR.getPriority();
				}
			}
		}
		setPrio(tmpMaxPrio);
	}

	/**
   * @return the prio
   */
  public int getPrio() {
	  Integer value = -1;
	  OilAttribute attr = findAttr("PRIO");
	  if(attr != null)
		  	value = Integer.parseInt(attr.getValue());
	  return value;
  }

  public void setPrio(int prio) {
	  OilAttribute attr = findAttr("PRIO");
		if(attr == null){
			this.addAttr(new OilAttribute("PRIO", Integer.toString(prio)));
			return;
		}
		attr.setValue(Integer.toString(prio));
	}
	/**
	 * @return the resource property
	 */
	public String getProperty() {
		String value = "STANDARD";
		OilAttribute attr = findAttr("RESOURCEPROPERTY");
		if(attr != null)
			value = attr.getValue();
		return value;
	}

	/**
	 * Set Resource property
	 * 
	 * @param property
	 *            a property to set
	 */
	public void setProperty(String property) {
		OilAttribute attr = findAttr("RESOURCEPROPERTY");
		if(attr == null)
		{
			this.addAttr(new OilAttribute("RESOURCEPROPERTY", property));
			return;
		}
		attr.setValue(property);
	}

	@Override
	public String toString() {
		return "OilResource: " + this.getName() + " " + this.getPrio();
	}
}
