/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public final class JsonParserError {
  public final static JsonParserError JSON_PARSER_ERROR_PARSE = new JsonParserError("JSON_PARSER_ERROR_PARSE");
  public final static JsonParserError JSON_PARSER_ERROR_TRAILING_COMMA = new JsonParserError("JSON_PARSER_ERROR_TRAILING_COMMA");
  public final static JsonParserError JSON_PARSER_ERROR_MISSING_COMMA = new JsonParserError("JSON_PARSER_ERROR_MISSING_COMMA");
  public final static JsonParserError JSON_PARSER_ERROR_MISSING_COLON = new JsonParserError("JSON_PARSER_ERROR_MISSING_COLON");
  public final static JsonParserError JSON_PARSER_ERROR_INVALID_BAREWORD = new JsonParserError("JSON_PARSER_ERROR_INVALID_BAREWORD");
  public final static JsonParserError JSON_PARSER_ERROR_EMPTY_MEMBER_NAME = new JsonParserError("JSON_PARSER_ERROR_EMPTY_MEMBER_NAME");
  public final static JsonParserError JSON_PARSER_ERROR_INVALID_DATA = new JsonParserError("JSON_PARSER_ERROR_INVALID_DATA");
  public final static JsonParserError JSON_PARSER_ERROR_UNKNOWN = new JsonParserError("JSON_PARSER_ERROR_UNKNOWN");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static JsonParserError swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + JsonParserError.class + " with value " + swigValue);
  }

  private JsonParserError(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private JsonParserError(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private JsonParserError(String swigName, JsonParserError swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static JsonParserError[] swigValues = { JSON_PARSER_ERROR_PARSE, JSON_PARSER_ERROR_TRAILING_COMMA, JSON_PARSER_ERROR_MISSING_COMMA, JSON_PARSER_ERROR_MISSING_COLON, JSON_PARSER_ERROR_INVALID_BAREWORD, JSON_PARSER_ERROR_EMPTY_MEMBER_NAME, JSON_PARSER_ERROR_INVALID_DATA, JSON_PARSER_ERROR_UNKNOWN };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

