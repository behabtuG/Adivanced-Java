package Polymorphism;

// Java Program for Method overloading
// By using Different Types of Arguments
// Class 1 Helper class
public class Helper {

    // Method with 2 integer parameters
    static int Multiply(int a, int b) {

        // Returns product of integer numbers
        return a * b;
    }

    // Method 2 With same name but with 2 double parameters
    static double Multiply(double a, double b) {

        // Returns product of double numbers
        return a * b;
    }
    // Method 3 Multiplication of 3 numbers
    static int Multiply(int a, int b, int c)
    {
        // Return product
        return a * b * c;
    }
}


