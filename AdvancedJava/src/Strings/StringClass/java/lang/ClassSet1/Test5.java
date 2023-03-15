package Strings.StringClass.java.lang.ClassSet1;

// Java program to demonstrate isAssignableFrom() method
public class Test5 extends Thread {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        // returns the Class object for this class
        Class myClass = Class.forName("Test5");

        // returns the Class object for the class
        // with the specified name
        Class c1 = Class.forName("java.lang.Thread");
        Class c2 = Class.forName("java.lang.String");

        // isAssignableFrom method on c1
        // it checks whether Thread class is assignable from Test5
        boolean b1 = c1.isAssignableFrom(myClass);

        // isAssignableFrom method on c2
        // it checks whether String class is assignable from Test5
        boolean b2 = c2.isAssignableFrom(myClass);

        System.out.println("is Thread class Assignable from Test : " + b1);
        System.out.println("is String class Assignable from Test : " + b2);

    }
    //output:
    //is Thread class Assignable from Test : true
    //is String class Assignable from Test : false
}
