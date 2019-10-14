/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public final class GDataStreamNewlineType {
  public final static GDataStreamNewlineType G_DATA_STREAM_NEWLINE_TYPE_LF = new GDataStreamNewlineType("G_DATA_STREAM_NEWLINE_TYPE_LF");
  public final static GDataStreamNewlineType G_DATA_STREAM_NEWLINE_TYPE_CR = new GDataStreamNewlineType("G_DATA_STREAM_NEWLINE_TYPE_CR");
  public final static GDataStreamNewlineType G_DATA_STREAM_NEWLINE_TYPE_CR_LF = new GDataStreamNewlineType("G_DATA_STREAM_NEWLINE_TYPE_CR_LF");
  public final static GDataStreamNewlineType G_DATA_STREAM_NEWLINE_TYPE_ANY = new GDataStreamNewlineType("G_DATA_STREAM_NEWLINE_TYPE_ANY");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GDataStreamNewlineType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GDataStreamNewlineType.class + " with value " + swigValue);
  }

  private GDataStreamNewlineType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GDataStreamNewlineType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GDataStreamNewlineType(String swigName, GDataStreamNewlineType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GDataStreamNewlineType[] swigValues = { G_DATA_STREAM_NEWLINE_TYPE_LF, G_DATA_STREAM_NEWLINE_TYPE_CR, G_DATA_STREAM_NEWLINE_TYPE_CR_LF, G_DATA_STREAM_NEWLINE_TYPE_ANY };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

