package Exceptions.TypesofException.OutOfMemoryErrorException;

import java.util.*;
// Java program to illustrate
// GC Overhead limit exceeded

public class Wrapper {

    public static void main(String args[]) throws Exception {
        Map m = new HashMap();
        m = System.getProperties();
        Random r = new Random();

        while (true) {
            m.put(r.nextInt(), "randomValue");
        }
    }
    //output:Exception in thread "main" java.lang.OutOfMemoryError: GC overhead limit exceeded
    //    at java.lang.Integer.valueOf(Integer.java:832)
    //    at Wrapper.main(error.java:9)
}
