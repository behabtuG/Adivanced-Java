package Strings.StringClass.java.lang.ClassSet1;

// Java program to demonstrate newInstance() method
public class Test3 {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        // returns the Class object for this class
        Class myClass = Class.forName("Test3");

        // creating new instance of this class
        // newInstance method
        Object obj = myClass.newInstance();

        // returns the runtime class of obj
        System.out.println("Class of obj : " + obj.getClass());
    }
    //output: Class of obj : class Test1
}
