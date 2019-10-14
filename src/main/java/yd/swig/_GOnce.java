/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public class _GOnce {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _GOnce(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_GOnce obj) {
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
        fridacoreJNI.delete__GOnce(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setStatus(GOnceStatus value) {
    fridacoreJNI._GOnce_status_set(swigCPtr, this, value.swigValue());
  }

  public GOnceStatus getStatus() {
    return GOnceStatus.swigToEnum(fridacoreJNI._GOnce_status_get(swigCPtr, this));
  }

  public void setRetval(SWIGTYPE_p_p_void value) {
    fridacoreJNI._GOnce_retval_set(swigCPtr, this, SWIGTYPE_p_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_p_void getRetval() {
    return new SWIGTYPE_p_p_void(fridacoreJNI._GOnce_retval_get(swigCPtr, this), true);
  }

  public _GOnce() {
    this(fridacoreJNI.new__GOnce(), true);
  }

}