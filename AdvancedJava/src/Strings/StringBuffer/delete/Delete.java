package Strings.StringBuffer.delete;

// Java program to illustrate the
// java.lang.StringBuffer.delete()
public class Delete {

    public static void main(String[] args) {

        StringBuffer sbf = new StringBuffer("Geeksforgeeks");
        System.out.println("string buffer = " + sbf);

        // Deleting characters from index 2 to 7
        sbf.delete(6, 8);
        System.out.println("After deletion string buffer is = " + sbf);
    }

    //output:
    //string buffer = Geeksforgeeks
    //After deletion string buffer is = Geeksfgeeks
}
