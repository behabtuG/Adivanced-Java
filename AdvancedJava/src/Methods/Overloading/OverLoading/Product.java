package Methods.Overloading.OverLoading;

//Illustrate Method Overloading By Changing the Number of Parameters
// Class 1 Helper class
public class Product {

    // Method 1
    // Multiplying two integer values
    public int multiply(int a, int b) {
        int prod = a * b;
        return prod;
    }

    // Method 2
    // Multiplying three integer values
    public int multiply(int a, int b, int c) {
        int prod = a * b * c;
        return prod;
    }
}

// Class 2
class GFG {

    public static void main(String[] args) {

        // Creating object of above class inside main() method
        Product ob = new Product();

        // Calling method to Multiply 2 numbers
        int prod1 = ob.multiply(1, 2);

        // Printing Product of 2 numbers
        System.out.println("Product of the two integer value :" + prod1);

        // Calling method to multiply 3 numbers
        int prod2 = ob.multiply(1, 2, 3);

        // Printing product of 3 numbers
        System.out.println("Product of the three integer value :" + prod2);

        //output:
        //Product of the two integer value :2
        //Product of the three integer value :6
    }

}
