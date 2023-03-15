package Strings.StringBuffer.indexOf;

// Java program to demonstrate
// the indexOf() Method.
public class IndexOf1 {


    public static void main(String[] args) {
        // create a StringBuffer object
        // with a String pass as parameter
        StringBuffer str = new StringBuffer("Geeks for Geeks contribute");

        // print string
        System.out.println("String: " + str);

        // get index of string article
        int index = str.indexOf("article");

        // print results
        System.out.println("index of 'article': " + index);
    }
    //output:
    //String: Geeks for Geeks contribute
    //index of 'article': -1
}
