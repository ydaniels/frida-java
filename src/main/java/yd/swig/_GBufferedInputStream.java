/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public class _GBufferedInputStream {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _GBufferedInputStream(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_GBufferedInputStream obj) {
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
        fridacoreJNI.delete__GBufferedInputStream(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setParent_instance(_GFilterInputStream value) {
    fridacoreJNI._GBufferedInputStream_parent_instance_set(swigCPtr, this, _GFilterInputStream.getCPtr(value), value);
  }

  public _GFilterInputStream getParent_instance() {
    long cPtr = fridacoreJNI._GBufferedInputStream_parent_instance_get(swigCPtr, this);
    return (cPtr == 0) ? null : new _GFilterInputStream(cPtr, false);
  }

  public void setPriv(SWIGTYPE_p__GBufferedInputStreamPrivate value) {
    fridacoreJNI._GBufferedInputStream_priv_set(swigCPtr, this, SWIGTYPE_p__GBufferedInputStreamPrivate.getCPtr(value));
  }

  public SWIGTYPE_p__GBufferedInputStreamPrivate getPriv() {
    long cPtr = fridacoreJNI._GBufferedInputStream_priv_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p__GBufferedInputStreamPrivate(cPtr, false);
  }

  public _GBufferedInputStream() {
    this(fridacoreJNI.new__GBufferedInputStream(), true);
  }

}
