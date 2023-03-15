package Strings.StringBuffer.setCharAt;

// Java program to demonstrate
// the setCharAt() Method.
public class SetCharAt {

    public static void main(String[] args) {

        // create a StringBuffer object
        // with a String pass as parameter
        StringBuffer str = new StringBuffer("Geeks For Geeks");
        // print string
        System.out.println("String = " + str.toString());

        // set char at index 4 to '0'
        str.setCharAt(7, '0');

        // print string
        System.out.println("After setCharAt() String = " + str.toString());
    }

    //output:
    //String = Geeks For Geeks
    //After setCharAt() String = Geeks F0r Geeks
}
