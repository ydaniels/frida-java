/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public class _GTypeInterface {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _GTypeInterface(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_GTypeInterface obj) {
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
        fridacoreJNI.delete__GTypeInterface(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setG_type(long value) {
    fridacoreJNI._GTypeInterface_g_type_set(swigCPtr, this, value);
  }

  public long getG_type() {
    return fridacoreJNI._GTypeInterface_g_type_get(swigCPtr, this);
  }

  public void setG_instance_type(long value) {
    fridacoreJNI._GTypeInterface_g_instance_type_set(swigCPtr, this, value);
  }

  public long getG_instance_type() {
    return fridacoreJNI._GTypeInterface_g_instance_type_get(swigCPtr, this);
  }

  public _GTypeInterface() {
    this(fridacoreJNI.new__GTypeInterface(), true);
  }

}
