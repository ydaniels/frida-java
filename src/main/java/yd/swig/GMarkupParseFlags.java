/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public final class GMarkupParseFlags {
  public final static GMarkupParseFlags G_MARKUP_DO_NOT_USE_THIS_UNSUPPORTED_FLAG = new GMarkupParseFlags("G_MARKUP_DO_NOT_USE_THIS_UNSUPPORTED_FLAG", fridacoreJNI.G_MARKUP_DO_NOT_USE_THIS_UNSUPPORTED_FLAG_get());
  public final static GMarkupParseFlags G_MARKUP_TREAT_CDATA_AS_TEXT = new GMarkupParseFlags("G_MARKUP_TREAT_CDATA_AS_TEXT", fridacoreJNI.G_MARKUP_TREAT_CDATA_AS_TEXT_get());
  public final static GMarkupParseFlags G_MARKUP_PREFIX_ERROR_POSITION = new GMarkupParseFlags("G_MARKUP_PREFIX_ERROR_POSITION", fridacoreJNI.G_MARKUP_PREFIX_ERROR_POSITION_get());
  public final static GMarkupParseFlags G_MARKUP_IGNORE_QUALIFIED = new GMarkupParseFlags("G_MARKUP_IGNORE_QUALIFIED", fridacoreJNI.G_MARKUP_IGNORE_QUALIFIED_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GMarkupParseFlags swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GMarkupParseFlags.class + " with value " + swigValue);
  }

  private GMarkupParseFlags(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GMarkupParseFlags(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GMarkupParseFlags(String swigName, GMarkupParseFlags swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GMarkupParseFlags[] swigValues = { G_MARKUP_DO_NOT_USE_THIS_UNSUPPORTED_FLAG, G_MARKUP_TREAT_CDATA_AS_TEXT, G_MARKUP_PREFIX_ERROR_POSITION, G_MARKUP_IGNORE_QUALIFIED };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

