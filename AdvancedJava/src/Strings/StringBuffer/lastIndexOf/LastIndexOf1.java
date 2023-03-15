package Strings.StringBuffer.lastIndexOf;

// Java program to demonstrate
// the lastIndexOf() Method.
public class LastIndexOf1 {

    public static void main(String[] args) {
        // create a StringBuffer object
        // with a String pass as parameter
        StringBuffer str = new StringBuffer("Geeks for Geeks contribute");

        // print string
        System.out.println("String contains = " + str);

        // get index of string article
        int index = str.lastIndexOf("article");

        // print results
        System.out.println("Index of string" + " 'article' = " + index);
    }

    //outut:
    //String contains = Geeks for Geeks contribute
    //Index of string 'article' = -1
}
