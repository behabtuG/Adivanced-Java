package Strings.StringBuffer.ensureCapacity;

// Java program to demonstrate
// the ensureCapacity() Method.
public class EnsureCapacity2 {

    public static void main(String[] args) {

        // create a StringBuffer object
        StringBuffer str = new StringBuffer("Geeks For Geeks");

        // print string capacity
        System.out.println("Before ensureCapacity " + "method capacity = " + str.capacity());

        // apply ensureCapacity()
        str.ensureCapacity(42);

        // print string capacity
        System.out.println("After ensureCapacity" + " method capacity = " + str.capacity());
    }

    //output:
    //Before ensureCapacity method capacity = 31
    //After ensureCapacity method capacity = 64
}
