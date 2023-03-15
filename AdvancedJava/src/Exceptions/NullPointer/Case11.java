package Exceptions.NullPointer;

// A Java program to demonstrate that we can avoid
// NullPointerException
public class Case11 {

    public static void main(String[] args) {
        // Initializing String variable with null value
        String ptr = null;

        // Checking if ptr is null using try catch.
        try {
            if ("gfg".equals(ptr))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        } catch (NullPointerException e) {
            System.out.print("Caught NullPointerException");
        }
    }

    //output:Not Same
}
