package Constructors.TheInitializerBlock;

// Java Program to Illustrate Initializer Block
public class GFG {


    // Initializer block starts..
    {
        // This code is executed before every constructor.
        System.out.println("Common part of constructors invoked !!");
    }
    // Initializer block ends

    // Constructor 1
    // Default constructor
    public GFG() {
        // Print statement
        System.out.println("Default Constructor invoked");
    }

    // Constructor 2
    // Parameterized constructor
    public GFG(int x) {
        // Print statement
        System.out.println(
                "Parameterized constructor invoked");
    }

    // Main driver method
    public static void main(String arr[]) {

        // Creating variables of class type
        GFG obj1, obj2;

        // Now these variables are
        // made to object and interpreted by compiler
        obj1 = new GFG();

        obj2 = new GFG(0);

        //output:
        //Common part of constructors invoked !!
        //Default Constructor invoked
        //Common part of constructors invoked !!
        //Parameterized constructor invoked
    }
}
