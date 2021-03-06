/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public final class GTlsRehandshakeMode {
  public final static GTlsRehandshakeMode G_TLS_REHANDSHAKE_NEVER = new GTlsRehandshakeMode("G_TLS_REHANDSHAKE_NEVER");
  public final static GTlsRehandshakeMode G_TLS_REHANDSHAKE_SAFELY = new GTlsRehandshakeMode("G_TLS_REHANDSHAKE_SAFELY");
  public final static GTlsRehandshakeMode G_TLS_REHANDSHAKE_UNSAFELY = new GTlsRehandshakeMode("G_TLS_REHANDSHAKE_UNSAFELY");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GTlsRehandshakeMode swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GTlsRehandshakeMode.class + " with value " + swigValue);
  }

  private GTlsRehandshakeMode(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GTlsRehandshakeMode(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GTlsRehandshakeMode(String swigName, GTlsRehandshakeMode swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GTlsRehandshakeMode[] swigValues = { G_TLS_REHANDSHAKE_NEVER, G_TLS_REHANDSHAKE_SAFELY, G_TLS_REHANDSHAKE_UNSAFELY };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

