package Constructors.ConstructorChaining;

// Java program to illustrate Constructor Chaining
// within same class Using this() keyword
// and changing order of constructors

public class Temp1 {

    // default constructor 1
    Temp1() {
        System.out.println("default");
    }

    // parameterized constructor 2
    Temp1(int x) {
        // invokes default constructor
        this();
        System.out.println(x);
    }

    // parameterized constructor 3
    Temp1(int x, int y) {
        // invokes parameterized constructor 2
        this(5);
        System.out.println(x * y);
    }

    public static void main(String args[]) {
        // invokes parameterized constructor 3
        new Temp1(8, 10);

        //output:
        // default
        //5
        //80

        //NOTE: In example 1, default constructor is invoked at the end, but in example 2 default constructor is invoked at first.
        // Hence, order in constructor chaining is not important.
    }
}
