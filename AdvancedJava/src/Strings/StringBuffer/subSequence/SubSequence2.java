package Strings.StringBuffer.subSequence;

// Java program to demonstrate
// Exception thrown by the subSequence() Method.
//Example 3: When start > end:
public class SubSequence2 {

    public static void main(String[] args) {
        // create a StringBuffer object
        // with a String pass as parameter
        StringBuffer str = new StringBuffer("Indian Team Played Well");

        try {
            // get subSequence between index 0 to 7
            // using subSequence() and print
            System.out.println(str.subSequence(19, 18));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //output:
    //java.lang.StringIndexOutOfBoundsException: start 19, end 18, length 23
    //	at java.base/java.lang.AbstractStringBuilder.checkRangeSIOOBE(AbstractStringBuilder.java:1810)
    //	at java.base/java.lang.AbstractStringBuilder.substring(AbstractStringBuilder.java:1070)
    //	at java.base/java.lang.StringBuffer.subSequence(StringBuffer.java:516)
    //	at Strings.StringBuffer.subSequence.SubSequence2.main(SubSequence2.java:16)
}
