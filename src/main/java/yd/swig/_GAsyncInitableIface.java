/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public class _GAsyncInitableIface {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _GAsyncInitableIface(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_GAsyncInitableIface obj) {
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
        fridacoreJNI.delete__GAsyncInitableIface(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setG_iface(_GTypeInterface value) {
    fridacoreJNI._GAsyncInitableIface_g_iface_set(swigCPtr, this, _GTypeInterface.getCPtr(value), value);
  }

  public _GTypeInterface getG_iface() {
    long cPtr = fridacoreJNI._GAsyncInitableIface_g_iface_get(swigCPtr, this);
    return (cPtr == 0) ? null : new _GTypeInterface(cPtr, false);
  }

  public void setInit_async(SWIGTYPE_p_f_p__GAsyncInitable_int_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void value) {
    fridacoreJNI._GAsyncInitableIface_init_async_set(swigCPtr, this, SWIGTYPE_p_f_p__GAsyncInitable_int_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GAsyncInitable_int_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void getInit_async() {
    long cPtr = fridacoreJNI._GAsyncInitableIface_init_async_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GAsyncInitable_int_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void(cPtr, false);
  }

  public void setInit_finish(SWIGTYPE_p_f_p__GAsyncInitable_p__GAsyncResult_p_p__GError__int value) {
    fridacoreJNI._GAsyncInitableIface_init_finish_set(swigCPtr, this, SWIGTYPE_p_f_p__GAsyncInitable_p__GAsyncResult_p_p__GError__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GAsyncInitable_p__GAsyncResult_p_p__GError__int getInit_finish() {
    long cPtr = fridacoreJNI._GAsyncInitableIface_init_finish_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GAsyncInitable_p__GAsyncResult_p_p__GError__int(cPtr, false);
  }

  public _GAsyncInitableIface() {
    this(fridacoreJNI.new__GAsyncInitableIface(), true);
  }

}
