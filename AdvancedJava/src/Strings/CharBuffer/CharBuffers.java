package Strings.CharBuffer;

import java.nio.CharBuffer;
import java.util.Arrays;

// Java program to demonstrate
// CharBuffer class
public class CharBuffers {

    public static void main(String[] args) {

        // Declaring the capacity of the CharBuffer
        char capacity = 10;

        // Creating the CharBuffer

        // creating object of Charbuffer
        // and allocating size capacity
        CharBuffer fb = CharBuffer.allocate(capacity);

        // putting the value in charbuffer
        fb.put('a');
        fb.put(5, 'b');
        fb.put(7, 'c');

        // Printing the CharBuffer
        System.out.println("ChartBuffer: " + Arrays.toString(fb.array()));
    }

    //output:ChartBuffer: [a,  ,  ,  ,  , b,  , c,  ,  ]
}
