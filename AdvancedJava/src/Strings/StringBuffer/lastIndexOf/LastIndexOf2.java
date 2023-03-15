package Strings.StringBuffer.lastIndexOf;

// Java program to demonstrate
// the lastIndexOf() Method.
public class LastIndexOf2 {

    public static void main(String[] args) {

        // create a StringBuffer object
        // with a String pass as parameter
        StringBuffer str = new StringBuffer("GeeksForGeeks");

        // print string
        System.out.println("String contains = " + str);

        // get index of string Form index 3
        int index = str.lastIndexOf("For", 8);

        // print results
        System.out.println("index of last occurrence" + " string \"For\" = " + index);
    }

    //output:
    //String contains = GeeksForGeeks
    //index of last occurrence string "For" = 5
}
