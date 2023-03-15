package Constructors.Defaultconstructor;

// Main.java
public class Test {

    int i;
    Test t;
    boolean b;
    byte bt;
    float ft;
}

class Main {
    public static void main(String args[]) {
        Test t = new Test(); // default constructor is called.
        System.out.println(t.i);
        System.out.println(t.t);
        System.out.println(t.b);
        System.out.println(t.bt);
        System.out.println(t.ft);
    }

    //output:
    //0
    //null
    //false
    //0
    //0.0
}
