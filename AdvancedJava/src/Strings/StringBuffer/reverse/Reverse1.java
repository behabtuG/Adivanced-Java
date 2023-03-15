package Strings.StringBuffer.reverse;

// Java program to illustrate the
// java.lang.StringBuffer.reverse()
public class Reverse1 {

    public static void main(String args[]) {
        StringBuffer sbf = new StringBuffer("1 2 3 4 5 6 7 8 9 10");
        System.out.println("String buffer = " + sbf);

        // Here it reverses the string buffer
        sbf.reverse();
        System.out.println("String buffer after reversing = " + sbf);
    }

    //output:
    //String buffer = 1 2 3 4 5 6 7 8 9 10
    //String buffer after reversing = 01 9 8 7 6 5 4 3 2 1
}
