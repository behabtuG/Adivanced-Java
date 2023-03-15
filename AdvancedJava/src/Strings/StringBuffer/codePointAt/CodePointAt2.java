package Strings.StringBuffer.codePointAt;

// Java program demonstrate
// IndexOutOfBoundsException thrown by
// the codePointAt() Method.
public class CodePointAt2 {

    public static void main(String[] args) {
        // create a StringBuffer object
        // with a String pass as parameter
        StringBuffer str = new StringBuffer("GeeksForGeeks Contribute");

        try {

            // get char at position 25 which is
            // greater then length
            int i = str.codePointAt(25);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception: " + e);
        }
    }

    //output:Exception: java.lang.StringIndexOutOfBoundsException: index 25, length 24
}
