/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public final class GSocketProtocol {
  public final static GSocketProtocol G_SOCKET_PROTOCOL_UNKNOWN = new GSocketProtocol("G_SOCKET_PROTOCOL_UNKNOWN", fridacoreJNI.G_SOCKET_PROTOCOL_UNKNOWN_get());
  public final static GSocketProtocol G_SOCKET_PROTOCOL_DEFAULT = new GSocketProtocol("G_SOCKET_PROTOCOL_DEFAULT", fridacoreJNI.G_SOCKET_PROTOCOL_DEFAULT_get());
  public final static GSocketProtocol G_SOCKET_PROTOCOL_TCP = new GSocketProtocol("G_SOCKET_PROTOCOL_TCP", fridacoreJNI.G_SOCKET_PROTOCOL_TCP_get());
  public final static GSocketProtocol G_SOCKET_PROTOCOL_UDP = new GSocketProtocol("G_SOCKET_PROTOCOL_UDP", fridacoreJNI.G_SOCKET_PROTOCOL_UDP_get());
  public final static GSocketProtocol G_SOCKET_PROTOCOL_SCTP = new GSocketProtocol("G_SOCKET_PROTOCOL_SCTP", fridacoreJNI.G_SOCKET_PROTOCOL_SCTP_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GSocketProtocol swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GSocketProtocol.class + " with value " + swigValue);
  }

  private GSocketProtocol(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GSocketProtocol(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GSocketProtocol(String swigName, GSocketProtocol swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GSocketProtocol[] swigValues = { G_SOCKET_PROTOCOL_UNKNOWN, G_SOCKET_PROTOCOL_DEFAULT, G_SOCKET_PROTOCOL_TCP, G_SOCKET_PROTOCOL_UDP, G_SOCKET_PROTOCOL_SCTP };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

