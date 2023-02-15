package Constructors.ConstructorChaining;

public class Derived extends Base {
    // constructor 3
    Derived() {
        System.out.println("No-argument constructor " + "of derived");
    }

    // parameterized constructor 4
    Derived(String name) {
        // invokes base class constructor 2
        super(name);
        System.out.println("Calling parameterized " + "constructor of derived");
    }

    public static void main(String args[]) {
        // calls parameterized constructor 4
        Derived obj = new Derived("test");

        // Calls No-argument constructor
        // Derived obj = new Derived();

        //output:
        //Calling parameterized constructor of base
        //Calling parameterized constructor of derived
    }
}
