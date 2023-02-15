package SerializationandDeserialization.CustomizedSerializationandDeserialization;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class GfgAccount1 implements Serializable {

    String username = "gfg_admin";

    transient String pwd = "geeks";

    // Performing customized serialization using the below two methods:
    // this method is executed by jvm when writeObject() on
    // Account object reference in main method is
    // executed by jvm.
    private void writeObject(ObjectOutputStream oos) throws Exception {
        // to perform default serialization of Account object.
        oos.defaultWriteObject();

        // epwd (encrypted password)
        String epwd = "123" + pwd;

        // writing encrypted password to the file
        oos.writeObject(epwd);
    }

    // this method is executed by jvm when readObject() on
    // Account object reference in main method is executed by jvm.
    private void readObject(ObjectInputStream ois) throws Exception {
        // performing default deserialization of Account object
        ois.defaultReadObject();

        // deserializing the encrypted password from the file
        String epwd = (String) ois.readObject();

        // decrypting it and saving it to the original password
        // string starting from 3rd index till the last index
        pwd = epwd.substring(3);
    }
}

