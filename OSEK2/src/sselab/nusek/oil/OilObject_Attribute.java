package sselab.nusek.oil;

public class OilObject_Attribute extends OilObject {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public OilObject_Attribute(String name, String value)
	{
		try {
			setName(name);
			setValue(value);
		} catch (InvalidOilException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public OilObject_Attribute(String name)
	{
		try {
			setName(name);
		} catch (InvalidOilException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public OilObject_Attribute()
	{
		
	}

}
