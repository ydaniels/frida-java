/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public final class GBusType {
  public final static GBusType G_BUS_TYPE_STARTER = new GBusType("G_BUS_TYPE_STARTER", fridacoreJNI.G_BUS_TYPE_STARTER_get());
  public final static GBusType G_BUS_TYPE_NONE = new GBusType("G_BUS_TYPE_NONE", fridacoreJNI.G_BUS_TYPE_NONE_get());
  public final static GBusType G_BUS_TYPE_SYSTEM = new GBusType("G_BUS_TYPE_SYSTEM", fridacoreJNI.G_BUS_TYPE_SYSTEM_get());
  public final static GBusType G_BUS_TYPE_SESSION = new GBusType("G_BUS_TYPE_SESSION", fridacoreJNI.G_BUS_TYPE_SESSION_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GBusType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GBusType.class + " with value " + swigValue);
  }

  private GBusType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GBusType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GBusType(String swigName, GBusType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GBusType[] swigValues = { G_BUS_TYPE_STARTER, G_BUS_TYPE_NONE, G_BUS_TYPE_SYSTEM, G_BUS_TYPE_SESSION };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
