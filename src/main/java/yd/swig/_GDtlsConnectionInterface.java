/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public class _GDtlsConnectionInterface {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected _GDtlsConnectionInterface(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(_GDtlsConnectionInterface obj) {
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
        fridacoreJNI.delete__GDtlsConnectionInterface(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setG_iface(_GTypeInterface value) {
    fridacoreJNI._GDtlsConnectionInterface_g_iface_set(swigCPtr, this, _GTypeInterface.getCPtr(value), value);
  }

  public _GTypeInterface getG_iface() {
    long cPtr = fridacoreJNI._GDtlsConnectionInterface_g_iface_get(swigCPtr, this);
    return (cPtr == 0) ? null : new _GTypeInterface(cPtr, false);
  }

  public void setAccept_certificate(SWIGTYPE_p_f_p__GDtlsConnection_p__GTlsCertificate_enum_GTlsCertificateFlags__int value) {
    fridacoreJNI._GDtlsConnectionInterface_accept_certificate_set(swigCPtr, this, SWIGTYPE_p_f_p__GDtlsConnection_p__GTlsCertificate_enum_GTlsCertificateFlags__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDtlsConnection_p__GTlsCertificate_enum_GTlsCertificateFlags__int getAccept_certificate() {
    long cPtr = fridacoreJNI._GDtlsConnectionInterface_accept_certificate_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDtlsConnection_p__GTlsCertificate_enum_GTlsCertificateFlags__int(cPtr, false);
  }

  public void setHandshake(SWIGTYPE_p_f_p__GDtlsConnection_p__GCancellable_p_p__GError__int value) {
    fridacoreJNI._GDtlsConnectionInterface_handshake_set(swigCPtr, this, SWIGTYPE_p_f_p__GDtlsConnection_p__GCancellable_p_p__GError__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDtlsConnection_p__GCancellable_p_p__GError__int getHandshake() {
    long cPtr = fridacoreJNI._GDtlsConnectionInterface_handshake_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDtlsConnection_p__GCancellable_p_p__GError__int(cPtr, false);
  }

  public void setHandshake_async(SWIGTYPE_p_f_p__GDtlsConnection_int_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void value) {
    fridacoreJNI._GDtlsConnectionInterface_handshake_async_set(swigCPtr, this, SWIGTYPE_p_f_p__GDtlsConnection_int_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDtlsConnection_int_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void getHandshake_async() {
    long cPtr = fridacoreJNI._GDtlsConnectionInterface_handshake_async_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDtlsConnection_int_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void(cPtr, false);
  }

  public void setHandshake_finish(SWIGTYPE_p_f_p__GDtlsConnection_p__GAsyncResult_p_p__GError__int value) {
    fridacoreJNI._GDtlsConnectionInterface_handshake_finish_set(swigCPtr, this, SWIGTYPE_p_f_p__GDtlsConnection_p__GAsyncResult_p_p__GError__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDtlsConnection_p__GAsyncResult_p_p__GError__int getHandshake_finish() {
    long cPtr = fridacoreJNI._GDtlsConnectionInterface_handshake_finish_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDtlsConnection_p__GAsyncResult_p_p__GError__int(cPtr, false);
  }

  public void setShutdown(SWIGTYPE_p_f_p__GDtlsConnection_int_int_p__GCancellable_p_p__GError__int value) {
    fridacoreJNI._GDtlsConnectionInterface_shutdown_set(swigCPtr, this, SWIGTYPE_p_f_p__GDtlsConnection_int_int_p__GCancellable_p_p__GError__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDtlsConnection_int_int_p__GCancellable_p_p__GError__int getShutdown() {
    long cPtr = fridacoreJNI._GDtlsConnectionInterface_shutdown_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDtlsConnection_int_int_p__GCancellable_p_p__GError__int(cPtr, false);
  }

  public void setShutdown_async(SWIGTYPE_p_f_p__GDtlsConnection_int_int_int_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void value) {
    fridacoreJNI._GDtlsConnectionInterface_shutdown_async_set(swigCPtr, this, SWIGTYPE_p_f_p__GDtlsConnection_int_int_int_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDtlsConnection_int_int_int_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void getShutdown_async() {
    long cPtr = fridacoreJNI._GDtlsConnectionInterface_shutdown_async_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDtlsConnection_int_int_int_p__GCancellable_p_f_p__GObject_p__GAsyncResult_p_void__void_p_void__void(cPtr, false);
  }

  public void setShutdown_finish(SWIGTYPE_p_f_p__GDtlsConnection_p__GAsyncResult_p_p__GError__int value) {
    fridacoreJNI._GDtlsConnectionInterface_shutdown_finish_set(swigCPtr, this, SWIGTYPE_p_f_p__GDtlsConnection_p__GAsyncResult_p_p__GError__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDtlsConnection_p__GAsyncResult_p_p__GError__int getShutdown_finish() {
    long cPtr = fridacoreJNI._GDtlsConnectionInterface_shutdown_finish_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDtlsConnection_p__GAsyncResult_p_p__GError__int(cPtr, false);
  }

  public void setSet_advertised_protocols(SWIGTYPE_p_f_p__GDtlsConnection_p_q_const__p_q_const__char__void value) {
    fridacoreJNI._GDtlsConnectionInterface_set_advertised_protocols_set(swigCPtr, this, SWIGTYPE_p_f_p__GDtlsConnection_p_q_const__p_q_const__char__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDtlsConnection_p_q_const__p_q_const__char__void getSet_advertised_protocols() {
    long cPtr = fridacoreJNI._GDtlsConnectionInterface_set_advertised_protocols_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDtlsConnection_p_q_const__p_q_const__char__void(cPtr, false);
  }

  public void setGet_negotiated_protocol(SWIGTYPE_p_f_p__GDtlsConnection__p_char value) {
    fridacoreJNI._GDtlsConnectionInterface_get_negotiated_protocol_set(swigCPtr, this, SWIGTYPE_p_f_p__GDtlsConnection__p_char.getCPtr(value));
  }

  public SWIGTYPE_p_f_p__GDtlsConnection__p_char getGet_negotiated_protocol() {
    long cPtr = fridacoreJNI._GDtlsConnectionInterface_get_negotiated_protocol_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p__GDtlsConnection__p_char(cPtr, false);
  }

  public _GDtlsConnectionInterface() {
    this(fridacoreJNI.new__GDtlsConnectionInterface(), true);
  }

}
