package Constructors.ConstructorChaining;

public class Temp2 {
    // block to be executed before any constructor.
    {
        System.out.println("init block");
    }

    // no-arg constructor
    Temp2() {
        System.out.println("default");
    }

    // constructor with one argument.
    Temp2(int x) {
        System.out.println(x);
    }

    public static void main(String[] args) {
        // Object creation by calling no-argument
        // constructor.
        new Temp2();

        // Object creation by calling parameterized
        // constructor with one parameter.
        new Temp2(10);

        //output:
        //init block
        //default
        //init block
        //10
    }
}
