package Modifiers.Access.p2;

import Modifiers.Access.Geek;

// Java program to illustrate error while
// using class from different package with
// default modifier
public class GeekNew {

    // This class is having default access modifier
    public static void main(String args[]) {
        // Accessing class Geek from package p1
        Geek obj = new Geek();

        //  obj.display();
    }
    //Output:Compile time error

}
