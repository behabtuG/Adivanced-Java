package Strings.StringClass.java.lang.ClassSet1;

// Java program to demonstrate isPrimitive method
public class Test7 {

    public static void main(String[] args) {
        // returns the Class object associated with an integer;
        Class c1 = int.class;

        // returns the Class object associated with Test class
        Class c2 = Test7.class;

        // checking for primitive type

        // isPrimitive method on c1
        boolean b1 = c1.isPrimitive();

        // isPrimitive method on c2
        boolean b2 = c2.isPrimitive();

        System.out.println("is " + c1.toString() + " primitive : " + b1);
        System.out.println("is " + c2.toString() + " primitive : " + b2);
    }
    //output:
    // is int primitive : true
    //is class StringClass.Java.lang.ClassSet1.Test7 primitive : false
}
