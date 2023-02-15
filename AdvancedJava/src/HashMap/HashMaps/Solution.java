package HashMap.HashMaps;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    //Create a HashMap object called capitalCities that will store String keys and String values:
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");//The HashMap class has many useful methods. For example, to add items to it, use the put() method:
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
        System.out.println(capitalCities.get("England"));//To access a value in the HashMap, use the get() method and refer to its key:
        capitalCities.remove("England");//To remove an item, use the remove() method and refer to the key:
        System.out.println(capitalCities);
        capitalCities.clear();//To remove all items, use the clear() method:
        System.out.println(capitalCities);
        System.out.println(capitalCities.size());//HashMap Size
        // Print keys
        for (String i : capitalCities.keySet()) {//keySet() method if you only want the keys
            System.out.println(i);
        }
        for (String i : capitalCities.values()) {//use the values() method if you only want the
            System.out.println(i);
        }
        //output:
        // {USA=Washington DC, Norway=Oslo, England=London, Germany=Berlin}
        //London
        //{USA=Washington DC, Norway=Oslo, Germany=Berlin}
        //{}
        //0
    }

    public static void main0(String[] args) {
        // Create a HashMap object called people
        HashMap<String, Integer> people = new HashMap<String, Integer>();
        // Add keys and values (Name, Age)
        people.put("Behabtu", 32);
        people.put("Kidest", 25);
        people.put("son", 0);
        for (String i : people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i));
        }

        //output:
        //key: Kidest value: 25
        //key: son value: 0
        //key: Behabtu value: 32
    }

    public static void main1(String[] args) {
        // Create an empty hash map by declaring object of string and integer type
        HashMap<String, Integer> map = new HashMap<>();

        // Adding elements to the Map using standard put() method
        map.put("Behabtu", 10);
        map.put("Kidest", 30);
        map.put("Marriage", 20);

        // Print size and content of the Map
        System.out.println("Size of map is:- " + map.size());

        // Printing elements in object of Map
        System.out.println(map);

        // Checking if a key is present and if present, print value by passing random element
        if (map.containsKey("Behabtu")) {

            // Mapping
            Integer a = map.get("Behabtu");

            // Printing value for the corresponding key
            System.out.println("value for key" + " \"Behabtu\" is:- " + a);
        }
        //output:
        // Size of map is:- 3
        //{Kidest=30, Behabtu=10, Marriage=20}
        //value for key "Behabtu" is:- 10
    }

    // Constructors.Constructor 1: HashMap()
    public static void main2(String args[]) {
        // No need to mention the Generic type twice
        HashMap<Integer, String> hm1 = new HashMap<>();

        // Initialization of a HashMap using Generics
        HashMap<Integer, String> hm2 = new HashMap<Integer, String>();

        // Adding elements using put method Custom input elements
        hm1.put(1, "one");
        hm1.put(2, "two");
        hm1.put(3, "three");
        hm2.put(4, "four");
        hm2.put(5, "five");
        hm2.put(6, "six");

        // Print and display mapping of HashMap 1
        System.out.println("Mappings of HashMap hm1 are : " + hm1);

        // Print and display mapping of HashMap 2
        System.out.println("Mapping of HashMap hm2 are : " + hm2);

        //output:
        // Mappings of HashMap hm1 are : {1=one, 2=two, 3=three}
        //Mapping of HashMap hm2 are : {4=four, 5=five, 6=six}
    }

    //Constructors.Constructor 2: HashMap(int initialCapacity)
    // Java program to DemonstrateHashMap(int initialCapacity) Constructors.Constructor

    public static void main3(String args[]) {
        // No need to mention the Generic type twice
        HashMap<Integer, String> hm1 = new HashMap<>(10);

        // Initialization of a HashMap using Generics
        HashMap<Integer, String> hm2 = new HashMap<Integer, String>(2);

        // Adding elements to object of HashMap using put method

        // HashMap 1
        hm1.put(1, "one");
        hm1.put(2, "two");
        hm1.put(3, "three");

        // HashMap 2
        hm2.put(4, "four");
        hm2.put(5, "five");
        hm2.put(6, "six");

        // Printing elements of HashMap 1
        System.out.println("Mappings of HashMap hm1 are : " + hm1);

        // Printing elements of HashMap 2
        System.out.println("Mapping of HashMap hm2 are : " + hm2);

        //output:
        // Mappings of HashMap hm1 are : {1=one, 2=two, 3=three}
        // Mapping of HashMap hm2 are : {4=four, 5=five, 6=six}
    }

    //Constructors.Constructor 3: HashMap(int initialCapacity, float loadFactor)
    // Java program to Demonstrate HashMap(int initialCapacity,float loadFactor) Constructors.Constructor

    public static void main4(String args[]) {
        // No need to mention the generic type twice
        HashMap<Integer, String> hm1 = new HashMap<>(5, 0.75f);

        // Initialization of a HashMap using Generics
        HashMap<Integer, String> hm2 = new HashMap<Integer, String>(3, 0.5f);

        // Add Elements using put() method Custom input elements
        hm1.put(1, "one");
        hm1.put(2, "two");
        hm1.put(3, "three");

        hm2.put(4, "four");
        hm2.put(5, "five");
        hm2.put(6, "six");

        // Print and display elements in object of hashMap 1
        System.out.println("Mappings of HashMap hm1 are : " + hm1);

        // Print and display elements in object of hashMap 2
        System.out.println("Mapping of HashMap hm2 are : " + hm2);

        //output:
        // Mappings of HashMap hm1 are : {1=one, 2=two, 3=three}
        //Mapping of HashMap hm2 are : {4=four, 5=five, 6=six}

    }

    // 4. HashMap(Map map): It creates an instance of HashMap with the same mappings as the specified map.
    // Java program to demonstrate the HashMap(Map map) Constructors.Constructor


    public static void main5(String args[]) {
        // No need to mention the Generic type twice
        Map<Integer, String> hm1 = new HashMap<>();

        // Add Elements using put method
        hm1.put(1, "one");
        hm1.put(2, "two");
        hm1.put(3, "three");

        // Initialization of a HashMap using Generics
        HashMap<Integer, String> hm2 = new HashMap<Integer, String>(hm1);

        System.out.println("Mappings of HashMap hm1 are : " + hm1);

        System.out.println("Mapping of HashMap hm2 are : " + hm2);

        //output:
        // Mappings of HashMap hm1 are : {1=one, 2=two, 3=three}
        //Mapping of HashMap hm2 are : {1=one, 2=two, 3=three}
    }

    //1. Adding Elements: Performing Various Operations on HashMap
    // Java program to add elements to the HashMap

    public static void main6(String args[]) {
        // No need to mention the Generic type twice
        HashMap<Integer, String> hm1 = new HashMap<>();

        // Initialization of a HashMap using Generics
        HashMap<Integer, String> hm2 = new HashMap<Integer, String>();

        // Add Elements using put method
        hm1.put(1, "Geeks");
        hm1.put(2, "For");
        hm1.put(3, "Geeks");

        hm2.put(1, "Geeks");
        hm2.put(2, "For");
        hm2.put(3, "Geeks");

        System.out.println("Mappings of HashMap hm1 are : " + hm1);
        System.out.println("Mapping of HashMap hm2 are : " + hm2);

        //output:
        // Mappings of HashMap hm1 are : {1=Geeks, 2=For, 3=Geeks}
        //Mapping of HashMap hm2 are : {1=Geeks, 2=For, 3=Geeks}
    }

    // 2. Changing Elements:
    // Java program to change elements of HashMap
    public static void main7(String args[]) {

        // Initialization of a HashMap
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        // Change Value using put method
        hm.put(1, "Geeks");
        hm.put(2, "Geeks");
        hm.put(3, "Geeks");

        System.out.println("Initial Map " + hm);

        hm.put(2, "For");

        System.out.println("Updated Map " + hm);

        //output:
        // Initial Map {1=Geeks, 2=Geeks, 3=Geeks}
        //Updated Map {1=Geeks, 2=For, 3=Geeks}
    }

    //3. Removing Element:
    // Java program to remove elements from HashMap

    public static void main8(String args[]) {
        // Initialization of a HashMap
        Map<Integer, String> hm = new HashMap<Integer, String>();

        // Add elements using put method
        hm.put(1, "Geeks");
        hm.put(2, "For");
        hm.put(3, "Geeks");
        hm.put(4, "For");

        // Initial HashMap
        System.out.println("Mappings of HashMap are : " + hm);

        // remove element with a key using remove method
        hm.remove(4);

        // Final HashMap
        System.out.println("Mappings after removal are : " + hm);

        //output:
        // Mappings of HashMap are : {1=Geeks, 2=For, 3=Geeks, 4=For}
        //Mappings after removal are : {1=Geeks, 2=For, 3=Geeks}
    }

    //4. Traversal of HashMap
    // Java program to traversal a Java.util.HashMap


    public static void main9(String[] args) {
        // initialize a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Add elements using put method
        map.put("Behabtu", 10);
        map.put("Kidest", 30);
        map.put("Both", 20);

        // Iterate the map using for-each loop
        for (Map.Entry<String, Integer> e : map.entrySet())
            System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());

        //output:
        // Key: Kidest Value: 30
        //Key: Behabtu Value: 10
        //Key: Both Value: 20
    }


}













