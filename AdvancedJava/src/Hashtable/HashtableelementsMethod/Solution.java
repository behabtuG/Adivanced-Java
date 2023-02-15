package Hashtable.HashtableelementsMethod;

import java.util.Enumeration;
import java.util.Hashtable;


public class Solution {

    // Java code to illustrate the elements() method
    public static void main0(String[] args) {
        // Creating an empty Hashtable
        Hashtable<Integer, String> hash_table = new Hashtable<Integer, String>();

        // Inserting elements into the table
        hash_table.put(10, "Geeks");
        hash_table.put(15, "4");
        hash_table.put(20, "Geeks");
        hash_table.put(25, "Welcomes");
        hash_table.put(30, "You");

        // Displaying the Hashtable
        System.out.println("The Table is: " + hash_table);

        // Creating an empty enumeration to store
        Enumeration enu = hash_table.elements();

        System.out.println("The enumeration of values are:");

        // Displaying the Enumeration
        while (enu.hasMoreElements()) {
            System.out.println(enu.nextElement());
        }

        //output:
        // The Table is: {10=Geeks, 20=Geeks, 30=You, 15=4, 25=Welcomes}
        //The enumeration of values are:
        //Geeks
        //Geeks
        //You
        //4
        //Welcomes

    }

    //2. Java code to illustrate the elements() method
    public static void main(String[] args) {

        // Creating an empty Hashtable
        Hashtable<String, Integer> hash_table = new Hashtable<String, Integer>();

        // Inserting elements into the table
        hash_table.put("Geeks", 10);
        hash_table.put("4", 15);
        hash_table.put("Geeks", 20);
        hash_table.put("Welcomes", 25);
        hash_table.put("You", 30);

        // Displaying the Hashtable
        System.out.println("The Table is: " + hash_table);

        // Creating an empty enumeration to store
        Enumeration enu = hash_table.elements();

        System.out.println("The enumeration of values are:");

        // Displaying the Enumeration
        while (enu.hasMoreElements()) {
            System.out.println(enu.nextElement());
        }

        //output:
        // The Table is: {You=30, Welcomes=25, 4=15, Geeks=20}
        //The enumeration of values are:
        //30
        //25
        //15
        //20
    }


}
