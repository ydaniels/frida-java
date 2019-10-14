package yd.frida;

import yd.swig.SWIGTYPE_p__FridaDeviceManager;
import yd.swig.fridacoreJNI;

import static yd.swig.fridacoreConstants.NULL;

public class Main extends fridacoreJNI {

    static {
        System.loadLibrary("frida-core");
    }



    public static void main(String[] args) {
	// write your code here

       System.out.println( "Loaded frida version "+Main .frida_version_string());

    }
}
