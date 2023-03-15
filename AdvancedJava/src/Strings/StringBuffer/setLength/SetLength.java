package Strings.StringBuffer.setLength;

// Java program to demonstrate
// the setLength() Method.
public class SetLength {

    public static void main(String[] args) {
        // create a StringBuffer object
        // with a String pass as parameter
        StringBuffer str = new StringBuffer("WelcomeGeeks");

        // print string
        System.out.println("String length = " + str.length() + " and contains = " + str);

        // set length equal to 10
        str.setLength(10);

        // print string
        System.out.println("After setLength() String = " + str.toString());
    }

    //output:
    //String length = 12 and contains = WelcomeGeeks
    //After setLength() String = WelcomeGee
}
