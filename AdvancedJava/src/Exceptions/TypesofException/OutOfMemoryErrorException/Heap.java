package Exceptions.TypesofException.OutOfMemoryErrorException;

import java.util.*;

// Java program to illustrate
// Heap error
public class Heap {

    static List<String> list = new ArrayList<String>();

    public static void main(String args[]) throws Exception {
        Integer[] array = new Integer[10000 * 10000];
    }
    //output:Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
    //    at Heap.main(Heap.java:11)
}
