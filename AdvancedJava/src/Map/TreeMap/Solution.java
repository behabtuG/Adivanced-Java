package Map.TreeMap;

import java.util.TreeMap;

// TreeMapImplementation
public class Solution {

    // Java Program to Demonstrate TreeMap using the Default Constructors.Constructor
    // Method 1 To show TreeMap constructor
    static void Example1stConstructor() {
        // Creating an empty TreeMap
        TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>();

        // Mapping string values to int keys using put() method
        tree_map.put(10, "Geeks");
        tree_map.put(15, "4");
        tree_map.put(20, "Geeks");
        tree_map.put(25, "Welcomes");
        tree_map.put(30, "You");

        // Printing the elements of TreeMap
        System.out.println("TreeMap: " + tree_map);
    }

    // Method 2 Main driver method
    public static void main(String[] args) {
        System.out.println("TreeMap using " + "TreeMap() constructor:\n");

        // Calling constructor
        Example1stConstructor();

        //output:
        // TreeMap using TreeMap() constructor:
        //TreeMap: {10=Geeks, 15=4, 20=Geeks, 25=Welcomes, 30=You}
    }


}




