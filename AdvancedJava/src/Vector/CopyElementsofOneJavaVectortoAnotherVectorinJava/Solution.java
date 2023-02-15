package Vector.CopyElementsofOneJavaVectortoAnotherVectorinJava;

import java.util.Vector;

public class Solution {

    //Method 1: Passing in the constructor
    public static void main1(String[] args) {

        // creation of Vector of Integers
        Vector<Integer> gfg = new Vector<>();

        // adding elements to  first Vector
        gfg.add(11);
        gfg.add(22);
        gfg.add(24);
        gfg.add(39);

        // passing in the constructor
        Vector<Integer> gfg2 = new Vector<>(gfg);

        //Iterating over  second Vector
        System.out.println("-----Iterating over the second Vector----");

        for (Integer value : gfg2) {
            System.out.println(value);
        }

        // here we changed the third element to 23
        // we changed in the second vector, and you can
        // here we will not see the same change in the first
        gfg2.set(2, 23);

        System.out.println("third element of first vector = " + gfg.get(2));
        System.out.println("third element of second vector = " + gfg2.get(2));
        //output:
        // -----Iterating over the second Vector----
        //11
        //22
        //24
        //39
        //third element of first vector = 24
        //third element of second vector = 23
    }

    //Method 2: Adding one by one using add() method
    public static void main(String[] args) {

        // creation of Vector of Integers
        Vector<Integer> gfg = new Vector<>();

        // adding elements to  first Vector
        gfg.add(50);
        gfg.add(24);
        gfg.add(95);
        gfg.add(31);

        Vector<Integer> gfg2 = new Vector<>();

        // adding element to the second Vector
        // by iterating over one by one
        for (Integer value : gfg) {
            gfg2.add(value);
        }

        // Iterating over  second Vector
        System.out.println("-----Iterating over the second Vector----");

        for (Integer value : gfg2) {
            System.out.println(value);
        }

        // here we changed the third element to 23
        // we changed in second Vector
        // here we will not see the same change in the first
        gfg2.set(2, 23);

        System.out.println("third element of first Vector = " + gfg.get(2));
        System.out.println("third element of second Vector = " + gfg2.get(2));
        //output:
        // -----Iterating over the second Vector----
        //50
        //24
        //95
        //31
        //third element of first Vector = 95
        //third element of second Vector = 23
    }
}
