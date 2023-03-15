package Strings.StringBuffer.substring;

// Java program to demonstrate
// Exception thrown by the substring() Method.
//Example 2: To demonstrate StringIndexOutOfBoundsException
public class SubString1 {

    public static void main(String[] args) {

        // create a StringBuffer object
        // with a String pass as parameter
        StringBuffer str = new StringBuffer("Indian Team Played Well");

        try {
            // get substring starts from index -7
            // using substring() and print
            str.substring(-7);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }

    //output:Exception: java.lang.StringIndexOutOfBoundsException: start -7, end 23, length 23

}
