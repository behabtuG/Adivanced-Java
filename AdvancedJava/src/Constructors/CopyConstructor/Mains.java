package Constructors.CopyConstructor;

// Class 2
public class Mains {

    // Main driver method
    public static void main(String[] args) {

        // Creating object of above class
        Complex c1 = new Complex(10, 15);

        // Following involves a copy constructor call
        Complex c2 = new Complex(c1);

        // Note: Following doesn't involve a copy constructor call
        // as non-primitive variables are just references.
        Complex c3 = c2;

        // toString() of c2 is called here
        System.out.println(c2);

        //output:
        // Copy constructor called
        //(10.0 + 15.0i)
    }
}
