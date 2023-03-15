package Strings.StringBuffer.getChars;

import java.util.Arrays;

// Java program to demonstrate
// exception thrown by the getChars() Method.
public class GetChars1 {

    public static void main(String[] args) {

        // create a StringBuffer object
        // with a String pass as parameter
        StringBuffer str = new StringBuffer("Contribute Geeks");

        // create a char Array
        char[] array = new char[10];

        // initialize all character to $(dollar sign).
        Arrays.fill(array, '$');

        try {

            // if start is greater then end
            str.getChars(2, 1, array, 0);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }

    //output:Exception: java.lang.StringIndexOutOfBoundsException: start 2, end 1, length 16
}
