package ArrayList.CopyOnWriteArrayList.CopyOnWriteArrayListiterator;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Solution {

    // Java Program to illustrate the CopyOnWriteArrayList iterator() method in Java

    public static void main0(String[] args) {

        // create object of CopyOnWriteArrayList
        CopyOnWriteArrayList<Integer> ArrLis = new CopyOnWriteArrayList<Integer>();

        // Add elements
        ArrLis.add(32);
        ArrLis.add(67);
        ArrLis.add(67);
        ArrLis.add(100);

        // print CopyOnWriteArrayList
        System.out.println("CopyOnWriteArrayList: " + ArrLis);

        // Call iterator() method of
        Iterator iteratorVals = ArrLis.iterator();

        // Print elements of iterator
        // created from CopyOnWriteArrayList
        System.out.println("The iterator values  of CopyOnWriteArrayList are:");

        // prints the elements using an iterator
        while (iteratorVals.hasNext()) {
            System.out.println(iteratorVals.next());
        }

        //output:
        //CopyOnWriteArrayList: [32, 67, 67, 100]
        //The iterator values of CopyOnWriteArrayList are:
        //32
        //67
        //67
        //100
    }

    // Program 2:
    // Java Program to illustrate the CopyOnWriteArrayList iterator() method in Java

    public static void main(String[] args) {

        // create object of CopyOnWriteArrayList
        CopyOnWriteArrayList<String> ArrLis = new CopyOnWriteArrayList<String>();

        // Add elements
        ArrLis.add("gopal");
        ArrLis.add("gfg");
        ArrLis.add("jgec");
        ArrLis.add("sudo");

        // print CopyOnWriteArrayList
        System.out.println("CopyOnWriteArrayList: " + ArrLis);

        // Call iterator() method of
        Iterator iteratorVals = ArrLis.iterator();

        // Print elements of iterator
        // created from CopyOnWriteArrayList
        System.out.println("The iterator values of CopyOnWriteArrayList are:");

        // prints the elements using an iterator
        while (iteratorVals.hasNext()) {
            System.out.println(iteratorVals.next());
        }

        //output:
        //CopyOnWriteArrayList: [gopal, gfg, jgec, sudo]
        //The iterator values of CopyOnWriteArrayList are:
        //gopal
        //gfg
        //jgec
        //sudo
    }


}
