package sselab.nusek.oil;

/**
 * An OIL attribute
 * 
 * @author Taejoon Byun
 * @version 2/13/2015
 */
public class OilAttribute {
  private String name;
  private String value;

  public OilAttribute(String name, String value) {
    this.name = name;
    this.value = value;
  }

  public OilAttribute(OilAttribute attribute) {
    this.name = attribute.name;
    this.value = attribute.value;
  }

  public String getName() {
    return this.name;
  }

  public String getValue() {
    return this.value;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "attribute - " + name + " = " + value;
  }
}