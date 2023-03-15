package Strings.StringBuffer.codePointBefore;

// Java program to demonstrate
// the codePointBefore() Method.
public class CodePointBefore {

    public static void main(String[] args) {

        // create a StringBuffer object
        // with a String pass as parameter
        StringBuffer str = new StringBuffer("GeeksForGeeks Contribute");

        // get unicode of char at index 13
        // using codePointBefore() method
        int unicode = str.codePointBefore(14);

        // print char and Unicode
        System.out.println("Unicode of character" + " at position 13 = " + unicode);
    }

    //output:Unicode of character at position 13 = 32
}
