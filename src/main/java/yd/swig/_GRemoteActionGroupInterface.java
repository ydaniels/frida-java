/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public class _GRemoteActionGroupInterface {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _GRemoteActionGroupInterface(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_GRemoteActionGroupInterface obj) {
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
        fridacoreJNI.delete__GRemoteActionGroupInterface(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setG_iface(_GTypeInterface value) {
    fridacoreJNI._GRemoteActionGroupInterface_g_iface_set(swigCPtr, this, _GTypeInterface.getCPtr(value), value);
  }

  public _GTypeInterface getG_iface() {
    long cPtr = fridacoreJNI._GRemoteActionGroupInterface_g_iface_get(swigCPtr, this);
    return (cPtr == 0) ? null : new _GTypeInterface(cPtr, false);
  }

  public void setActivate_action_full(SWIGTYPE_p_f_p__GRemoteActionGroup_p_q_const__char_p__GVariant_p__GVariant__void value) {
    fridacoreJNI._GRemoteActionGroupInterface_activate_action_full_set(swigCPtr, this, SWIGTYPE_p_f_p__GRemoteActionGroup_p_q_const__char_p__GVariant_p__GVariant__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GRemoteActionGroup_p_q_const__char_p__GVariant_p__GVariant__void getActivate_action_full() {
    long cPtr = fridacoreJNI._GRemoteActionGroupInterface_activate_action_full_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GRemoteActionGroup_p_q_const__char_p__GVariant_p__GVariant__void(cPtr, false);
  }

  public void setChange_action_state_full(SWIGTYPE_p_f_p__GRemoteActionGroup_p_q_const__char_p__GVariant_p__GVariant__void value) {
    fridacoreJNI._GRemoteActionGroupInterface_change_action_state_full_set(swigCPtr, this, SWIGTYPE_p_f_p__GRemoteActionGroup_p_q_const__char_p__GVariant_p__GVariant__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GRemoteActionGroup_p_q_const__char_p__GVariant_p__GVariant__void getChange_action_state_full() {
    long cPtr = fridacoreJNI._GRemoteActionGroupInterface_change_action_state_full_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GRemoteActionGroup_p_q_const__char_p__GVariant_p__GVariant__void(cPtr, false);
  }

  public _GRemoteActionGroupInterface() {
    this(fridacoreJNI.new__GRemoteActionGroupInterface(), true);
  }

}
