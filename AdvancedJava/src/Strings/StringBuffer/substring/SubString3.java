package Strings.StringBuffer.substring;

// Java program to demonstrate
// Exception thrown by the substring() Method.
//Example 2: To demonstrate StringIndexOutOfBoundsException
public class SubString3 {

    public static void main(String[] args) {

        // create a StringBuffer object
        // with a String pass as parameter
        StringBuffer str = new StringBuffer("Indian Team Played Well");

        try {
            // get substring starts from index 7
            // and end at index 3
            // using substring() and print
            str.substring(9, 3);
        } catch (Exception e) {

            System.out.println("Exception: " + e);
        }
    }

    //output:Exception: java.lang.StringIndexOutOfBoundsException: start 9, end 3, length 23
}
