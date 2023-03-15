package Strings.StringBuffer.codePointCount;

// Java program to demonstrate
// exception thrown by the codePointCount() Method.
public class CodePointCount2 {

    public static void main(String[] args) {

        // create a StringBuffer object
        // with a String pass as parameter
        StringBuffer str = new StringBuffer("GeeksForGeeks");

        try {

            // make beginIndex greater than endIndex
            int codepoints = str.codePointCount(2, 0);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }

   //output:Exception: java.lang.IndexOutOfBoundsException
}
