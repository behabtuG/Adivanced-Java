package Abstract.Observation1;

// Class 3 Main class
public class Main {
    public static void main(String[] args) {

        // Uncommenting the following line will cause compiler error as the line tries to create an instance of abstract class.
        // Base b = new Base();
        // We can have references of Base type.
        Base b = new Derived();
        b.fun();

        //output: Derived fun() called
    }
}
