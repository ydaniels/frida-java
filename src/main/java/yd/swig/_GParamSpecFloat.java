/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public class _GParamSpecFloat {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _GParamSpecFloat(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_GParamSpecFloat obj) {
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
        fridacoreJNI.delete__GParamSpecFloat(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setParent_instance(_GParamSpec value) {
    fridacoreJNI._GParamSpecFloat_parent_instance_set(swigCPtr, this, _GParamSpec.getCPtr(value), value);
  }

  public _GParamSpec getParent_instance() {
    long cPtr = fridacoreJNI._GParamSpecFloat_parent_instance_get(swigCPtr, this);
    return (cPtr == 0) ? null : new _GParamSpec(cPtr, false);
  }

  public void setMinimum(float value) {
    fridacoreJNI._GParamSpecFloat_minimum_set(swigCPtr, this, value);
  }

  public float getMinimum() {
    return fridacoreJNI._GParamSpecFloat_minimum_get(swigCPtr, this);
  }

  public void setMaximum(float value) {
    fridacoreJNI._GParamSpecFloat_maximum_set(swigCPtr, this, value);
  }

  public float getMaximum() {
    return fridacoreJNI._GParamSpecFloat_maximum_get(swigCPtr, this);
  }

  public void setDefault_value(float value) {
    fridacoreJNI._GParamSpecFloat_default_value_set(swigCPtr, this, value);
  }

  public float getDefault_value() {
    return fridacoreJNI._GParamSpecFloat_default_value_get(swigCPtr, this);
  }

  public void setEpsilon(float value) {
    fridacoreJNI._GParamSpecFloat_epsilon_set(swigCPtr, this, value);
  }

  public float getEpsilon() {
    return fridacoreJNI._GParamSpecFloat_epsilon_get(swigCPtr, this);
  }

  public _GParamSpecFloat() {
    this(fridacoreJNI.new__GParamSpecFloat(), true);
  }

}
