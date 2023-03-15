package Strings.StringBuffer;

// Java Program to Illustrate StringBuffer class
// via delete() and deleteCharAt() Methods
// Importing I/O classes
// Main class
public class Deletes {

    // Main driver method
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("GeeksforGeeks");

        s.delete(0, 5);
        // Returns forGeeks
        System.out.println(s);

        s.deleteCharAt(7);
        // Returns forGeek
        System.out.println(s);
    }

    //output:
    //forGeeks
    //forGeek
}
