package object;


import java.util.ArrayList;
import java.util.List;

/**
 * Enumeration for the OSEK Conformance Class
 * @author Taejoon Byun
 * @version 1/20/2015
 */
public enum ConformanceClass {

	BCC1("BCC1", true, true), BCC2("BCC2", true, false), ECC1("ECC1", false,
			true), ECC2("ECC2", false, false);

	/** the string value of this conformance class */
	private String string;
	
	/** when there are no extended task */
	private boolean basicTaskOnly;
	
	/** when the ACTIVATION value of all the task is 0 */
	private boolean singleActivationOnly;

	ConformanceClass(String conformance, boolean isBasic,
			boolean isSingleActivation) {
		this.string = conformance;
		this.basicTaskOnly = isBasic;
		this.singleActivationOnly = isSingleActivation;
	}

	@Override
	public String toString() {
		return this.string;
	}

	/** 
	 * @return	the list of all {@code ConformanceClass}.
	 */
	public static List<ConformanceClass> getAll() {
		List<ConformanceClass> retval = new ArrayList<>();
		retval.add(ConformanceClass.BCC1);
		retval.add(ConformanceClass.BCC2);
		retval.add(ConformanceClass.ECC1);
		retval.add(ConformanceClass.ECC2);
		return retval;
	}

	/**
	 * @param oil
	 *            An OIL spec to analyze conformance class.
	 * @return a conformance class for the {@code OilSpec} {@code oil}.
	 */
	public static ConformanceClass getConformanceClass(OilSpec oil) {
		boolean basic = false;
		if (oil.getEvents().isEmpty()) {
			basic = true;
		} else if (oil.getEvents().size() != 0) {
			basic = false;
		}

		boolean single = true;
		for (OilTask t : oil.getTasks()) {
			if (t.getActivation() != 1) {
				single = false;
			}
		}
		ConformanceClass retval = null;
		for (ConformanceClass cc : ConformanceClass.getAll()) {
			if (cc.basicTaskOnly == basic && cc.singleActivationOnly == single) {
				retval = cc;
			}
		}
		assert retval != null;
		return retval;
	}
	
	public boolean issBasicTaskOnly() {
		return this.basicTaskOnly;
	}
	
	public boolean isSingleActivationOnly() {
		return this.singleActivationOnly;
	}
}
