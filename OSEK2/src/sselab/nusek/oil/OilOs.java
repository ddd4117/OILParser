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
	// private String status;
	//
	// private boolean errorHook;
	//
	// private boolean shutdownHook;
	//
	// private boolean pretaskHook;
	//
	// private boolean posttaskHook;
	//
	// // Build Option -Wooyong Choi
	// private String appSrc;
	// private List<OilAttribute> otherAttributes = new ArrayList<>();
	//
	// // temporarily added for YAML -Seongjun Park
	// private boolean stackMonitoring = false;
	// private boolean useGetServiceId = false;
	// private boolean useParameterAccess = false;
	// private String scalabilityClass = "SC1";
	// private int hookStackSize = 0x200;
	// private boolean protectionHook = false;
	// private boolean startupHook = true;
	// private String includeFileName = "sample1.h";
	// private boolean build = false;

	public OilOs() throws InvalidOilException {
		this.setName("myOS");
		// this("myOS", "\"test.c\"", "STANDARD");
	}

	/**
	 * @param osname
	 *            name of this OS
	 * @param src
	 *            application source file name
	 * @param status
	 *            STANDARD / EXTENDED
	 * @throws InvalidOilException
	 */
	public OilOs(String osname, String src, String status) throws InvalidOilException {
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
		setStatus(os.getStatus());
		// this.errorHook = os.errorHook;
		setErrorHook(os.isErrorHook());
		// this.shutdownHook = os.shutdownHook;
		setShutdownHook(os.isShutdownHook());
		// this.pretaskHook = os.pretaskHook;
		setPretaskHook(os.isPretaskHook());
		// this.posttaskHook = os.posttaskHook;
		setPosttaskHook(os.isPosttaskHook());
		// this.stackMonitoring = os.stackMonitoring;
		setStackMonitoring(os.isStackMonitoring());
		// this.useGetServiceId = os.useGetServiceId;
		setUseGetServiceId(os.isUseGetServiceId());
		// this.scalabilityClass = os.scalabilityClass;
		setScalabilityClass(os.getScalabilityClass());
		// this.hookStackSize = os.hookStackSize;
		setHookStackSize(os.getHookStackSize());
		// this.protectionHook = os.protectionHook;
		setProtectionHook(os.isProtectionHook());
		setStartupHook(os.isStartupHook());
		// this.startupHook = os.startupHook;
		// this.includeFileName = os.includeFileName;
		setIncludeFileName(os.getIncludeFileName());
		// this.appSrc = os.appSrc;

		setAppSrc(os.getAppSrc());

		for (OilObject obj : os.getObj()) {
			this.addObj(obj);
		}
		// for (OilAttribute attribute : os.otherAttributes) {
		// this.otherAttributes.add(new OilAttribute(attribute));
		// }
	}

	public void deleteOtherAttribute(int index) throws InvalidOilException {

		// this.otherAttributes.remove(index);
	}

	/**
	 * @param status
	 *            status to set
	 * @throws InvalidOilException
	 *             when the status is neither "STANDARD" nor "EXTENDED"
	 */
	public void setStatus(String status) throws InvalidOilException {
		if (!"STANDARD".equals(status) && !"EXTENDED".equals(status)) {
			throw new InvalidOilException("the status shall be either STANDARD or EXTENDED");
		}
		OilAttribute attr = this.findAttr("STATUS");
		if (attr == null)
			this.addAttr(new OilAttribute("STATUS", status));
		else
			attr.setValue(status);
	}

	/**
	 * Set {@code PRETASKHOOK} value
	 *
	 * @param hook
	 *            PRETASKHOOK value
	 */
	public void setPretaskHook(boolean pretaskHook) {
		OilAttribute attr = this.findAttr("PRETASKHOOK");
		if (attr == null)
			this.addAttr(new OilAttribute("PRETASKHOOK", Boolean.toString(pretaskHook)));
		else
			attr.setValue(Boolean.toString(pretaskHook));

	}

	/**
	 * Set {@code ERRORHOOK} value
	 *
	 * @param hook
	 *            ERRORHOOK value
	 */
	public void setErrorHook(boolean errorHook) {
		OilAttribute attr = this.findAttr("ERRORHOOK");
		if (attr == null)
			this.addAttr(new OilAttribute("ERRORHOOK", Boolean.toString(errorHook)));
		else
			attr.setValue(Boolean.toString(errorHook));
	}

	/**
	 * Set {@code SHUTDOWNHOOK} value
	 *
	 * @param hook
	 *            SHUTDOWNHOOK value
	 */
	public void setShutdownHook(boolean shutdownHook) {
		OilAttribute attr = this.findAttr("SHUTDOWNHOOK");
		if (attr == null)
			this.addAttr(new OilAttribute("SHUTDOWNHOOK", Boolean.toString(shutdownHook)));
		else
			attr.setValue(Boolean.toString(shutdownHook));

	}

	/**
	 * Set {@code POSTTASKHOOK} value
	 *
	 * @param hook
	 *            POSTTASKHOOK value
	 */
	public void setPosttaskHook(boolean posttaskHook) {
		OilAttribute attr = this.findAttr("POSTTASKHOOK");
		if (attr == null)
			this.addAttr(new OilAttribute("POSTTASKHOOK", Boolean.toString(posttaskHook)));
		else
			attr.setValue(Boolean.toString(posttaskHook));
	}

	/** @return other attributes, such as compiler flags */
	public List<OilAttribute> getOtherAttributes() {
		List<OilAttribute> temp = new ArrayList<OilAttribute>();
		for (OilAttribute attr : this.getAttr()) {
			if (attr.getName().equals("STATUS") || attr.getName().equals("STARTUPHOOK")
					|| attr.getName().equals("ERRORHOOK") || attr.getName().equals("SHUTDOWNHOOK")
					|| attr.getName().equals("PRETASKHOOK") || attr.getName().equals("POSTTASKHOOK")
					|| attr.getName().equals("USEGETSERVICEID") || attr.getName().equals("USEPARAMETERACCESS")
					|| attr.getName().equals("USERESSCHEDULER"))
				continue;
			temp.add(attr);
		}
		for (OilObject obj : this.getObj()) {
			for (OilAttribute attr : obj.getAttr()) {
				temp.add(attr);
			}
		}
		return temp;
	}

	/** @return OS status: {STANDARD, EXTENDED} */
	public String getStatus() {
		OilAttribute attr = findAttr("STATUS");
		if (attr != null)
			return attr.getValue();
		return "STANDARD";
	}

	/**
	 * Set the path to the application source file
	 *
	 * @param appSrc
	 *            path (filename) to the application source file
	 */
	public void setAppSrc(String appSrc) {
		OilObject obj = this.findObj("BUILD");
		if (obj != null) {
			OilAttribute attr = obj.findAttr("APP_SRC");
			if (attr != null)
				attr.setValue(appSrc);
		} else {
			OilAttribute attr = this.findAttr("APP_SRC");
			if (attr != null)
				attr.setValue(appSrc);
		}
	}

	/** @return application source file name */
	public String getAppSrc() {
		OilAttribute temp = findAttr("APP_SRC");
		if (temp == null) {
			for (OilObject obj : getObj()) {
				for (OilAttribute attr : obj.getAttr()) {
					OilAttribute src = attr;
					if (src.getName().equals("APP_SRC")) {
						return src.getValue();
					}
				}
			}
			return "test.c";
		} else {
			return temp.getValue();
		}
	}

	/** @return true if ERRORHOOK is set to TRUE */
	public boolean isErrorHook() {
		OilAttribute attr = findAttr("ERRORHOOK");
		Boolean value = true;
		if (attr != null)
			value = Boolean.parseBoolean(attr.getValue());
		return value;
	}

	/** @return true if SHUTDOWNHOOK is set to TRUE */
	public boolean isShutdownHook() {
		OilAttribute attr = findAttr("SHUTDOWNHOOK");
		Boolean value = true;
		if (attr != null)
			value = Boolean.parseBoolean(attr.getValue());
		return value;
	}

	/** @return true if PRETASKHOOK is set to TRUE */
	public boolean isPretaskHook() {
		OilAttribute attr = findAttr("PRETASKHOOK");
		Boolean value = true;
		if (attr != null)
			value = Boolean.parseBoolean(attr.getValue());
		return value;
	}

	/** @return true if POSTTASKHOOK is set to TRUE */
	public boolean isPosttaskHook() {
		OilAttribute attr = findAttr("POSTTASKHOOK");
		Boolean value = true;
		if (attr != null)
			value = Boolean.parseBoolean(attr.getValue());
		return value;
	}

	// temporarily added for YAML -Seongjun Park
	public boolean isStatupHook() {
		OilAttribute attr = findAttr("STARTUPHOOK");
		Boolean value = false;
		if (attr != null)
			value = Boolean.parseBoolean(attr.getValue());
		return value;
	}

	public boolean isStartupHook() {
		OilAttribute attr = findAttr("STARTUPHOOK");
		Boolean value = false;
		if (attr != null)
			value = Boolean.parseBoolean(attr.getValue());
		return value;
	}

	public void setStartupHook(boolean startupHook) {
		OilAttribute attr = findAttr("STARTUPHOOK");
		if (attr == null)
			this.addAttr(new OilAttribute("STARTUPHOOK", Boolean.toString(startupHook)));
		else
			attr.setValue(Boolean.toString(startupHook));
	}

	public boolean isBuild() {
		OilAttribute attr = findAttr("BUILD");
		Boolean value = false;
		if (attr != null)
			value = Boolean.parseBoolean(attr.getValue());
		return value;
	}

	public void setBuild(boolean build) {
		OilAttribute attr = findAttr("BUILD");
		if (attr == null)
			this.addAttr(new OilAttribute("BUILD", Boolean.toString(build)));
		else
			attr.setValue(Boolean.toString(build));
	}

	public void setOtherAttributes(List<OilAttribute> otherAttributes) {
		this.setAttr(otherAttributes);
	}

	// temporarily added for YAML -Seongjun Park
	public boolean isStackMonitoring() {
		OilAttribute attr = findAttr("STACKMONITORING");
		Boolean value = false;
		if (attr != null)
			value = Boolean.parseBoolean(attr.getValue());
		return value;
	}

	public void setStackMonitoring(boolean stackMonitoring) {
		OilAttribute attr = findAttr("STACKMONITORING");
		if (attr == null)
			this.addAttr(new OilAttribute("STACKMONITORING", Boolean.toString(stackMonitoring)));
		else
			attr.setValue(Boolean.toString(stackMonitoring));
	}

	// temporarily added for YAML -Seongjun Park
	public boolean isUseGetServiceId() {
		OilAttribute attr = findAttr("USEGETSERVICEID");
		Boolean value = false;
		if (attr != null)
			value = Boolean.parseBoolean(attr.getValue());
		return value;
	}

	public void setUseGetServiceId(boolean useGetServiceId) {
		OilAttribute attr = findAttr("USEGETSERVICEID");
		if (attr == null)
			this.addAttr(new OilAttribute("USEGETSERVICEID", Boolean.toString(useGetServiceId)));
		else
			attr.setValue(Boolean.toString(useGetServiceId));
	}

	// temporarily added for YAML -Seongjun Park
	public boolean isUseParameterAccess() {
		OilAttribute attr = findAttr("USEPARAMETERACCESS");
		Boolean value = false;
		if (attr != null)
			value = Boolean.parseBoolean(attr.getValue());
		return value;
	}

	public void setUseParameterAccess(boolean useParameterAccess) {
		OilAttribute attr = findAttr("USEPARAMETERACCESS");
		if (attr == null)
			this.addAttr(new OilAttribute("USEPARAMETERACCESS", Boolean.toString(useParameterAccess)));
		else
			attr.setValue(Boolean.toString(useParameterAccess));
	}

	// temporarily added for YAML -Seongjun Park
	public String getScalabilityClass() {
		OilAttribute attr = findAttr("SCALABILITYCLASS");
		if (attr != null)
			return attr.getValue();
		return "SC1";
	}

	public void setScalabilityClass(String scalabilityClass) {
		OilAttribute attr = findAttr("SCALABILITYCLASS");
		if (attr == null)
			this.addAttr(new OilAttribute("SCALABILITYCLASS", scalabilityClass));
		else
			attr.setValue(scalabilityClass);
	}

	// temporarily added for YAML -Seongjun Park
	public int getHookStackSize() {
		OilAttribute attr = findAttr("HOOKSTACKSIZE");
		Integer value = 0x200;
		if (attr != null)
			value = Integer.parseInt(attr.getValue());
		return value;
	}

	public void setHookStackSize(int hookStackSize) {
		OilAttribute attr = findAttr("HOOKSTACKSIZE");
		if (attr == null)
			this.addAttr(new OilAttribute("HOOKSTACKSIZE", Integer.toString(hookStackSize)));
		else
			attr.setValue(Integer.toString(hookStackSize));
	}

	// temporarily added for YAML -Seongjun Park
	public boolean isProtectionHook() {
		OilAttribute attr = findAttr("PROTECTIONHOOK");
		Boolean value = false;
		if (attr != null)
			value = Boolean.parseBoolean(attr.getValue());
		return value;
	}

	public void setProtectionHook(boolean protectionHook) {
		OilAttribute attr = findAttr("PROTECTIONHOOK");
		if (attr == null)
			this.addAttr(new OilAttribute("PROTECTIONHOOK", Boolean.toString(protectionHook)));
		else
			attr.setValue(Boolean.toString(protectionHook));
	}

	// temporarily added for YAML -Seongjun Park
	public String getIncludeFileName() {
		OilAttribute attr = findAttr("INCLUDEFILENAME");
		if (attr != null)
			return attr.getValue();
		return "sample1.h";
	}

	public void setIncludeFileName(String includeFileName) {
		OilAttribute attr = findAttr("INCLUDEFILENAME");
		if (attr == null)
			this.addAttr(new OilAttribute("INCLUDEFILENAME", includeFileName));
		else
			attr.setValue(includeFileName);
	}

	@Override
	public String allObjectString(OilObject a, String space) {
		String temp = "";

		if (a instanceof OilOs) {
			temp += space + "OS " + a.getName() + "{\n";
			if (findAttr("STATUS") == null)
				temp += "\t" + "STATUS = " + this.getStatus() + ";\n";
			if (findAttr("ERRORHOOK") == null)
				temp += "\t" + "ERRORHOOK = " + this.isErrorHook() + ";\n";
			if (findAttr("STARTUPHOOK") == null)
				temp += "\t" + "STARTUPHOOK = " + this.isStartupHook() + ";\n";
			if (findAttr("SHUTDOWNHOOK") == null)
				temp += "\t" + "SHUTDOWNHOOK = " + this.isShutdownHook() + ";\n";
			if (findAttr("PRETASKHOOK") == null)
				temp += "\t" + "PRETASKHOOK = " + this.isPretaskHook() + ";\n";
			if (findAttr("POSTTASKHOOK") == null)
				temp += "\t" + "POSTTASKHOOK = " + this.isPosttaskHook() + ";\n";
			if (findAttr("USEGETSERVICEID") == null)
				temp += "\t" + "USEGETSERVICEID = " + this.isUseGetServiceId() + ";\n";
			if (findAttr("USEPARAMETERACCESS") == null)
				temp += "\t" + "USEPARAMETERACCESS = " + this.isUseParameterAccess() + ";\n";
		}

		for (OilAttribute attr : a.getAttr()) {
			temp += space + "\t" + attr.getName() + " = " + attr.getValue() + ";\n";
		}

		for (OilObject obj : a.getObj()) {
			temp += space + "\t" + obj.getName() + " = " + obj.getValue() + " {\n";
			temp += allObjectString(obj, space + "\t");
		}
		temp += space + "};\n";
		return temp;
	}

	public String toString() {
		String retval = "OS configuration\n";
		retval += "name: " + this.getName() + "\n";
		retval += "status: " + this.getStatus() + "\n";
		retval += "error hook: " + this.isErrorHook() + "\n";
		retval += "shutdown hook: " + this.isShutdownHook() + "\n";
		retval += "pretask hook: " + this.isPretaskHook() + "\n";
		retval += "posttask hook: " + this.isPosttaskHook() + "\n";
		retval += "appsrc: " + this.getAppSrc() + "\n";
		for (OilAttribute attr : this.getOtherAttributes()) {
			retval += attr.toString() + "\n";
		}
		return retval;
	}
}
