package Map.HashMap.HowtoConvertHashMaptoArrayList;

import java.util.*;
import java.util.stream.*;
import java.util.Map.*;

public class Solution {

    //Method 1:to convert a HashMap to an ArrayList
    public static void main1(String[] args) {
        // Create an empty hash map
        HashMap<String, Integer> map = new HashMap<>();

        // Add elements to the map
        map.put("Behabtu", 10);
        map.put("Kidest", 30);
        map.put("Son", 20);

        // Finding the Set of keys from the HashMap
        Set<String> keySet = map.keySet();

        // Creating an ArrayList of keys by passing the keySet
        ArrayList<String> listOfKeys = new ArrayList<String>(keySet);

        // Getting Collection of values from HashMap
        Collection<Integer> values = map.values();

        // Creating an ArrayList of values
        ArrayList<Integer> listOfValues = new ArrayList<>(values);

        System.out.println("The Keys of the Map are " + listOfKeys);

        System.out.println("The Values of the Map are " + listOfValues);

        //output:
        // The Keys of the Map are [Kidest, Son, Behabtu]
        //The Values of the Map are [30, 20, 10]
    }

    //Method 2: to convert a HashMap to an ArrayList

    public static void main2(String[] args) {
        // Create an empty hash map
        HashMap<String, Integer> map = new HashMap<>();

        // Add elements to the map
        map.put("Behabtu", 10);
        map.put("Kidest", 30);
        map.put("Daughter", 20);

        // Java 8 code to convert map keys to list Here, the collect() method collects the
        // stream of keys in a ArrayList.
        ArrayList<String> listOfKeys = map.keySet().stream().collect(
                Collectors.toCollection(ArrayList::new));

        // Java 8 code to convert map values to list
        ArrayList<Integer> listOfValues = map.values().stream().collect(
                Collectors.toCollection(ArrayList::new));

        System.out.println("The Keys of the Map are " + listOfKeys);

        System.out.println("The Values of the Map are " + listOfValues);

        //output:
        // The Keys of the Map are [Kidest, Daughter, Behabtu]
        //The Values of the Map are [30, 20, 10]
    }

    //Method 3:to convert a HashMap to an ArrayList
    public static void main(String[] args) {
        // Create an empty hash map
        HashMap<String, Integer> map
                = new HashMap<>();

        // Add elements to the map
        map.put("Behabtu", 10);
        map.put("Kidest", 30);
        map.put("boy", 20);

        // Set of the entries from the HashMap
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        // Creating an ArrayList of Entry objects
        ArrayList<Map.Entry<String, Integer>> listOfEntry = new ArrayList<Entry<String, Integer>>(entrySet);

        System.out.println(listOfEntry);

        //output:[Kidest=30, Behabtu=10, boy=20]
    }
}






