package DifferencebetweenAbstractClassandInterface.Example1A;

// Class 3 Helper class extending Class 1
public class Circle extends Shape {      // Attributes of a Circle
    double pi = 3.14;
    int radius;

    // Constructors.Constructor
    Circle(int radius, String name) {
        // Super keyword refers to parent class
        super(name);
        // This keyword refers to current instance itself
        this.radius = radius;
    }

    // Method 1
    // To draw circle
    @Override
    public void draw() {
        // Print statement
        System.out.println("Circle has been drawn ");
    }

    // Method 2
    // To compute circle area
    @Override
    public double area() {
        return (double) ((pi * radius * radius));
    }

}
