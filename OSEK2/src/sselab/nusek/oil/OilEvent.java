package sselab.nusek.oil;

/**
 * A class for the OIL description of an OSEK Event object.
 * 
 * @author Taejoon Byun
 * @version 1/22/2015
 */
/**
 * Oil Event
 * 
 * @author TaeHyun Lee
 * @version 11/27/2017
 */
public class OilEvent extends OilObject {

	public OilEvent() {
	}

	/**
	 * @param name
	 *            name of this event
	 * @throws InvalidOilException
	 *             invalid name
	 */
	public OilEvent(String name) throws InvalidOilException {
		this(name, "AUTO");
	}

	/**
	 * Create an OIL event with specific {@code mask}
	 * 
	 * @param name
	 *            name of this event object
	 * @param mask
	 *            the mask of this event of type UINT64.
	 * @throws InvalidOilException
	 *             invalid name
	 */
	public OilEvent(String name, String mask) throws InvalidOilException {
		this.setName(name);
		if (mask != null) {
			this.setMask(mask);
		} else {
			this.setMask("AUTO");
		}
	}

	public OilEvent(OilEvent event) throws InvalidOilException {
		this.setName(event.getName());
		setMask(event.getMask());
	}

	/**
	 * @return the mask
	 */
	public String getMask() {
		OilAttribute attr = this.findAttr("MASK");
		String value = "AUTO";
		if (attr != null)
			value = attr.getValue();
		return value;
	}

	/**
	 * @param mask
	 *            the mask to set
	 */
	public void setMask(String mask) {
		OilAttribute attr = this.findAttr("MASK");
		if(attr != null) 
		{
			attr.setValue(mask); 
		}
		else
		{
			OilAttribute temp = new OilAttribute("MASK", mask);
			this.addAttr(temp);
		}
	}
	
	@Override
	public String toString() {
		return "OilEvent: " + this.getName() + ", " + this.getMask();
	}

}
