package Strings.StringClass.java.lang.ClassSet1;

// Java program to demonstrate isArray method
public class Test8 {

    public static void main(String[] args) {
        int a[] = new int[2];

        // returns the Class object for array class
        Class c1 = a.getClass();

        // returns the Class object for Test class
        Class c2 = Test.class;

        // checking for array type

        // isArray method on c1
        boolean b1 = c1.isArray();

        // is Array method on c2
        boolean b2 = c2.isArray();

        System.out.println("is " + c1.toString() + " an array : " + b1);
        System.out.println("is " + c2.toString() + " an array : " + b2);

    }
    //output:
    //is class [I an array : true
    //is class StringClass.Java.lang.ClassSet1.Test an array : false

}
