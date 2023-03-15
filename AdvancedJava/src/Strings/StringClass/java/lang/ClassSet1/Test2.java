package Strings.StringClass.java.lang.ClassSet1;

// Java program to demonstrate forName() method
public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException {
        // returns the Class object for this class
        Class myClass = Class.forName("Test2");

        ClassLoader loader = myClass.getClassLoader();

        // forName method
        // it returns the Class object for the class
        // with the specified name using the given class loader
        Class c = Class.forName("java.lang.String", true, loader);

        System.out.print("Class represented by c : " + c.toString());
    }
    //output: Class represented by c : class java.lang.String
}

