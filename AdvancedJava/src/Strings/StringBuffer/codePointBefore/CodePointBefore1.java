package Strings.StringBuffer.codePointBefore;

// Java program to demonstrate
// exception thrown by codePointBefore() Method.
public class CodePointBefore1 {

    public static void main(String[] args) {

        // create a StringBuffer object
        // with a String pass as parameter
        StringBuffer str = new StringBuffer("GEEKSFORGEEKS");

        try {

            // get unicode of char at position 22
            int unicode = str.codePointBefore(22);
        } catch (Exception e) {

            System.out.println("Exception: " + e);
        }
    }

    //output:Exception: java.lang.StringIndexOutOfBoundsException: String index out of range: 22
}
