/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public class _GSimpleProxyResolver {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _GSimpleProxyResolver(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_GSimpleProxyResolver obj) {
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
        fridacoreJNI.delete__GSimpleProxyResolver(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setParent_instance(_GObject value) {
    fridacoreJNI._GSimpleProxyResolver_parent_instance_set(swigCPtr, this, _GObject.getCPtr(value), value);
  }

  public _GObject getParent_instance() {
    long cPtr = fridacoreJNI._GSimpleProxyResolver_parent_instance_get(swigCPtr, this);
    return (cPtr == 0) ? null : new _GObject(cPtr, false);
  }

  public void setPriv(SWIGTYPE_p__GSimpleProxyResolverPrivate value) {
    fridacoreJNI._GSimpleProxyResolver_priv_set(swigCPtr, this, SWIGTYPE_p__GSimpleProxyResolverPrivate.getCPtr(value));
  }

  public SWIGTYPE_p__GSimpleProxyResolverPrivate getPriv() {
    long cPtr = fridacoreJNI._GSimpleProxyResolver_priv_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p__GSimpleProxyResolverPrivate(cPtr, false);
  }

  public _GSimpleProxyResolver() {
    this(fridacoreJNI.new__GSimpleProxyResolver(), true);
  }

}
