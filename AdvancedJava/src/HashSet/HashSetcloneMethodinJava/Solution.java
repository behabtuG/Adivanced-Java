package HashSet.HashSetcloneMethodinJava;

import java.util.HashSet;

// Java code to illustrate clone()
public class Solution {


    public static void main(String args[]) {
        // Creating an empty HashSet
        HashSet<String> set = new HashSet<String>();

        // Use add() method to add elements into the Set
        set.add("Welcome");
        set.add("To");
        set.add("Geeks");
        set.add("4");
        set.add("Geeks");

        // Displaying the HashSet
        System.out.println("HashSet: " + set);

        // Creating a new cloned set
        HashSet cloned_set = new HashSet();

        // Cloning the set using clone() method
        cloned_set = (HashSet) set.clone();

        // Displaying the new Set after Cloning;
        System.out.println("The new set: " + cloned_set);

        //output:
        // HashSet: [4, Geeks, Welcome, To]
        //The new set: [Geeks, Welcome, To, 4]
    }
}

