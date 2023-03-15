package Strings.StringBuffer;
// Java Program to Illustrate StringBuffer class
// via replace() method

// Importing I/O classes

// Main class

public class Replaces {

    // Main driver method
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("GeeksforGeeks");
        s.replace(5, 8, "are");

        // Returns GeeksareGeeks
        System.out.println(s);
    }

    //output:GeeksareGeeks
}
