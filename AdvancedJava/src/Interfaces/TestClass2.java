package Interfaces;

// A class that implements the interface.
public class TestClass2 implements In2 {

    public static void main(String[] args) {
        TestClass2 t = new TestClass2();
        t.display();

        //output: Hello

        // 2. Another feature that was added in JDK 8 is that we can now define static methods
        // in interfaces that can be called independently without an object. Note: these methods are not inherited.
        In2.display1();

        //output: Hello 2
    }
}
