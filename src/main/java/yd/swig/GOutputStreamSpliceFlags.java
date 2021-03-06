/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public final class GOutputStreamSpliceFlags {
  public final static GOutputStreamSpliceFlags G_OUTPUT_STREAM_SPLICE_NONE = new GOutputStreamSpliceFlags("G_OUTPUT_STREAM_SPLICE_NONE", fridacoreJNI.G_OUTPUT_STREAM_SPLICE_NONE_get());
  public final static GOutputStreamSpliceFlags G_OUTPUT_STREAM_SPLICE_CLOSE_SOURCE = new GOutputStreamSpliceFlags("G_OUTPUT_STREAM_SPLICE_CLOSE_SOURCE", fridacoreJNI.G_OUTPUT_STREAM_SPLICE_CLOSE_SOURCE_get());
  public final static GOutputStreamSpliceFlags G_OUTPUT_STREAM_SPLICE_CLOSE_TARGET = new GOutputStreamSpliceFlags("G_OUTPUT_STREAM_SPLICE_CLOSE_TARGET", fridacoreJNI.G_OUTPUT_STREAM_SPLICE_CLOSE_TARGET_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GOutputStreamSpliceFlags swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GOutputStreamSpliceFlags.class + " with value " + swigValue);
  }

  private GOutputStreamSpliceFlags(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GOutputStreamSpliceFlags(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GOutputStreamSpliceFlags(String swigName, GOutputStreamSpliceFlags swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GOutputStreamSpliceFlags[] swigValues = { G_OUTPUT_STREAM_SPLICE_NONE, G_OUTPUT_STREAM_SPLICE_CLOSE_SOURCE, G_OUTPUT_STREAM_SPLICE_CLOSE_TARGET };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

