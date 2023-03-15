package Strings.StringClass.java.lang.ClassSet1;

// base class
public class A1 {
    // Java program to demonstrate getSuperclass() method


    // methods and fields
}

// derived class
class B extends A1 {

}

// Driver class
class Test16 {
    public static void main(String[] args) throws ClassNotFoundException {
        // returns the Class object associated with Test class
        Class myClass = Test16.class;

        // returns the Class object for the class
        // with the specified name
        Class c1 = Class.forName("A");
        Class c2 = Class.forName("B");
        Class c3 = Class.forName("java.lang.Object");

        // getSuperclass method returns the superclass of the class represented
        // by this class object

        System.out.print("Test superclass : ");

        // getSuperclass method on myClass
        System.out.println(myClass.getSuperclass());

        System.out.print("A superclass : ");

        // getSuperclass method on c1
        System.out.println(c1.getSuperclass());

        System.out.print("B superclass : ");

        // getSuperclass method on c2
        System.out.println(c2.getSuperclass());

        System.out.print("Object superclass : ");

        // getSuperclass method on c3
        System.out.println(c3.getSuperclass());
    }
//Output:
//Test superclass : class java.lang.Object
//A superclass : class java.lang.Object
//B superclass : class A
//Object superclass : null
}
