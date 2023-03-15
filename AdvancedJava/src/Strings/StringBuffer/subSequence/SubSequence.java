package Strings.StringBuffer.subSequence;

// Java program to demonstrate
// the subSequence() Method.
public class SubSequence {

    public static void main(String[] args) {
        // create a StringBuffer object
        // with a String pass as parameter
        StringBuffer str = new StringBuffer("WelcomeGeeks");

        // print string
        System.out.println("String contains = " + str);

        // get subSequence between index 0 to 7
        // using subSequence() and print
        System.out.println("SubSequence = " + str.subSequence(0, 7));
    }

    //output:
    //String contains = WelcomeGeeks
    //SubSequence = Welcome
}
