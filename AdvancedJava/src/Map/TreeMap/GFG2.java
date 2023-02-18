package Map.TreeMap;

import java.util.*;

public class GFG2 {

    // Java Program to Illustrate Operations in TreeMap Such as Creation, insertion searching, and traversal
    // Main class Implementation of TreeMap
    // Declaring a TreeMap
    static TreeMap<Integer, String> tree_map;

    // Method 1 To create TreeMap
    static void create() {

        // Creating an empty TreeMap
        tree_map = new TreeMap<Integer, String>();

        // Display message only
        System.out.println("TreeMap successfully" + " created");
    }

    // Method 2 To Insert values in the TreeMap
    static void insert() {

        // Mapping string values to int keys using put() method
        tree_map.put(10, "Geeks");
        tree_map.put(15, "4");
        tree_map.put(20, "Geeks");
        tree_map.put(25, "Welcomes");
        tree_map.put(30, "You");

        // Display message only
        System.out.println("\n Elements successfully" + " inserted in the TreeMap");
    }

    // Method 3 To search a key in TreeMap
    static void search(int key) {

        // Checking for the key
        System.out.println("\n Is key \"" + key + "\" present? " + tree_map.containsKey(key));
    }

    // Method 4 To search a value in TreeMap
    static void search(String value) {

        // Checking for the value
        System.out.println("\nIs value \"" + value + "\" present? " + tree_map.containsValue(value));
    }

    // Method 5 To display the elements in TreeMap
    static void display() {

        // Displaying the TreeMap
        System.out.println("\nDisplaying the TreeMap:");
        System.out.println("TreeMap: " + tree_map);
    }

    // Method 6 To traverse TreeMap
    static void traverse() {

        // Display message only
        System.out.println("\n Traversing the TreeMap:");

        for (Map.Entry<Integer, String> e :
                tree_map.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
    }

    // Method 6 Main driver method
    public static void main(String[] args) {

        // Calling above defined methods inside main()
        // Creating a TreeMap
        create();

        // Inserting the values in the TreeMap
        insert();

        // Search key "50" in the TreeMap
        search(50);

        // Search value "Geeks" in the TreeMap
        search("Geeks");

        // Display the elements in TreeMap
        display();

        // Traversing the TreeMap
        traverse();

        //output:
        // TreeMap successfully created

        // Elements successfully inserted in the TreeMap

        // Is key "50" present? false

        //Is value "Geeks" present? true

        //Displaying the TreeMap:
        //TreeMap: {10=Geeks, 15=4, 20=Geeks, 25=Welcomes, 30=You}

        // Traversing the TreeMap:
        //10 Geeks
        //15 4
        //20 Geeks
        //25 Welcomes
        //30 You
    }
}


