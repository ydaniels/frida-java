/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public class _GConverterIface {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _GConverterIface(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_GConverterIface obj) {
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
        fridacoreJNI.delete__GConverterIface(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setG_iface(_GTypeInterface value) {
    fridacoreJNI._GConverterIface_g_iface_set(swigCPtr, this, _GTypeInterface.getCPtr(value), value);
  }

  public _GTypeInterface getG_iface() {
    long cPtr = fridacoreJNI._GConverterIface_g_iface_get(swigCPtr, this);
    return (cPtr == 0) ? null : new _GTypeInterface(cPtr, false);
  }

  public void setConvert(SWIGTYPE_p_f_p__GConverter_p_q_const__void_unsigned_long_p_void_unsigned_long_enum_GConverterFlags_p_unsigned_long_p_unsigned_long_p_p__GError__GConverterResult value) {
    fridacoreJNI._GConverterIface_convert_set(swigCPtr, this, SWIGTYPE_p_f_p__GConverter_p_q_const__void_unsigned_long_p_void_unsigned_long_enum_GConverterFlags_p_unsigned_long_p_unsigned_long_p_p__GError__GConverterResult.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GConverter_p_q_const__void_unsigned_long_p_void_unsigned_long_enum_GConverterFlags_p_unsigned_long_p_unsigned_long_p_p__GError__GConverterResult getConvert() {
    long cPtr = fridacoreJNI._GConverterIface_convert_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GConverter_p_q_const__void_unsigned_long_p_void_unsigned_long_enum_GConverterFlags_p_unsigned_long_p_unsigned_long_p_p__GError__GConverterResult(cPtr, false);
  }

  public void setReset(SWIGTYPE_p_f_p__GConverter__void value) {
    fridacoreJNI._GConverterIface_reset_set(swigCPtr, this, SWIGTYPE_p_f_p__GConverter__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GConverter__void getReset() {
    long cPtr = fridacoreJNI._GConverterIface_reset_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GConverter__void(cPtr, false);
  }

  public _GConverterIface() {
    this(fridacoreJNI.new__GConverterIface(), true);
  }

}
