package Exceptions.TypesofException;

import java.util.Hashtable;

// Java program to demonstrate NoSuchElementException
public class NoSuchElementException_Demo {


    public static void main(String[] args) {

        //Set exampleleSet = new HashSet();

        Hashtable exampleTable = new Hashtable();

        //exampleleSet.iterator().next();
        //accessing Set

        exampleTable.elements().nextElement();
        //accessing Hashtable

        // This throws a NoSuchElementException as there are
        // no elements in Set and HashTable and we are
        // trying to access elements
    }


}
