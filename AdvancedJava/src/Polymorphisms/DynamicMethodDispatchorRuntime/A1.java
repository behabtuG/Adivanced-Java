package Polymorphisms.DynamicMethodDispatchorRuntime;

// Java program to illustrate the fact that
// runtime polymorphism cannot be achieved
// by data members

// class A
public class A1 {

    int x = 10;
}

// class B
class B1 extends A1 {
    int x = 20;
}

// Driver class
class Test {
    public static void main(String args[]) {
        A1 a = new B1(); // object of type B

        // Data member of class A will be accessed
        System.out.println(a.x);
    }
    //output:10
}
