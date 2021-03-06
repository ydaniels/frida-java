/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public final class GCredentialsType {
  public final static GCredentialsType G_CREDENTIALS_TYPE_INVALID = new GCredentialsType("G_CREDENTIALS_TYPE_INVALID");
  public final static GCredentialsType G_CREDENTIALS_TYPE_LINUX_UCRED = new GCredentialsType("G_CREDENTIALS_TYPE_LINUX_UCRED");
  public final static GCredentialsType G_CREDENTIALS_TYPE_FREEBSD_CMSGCRED = new GCredentialsType("G_CREDENTIALS_TYPE_FREEBSD_CMSGCRED");
  public final static GCredentialsType G_CREDENTIALS_TYPE_OPENBSD_SOCKPEERCRED = new GCredentialsType("G_CREDENTIALS_TYPE_OPENBSD_SOCKPEERCRED");
  public final static GCredentialsType G_CREDENTIALS_TYPE_SOLARIS_UCRED = new GCredentialsType("G_CREDENTIALS_TYPE_SOLARIS_UCRED");
  public final static GCredentialsType G_CREDENTIALS_TYPE_NETBSD_UNPCBID = new GCredentialsType("G_CREDENTIALS_TYPE_NETBSD_UNPCBID");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GCredentialsType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GCredentialsType.class + " with value " + swigValue);
  }

  private GCredentialsType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GCredentialsType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GCredentialsType(String swigName, GCredentialsType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GCredentialsType[] swigValues = { G_CREDENTIALS_TYPE_INVALID, G_CREDENTIALS_TYPE_LINUX_UCRED, G_CREDENTIALS_TYPE_FREEBSD_CMSGCRED, G_CREDENTIALS_TYPE_OPENBSD_SOCKPEERCRED, G_CREDENTIALS_TYPE_SOLARIS_UCRED, G_CREDENTIALS_TYPE_NETBSD_UNPCBID };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

