/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public class _GDatagramBasedInterface {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _GDatagramBasedInterface(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_GDatagramBasedInterface obj) {
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
        fridacoreJNI.delete__GDatagramBasedInterface(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setG_iface(_GTypeInterface value) {
    fridacoreJNI._GDatagramBasedInterface_g_iface_set(swigCPtr, this, _GTypeInterface.getCPtr(value), value);
  }

  public _GTypeInterface getG_iface() {
    long cPtr = fridacoreJNI._GDatagramBasedInterface_g_iface_get(swigCPtr, this);
    return (cPtr == 0) ? null : new _GTypeInterface(cPtr, false);
  }

  public void setReceive_messages(SWIGTYPE_p_f_p__GDatagramBased_p__GInputMessage_unsigned_int_int_long_p__GCancellable_p_p__GError__int value) {
    fridacoreJNI._GDatagramBasedInterface_receive_messages_set(swigCPtr, this, SWIGTYPE_p_f_p__GDatagramBased_p__GInputMessage_unsigned_int_int_long_p__GCancellable_p_p__GError__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDatagramBased_p__GInputMessage_unsigned_int_int_long_p__GCancellable_p_p__GError__int getReceive_messages() {
    long cPtr = fridacoreJNI._GDatagramBasedInterface_receive_messages_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDatagramBased_p__GInputMessage_unsigned_int_int_long_p__GCancellable_p_p__GError__int(cPtr, false);
  }

  public void setSend_messages(SWIGTYPE_p_f_p__GDatagramBased_p__GOutputMessage_unsigned_int_int_long_p__GCancellable_p_p__GError__int value) {
    fridacoreJNI._GDatagramBasedInterface_send_messages_set(swigCPtr, this, SWIGTYPE_p_f_p__GDatagramBased_p__GOutputMessage_unsigned_int_int_long_p__GCancellable_p_p__GError__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDatagramBased_p__GOutputMessage_unsigned_int_int_long_p__GCancellable_p_p__GError__int getSend_messages() {
    long cPtr = fridacoreJNI._GDatagramBasedInterface_send_messages_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDatagramBased_p__GOutputMessage_unsigned_int_int_long_p__GCancellable_p_p__GError__int(cPtr, false);
  }

  public void setCreate_source(SWIGTYPE_p_f_p_GDatagramBased_GIOCondition_p_GCancellable__p__GSource value) {
    fridacoreJNI._GDatagramBasedInterface_create_source_set(swigCPtr, this, SWIGTYPE_p_f_p_GDatagramBased_GIOCondition_p_GCancellable__p__GSource.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_GDatagramBased_GIOCondition_p_GCancellable__p__GSource getCreate_source() {
    long cPtr = fridacoreJNI._GDatagramBasedInterface_create_source_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_GDatagramBased_GIOCondition_p_GCancellable__p__GSource(cPtr, false);
  }

  public void setCondition_check(SWIGTYPE_p_f_p__GDatagramBased_enum_GIOCondition__GIOCondition value) {
    fridacoreJNI._GDatagramBasedInterface_condition_check_set(swigCPtr, this, SWIGTYPE_p_f_p__GDatagramBased_enum_GIOCondition__GIOCondition.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDatagramBased_enum_GIOCondition__GIOCondition getCondition_check() {
    long cPtr = fridacoreJNI._GDatagramBasedInterface_condition_check_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDatagramBased_enum_GIOCondition__GIOCondition(cPtr, false);
  }

  public void setCondition_wait(SWIGTYPE_p_f_p__GDatagramBased_enum_GIOCondition_long_p__GCancellable_p_p__GError__int value) {
    fridacoreJNI._GDatagramBasedInterface_condition_wait_set(swigCPtr, this, SWIGTYPE_p_f_p__GDatagramBased_enum_GIOCondition_long_p__GCancellable_p_p__GError__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDatagramBased_enum_GIOCondition_long_p__GCancellable_p_p__GError__int getCondition_wait() {
    long cPtr = fridacoreJNI._GDatagramBasedInterface_condition_wait_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDatagramBased_enum_GIOCondition_long_p__GCancellable_p_p__GError__int(cPtr, false);
  }

  public _GDatagramBasedInterface() {
    this(fridacoreJNI.new__GDatagramBasedInterface(), true);
  }

}
