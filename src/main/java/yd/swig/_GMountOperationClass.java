/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public class _GMountOperationClass {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _GMountOperationClass(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_GMountOperationClass obj) {
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
        fridacoreJNI.delete__GMountOperationClass(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setParent_class(_GObjectClass value) {
    fridacoreJNI._GMountOperationClass_parent_class_set(swigCPtr, this, _GObjectClass.getCPtr(value), value);
  }

  public _GObjectClass getParent_class() {
    long cPtr = fridacoreJNI._GMountOperationClass_parent_class_get(swigCPtr, this);
    return (cPtr == 0) ? null : new _GObjectClass(cPtr, false);
  }

  public void setAsk_password(SWIGTYPE_p_f_p__GMountOperation_p_q_const__char_p_q_const__char_p_q_const__char_enum_GAskPasswordFlags__void value) {
    fridacoreJNI._GMountOperationClass_ask_password_set(swigCPtr, this, SWIGTYPE_p_f_p__GMountOperation_p_q_const__char_p_q_const__char_p_q_const__char_enum_GAskPasswordFlags__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GMountOperation_p_q_const__char_p_q_const__char_p_q_const__char_enum_GAskPasswordFlags__void getAsk_password() {
    long cPtr = fridacoreJNI._GMountOperationClass_ask_password_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GMountOperation_p_q_const__char_p_q_const__char_p_q_const__char_enum_GAskPasswordFlags__void(cPtr, false);
  }

  public void setAsk_question(SWIGTYPE_p_f_p__GMountOperation_p_q_const__char_a___p_q_const__char__void value) {
    fridacoreJNI._GMountOperationClass_ask_question_set(swigCPtr, this, SWIGTYPE_p_f_p__GMountOperation_p_q_const__char_a___p_q_const__char__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GMountOperation_p_q_const__char_a___p_q_const__char__void getAsk_question() {
    long cPtr = fridacoreJNI._GMountOperationClass_ask_question_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GMountOperation_p_q_const__char_a___p_q_const__char__void(cPtr, false);
  }

  public void setReply(SWIGTYPE_p_f_p__GMountOperation_enum_GMountOperationResult__void value) {
    fridacoreJNI._GMountOperationClass_reply_set(swigCPtr, this, SWIGTYPE_p_f_p__GMountOperation_enum_GMountOperationResult__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GMountOperation_enum_GMountOperationResult__void getReply() {
    long cPtr = fridacoreJNI._GMountOperationClass_reply_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GMountOperation_enum_GMountOperationResult__void(cPtr, false);
  }

  public void setAborted(SWIGTYPE_p_f_p__GMountOperation__void value) {
    fridacoreJNI._GMountOperationClass_aborted_set(swigCPtr, this, SWIGTYPE_p_f_p__GMountOperation__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GMountOperation__void getAborted() {
    long cPtr = fridacoreJNI._GMountOperationClass_aborted_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GMountOperation__void(cPtr, false);
  }

  public void setShow_processes(SWIGTYPE_p_f_p__GMountOperation_p_q_const__char_p__GArray_a___p_q_const__char__void value) {
    fridacoreJNI._GMountOperationClass_show_processes_set(swigCPtr, this, SWIGTYPE_p_f_p__GMountOperation_p_q_const__char_p__GArray_a___p_q_const__char__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GMountOperation_p_q_const__char_p__GArray_a___p_q_const__char__void getShow_processes() {
    long cPtr = fridacoreJNI._GMountOperationClass_show_processes_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GMountOperation_p_q_const__char_p__GArray_a___p_q_const__char__void(cPtr, false);
  }

  public void setShow_unmount_progress(SWIGTYPE_p_f_p__GMountOperation_p_q_const__char_long_long__void value) {
    fridacoreJNI._GMountOperationClass_show_unmount_progress_set(swigCPtr, this, SWIGTYPE_p_f_p__GMountOperation_p_q_const__char_long_long__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GMountOperation_p_q_const__char_long_long__void getShow_unmount_progress() {
    long cPtr = fridacoreJNI._GMountOperationClass_show_unmount_progress_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GMountOperation_p_q_const__char_long_long__void(cPtr, false);
  }

  public void set_g_reserved1(SWIGTYPE_p_f_void__void value) {
    fridacoreJNI._GMountOperationClass__g_reserved1_set(swigCPtr, this, SWIGTYPE_p_f_void__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_void__void get_g_reserved1() {
    long cPtr = fridacoreJNI._GMountOperationClass__g_reserved1_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_void__void(cPtr, false);
  }

  public void set_g_reserved2(SWIGTYPE_p_f_void__void value) {
    fridacoreJNI._GMountOperationClass__g_reserved2_set(swigCPtr, this, SWIGTYPE_p_f_void__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_void__void get_g_reserved2() {
    long cPtr = fridacoreJNI._GMountOperationClass__g_reserved2_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_void__void(cPtr, false);
  }

  public void set_g_reserved3(SWIGTYPE_p_f_void__void value) {
    fridacoreJNI._GMountOperationClass__g_reserved3_set(swigCPtr, this, SWIGTYPE_p_f_void__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_void__void get_g_reserved3() {
    long cPtr = fridacoreJNI._GMountOperationClass__g_reserved3_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_void__void(cPtr, false);
  }

  public void set_g_reserved4(SWIGTYPE_p_f_void__void value) {
    fridacoreJNI._GMountOperationClass__g_reserved4_set(swigCPtr, this, SWIGTYPE_p_f_void__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_void__void get_g_reserved4() {
    long cPtr = fridacoreJNI._GMountOperationClass__g_reserved4_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_void__void(cPtr, false);
  }

  public void set_g_reserved5(SWIGTYPE_p_f_void__void value) {
    fridacoreJNI._GMountOperationClass__g_reserved5_set(swigCPtr, this, SWIGTYPE_p_f_void__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_void__void get_g_reserved5() {
    long cPtr = fridacoreJNI._GMountOperationClass__g_reserved5_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_void__void(cPtr, false);
  }

  public void set_g_reserved6(SWIGTYPE_p_f_void__void value) {
    fridacoreJNI._GMountOperationClass__g_reserved6_set(swigCPtr, this, SWIGTYPE_p_f_void__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_void__void get_g_reserved6() {
    long cPtr = fridacoreJNI._GMountOperationClass__g_reserved6_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_void__void(cPtr, false);
  }

  public void set_g_reserved7(SWIGTYPE_p_f_void__void value) {
    fridacoreJNI._GMountOperationClass__g_reserved7_set(swigCPtr, this, SWIGTYPE_p_f_void__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_void__void get_g_reserved7() {
    long cPtr = fridacoreJNI._GMountOperationClass__g_reserved7_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_void__void(cPtr, false);
  }

  public void set_g_reserved8(SWIGTYPE_p_f_void__void value) {
    fridacoreJNI._GMountOperationClass__g_reserved8_set(swigCPtr, this, SWIGTYPE_p_f_void__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_void__void get_g_reserved8() {
    long cPtr = fridacoreJNI._GMountOperationClass__g_reserved8_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_void__void(cPtr, false);
  }

  public void set_g_reserved9(SWIGTYPE_p_f_void__void value) {
    fridacoreJNI._GMountOperationClass__g_reserved9_set(swigCPtr, this, SWIGTYPE_p_f_void__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_void__void get_g_reserved9() {
    long cPtr = fridacoreJNI._GMountOperationClass__g_reserved9_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_void__void(cPtr, false);
  }

  public _GMountOperationClass() {
    this(fridacoreJNI.new__GMountOperationClass(), true);
  }

}
