/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public final class GSubprocessFlags {
  public final static GSubprocessFlags G_SUBPROCESS_FLAGS_NONE = new GSubprocessFlags("G_SUBPROCESS_FLAGS_NONE", fridacoreJNI.G_SUBPROCESS_FLAGS_NONE_get());
  public final static GSubprocessFlags G_SUBPROCESS_FLAGS_STDIN_PIPE = new GSubprocessFlags("G_SUBPROCESS_FLAGS_STDIN_PIPE", fridacoreJNI.G_SUBPROCESS_FLAGS_STDIN_PIPE_get());
  public final static GSubprocessFlags G_SUBPROCESS_FLAGS_STDIN_INHERIT = new GSubprocessFlags("G_SUBPROCESS_FLAGS_STDIN_INHERIT", fridacoreJNI.G_SUBPROCESS_FLAGS_STDIN_INHERIT_get());
  public final static GSubprocessFlags G_SUBPROCESS_FLAGS_STDOUT_PIPE = new GSubprocessFlags("G_SUBPROCESS_FLAGS_STDOUT_PIPE", fridacoreJNI.G_SUBPROCESS_FLAGS_STDOUT_PIPE_get());
  public final static GSubprocessFlags G_SUBPROCESS_FLAGS_STDOUT_SILENCE = new GSubprocessFlags("G_SUBPROCESS_FLAGS_STDOUT_SILENCE", fridacoreJNI.G_SUBPROCESS_FLAGS_STDOUT_SILENCE_get());
  public final static GSubprocessFlags G_SUBPROCESS_FLAGS_STDERR_PIPE = new GSubprocessFlags("G_SUBPROCESS_FLAGS_STDERR_PIPE", fridacoreJNI.G_SUBPROCESS_FLAGS_STDERR_PIPE_get());
  public final static GSubprocessFlags G_SUBPROCESS_FLAGS_STDERR_SILENCE = new GSubprocessFlags("G_SUBPROCESS_FLAGS_STDERR_SILENCE", fridacoreJNI.G_SUBPROCESS_FLAGS_STDERR_SILENCE_get());
  public final static GSubprocessFlags G_SUBPROCESS_FLAGS_STDERR_MERGE = new GSubprocessFlags("G_SUBPROCESS_FLAGS_STDERR_MERGE", fridacoreJNI.G_SUBPROCESS_FLAGS_STDERR_MERGE_get());
  public final static GSubprocessFlags G_SUBPROCESS_FLAGS_INHERIT_FDS = new GSubprocessFlags("G_SUBPROCESS_FLAGS_INHERIT_FDS", fridacoreJNI.G_SUBPROCESS_FLAGS_INHERIT_FDS_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GSubprocessFlags swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GSubprocessFlags.class + " with value " + swigValue);
  }

  private GSubprocessFlags(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GSubprocessFlags(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GSubprocessFlags(String swigName, GSubprocessFlags swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GSubprocessFlags[] swigValues = { G_SUBPROCESS_FLAGS_NONE, G_SUBPROCESS_FLAGS_STDIN_PIPE, G_SUBPROCESS_FLAGS_STDIN_INHERIT, G_SUBPROCESS_FLAGS_STDOUT_PIPE, G_SUBPROCESS_FLAGS_STDOUT_SILENCE, G_SUBPROCESS_FLAGS_STDERR_PIPE, G_SUBPROCESS_FLAGS_STDERR_SILENCE, G_SUBPROCESS_FLAGS_STDERR_MERGE, G_SUBPROCESS_FLAGS_INHERIT_FDS };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

