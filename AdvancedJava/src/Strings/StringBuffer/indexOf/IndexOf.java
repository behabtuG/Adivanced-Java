package Strings.StringBuffer.indexOf;

// Java program to demonstrate
// the indexOf() Method.
public class IndexOf {

    public static void main(String[] args) {
        // create a StringBuffer object
        // with a String pass as parameter
        StringBuffer str = new StringBuffer("GeeksForGeeks");

        // print string
        System.out.println("String: " + str);

        // get index of string For
        int index = str.indexOf("For");

        // print results
        System.out.println("index of 'For': " + index);
    }

    //output:
    //String: GeeksForGeeks
    //index of 'For': 5

}
