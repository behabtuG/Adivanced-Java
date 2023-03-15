package Literals;

// Java program to illustrate the
// application of floating-point literals
public class Test1 {

    public static void main(String[] args) {
        // decimal-form literal
        float a = (float) 101.230;
        // It also acts as decimal literal
        float b = (float) 0123.222;
        // Hexa-decimal form (error)
        // float c = 0x123.222;

        System.out.println(a);
        System.out.println(b);
        // System.out.println(c);
    }
    //output:
    //101.230
    // 123.222
    // Error: malformed floating point literal
}
