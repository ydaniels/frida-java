/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public final class GTraverseFlags {
  public final static GTraverseFlags G_TRAVERSE_LEAVES = new GTraverseFlags("G_TRAVERSE_LEAVES", fridacoreJNI.G_TRAVERSE_LEAVES_get());
  public final static GTraverseFlags G_TRAVERSE_NON_LEAVES = new GTraverseFlags("G_TRAVERSE_NON_LEAVES", fridacoreJNI.G_TRAVERSE_NON_LEAVES_get());
  public final static GTraverseFlags G_TRAVERSE_ALL = new GTraverseFlags("G_TRAVERSE_ALL", fridacoreJNI.G_TRAVERSE_ALL_get());
  public final static GTraverseFlags G_TRAVERSE_MASK = new GTraverseFlags("G_TRAVERSE_MASK", fridacoreJNI.G_TRAVERSE_MASK_get());
  public final static GTraverseFlags G_TRAVERSE_LEAFS = new GTraverseFlags("G_TRAVERSE_LEAFS", fridacoreJNI.G_TRAVERSE_LEAFS_get());
  public final static GTraverseFlags G_TRAVERSE_NON_LEAFS = new GTraverseFlags("G_TRAVERSE_NON_LEAFS", fridacoreJNI.G_TRAVERSE_NON_LEAFS_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GTraverseFlags swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GTraverseFlags.class + " with value " + swigValue);
  }

  private GTraverseFlags(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GTraverseFlags(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GTraverseFlags(String swigName, GTraverseFlags swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GTraverseFlags[] swigValues = { G_TRAVERSE_LEAVES, G_TRAVERSE_NON_LEAVES, G_TRAVERSE_ALL, G_TRAVERSE_MASK, G_TRAVERSE_LEAFS, G_TRAVERSE_NON_LEAFS };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

