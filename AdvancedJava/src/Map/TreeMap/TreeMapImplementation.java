package Map.TreeMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//Constructors.Constructor 3: TreeMap(Map M)
public class TreeMapImplementation {
// Java Program to Demonstrate TreeMap using the Default Constructors.Constructor


    // Method 1 To illustrate constructor<Map>
    static void Example3rdConstructor() {
        // Creating an empty HashMap
        Map<Integer, String> hash_map = new HashMap<Integer, String>();

        // Mapping string values to int keys using put() method
        hash_map.put(10, "Geeks");
        hash_map.put(15, "4");
        hash_map.put(20, "Geeks");
        hash_map.put(25, "Welcomes");
        hash_map.put(30, "You");

        // Creating the TreeMap using the Map
        TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>(hash_map);

        // Printing the elements of TreeMap
        System.out.println("TreeMap: " + tree_map);
    }

    // Method 2 Main driver method
    public static void main(String[] args) {

        System.out.println("TreeMap using " + "TreeMap(Map)" + " constructor:\n");

        Example3rdConstructor();

        //output:
        // TreeMap using TreeMap(Map) constructor:
        //TreeMap: {10=Geeks, 15=4, 20=Geeks, 25=Welcomes, 30=You}
    }
}



