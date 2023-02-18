package Map.HashMap.HashMapandTreeMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* Java program to print frequencies of all elements using HashMap */
public class Solution {

    //HashMap
    // This function prints frequencies of all elements
    static void printFreq0(int arr[]) {
        // Creates an empty HashMap
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

        // Traverse through the given array
        for (int i = 0; i < arr.length; i++) {
            Integer c = hmap.get(arr[i]);

            // If this is first occurrence of element
            if (hmap.get(arr[i]) == null)
                hmap.put(arr[i], 1);

                // If elements already exists in hash map
            else
                hmap.put(arr[i], ++c);
        }

        // Print result
        for (Map.Entry m : hmap.entrySet())
            System.out.println("Frequency of " + m.getKey() + " is " + m.getValue());
    }

    // Driver method to test above method
    public static void main0(String[] args) {
        int arr[] = {10, 34, 5, 10, 3, 5, 10};
        printFreq(arr);

        //output:
        //Frequency of 34 is 1
        //Frequency of 3 is 1
        //Frequency of 5 is 2
        //Frequency of 10 is 3
    }

    /* Java program to print frequencies of all elements using TreeMap */
    //TreeMap

    // This function prints frequencies of all elements
    static void printFreq(int arr[]) {
        // Creates an empty TreeMap
        TreeMap<Integer, Integer> tmap =
                new TreeMap<Integer, Integer>();

        // Traverse through the given array
        for (int i = 0; i < arr.length; i++) {
            Integer c = tmap.get(arr[i]);

            // If this is first occurrence of element
            if (tmap.get(arr[i]) == null)
                tmap.put(arr[i], 1);

                // If elements already exists in hash map
            else
                tmap.put(arr[i], ++c);
        }

        // Print result
        for (Map.Entry m : tmap.entrySet())
            System.out.println("Frequency of " + m.getKey() +
                    " is " + m.getValue());
    }

    // Driver method to test above method
    public static void main(String[] args) {
        int arr[] = {10, 34, 5, 10, 3, 5, 10};
        printFreq(arr);

        //output:
        //Frequency of 3 is 1
        //Frequency of 5 is 2
        //Frequency of 10 is 3
        //Frequency of 34 is 1
    }

}


