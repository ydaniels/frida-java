/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public class _GNetworkMonitorInterface {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _GNetworkMonitorInterface(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_GNetworkMonitorInterface obj) {
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
        fridacoreJNI.delete__GNetworkMonitorInterface(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setG_iface(_GTypeInterface value) {
    fridacoreJNI._GNetworkMonitorInterface_g_iface_set(swigCPtr, this, _GTypeInterface.getCPtr(value), value);
  }

  public _GTypeInterface getG_iface() {
    long cPtr = fridacoreJNI._GNetworkMonitorInterface_g_iface_get(swigCPtr, this);
    return (cPtr == 0) ? null : new _GTypeInterface(cPtr, false);
  }

  public void setNetwork_changed(SWIGTYPE_p_f_p__GNetworkMonitor_int__void value) {
    fridacoreJNI._GNetworkMonitorInterface_network_changed_set(swigCPtr, this, SWIGTYPE_p_f_p__GNetworkMonitor_int__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GNetworkMonitor_int__void getNetwork_changed() {
    long cPtr = fridacoreJNI._GNetworkMonitorInterface_network_changed_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GNetworkMonitor_int__void(cPtr, false);
  }

  public void setCan_reach(SWIGTYPE_p_f_p__GNetworkMonitor_p__GSocketConnectable_p__GCancellable_p_p__GError__int value) {
    fridacoreJNI._GNetworkMonitorInterface_can_reach_set(swigCPtr, this, SWIGTYPE_p_f_p__GNetworkMonitor_p__GSocketConnectable_p__GCancellable_p_p__GError__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GNetworkMonitor_p__GSocketConnectable_p__GCancellable_p_p__GError__int getCan_reach() {
    long cPtr = fridacoreJNI._GNetworkMonitorInterface_can_reach_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GNetworkMonitor_p__GSocketConnectable_p__GCancellable_p_p__GError__int(cPtr, false);
  }

  public void setCan_reach_async(SWIGTYPE_p_f_p__GNetworkMonitor_p__GSocketConnectable_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void value) {
    fridacoreJNI._GNetworkMonitorInterface_can_reach_async_set(swigCPtr, this, SWIGTYPE_p_f_p__GNetworkMonitor_p__GSocketConnectable_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GNetworkMonitor_p__GSocketConnectable_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void getCan_reach_async() {
    long cPtr = fridacoreJNI._GNetworkMonitorInterface_can_reach_async_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GNetworkMonitor_p__GSocketConnectable_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void(cPtr, false);
  }

  public void setCan_reach_finish(SWIGTYPE_p_f_p__GNetworkMonitor_p__GAsyncResult_p_p__GError__int value) {
    fridacoreJNI._GNetworkMonitorInterface_can_reach_finish_set(swigCPtr, this, SWIGTYPE_p_f_p__GNetworkMonitor_p__GAsyncResult_p_p__GError__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GNetworkMonitor_p__GAsyncResult_p_p__GError__int getCan_reach_finish() {
    long cPtr = fridacoreJNI._GNetworkMonitorInterface_can_reach_finish_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GNetworkMonitor_p__GAsyncResult_p_p__GError__int(cPtr, false);
  }

  public _GNetworkMonitorInterface() {
    this(fridacoreJNI.new__GNetworkMonitorInterface(), true);
  }

}
