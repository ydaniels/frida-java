/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public class _GTokenValue {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _GTokenValue(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_GTokenValue obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        fridacoreJNI.delete__GTokenValue(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setV_symbol(SWIGTYPE_p_void value) {
    fridacoreJNI._GTokenValue_v_symbol_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getV_symbol() {
    long cPtr = fridacoreJNI._GTokenValue_v_symbol_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void setV_identifier(String value) {
    fridacoreJNI._GTokenValue_v_identifier_set(swigCPtr, this, value);
  }

  public String getV_identifier() {
    return fridacoreJNI._GTokenValue_v_identifier_get(swigCPtr, this);
  }

  public void setV_binary(long value) {
    fridacoreJNI._GTokenValue_v_binary_set(swigCPtr, this, value);
  }

  public long getV_binary() {
    return fridacoreJNI._GTokenValue_v_binary_get(swigCPtr, this);
  }

  public void setV_octal(long value) {
    fridacoreJNI._GTokenValue_v_octal_set(swigCPtr, this, value);
  }

  public long getV_octal() {
    return fridacoreJNI._GTokenValue_v_octal_get(swigCPtr, this);
  }

  public void setV_int(long value) {
    fridacoreJNI._GTokenValue_v_int_set(swigCPtr, this, value);
  }

  public long getV_int() {
    return fridacoreJNI._GTokenValue_v_int_get(swigCPtr, this);
  }

  public void setV_int64(long value) {
    fridacoreJNI._GTokenValue_v_int64_set(swigCPtr, this, value);
  }

  public long getV_int64() {
    return fridacoreJNI._GTokenValue_v_int64_get(swigCPtr, this);
  }

  public void setV_float(double value) {
    fridacoreJNI._GTokenValue_v_float_set(swigCPtr, this, value);
  }

  public double getV_float() {
    return fridacoreJNI._GTokenValue_v_float_get(swigCPtr, this);
  }

  public void setV_hex(long value) {
    fridacoreJNI._GTokenValue_v_hex_set(swigCPtr, this, value);
  }

  public long getV_hex() {
    return fridacoreJNI._GTokenValue_v_hex_get(swigCPtr, this);
  }

  public void setV_string(String value) {
    fridacoreJNI._GTokenValue_v_string_set(swigCPtr, this, value);
  }

  public String getV_string() {
    return fridacoreJNI._GTokenValue_v_string_get(swigCPtr, this);
  }

  public void setV_comment(String value) {
    fridacoreJNI._GTokenValue_v_comment_set(swigCPtr, this, value);
  }

  public String getV_comment() {
    return fridacoreJNI._GTokenValue_v_comment_get(swigCPtr, this);
  }

  public void setV_char(short value) {
    fridacoreJNI._GTokenValue_v_char_set(swigCPtr, this, value);
  }

  public short getV_char() {
    return fridacoreJNI._GTokenValue_v_char_get(swigCPtr, this);
  }

  public void setV_error(long value) {
    fridacoreJNI._GTokenValue_v_error_set(swigCPtr, this, value);
  }

  public long getV_error() {
    return fridacoreJNI._GTokenValue_v_error_get(swigCPtr, this);
  }

  public _GTokenValue() {
    this(fridacoreJNI.new__GTokenValue(), true);
  }

}
