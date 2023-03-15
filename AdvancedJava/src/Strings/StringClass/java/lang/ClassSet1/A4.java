package Strings.StringClass.java.lang.ClassSet1;

// Java program to demonstrate asSubclass() method
public class A4 {
// methods and fields
}

class B3 extends A4 {
    // methods and fields
}

// Driver Class
class Test29 {
    public static void main(String[] args) {
        A4 a = new A4();

        // returns the Class object for super class(A)
        Class superClass = a.getClass();

        B3 b = new B3();

        // returns the Class object for subclass(B)
        Class subClass = b.getClass();

        // asSubclass method
        // it represents a subclass of the specified class object
        Class cast = subClass.asSubclass(superClass);

        System.out.println(cast);

    }
    //output:class StringClass.Java.lang.ClassSet1.B3
}
