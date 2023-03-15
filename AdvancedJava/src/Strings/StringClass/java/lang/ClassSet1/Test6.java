package Strings.StringClass.java.lang.ClassSet1;

// Java program to demonstrate isInterface() method
public class Test6 {

    public static void main(String[] args) throws ClassNotFoundException {
        // returns the Class object for the class
        // with the specified name
        Class c1 = Class.forName("java.lang.String");
        Class c2 = Class.forName("java.lang.Runnable");

        // checking for interface type

        // isInterface method on c1
        boolean b1 = c1.isInterface();

        // is Interface method on c2
        boolean b2 = c2.isInterface();

        System.out.println("is java.lang.String an interface : " + b1);
        System.out.println("is java.lang.Runnable an interface : " + b2);
    }
    //output:
    //is java.lang.String an interface : false
    //is java.lang.Runnable an interface : true
}


