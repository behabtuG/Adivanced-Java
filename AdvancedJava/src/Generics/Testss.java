package Generics;

// Java program to show working of user defined  Generic functions
public class Testss {


    // A Generic method example
    static <T> void genericDisplay(T element) {
        System.out.println(element.getClass().getName() + " = " + element);
    }

    public static void main(String[] args) {
        // Calling generic method with Integer argument
        genericDisplay(11);

        // Calling generic method with String argument
        genericDisplay("GeeksForGeeks");

        // Calling generic method with double argument
        genericDisplay(1.0);

        //output:
        // java.lang.Integer = 11
        //java.lang.String = GeeksForGeeks
        //java.lang.Double = 1.0
    }

}
