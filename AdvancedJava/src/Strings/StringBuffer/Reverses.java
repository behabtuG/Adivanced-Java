package Strings.StringBuffer;
// Java Program to Illustrate StringBuffer class
// via reverse() method
// Importing I/O classes
// Main class

public class Reverses {

    // Main driver method
    public static void main(String[] args) {
        // Creating a string via creating
        // object of StringBuffer class
        StringBuffer s = new StringBuffer("GeeksGeeks");

        // Invoking reverse() method
        s.reverse();

        // Returns "skeeGrofskeeG"
        System.out.println(s);
    }

    //output:skeeGskeeG
}
