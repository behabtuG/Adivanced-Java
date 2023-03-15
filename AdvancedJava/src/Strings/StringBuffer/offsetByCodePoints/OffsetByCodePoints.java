package Strings.StringBuffer.offsetByCodePoints;

// Java program to demonstrate
// the offsetByCodePoints() Method.
public class OffsetByCodePoints {

    public static void main(String[] args) {

        // create a StringBuffer object
        // with a String pass as parameter
        StringBuffer str = new StringBuffer("WelcomeGeeks");

        // print string
        System.out.println("String = " + str.toString());

        // returns the index within this sequence
        int returnvalue = str.offsetByCodePoints(1, 4);

        // prints the index
        System.out.println("Index = " + returnvalue);
    }

    //output:
    //String = WelcomeGeeks
    //Index = 5
}
