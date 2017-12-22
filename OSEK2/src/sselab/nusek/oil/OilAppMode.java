package sselab.nusek.oil;

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
}
