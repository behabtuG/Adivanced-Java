package Strings.StringBuffer.substring;

// Java program to demonstrate
// the substring() Method.
public class SubString2 {

    public static void main(String[] args) {

        // create a StringBuffer object
        // with a String pass as parameter
        StringBuffer str = new StringBuffer("GeeksForGeeks");

        // print string
        System.out.println("String contains = " + str);

        // get substring start from index 5 to index 8
        // using substring() and print results
        System.out.println("SubSequence = " + str.substring(5, 8));
    }

    //output:
    //String contains = GeeksForGeeks
    //SubSequence = For
}
