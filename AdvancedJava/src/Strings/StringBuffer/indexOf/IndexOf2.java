package Strings.StringBuffer.indexOf;

// Java program to demonstrate
// the indexOf() Method.
public class IndexOf2 {

    public static void main(String[] args) {
        // create a StringBuffer object
        // with a String pass as parameter
        StringBuffer str = new StringBuffer("GeeksForGeeks");

        // print string
        System.out.println("String: " + str);

        // get index of string Form index 3
        int index = str.indexOf("For", 3);

        // print results
        System.out.println("index of 'For': " + index);
    }

    //output:
    //String: GeeksForGeeks
    //index of 'For': 5
}
