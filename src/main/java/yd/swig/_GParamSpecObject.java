/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public class _GParamSpecObject {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _GParamSpecObject(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_GParamSpecObject obj) {
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
        fridacoreJNI.delete__GParamSpecObject(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setParent_instance(_GParamSpec value) {
    fridacoreJNI._GParamSpecObject_parent_instance_set(swigCPtr, this, _GParamSpec.getCPtr(value), value);
  }

  public _GParamSpec getParent_instance() {
    long cPtr = fridacoreJNI._GParamSpecObject_parent_instance_get(swigCPtr, this);
    return (cPtr == 0) ? null : new _GParamSpec(cPtr, false);
  }

  public _GParamSpecObject() {
    this(fridacoreJNI.new__GParamSpecObject(), true);
  }

}
