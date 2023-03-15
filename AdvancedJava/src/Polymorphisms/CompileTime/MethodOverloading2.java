package Polymorphisms.CompileTime;

// Java program to demonstrate the working of method
// overloading by changing the sequence of parameters
public class MethodOverloading2 {

    // arguments of this function are of int and char type
    static void show(int a, char ch) {
        System.out.println("integer : " + a + " and character : " + ch);
    }

    // argument of this function are of char and int type
    static void show(char ch, int a) {
        System.out.println("character : " + ch + " and integer : " + a);
    }

    public static void main(String[] args) {
        // 1st show function
        show(6, 'G');

        // 2nd show function
        show('G', 7);
    }

    //output:
    //integer : 6 and character : G
    //character : G and integer : 7

}
