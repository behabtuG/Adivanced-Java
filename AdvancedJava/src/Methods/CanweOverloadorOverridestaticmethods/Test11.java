package Methods.CanweOverloadorOverridestaticmethods;

// Driver class
public class Test11 {

    public static void main(String args[]) {
        Base obj1 = new Derived();

        // As per overriding rules this should call to class Derives static overridden method.
        // Since static method can not be overridden, it calls Base's display()
        obj1.display();

        // Here overriding works and Derive's print() is called
        obj1.print();

        //output:
        // Static or class method from Base
        //Non-static or Instance method from Derived
    }
}
