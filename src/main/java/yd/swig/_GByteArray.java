/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public class _GByteArray {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _GByteArray(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_GByteArray obj) {
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
        fridacoreJNI.delete__GByteArray(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setData(SWIGTYPE_p_unsigned_char value) {
    fridacoreJNI._GByteArray_data_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getData() {
    long cPtr = fridacoreJNI._GByteArray_data_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public void setLen(long value) {
    fridacoreJNI._GByteArray_len_set(swigCPtr, this, value);
  }

  public long getLen() {
    return fridacoreJNI._GByteArray_len_get(swigCPtr, this);
  }

  public _GByteArray() {
    this(fridacoreJNI.new__GByteArray(), true);
  }

}
