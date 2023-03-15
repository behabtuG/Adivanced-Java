package InterfaceCloneable.Markerinterface;

// Java program to illustrate Cloneable interface
// By implementing Cloneable interface
// we make sure that instances of class A
// can be cloned.
public class A implements Cloneable {

    int i;
    String s;

    // A class constructor
    public A(int i, String s) {
        this.i = i;
        this.s = s;
    }

    // Overriding clone() method
    // by simply calling Object class
    // clone() method.
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        A a = new A(20, "GeeksForGeeks");

        // cloning 'a' and holding
        // new cloned object reference in b

        // down-casting as clone() return type is Object
        A b = (A) a.clone();

        System.out.println(b.i);
        System.out.println(b.s);
    }

    //output:
    //20
    //GeeksForGeeks
}
