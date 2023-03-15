package Strings.StringClass.java.lang.ClassSet1;

// Java program to demonstrate getPackage() method
public class Test20 {

    public static void main(String[] args) throws ClassNotFoundException {
        // returns the Class object for the class
        // with the specified name
        Class c1 = Class.forName("java.lang.String");
        Class c2 = Class.forName("java.util.ArrayList");

        // getting package of class

        // getPackage method on c1
        System.out.println(c1.getPackage());

        // getPackage method on c2
        System.out.println(c2.getPackage());

    }
    //output:
    //package java.lang
    //package java.util

}
