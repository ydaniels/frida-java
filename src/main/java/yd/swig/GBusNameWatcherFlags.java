/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public final class GBusNameWatcherFlags {
  public final static GBusNameWatcherFlags G_BUS_NAME_WATCHER_FLAGS_NONE = new GBusNameWatcherFlags("G_BUS_NAME_WATCHER_FLAGS_NONE", fridacoreJNI.G_BUS_NAME_WATCHER_FLAGS_NONE_get());
  public final static GBusNameWatcherFlags G_BUS_NAME_WATCHER_FLAGS_AUTO_START = new GBusNameWatcherFlags("G_BUS_NAME_WATCHER_FLAGS_AUTO_START", fridacoreJNI.G_BUS_NAME_WATCHER_FLAGS_AUTO_START_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GBusNameWatcherFlags swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GBusNameWatcherFlags.class + " with value " + swigValue);
  }

  private GBusNameWatcherFlags(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GBusNameWatcherFlags(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GBusNameWatcherFlags(String swigName, GBusNameWatcherFlags swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GBusNameWatcherFlags[] swigValues = { G_BUS_NAME_WATCHER_FLAGS_NONE, G_BUS_NAME_WATCHER_FLAGS_AUTO_START };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

