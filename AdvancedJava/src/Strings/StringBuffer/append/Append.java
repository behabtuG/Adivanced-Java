package Strings.StringBuffer.append;

// Java program to illustrate the
// StringBuffer append(boolean a)
public class Append {

    public static void main(String[] args) {

        StringBuffer sbf1 = new StringBuffer("We are geeks and its really ");
        System.out.println("Input: " + sbf1);

        // Appending the boolean value
        sbf1.append(true);
        System.out.println("Output: " + sbf1);

        System.out.println();

        StringBuffer sbf2 = new StringBuffer("We are lost - ");
        System.out.println("Input: " + sbf2);

        // Appending the boolean value
        sbf2.append(false);
        System.out.println("Output: " + sbf2);
    }

    //output:
    //Input: We are geeks and its really
    //Output: We are geeks and its really true
    //
    //Input: We are lost -
    //Output: We are lost - false
}
