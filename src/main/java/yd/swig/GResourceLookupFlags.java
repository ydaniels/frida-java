/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public final class GResourceLookupFlags {
  public final static GResourceLookupFlags G_RESOURCE_LOOKUP_FLAGS_NONE = new GResourceLookupFlags("G_RESOURCE_LOOKUP_FLAGS_NONE", fridacoreJNI.G_RESOURCE_LOOKUP_FLAGS_NONE_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GResourceLookupFlags swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GResourceLookupFlags.class + " with value " + swigValue);
  }

  private GResourceLookupFlags(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GResourceLookupFlags(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GResourceLookupFlags(String swigName, GResourceLookupFlags swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GResourceLookupFlags[] swigValues = { G_RESOURCE_LOOKUP_FLAGS_NONE };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

