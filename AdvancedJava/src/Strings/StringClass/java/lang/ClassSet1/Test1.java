package Strings.StringClass.java.lang.ClassSet1;

// Java program to demonstrate forName() method
public class Test1 {

    public static void main(String[] args) throws ClassNotFoundException {
        // forName method
        // it returns the Class object for the class
        // with the specified name
        Class c = Class.forName("java.lang.String");

        System.out.print("Class represented by c : " + c.toString());
    }
    //output:
    // Class represented by c : class java.lang.String
}

