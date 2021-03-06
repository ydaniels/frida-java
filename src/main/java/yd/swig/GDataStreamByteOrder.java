/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public final class GDataStreamByteOrder {
  public final static GDataStreamByteOrder G_DATA_STREAM_BYTE_ORDER_BIG_ENDIAN = new GDataStreamByteOrder("G_DATA_STREAM_BYTE_ORDER_BIG_ENDIAN");
  public final static GDataStreamByteOrder G_DATA_STREAM_BYTE_ORDER_LITTLE_ENDIAN = new GDataStreamByteOrder("G_DATA_STREAM_BYTE_ORDER_LITTLE_ENDIAN");
  public final static GDataStreamByteOrder G_DATA_STREAM_BYTE_ORDER_HOST_ENDIAN = new GDataStreamByteOrder("G_DATA_STREAM_BYTE_ORDER_HOST_ENDIAN");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GDataStreamByteOrder swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GDataStreamByteOrder.class + " with value " + swigValue);
  }

  private GDataStreamByteOrder(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GDataStreamByteOrder(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GDataStreamByteOrder(String swigName, GDataStreamByteOrder swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GDataStreamByteOrder[] swigValues = { G_DATA_STREAM_BYTE_ORDER_BIG_ENDIAN, G_DATA_STREAM_BYTE_ORDER_LITTLE_ENDIAN, G_DATA_STREAM_BYTE_ORDER_HOST_ENDIAN };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

