/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yd.swig;

public final class GFileTest {
  public final static GFileTest G_FILE_TEST_IS_REGULAR = new GFileTest("G_FILE_TEST_IS_REGULAR", fridacoreJNI.G_FILE_TEST_IS_REGULAR_get());
  public final static GFileTest G_FILE_TEST_IS_SYMLINK = new GFileTest("G_FILE_TEST_IS_SYMLINK", fridacoreJNI.G_FILE_TEST_IS_SYMLINK_get());
  public final static GFileTest G_FILE_TEST_IS_DIR = new GFileTest("G_FILE_TEST_IS_DIR", fridacoreJNI.G_FILE_TEST_IS_DIR_get());
  public final static GFileTest G_FILE_TEST_IS_EXECUTABLE = new GFileTest("G_FILE_TEST_IS_EXECUTABLE", fridacoreJNI.G_FILE_TEST_IS_EXECUTABLE_get());
  public final static GFileTest G_FILE_TEST_EXISTS = new GFileTest("G_FILE_TEST_EXISTS", fridacoreJNI.G_FILE_TEST_EXISTS_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GFileTest swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GFileTest.class + " with value " + swigValue);
  }

  private GFileTest(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GFileTest(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GFileTest(String swigName, GFileTest swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GFileTest[] swigValues = { G_FILE_TEST_IS_REGULAR, G_FILE_TEST_IS_SYMLINK, G_FILE_TEST_IS_DIR, G_FILE_TEST_IS_EXECUTABLE, G_FILE_TEST_EXISTS };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

