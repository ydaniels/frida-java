/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public final class GFileType {
  public final static GFileType G_FILE_TYPE_UNKNOWN = new GFileType("G_FILE_TYPE_UNKNOWN", fridacoreJNI.G_FILE_TYPE_UNKNOWN_get());
  public final static GFileType G_FILE_TYPE_REGULAR = new GFileType("G_FILE_TYPE_REGULAR");
  public final static GFileType G_FILE_TYPE_DIRECTORY = new GFileType("G_FILE_TYPE_DIRECTORY");
  public final static GFileType G_FILE_TYPE_SYMBOLIC_LINK = new GFileType("G_FILE_TYPE_SYMBOLIC_LINK");
  public final static GFileType G_FILE_TYPE_SPECIAL = new GFileType("G_FILE_TYPE_SPECIAL");
  public final static GFileType G_FILE_TYPE_SHORTCUT = new GFileType("G_FILE_TYPE_SHORTCUT");
  public final static GFileType G_FILE_TYPE_MOUNTABLE = new GFileType("G_FILE_TYPE_MOUNTABLE");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GFileType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GFileType.class + " with value " + swigValue);
  }

  private GFileType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GFileType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GFileType(String swigName, GFileType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GFileType[] swigValues = { G_FILE_TYPE_UNKNOWN, G_FILE_TYPE_REGULAR, G_FILE_TYPE_DIRECTORY, G_FILE_TYPE_SYMBOLIC_LINK, G_FILE_TYPE_SPECIAL, G_FILE_TYPE_SHORTCUT, G_FILE_TYPE_MOUNTABLE };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

