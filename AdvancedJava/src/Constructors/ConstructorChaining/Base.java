package Constructors.ConstructorChaining;

// Java program to illustrate Constructor Chaining to
// other class using super() keyword
public class Base {

    String name;

    // constructor 1
    Base() {
        this("");
        System.out.println("No-argument constructor of" + " base class");
    }

    // constructor 2
    Base(String name) {
        this.name = name;
        System.out.println("Calling parameterized constructor" + " of base");
    }

}