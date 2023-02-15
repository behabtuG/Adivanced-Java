package Exceptions.CheckedvsUncheckedExceptions;

// Java Program to Illustrate Un-checked Exceptions
public class GFG1 {

    public static void main(String args[]) {
        // Here we are dividing by 0
        // which will not be caught at compile time
        // as there is no mistake but caught at runtime
        // because it is mathematically incorrect
        int x = 0;
        int y = 10;
        int z = y / x;

        //output:
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        //	at Exceptions.CheckedvsUncheckedExceptions.GFG1.main(GFG1.java:13)
    }
}

