/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public class _GTuples {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _GTuples(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_GTuples obj) {
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
        fridacoreJNI.delete__GTuples(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setLen(long value) {
    fridacoreJNI._GTuples_len_set(swigCPtr, this, value);
  }

  public long getLen() {
    return fridacoreJNI._GTuples_len_get(swigCPtr, this);
  }

  public _GTuples() {
    this(fridacoreJNI.new__GTuples(), true);
  }

}