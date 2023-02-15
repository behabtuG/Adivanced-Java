package SerializationandDeserialization.ObjectSerializationwithInheritance.Case3;

import java.io.Serializable;

// superclass A
// implementing Serializable interface
public class A implements Serializable {
    int i;

    // parameterized constructor
    public A(int i) {
        this.i = i;
    }
}
