package oil.object;

/**
 * Oil Counter
 * 
 * @author Wooyong Choi
 * @version 1/8/2016
 */
public class OilCounter extends OilObject {

  private int minCycle;
  private int maxAllowedValue;
  private int ticksPerBase;

  // SysCounter is default counter
  public OilCounter() throws InvalidOilException {
    setName("SysCounter");
    minCycle = 1;
    maxAllowedValue = 32767;
    ticksPerBase = 1;
  }

  public OilCounter(String name, int minCycle, int maxAllowedValue,
      int ticksPerBase) throws InvalidOilException {
    setName(name);
    this.minCycle = minCycle;
    this.maxAllowedValue = maxAllowedValue;
    this.ticksPerBase = ticksPerBase;
  }

  @Override
  public String toString() {
    return "OilCounter: " + this.getName() + ", " + getMinCycle() + ", "
        + getMaxAllowedValue() + ", " + getTicksPerBase();
  }

  @Override
  public void addAttribute(String name, String value)
      throws NumberFormatException, InvalidOilException {
    switch (name) {
    case "MINCYCLE":
      setMinCycle(Integer.parseInt(value));
      break;
    case "MAXALLOWEDVALUE":
      setMaxAllowedValue(Integer.parseInt(value));
      break;
    case "TICKSPERBASE":
      setTicksPerBase(Integer.parseInt(value));
      break;
    default:
      break;
    }
  }

  public int getMinCycle() {
    return minCycle;
  }

  public void setMinCycle(int minCycle) {
    this.minCycle = minCycle;
  }

  public int getMaxAllowedValue() {
    return maxAllowedValue;
  }

  public void setMaxAllowedValue(int maxAllowedValue) {
    this.maxAllowedValue = maxAllowedValue;
  }

  public int getTicksPerBase() {
    return ticksPerBase;
  }

  public void setTicksPerBase(int ticksPerBase) {
    this.ticksPerBase = ticksPerBase;
  }

}
