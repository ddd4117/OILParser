package sselab.nusek.oil;

/**
 * Oil Counter
 * 
 * @author Wooyong Choi
 * @version 1/8/2016
 */
/**
 * Oil Counter
 * 
 * @author TaeHyun Lee
 * @version 11/27/2017
 */
public class OilCounter extends OilObject {

	// SysCounter is default counter
	public OilCounter() throws InvalidOilException {
		setName("SysCounter");
		setMinCycle(1);
		setMaxAllowedValue(32767);
		setTicksPerBase(1);
	}

	public OilCounter(String name, int minCycle, int maxAllowedValue, int ticksPerBase) throws InvalidOilException {
		setName(name);
		setMinCycle(minCycle);
		setMaxAllowedValue(maxAllowedValue);
		setTicksPerBase(ticksPerBase);
	}
	
	
	@Override
	public String toString() {
		return "OilCounter: " + this.getName() + ", " + getMinCycle() + ", " + getMaxAllowedValue() + ", "
				+ getTicksPerBase();
	}

	public int getMinCycle() {
		OilAttribute attr = this.findAttr("MINCYCLE");
		Integer value = 1;
		if (attr != null)
			value = Integer.parseInt(attr.getValue());
		return value;
	}

	public void setMinCycle(int minCycle) {
		OilAttribute attr = this.findAttr("MINCYCLE");
		if(attr != null)
			attr.setValue(Integer.toString(minCycle));
		else
		{
			OilAttribute temp = new OilAttribute("MINCYCLE", Integer.toString(minCycle));
			this.addAttr(temp);
		}
	}

	public int getMaxAllowedValue() {
		OilAttribute attr = this.findAttr("MAXALLOWEDVALUE");
		Integer value = 32767;
		if (attr != null)
			value = Integer.parseInt(attr.getValue());
		return value;
	}

	public void setMaxAllowedValue(int maxAllowedValue) {
		OilAttribute attr = this.findAttr("MAXALLOWEDVALUE");
		if(attr != null)
			attr.setValue(Integer.toString(maxAllowedValue));
		else
		{
			OilAttribute temp = new OilAttribute("MAXALLOWEDVALUE", Integer.toString(maxAllowedValue));
			this.addAttr(temp);
		}
	}

	public int getTicksPerBase() {
		OilAttribute attr = this.findAttr("TICKSPERBASE");
		Integer value = 1;
		if (attr != null)
			value = Integer.parseInt(attr.getValue());
		return value;
	}

	public void setTicksPerBase(int ticksPerBase) {
		OilAttribute attr = this.findAttr("TICKSPERBASE");
		if(attr != null)
			attr.setValue(Integer.toString(ticksPerBase));
		else
		{
			OilAttribute temp = new OilAttribute("TICKSPERBASE", Integer.toString(ticksPerBase));
			this.addAttr(temp);
		}
	}

}
