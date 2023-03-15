package ObjectClass.JavaisStrictlyPassbyValue;

// A Java program to show that we can change members using
// reference if we do not change the reference itself.

public class Test1 {

    int x;

    Test1(int i) {
        x = i;
    }

    Test1() {
        x = 0;
    }
}

class Main2 {
    public static void main(String[] args) {
        // t is a reference
        Test1 t = new Test1(5);

        // Reference is passed and a copy of reference
        // is created in change()
        change(t);

        // New value of x is printed
        System.out.println(t.x);
    }

    // This change() doesn't change the reference, it only
    // changes member of object referred by reference
    public static void change(Test1 t) {
        t.x = 10;
    }

    //output:10
}
