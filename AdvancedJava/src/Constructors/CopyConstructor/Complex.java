package Constructors.CopyConstructor;

// Java Program to Illustrate Copy Constructor
// Class 1
public class Complex {

    // Class data members
    private double re, im;

    // Constructor 1
    // Parameterized constructor
    public Complex(double re, double im) {

        // this keyword refers to current instance itself
        this.re = re;
        this.im = im;
    }

    // Constructor 2
    // Copy constructor
    Complex(Complex c) {

        System.out.println("Copy constructor called");

        re = c.re;
        im = c.im;
    }

    // Methods.Overriding the toString() of Object class
    @Override
    public String toString() {

        return "(" + re + " + " + im + "i)";
    }
}



