/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public final class GIOChannelError {
  public final static GIOChannelError G_IO_CHANNEL_ERROR_FBIG = new GIOChannelError("G_IO_CHANNEL_ERROR_FBIG");
  public final static GIOChannelError G_IO_CHANNEL_ERROR_INVAL = new GIOChannelError("G_IO_CHANNEL_ERROR_INVAL");
  public final static GIOChannelError G_IO_CHANNEL_ERROR_IO = new GIOChannelError("G_IO_CHANNEL_ERROR_IO");
  public final static GIOChannelError G_IO_CHANNEL_ERROR_ISDIR = new GIOChannelError("G_IO_CHANNEL_ERROR_ISDIR");
  public final static GIOChannelError G_IO_CHANNEL_ERROR_NOSPC = new GIOChannelError("G_IO_CHANNEL_ERROR_NOSPC");
  public final static GIOChannelError G_IO_CHANNEL_ERROR_NXIO = new GIOChannelError("G_IO_CHANNEL_ERROR_NXIO");
  public final static GIOChannelError G_IO_CHANNEL_ERROR_OVERFLOW = new GIOChannelError("G_IO_CHANNEL_ERROR_OVERFLOW");
  public final static GIOChannelError G_IO_CHANNEL_ERROR_PIPE = new GIOChannelError("G_IO_CHANNEL_ERROR_PIPE");
  public final static GIOChannelError G_IO_CHANNEL_ERROR_FAILED = new GIOChannelError("G_IO_CHANNEL_ERROR_FAILED");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GIOChannelError swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GIOChannelError.class + " with value " + swigValue);
  }

  private GIOChannelError(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GIOChannelError(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GIOChannelError(String swigName, GIOChannelError swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GIOChannelError[] swigValues = { G_IO_CHANNEL_ERROR_FBIG, G_IO_CHANNEL_ERROR_INVAL, G_IO_CHANNEL_ERROR_IO, G_IO_CHANNEL_ERROR_ISDIR, G_IO_CHANNEL_ERROR_NOSPC, G_IO_CHANNEL_ERROR_NXIO, G_IO_CHANNEL_ERROR_OVERFLOW, G_IO_CHANNEL_ERROR_PIPE, G_IO_CHANNEL_ERROR_FAILED };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

