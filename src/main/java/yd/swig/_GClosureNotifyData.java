/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public class _GClosureNotifyData {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _GClosureNotifyData(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_GClosureNotifyData obj) {
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
        fridacoreJNI.delete__GClosureNotifyData(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setData(SWIGTYPE_p_void value) {
    fridacoreJNI._GClosureNotifyData_data_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getData() {
    long cPtr = fridacoreJNI._GClosureNotifyData_data_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void setNotify(SWIGTYPE_p_f_p_void_p__GClosure__void value) {
    fridacoreJNI._GClosureNotifyData_notify_set(swigCPtr, this, SWIGTYPE_p_f_p_void_p__GClosure__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_void_p__GClosure__void getNotify() {
    long cPtr = fridacoreJNI._GClosureNotifyData_notify_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_void_p__GClosure__void(cPtr, false);
  }

  public _GClosureNotifyData() {
    this(fridacoreJNI.new__GClosureNotifyData(), true);
  }

}
