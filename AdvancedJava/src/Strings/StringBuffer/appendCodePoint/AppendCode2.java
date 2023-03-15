package Strings.StringBuffer.appendCodePoint;
// Java Program to Illustrate appendCodePoint() Method
// of StringBuffer class

public class AppendCode2 {

    // Main driver method
    public static void main(String[] args) {

        // Reading passed string by creating object of class
        StringBuffer sbf = new StringBuffer("Geeksforgeeks");


        System.out.println("String buffer = " + sbf);

        // Here it appends the CodePoint as
        // string to the string buffer
        sbf.appendCodePoint(54);

        System.out.println("After appending CodePoint is = " + sbf);
    }

    //output:
    //String buffer = Geeksforgeeks
    //After appending CodePoint is = Geeksforgeeks6
}
