package oil.object;

/**
 * Invalid OIL spec exception
 * 
 * @author Taejoon Byun
 * @since 2/11/2015
 */
public class InvalidOilException extends Exception {

  /**
   * wtf is this?
   */
  private static final long serialVersionUID = 8799575759154189222L;

  public InvalidOilException(String msg) {
    super(msg);
  }
}
