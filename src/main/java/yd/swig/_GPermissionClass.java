/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public class _GPermissionClass {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _GPermissionClass(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_GPermissionClass obj) {
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
        fridacoreJNI.delete__GPermissionClass(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setParent_class(_GObjectClass value) {
    fridacoreJNI._GPermissionClass_parent_class_set(swigCPtr, this, _GObjectClass.getCPtr(value), value);
  }

  public _GObjectClass getParent_class() {
    long cPtr = fridacoreJNI._GPermissionClass_parent_class_get(swigCPtr, this);
    return (cPtr == 0) ? null : new _GObjectClass(cPtr, false);
  }

  public void setAcquire(SWIGTYPE_p_f_p__GPermission_p__GCancellable_p_p__GError__int value) {
    fridacoreJNI._GPermissionClass_acquire_set(swigCPtr, this, SWIGTYPE_p_f_p__GPermission_p__GCancellable_p_p__GError__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GPermission_p__GCancellable_p_p__GError__int getAcquire() {
    long cPtr = fridacoreJNI._GPermissionClass_acquire_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GPermission_p__GCancellable_p_p__GError__int(cPtr, false);
  }

  public void setAcquire_async(SWIGTYPE_p_f_p__GPermission_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void value) {
    fridacoreJNI._GPermissionClass_acquire_async_set(swigCPtr, this, SWIGTYPE_p_f_p__GPermission_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GPermission_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void getAcquire_async() {
    long cPtr = fridacoreJNI._GPermissionClass_acquire_async_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GPermission_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void(cPtr, false);
  }

  public void setAcquire_finish(SWIGTYPE_p_f_p__GPermission_p__GAsyncResult_p_p__GError__int value) {
    fridacoreJNI._GPermissionClass_acquire_finish_set(swigCPtr, this, SWIGTYPE_p_f_p__GPermission_p__GAsyncResult_p_p__GError__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GPermission_p__GAsyncResult_p_p__GError__int getAcquire_finish() {
    long cPtr = fridacoreJNI._GPermissionClass_acquire_finish_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GPermission_p__GAsyncResult_p_p__GError__int(cPtr, false);
  }

  public void setRelease(SWIGTYPE_p_f_p__GPermission_p__GCancellable_p_p__GError__int value) {
    fridacoreJNI._GPermissionClass_release_set(swigCPtr, this, SWIGTYPE_p_f_p__GPermission_p__GCancellable_p_p__GError__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GPermission_p__GCancellable_p_p__GError__int getRelease() {
    long cPtr = fridacoreJNI._GPermissionClass_release_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GPermission_p__GCancellable_p_p__GError__int(cPtr, false);
  }

  public void setRelease_async(SWIGTYPE_p_f_p__GPermission_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void value) {
    fridacoreJNI._GPermissionClass_release_async_set(swigCPtr, this, SWIGTYPE_p_f_p__GPermission_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GPermission_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void getRelease_async() {
    long cPtr = fridacoreJNI._GPermissionClass_release_async_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GPermission_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void(cPtr, false);
  }

  public void setRelease_finish(SWIGTYPE_p_f_p__GPermission_p__GAsyncResult_p_p__GError__int value) {
    fridacoreJNI._GPermissionClass_release_finish_set(swigCPtr, this, SWIGTYPE_p_f_p__GPermission_p__GAsyncResult_p_p__GError__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GPermission_p__GAsyncResult_p_p__GError__int getRelease_finish() {
    long cPtr = fridacoreJNI._GPermissionClass_release_finish_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GPermission_p__GAsyncResult_p_p__GError__int(cPtr, false);
  }

  public void setReserved(SWIGTYPE_p_p_void value) {
    fridacoreJNI._GPermissionClass_reserved_set(swigCPtr, this, SWIGTYPE_p_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_p_void getReserved() {
    long cPtr = fridacoreJNI._GPermissionClass_reserved_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_void(cPtr, false);
  }

  public _GPermissionClass() {
    this(fridacoreJNI.new__GPermissionClass(), true);
  }

}
