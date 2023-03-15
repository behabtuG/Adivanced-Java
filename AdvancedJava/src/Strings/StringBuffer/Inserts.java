package Strings.StringBuffer;

// Java Program to Illustrate StringBuffer class
// via insert() method
// Importing required I/O classes
// Main class

public class Inserts {


    // Main driver method
    public static void main(String[] args) {
        // Creating an object of StringBuffer class
        StringBuffer s = new StringBuffer("GeeksGeeks");

        // Inserting element and position as an arguments
        s.insert(5, "for");
        // Returns GeeksforGeeks
        System.out.println(s);

        s.insert(0, 5);
        // Returns 5GeeksforGeeks
        System.out.println(s);

        s.insert(3, true);
        // Returns 5GetrueeksforGeeks
        System.out.println(s);

        s.insert(5, 41.35d);
        // Returns 5Getr41.35ueeksforGeeks
        System.out.println(s);

        s.insert(8, 41.35f);
        // Returns 5Getr41.41.3535ueeksforGeeks
        System.out.println(s);

        // Declaring and initializing character array
        char geeks_arr[] = {'p', 'a', 'w', 'a', 'n'};

        // Inserting character array at offset 9
        s.insert(2, geeks_arr);
        // Returns 5Gpawanetr41.41.3535ueeksforGeeks
        System.out.println(s);
    }

    //output:
    //GeeksforGeeks
    //5GeeksforGeeks
    //5GetrueeksforGeeks
    //5Getr41.35ueeksforGeeks
    //5Getr41.41.3535ueeksforGeeks
    //5Gpawanetr41.41.3535ueeksforGeeks
}
