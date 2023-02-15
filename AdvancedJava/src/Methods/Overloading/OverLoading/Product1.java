package Methods.Overloading.OverLoading;

// Java Program to Illustrate Method Overloading
// By Changing Data Types of the Parameters
// Class 1 Helper class
public class Product1 {

    // Multiplying three integer values
    public int Prod(int a, int b, int c) {

        int prod1 = a * b * c;
        return prod1;
    }

    // Multiplying three double values.
    public double Prod(double a, double b, double c) {

        double prod2 = a * b * c;
        return prod2;
    }
}

class GFG1 {

    public static void main(String[] args) {

        Product1 obj = new Product1();

        int prod1 = obj.Prod(1, 2, 3);
        System.out.println("Product of the three integer value :" + prod1);
        double prod2 = obj.Prod(1.0, 2.0, 3.0);
        System.out.println("Product of the three double value :" + prod2);

        //output:
        //Product of the three integer value :6
        //Product of the three double value :6.0
    }

}
