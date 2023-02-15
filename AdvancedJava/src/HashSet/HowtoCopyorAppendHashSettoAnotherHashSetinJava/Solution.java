package HashSet.HowtoCopyorAppendHashSettoAnotherHashSetinJava;

import java.util.HashSet;

public class Solution {
    public static void main1(String[] args) {

        // New HashSet
        HashSet<Integer> set = new HashSet<>();

        // Add elements to original set
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);
        set.add(50);
        set.add(20);

        // Make a new HashSet and copy all elements of
        // original HashSet using constructor
        HashSet<Integer> copyOfSet = new HashSet<>(set);

        // Print original HashSet
        System.out.println("Original HashSet: " + set);

        // Print Copy HashSet
        System.out.println("Copy HashSet: " + copyOfSet);

        // output:
        // Original HashSet: [50, 20, 10, 30]
        //Copy HashSet: [50, 20, 10, 30]

    }

    //Method 2: Using the clone method
    public static void main2(String[] args) {

        // New empty HashSet
        HashSet<Integer> set = new HashSet<>();

        // Add elements to set
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);
        set.add(50);
        set.add(20);

        // Create a new HashSet to copy the original HashSet
        HashSet copyOfSet = new HashSet();

        // Copy HashSet using clone method
        copyOfSet = (HashSet) set.clone();

        // Print original HashSet
        System.out.println("Original HashSet: " + set);

        // Print Copy HashSet
        System.out.println("Copy HashSet: " + copyOfSet);
        // output:
        // Original HashSet: [50, 20, 10, 30]
        //Copy HashSet: [50, 10, 20, 30]
    }

    //Method 3: Using the addAll method
    public static void main3(String[] args) {

        // New empty HashSet
        HashSet<Integer> set = new HashSet<>();

        // Add elements to set
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);
        set.add(50);
        set.add(20);

        // Create a new HashSet to copy the original HashSet
        HashSet<Integer> copyOfSet = new HashSet<>();

        // Copy HashSet using addAll method
        copyOfSet.addAll(set);

        // Print original HashSet
        System.out.println("Original HashSet: " + set);

        // Print Copy HashSet
        System.out.println("Copy HashSet: " + copyOfSet);
        //output:
        // Original HashSet: [50, 20, 10, 30]
        //Copy HashSet: [50, 20, 10, 30]
    }

    //Append using addAll method in the already existing HashSet:
    public static void main(String[] args) {

        // New empty HashSet
        HashSet<Integer> set = new HashSet<>();

        // Add elements to set
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);
        set.add(50);
        set.add(20);

        // Create a new HashSet to append a HashSet
        HashSet<Integer> appendedSet = new HashSet<>();

        // Add elements to appendedSet
        appendedSet.add(100);
        appendedSet.add(200);

        System.out.println("Before appending :");

        // Print original HashSet
        System.out.println("Original HashSet: " + set);

        // Print appendedSet before append
        System.out.println("Appended HashSet: "
                + appendedSet);

        // Add all elements of set HashSet to appendedSet
        // using addAll method
        appendedSet.addAll(set);

        System.out.println("After appending");

        // Print appendedSet after append
        System.out.println("Appended HashSet: "
                + appendedSet);
    //output:
        // Before appending :
        //Original HashSet: [50, 20, 10, 30]
        //Appended HashSet: [100, 200]
        //After appending
        //Appended HashSet: [50, 100, 20, 200, 10, 30]
    }
}
