package object;

/**
 * A class for an OIL APPMODE object.
 * 
 * @author Taejoon Byun
 * @since 1/23/2015
 * @version 1/23/2015
 */
public class OilAppMode extends OilObject {

  public OilAppMode() {
  }
  /**
   * @param name
   *          name of this appmode
   * @throws InvalidOilException
   *           invalid name
   */
  public OilAppMode(String name) throws InvalidOilException {
    this.setName(name);
  }
  
  @Override
  public String toString() {
    return "OilAppMode: " + this.getName();
  }

  @Override
  public void addAttribute(String name, String value)
      throws NumberFormatException, InvalidOilException {
    //TODO
    //should never be called
    assert false;
  }

@Override
public void addAttribute(String list_name, String list_value, String name, String value)
		throws NumberFormatException, InvalidOilException {
	// TODO Auto-generated method stub
	
}


}
