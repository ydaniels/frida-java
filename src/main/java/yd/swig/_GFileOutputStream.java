/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public class _GFileOutputStream {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _GFileOutputStream(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_GFileOutputStream obj) {
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
        fridacoreJNI.delete__GFileOutputStream(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setParent_instance(_GOutputStream value) {
    fridacoreJNI._GFileOutputStream_parent_instance_set(swigCPtr, this, _GOutputStream.getCPtr(value), value);
  }

  public _GOutputStream getParent_instance() {
    long cPtr = fridacoreJNI._GFileOutputStream_parent_instance_get(swigCPtr, this);
    return (cPtr == 0) ? null : new _GOutputStream(cPtr, false);
  }

  public void setPriv(SWIGTYPE_p__GFileOutputStreamPrivate value) {
    fridacoreJNI._GFileOutputStream_priv_set(swigCPtr, this, SWIGTYPE_p__GFileOutputStreamPrivate.getCPtr(value));
  }

  public SWIGTYPE_p__GFileOutputStreamPrivate getPriv() {
    long cPtr = fridacoreJNI._GFileOutputStream_priv_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p__GFileOutputStreamPrivate(cPtr, false);
  }

  public _GFileOutputStream() {
    this(fridacoreJNI.new__GFileOutputStream(), true);
  }

}
