/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public class _GProxyAddress {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _GProxyAddress(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_GProxyAddress obj) {
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
        fridacoreJNI.delete__GProxyAddress(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setParent_instance(_GInetSocketAddress value) {
    fridacoreJNI._GProxyAddress_parent_instance_set(swigCPtr, this, _GInetSocketAddress.getCPtr(value), value);
  }

  public _GInetSocketAddress getParent_instance() {
    long cPtr = fridacoreJNI._GProxyAddress_parent_instance_get(swigCPtr, this);
    return (cPtr == 0) ? null : new _GInetSocketAddress(cPtr, false);
  }

  public void setPriv(SWIGTYPE_p__GProxyAddressPrivate value) {
    fridacoreJNI._GProxyAddress_priv_set(swigCPtr, this, SWIGTYPE_p__GProxyAddressPrivate.getCPtr(value));
  }

  public SWIGTYPE_p__GProxyAddressPrivate getPriv() {
    long cPtr = fridacoreJNI._GProxyAddress_priv_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p__GProxyAddressPrivate(cPtr, false);
  }

  public _GProxyAddress() {
    this(fridacoreJNI.new__GProxyAddress(), true);
  }

}