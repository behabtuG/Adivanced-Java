package finals.FinalArrays;

// Java Program to Illustrate Final Arrays
// Where Compiler Error Is Thrown
// Main class
public class GFG2 {

    int p = 20;

    // Main driver method
    public static void main(String args[]) {

        // Creating objects of above class
        final GFG2 t1 = new GFG2();
        GFG2 t2 = new GFG2();

        // Assigning values into other objects
       // t1 = t2;

        System.out.println(t1.p);
    }
    //Output: Compiler Error: cannot assign a value to final variable t1
    // Conclusion: Above program compiles without any error and program 2 fails in compilation. Let us discuss why the error occurred.

}


