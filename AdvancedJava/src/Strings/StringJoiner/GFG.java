package Strings.StringJoiner;
// Java program to Demonstrate Methods
// of StringJoiner class


import java.util.ArrayList;
import java.util.StringJoiner;

public class GFG {

    // Main driver method
    public static void main(String[] args) {
        // Creating an empty ArrayList of string type
        ArrayList<String> al = new ArrayList<>();

        // Adding elements to above List
        al.add("Behabtu");
        al.add("Getnet");
        al.add("Kidest");
        al.add("Anteneh");

        // Creating object of class inside main()
        StringJoiner sj1 = new StringJoiner(",");

        // Using setEmptyValue() method
        sj1.setEmptyValue("sj1 is empty");
        System.out.println(sj1);

        // Using add() method
        sj1.add(al.get(0)).add(al.get(1));
        System.out.println(sj1);

        // Using length() method
        System.out.println("Length of sj1 : " + sj1.length());

        StringJoiner sj2 = new StringJoiner(":");
        sj2.add(al.get(2)).add(al.get(3));

        // Using merge() method
        sj1.merge(sj2);

        // Using toString() method
        System.out.println(sj1.toString());

        System.out.println("Length of new sj1 : " + sj1.length());
    }

    //output:
    //sj1 is empty
    //Behabtu,Getnet
    //Length of sj1 : 14
    //Behabtu,Getnet,Kidest:Anteneh
    //Length of new sj1 : 29
}
