package SerializationandDeserialization.ObjectSerializationwithInheritance.Case3;

import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

public class B extends A {
    int j;

    // parameterized constructor
    public B(int i, int j) {
        super(i);
        this.j = j;
    }

    // By implementing writeObject method, we can prevent subclass from serialization
    private void writeObject(ObjectOutputStream out) throws IOException {
        throw new NotSerializableException();
    }

    // By implementing readObject method, we can prevent subclass from de-serialization
    private void readObject(ObjectInputStream in) throws IOException {
        throw new NotSerializableException();
    }

}