/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public class _GDBusObjectManagerServer {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _GDBusObjectManagerServer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_GDBusObjectManagerServer obj) {
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
        fridacoreJNI.delete__GDBusObjectManagerServer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setParent_instance(_GObject value) {
    fridacoreJNI._GDBusObjectManagerServer_parent_instance_set(swigCPtr, this, _GObject.getCPtr(value), value);
  }

  public _GObject getParent_instance() {
    long cPtr = fridacoreJNI._GDBusObjectManagerServer_parent_instance_get(swigCPtr, this);
    return (cPtr == 0) ? null : new _GObject(cPtr, false);
  }

  public void setPriv(SWIGTYPE_p__GDBusObjectManagerServerPrivate value) {
    fridacoreJNI._GDBusObjectManagerServer_priv_set(swigCPtr, this, SWIGTYPE_p__GDBusObjectManagerServerPrivate.getCPtr(value));
  }

  public SWIGTYPE_p__GDBusObjectManagerServerPrivate getPriv() {
    long cPtr = fridacoreJNI._GDBusObjectManagerServer_priv_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p__GDBusObjectManagerServerPrivate(cPtr, false);
  }

  public _GDBusObjectManagerServer() {
    this(fridacoreJNI.new__GDBusObjectManagerServer(), true);
  }

}
