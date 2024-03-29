package Strings.StringBuffer.setLength;

// Java program to demonstrate
// the setLength() Method.
public class GFG {

    public static void main(String[] args) {

        // create a StringBuffer object
        // with a String pass as parameter
        StringBuffer str = new StringBuffer("Tony Stark will die");

        // print string
        System.out.println("String length = " + str.length() + " and contains = \"" + str + "\"");

        // set length equal to 25
        str.setLength(25);

        // print string
        System.out.println("After setLength() String = \"" + str.toString() + "\"");
    }

    //output:
    //String length = 19 and contains = "Tony Stark will die"
    //After setLength() String = "Tony Stark will die      "

}
