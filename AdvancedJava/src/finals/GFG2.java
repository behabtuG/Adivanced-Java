package finals;

// Java Program to Demonstrate Re-assigning
// Final Variable will throw Compile-time Error
// Main class
public class GFG2 {

    // Declaring and customly initializing
    // static final variable
    static final int CAPACITY = 4;

    // Main driver method
    public static void main(String args[]) {

        // Re-assigning final variable
        // will throw compile-time error
        ///CAPACITY = 5;
    }
    //output: java: cannot assign a value to final variable CAPACITY
    // CAPACITY = 5;


}
