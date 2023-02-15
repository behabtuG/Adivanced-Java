package SerializationandDeserialization.ObjectSerializationwithInheritance.Case1;

import java.io.Serializable;

// superclass A implementing Serializable interface
public class A implements Serializable {

    int i;

    // parameterized constructor
    public A(int i) {
        this.i = i;
    }
}
