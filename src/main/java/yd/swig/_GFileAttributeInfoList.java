/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public class _GFileAttributeInfoList {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _GFileAttributeInfoList(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_GFileAttributeInfoList obj) {
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
        fridacoreJNI.delete__GFileAttributeInfoList(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInfos(_GFileAttributeInfo value) {
    fridacoreJNI._GFileAttributeInfoList_infos_set(swigCPtr, this, _GFileAttributeInfo.getCPtr(value), value);
  }

  public _GFileAttributeInfo getInfos() {
    long cPtr = fridacoreJNI._GFileAttributeInfoList_infos_get(swigCPtr, this);
    return (cPtr == 0) ? null : new _GFileAttributeInfo(cPtr, false);
  }

  public void setN_infos(int value) {
    fridacoreJNI._GFileAttributeInfoList_n_infos_set(swigCPtr, this, value);
  }

  public int getN_infos() {
    return fridacoreJNI._GFileAttributeInfoList_n_infos_get(swigCPtr, this);
  }

  public _GFileAttributeInfoList() {
    this(fridacoreJNI.new__GFileAttributeInfoList(), true);
  }

}
