package object;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Data wrapper class for an OIL specification.
 * <p>
 * <h2>Example code showing how to load properties of a task:</h2>
 * 
 * <pre>
 * {
 * 	&#64;code
 * 	OilSpec spec; // shall be initialized first
 * 	OilTask task1 = spec.getTasks().get(0); // get an arbitrary task
 * 	String name = task1.getName(); // get task name
 * 	int priority = task1.getPriority(); // get task priority
 * }
 * </pre>
 *
 * @author Taejoon Byun
 * @author Dongwoo Kim
 * @version 8/09/2017
 */
public class OilSpec {

	private static final Logger LOGGER = Logger.getLogger(OilSpec.class.getName());

	private String implementationName;

	/** an APP_MODE. Default value of it is arbitrarily set to "default" */
	private OilAppMode appMode;
	private List<OilAppMode> appModeList = new ArrayList<>();

	/** the name of the CPU. The default value is arbitrarily set */
	private String cpuName = "default_cpu";

	private OilOs os;

	/** The list of OIL tasks */
	private List<OilTask> tasks = new ArrayList<>();

	/** The list of OIL resources */
	private List<OilResource> resources = new ArrayList<>();

	/** The list of OIL events */
	private List<OilEvent> events = new ArrayList<>();

	/** The list of OIL tasks */
	private List<OilAlarm> alarms = new ArrayList<>();

	/** The list of OIL events */
	private List<OilISR> isrs = new ArrayList<>();

	/**
	 * Construct an OIL specification from the scratch
	 */
	public OilSpec() {
		if(appMode != null) {System.out.println("null");}
		try {
			os = new OilOs();
		} catch (InvalidOilException e) {
			// this shall never happen
			e.printStackTrace();
			assert false;
		}
	}

	/**
	 * A copy constructor
	 * 
	 * @param spec
	 *            An OIL object to copy from
	 * @throws InvalidOilException
	 */
	public OilSpec(OilSpec spec) throws InvalidOilException {
		this.implementationName = spec.implementationName;
		this.appMode = spec.appMode;
		this.cpuName = spec.cpuName;
		this.os = new OilOs(spec.getOs());
		// now ids are considerated
		for (OilTask task : spec.tasks) {
			OilTask obj = new OilTask(task);
			obj.setId(task.getId());
			this.tasks.add(obj);
		}
		for (OilResource resource : spec.resources) {
			OilResource obj = new OilResource(resource);
			obj.setId(resource.getId());
			this.resources.add(obj);
		}
		for (OilEvent event : spec.events) {
			OilEvent obj = new OilEvent(event);
			obj.setId(event.getId());
			this.events.add(obj);
		}
		for (OilAlarm alm : spec.alarms) {
			OilAlarm obj = new OilAlarm(alm);
			obj.setId(alm.getId());
			this.alarms.add(obj);
		}
		for (OilISR isr : spec.isrs) {
			OilISR obj = new OilISR(isr);
			obj.setId(isr.getId());
			this.isrs.add(obj);
		}
	}

	/**
	 * Add an OilTask
	 *
	 * @param task
	 *            the task to add
	 */
	public void addTask(OilTask task) {
		this.tasks.add(task);
	}

	/**
	 * Add an OilResource
	 *
	 * @param resource
	 *            the resource to add
	 */
	public void addResource(OilResource resource) {
		this.resources.add(resource);
	}

	/**
	 * Add an OilEvent
	 *
	 * @param event
	 *            the event to add
	 */
	public void addEvent(OilEvent event) {
		this.events.add(event);
	}

	/**
	 * Add an OilAlarm
	 *
	 * @param alarm
	 *            the alarm to add
	 */
	public void addAlarm(OilAlarm alarm) {
		this.alarms.add(alarm);
	}

	/**
	 * Add an OilISR
	 *
	 * @param ISR
	 *            to add
	 */
	public void addISR(OilISR ISR) {
		this.isrs.add(ISR);
	}

	/**
	 * Add an OilISR
	 *
	 * @param isr
	 *            to add
	 */
	public void addIsr(OilISR isr) {
		this.isrs.add(isr);
	}

	/**
	 * @param appMode
	 *            the appMode to set
	 */
	public void setAppMode(OilAppMode appMode) {
		this.appMode = appMode;
	}

	public void setOs(OilOs os) {
		this.os = os;
	}

	/**
	 * @param cpuName
	 *            the cpuName to set
	 * @throws InvalidOilException
	 *             when validation fails
	 */
	public void setCpuName(String cpuName) throws InvalidOilException {
		OilSpecValidator.validateId(cpuName);
		this.cpuName = cpuName;
	}

	/**
	 * @param implementationName
	 *            the implementationName to set
	 * @throws InvalidOilException
	 *             when validation fails
	 */
	public void setImplementationName(String implementationName) throws InvalidOilException {
		OilSpecValidator.validateId(implementationName);
		this.implementationName = implementationName;
	}

	@Deprecated // Dongwoo : index management is not safe so deprecated
	public int getResourceIndex(String resName) {
		for (OilResource res : this.resources) {
			if (res.getName().equals(resName)) {
				return this.resources.indexOf(res);
			}
		}
		throw new NoSuchElementException("cannot find a resource named " + resName);
	}

	@Deprecated // Dongwoo : index management is not safe so deprecated
	public int getEventIndex(String evtName) {
		for (OilEvent evt : this.events) {
			if (evt.getName().equals(evtName)) {
				return this.events.indexOf(evt);
			}
		}
		throw new NoSuchElementException("cannot find an event named " + evtName);
	}

	/**
	 * DW Added : returns id of corresponding object name
	 * 
	 * @param name
	 *            of obj
	 * @return id of objName return -1 if there is no object having objName
	 */
	public int getIdOf(String objName) {
		for (OilObject t : getTasks()) {
			if (objName.equals(t.getName()))
				return t.getId();
		}
		for (OilObject t : getResources()) {
			if (objName.equals(t.getName()))
				return t.getId();
		}
		for (OilObject t : getEvents()) {
			if (objName.equals(t.getName()))
				return t.getId();
		}
		for (OilObject t : getAlarms()) {
			if (objName.equals(t.getName()))
				return t.getId();
		}
		for (OilObject t : getIsrs()) {
			if (objName.equals(t.getName()))
				return t.getId();
		}
		return -1;
	}

	public List<OilAppMode> getAppModeList() {
		return appModeList;
	}

	public void setAppModeList(List<OilAppMode> appModeList) {
		this.appModeList = appModeList;
	}
	public void addAppMode(OilAppMode appmode) {
		this.appModeList.add(appmode);
		this.setAppMode(appmode);
	}
	/**
	 * @return the list of OIL tasks
	 */
	public List<OilTask> getTasks() {
		return tasks;
	}

	/** @return the list of OIL resources */
	public List<OilResource> getResources() {
		return resources;
	}

	/** @return the list of OIL events */
	public List<OilEvent> getEvents() {
		return events;
	}

	/** @return the list of OIL alarms */
	public List<OilAlarm> getAlarms() {
		return alarms;
	}

	public List<OilISR> getIsrs() {
		return isrs;
	}

	public void setIsrs(List<OilISR> isrs) {
		this.isrs = isrs;
	}

	public OilOs getOs() {
		return this.os;
	}

	/**
	 * @return the cpuName
	 */
	public String getCpuName() {
		return cpuName;
	}

	/**
	 * @return the appMode
	 */
	public OilAppMode getAppMode() {
		return appMode;
	}

	/**
	 * @return all OilObjects
	 */
	public List<OilObject> getAllObjects() {
		List<OilObject> objects = new ArrayList<>();
		objects.add(this.getAppMode());
		objects.addAll(this.getTasks());
		objects.addAll(this.getResources());
		objects.addAll(this.getEvents());
		objects.addAll(this.getAlarms());
		objects.addAll(this.getIsrs());
		return objects;
	}

	/**
	 * @return the implementationName
	 */
	public String getImplementationName() {
		return implementationName;
	}

	public void updateCeilingPriority() {
		for (OilResource or : getResources()) {
			or.setCeilingPriority(getTasks(), getIsrs());
		}
	}

	/**
	 * validate this OilSpec
	 *
	 * @throws InvalidOilException
	 *             when this OIL spec is not valid
	 */
	public void validate() throws InvalidOilException {
		OilSpecValidator.validate(this);
	}

	/**
	 * flatten priority of OIL tasks, for model generation
	 * <p>
	 * <b>(example)</b> before: t1:3, t2:4, t3:1, t4:3 sort: t3:1, t1:3, t4:3,
	 * t2:4 after: t3:1, t1:2, t4:2, t2:3
	 * 
	 * @throws InvalidOilException
	 */
	public void flattenPriority() throws InvalidOilException {
		LOGGER.log(Level.FINE, "flattening OIL");
		LOGGER.log(Level.FINER, "before: " + tasks);
		LOGGER.log(Level.FINER, "before: " + resources);

		OilTaskISRSorter.sort(this.getTasks());
		OilTaskISRSorter.sort_ISR(this.getIsrs());

		int prioToSet = 1;
		int prevPrio = getTasks().get(0).getPriority();

		// Task Group
		for (OilTask t : getTasks()) {
			if (t.getPriority() > prevPrio)
				prioToSet++;
			prevPrio = t.getPriority();
			t.setPriority(prioToSet);
		}

		// ISR Group (can access Resource)
		prevPrio = 0;
		List<OilISR> noResISR = new ArrayList<OilISR>();
		for (OilISR i : getIsrs()) {
			// add to no Resource ISR Group
			if (i.getAccessibleResources().size() == 0) {
				noResISR.add(i);
				prevPrio = 0;
				continue;
			}

			if (i.getPriority() > prevPrio)
				prioToSet++;
			prevPrio = i.getPriority();
			i.setPriority(prioToSet);
		}

		// no Resource ISR Group
		prevPrio = 0;
		for (OilISR i : noResISR) {
			getIsrs().remove(i);

			if (i.getPriority() > prevPrio)
				prioToSet++;
			prevPrio = i.getPriority();
			i.setPriority(prioToSet);

			getIsrs().add(i);
		}

		// update ceiling priority of all the resources
		for (OilResource res : resources) {
			res.setCeilingPriority(tasks, isrs);
		}

		LOGGER.log(Level.FINER, "after: " + tasks);
		LOGGER.log(Level.FINER, "after: " + resources);
	}

	/** @return maximum task priority */
	public int getMaxPrio() {
		int maxPrio = 0;
		for (OilTask t : tasks) {
			maxPrio = t.getPriority() > maxPrio ? t.getPriority() : maxPrio;
		}
		return maxPrio;
	}

	@Override
	public String toString() {
		String result = "OIL SPEC\n";
		result += "APPMODE: " + this.getAppMode().toString() + "\n";
		result += "CPU name: " + this.getCpuName().toString() + "\n";
		result += this.os.toString();
		for (OilTask task : this.getTasks()) {
			result += task.toString() + "\n";
		}
		for (OilResource res : this.getResources()) {
			result += res.toString() + "\n";
		}
		for (OilEvent evt : this.getEvents()) {
			result += evt.toString() + "\n";
		}
		for (OilAlarm alm : this.getAlarms()) {
			result += alm.toString() + "\n";
		}
		for (OilISR isr : this.getIsrs()) {
			result += isr.toString() + "\n";
		}
		for (OilAppMode amd : this.getAppModeList()){
			result += amd.toString() + "\n";
		}
		return result;
	}

	private static class OilTaskISRSorter {

		public static void sort(List<OilTask> tasks) {
			LOGGER.log(Level.FINER, "before sort: " + tasks);
			quicksort(tasks, 0, tasks.size() - 1);
			LOGGER.log(Level.FINER, "after sort: " + tasks);
		}

		public static void sort_ISR(List<OilISR> ISRs) {
			LOGGER.log(Level.FINER, "before sort: " + ISRs);
			quicksort_ISR(ISRs, 0, ISRs.size() - 1);
			LOGGER.log(Level.FINER, "after sort: " + ISRs);
		}

		private static void quicksort(List<OilTask> tasks, int lo, int hi) {
			if (lo < hi) {
				int pos = partition(tasks, lo, hi);
				quicksort(tasks, lo, pos - 1);
				quicksort(tasks, pos + 1, hi);
			}
		}

		private static int partition(List<OilTask> tasks, int lo, int hi) {
			OilTask pivotItem = tasks.get(lo);
			swap(tasks, lo, hi);
			int storeIndex = lo;
			for (int i = lo; i < hi; i++) {
				if (tasks.get(i).getPriority() < pivotItem.getPriority()) {
					swap(tasks, i, storeIndex);
					storeIndex += 1;
				}
			}
			swap(tasks, storeIndex, hi);
			return storeIndex;
		}

		private static void swap(List<OilTask> tasks, int a, int b) {
			OilTask tmp = tasks.get(a);
			tasks.set(a, tasks.get(b));
			tasks.set(b, tmp);
		}

		private static void quicksort_ISR(List<OilISR> tasks, int lo, int hi) {
			if (lo < hi) {
				int pos = partition_ISR(tasks, lo, hi);
				quicksort_ISR(tasks, lo, pos - 1);
				quicksort_ISR(tasks, pos + 1, hi);
			}
		}

		private static int partition_ISR(List<OilISR> ISRs, int lo, int hi) {
			OilISR pivotItem = ISRs.get(lo);
			swap_ISR(ISRs, lo, hi);
			int storeIndex = lo;
			for (int i = lo; i < hi; i++) {
				if (ISRs.get(i).getPriority() < pivotItem.getPriority()) {
					swap_ISR(ISRs, i, storeIndex);
					storeIndex += 1;
				}
			}
			swap_ISR(ISRs, storeIndex, hi);
			return storeIndex;
		}

		private static void swap_ISR(List<OilISR> ISRs, int a, int b) {
			OilISR tmp = ISRs.get(a);
			ISRs.set(a, ISRs.get(b));
			ISRs.set(b, tmp);
		}
	}
}
