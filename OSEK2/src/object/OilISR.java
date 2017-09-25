package object;

import java.util.ArrayList;
import java.util.List;


/**
 * OIL ISR
 * 
 * @author Wooyong Choi
 * @version 28/7/2016
 */

public class OilISR extends OilObject {

  private String name;
  private int category = 2;
  private int priority = 1;
  private Signal source = Signal.SIGPIPE;
  private List<String> accessibleResources = new ArrayList<>();
  private List<String> accessibleMessages = new ArrayList<>();

  public OilISR() {

  }

  /**
   * ISR
   * 
   * @param name
   * @param priority
   * @param source
   * @throws InvalidOilException 
   */
  public OilISR(String name, int priority, String source) throws InvalidOilException {
    setName(name);
    setPriority(priority);
    setSource(Signal.toEnum(source));
  }

  public OilISR(OilISR isr) {
    this.name = isr.name;
    this.category = isr.category;
    this.priority = isr.priority;
    this.source = isr.source;
    for (String element : isr.getAccessibleResources())
      this.accessibleResources.add(element);
    for (String element : isr.getAccessibleMessages())
      this.accessibleMessages.add(element);
  }

  @Override
  public void addAttribute(String name, String value)
      throws NumberFormatException, InvalidOilException {
    switch (name) {
    case "CATEGORY":
      setCategory(Integer.parseInt(value));
      break;
    case "PRIORITY":
      setPriority(Integer.parseInt(value));
      break;
    case "SOURCE":
      setSource(Signal.toEnum(value));
      break;
    case "RESOURCE":
      addResource(value);
      break;
    case "MESSAGE":
      // addMessage(value);
      break; 
    default:
      break;
    }
  }
  
  public void addResource(String name) {
    accessibleResources.add(name);
  }
  
  public void addMessage(String name) {
    accessibleMessages.add(name);
  }

  @Override
  public String toString() {
    return "OilISR: " + this.getName() + ", " + getCategory() + ", "
        + getPriority() + ", " + getSource() + ", " + getAccessibleResources();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getCategory() {
    return category;
  }

  public void setCategory(int category) {
    this.category = category;
  }

  public int getPriority() {
    return priority;
  }

  public void setPriority(int priority)  throws InvalidOilException {
    this.priority = priority;
  }

  public Signal getSource() {
    return source;
  }

  public void setSource(Signal source) {
    this.source = source;
  }

  public List<String> getAccessibleResources() {
    return accessibleResources;
  }

  public void setAccessibleResources(List<String> accessibleResources) {
    this.accessibleResources = accessibleResources;
  }

  public List<String> getAccessibleMessages() {
    return accessibleMessages;
  }

  public void setAccessibleMessages(List<String> accessibleMessages) {
    this.accessibleMessages = accessibleMessages;
  }



  public enum Signal {
    SIGPIPE("SIGPIPE"), SIGTERM("SIGTERM"), SIGTRAP("SIGTRAP"), SIGUSR2(
        "SIGUSR2"), SIGQUIT("SIGQUIT");

    private String text;

    Signal(String signal) {
      this.text = signal;
    }

    public String toString() {
      return text;
    }

    public static Signal toEnum(String prop) {
      switch (prop) {
      case "SIGPIPE":
        return SIGPIPE;
      case "SIGTERM":
        return SIGTERM;
      case "SIGTRAP":
        return SIGTRAP;
      case "SIGUSR2":
        return SIGUSR2;
      case "SIGQUIT":
        return SIGQUIT;
      }
      throw new IllegalArgumentException("Invalid signal");
    }
  }



@Override
public void addAttribute(String list_name, String list_value, String name, String value)
		throws NumberFormatException, InvalidOilException {
	// TODO Auto-generated method stub
	
}
}
