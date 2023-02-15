package Vector;

import java.util.Vector;

public class Solution {
    // Main driver method
    public static void main1(String[] args) {
        // Size of the Vector
        int n = 5;

        // Declaring the Vector with
        // initial size n
        Vector<Integer> v = new Vector<Integer>(n);

        // Appending new elements at
        // the end of the vector
        for (int i = 1; i <= n; i++)
            v.add(i);

        // Printing elements
        System.out.println(v);

        // Remove element at index 3
        v.remove(3);

        // Displaying the vector
        // after deletion
        System.out.println(v);

        // iterating over vector elements
        // using for loop
        for (int i = 0; i < v.size(); i++)

            // Printing elements one by one
            System.out.print(v.get(i) + " ");
        //output:
        // [1, 2, 3, 4, 5]
        //[1, 2, 3, 5]
        //1 2 3 5
    }

    // Operation 1: Adding Elements
    // AddElementsToVector
    public static void main2(String[] arg) {

        // Case 1
        // Creating a default vector
        Vector v1 = new Vector();

        // Adding custom elements
        // using add() method
        v1.add(1);
        v1.add(2);
        v1.add("geeks");
        v1.add("forGeeks");
        v1.add(3);

        // Printing the vector elements to the console
        System.out.println("Vector v1 is " + v1);

        // Case 2
        // Creating generic vector
        Vector<Integer> v2 = new Vector<Integer>();

        // Adding custom elements
        // using add() method
        v2.add(1);
        v2.add(2);
        v2.add(3);

        // Printing the vector elements to the console
        System.out.println("Vector v2 is " + v2);

        //output:
        // Vector v1 is [1, 2, geeks, forGeeks, 3]
        //Vector v2 is [1, 2, 3]
    }

    //Operation 2: Updating Elements
    public static void main3(String args[]) {

        // Creating an empty Vector
        Vector<Integer> vec_tor = new Vector<Integer>();

        // Use add() method to add elements in the vector
        vec_tor.add(12);
        vec_tor.add(23);
        vec_tor.add(22);
        vec_tor.add(10);
        vec_tor.add(20);

        // Displaying the Vector
        System.out.println("Vector: " + vec_tor);

        // Using set() method to replace 12 with 21
        System.out.println("The Object that is replaced is: "
                + vec_tor.set(0, 21));

        // Using set() method to replace 20 with 50
        System.out.println("The Object that is replaced is: "
                + vec_tor.set(4, 50));

        // Displaying the modified vector
        System.out.println("The new Vector is:" + vec_tor);
        //output:
        // Vector: [12, 23, 22, 10, 20]
        //The Object that is replaced is: 12
        //The Object that is replaced is: 20
        //The new Vector is:[21, 23, 22, 10, 50]
    }

    //Operation 3: Removing Elements
    public static void main4(String[] arg) {

        // create default vector of capacity 10
        Vector v = new Vector();

        // Add elements using add() method
        v.add(1);
        v.add(2);
        v.add("Geeks");
        v.add("forGeeks");
        v.add(4);
        // removing first occurrence element at 1
        v.remove(1);
        // checking vector
        System.out.println("after removal: " + v);

        // output: after removal: [1, Geeks, forGeeks, 4]
    }

    // Operation 4: Iterating the Vector
    public static void main(String args[]) {
        // create an instance of vector
        Vector<String> v = new Vector<>();

        // Add elements using add() method
        v.add("Geeks");
        v.add("Geeks");
        v.add(1, "For");

        // Using the Get method and the
        // for loop
        for (int i = 0; i < v.size(); i++) {

            System.out.print(v.get(i) + " ");
        }

        System.out.println();

        // Using the for each loop
        for (String str : v)
            System.out.print(str + " ");
        //output:
        // Geeks For Geeks
        // Geeks For Geeks
    }
}