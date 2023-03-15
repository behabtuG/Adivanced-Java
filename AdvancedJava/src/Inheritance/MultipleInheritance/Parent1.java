/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance.MultipleInheritance;

/**
 * @author glory
 */
// Java Program to Illustrate Unsupportable of Multiple Inheritance
// Importing input output classes
// Class 1
// First Parent class
public class Parent1 {


    // Method inside first parent class
    void fun() {

        // Print statement if this method is called
        System.out.println("Parent1");
    }
}

// Class 2
// Second Parent Class
class Parent2 {

    // Method inside first parent class
    void fun() {

        // Print statement if this method is called
        System.out.println("Parent2");
    }
}

// Class 3
// Trying to be child of both the classes

/**
 * class Test extends Parent1, Parent2 {
 * <p>
 * // Main driver method
 * public static void main(String args[]) {
 * <p>
 * // Creating object of class in main() method
 * Test t = new Test();
 * <p>
 * // Trying to call above functions of class where
 * // Error is thrown as this class is inheriting
 * // multiple classes
 * t.fun();
 * }
 * //output:Compilation error is thrown
 * //D:\project\IdeaProjects\AdvancedJava\src\Inheritance\MultipleInheritance\Parent1.java:40:27
 * //java: '{' expected
 * }
 */
//Conclusion: As depicted from code above, on calling the method fun() using Test object will cause complications such as whether
//to call Parent1’s fun() or Parent2’s fun() method.
/**

Example 2:

       GrandParent
        /       \
      /          \
    Parent1     Parent2
      \         /
       \      /
        Test

 */