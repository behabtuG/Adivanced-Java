package Polymorphisms.CompileTimeandRunTime;

// Java program to demonstrate
// runtime polymorphism
// Implementing a class
public class Test {

    // Implementing a method
    public void method() {
        System.out.println("Method 1");
    }
}

// Defining a child class
class GFG1 extends Test {

    // Overriding the parent method
    public void method() {
        System.out.println("Method 2");
    }

    // Driver code
    public static void main(String args[]) {
        Test test = new GFG1();

        test.method();
    }

    //output:Method 2

}
