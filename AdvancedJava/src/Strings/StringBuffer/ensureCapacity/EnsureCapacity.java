package Strings.StringBuffer.ensureCapacity;

// Java program to demonstrate
// the ensureCapacity() Method.
public class EnsureCapacity {

    public static void main(String[] args) {

        // create a StringBuffer object
        StringBuffer str = new StringBuffer();

        // print string capacity
        System.out.println("Before ensureCapacity " + "method capacity = " + str.capacity());

        // apply ensureCapacity()
        str.ensureCapacity(18);

        // print string capacity
        System.out.println("After ensureCapacity" + " method capacity = " + str.capacity());
    }

    //output:
    //Before ensureCapacity method capacity = 16
    //After ensureCapacity method capacity = 34
}
