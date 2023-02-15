package Methods.Overloading.OverLoading;

// Java program to demonstrate working of method overloading in methods
public class A {

    public int foo(int a) {
        return 10;
    }

    public char foo(int a, int b) {
        return 'a';
    }
}

class Mains {

    public static void main(String args[]) {
        A a = new A();
        System.out.println(a.foo(1));
        System.out.println(a.foo(1, 2));

        //output:
        // 10
        //a
    }

}
