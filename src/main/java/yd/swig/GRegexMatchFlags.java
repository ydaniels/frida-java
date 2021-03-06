/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public final class GRegexMatchFlags {
  public final static GRegexMatchFlags G_REGEX_MATCH_ANCHORED = new GRegexMatchFlags("G_REGEX_MATCH_ANCHORED", fridacoreJNI.G_REGEX_MATCH_ANCHORED_get());
  public final static GRegexMatchFlags G_REGEX_MATCH_NOTBOL = new GRegexMatchFlags("G_REGEX_MATCH_NOTBOL", fridacoreJNI.G_REGEX_MATCH_NOTBOL_get());
  public final static GRegexMatchFlags G_REGEX_MATCH_NOTEOL = new GRegexMatchFlags("G_REGEX_MATCH_NOTEOL", fridacoreJNI.G_REGEX_MATCH_NOTEOL_get());
  public final static GRegexMatchFlags G_REGEX_MATCH_NOTEMPTY = new GRegexMatchFlags("G_REGEX_MATCH_NOTEMPTY", fridacoreJNI.G_REGEX_MATCH_NOTEMPTY_get());
  public final static GRegexMatchFlags G_REGEX_MATCH_PARTIAL = new GRegexMatchFlags("G_REGEX_MATCH_PARTIAL", fridacoreJNI.G_REGEX_MATCH_PARTIAL_get());
  public final static GRegexMatchFlags G_REGEX_MATCH_NEWLINE_CR = new GRegexMatchFlags("G_REGEX_MATCH_NEWLINE_CR", fridacoreJNI.G_REGEX_MATCH_NEWLINE_CR_get());
  public final static GRegexMatchFlags G_REGEX_MATCH_NEWLINE_LF = new GRegexMatchFlags("G_REGEX_MATCH_NEWLINE_LF", fridacoreJNI.G_REGEX_MATCH_NEWLINE_LF_get());
  public final static GRegexMatchFlags G_REGEX_MATCH_NEWLINE_CRLF = new GRegexMatchFlags("G_REGEX_MATCH_NEWLINE_CRLF", fridacoreJNI.G_REGEX_MATCH_NEWLINE_CRLF_get());
  public final static GRegexMatchFlags G_REGEX_MATCH_NEWLINE_ANY = new GRegexMatchFlags("G_REGEX_MATCH_NEWLINE_ANY", fridacoreJNI.G_REGEX_MATCH_NEWLINE_ANY_get());
  public final static GRegexMatchFlags G_REGEX_MATCH_NEWLINE_ANYCRLF = new GRegexMatchFlags("G_REGEX_MATCH_NEWLINE_ANYCRLF", fridacoreJNI.G_REGEX_MATCH_NEWLINE_ANYCRLF_get());
  public final static GRegexMatchFlags G_REGEX_MATCH_BSR_ANYCRLF = new GRegexMatchFlags("G_REGEX_MATCH_BSR_ANYCRLF", fridacoreJNI.G_REGEX_MATCH_BSR_ANYCRLF_get());
  public final static GRegexMatchFlags G_REGEX_MATCH_BSR_ANY = new GRegexMatchFlags("G_REGEX_MATCH_BSR_ANY", fridacoreJNI.G_REGEX_MATCH_BSR_ANY_get());
  public final static GRegexMatchFlags G_REGEX_MATCH_PARTIAL_SOFT = new GRegexMatchFlags("G_REGEX_MATCH_PARTIAL_SOFT", fridacoreJNI.G_REGEX_MATCH_PARTIAL_SOFT_get());
  public final static GRegexMatchFlags G_REGEX_MATCH_PARTIAL_HARD = new GRegexMatchFlags("G_REGEX_MATCH_PARTIAL_HARD", fridacoreJNI.G_REGEX_MATCH_PARTIAL_HARD_get());
  public final static GRegexMatchFlags G_REGEX_MATCH_NOTEMPTY_ATSTART = new GRegexMatchFlags("G_REGEX_MATCH_NOTEMPTY_ATSTART", fridacoreJNI.G_REGEX_MATCH_NOTEMPTY_ATSTART_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GRegexMatchFlags swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GRegexMatchFlags.class + " with value " + swigValue);
  }

  private GRegexMatchFlags(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GRegexMatchFlags(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GRegexMatchFlags(String swigName, GRegexMatchFlags swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GRegexMatchFlags[] swigValues = { G_REGEX_MATCH_ANCHORED, G_REGEX_MATCH_NOTBOL, G_REGEX_MATCH_NOTEOL, G_REGEX_MATCH_NOTEMPTY, G_REGEX_MATCH_PARTIAL, G_REGEX_MATCH_NEWLINE_CR, G_REGEX_MATCH_NEWLINE_LF, G_REGEX_MATCH_NEWLINE_CRLF, G_REGEX_MATCH_NEWLINE_ANY, G_REGEX_MATCH_NEWLINE_ANYCRLF, G_REGEX_MATCH_BSR_ANYCRLF, G_REGEX_MATCH_BSR_ANY, G_REGEX_MATCH_PARTIAL_SOFT, G_REGEX_MATCH_PARTIAL_HARD, G_REGEX_MATCH_NOTEMPTY_ATSTART };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

