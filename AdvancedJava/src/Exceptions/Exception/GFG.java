package Exceptions.Exception;

//program to print the exception information using printStackTrace() method
public class GFG {

    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }


        //output:
        //java.lang.ArithmeticException: / by zero
        //at Exceptions.GFG.main(GFG.java:10)
    }
}
