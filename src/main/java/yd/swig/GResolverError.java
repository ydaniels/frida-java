/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public final class GResolverError {
  public final static GResolverError G_RESOLVER_ERROR_NOT_FOUND = new GResolverError("G_RESOLVER_ERROR_NOT_FOUND");
  public final static GResolverError G_RESOLVER_ERROR_TEMPORARY_FAILURE = new GResolverError("G_RESOLVER_ERROR_TEMPORARY_FAILURE");
  public final static GResolverError G_RESOLVER_ERROR_INTERNAL = new GResolverError("G_RESOLVER_ERROR_INTERNAL");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GResolverError swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GResolverError.class + " with value " + swigValue);
  }

  private GResolverError(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GResolverError(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GResolverError(String swigName, GResolverError swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GResolverError[] swigValues = { G_RESOLVER_ERROR_NOT_FOUND, G_RESOLVER_ERROR_TEMPORARY_FAILURE, G_RESOLVER_ERROR_INTERNAL };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
