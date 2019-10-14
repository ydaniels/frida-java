/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public final class GIOStreamSpliceFlags {
  public final static GIOStreamSpliceFlags G_IO_STREAM_SPLICE_NONE = new GIOStreamSpliceFlags("G_IO_STREAM_SPLICE_NONE", fridacoreJNI.G_IO_STREAM_SPLICE_NONE_get());
  public final static GIOStreamSpliceFlags G_IO_STREAM_SPLICE_CLOSE_STREAM1 = new GIOStreamSpliceFlags("G_IO_STREAM_SPLICE_CLOSE_STREAM1", fridacoreJNI.G_IO_STREAM_SPLICE_CLOSE_STREAM1_get());
  public final static GIOStreamSpliceFlags G_IO_STREAM_SPLICE_CLOSE_STREAM2 = new GIOStreamSpliceFlags("G_IO_STREAM_SPLICE_CLOSE_STREAM2", fridacoreJNI.G_IO_STREAM_SPLICE_CLOSE_STREAM2_get());
  public final static GIOStreamSpliceFlags G_IO_STREAM_SPLICE_WAIT_FOR_BOTH = new GIOStreamSpliceFlags("G_IO_STREAM_SPLICE_WAIT_FOR_BOTH", fridacoreJNI.G_IO_STREAM_SPLICE_WAIT_FOR_BOTH_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GIOStreamSpliceFlags swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GIOStreamSpliceFlags.class + " with value " + swigValue);
  }

  private GIOStreamSpliceFlags(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GIOStreamSpliceFlags(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GIOStreamSpliceFlags(String swigName, GIOStreamSpliceFlags swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GIOStreamSpliceFlags[] swigValues = { G_IO_STREAM_SPLICE_NONE, G_IO_STREAM_SPLICE_CLOSE_STREAM1, G_IO_STREAM_SPLICE_CLOSE_STREAM2, G_IO_STREAM_SPLICE_WAIT_FOR_BOTH };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

