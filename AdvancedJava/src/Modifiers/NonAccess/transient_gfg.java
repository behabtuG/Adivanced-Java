package Modifiers.NonAccess;

import java.io.*;

public class transient_gfg implements Serializable {

    // normal variable
    int a = 10;

    // Transient variables
    transient String UserID = "admin";
    transient String Password = "tiger123";

}

class GFG78 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        transient_gfg obj = new transient_gfg();

        // printing the value of transient
        // variable before serialization process
        System.out.println("UserID :" + obj.UserID);
        System.out.println("Password: " + obj.Password);
        System.out.println("a = " + obj.a);

        // serialization
        FileOutputStream fos = new FileOutputStream("abc.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);

        // de-serialization
        FileInputStream fis = new FileInputStream("abc.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        transient_gfg output = (transient_gfg) ois.readObject();

        // printing the value of transient
        // variable after de-serialization process
        System.out.println("UserID :" + output.UserID);
        System.out.println("Password: " + output.Password);
        System.out.println("a = " + obj.a);

    }

    //output:
    //UserID :admin
    //Password: tiger123
    //a = 10
    //UserID :null
    //Password: null
    //a = 10

}
