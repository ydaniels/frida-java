/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public class _GTrashStack {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _GTrashStack(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_GTrashStack obj) {
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
        fridacoreJNI.delete__GTrashStack(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setNext(_GTrashStack value) {
    fridacoreJNI._GTrashStack_next_set(swigCPtr, this, _GTrashStack.getCPtr(value), value);
  }

  public _GTrashStack getNext() {
    long cPtr = fridacoreJNI._GTrashStack_next_get(swigCPtr, this);
    return (cPtr == 0) ? null : new _GTrashStack(cPtr, false);
  }

  public _GTrashStack() {
    this(fridacoreJNI.new__GTrashStack(), true);
  }

}
