package Hashtable.HashTables;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

// Java program to demonstrate adding elements to Hashtable
public class Solution {

    //1. Hashtable():
    public static void main0(String args[]) {
        // No need to mention the Generic type twice
        Hashtable<Integer, String> ht1 = new Hashtable<>();

        // Initialization of a Hashtable using Generics
        Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>();

        // Inserting the Elements using put() method
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");

        ht2.put(4, "four");
        ht2.put(5, "five");
        ht2.put(6, "six");

        // Print mappings to the console
        System.out.println("Mappings of ht1 : " + ht1);
        System.out.println("Mappings of ht2 : " + ht2);

        //output:
        // Mappings of ht1 : {3=three, 2=two, 1=one}
        //Mappings of ht2 : {6=six, 5=five, 4=four}
    }

    //2. Hashtable(int initialCapacity)
    // Java program to demonstrate adding elements to Hashtable
    public static void main1(String args[]) {
        // No need to mention the Generic type twice
        Hashtable<Integer, String> ht1 = new Hashtable<>(4);

        // Initialization of a Hashtable using Generics
        Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>(2);

        // Inserting the Elements using put() method
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");

        ht2.put(4, "four");
        ht2.put(5, "five");
        ht2.put(6, "six");

        // Print mappings to the console
        System.out.println("Mappings of ht1 : " + ht1);
        System.out.println("Mappings of ht2 : " + ht2);
    }

    //3. Hashtable(int size, float fillRatio):
    // Java program to demonstrate adding elements to Hashtable
    public static void main2(String args[]) {
        // No need to mention the Generic type twice
        Hashtable<Integer, String> ht1
                = new Hashtable<>(4, 0.75f);

        // Initialization of a Hashtable using Generics
        Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>(3, 0.5f);

        // Inserting the Elements using put() method
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");

        ht2.put(4, "four");
        ht2.put(5, "five");
        ht2.put(6, "six");

        // Print mappings to the console
        System.out.println("Mappings of ht1 : " + ht1);
        System.out.println("Mappings of ht2 : " + ht2);

        //output:
        // Mappings of ht1 : {3=three, 2=two, 1=one}
        //Mappings of ht2 : {6=six, 5=five, 4=four}
    }

    //4. Hashtable(Map<? extends K,? extends V> m)
    // Java program to demonstrate adding elements to Hashtable
    public static void main3(String args[]) {
        // No need to mention the Generic type twice
        Map<Integer, String> hm = new HashMap<>();

        // Inserting the Elements using put() method
        hm.put(1, "one");
        hm.put(2, "two");
        hm.put(3, "three");

        // Initialization of a Hashtable using Generics
        Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>(hm);

        // Print mappings to the console

        System.out.println("Mappings of ht2 : " + ht2);

        //output:Mappings of ht2 : {3=three, 2=two, 1=one}
    }


    // Java program to illustrate Java.util.Hashtable
    public static void main4(String[] args) {
        // Create an empty Hashtable
        Hashtable<String, Integer> ht = new Hashtable<>();

        // Add elements to the hashtable
        ht.put("Behabtu", 10);
        ht.put("Kidest", 30);
        ht.put("Together", 20);

        // Print size and content
        System.out.println("Size of map is:- " + ht.size());
        System.out.println(ht);

        // Check if a key is present and if present, print value
        if (ht.containsKey("Behabtu")) {
            Integer a = ht.get("Behabtu");
            System.out.println("value for key" + " \"Behabtu\" is:- " + a);
        }

        //output:
        // Size of map is:- 3
        // {Together=20, Kidest=30, Behabtu=10}
        // value for key "Behabtu" is:- 10
    }

    //Performing Various Operations on Hashtable
    //1. Adding Elements:
    public static void main5(String args[]) {
        // No need to mention the Generic type twice
        Hashtable<Integer, String> ht1 = new Hashtable<>();

        // Initialization of a Hashtable using Generics
        Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>();

        // Inserting the Elements using put() method
        ht1.put(1, "Geeks");
        ht1.put(2, "For");
        ht1.put(3, "Geeks");

        ht2.put(1, "Geeks");
        ht2.put(2, "For");
        ht2.put(3, "Geeks");

        // Print mappings to the console
        System.out.println("Mappings of ht1 : " + ht1);
        System.out.println("Mappings of ht2 : " + ht2);

        //output:
        // Mappings of ht1 : {3=Geeks, 2=For, 1=Geeks}
        //Mappings of ht2 : {3=Geeks, 2=For, 1=Geeks}
    }

    //2. Changing Elements:
    // Java program to demonstrate updating Hashtable
    public static void main6(String args[]) {

        // Initialization of a Hashtable
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

        // Inserting the Elements using put method
        ht.put(1, "Geeks");
        ht.put(2, "Geeks");
        ht.put(3, "Geeks");

        // print initial map to the console
        System.out.println("Initial Map " + ht);

        // Update the value at key 2
        ht.put(2, "For");

        // print the updated map
        System.out.println("Updated Map " + ht);

        //output:
        // Initial Map {3=Geeks, 2=Geeks, 1=Geeks}
        //Updated Map {3=Geeks, 2=For, 1=Geeks}
    }

    //3. Removing Element:
    // Java program to demonstrate the removing mappings from Hashtable
    public static void main7(String args[]) {
        // Initialization of a Hashtable
        Map<Integer, String> ht = new Hashtable<Integer, String>();

        // Inserting the Elements
        // using put method
        ht.put(1, "Geeks");
        ht.put(2, "For");
        ht.put(3, "Geeks");
        ht.put(4, "For");

        // Initial HashMap
        System.out.println("Initial map : " + ht);

        // Remove the map entry with key 4
        ht.remove(4);

        // Final Hashtable
        System.out.println("Updated map : " + ht);

        //output:
        // Initial map : {4=For, 3=Geeks, 2=For, 1=Geeks}
        //Updated map : {3=Geeks, 2=For, 1=Geeks}
    }

    //4. Traversal of a Hashtable:
    // Java program to illustrate traversal of Hashtable
    public static void main(String[] args) {
        // Create an instance of Hashtable
        Hashtable<String, Integer> ht = new Hashtable<>();

        // Adding elements using put method
        ht.put("Behabtu", 10);
        ht.put("Kidest", 30);
        ht.put("Wife & Hasband", 20);

        // Iterating using enhanced for loop
        for (Map.Entry<String, Integer> e : ht.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());

        //output:
        // Wife & Hasband 20
        //Kidest 30
        //Behabtu 10
    }

    //Internal Working of Hashtable


}



