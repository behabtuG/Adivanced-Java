package Exceptions.throwandthrows;

// Java program to demonstrate working of throws
public class ThrowsExecp {

    static void fun() throws IllegalAccessException {
        System.out.println("Inside fun(). ");
        throw new IllegalAccessException("demo");
    }

    public static void main(String args[]) {
        try {
            fun();
        } catch (IllegalAccessException e) {
            System.out.println("caught in main.");
        }

        //output:
        //Inside fun().
        //caught in main.
    }
}

