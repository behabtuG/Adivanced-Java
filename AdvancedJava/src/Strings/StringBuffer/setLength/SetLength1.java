package Strings.StringBuffer.setLength;

// Java program to demonstrate
// Exception thrown by the setLength() Method.
// Example 3: When negative new length is passed:
public class SetLength1 {

    public static void main(String[] args) {

        // create a StringBuffer object
        // with a String pass as parameter
        StringBuffer str = new StringBuffer("Tony Stark");

        try {
            // pass length -15
            str.setLength(-15);
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    //output:
    // java.lang.StringIndexOutOfBoundsException: String index out of range: -15
    //    at java.lang.AbstractStringBuffer.setLength(AbstractStringBuffer.java:207)
    //    at java.lang.StringBuffer.setLength(StringBuffer.java:76)
    //    at GFG.main(File.java:15)
}
