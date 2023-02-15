package Exceptions.TypesofException;

// Java program to demonstrate ArrayIndexOutOfBoundException
public class ArrayIndexOutOfBound_Demo {

    public static void main(String args[]) {
        try {
            int a[] = new int[5];
            a[6] = 9; // accessing 7th element in an array of
            // size 5
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index is Out Of Bounds");
        }
    }
    //output:Array Index is Out Of Bounds
}

