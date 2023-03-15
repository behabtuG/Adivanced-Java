package Polymorphisms.CompileTime;

// Java program to demonstrate the
// working of operator overloading
public class GFG {

    // function for adding two integers
    void add(int a, int b) {
        int sum = a + b;
        System.out.println(" Addition of two integer :" + sum);
    }

    // function for concatenating two strings
    void add(String s1, String s2) {
        String con_str = s1 + s2;
        System.out.println("Concatenated strings :" + con_str);
    }

    public static void main(String args[]) {
        GFG obj = new GFG();

        // addition of two numbers
        obj.add(10, 10);

        // concatenation of two string
        obj.add("Operator ", " overloading ");
    }

    //output:
    //Addition of two integer :20
    //Concatenated strings :Operator  overloading
}
