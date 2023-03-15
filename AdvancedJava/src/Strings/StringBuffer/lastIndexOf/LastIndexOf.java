package Strings.StringBuffer.lastIndexOf;

// Java program to demonstrate
// the lastIndexOf() Method.
public class LastIndexOf {

    public static void main(String[] args) {

        // create a StringBuffer object
        // with a String pass as parameter
        StringBuffer str = new StringBuffer("GeeksForGeeks");

        // print string
        System.out.println("String contains = " + str);

        // get index of string For
        int index = str.lastIndexOf("Geeks");

        // print results
        System.out.println("Index of last occurrence" + " string \"Geeks\"= " + index);
    }

    //output:
}
