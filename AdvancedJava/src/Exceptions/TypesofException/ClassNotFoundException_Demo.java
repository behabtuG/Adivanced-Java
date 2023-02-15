package Exceptions.TypesofException;

// Java program to demonstrate ClassNotFoundException
public class ClassNotFoundException_Demo {


    public static void main(String[] args) {
        try {
            Class.forName("Class1"); // Class1 is not defined
        } catch (ClassNotFoundException e) {
            System.out.println(e);
            System.out.println("Class Not Found...");
        }
    }

    //output:
    //java.lang.ClassNotFoundException: Class1
    //Class Not Found...

}
