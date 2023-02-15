package TreeMap;

import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentSkipListMap;

//Constructors.Constructor 4: TreeMap(SortedMap sm)
public class GFG1 {
    // Java Program to Demonstrate TreeMap using the SortedMap Constructors.Constructor


    // Method To show TreeMap(SortedMap) constructor
    static void Example4thConstructor() {
        // Creating a SortedMap
        SortedMap<Integer, String> sorted_map = new ConcurrentSkipListMap<Integer, String>();

        // Mapping string values to int keys using put() method
        sorted_map.put(10, "Geeks");
        sorted_map.put(15, "4");
        sorted_map.put(20, "Geeks");
        sorted_map.put(25, "Welcomes");
        sorted_map.put(30, "You");

        // Creating the TreeMap using the SortedMap
        TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>(sorted_map);

        // Printing the elements of TreeMap
        System.out.println("TreeMap: " + tree_map);
    }

    // Method 2 Main driver method
    public static void main(String[] args) {

        System.out.println("TreeMap using " + "TreeMap(SortedMap)" + " constructor:\n");

        Example4thConstructor();

        //output:
        // TreeMap using TreeMap(SortedMap) constructor:
        //TreeMap: {10=Geeks, 15=4, 20=Geeks, 25=Welcomes, 30=You}
    }
}


