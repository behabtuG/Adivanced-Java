package Strings.StringBuffer.indexOf;

// Java program to demonstrate
// the indexOf() Method.
public class IndexOf3 {

    public static void main(String[] args) {
        // create a StringBuffer object
        // with a String pass as parameter
        StringBuffer str = new StringBuffer("Geeks for Geeks contribute");

        // print string
        System.out.println("String: " + str);

        // get index of string Geeks from index 15
        int index = str.indexOf("Geeks", 15);

        // print results
        System.out.println("index of 'Geeks ': " + index);
    }

    //output:
    //String: Geeks for Geeks contribute
    //index of 'Geeks ': -1
}
