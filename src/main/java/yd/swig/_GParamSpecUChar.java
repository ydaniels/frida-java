/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public class _GParamSpecUChar {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _GParamSpecUChar(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_GParamSpecUChar obj) {
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
        fridacoreJNI.delete__GParamSpecUChar(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setParent_instance(_GParamSpec value) {
    fridacoreJNI._GParamSpecUChar_parent_instance_set(swigCPtr, this, _GParamSpec.getCPtr(value), value);
  }

  public _GParamSpec getParent_instance() {
    long cPtr = fridacoreJNI._GParamSpecUChar_parent_instance_get(swigCPtr, this);
    return (cPtr == 0) ? null : new _GParamSpec(cPtr, false);
  }

  public void setMinimum(short value) {
    fridacoreJNI._GParamSpecUChar_minimum_set(swigCPtr, this, value);
  }

  public short getMinimum() {
    return fridacoreJNI._GParamSpecUChar_minimum_get(swigCPtr, this);
  }

  public void setMaximum(short value) {
    fridacoreJNI._GParamSpecUChar_maximum_set(swigCPtr, this, value);
  }

  public short getMaximum() {
    return fridacoreJNI._GParamSpecUChar_maximum_get(swigCPtr, this);
  }

  public void setDefault_value(short value) {
    fridacoreJNI._GParamSpecUChar_default_value_set(swigCPtr, this, value);
  }

  public short getDefault_value() {
    return fridacoreJNI._GParamSpecUChar_default_value_get(swigCPtr, this);
  }

  public _GParamSpecUChar() {
    this(fridacoreJNI.new__GParamSpecUChar(), true);
  }

}
