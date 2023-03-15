package Strings.StringClass.java.lang.ClassSet1;

// Java program to demonstrate getClassLoader() method
public class Test14 {

    public static void main(String[] args) throws ClassNotFoundException {
        // returns the Class object for this class
        Class myClass = Class.forName("Test14");

        // returns the Class object for the class
        // with the specified name
        Class c1 = Class.forName("java.lang.String");

        // returns the Class object for primitive int
        Class c2 = int.class;

        System.out.print("Test class loader : ");

        // getting the class loader for Test class
        // getClassLoader method on myClass
        System.out.println(myClass.getClassLoader());

        System.out.print("String class loader : ");

        // getting the class loader for String class
        // we will get null as String class is loaded
        // by BootStrap class loader
        // getClassLoader method on c1
        System.out.println(c1.getClassLoader());

        System.out.print("primitive int loader : ");

        // getting the class loader for primitive int
        // getClassLoader method on c2
        System.out.println(c2.getClassLoader());
    }
    // Output:
    // Test14 class loader : sun.misc.Launcher$AppClassLoader@73d16e93
    // String class loader : null
    // primitive int loader : null

}
