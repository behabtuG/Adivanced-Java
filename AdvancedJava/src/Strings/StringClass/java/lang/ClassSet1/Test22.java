package Strings.StringClass.java.lang.ClassSet1;

// Java program to demonstrate getClasses() method
public class Test22 {

    // base interface
    public interface A {
        // methods and constant declarations
    }

    // derived class
    public class B implements A {
        // methods implementations that were declared in A
    }

    public static void main(String[] args) throws ClassNotFoundException {
        // returns the Class object associated with Test class
        Class c1 = Test22.class;

        // getClasses method on c1
        // it returns the array of Class objects containing the all
        // public classes and interfaces represented by Test class
        Class[] c1Classes = c1.getClasses();

        System.out.println("public members of Test class : ");

        // iterating through all public members of Test class
        for (Class class1 : c1Classes) {
            System.out.println(class1);
        }

    }
    //output:
    //public members of Test class :
    //class StringClass.Java.lang.ClassSet1.Test22$B
    //interface StringClass.Java.lang.ClassSet1.Test22$A

}
