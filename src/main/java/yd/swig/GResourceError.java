/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public final class GResourceError {
  public final static GResourceError G_RESOURCE_ERROR_NOT_FOUND = new GResourceError("G_RESOURCE_ERROR_NOT_FOUND");
  public final static GResourceError G_RESOURCE_ERROR_INTERNAL = new GResourceError("G_RESOURCE_ERROR_INTERNAL");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GResourceError swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GResourceError.class + " with value " + swigValue);
  }

  private GResourceError(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GResourceError(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GResourceError(String swigName, GResourceError swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GResourceError[] swigValues = { G_RESOURCE_ERROR_NOT_FOUND, G_RESOURCE_ERROR_INTERNAL };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

