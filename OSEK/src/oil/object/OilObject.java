package oil.object;

/**
 * An abstract class for OIL Objects
 * 
 * @author Taejoon
 * @author Dongwoo Kim - add id of object
 * @version 4/25/2017
 */
public abstract class OilObject {
	
	// DW MOD 160708
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


  private String name;

  /**
   * @param name
   *          the name to set
   * @throws InvalidOilException
   *           invalid name
   */
  public void setName(String name) throws InvalidOilException {
    OilSpecValidator.validateId(name);
    this.name = name;
  }

  /**
   * Add an attribute of this OIL Object while parsing. Each OilObject implement
   * this with an appropriate switch-case statement.
   * 
   * @param name
   *          The name of an attribute
   * @param value
   *          The value of an attribute
   * @throws InvalidOilException
   * 
   * @throws NumberFormatException
   */
  public abstract void addAttribute(String name, String value)
      throws NumberFormatException, InvalidOilException;

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  @Override
  public abstract String toString();

}
