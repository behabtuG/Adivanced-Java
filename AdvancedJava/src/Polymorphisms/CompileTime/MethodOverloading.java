package Polymorphisms.CompileTime;

// Java program to demonstrate the working of method
// overloading by changing the number of parameters
public class MethodOverloading {


    // 1 parameter
    void show(int num1) {
        System.out.println("number 1 : " + num1);
    }

    // 2 parameter
    void show(int num1, int num2) {
        System.out.println("number 1 : " + num1 + " number 2 : " + num2);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();

        // 1st show function
        obj.show(3);

        // 2nd show function
        obj.show(4, 5);
    }

    //output:
    //number 1 : 3
    //number 1 : 4 number 2 : 5
}
