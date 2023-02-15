package SerializationandDeserialization.CustomizedSerializationandDeserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustomizedSerializationDemo1 {
    public static void main(String[] args) throws Exception {
        GfgAccount1 gfg_g1 = new GfgAccount1();

        System.out.println("Username :" + gfg_g1.username +
                "	 Password :" + gfg_g1.pwd);

        FileOutputStream fos = new FileOutputStream("abc.ser");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // writeObject() method on Account class will be automatically called by jvm
        oos.writeObject(gfg_g1);

        FileInputStream fis = new FileInputStream("abc.ser");

        ObjectInputStream ois = new ObjectInputStream(fis);

        GfgAccount1 gfg_g2 = (GfgAccount1) ois.readObject();

        System.out.println("Username :" + gfg_g2.username +
                "	 Password :" + gfg_g2.pwd);
    }
}


