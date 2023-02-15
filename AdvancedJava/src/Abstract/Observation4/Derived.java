package Abstract.Observation4;

// Class 2
public class Derived extends Base {

    // Main driver method
    public static void main(String[] args) {
        {
            // Creating object of abstract class
            Base b = new Derived();

            // Calling method on object created above inside main method
            b.fun();

            //output: Base fun() called
        }
    }
}