package Exceptions.Exception;

//program to print the exception information using getMessage() method
public class GFG2 {

    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        //output:/ by zero
    }

}
