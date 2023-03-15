package Abstract.DifferencebetweenAbstractClassandInterface.Example1A;

// Java Program to Illustrate Concept of  Abstract classes
// Class 1 Helper abstract class
public abstract class Shape {

    // Declare fields
    String objectName = " ";

    // Constructors.Constructor of this class
    Shape(String name) {
        this.objectName = name;
    }

    // Method Non-abstract methods Having as default implementation
    public void moveTo(int x, int y) {
        System.out.println(this.objectName + " " + "has been moved to" + " x = " + x + " and y = " + y);
    }

    // Method 2 Abstract methods which will be implemented by its subclass(es)
    abstract public double area();

    abstract public void draw();
}
