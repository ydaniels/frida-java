/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public class _GTypeQuery {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _GTypeQuery(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_GTypeQuery obj) {
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
        fridacoreJNI.delete__GTypeQuery(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setType(long value) {
    fridacoreJNI._GTypeQuery_type_set(swigCPtr, this, value);
  }

  public long getType() {
    return fridacoreJNI._GTypeQuery_type_get(swigCPtr, this);
  }

  public void setType_name(String value) {
    fridacoreJNI._GTypeQuery_type_name_set(swigCPtr, this, value);
  }

  public String getType_name() {
    return fridacoreJNI._GTypeQuery_type_name_get(swigCPtr, this);
  }

  public void setClass_size(long value) {
    fridacoreJNI._GTypeQuery_class_size_set(swigCPtr, this, value);
  }

  public long getClass_size() {
    return fridacoreJNI._GTypeQuery_class_size_get(swigCPtr, this);
  }

  public void setInstance_size(long value) {
    fridacoreJNI._GTypeQuery_instance_size_set(swigCPtr, this, value);
  }

  public long getInstance_size() {
    return fridacoreJNI._GTypeQuery_instance_size_get(swigCPtr, this);
  }

  public _GTypeQuery() {
    this(fridacoreJNI.new__GTypeQuery(), true);
  }

}
