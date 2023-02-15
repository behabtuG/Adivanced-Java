package Methods.Method;

// Java Program to Illustrate Methods
// Class 1
// Helper class
public class Addition {

    // Initially taking sum as 0
    // as we have not started computation
    int sum = 0;

    // Method
    // To add two numbers
    public int addTwoInt(int a, int b) {

        // Adding two integer value
        sum = a + b;

        // Returning summation of two values
        return sum;
    }
}

// Class 2
// Helper class
class GFG {

    // Main driver method
    public static void main(String[] args) {

        // Creating object of class 1 inside main() method
        Addition add = new Addition();

        // Calling method of above class
        // to add two integer
        // using instance created
        int s = add.addTwoInt(1, 2);

        // Printing the sum of two numbers
        System.out.println("Sum of two integer values :" + s);

        //output:Sum of two integer values :3
    }
}
