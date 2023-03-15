package Strings.StringClass.java.lang.ClassSet1;

import java.lang.reflect.Field;

// Java program to demonstrate getFields() method
public class Test21 {

    public static void main(String[] args) throws SecurityException, ClassNotFoundException {
        // returns the Class object for the class
        // with the specified name
        Class c1 = Class.forName("java.lang.Integer");

        // getFields method on c1
        // it array of fields of Integer class
        Field F[] = c1.getFields();

        System.out.println("Below are the fields of Integer class : ");

        // iterating through all fields of String class
        for (Field field : F) {
            System.out.println(field);
        }
    }
    //output:
    //Below are the fields of Integer class :
    //public static final int java.lang.Integer.MIN_VALUE
    //public static final int java.lang.Integer.MAX_VALUE
    //public static final java.lang.Class java.lang.Integer.TYPE
    //public static final int java.lang.Integer.SIZE
    //public static final int java.lang.Integer.BYTES

}
