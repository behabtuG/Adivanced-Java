package Strings.StringBuffer.delete;

// Java program to illustrate the
// java.lang.StringBuffer.delete()
public class Geeks {

    public static void main(String[] args) {

        StringBuffer sbf = new StringBuffer("Welcome to Geeksforgeeks");
        System.out.println("string buffer = " + sbf);

        // deleting characters from index 5 to index 9
        sbf.delete(5, 9);
        System.out.println("After deletion string buffer is = " + sbf);
    }

    //output:
    //string buffer = Welcome to Geeksforgeeks
    //After deletion string buffer is = Welcoo Geeksforgeeks
}
