/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public final class GIOCondition {
  public final static GIOCondition G_IO_IN = new GIOCondition("G_IO_IN", fridacoreJNI.G_IO_IN_get());
  public final static GIOCondition G_IO_OUT = new GIOCondition("G_IO_OUT", fridacoreJNI.G_IO_OUT_get());
  public final static GIOCondition G_IO_PRI = new GIOCondition("G_IO_PRI", fridacoreJNI.G_IO_PRI_get());
  public final static GIOCondition G_IO_ERR = new GIOCondition("G_IO_ERR", fridacoreJNI.G_IO_ERR_get());
  public final static GIOCondition G_IO_HUP = new GIOCondition("G_IO_HUP", fridacoreJNI.G_IO_HUP_get());
  public final static GIOCondition G_IO_NVAL = new GIOCondition("G_IO_NVAL", fridacoreJNI.G_IO_NVAL_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GIOCondition swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GIOCondition.class + " with value " + swigValue);
  }

  private GIOCondition(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GIOCondition(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GIOCondition(String swigName, GIOCondition swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GIOCondition[] swigValues = { G_IO_IN, G_IO_OUT, G_IO_PRI, G_IO_ERR, G_IO_HUP, G_IO_NVAL };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

