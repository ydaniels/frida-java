/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public class _GDataOutputStream {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _GDataOutputStream(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_GDataOutputStream obj) {
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
        fridacoreJNI.delete__GDataOutputStream(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setParent_instance(_GFilterOutputStream value) {
    fridacoreJNI._GDataOutputStream_parent_instance_set(swigCPtr, this, _GFilterOutputStream.getCPtr(value), value);
  }

  public _GFilterOutputStream getParent_instance() {
    long cPtr = fridacoreJNI._GDataOutputStream_parent_instance_get(swigCPtr, this);
    return (cPtr == 0) ? null : new _GFilterOutputStream(cPtr, false);
  }

  public void setPriv(SWIGTYPE_p__GDataOutputStreamPrivate value) {
    fridacoreJNI._GDataOutputStream_priv_set(swigCPtr, this, SWIGTYPE_p__GDataOutputStreamPrivate.getCPtr(value));
  }

  public SWIGTYPE_p__GDataOutputStreamPrivate getPriv() {
    long cPtr = fridacoreJNI._GDataOutputStream_priv_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p__GDataOutputStreamPrivate(cPtr, false);
  }

  public _GDataOutputStream() {
    this(fridacoreJNI.new__GDataOutputStream(), true);
  }

}
