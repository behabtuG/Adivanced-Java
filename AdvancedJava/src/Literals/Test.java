package Literals;

// Java program to illustrate the
// application of Integer literals
public class Test {

    public static void main(String[] args) {
        // decimal-form literal
        int a = 101;
        // octal-form literal
        int b = 0100;
        // Hexa-decimal form literal
        int c = 0xFace;
        // Binary literal
        int d = 0b1111;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

    //output:
    //101
    //64
    //64206
    //15
}
