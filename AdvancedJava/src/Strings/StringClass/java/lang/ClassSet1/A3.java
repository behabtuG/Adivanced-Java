package Strings.StringClass.java.lang.ClassSet1;

// Java program to demonstrate cast() method
public class A3 {


// methods and fields
}

class B2 extends A3 {
    // methods and fields
}

// Driver Class
class Test28 {
    public static void main(String[] args) {
        A3 a = new A3();

        System.out.println(a.getClass());

        B2 b = new B2();

        // casting b to a
        // cast method
        a = A3.class.cast(b);

        System.out.println(a.getClass());

    }
    //output:
    //class StringClass.Java.lang.ClassSet1.A3
    //class StringClass.Java.lang.ClassSet1.B2
}
