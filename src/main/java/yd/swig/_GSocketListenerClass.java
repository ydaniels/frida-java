/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public class _GSocketListenerClass {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _GSocketListenerClass(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_GSocketListenerClass obj) {
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
        fridacoreJNI.delete__GSocketListenerClass(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setParent_class(_GObjectClass value) {
    fridacoreJNI._GSocketListenerClass_parent_class_set(swigCPtr, this, _GObjectClass.getCPtr(value), value);
  }

  public _GObjectClass getParent_class() {
    long cPtr = fridacoreJNI._GSocketListenerClass_parent_class_get(swigCPtr, this);
    return (cPtr == 0) ? null : new _GObjectClass(cPtr, false);
  }

  public void setChanged(SWIGTYPE_p_f_p__GSocketListener__void value) {
    fridacoreJNI._GSocketListenerClass_changed_set(swigCPtr, this, SWIGTYPE_p_f_p__GSocketListener__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GSocketListener__void getChanged() {
    long cPtr = fridacoreJNI._GSocketListenerClass_changed_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GSocketListener__void(cPtr, false);
  }

  public void setEvent(SWIGTYPE_p_f_p__GSocketListener_enum_GSocketListenerEvent_p__GSocket__void value) {
    fridacoreJNI._GSocketListenerClass_event_set(swigCPtr, this, SWIGTYPE_p_f_p__GSocketListener_enum_GSocketListenerEvent_p__GSocket__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GSocketListener_enum_GSocketListenerEvent_p__GSocket__void getEvent() {
    long cPtr = fridacoreJNI._GSocketListenerClass_event_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GSocketListener_enum_GSocketListenerEvent_p__GSocket__void(cPtr, false);
  }

  public void set_g_reserved2(SWIGTYPE_p_f_void__void value) {
    fridacoreJNI._GSocketListenerClass__g_reserved2_set(swigCPtr, this, SWIGTYPE_p_f_void__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_void__void get_g_reserved2() {
    long cPtr = fridacoreJNI._GSocketListenerClass__g_reserved2_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_void__void(cPtr, false);
  }

  public void set_g_reserved3(SWIGTYPE_p_f_void__void value) {
    fridacoreJNI._GSocketListenerClass__g_reserved3_set(swigCPtr, this, SWIGTYPE_p_f_void__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_void__void get_g_reserved3() {
    long cPtr = fridacoreJNI._GSocketListenerClass__g_reserved3_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_void__void(cPtr, false);
  }

  public void set_g_reserved4(SWIGTYPE_p_f_void__void value) {
    fridacoreJNI._GSocketListenerClass__g_reserved4_set(swigCPtr, this, SWIGTYPE_p_f_void__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_void__void get_g_reserved4() {
    long cPtr = fridacoreJNI._GSocketListenerClass__g_reserved4_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_void__void(cPtr, false);
  }

  public void set_g_reserved5(SWIGTYPE_p_f_void__void value) {
    fridacoreJNI._GSocketListenerClass__g_reserved5_set(swigCPtr, this, SWIGTYPE_p_f_void__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_void__void get_g_reserved5() {
    long cPtr = fridacoreJNI._GSocketListenerClass__g_reserved5_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_void__void(cPtr, false);
  }

  public void set_g_reserved6(SWIGTYPE_p_f_void__void value) {
    fridacoreJNI._GSocketListenerClass__g_reserved6_set(swigCPtr, this, SWIGTYPE_p_f_void__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_void__void get_g_reserved6() {
    long cPtr = fridacoreJNI._GSocketListenerClass__g_reserved6_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_void__void(cPtr, false);
  }

  public _GSocketListenerClass() {
    this(fridacoreJNI.new__GSocketListenerClass(), true);
  }

}
