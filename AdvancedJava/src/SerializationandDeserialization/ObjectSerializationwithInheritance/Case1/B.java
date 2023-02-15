package SerializationandDeserialization.ObjectSerializationwithInheritance.Case1;


// subclass B
// B class doesn't implement Serializable  interface.
public class B extends A {
    int j;

    // parameterized constructor
    public B(int i, int j) {
        super(i);
        this.j = j;
    }
}
