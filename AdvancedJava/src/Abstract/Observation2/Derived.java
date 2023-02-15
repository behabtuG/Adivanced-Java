package Abstract.Observation2;

// Class 2
public class Derived extends Base {
    // Constructors.Constructor of class2
    Derived() {
        System.out.println("Derived Constructors.Constructor Called");
    }

    // Method of class2
    void fun() {
        System.out.println("Derived fun() called");
    }

    // Main driver method
    public static void main(String[] args) {
        // Creating object of class 2 inside main() method
        Derived d = new Derived();
        d.fun();

        //output:
        // Base Constructors.Constructor Called
        //Derived Constructors.Constructor Called
        //Derived fun() called
    }
}
