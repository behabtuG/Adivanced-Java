package Strings.StringClass.java.lang.ClassSet1;

// Java program to demonstrate getName() method
public class Test12 {

    public static void main(String[] args) {
        // returns the Class object associated with Test class
        Class c = Test12.class;

        System.out.print("Class Name associated with c : ");

        // returns the name of the class
        // getName method
        System.out.println(c.getName());
    }
    //output:Class Name associated with c : StringClass.Java.lang.ClassSet1.Test12
}
