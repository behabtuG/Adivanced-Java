package Vector.VectorgetMethodinJava;

import java.util.Vector;

public class Solution {
    public static void main1(String args[]) {

        // Creating an empty Vector
        Vector<String> vec_tor = new Vector<String>();

        // Use add() method to add elements in the Vector
        vec_tor.add("Geeks");
        vec_tor.add("for");
        vec_tor.add("Geeks");
        vec_tor.add("10");
        vec_tor.add("20");

        // Displaying the Vector
        System.out.println("Vector: " + vec_tor);

        // Fetching the specific element from the Vector
        System.out.println("The element is: "
                + vec_tor.get(2));
        //output:
        // Vector: [Geeks, for, Geeks, 10, 20]
        //The element is: Geeks
    }

    public static void main(String args[]) {

        // Creating an empty Vector
        Vector<String> vec_tor = new Vector<String>();

        // Use add() method to add elements in the Vector
        vec_tor.add("1");
        vec_tor.add("2");
        vec_tor.add("3");
        vec_tor.add("10");
        vec_tor.add("20");

        // Displaying the Vector
        System.out.println("Vector: "
                + vec_tor);

        // Fetching the specific element from the Vector
        System.out.println("The element is: "
                + vec_tor.get(4));
        //output:
        // Vector: [1, 2, 3, 10, 20]
        //The element is: 20
    }
}
