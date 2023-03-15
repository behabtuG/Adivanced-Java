package Strings.StringClass.java.lang.ClassSet1;

import java.lang.reflect.Field;

// Java program to demonstrate getField() method
public class Test25 {
    public static void main(String[] args)
            throws SecurityException, ClassNotFoundException,
            NoSuchFieldException {
        // returns the Class object for the class
        // with the specified name
        Class c1 = Class.forName("java.lang.Integer");

        // getField method on c1
        // it checks a public field in Integer class with specified parameter
        Field f = c1.getField("MIN_VALUE");

        System.out.println("public field in Integer class with MIN_VALUE name :");
        System.out.println(f);
    }
    //output:
    //public field in Integer class with MIN_VALUE name :
    //public static final int java.lang.Integer.MIN_VALUE
}
