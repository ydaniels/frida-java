/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public class _GFilterOutputStream {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _GFilterOutputStream(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_GFilterOutputStream obj) {
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
        fridacoreJNI.delete__GFilterOutputStream(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setParent_instance(_GOutputStream value) {
    fridacoreJNI._GFilterOutputStream_parent_instance_set(swigCPtr, this, _GOutputStream.getCPtr(value), value);
  }

  public _GOutputStream getParent_instance() {
    long cPtr = fridacoreJNI._GFilterOutputStream_parent_instance_get(swigCPtr, this);
    return (cPtr == 0) ? null : new _GOutputStream(cPtr, false);
  }

  public void setBase_stream(_GOutputStream value) {
    fridacoreJNI._GFilterOutputStream_base_stream_set(swigCPtr, this, _GOutputStream.getCPtr(value), value);
  }

  public _GOutputStream getBase_stream() {
    long cPtr = fridacoreJNI._GFilterOutputStream_base_stream_get(swigCPtr, this);
    return (cPtr == 0) ? null : new _GOutputStream(cPtr, false);
  }

  public _GFilterOutputStream() {
    this(fridacoreJNI.new__GFilterOutputStream(), true);
  }

}