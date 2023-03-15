package Abstract.DifferencebetweenAbstractClassandInterface.Example1B;

// Class 1 Helper class
public class Rectangle implements Shape {

    int length, width;

    // constructor
    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle has been drawn ");
    }

    @Override
    public double area() {
        return (double) (length * width);
    }
}
