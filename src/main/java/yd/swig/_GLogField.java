/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public class _GLogField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _GLogField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_GLogField obj) {
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
        fridacoreJNI.delete__GLogField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setKey(String value) {
    fridacoreJNI._GLogField_key_set(swigCPtr, this, value);
  }

  public String getKey() {
    return fridacoreJNI._GLogField_key_get(swigCPtr, this);
  }

  public void setValue(SWIGTYPE_p_void value) {
    fridacoreJNI._GLogField_value_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getValue() {
    long cPtr = fridacoreJNI._GLogField_value_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void setLength(int value) {
    fridacoreJNI._GLogField_length_set(swigCPtr, this, value);
  }

  public int getLength() {
    return fridacoreJNI._GLogField_length_get(swigCPtr, this);
  }

  public _GLogField() {
    this(fridacoreJNI.new__GLogField(), true);
  }

}
