/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public class JsonObjectIter {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected JsonObjectIter(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(JsonObjectIter obj) {
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
        fridacoreJNI.delete_JsonObjectIter(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setPriv_pointer(SWIGTYPE_p_p_void value) {
    fridacoreJNI.JsonObjectIter_priv_pointer_set(swigCPtr, this, SWIGTYPE_p_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_p_void getPriv_pointer() {
    long cPtr = fridacoreJNI.JsonObjectIter_priv_pointer_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_void(cPtr, false);
  }

  public void setPriv_int(SWIGTYPE_p_int value) {
    fridacoreJNI.JsonObjectIter_priv_int_set(swigCPtr, this, SWIGTYPE_p_int.getCPtr(value));
  }

  public SWIGTYPE_p_int getPriv_int() {
    long cPtr = fridacoreJNI.JsonObjectIter_priv_int_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public void setPriv_boolean(SWIGTYPE_p_int value) {
    fridacoreJNI.JsonObjectIter_priv_boolean_set(swigCPtr, this, SWIGTYPE_p_int.getCPtr(value));
  }

  public SWIGTYPE_p_int getPriv_boolean() {
    long cPtr = fridacoreJNI.JsonObjectIter_priv_boolean_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public JsonObjectIter() {
    this(fridacoreJNI.new_JsonObjectIter(), true);
  }

}