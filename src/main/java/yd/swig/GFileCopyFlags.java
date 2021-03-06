/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public final class GFileCopyFlags {
  public final static GFileCopyFlags G_FILE_COPY_NONE = new GFileCopyFlags("G_FILE_COPY_NONE", fridacoreJNI.G_FILE_COPY_NONE_get());
  public final static GFileCopyFlags G_FILE_COPY_OVERWRITE = new GFileCopyFlags("G_FILE_COPY_OVERWRITE", fridacoreJNI.G_FILE_COPY_OVERWRITE_get());
  public final static GFileCopyFlags G_FILE_COPY_BACKUP = new GFileCopyFlags("G_FILE_COPY_BACKUP", fridacoreJNI.G_FILE_COPY_BACKUP_get());
  public final static GFileCopyFlags G_FILE_COPY_NOFOLLOW_SYMLINKS = new GFileCopyFlags("G_FILE_COPY_NOFOLLOW_SYMLINKS", fridacoreJNI.G_FILE_COPY_NOFOLLOW_SYMLINKS_get());
  public final static GFileCopyFlags G_FILE_COPY_ALL_METADATA = new GFileCopyFlags("G_FILE_COPY_ALL_METADATA", fridacoreJNI.G_FILE_COPY_ALL_METADATA_get());
  public final static GFileCopyFlags G_FILE_COPY_NO_FALLBACK_FOR_MOVE = new GFileCopyFlags("G_FILE_COPY_NO_FALLBACK_FOR_MOVE", fridacoreJNI.G_FILE_COPY_NO_FALLBACK_FOR_MOVE_get());
  public final static GFileCopyFlags G_FILE_COPY_TARGET_DEFAULT_PERMS = new GFileCopyFlags("G_FILE_COPY_TARGET_DEFAULT_PERMS", fridacoreJNI.G_FILE_COPY_TARGET_DEFAULT_PERMS_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GFileCopyFlags swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GFileCopyFlags.class + " with value " + swigValue);
  }

  private GFileCopyFlags(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GFileCopyFlags(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GFileCopyFlags(String swigName, GFileCopyFlags swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GFileCopyFlags[] swigValues = { G_FILE_COPY_NONE, G_FILE_COPY_OVERWRITE, G_FILE_COPY_BACKUP, G_FILE_COPY_NOFOLLOW_SYMLINKS, G_FILE_COPY_ALL_METADATA, G_FILE_COPY_NO_FALLBACK_FOR_MOVE, G_FILE_COPY_TARGET_DEFAULT_PERMS };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

