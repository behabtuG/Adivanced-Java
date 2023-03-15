package Methods.Default;

// A simple Java program to demonstrate multiple
// inheritance through default methods.
public interface TestInterface3 {


    // default method
    default void show() {
        System.out.println("Default TestInterface1");
    }
}

interface TestInterface4 {
    // Default method
    default void show() {
        System.out.println("Default TestInterface2");
    }
}

// Implementation class code
class TestClass3 implements TestInterface3, TestInterface4 {
    // Overriding default show method
    public void show() {
        // use super keyword to call the show
        // method of TestInterface1 interface
        TestInterface3.super.show();

        // use super keyword to call the show
        // method of TestInterface2 interface
        TestInterface4.super.show();
    }

    public static void main(String args[]) {
        TestClass3 d = new TestClass3();
        d.show();
    }
    //output:
    //Default TestInterface1
    //Default TestInterface2

}
