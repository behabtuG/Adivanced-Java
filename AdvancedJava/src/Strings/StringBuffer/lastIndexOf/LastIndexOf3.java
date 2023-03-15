package Strings.StringBuffer.lastIndexOf;

// Java program to demonstrate
// the lastIndexOf() Method.
public class LastIndexOf3 {

    public static void main(String[] args) {

        // create a StringBuffer object
        // with a String pass as parameter
        StringBuffer str = new StringBuffer("Geeks for Geeks contribute");

        // print string
        System.out.println("String contains = " + str);

        // get index of string Geeks from index 15
        int index = str.lastIndexOf("contribute", 10);

        // print results
        System.out.println("index of string" + " 'contribute ' = " + index);
    }

    //output:
    //String contains = Geeks for Geeks contribute
    //index of string 'contribute ' = -1
}
