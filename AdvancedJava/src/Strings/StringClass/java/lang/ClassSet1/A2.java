package Strings.StringClass.java.lang.ClassSet1;

// Java program to demonstrate getInterfaces() method
// base interface
public interface A2 {

    // methods and constant declarations
}

// derived class
class B1 implements A2 {
    // methods implementations that were declared in A
}

// Driver class
class Test18 {
    public static void main(String[] args)
            throws ClassNotFoundException {
        // returns the Class object for the class
        // with the specified name
        Class c1 = Class.forName("B1");
        Class c2 = Class.forName("java.lang.String");

        // getInterface method on c1
        // it returns the interfaces implemented by B1 class
        Class c1Interfaces[] = c1.getInterfaces();

        // getInterface method on c2
        // returns the interfaces implemented by String class
        Class c2Interfaces[] = c2.getInterfaces();


        System.out.println("interfaces implemented by B1 class : ");

        // iterating through B class interfaces
        for (Class class1 : c1Interfaces) {
            System.out.println(class1);
        }


        System.out.println("interfaces implemented by String class : ");

        // iterating through String class interfaces
        for (Class class1 : c2Interfaces) {
            System.out.println(class1);
        }
    }
//Output:
//interfaces implemented by B class :
//interface A
//interfaces implemented by String class :
//interface java.io.Serializable
//interface java.lang.Comparable
//interface java.lang.CharSequence
}
