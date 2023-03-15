package Strings.StringClass.java.lang.ClassSet1;

import java.lang.reflect.Method;

// Java program to demonstrate getMethod() method
public class Test26 {

    public static void main(String[] args)
            throws SecurityException, ClassNotFoundException,
            NoSuchMethodException {
        // returns the Class object for the class
        // with the specified name
        Class c1 = Class.forName("java.lang.Integer");
        Class c2 = Class.forName("java.lang.String");

        // getMethod method on c1
        // it checks for a public Method in Integer class
        Method m = c1.getMethod("parseInt", c2);

        System.out.println("method in Integer class specified by parseInt : ");
        System.out.println(m);
    }
    //output:
    // method in Integer class specified by parseInt :
    //public static int java.lang.Integer.parseInt(java.lang.String) throws java.lang.NumberFormatException
}
