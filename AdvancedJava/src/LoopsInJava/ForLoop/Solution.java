package LoopsInJava.ForLoop;

// Java program to illustrate Infinite For loop
public class Solution {


    //Usecase 1: Providing expression in for loop is a must
    public static void main0(String[] args) {
        // For loop
        for (; ; ) {

            // Print statement everytime condition holds true making body to execute
            System.out.println("This is an infinite loop");
        }
    }

    //Usecase 2: Initializing Multiple Variables
    // Illustrate Initializing Multiple Variables in Initialization Block
    // Main driver method
    public static void main1(String[] args) {
        // Declaring an integer variable
        int x = 2;

        // For loop to iterate
        for (long y = 0, z = 4; x < 10 && y < 10; x++, y++) {
            // Printing value/s stored in variable named y defined inside body of for loop
            System.out.println(y + " y");
        }

        // Printing value/s stored in variable named x defined outside body of for loop
        System.out.println(x + "x");
    }

    //Use case 3: Redeclaration of a Variable in the Initialization Block
    // Java Program to Illustrate Redeclaring a Variable in Initialization Block
    //Example 2:

    /**
     * public static void main(String[] args) {
     * // Declaring an integer variable
     * int x = 0;
     * <p>
     * // Redeclaring above variable as long will not work
     * for (long y = 0, x = 1; x < 5; x++) {
     * <p>
     * // Printing the value inside the variable
     * System.out.print(x + " ");
     * }
     * }
     */
    //output:Example3.java:12: error: variable x is already defined in method main(String[])
    // for(long y = 0, x = 1; x < 5; x++)

    /**
     * Here, x was already initialized to zero as an integer and is being re-declared in the loop with data type long.
     * But this problem can be fixed by slightly modifying the code. Here, the variables x and y are declared in a different way.
     */

    //Example 2:
    // Java Program to Illustrate Redeclaring a Variable in Initialization Block
    public static void main2(String[] args) {
        // Declaring and initializing variables
        int x = 0;
        long y = 10;

        // For loop to iterate over till custom specified check
        for (y = 0, x = 1; x < 5; x++) {

            // Printing value contained in memory block of the variable
            System.out.print(x + " ");
        }

        //output: 1 2 3 4
    }

    //Usecase 4: Variables declared in the initialization block must be of the same type

// Java program to Illustrate Declaring a Variable in Initialization Block

    public static void main(String[] args) {
        // Declaring integer variable
        // int x;

        // Note: This will cause error;

        // Redeclaring x as long will not work
        for (long y = 0, x = 1; x < 5; x++) {

            // Printing the value stored
            System.out.print(x + " ");
        }
    }


    //Usecase 5: Variables in the loop are accessible only within
    //Illustrate Scope of Initializing Variables Within the oop
    public static void main3(String[] args) {
        // x and y scope is declared only within for loop
        for (int x = 0, y = 0; x < 3 && y < 3; x++, y++) {
            // Printing value stored in variable named y
            System.out.println(y + " ");
        }

        // Printing value stored in variable named x after inner loop is over
        //System.out.println(x);
    }

    //output:
    //Example5.java:13: error: cannot find symbol
    // System.out.println(x);

    //In the above example, variable x is not accessible outside the loop. The statement which is commented gives a compiler error. 
}


