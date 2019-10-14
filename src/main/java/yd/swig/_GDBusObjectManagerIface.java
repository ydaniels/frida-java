/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public class _GDBusObjectManagerIface {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _GDBusObjectManagerIface(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_GDBusObjectManagerIface obj) {
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
        fridacoreJNI.delete__GDBusObjectManagerIface(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setParent_iface(_GTypeInterface value) {
    fridacoreJNI._GDBusObjectManagerIface_parent_iface_set(swigCPtr, this, _GTypeInterface.getCPtr(value), value);
  }

  public _GTypeInterface getParent_iface() {
    long cPtr = fridacoreJNI._GDBusObjectManagerIface_parent_iface_get(swigCPtr, this);
    return (cPtr == 0) ? null : new _GTypeInterface(cPtr, false);
  }

  public void setGet_object_path(SWIGTYPE_p_f_p__GDBusObjectManager__p_char value) {
    fridacoreJNI._GDBusObjectManagerIface_get_object_path_set(swigCPtr, this, SWIGTYPE_p_f_p__GDBusObjectManager__p_char.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDBusObjectManager__p_char getGet_object_path() {
    long cPtr = fridacoreJNI._GDBusObjectManagerIface_get_object_path_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDBusObjectManager__p_char(cPtr, false);
  }

  public void setGet_objects(SWIGTYPE_p_f_p_GDBusObjectManager__p__GList value) {
    fridacoreJNI._GDBusObjectManagerIface_get_objects_set(swigCPtr, this, SWIGTYPE_p_f_p_GDBusObjectManager__p__GList.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_GDBusObjectManager__p__GList getGet_objects() {
    long cPtr = fridacoreJNI._GDBusObjectManagerIface_get_objects_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_GDBusObjectManager__p__GList(cPtr, false);
  }

  public void setGet_object(SWIGTYPE_p_f_p__GDBusObjectManager_p_q_const__char__p__GDBusObject value) {
    fridacoreJNI._GDBusObjectManagerIface_get_object_set(swigCPtr, this, SWIGTYPE_p_f_p__GDBusObjectManager_p_q_const__char__p__GDBusObject.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDBusObjectManager_p_q_const__char__p__GDBusObject getGet_object() {
    long cPtr = fridacoreJNI._GDBusObjectManagerIface_get_object_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDBusObjectManager_p_q_const__char__p__GDBusObject(cPtr, false);
  }

  public void setGet_interface(SWIGTYPE_p_f_p__GDBusObjectManager_p_q_const__char_p_q_const__char__p__GDBusInterface value) {
    fridacoreJNI._GDBusObjectManagerIface_get_interface_set(swigCPtr, this, SWIGTYPE_p_f_p__GDBusObjectManager_p_q_const__char_p_q_const__char__p__GDBusInterface.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDBusObjectManager_p_q_const__char_p_q_const__char__p__GDBusInterface getGet_interface() {
    long cPtr = fridacoreJNI._GDBusObjectManagerIface_get_interface_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDBusObjectManager_p_q_const__char_p_q_const__char__p__GDBusInterface(cPtr, false);
  }

  public void setObject_added(SWIGTYPE_p_f_p__GDBusObjectManager_p__GDBusObject__void value) {
    fridacoreJNI._GDBusObjectManagerIface_object_added_set(swigCPtr, this, SWIGTYPE_p_f_p__GDBusObjectManager_p__GDBusObject__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDBusObjectManager_p__GDBusObject__void getObject_added() {
    long cPtr = fridacoreJNI._GDBusObjectManagerIface_object_added_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDBusObjectManager_p__GDBusObject__void(cPtr, false);
  }

  public void setObject_removed(SWIGTYPE_p_f_p__GDBusObjectManager_p__GDBusObject__void value) {
    fridacoreJNI._GDBusObjectManagerIface_object_removed_set(swigCPtr, this, SWIGTYPE_p_f_p__GDBusObjectManager_p__GDBusObject__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDBusObjectManager_p__GDBusObject__void getObject_removed() {
    long cPtr = fridacoreJNI._GDBusObjectManagerIface_object_removed_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDBusObjectManager_p__GDBusObject__void(cPtr, false);
  }

  public void setInterface_added(SWIGTYPE_p_f_p__GDBusObjectManager_p__GDBusObject_p__GDBusInterface__void value) {
    fridacoreJNI._GDBusObjectManagerIface_interface_added_set(swigCPtr, this, SWIGTYPE_p_f_p__GDBusObjectManager_p__GDBusObject_p__GDBusInterface__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDBusObjectManager_p__GDBusObject_p__GDBusInterface__void getInterface_added() {
    long cPtr = fridacoreJNI._GDBusObjectManagerIface_interface_added_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDBusObjectManager_p__GDBusObject_p__GDBusInterface__void(cPtr, false);
  }

  public void setInterface_removed(SWIGTYPE_p_f_p__GDBusObjectManager_p__GDBusObject_p__GDBusInterface__void value) {
    fridacoreJNI._GDBusObjectManagerIface_interface_removed_set(swigCPtr, this, SWIGTYPE_p_f_p__GDBusObjectManager_p__GDBusObject_p__GDBusInterface__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDBusObjectManager_p__GDBusObject_p__GDBusInterface__void getInterface_removed() {
    long cPtr = fridacoreJNI._GDBusObjectManagerIface_interface_removed_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDBusObjectManager_p__GDBusObject_p__GDBusInterface__void(cPtr, false);
  }

  public _GDBusObjectManagerIface() {
    this(fridacoreJNI.new__GDBusObjectManagerIface(), true);
  }

}
