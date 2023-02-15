package TreeMap;

import java.util.TreeMap;

public class GFG {

    //Constructors.Constructor 2: TreeMap(Comparator comp)
    // Calling constructor inside main()
    static void Example2ndConstructor() {
        // Creating an empty TreeMap
        TreeMap<Student, Integer> tree_map = new TreeMap<Student, Integer>(new SortbyRoll());

        // Mapping string values to int keys
        tree_map.put(new Student(111, "Behabtu", "Addis Ababa"), 2);
        tree_map.put(new Student(131, "Kidest", "kality"), 3);
        tree_map.put(new Student(121, "Yonas", "Debre Markos"), 1);

        // Printing the elements of TreeMap
        System.out.println("TreeMap: " + tree_map);
    }

    // Main driver method
    public static void main(String[] args) {

        System.out.println("TreeMap using " + "TreeMap(Comparator)" + " constructor:\n");
        Example2ndConstructor();

        //output:
        // TreeMap using TreeMap(Comparator) constructor:
        //TreeMap: {111 Behabtu Addis Ababa=2, 121 Yonas Debre Markos=1, 131 Kidest kality=3}
    }
}
