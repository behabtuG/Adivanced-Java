package Exceptions.TypesofException.OutOfMemoryErrorException;

import java.util.*;

// Java program to illustrate
// Requested array size exceeds VM limit error
public class GFG {

    static List<String> list = new ArrayList<String>();

    public static void main(String args[]) throws Exception {
        Integer[] array = new Integer[100000 * 100000];
    }

    //Output:
    //Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
    //    at GFG.main(GFG.java:12)
}


