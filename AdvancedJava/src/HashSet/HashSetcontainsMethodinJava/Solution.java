package HashSet.HashSetcontainsMethodinJava;

import java.util.HashSet;

// Java code to illustrate HashSet.contains() method
public class Solution {


    public static void main(String args[]) {
        // Creating an empty HashSet
        HashSet<String> set = new HashSet<String>();

        // Using add() method to add elements into the Set
        set.add("Welcome");
        set.add("To");
        set.add("Geeks");
        set.add("4");
        set.add("Geeks");

        // Displaying the HashSet
        System.out.println("HashSet: " + set);

        // Check for "Geeks" in the set
        System.out.println("Does the Set contains 'Geeks'? " + set.contains("Geeks"));

        // Check for "4" in the set
        System.out.println("Does the Set contains '4'? " + set.contains("4"));

        // Check if the Set contains "No"
        System.out.println("Does the Set contains 'No'? " + set.contains("No"));
    }
    //output:
    // HashSet: [4, Geeks, Welcome, To]
    //Does the Set contains 'Geeks'? true
    //Does the Set contains '4'? true
    //Does the Set contains 'No'? false
}

