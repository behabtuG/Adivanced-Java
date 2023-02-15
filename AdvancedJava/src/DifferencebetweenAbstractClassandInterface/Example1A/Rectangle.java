package DifferencebetweenAbstractClassandInterface.Example1A;


// Class 2  Helper class extending Class 1
public class Rectangle extends Shape {
    // Attributes of rectangle
    int length, width;

    // Constructors.Constructor
    Rectangle(int length, int width, String name) {

        // Super keyword refers to current instance itself
        super(name);

        // this keyword refers to current instance itself
        this.length = length;
        this.width = width;
    }

    // Method 1
    // To draw rectangle
    @Override
    public void draw() {
        System.out.println("Rectangle has been drawn ");
    }

    // Method 2
    // To compute rectangle area
    @Override
    public double area() {
        // Length * Breadth
        return (double) (length * width);
    }
}
