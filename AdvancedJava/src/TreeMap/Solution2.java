package TreeMap;

import java.util.*;

public class Solution2 {
    //Operation 1: Adding Elements
    // Java Program to Illustrate Addition of Elements in TreeMap using put() Method

    public static void main0(String args[]) {
        // Default Initialization of a TreeMap
        TreeMap tm1 = new TreeMap();

        // Inserting the elements in TreeMap using put() method
        tm1.put(3, "Geeks");
        tm1.put(2, "For");
        tm1.put(1, "Geeks");

        // Initialization of a TreeMap using Generics
        TreeMap<Integer, String> tm2 = new TreeMap<Integer, String>();

        // Inserting the elements in TreeMap again using put() method
        tm2.put(new Integer(3), "Geeks");
        tm2.put(new Integer(2), "For");
        tm2.put(new Integer(1), "Geeks");

        // Printing the elements of both TreeMaps
        // Map 1
        System.out.println(tm1);
        // Map 2
        System.out.println(tm2);

        //output:
        // {1=Geeks, 2=For, 3=Geeks}
        //{1=Geeks, 2=For, 3=Geeks}
    }

    //Operation 2: Changing Elements
    // Java program to Illustrate Update of Elements in TreeMap using put() Method
    public static void main1(String args[]) {
        // Initialization of a TreeMap using Generics
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

        // Inserting the elements in Map using put() method
        tm.put(3, "Geeks");
        tm.put(2, "Geeks");
        tm.put(1, "Geeks");

        // Print all current elements in map
        System.out.println(tm);

        // Inserting the element at specified corresponding to specified key
        tm.put(2, "For");

        // Printing the updated elements of Map
        System.out.println(tm);

        //output:
        // {1=Geeks, 2=Geeks, 3=Geeks}
        //{1=Geeks, 2=For, 3=Geeks}
    }
    //Operation 3: Removing Element
    // Java program to Illustrate Removal of Elements in TreeMap using remove() Method

    public static void main2(String args[]) {
        // Initialization of a TreeMap using Generics
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

        // Inserting the elements using put() method
        tm.put(3, "Geeks");
        tm.put(2, "Geeks");
        tm.put(1, "Geeks");
        tm.put(4, "For");

        // Printing all elements of Map
        System.out.println(tm);

        // Removing the element corresponding to key
        tm.remove(4);

        // Printing updated TreeMap
        System.out.println(tm);

        //output:
        // {1=Geeks, 2=Geeks, 3=Geeks, 4=For}
        //{1=Geeks, 2=Geeks, 3=Geeks}
    }

    //Operation 4: Iterating through the TreeMap
    // Java Program to Illustrate Iterating over TreeMap using

    public static void main(String args[]) {
        // Initialization of a TreeMap using Generics
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

        // Inserting the elements using put() method
        tm.put(3, "Geeks");
        tm.put(2, "For");
        tm.put(1, "Geeks");

        // For-each loop for traversal over Map via entrySet() Method
        for (Map.Entry mapElement : tm.entrySet()) {

            int key = (int) mapElement.getKey();

            // Finding the value
            String value = (String) mapElement.getValue();

            // Printing the key and value
            System.out.println(key + " : " + value);

            //output:
            //1 : Geeks
            //2 : For
            //3 : Geeks
        }
    }



}


