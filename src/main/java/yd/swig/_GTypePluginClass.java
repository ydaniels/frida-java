/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public class _GTypePluginClass {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _GTypePluginClass(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_GTypePluginClass obj) {
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
        fridacoreJNI.delete__GTypePluginClass(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBase_iface(_GTypeInterface value) {
    fridacoreJNI._GTypePluginClass_base_iface_set(swigCPtr, this, _GTypeInterface.getCPtr(value), value);
  }

  public _GTypeInterface getBase_iface() {
    long cPtr = fridacoreJNI._GTypePluginClass_base_iface_get(swigCPtr, this);
    return (cPtr == 0) ? null : new _GTypeInterface(cPtr, false);
  }

  public void setUse_plugin(SWIGTYPE_p_f_p__GTypePlugin__void value) {
    fridacoreJNI._GTypePluginClass_use_plugin_set(swigCPtr, this, SWIGTYPE_p_f_p__GTypePlugin__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GTypePlugin__void getUse_plugin() {
    long cPtr = fridacoreJNI._GTypePluginClass_use_plugin_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GTypePlugin__void(cPtr, false);
  }

  public void setUnuse_plugin(SWIGTYPE_p_f_p__GTypePlugin__void value) {
    fridacoreJNI._GTypePluginClass_unuse_plugin_set(swigCPtr, this, SWIGTYPE_p_f_p__GTypePlugin__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GTypePlugin__void getUnuse_plugin() {
    long cPtr = fridacoreJNI._GTypePluginClass_unuse_plugin_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GTypePlugin__void(cPtr, false);
  }

  public void setComplete_type_info(SWIGTYPE_p_f_p__GTypePlugin_unsigned_long_p__GTypeInfo_p__GTypeValueTable__void value) {
    fridacoreJNI._GTypePluginClass_complete_type_info_set(swigCPtr, this, SWIGTYPE_p_f_p__GTypePlugin_unsigned_long_p__GTypeInfo_p__GTypeValueTable__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GTypePlugin_unsigned_long_p__GTypeInfo_p__GTypeValueTable__void getComplete_type_info() {
    long cPtr = fridacoreJNI._GTypePluginClass_complete_type_info_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GTypePlugin_unsigned_long_p__GTypeInfo_p__GTypeValueTable__void(cPtr, false);
  }

  public void setComplete_interface_info(SWIGTYPE_p_f_p__GTypePlugin_unsigned_long_unsigned_long_p__GInterfaceInfo__void value) {
    fridacoreJNI._GTypePluginClass_complete_interface_info_set(swigCPtr, this, SWIGTYPE_p_f_p__GTypePlugin_unsigned_long_unsigned_long_p__GInterfaceInfo__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GTypePlugin_unsigned_long_unsigned_long_p__GInterfaceInfo__void getComplete_interface_info() {
    long cPtr = fridacoreJNI._GTypePluginClass_complete_interface_info_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GTypePlugin_unsigned_long_unsigned_long_p__GInterfaceInfo__void(cPtr, false);
  }

  public _GTypePluginClass() {
    this(fridacoreJNI.new__GTypePluginClass(), true);
  }

}
