package Runtimeclass;

public class GFG2 {
// Java Program to illustrate Runtime Class
// Via loadLibrary(), runFinalization()
// gc(), maxMemory()

    // Main driver method
    public static void main(String[] args) {

        // Method 1: loadLibrary()
        // Loading a library that is home/saket/Desktop
        // folder
        Runtime.getRuntime().loadLibrary(
                "/home/saket/Desktop/Library");

        System.out.println("Library Loaded Successfully");

        // Method 2: runFinalization()
        // Run the finalization
        Runtime.getRuntime().runFinalization();

        // Print statement
        System.out.println("Finalized");

        // Method 3: gc()
        // Run the garbage collector
        Runtime.getRuntime().gc();

        System.out.println("Running");

        // Method 4: maxMemory()

        // Printing the maximum memory
        System.out.println(
                "" + Runtime.getRuntime().maxMemory());

       //output:
        //Library Loaded Successfully
        //Finalized
        //Running
        //2147483648
    }
}

