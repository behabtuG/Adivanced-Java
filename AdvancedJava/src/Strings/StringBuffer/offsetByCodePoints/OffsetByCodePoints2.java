package Strings.StringBuffer.offsetByCodePoints;

// Java program to demonstrate
// Exception thrown by offsetByCodePoints() Method.
public class OffsetByCodePoints2 {

    public static void main(String[] args) {

        // create a StringBuffer object
        // with a String pass as parameter
        StringBuffer
                str
                = new StringBuffer("India");

        try {

            // returns the index within this sequence
            int returnvalue = str.offsetByCodePoints(2, 9);

            // prints the index
            System.out.println("Index = " + returnvalue);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception: " + e);
        }
    }

    //output:Exception: java.lang.IndexOutOfBoundsException
}
