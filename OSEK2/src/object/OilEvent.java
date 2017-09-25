package object;

/**
 * A class for the OIL description of an OSEK Event object.
 * 
 * @author Taejoon Byun
 * @version 1/22/2015
 */
public class OilEvent extends OilObject {

  private String mask;

  public OilEvent() {
  }

  /**
   * @param name
   *          name of this event
   * @throws InvalidOilException
   *           invalid name
   */
  public OilEvent(String name) throws InvalidOilException {
    this(name, "AUTO");
  }

  /**
   * Create an OIL event with specific {@code mask}
   * 
   * @param name
   *          name of this event object
   * @param mask
   *          the mask of this event of type UINT64.
   * @throws InvalidOilException
   *           invalid name
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
    this.mask = event.mask;
  }

  /**
   * @return the mask
   */
  public String getMask() {
    return mask;
  }

  /**
   * @param mask
   *          the mask to set
   */
  public void setMask(String mask) {
    this.mask = mask;
  }

  @Override
  public void addAttribute(String name, String value) {
    switch (name) {
    case "MASK":
      this.setMask(value);
      break;
    default:
      throw new IllegalArgumentException("Invalid attribute");
    }
  }

  @Override
  public String toString() {
    return "OilEvent: " + this.getName() + ", " + this.getMask();
  }

@Override
public void addAttribute(String list_name, String list_value, String name, String value)
		throws NumberFormatException, InvalidOilException {
	// TODO Auto-generated method stub
	
}
}
