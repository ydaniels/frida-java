/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public class _GApplication {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _GApplication(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_GApplication obj) {
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
        fridacoreJNI.delete__GApplication(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setParent_instance(_GObject value) {
    fridacoreJNI._GApplication_parent_instance_set(swigCPtr, this, _GObject.getCPtr(value), value);
  }

  public _GObject getParent_instance() {
    long cPtr = fridacoreJNI._GApplication_parent_instance_get(swigCPtr, this);
    return (cPtr == 0) ? null : new _GObject(cPtr, false);
  }

  public void setPriv(SWIGTYPE_p__GApplicationPrivate value) {
    fridacoreJNI._GApplication_priv_set(swigCPtr, this, SWIGTYPE_p__GApplicationPrivate.getCPtr(value));
  }

  public SWIGTYPE_p__GApplicationPrivate getPriv() {
    long cPtr = fridacoreJNI._GApplication_priv_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p__GApplicationPrivate(cPtr, false);
  }

  public _GApplication() {
    this(fridacoreJNI.new__GApplication(), true);
  }

}
