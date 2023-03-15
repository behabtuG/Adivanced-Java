package Strings.StringBuffer.trimToSize;

// Java program to demonstrate
// the trimToSize() Method.
public class TrimToSize {

    public static void main(String[] args) {

        // create a StringBuffer object
        // with a String pass as parameter
        StringBuffer str = new StringBuffer("GeeksForGeeks");

        // add more string to StringBuffer
        str.append("Contribute");

        // print capacity
        System.out.println("Capacity before " + "applying trimToSize() = " + str.capacity());

        // applying trimToSize() Method
        str.trimToSize();

        // print string
        System.out.println("String = " + str.toString());

        // print capacity
        System.out.println("Capacity after" + " applying trimToSize() = " + str.capacity());
    }

    //output:
    //Capacity before applying trimToSize() = 29
    //String = GeeksForGeeksContribute
    //Capacity after applying trimToSize() = 23
}
