package Constructors.Constructor;

// Java Program to Illustrate Concept of Constructors in Abstract Class
// Class 1 Helper Abstract class Parent class
public abstract class Content {
    int a;

    // Constructors.Constructor of abstract class
    public Content(int a) {

        // This keyword refers to current instance itself
        this.a = a;
    }

    // Abstract method of abstract class
    abstract int multiply(int val);
}
