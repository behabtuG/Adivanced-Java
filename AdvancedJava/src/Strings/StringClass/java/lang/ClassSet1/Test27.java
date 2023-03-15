package Strings.StringClass.java.lang.ClassSet1;

import java.lang.reflect.Constructor;

// Java program to demonstrate
// getConstructor() Constructor
public class Test27 {

    public static void main(String[] args) throws SecurityException, ClassNotFoundException, NoSuchMethodException {
        // returns the Class object for the class
        // with the specified name
        Class c1 = Class.forName("java.lang.Integer");
        Class c2 = Class.forName("java.lang.String");

        // getConstructor method on c1
        // it checks a public Constructor in Integer class
        // with specified parameterTypes
        Constructor c = c1.getConstructor(c2);

        System.out.println("Constructor in Integer class & String parameterType:");
        System.out.println(c);
    }
    //output:
    //Constructor in Integer class & String parameterType:
    //public java.lang.Integer(java.lang.String) throws java.lang.NumberFormatException
}
