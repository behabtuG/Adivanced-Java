package Strings.StringBuffer.offsetByCodePoints;

// Java program to demonstrate
// the offsetByCodePoints() Method.
public class OffsetByCodePoints1 {

    public static void main(String[] args) {

        // create a StringBuffer object
        // with a String pass as parameter
        StringBuffer str = new StringBuffer("India Is great");

        // print string
        System.out.println("String = " + str.toString());

        // returns the index within this sequence
        int returnvalue = str.offsetByCodePoints(2, 9);

        // prints the index
        System.out.println("Index = " + returnvalue);
    }

    //output:
    //String = India Is great
    //Index = 11
}
