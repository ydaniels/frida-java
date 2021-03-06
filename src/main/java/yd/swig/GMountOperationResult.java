/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public final class GMountOperationResult {
  public final static GMountOperationResult G_MOUNT_OPERATION_HANDLED = new GMountOperationResult("G_MOUNT_OPERATION_HANDLED");
  public final static GMountOperationResult G_MOUNT_OPERATION_ABORTED = new GMountOperationResult("G_MOUNT_OPERATION_ABORTED");
  public final static GMountOperationResult G_MOUNT_OPERATION_UNHANDLED = new GMountOperationResult("G_MOUNT_OPERATION_UNHANDLED");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GMountOperationResult swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GMountOperationResult.class + " with value " + swigValue);
  }

  private GMountOperationResult(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GMountOperationResult(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GMountOperationResult(String swigName, GMountOperationResult swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GMountOperationResult[] swigValues = { G_MOUNT_OPERATION_HANDLED, G_MOUNT_OPERATION_ABORTED, G_MOUNT_OPERATION_UNHANDLED };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

