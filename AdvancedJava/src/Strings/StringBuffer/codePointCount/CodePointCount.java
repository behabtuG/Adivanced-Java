package Strings.StringBuffer.codePointCount;

// Java program to demonstrate
// the codePointCount() Method.
public class CodePointCount {

    public static void main(String[] args) {

        // create a StringBuffer object
        // with a String pass as parameter
        StringBuffer str = new StringBuffer("Welcome to GeeksforGeeks");

        // print string
        System.out.println("String = " + str.toString());

        // returns the codepoint count from index 4 to 10
        int codepoints = str.codePointCount(4, 10);

        System.out.println("No of Unicode code points " + " between index 4 and index 10 = " + +codepoints);
    }

    //output:
    //String = Welcome to GeeksforGeeks
    //No of Unicode code points  between index 4 and index 10 = 6
}
