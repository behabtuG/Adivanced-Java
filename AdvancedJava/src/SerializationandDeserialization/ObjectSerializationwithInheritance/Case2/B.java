package SerializationandDeserialization.ObjectSerializationwithInheritance.Case2;

import java.io.Serializable;

// subclass B
// implementing Serializable interface
public class B extends A implements Serializable {
    int j;

    // parameterized constructor
    public B(int i, int j) {
        super(i);
        this.j = j;
    }
}
