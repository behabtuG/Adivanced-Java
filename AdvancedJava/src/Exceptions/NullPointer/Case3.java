package Exceptions.NullPointer;

// A Java program to demonstrate that we can use
// ternary operator to avoid NullPointerException.
public class Case3 {

    public static void main(String[] args) {
        // Initializing String variable with null value
        String str = null;
        String message = (str == null) ? "" :
                str.substring(0, 5);
        System.out.println(message);

        // Initializing String variable with null value
        str = "Geeksforgeeks";
        message = (str == null) ? "" : str.substring(0, 5);
        System.out.println(message);
    }

    //output:Geeks
    //The message variable will be empty if str’s reference is null as in case 1. Otherwise, if str point to actual data,
    //the message will retrieve the first 6 characters of it as in case 2.
}
