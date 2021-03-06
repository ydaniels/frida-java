/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public final class GBusNameOwnerFlags {
  public final static GBusNameOwnerFlags G_BUS_NAME_OWNER_FLAGS_NONE = new GBusNameOwnerFlags("G_BUS_NAME_OWNER_FLAGS_NONE", fridacoreJNI.G_BUS_NAME_OWNER_FLAGS_NONE_get());
  public final static GBusNameOwnerFlags G_BUS_NAME_OWNER_FLAGS_ALLOW_REPLACEMENT = new GBusNameOwnerFlags("G_BUS_NAME_OWNER_FLAGS_ALLOW_REPLACEMENT", fridacoreJNI.G_BUS_NAME_OWNER_FLAGS_ALLOW_REPLACEMENT_get());
  public final static GBusNameOwnerFlags G_BUS_NAME_OWNER_FLAGS_REPLACE = new GBusNameOwnerFlags("G_BUS_NAME_OWNER_FLAGS_REPLACE", fridacoreJNI.G_BUS_NAME_OWNER_FLAGS_REPLACE_get());
  public final static GBusNameOwnerFlags G_BUS_NAME_OWNER_FLAGS_DO_NOT_QUEUE = new GBusNameOwnerFlags("G_BUS_NAME_OWNER_FLAGS_DO_NOT_QUEUE", fridacoreJNI.G_BUS_NAME_OWNER_FLAGS_DO_NOT_QUEUE_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GBusNameOwnerFlags swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GBusNameOwnerFlags.class + " with value " + swigValue);
  }

  private GBusNameOwnerFlags(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GBusNameOwnerFlags(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GBusNameOwnerFlags(String swigName, GBusNameOwnerFlags swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GBusNameOwnerFlags[] swigValues = { G_BUS_NAME_OWNER_FLAGS_NONE, G_BUS_NAME_OWNER_FLAGS_ALLOW_REPLACEMENT, G_BUS_NAME_OWNER_FLAGS_REPLACE, G_BUS_NAME_OWNER_FLAGS_DO_NOT_QUEUE };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

