package Strings.StringBuffer.appendCodePoint;

// Java program to illustrate appendCodePoint() Method
// of StringBuffer class

public class AppendCode3 {

    // Main driver method
    public static void main(String[] args) {

        // Reading passed string
        StringBuffer sbf
                = new StringBuffer("Geeksforgeeks");

        // Printing string on console
        System.out.println("String buffer = " + sbf);

        // Appending the codePoint as string
        // to the string buffer
        sbf.appendCodePoint(43);

        // Printing the string on console after
        // appending codepoint as string
        System.out.println("After appending CodePoint is = " + sbf);
    }

    //output:
    //String buffer = Geeksforgeeks
    //After appending CodePoint is = Geeksforgeeks+
}
