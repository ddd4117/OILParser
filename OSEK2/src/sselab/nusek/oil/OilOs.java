package sselab.nusek.oil;

import java.nio.channels.SelectableChannel;
import java.util.ArrayList;
import java.util.List;

/**
 * OIL OS data
 *
 * @author Taejoon Byun, Seongjun Park
 * @version 4/11/2015
 */
public class OilOs extends OilObject {

  /** the name of the APPMODE object */
  private String status;

  private boolean errorHook;

  private boolean shutdownHook;

  private boolean pretaskHook;

  private boolean posttaskHook;

  // Build Option -Wooyong Choi
  private String appSrc;
  private List<OilAttribute> otherAttributes = new ArrayList<>();

  // temporarily added for YAML -Seongjun Park
  private boolean stackMonitoring = false;
  private boolean useGetServiceId = false;
  private boolean useParameterAccess = false;
  private String scalabilityClass = "SC1";
  private int hookStackSize = 0x200;
  private boolean protectionHook = false;
  private boolean startupHook = true;
  private String includeFileName = "sample1.h";
  private boolean build = false;
  public OilOs() throws InvalidOilException {
    this("myOS", "\"test.c\"", "STANDARD");
  }

  /**
   * @param osname name of this OS
   * @param src    application source file name
   * @param status STANDARD / EXTENDED
   * @throws InvalidOilException
   */
  public OilOs(String osname, String src, String status)
      throws InvalidOilException {
    this.setName(osname);
    this.setStatus(status);
    this.setErrorHook(true);
    this.setPretaskHook(true);
    this.setPosttaskHook(true);
    this.setShutdownHook(true);
    this.setAppSrc(src);
  }
  
  public OilOs(OilOs os) throws InvalidOilException {
    this.setName(os.getName());
    this.status = os.status;
    this.errorHook = os.errorHook;
    this.shutdownHook = os.shutdownHook;
    this.pretaskHook = os.pretaskHook;
    this.posttaskHook = os.posttaskHook;
    this.stackMonitoring = os.stackMonitoring;
    this.useGetServiceId = os.useGetServiceId;
    this.scalabilityClass = os.scalabilityClass;
    this.hookStackSize = os.hookStackSize;
    this.protectionHook = os.protectionHook;
    this.startupHook = os.startupHook;
    this.includeFileName = os.includeFileName;
    this.appSrc = os.appSrc;
    for(OilAttribute attribute : os.otherAttributes) {
      this.otherAttributes.add(new OilAttribute(attribute));
    }
  }

  @Override
  public void addAttribute(String list_name, String list_value, String name, String value)
  		throws NumberFormatException, InvalidOilException {
  	// TODO Auto-generated method stub
	  list_name = list_name.toUpperCase();
	  name = name.toUpperCase();
	  System.out.println(list_name + " " + name);
  	if(list_name.equals("BUILD"))
  	{
  		if(list_value.equals("true")) this.build = true;
  	}
  	switch (name) {
    case "APP_SRC":
      setAppSrc(value);
      break;
    case "STATUS":
      setStatus(value);
      break;
    case "ERRORHOOK":
      setErrorHook("TRUE".equals(value));
      break;
    case "SHUTDOWNHOOK":
      setShutdownHook("TRUE".equals(value));
      break;
    case "PRETASKHOOK":
      setPretaskHook("TRUE".equals(value));
      break;
    case "POSTTASKHOOK":
      setPosttaskHook("TRUE".equals(value));
      break;
    case "BUILD":
  	  if(value.equals("TRUE"))
  		  this.build = true;
  	  break;
    default:
    	otherAttributes.add(new OilAttribute(name, value));
  	  break;
  }
  }
  
  /**
   * add an attribute
   *
   * @param name  name of the attribute
   * @param value value of the attribute
   * @throws InvalidOilException when the attribute does not match OIL format
   */
  public void addAttribute(String name, String value)
      throws InvalidOilException {
	  name = name.toUpperCase();
    switch (name) {
      case "APP_SRC":
        setAppSrc(value);
        break;
      case "STATUS":
        setStatus(value);
        break;
      case "ERRORHOOK":
        setErrorHook("TRUE".equals(value));
        break;
      case "SHUTDOWNHOOK":
        setShutdownHook("TRUE".equals(value));
        break;
      case "PRETASKHOOK":
        setPretaskHook("TRUE".equals(value));
        break;
      case "POSTTASKHOOK":
        setPosttaskHook("TRUE".equals(value));
        break;
      case "BUILD":
    	  if(value.equals("TRUE"))
    		  this.build = true;
    	  break;
      default:
    	  otherAttributes.add(new OilAttribute(name, value));
    	  break;
    }
  }

  /**
   * delete an 'other' attribute
   *
   * @param index the index of the attribute to delete
   */
  public void deleteOtherAttribute(int index) throws InvalidOilException{
    this.otherAttributes.remove(index);
  }

  /**
   * @param status status to set
   * @throws InvalidOilException when the status is neither "STANDARD" nor
   * "EXTENDED"
   */
  public void setStatus(String status) throws InvalidOilException {
    if (!"STANDARD".equals(status) && !"EXTENDED".equals(status)) {
      throw new InvalidOilException(
          "the status shall be either STANDARD or EXTENDED");
    }
    this.status = status;
  }

  /**
   * Set {@code PRETASKHOOK} value
   *
   * @param hook PRETASKHOOK value
   */
  public void setPretaskHook(boolean pretaskHook) {
    this.pretaskHook = pretaskHook;
  }

  /**
   * Set {@code ERRORHOOK} value
   *
   * @param hook ERRORHOOK value
   */
  public void setErrorHook(boolean errorHook) {
    this.errorHook = errorHook;
  }

  /**
   * Set {@code SHUTDOWNHOOK} value
   *
   * @param hook SHUTDOWNHOOK value
   */
  public void setShutdownHook(boolean shutdownHook) {
    this.shutdownHook = shutdownHook;
  }

  /**
   * Set {@code POSTTASKHOOK} value
   *
   * @param hook POSTTASKHOOK value
   */
  public void setPosttaskHook(boolean posttaskHook) {
    this.posttaskHook = posttaskHook;
  }

  /**
   * Set the path to the application source file
   *
   * @param appSrc path (filename) to the application source file
   */
  public void setAppSrc(String appSrc) {
    this.appSrc = appSrc;
  }

  /** @return other attributes, such as compiler flags */
  public List<OilAttribute> getOtherAttributes() {
    return this.otherAttributes;
  }

  /** @return OS status: {STANDARD, EXTENDED} */
  public String getStatus() {
    return status;
  }

  /** @return application source file name */
  public String getAppSrc() {
    return appSrc;
  }

  /** @return true if ERRORHOOK is set to TRUE */
  public boolean isErrorHook() {
    return errorHook;
  }

  /** @return true if SHUTDOWNHOOK is set to TRUE */
  public boolean isShutdownHook() {
    return shutdownHook;
  }

  /** @return true if PRETASKHOOK is set to TRUE */
  public boolean isPretaskHook() {
    return pretaskHook;
  }

  /** @return true if POSTTASKHOOK is set to TRUE */
  public boolean isPosttaskHook() {
    return posttaskHook;
  }

  // temporarily added for YAML -Seongjun Park
  public String getIncludeFileName() {
    return includeFileName;
  }

  // temporarily added for YAML -Seongjun Park
  public boolean isStackMonitoring() {
    return stackMonitoring;
  }

  // temporarily added for YAML -Seongjun Park
  public boolean isUseGetServiceId() {
    return useGetServiceId;
  }

  // temporarily added for YAML -Seongjun Park
  public boolean isUseParameterAccess() {
    return useParameterAccess;
  }

  // temporarily added for YAML -Seongjun Park
  public String getScalabilityClass() {
    return scalabilityClass;
  }

  // temporarily added for YAML -Seongjun Park
  public int getHookStackSize() {
    return hookStackSize;
  }

  // temporarily added for YAML -Seongjun Park
  public boolean isProtectionHook() {
    return protectionHook;
  }

  // temporarily added for YAML -Seongjun Park
  public boolean isStatupHook() {
    return startupHook;
  }

  @Override
  public String toString() {
    String retval = "OS configuration\n";
    retval += "name: " + this.getName() + "\n";
    retval += "status: " + this.getStatus() + "\n";
    retval += "error hook: " + this.isErrorHook() + "\n";
    retval += "shutdown hook: " + this.isShutdownHook() + "\n";
    retval += "pretask hook: " + this.isPretaskHook() + "\n";
    retval += "posttask hook: " + this.isPosttaskHook() + "\n";
    retval += "appsrc: " + this.getAppSrc() + "\n";
    for (OilAttribute attr : this.otherAttributes) {
      retval += attr.toString() + "\n";
    }
    return retval;
  }
}
