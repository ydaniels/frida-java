/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public class _GActionEntry {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _GActionEntry(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_GActionEntry obj) {
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
        fridacoreJNI.delete__GActionEntry(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setName(String value) {
    fridacoreJNI._GActionEntry_name_set(swigCPtr, this, value);
  }

  public String getName() {
    return fridacoreJNI._GActionEntry_name_get(swigCPtr, this);
  }

  public void setActivate(SWIGTYPE_p_f_p__GSimpleAction_p__GVariant_p_void__void value) {
    fridacoreJNI._GActionEntry_activate_set(swigCPtr, this, SWIGTYPE_p_f_p__GSimpleAction_p__GVariant_p_void__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GSimpleAction_p__GVariant_p_void__void getActivate() {
    long cPtr = fridacoreJNI._GActionEntry_activate_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GSimpleAction_p__GVariant_p_void__void(cPtr, false);
  }

  public void setParameter_type(String value) {
    fridacoreJNI._GActionEntry_parameter_type_set(swigCPtr, this, value);
  }

  public String getParameter_type() {
    return fridacoreJNI._GActionEntry_parameter_type_get(swigCPtr, this);
  }

  public void setState(String value) {
    fridacoreJNI._GActionEntry_state_set(swigCPtr, this, value);
  }

  public String getState() {
    return fridacoreJNI._GActionEntry_state_get(swigCPtr, this);
  }

  public void setChange_state(SWIGTYPE_p_f_p__GSimpleAction_p__GVariant_p_void__void value) {
    fridacoreJNI._GActionEntry_change_state_set(swigCPtr, this, SWIGTYPE_p_f_p__GSimpleAction_p__GVariant_p_void__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GSimpleAction_p__GVariant_p_void__void getChange_state() {
    long cPtr = fridacoreJNI._GActionEntry_change_state_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GSimpleAction_p__GVariant_p_void__void(cPtr, false);
  }

  public void setPadding(SWIGTYPE_p_unsigned_long value) {
    fridacoreJNI._GActionEntry_padding_set(swigCPtr, this, SWIGTYPE_p_unsigned_long.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_long getPadding() {
    long cPtr = fridacoreJNI._GActionEntry_padding_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_long(cPtr, false);
  }

  public _GActionEntry() {
    this(fridacoreJNI.new__GActionEntry(), true);
  }

}
