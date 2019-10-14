/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public final class GConvertError {
  public final static GConvertError G_CONVERT_ERROR_NO_CONVERSION = new GConvertError("G_CONVERT_ERROR_NO_CONVERSION");
  public final static GConvertError G_CONVERT_ERROR_ILLEGAL_SEQUENCE = new GConvertError("G_CONVERT_ERROR_ILLEGAL_SEQUENCE");
  public final static GConvertError G_CONVERT_ERROR_FAILED = new GConvertError("G_CONVERT_ERROR_FAILED");
  public final static GConvertError G_CONVERT_ERROR_PARTIAL_INPUT = new GConvertError("G_CONVERT_ERROR_PARTIAL_INPUT");
  public final static GConvertError G_CONVERT_ERROR_BAD_URI = new GConvertError("G_CONVERT_ERROR_BAD_URI");
  public final static GConvertError G_CONVERT_ERROR_NOT_ABSOLUTE_PATH = new GConvertError("G_CONVERT_ERROR_NOT_ABSOLUTE_PATH");
  public final static GConvertError G_CONVERT_ERROR_NO_MEMORY = new GConvertError("G_CONVERT_ERROR_NO_MEMORY");
  public final static GConvertError G_CONVERT_ERROR_EMBEDDED_NUL = new GConvertError("G_CONVERT_ERROR_EMBEDDED_NUL");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GConvertError swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GConvertError.class + " with value " + swigValue);
  }

  private GConvertError(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GConvertError(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GConvertError(String swigName, GConvertError swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GConvertError[] swigValues = { G_CONVERT_ERROR_NO_CONVERSION, G_CONVERT_ERROR_ILLEGAL_SEQUENCE, G_CONVERT_ERROR_FAILED, G_CONVERT_ERROR_PARTIAL_INPUT, G_CONVERT_ERROR_BAD_URI, G_CONVERT_ERROR_NOT_ABSOLUTE_PATH, G_CONVERT_ERROR_NO_MEMORY, G_CONVERT_ERROR_EMBEDDED_NUL };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

