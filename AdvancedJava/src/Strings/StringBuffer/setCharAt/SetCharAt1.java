package Strings.StringBuffer.setCharAt;

// Java program to demonstrate
// Exception thrown by the setCharAt() Method.
public class SetCharAt1 {

    public static void main(String[] args) {

        // create a StringBuffer object
        // with a String pass as parameter
        StringBuffer str = new StringBuffer("Geeks for Geeks");

        try {
            str.setCharAt(1, 'T');
            System.out.println(str);
            // pass index -1
            str.setCharAt(-1, 'T');

        } catch (Exception e) {
            System.out.println("Exception:" + e);
        }
    }

    //output:
    // GTeks for Geeks
    // Exception:java.lang.StringIndexOutOfBoundsException: index -1, length 15
}
