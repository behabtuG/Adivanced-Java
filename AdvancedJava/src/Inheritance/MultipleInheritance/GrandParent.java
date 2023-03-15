package Inheritance.MultipleInheritance;

// Java Program to Illustrate Unsupportance of Multiple Inheritance
// Diamond Problem Similar Scenario
// Importing input output classes
// Class 1
// A Grand parent class in diamond
public class GrandParent {

    void fun() {

        // Print statement to be executed when this method is called
        System.out.println("Grandparent");
    }
}

// Class 2
// First Parent3 class
class Parent3 extends GrandParent {
    void fun() {

        // Print statement to be executed when this method is called
        System.out.println("Parent3");
    }
}

// Class 3
// Second Parent4 Class
class Parent4 extends GrandParent {
    void fun() {

        // Print statement to be executed when this method is called
        System.out.println("Parent4");
    }
}

// Class 4
// Inheriting from multiple classes
/**class Test1 extends Parent3, Parent4 {

    // Main driver method
    public static void main(String args[]) {

        // Creating object of this class i main() method
        Test1 t = new Test1();

        // Now calling fun() method from its parent classes
        // which will throw compilation error
        t.fun();
    }
    //output:
    //D:\project\IdeaProjects\AdvancedJava\src\Inheritance\MultipleInheritance\GrandParent.java:39:28
    //java: '{' expected
}
*/
//Again it throws compiler error when run fun() method as multiple inheritances cause a diamond problem when allowed in other
//languages like C++. From the code, we see that: On calling the method fun() using Test object will cause complications such as
//whether to call Parent1’s fun() or Parent2’s fun() method. Therefore, in order to avoid such complications, Java does not support
//multiple inheritances of classes.

