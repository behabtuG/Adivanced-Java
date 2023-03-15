package Strings.StringBuffer.delete;

//Program 3: Here the index is negative.
// Java program to illustrate the
//// java.lang.StringBuffer.delete()
public class Geeks1 {

    public static void main(String[] args) {

        StringBuffer sbf = new StringBuffer("Welcome to Geeksforgeeks");
        System.out.println("string buffer = " + sbf);

        sbf.delete(-5, 9);
        System.out.println("After deletion string buffer is = " + sbf);
    }

    //output:
    //string buffer = Welcome to Geeksforgeeks
    //Exception in thread "main" java.lang.StringIndexOutOfBoundsException: start -5, end 9, length 24
    //	at java.base/java.lang.AbstractStringBuilder.checkRangeSIOOBE(AbstractStringBuilder.java:1810)
    //	at java.base/java.lang.AbstractStringBuilder.delete(AbstractStringBuilder.java:917)
    //	at java.base/java.lang.StringBuffer.delete(StringBuffer.java:475)
    //	at Strings.StringBuffer.delete.Geeks1.main(Geeks1.java:13)
}
