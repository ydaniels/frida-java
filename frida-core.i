%module fridacore
#define __attribute__
 %{
 /* Includes the header in the wrapper code */
 #include "frida-core.h"
 %}
 
 /* Parse the header file to generate wrappers */

 %ignore _frida_g_error_new_valist;
 %ignore _frida_g_vsnprintf;
 %ignore _frida_g_string_vprintf;
 %ignore _frida_g_string_append_vprintf;
 %ignore _frida_g_markup_vprintf_escaped;
 %ignore _frida_g_printf_string_upper_bound;
 %ignore _frida_g_logv;
 %ignore _frida_g_strdup_vprintf;
 %ignore _frida_g_cclosure_marshal_generic_va;
 %ignore _frida_g_cclosure_marshal_VOID__VOIDv;
 %ignore _frida_g_cclosure_marshal_VOID__BOOLEANv;
 %ignore _frida_g_cclosure_marshal_VOID__CHARv;
 %ignore _frida_g_cclosure_marshal_VOID__UCHARv;
 %ignore _frida_g_cclosure_marshal_VOID__INTv;
 %ignore _frida_g_cclosure_marshal_VOID__UINTv;
 %ignore _frida_g_cclosure_marshal_VOID__LONGv;
 %ignore _frida_g_cclosure_marshal_VOID__ULONGv;
 %ignore _frida_g_cclosure_marshal_VOID__ENUMv;
 %ignore _frida_g_cclosure_marshal_VOID__FLAGSv;
 %ignore _frida_g_cclosure_marshal_VOID__FLOATv;
 %ignore _frida_g_cclosure_marshal_VOID__DOUBLEv;
 %ignore _frida_g_cclosure_marshal_VOID__STRINGv;
 %ignore _frida_g_cclosure_marshal_VOID__PARAMv;
 %ignore _frida_g_cclosure_marshal_VOID__BOXEDv;
 %ignore _frida_g_cclosure_marshal_VOID__POINTERv;
 %ignore _frida_g_cclosure_marshal_VOID__OBJECTv;
 %ignore _frida_g_cclosure_marshal_VOID__VARIANTv;
 %ignore _frida_g_cclosure_marshal_VOID__UINT_POINTERv;
 %ignore _frida_g_cclosure_marshal_BOOLEAN__FLAGSv;
 %ignore _frida_g_cclosure_marshal_STRING__OBJECT_POINTERv;
 %ignore _frida_g_cclosure_marshal_BOOLEAN__BOXED_BOXEDv;
 %ignore _frida_g_signal_new_valist;
 %ignore _frida_g_signal_emit_valist;
 %ignore _frida_g_object_new_valist;
 %ignore _frida_g_object_set_valist;
 %ignore _frida_g_object_get_valist;
 %ignore _frida_g_initable_new_valist;
 %ignore _frida_g_async_initable_new_valist_async;
 %ignore _frida_g_output_stream_vprintf;
 %ignore _frida_g_dbus_error_set_dbus_error_valist;
 %ignore _frida_g_dbus_message_new_method_error_valist;
 %ignore _frida_g_dbus_method_invocation_return_error_valist;
 %ignore _frida_g_simple_async_result_set_error_va;
 %ignore g_steal_pointer;



 %include "frida-core.h"
 
