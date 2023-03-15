package Strings.StringBuffer;

// Java Program to Illustrate StringBuffer class
// via append() method

// Importing required classes

// Main class
public class Appends {

    // Main driver method
    public static void main(String[] args) {
        // Creating an object of StringBuffer class and
        // passing random string
        StringBuffer s = new StringBuffer("Geeksfor");

        // Usage of append() method
        s.append("Geeks");

        // Returns GeeksforGeeks
        System.out.println(s);

        s.append(1);
        // Returns GeeksforGeeks1
        System.out.println(s);
    }

    //output:
    //GeeksforGeeks
    //GeeksforGeeks1
}
