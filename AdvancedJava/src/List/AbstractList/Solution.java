package List.AbstractList;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {
    // Java code to illustrate AbstractList
    public static void main0(String args[]) {

        // Creating an empty AbstractList
        AbstractList<String> list = new ArrayList<String>();

        // Use add() method to add elements in the list
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");
        list.add("10");
        list.add("20");

        // Displaying the AbstractList
        System.out.println("AbstractList:" + list);

        //output: AbstractList:[Geeks, for, Geeks, 10, 20]
    }

    //example 2

    public static void main(String args[]) {

        // Creating an empty AbstractList
        AbstractList<String> list = new LinkedList<String>();

        // Using add() method to add elements in the list
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");
        list.add("10");
        list.add("20");
        list.add("A");

        // Output the list
        System.out.println("AbstractList: " + list);

        // Remove the head using remove()
        list.remove(3);

        // Print the final list
        System.out.println("Final AbstractList: " + list);

        // getting the index of last occurrence using lastIndexOf() method
        int lastIndex = list.lastIndexOf("A");

        // printing the Index
        System.out.println("Last index of A : " + lastIndex);

        //output:
        // AbstractList: [Geeks, for, Geeks, 10, 20]
        //Final AbstractList: [Geeks, for, Geeks, 20]
        //Last index of A : 4
    }


}


