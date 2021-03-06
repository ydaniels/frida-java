/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public final class GDBusMessageType {
  public final static GDBusMessageType G_DBUS_MESSAGE_TYPE_INVALID = new GDBusMessageType("G_DBUS_MESSAGE_TYPE_INVALID");
  public final static GDBusMessageType G_DBUS_MESSAGE_TYPE_METHOD_CALL = new GDBusMessageType("G_DBUS_MESSAGE_TYPE_METHOD_CALL");
  public final static GDBusMessageType G_DBUS_MESSAGE_TYPE_METHOD_RETURN = new GDBusMessageType("G_DBUS_MESSAGE_TYPE_METHOD_RETURN");
  public final static GDBusMessageType G_DBUS_MESSAGE_TYPE_ERROR = new GDBusMessageType("G_DBUS_MESSAGE_TYPE_ERROR");
  public final static GDBusMessageType G_DBUS_MESSAGE_TYPE_SIGNAL = new GDBusMessageType("G_DBUS_MESSAGE_TYPE_SIGNAL");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GDBusMessageType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GDBusMessageType.class + " with value " + swigValue);
  }

  private GDBusMessageType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GDBusMessageType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GDBusMessageType(String swigName, GDBusMessageType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GDBusMessageType[] swigValues = { G_DBUS_MESSAGE_TYPE_INVALID, G_DBUS_MESSAGE_TYPE_METHOD_CALL, G_DBUS_MESSAGE_TYPE_METHOD_RETURN, G_DBUS_MESSAGE_TYPE_ERROR, G_DBUS_MESSAGE_TYPE_SIGNAL };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

