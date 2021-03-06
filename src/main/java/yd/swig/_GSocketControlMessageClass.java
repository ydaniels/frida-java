/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public class _GSocketControlMessageClass {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _GSocketControlMessageClass(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_GSocketControlMessageClass obj) {
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
        fridacoreJNI.delete__GSocketControlMessageClass(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setParent_class(_GObjectClass value) {
    fridacoreJNI._GSocketControlMessageClass_parent_class_set(swigCPtr, this, _GObjectClass.getCPtr(value), value);
  }

  public _GObjectClass getParent_class() {
    long cPtr = fridacoreJNI._GSocketControlMessageClass_parent_class_get(swigCPtr, this);
    return (cPtr == 0) ? null : new _GObjectClass(cPtr, false);
  }

  public void setGet_size(SWIGTYPE_p_f_p__GSocketControlMessage__unsigned_long value) {
    fridacoreJNI._GSocketControlMessageClass_get_size_set(swigCPtr, this, SWIGTYPE_p_f_p__GSocketControlMessage__unsigned_long.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GSocketControlMessage__unsigned_long getGet_size() {
    long cPtr = fridacoreJNI._GSocketControlMessageClass_get_size_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GSocketControlMessage__unsigned_long(cPtr, false);
  }

  public void setGet_level(SWIGTYPE_p_f_p__GSocketControlMessage__int value) {
    fridacoreJNI._GSocketControlMessageClass_get_level_set(swigCPtr, this, SWIGTYPE_p_f_p__GSocketControlMessage__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GSocketControlMessage__int getGet_level() {
    long cPtr = fridacoreJNI._GSocketControlMessageClass_get_level_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GSocketControlMessage__int(cPtr, false);
  }

  public void setGet_type(SWIGTYPE_p_f_p__GSocketControlMessage__int value) {
    fridacoreJNI._GSocketControlMessageClass_get_type_set(swigCPtr, this, SWIGTYPE_p_f_p__GSocketControlMessage__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GSocketControlMessage__int getGet_type() {
    long cPtr = fridacoreJNI._GSocketControlMessageClass_get_type_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GSocketControlMessage__int(cPtr, false);
  }

  public void setSerialize(SWIGTYPE_p_f_p__GSocketControlMessage_p_void__void value) {
    fridacoreJNI._GSocketControlMessageClass_serialize_set(swigCPtr, this, SWIGTYPE_p_f_p__GSocketControlMessage_p_void__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GSocketControlMessage_p_void__void getSerialize() {
    long cPtr = fridacoreJNI._GSocketControlMessageClass_serialize_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GSocketControlMessage_p_void__void(cPtr, false);
  }

  public void setDeserialize(SWIGTYPE_p_f_int_int_gsize_gpointer__p__GSocketControlMessage value) {
    fridacoreJNI._GSocketControlMessageClass_deserialize_set(swigCPtr, this, SWIGTYPE_p_f_int_int_gsize_gpointer__p__GSocketControlMessage.getCPtr(value));
  }

  public SWIGTYPE_p_f_int_int_gsize_gpointer__p__GSocketControlMessage getDeserialize() {
    long cPtr = fridacoreJNI._GSocketControlMessageClass_deserialize_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_int_int_gsize_gpointer__p__GSocketControlMessage(cPtr, false);
  }

  public void set_g_reserved1(SWIGTYPE_p_f_void__void value) {
    fridacoreJNI._GSocketControlMessageClass__g_reserved1_set(swigCPtr, this, SWIGTYPE_p_f_void__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_void__void get_g_reserved1() {
    long cPtr = fridacoreJNI._GSocketControlMessageClass__g_reserved1_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_void__void(cPtr, false);
  }

  public void set_g_reserved2(SWIGTYPE_p_f_void__void value) {
    fridacoreJNI._GSocketControlMessageClass__g_reserved2_set(swigCPtr, this, SWIGTYPE_p_f_void__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_void__void get_g_reserved2() {
    long cPtr = fridacoreJNI._GSocketControlMessageClass__g_reserved2_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_void__void(cPtr, false);
  }

  public void set_g_reserved3(SWIGTYPE_p_f_void__void value) {
    fridacoreJNI._GSocketControlMessageClass__g_reserved3_set(swigCPtr, this, SWIGTYPE_p_f_void__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_void__void get_g_reserved3() {
    long cPtr = fridacoreJNI._GSocketControlMessageClass__g_reserved3_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_void__void(cPtr, false);
  }

  public void set_g_reserved4(SWIGTYPE_p_f_void__void value) {
    fridacoreJNI._GSocketControlMessageClass__g_reserved4_set(swigCPtr, this, SWIGTYPE_p_f_void__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_void__void get_g_reserved4() {
    long cPtr = fridacoreJNI._GSocketControlMessageClass__g_reserved4_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_void__void(cPtr, false);
  }

  public void set_g_reserved5(SWIGTYPE_p_f_void__void value) {
    fridacoreJNI._GSocketControlMessageClass__g_reserved5_set(swigCPtr, this, SWIGTYPE_p_f_void__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_void__void get_g_reserved5() {
    long cPtr = fridacoreJNI._GSocketControlMessageClass__g_reserved5_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_void__void(cPtr, false);
  }

  public _GSocketControlMessageClass() {
    this(fridacoreJNI.new__GSocketControlMessageClass(), true);
  }

}
