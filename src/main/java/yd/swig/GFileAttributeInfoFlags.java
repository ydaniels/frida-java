/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public final class GFileAttributeInfoFlags {
  public final static GFileAttributeInfoFlags G_FILE_ATTRIBUTE_INFO_NONE = new GFileAttributeInfoFlags("G_FILE_ATTRIBUTE_INFO_NONE", fridacoreJNI.G_FILE_ATTRIBUTE_INFO_NONE_get());
  public final static GFileAttributeInfoFlags G_FILE_ATTRIBUTE_INFO_COPY_WITH_FILE = new GFileAttributeInfoFlags("G_FILE_ATTRIBUTE_INFO_COPY_WITH_FILE", fridacoreJNI.G_FILE_ATTRIBUTE_INFO_COPY_WITH_FILE_get());
  public final static GFileAttributeInfoFlags G_FILE_ATTRIBUTE_INFO_COPY_WHEN_MOVED = new GFileAttributeInfoFlags("G_FILE_ATTRIBUTE_INFO_COPY_WHEN_MOVED", fridacoreJNI.G_FILE_ATTRIBUTE_INFO_COPY_WHEN_MOVED_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GFileAttributeInfoFlags swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GFileAttributeInfoFlags.class + " with value " + swigValue);
  }

  private GFileAttributeInfoFlags(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GFileAttributeInfoFlags(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GFileAttributeInfoFlags(String swigName, GFileAttributeInfoFlags swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GFileAttributeInfoFlags[] swigValues = { G_FILE_ATTRIBUTE_INFO_NONE, G_FILE_ATTRIBUTE_INFO_COPY_WITH_FILE, G_FILE_ATTRIBUTE_INFO_COPY_WHEN_MOVED };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

