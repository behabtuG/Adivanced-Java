package Exceptions.TypesofException;

//Java program to demonstrate NullPointerException
public class NullPointer_Demo {

    public static void main(String args[]) {
        try {
            String a = null; //null value
            System.out.println(a.charAt(0));
        } catch (NullPointerException e) {
            System.out.println("NullPointerException..");
        }
    }
    //output:NullPointerException..
}
