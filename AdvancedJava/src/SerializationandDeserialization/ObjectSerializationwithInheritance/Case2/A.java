package SerializationandDeserialization.ObjectSerializationwithInheritance.Case2;

// superclass A
// A class doesn't implement Serializable interface.
public class A {

    int i;

    // parameterized constructor
    public A(int i) {
        this.i = i;
    }

    // default constructor this constructor must be present otherwise we will get runtime exception
    public A() {
        i = 50;
        System.out.println("A's class constructor called");
    }

}