/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public final class GApplicationFlags {
  public final static GApplicationFlags G_APPLICATION_FLAGS_NONE = new GApplicationFlags("G_APPLICATION_FLAGS_NONE");
  public final static GApplicationFlags G_APPLICATION_IS_SERVICE = new GApplicationFlags("G_APPLICATION_IS_SERVICE", fridacoreJNI.G_APPLICATION_IS_SERVICE_get());
  public final static GApplicationFlags G_APPLICATION_IS_LAUNCHER = new GApplicationFlags("G_APPLICATION_IS_LAUNCHER", fridacoreJNI.G_APPLICATION_IS_LAUNCHER_get());
  public final static GApplicationFlags G_APPLICATION_HANDLES_OPEN = new GApplicationFlags("G_APPLICATION_HANDLES_OPEN", fridacoreJNI.G_APPLICATION_HANDLES_OPEN_get());
  public final static GApplicationFlags G_APPLICATION_HANDLES_COMMAND_LINE = new GApplicationFlags("G_APPLICATION_HANDLES_COMMAND_LINE", fridacoreJNI.G_APPLICATION_HANDLES_COMMAND_LINE_get());
  public final static GApplicationFlags G_APPLICATION_SEND_ENVIRONMENT = new GApplicationFlags("G_APPLICATION_SEND_ENVIRONMENT", fridacoreJNI.G_APPLICATION_SEND_ENVIRONMENT_get());
  public final static GApplicationFlags G_APPLICATION_NON_UNIQUE = new GApplicationFlags("G_APPLICATION_NON_UNIQUE", fridacoreJNI.G_APPLICATION_NON_UNIQUE_get());
  public final static GApplicationFlags G_APPLICATION_CAN_OVERRIDE_APP_ID = new GApplicationFlags("G_APPLICATION_CAN_OVERRIDE_APP_ID", fridacoreJNI.G_APPLICATION_CAN_OVERRIDE_APP_ID_get());
  public final static GApplicationFlags G_APPLICATION_ALLOW_REPLACEMENT = new GApplicationFlags("G_APPLICATION_ALLOW_REPLACEMENT", fridacoreJNI.G_APPLICATION_ALLOW_REPLACEMENT_get());
  public final static GApplicationFlags G_APPLICATION_REPLACE = new GApplicationFlags("G_APPLICATION_REPLACE", fridacoreJNI.G_APPLICATION_REPLACE_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GApplicationFlags swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GApplicationFlags.class + " with value " + swigValue);
  }

  private GApplicationFlags(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GApplicationFlags(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GApplicationFlags(String swigName, GApplicationFlags swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GApplicationFlags[] swigValues = { G_APPLICATION_FLAGS_NONE, G_APPLICATION_IS_SERVICE, G_APPLICATION_IS_LAUNCHER, G_APPLICATION_HANDLES_OPEN, G_APPLICATION_HANDLES_COMMAND_LINE, G_APPLICATION_SEND_ENVIRONMENT, G_APPLICATION_NON_UNIQUE, G_APPLICATION_CAN_OVERRIDE_APP_ID, G_APPLICATION_ALLOW_REPLACEMENT, G_APPLICATION_REPLACE };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

