package Strings.StringClass.java.lang.ClassSet1;

// Java program to demonstrate
// getGenericSuperclass() method
public class Test17 {

    public static void main(String[] args)
            throws ClassNotFoundException {
        // returns the Class object associated with Test class
        Class myClass = Test17.class;

        // returns the Class object for the class
        // with the specified name
        Class c1 = Class.forName("java.util.ArrayList");
        Class c3 = Class.forName("java.lang.Object");

        // getGenericSuperclass method returns the generic
        // superclass of the class represented
        // by this class object

        System.out.print("Test17 superclass : ");

        // getGenericSuperclass method on myClass
        System.out.println(myClass.getGenericSuperclass());

        System.out.print("ArrayList superclass : ");

        // getGenericSuperclass method on c1
        System.out.println(c1.getGenericSuperclass());

        System.out.print("Object superclass : ");

        // getGenericSuperclass method on c3
        System.out.println(c3.getGenericSuperclass());
    }
    //output:
    //Test17 superclass : class java.lang.Object
    //ArrayList superclass : java.util.AbstractList<E>
    //Object superclass : null
}
