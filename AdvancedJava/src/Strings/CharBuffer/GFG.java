package Strings.CharBuffer;

import java.nio.BufferOverflowException;
import java.nio.CharBuffer;
import java.nio.ReadOnlyBufferException;
import java.util.Arrays;

// Java program to demonstrate
// CharBuffer class
public class GFG {

    public static void main(String[] args) {

        // Declaring the capacity of the CharBuffer
        int capacity = 4;

        // Creating the CharBuffer
        try {

            // creating object of CharBuffer
            // and allocating size capacity
            CharBuffer charbuffer = CharBuffer.allocate(capacity);

            // append the value in CharBuffer
            // using append() method
            charbuffer.append('a')
                    .append('b')
                    .append('c')
                    .append('d')
                    .rewind();

            // print the CharBuffer
            System.out.println("Original CharBuffer: " + Arrays.toString(charbuffer.array()));
        } catch (BufferOverflowException e) {

            System.out.println("Exception throws : " + e);
        } catch (ReadOnlyBufferException e) {

            System.out.println("Exception throws : " + e);
        }
    }

    //output:Original CharBuffer: [a, b, c, d]
}
