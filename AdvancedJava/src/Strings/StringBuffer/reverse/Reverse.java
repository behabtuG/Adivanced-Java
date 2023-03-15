package Strings.StringBuffer.reverse;

// Java program to illustrate the
// java.lang.StringBuffer.reverse()
public class Reverse {

    public static void main(String args[]) {
        StringBuffer sbf = new StringBuffer("Geeksforgeeks!");
        System.out.println("String buffer = " + sbf);

        // Here it reverses the string buffer
        sbf.reverse();
        System.out.println("String buffer after reversing = " + sbf);
    }

    //output:
    //String buffer = Geeksforgeeks!
    //String buffer after reversing = !skeegrofskeeG
}
