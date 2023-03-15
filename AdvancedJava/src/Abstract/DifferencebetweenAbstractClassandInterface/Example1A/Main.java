package Abstract.DifferencebetweenAbstractClassandInterface.Example1A;

// Class 4 Main class
public class Main {
    // Main driver method
    public static void main(String[] args) {
        // Creating the Object of Rectangle class
        // and using shape class reference.
        Shape rect = new Rectangle(2, 3, "Rectangle");

        System.out.println("Area of rectangle: "
                + rect.area());

        rect.moveTo(1, 2);

        System.out.println(" ");

        // Creating the Objects of circle class
        Shape circle = new Circle(2, "Circle");

        System.out.println("Area of circle: " + circle.area());

        circle.moveTo(2, 4);

        //output:
        // Area of rectangle: 6.0
        //Rectangle has been moved to x = 1 and y = 2
        //
        //Area of circle: 12.56
        //Circle has been moved to x = 2 and y = 4
    }
}

