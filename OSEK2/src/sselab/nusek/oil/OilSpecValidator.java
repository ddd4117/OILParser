package sselab.nusek.oil;

import java.util.List;


/**
 * OIL spec validator utility class
 * 
 * @author Taejoon Byun
 * @version 3/25/2015
 */
class OilSpecValidator {

  private OilSpecValidator() {

  }

  /**
   * validate whether an OIL spec matches format and checks whether there are no
   * duplication among object names
   * 
   * @throws InvalidOilException
   *           when failure occurrs.
   */
  public static void validate(OilSpec oil) throws InvalidOilException {
    validateNames(oil.getAllObjects());
    validateId(oil.getCpuName());
    validateId(oil.getOs().getName());
    validateId(oil.getOs().getStatus());
    validateResources(oil.getResources());
    validateAppMode(oil.getTasks());
  }

  /**
   * Validate an identifier whether it matches ANSI-C identifier format
   * 
   * @param id
   *          an identifier to check
   * @throws InvalidOilException
   *           when it doesn't match
   */
  public static void validateId(String id) throws InvalidOilException {
    // ANSI-C identifier
    if (!id.matches("[a-zA-Z_][a-zA-Z0-9_]*")) {
      throw new InvalidOilException("identifier " + id
          + " doesn't match ANSI-C ID.");
    }
  }

  /**
   * Validate an integer whether it is between 1 to 255.
   * 
   * @param uint
   *          an integer to check
   * @throws InvalidOilException
   *           when failure
   */
  public static void validateUint32(int uint) throws InvalidOilException {
    if (uint < 0 || uint > 255) {
      throw new InvalidOilException(
          "invalid value range: an UINT32 shall be 0..255.");
    }
  }

  /**
   * validate APPMODE for auto-start tasks
   * 
   * @param tasks
   *          a list of all the tasks
   * @throws InvalidOilException
   *           when there is at least one task that is an auto-start task yet
   *           doesn't have an APPMODE set
   */
  private static void validateAppMode(List<OilTask> tasks)
      throws InvalidOilException {
    for (OilTask task : tasks) {
      if (task.isAutostart()) {
        final String errMsg = "Autostart tasks shall always have an APPMODE";
        if ("".equals(task.getAppMode())) {
            throw new InvalidOilException(errMsg);
          }
      }
    }
  }

  /**
   * validate the priority of all the resources
   * 
   * @param resources
   *          the list of resources
   * @throws InvalidOilException
   *           when fails
   */
  private static void validateResources(List<OilResource> resources)
      throws InvalidOilException {
    // the priority cannot be -1; if so, this means that there are no task
    // accessing this resource, which means the OIL is not coded properly,
    // having an unaccessible resource
    for (OilResource res : resources) {
      if (res.getPrio() == -1) {
        throw new InvalidOilException(
            "the OIL is not coded properly - it has an unaccessible resource");
      }
    }
  }

  /**
   * Validate whether there are duplication in the list
   * 
   * @param oilObjects
   *          a list of OIL objects to check
   * @throws InvalidOilSpecException
   *           duplication found
   */
  private static void validateNames(List<OilObject> oilObjects)
      throws InvalidOilException {
    // compare two oil objects
    for (int i = 0; i < oilObjects.size(); i++) {
      // validate name
      validateId(oilObjects.get(i).getName());
      for (int j = 0; j < oilObjects.size(); j++) {
        // if two different objects have the same name
        if (i != j
            && oilObjects.get(i).getName().equals(oilObjects.get(j).getName())) {
          // duplication found
          throw new InvalidOilException("duplication found in " + oilObjects);
        }
      }
    }
  }

}
