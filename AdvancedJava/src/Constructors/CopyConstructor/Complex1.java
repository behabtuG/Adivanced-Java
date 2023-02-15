package Constructors.CopyConstructor;

// Java Program to Illustrate Copy Constructor
// Class 1
public class Complex1 {

    // Class data members
    private double re, im;

    // Constructor
    public Complex1(double re, double im) {
        // this keyword refers to current instance itself
        this.re = re;
        this.im = im;
    }


    // Class 2
// Main class
    public class GFG {

        // Main driver method
        public static void main(String[] args) {

            // Creating object of above class
            // inside main() method
            Complex1 c1 = new Complex1(10, 15);

            // Note: compiler error here
            //Complex1 c2 = new Complex1(c1);


            //output:

            // Now, in the above code, the line calling the function with the object c1 as the parameter will give the error as the type of the
            // parameter in the constructors is of ‘double’ type while the passed content is of ‘object’ type.
        }
    }
}
