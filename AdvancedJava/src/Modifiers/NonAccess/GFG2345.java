package Modifiers.NonAccess;

public class GFG2345 {

    // native method
    public native void printMethod();

    static {
        // The name of DLL file
        System.loadLibrary("LibraryName");
    }

    public static void main(String[] args) {
        GFG2345 obj = new GFG2345();
        obj.printMethod();
    }

  //output:
}
