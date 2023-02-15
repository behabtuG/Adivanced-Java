package finals;

// Java Program to demonstrate Final
// with for-each Statement
// Main class
public class GFG4 {

    // Main driver method
    public static void main(String[] args) {

        // Declaring and initializing
        // custom integer array
        int arr[] = {1, 2, 3};

        // final with for-each statement
        // legal statement
        for (final int i : arr)
            System.out.print(i + " ");
    }

    //Output: 1 2 3
    // Output explanation: Since the “i” variable goes out of scope with each iteration of the loop, it is actually re-declaration each
    // iteration, allowing the same token (i.e. i) to be used to represent multiple variables.
}


