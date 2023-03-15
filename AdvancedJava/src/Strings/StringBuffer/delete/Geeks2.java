package Strings.StringBuffer.delete;

//Program 4: Here the index is not present.
// Java program to illustrate the
//// java.lang.StringBuffer.delete()
public class Geeks2 {


    public static void main(String[] args) {

        StringBuffer sbf = new StringBuffer("Welcome to Geeksforgeeks");
        System.out.println("string buffer = " + sbf);

        sbf.delete(99, 109);
        System.out.println("After deletion string buffer is = " + sbf);
    }

    //output:
    //string buffer = Welcome to Geeksforgeeks
    //Exception in thread "main" java.lang.StringIndexOutOfBoundsException: start 99, end 24, length 24
    //	at java.base/java.lang.AbstractStringBuilder.checkRangeSIOOBE(AbstractStringBuilder.java:1810)
    //	at java.base/java.lang.AbstractStringBuilder.delete(AbstractStringBuilder.java:917)
    //	at java.base/java.lang.StringBuffer.delete(StringBuffer.java:475)
    //	at Strings.StringBuffer.delete.Geeks2.main(Geeks2.java:14)
}
