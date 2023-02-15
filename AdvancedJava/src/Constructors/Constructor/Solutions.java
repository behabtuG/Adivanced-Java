package Constructors.Constructor;

// Class 2 Helper class extending above Class1 Child class of Abstract class
public class Solutions extends Content {

    // Constructors.Constructor of Child class GFG
    Solutions() {

        // Super keyword refers to parent class
        super(2);
    }

    // Defining method the abstract method
    public int multiply(int val) {

        // Returning value of same instance
        return this.a * val;
    }


    // Main driver method
    public static void main(String args[]) {

        // Creating reference object of abstract class
        // using it child class
        Content c = new Solutions();

        // Calling abstract method of abstract class
        System.out.println(c.multiply(3));

    //output: 6
    }
}


