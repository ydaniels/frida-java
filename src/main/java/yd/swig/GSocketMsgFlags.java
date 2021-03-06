/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public final class GSocketMsgFlags {
  public final static GSocketMsgFlags G_SOCKET_MSG_NONE = new GSocketMsgFlags("G_SOCKET_MSG_NONE");
  public final static GSocketMsgFlags G_SOCKET_MSG_OOB = new GSocketMsgFlags("G_SOCKET_MSG_OOB", fridacoreJNI.G_SOCKET_MSG_OOB_get());
  public final static GSocketMsgFlags G_SOCKET_MSG_PEEK = new GSocketMsgFlags("G_SOCKET_MSG_PEEK", fridacoreJNI.G_SOCKET_MSG_PEEK_get());
  public final static GSocketMsgFlags G_SOCKET_MSG_DONTROUTE = new GSocketMsgFlags("G_SOCKET_MSG_DONTROUTE", fridacoreJNI.G_SOCKET_MSG_DONTROUTE_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GSocketMsgFlags swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GSocketMsgFlags.class + " with value " + swigValue);
  }

  private GSocketMsgFlags(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GSocketMsgFlags(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GSocketMsgFlags(String swigName, GSocketMsgFlags swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GSocketMsgFlags[] swigValues = { G_SOCKET_MSG_NONE, G_SOCKET_MSG_OOB, G_SOCKET_MSG_PEEK, G_SOCKET_MSG_DONTROUTE };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

