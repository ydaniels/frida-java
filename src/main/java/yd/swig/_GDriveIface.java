/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public class _GDriveIface {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _GDriveIface(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_GDriveIface obj) {
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
        fridacoreJNI.delete__GDriveIface(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setG_iface(_GTypeInterface value) {
    fridacoreJNI._GDriveIface_g_iface_set(swigCPtr, this, _GTypeInterface.getCPtr(value), value);
  }

  public _GTypeInterface getG_iface() {
    long cPtr = fridacoreJNI._GDriveIface_g_iface_get(swigCPtr, this);
    return (cPtr == 0) ? null : new _GTypeInterface(cPtr, false);
  }

  public void setChanged(SWIGTYPE_p_f_p__GDrive__void value) {
    fridacoreJNI._GDriveIface_changed_set(swigCPtr, this, SWIGTYPE_p_f_p__GDrive__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDrive__void getChanged() {
    long cPtr = fridacoreJNI._GDriveIface_changed_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDrive__void(cPtr, false);
  }

  public void setDisconnected(SWIGTYPE_p_f_p__GDrive__void value) {
    fridacoreJNI._GDriveIface_disconnected_set(swigCPtr, this, SWIGTYPE_p_f_p__GDrive__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDrive__void getDisconnected() {
    long cPtr = fridacoreJNI._GDriveIface_disconnected_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDrive__void(cPtr, false);
  }

  public void setEject_button(SWIGTYPE_p_f_p__GDrive__void value) {
    fridacoreJNI._GDriveIface_eject_button_set(swigCPtr, this, SWIGTYPE_p_f_p__GDrive__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDrive__void getEject_button() {
    long cPtr = fridacoreJNI._GDriveIface_eject_button_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDrive__void(cPtr, false);
  }

  public void setGet_name(SWIGTYPE_p_f_p__GDrive__p_char value) {
    fridacoreJNI._GDriveIface_get_name_set(swigCPtr, this, SWIGTYPE_p_f_p__GDrive__p_char.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDrive__p_char getGet_name() {
    long cPtr = fridacoreJNI._GDriveIface_get_name_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDrive__p_char(cPtr, false);
  }

  public void setGet_icon(SWIGTYPE_p_f_p__GDrive__p__GIcon value) {
    fridacoreJNI._GDriveIface_get_icon_set(swigCPtr, this, SWIGTYPE_p_f_p__GDrive__p__GIcon.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDrive__p__GIcon getGet_icon() {
    long cPtr = fridacoreJNI._GDriveIface_get_icon_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDrive__p__GIcon(cPtr, false);
  }

  public void setHas_volumes(SWIGTYPE_p_f_p__GDrive__int value) {
    fridacoreJNI._GDriveIface_has_volumes_set(swigCPtr, this, SWIGTYPE_p_f_p__GDrive__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDrive__int getHas_volumes() {
    long cPtr = fridacoreJNI._GDriveIface_has_volumes_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDrive__int(cPtr, false);
  }

  public void setGet_volumes(SWIGTYPE_p_f_p_GDrive__p__GList value) {
    fridacoreJNI._GDriveIface_get_volumes_set(swigCPtr, this, SWIGTYPE_p_f_p_GDrive__p__GList.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_GDrive__p__GList getGet_volumes() {
    long cPtr = fridacoreJNI._GDriveIface_get_volumes_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_GDrive__p__GList(cPtr, false);
  }

  public void setIs_media_removable(SWIGTYPE_p_f_p__GDrive__int value) {
    fridacoreJNI._GDriveIface_is_media_removable_set(swigCPtr, this, SWIGTYPE_p_f_p__GDrive__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDrive__int getIs_media_removable() {
    long cPtr = fridacoreJNI._GDriveIface_is_media_removable_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDrive__int(cPtr, false);
  }

  public void setHas_media(SWIGTYPE_p_f_p__GDrive__int value) {
    fridacoreJNI._GDriveIface_has_media_set(swigCPtr, this, SWIGTYPE_p_f_p__GDrive__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDrive__int getHas_media() {
    long cPtr = fridacoreJNI._GDriveIface_has_media_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDrive__int(cPtr, false);
  }

  public void setIs_media_check_automatic(SWIGTYPE_p_f_p__GDrive__int value) {
    fridacoreJNI._GDriveIface_is_media_check_automatic_set(swigCPtr, this, SWIGTYPE_p_f_p__GDrive__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDrive__int getIs_media_check_automatic() {
    long cPtr = fridacoreJNI._GDriveIface_is_media_check_automatic_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDrive__int(cPtr, false);
  }

  public void setCan_eject(SWIGTYPE_p_f_p__GDrive__int value) {
    fridacoreJNI._GDriveIface_can_eject_set(swigCPtr, this, SWIGTYPE_p_f_p__GDrive__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDrive__int getCan_eject() {
    long cPtr = fridacoreJNI._GDriveIface_can_eject_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDrive__int(cPtr, false);
  }

  public void setCan_poll_for_media(SWIGTYPE_p_f_p__GDrive__int value) {
    fridacoreJNI._GDriveIface_can_poll_for_media_set(swigCPtr, this, SWIGTYPE_p_f_p__GDrive__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDrive__int getCan_poll_for_media() {
    long cPtr = fridacoreJNI._GDriveIface_can_poll_for_media_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDrive__int(cPtr, false);
  }

  public void setEject(SWIGTYPE_p_f_p__GDrive_enum_GMountUnmountFlags_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void value) {
    fridacoreJNI._GDriveIface_eject_set(swigCPtr, this, SWIGTYPE_p_f_p__GDrive_enum_GMountUnmountFlags_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDrive_enum_GMountUnmountFlags_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void getEject() {
    long cPtr = fridacoreJNI._GDriveIface_eject_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDrive_enum_GMountUnmountFlags_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void(cPtr, false);
  }

  public void setEject_finish(SWIGTYPE_p_f_p__GDrive_p__GAsyncResult_p_p__GError__int value) {
    fridacoreJNI._GDriveIface_eject_finish_set(swigCPtr, this, SWIGTYPE_p_f_p__GDrive_p__GAsyncResult_p_p__GError__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDrive_p__GAsyncResult_p_p__GError__int getEject_finish() {
    long cPtr = fridacoreJNI._GDriveIface_eject_finish_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDrive_p__GAsyncResult_p_p__GError__int(cPtr, false);
  }

  public void setPoll_for_media(SWIGTYPE_p_f_p__GDrive_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void value) {
    fridacoreJNI._GDriveIface_poll_for_media_set(swigCPtr, this, SWIGTYPE_p_f_p__GDrive_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDrive_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void getPoll_for_media() {
    long cPtr = fridacoreJNI._GDriveIface_poll_for_media_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDrive_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void(cPtr, false);
  }

  public void setPoll_for_media_finish(SWIGTYPE_p_f_p__GDrive_p__GAsyncResult_p_p__GError__int value) {
    fridacoreJNI._GDriveIface_poll_for_media_finish_set(swigCPtr, this, SWIGTYPE_p_f_p__GDrive_p__GAsyncResult_p_p__GError__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDrive_p__GAsyncResult_p_p__GError__int getPoll_for_media_finish() {
    long cPtr = fridacoreJNI._GDriveIface_poll_for_media_finish_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDrive_p__GAsyncResult_p_p__GError__int(cPtr, false);
  }

  public void setGet_identifier(SWIGTYPE_p_f_p__GDrive_p_q_const__char__p_char value) {
    fridacoreJNI._GDriveIface_get_identifier_set(swigCPtr, this, SWIGTYPE_p_f_p__GDrive_p_q_const__char__p_char.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDrive_p_q_const__char__p_char getGet_identifier() {
    long cPtr = fridacoreJNI._GDriveIface_get_identifier_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDrive_p_q_const__char__p_char(cPtr, false);
  }

  public void setEnumerate_identifiers(SWIGTYPE_p_f_p__GDrive__p_p_char value) {
    fridacoreJNI._GDriveIface_enumerate_identifiers_set(swigCPtr, this, SWIGTYPE_p_f_p__GDrive__p_p_char.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDrive__p_p_char getEnumerate_identifiers() {
    long cPtr = fridacoreJNI._GDriveIface_enumerate_identifiers_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDrive__p_p_char(cPtr, false);
  }

  public void setGet_start_stop_type(SWIGTYPE_p_f_p__GDrive__GDriveStartStopType value) {
    fridacoreJNI._GDriveIface_get_start_stop_type_set(swigCPtr, this, SWIGTYPE_p_f_p__GDrive__GDriveStartStopType.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDrive__GDriveStartStopType getGet_start_stop_type() {
    long cPtr = fridacoreJNI._GDriveIface_get_start_stop_type_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDrive__GDriveStartStopType(cPtr, false);
  }

  public void setCan_start(SWIGTYPE_p_f_p__GDrive__int value) {
    fridacoreJNI._GDriveIface_can_start_set(swigCPtr, this, SWIGTYPE_p_f_p__GDrive__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDrive__int getCan_start() {
    long cPtr = fridacoreJNI._GDriveIface_can_start_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDrive__int(cPtr, false);
  }

  public void setCan_start_degraded(SWIGTYPE_p_f_p__GDrive__int value) {
    fridacoreJNI._GDriveIface_can_start_degraded_set(swigCPtr, this, SWIGTYPE_p_f_p__GDrive__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDrive__int getCan_start_degraded() {
    long cPtr = fridacoreJNI._GDriveIface_can_start_degraded_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDrive__int(cPtr, false);
  }

  public void setStart(SWIGTYPE_p_f_p__GDrive_enum_GDriveStartFlags_p__GMountOperation_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void value) {
    fridacoreJNI._GDriveIface_start_set(swigCPtr, this, SWIGTYPE_p_f_p__GDrive_enum_GDriveStartFlags_p__GMountOperation_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDrive_enum_GDriveStartFlags_p__GMountOperation_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void getStart() {
    long cPtr = fridacoreJNI._GDriveIface_start_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDrive_enum_GDriveStartFlags_p__GMountOperation_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void(cPtr, false);
  }

  public void setStart_finish(SWIGTYPE_p_f_p__GDrive_p__GAsyncResult_p_p__GError__int value) {
    fridacoreJNI._GDriveIface_start_finish_set(swigCPtr, this, SWIGTYPE_p_f_p__GDrive_p__GAsyncResult_p_p__GError__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDrive_p__GAsyncResult_p_p__GError__int getStart_finish() {
    long cPtr = fridacoreJNI._GDriveIface_start_finish_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDrive_p__GAsyncResult_p_p__GError__int(cPtr, false);
  }

  public void setCan_stop(SWIGTYPE_p_f_p__GDrive__int value) {
    fridacoreJNI._GDriveIface_can_stop_set(swigCPtr, this, SWIGTYPE_p_f_p__GDrive__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDrive__int getCan_stop() {
    long cPtr = fridacoreJNI._GDriveIface_can_stop_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDrive__int(cPtr, false);
  }

  public void setStop(SWIGTYPE_p_f_p__GDrive_enum_GMountUnmountFlags_p__GMountOperation_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void value) {
    fridacoreJNI._GDriveIface_stop_set(swigCPtr, this, SWIGTYPE_p_f_p__GDrive_enum_GMountUnmountFlags_p__GMountOperation_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDrive_enum_GMountUnmountFlags_p__GMountOperation_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void getStop() {
    long cPtr = fridacoreJNI._GDriveIface_stop_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDrive_enum_GMountUnmountFlags_p__GMountOperation_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void(cPtr, false);
  }

  public void setStop_finish(SWIGTYPE_p_f_p__GDrive_p__GAsyncResult_p_p__GError__int value) {
    fridacoreJNI._GDriveIface_stop_finish_set(swigCPtr, this, SWIGTYPE_p_f_p__GDrive_p__GAsyncResult_p_p__GError__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDrive_p__GAsyncResult_p_p__GError__int getStop_finish() {
    long cPtr = fridacoreJNI._GDriveIface_stop_finish_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDrive_p__GAsyncResult_p_p__GError__int(cPtr, false);
  }

  public void setStop_button(SWIGTYPE_p_f_p__GDrive__void value) {
    fridacoreJNI._GDriveIface_stop_button_set(swigCPtr, this, SWIGTYPE_p_f_p__GDrive__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDrive__void getStop_button() {
    long cPtr = fridacoreJNI._GDriveIface_stop_button_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDrive__void(cPtr, false);
  }

  public void setEject_with_operation(SWIGTYPE_p_f_p__GDrive_enum_GMountUnmountFlags_p__GMountOperation_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void value) {
    fridacoreJNI._GDriveIface_eject_with_operation_set(swigCPtr, this, SWIGTYPE_p_f_p__GDrive_enum_GMountUnmountFlags_p__GMountOperation_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDrive_enum_GMountUnmountFlags_p__GMountOperation_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void getEject_with_operation() {
    long cPtr = fridacoreJNI._GDriveIface_eject_with_operation_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDrive_enum_GMountUnmountFlags_p__GMountOperation_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void(cPtr, false);
  }

  public void setEject_with_operation_finish(SWIGTYPE_p_f_p__GDrive_p__GAsyncResult_p_p__GError__int value) {
    fridacoreJNI._GDriveIface_eject_with_operation_finish_set(swigCPtr, this, SWIGTYPE_p_f_p__GDrive_p__GAsyncResult_p_p__GError__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDrive_p__GAsyncResult_p_p__GError__int getEject_with_operation_finish() {
    long cPtr = fridacoreJNI._GDriveIface_eject_with_operation_finish_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDrive_p__GAsyncResult_p_p__GError__int(cPtr, false);
  }

  public void setGet_sort_key(SWIGTYPE_p_f_p__GDrive__p_char value) {
    fridacoreJNI._GDriveIface_get_sort_key_set(swigCPtr, this, SWIGTYPE_p_f_p__GDrive__p_char.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDrive__p_char getGet_sort_key() {
    long cPtr = fridacoreJNI._GDriveIface_get_sort_key_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDrive__p_char(cPtr, false);
  }

  public void setGet_symbolic_icon(SWIGTYPE_p_f_p__GDrive__p__GIcon value) {
    fridacoreJNI._GDriveIface_get_symbolic_icon_set(swigCPtr, this, SWIGTYPE_p_f_p__GDrive__p__GIcon.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDrive__p__GIcon getGet_symbolic_icon() {
    long cPtr = fridacoreJNI._GDriveIface_get_symbolic_icon_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDrive__p__GIcon(cPtr, false);
  }

  public void setIs_removable(SWIGTYPE_p_f_p__GDrive__int value) {
    fridacoreJNI._GDriveIface_is_removable_set(swigCPtr, this, SWIGTYPE_p_f_p__GDrive__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDrive__int getIs_removable() {
    long cPtr = fridacoreJNI._GDriveIface_is_removable_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDrive__int(cPtr, false);
  }

  public _GDriveIface() {
    this(fridacoreJNI.new__GDriveIface(), true);
  }

}
