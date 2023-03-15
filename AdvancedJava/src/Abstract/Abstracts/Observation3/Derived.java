package Abstract.Abstracts.Observation3;

// Class 2
public class Derived extends Base {

    //This class only inherits the Base class methods and properties

    public static void main(String[] args) {
        // Creating object of class 2
        Derived d = new Derived();

        // Calling function defined in class 1 inside main() with object of class 2 inside main() method
        d.fun();

        //output: Function of Base class is called
    }
}
