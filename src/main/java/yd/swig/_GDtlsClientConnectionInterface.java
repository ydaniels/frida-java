/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public class _GDtlsClientConnectionInterface {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _GDtlsClientConnectionInterface(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_GDtlsClientConnectionInterface obj) {
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
        fridacoreJNI.delete__GDtlsClientConnectionInterface(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setG_iface(_GTypeInterface value) {
    fridacoreJNI._GDtlsClientConnectionInterface_g_iface_set(swigCPtr, this, _GTypeInterface.getCPtr(value), value);
  }

  public _GTypeInterface getG_iface() {
    long cPtr = fridacoreJNI._GDtlsClientConnectionInterface_g_iface_get(swigCPtr, this);
    return (cPtr == 0) ? null : new _GTypeInterface(cPtr, false);
  }

  public _GDtlsClientConnectionInterface() {
    this(fridacoreJNI.new__GDtlsClientConnectionInterface(), true);
  }

}
