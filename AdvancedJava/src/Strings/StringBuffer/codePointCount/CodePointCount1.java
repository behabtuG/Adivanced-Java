package Strings.StringBuffer.codePointCount;
// Java program to demonstrate
// the codePointCount() Method.

public class CodePointCount1 {

    public static void main(String[] args) {

        // create a StringBuffer object
        // with a String pass as parameter
        StringBuffer str = new StringBuffer("GeeksForGeeks contribute");

        // print string
        System.out.println("String = " + str.toString());

        // returns the codepoint count
        // from index 3 to 7
        int codepoints = str.codePointCount(13, 17);

        System.out.println("No of Unicode code points" + " between index 13 and 17 = " + codepoints);
    }

    //output:
    //String = GeeksForGeeks contribute
    //No of Unicode code points between index 13 and 17 = 4
}
