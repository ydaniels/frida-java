/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public final class GTokenType {
  public final static GTokenType G_TOKEN_EOF = new GTokenType("G_TOKEN_EOF", fridacoreJNI.G_TOKEN_EOF_get());
  public final static GTokenType G_TOKEN_LEFT_PAREN = new GTokenType("G_TOKEN_LEFT_PAREN", fridacoreJNI.G_TOKEN_LEFT_PAREN_get());
  public final static GTokenType G_TOKEN_RIGHT_PAREN = new GTokenType("G_TOKEN_RIGHT_PAREN", fridacoreJNI.G_TOKEN_RIGHT_PAREN_get());
  public final static GTokenType G_TOKEN_LEFT_CURLY = new GTokenType("G_TOKEN_LEFT_CURLY", fridacoreJNI.G_TOKEN_LEFT_CURLY_get());
  public final static GTokenType G_TOKEN_RIGHT_CURLY = new GTokenType("G_TOKEN_RIGHT_CURLY", fridacoreJNI.G_TOKEN_RIGHT_CURLY_get());
  public final static GTokenType G_TOKEN_LEFT_BRACE = new GTokenType("G_TOKEN_LEFT_BRACE", fridacoreJNI.G_TOKEN_LEFT_BRACE_get());
  public final static GTokenType G_TOKEN_RIGHT_BRACE = new GTokenType("G_TOKEN_RIGHT_BRACE", fridacoreJNI.G_TOKEN_RIGHT_BRACE_get());
  public final static GTokenType G_TOKEN_EQUAL_SIGN = new GTokenType("G_TOKEN_EQUAL_SIGN", fridacoreJNI.G_TOKEN_EQUAL_SIGN_get());
  public final static GTokenType G_TOKEN_COMMA = new GTokenType("G_TOKEN_COMMA", fridacoreJNI.G_TOKEN_COMMA_get());
  public final static GTokenType G_TOKEN_NONE = new GTokenType("G_TOKEN_NONE", fridacoreJNI.G_TOKEN_NONE_get());
  public final static GTokenType G_TOKEN_ERROR = new GTokenType("G_TOKEN_ERROR");
  public final static GTokenType G_TOKEN_CHAR = new GTokenType("G_TOKEN_CHAR");
  public final static GTokenType G_TOKEN_BINARY = new GTokenType("G_TOKEN_BINARY");
  public final static GTokenType G_TOKEN_OCTAL = new GTokenType("G_TOKEN_OCTAL");
  public final static GTokenType G_TOKEN_INT = new GTokenType("G_TOKEN_INT");
  public final static GTokenType G_TOKEN_HEX = new GTokenType("G_TOKEN_HEX");
  public final static GTokenType G_TOKEN_FLOAT = new GTokenType("G_TOKEN_FLOAT");
  public final static GTokenType G_TOKEN_STRING = new GTokenType("G_TOKEN_STRING");
  public final static GTokenType G_TOKEN_SYMBOL = new GTokenType("G_TOKEN_SYMBOL");
  public final static GTokenType G_TOKEN_IDENTIFIER = new GTokenType("G_TOKEN_IDENTIFIER");
  public final static GTokenType G_TOKEN_IDENTIFIER_NULL = new GTokenType("G_TOKEN_IDENTIFIER_NULL");
  public final static GTokenType G_TOKEN_COMMENT_SINGLE = new GTokenType("G_TOKEN_COMMENT_SINGLE");
  public final static GTokenType G_TOKEN_COMMENT_MULTI = new GTokenType("G_TOKEN_COMMENT_MULTI");
  public final static GTokenType G_TOKEN_LAST = new GTokenType("G_TOKEN_LAST");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GTokenType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GTokenType.class + " with value " + swigValue);
  }

  private GTokenType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GTokenType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GTokenType(String swigName, GTokenType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GTokenType[] swigValues = { G_TOKEN_EOF, G_TOKEN_LEFT_PAREN, G_TOKEN_RIGHT_PAREN, G_TOKEN_LEFT_CURLY, G_TOKEN_RIGHT_CURLY, G_TOKEN_LEFT_BRACE, G_TOKEN_RIGHT_BRACE, G_TOKEN_EQUAL_SIGN, G_TOKEN_COMMA, G_TOKEN_NONE, G_TOKEN_ERROR, G_TOKEN_CHAR, G_TOKEN_BINARY, G_TOKEN_OCTAL, G_TOKEN_INT, G_TOKEN_HEX, G_TOKEN_FLOAT, G_TOKEN_STRING, G_TOKEN_SYMBOL, G_TOKEN_IDENTIFIER, G_TOKEN_IDENTIFIER_NULL, G_TOKEN_COMMENT_SINGLE, G_TOKEN_COMMENT_MULTI, G_TOKEN_LAST };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
