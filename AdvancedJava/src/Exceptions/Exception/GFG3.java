package Exceptions.Exception;

// Java Program to Demonstrate How Exception Is Thrown
// Class ThrowsExecp
public class GFG3 {


    // Main driver method
    public static void main(String args[]) {
        // Taking an empty string
        String str = null;
        // Getting length of a string
        System.out.println(str.length());

        //output:
        // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null
        //	at Exceptions.GFG3.main(GFG3.java:13)
    }
}
