package Strings.StringBuffer.trimToSize;

// Java program to demonstrate
// the trimToSize() Method.
public class TrimToSize1 {

    public static void main(String[] args) {

        // create a StringBuffer object
        // with a String pass as parameter
        StringBuffer str = new StringBuffer();

        // add more string to StringBuffer
        str.append("GeeksForGeeks classes");

        // print capacity
        System.out.println("Capacity before" + " applying trimToSize() = " + str.capacity());

        // applying trimToSize() Method
        str.trimToSize();

        // print string
        System.out.println("String = " + str.toString());

        // print capacity
        System.out.println("Capacity after " + "applying trimToSize() = " + str.capacity());
    }

    //output:
    //Capacity before applying trimToSize() = 34
    //String = GeeksForGeeks classes
    //Capacity after applying trimToSize() = 21
}
