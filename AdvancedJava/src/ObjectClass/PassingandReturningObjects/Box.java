package ObjectClass.PassingandReturningObjects;

// Java program to Demonstrate One Object to
// Initialize Another
// Class 1
public class Box {

    double width, height, depth;

    // Notice this constructor. It takes an
    // object of type Box. This constructor use
    // one object to initialize another
    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // constructor used when all dimensions
    // specified
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}

// MAin class
class GFG1 {
    // Main driver method
    public static void main(String args[]) {
        // Creating a box with all dimensions specified
        Box mybox = new Box(10, 20, 15);

        // Creating a copy of mybox
        Box myclone = new Box(mybox);

        double vol;

        // Get volume of mybox
        vol = mybox.volume();
        System.out.println("Volume of mybox is " + vol);

        // Get volume of myclone
        vol = myclone.volume();
        System.out.println("Volume of myclone is " + vol);
    }

    //output:
    //Volume of mybox is 3000.0
    //Volume of myclone is 3000.0
}
