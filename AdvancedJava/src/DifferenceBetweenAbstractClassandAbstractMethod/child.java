package DifferenceBetweenAbstractClassandAbstractMethod;

// Java Program to Illustrate Abstract Method
// Class 2 Child class
public class child {//extends Parent{//Class 'child' must either be declared abstract or implement abstract method 'methodTwo()' in 'Parent

    // Method of abstract child class
    public void methodOne() {
    }

    //Note: If we declare the child as abstract then the code compiles fine,
    // but the child of a child is responsible to provide an implementation for methodTwo().
}
