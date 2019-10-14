/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public final class GFileCreateFlags {
  public final static GFileCreateFlags G_FILE_CREATE_NONE = new GFileCreateFlags("G_FILE_CREATE_NONE", fridacoreJNI.G_FILE_CREATE_NONE_get());
  public final static GFileCreateFlags G_FILE_CREATE_PRIVATE = new GFileCreateFlags("G_FILE_CREATE_PRIVATE", fridacoreJNI.G_FILE_CREATE_PRIVATE_get());
  public final static GFileCreateFlags G_FILE_CREATE_REPLACE_DESTINATION = new GFileCreateFlags("G_FILE_CREATE_REPLACE_DESTINATION", fridacoreJNI.G_FILE_CREATE_REPLACE_DESTINATION_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GFileCreateFlags swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GFileCreateFlags.class + " with value " + swigValue);
  }

  private GFileCreateFlags(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GFileCreateFlags(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GFileCreateFlags(String swigName, GFileCreateFlags swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GFileCreateFlags[] swigValues = { G_FILE_CREATE_NONE, G_FILE_CREATE_PRIVATE, G_FILE_CREATE_REPLACE_DESTINATION };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

