package InterfaceCloneable.Markerinterface;

import java.io.*;

// Java program to illustrate Serializable interface
// By implementing Serializable interface
// we make sure that state of instances of class A
// can be saved in a file.
public class A1 implements Serializable {

    int i;
    String s;

    // A class constructor
    public A1(int i, String s) {
        this.i = i;
        this.s = s;
    }
}

class Test1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        A1 a = new A1(20, "GeeksForGeeks");

        // Serializing 'a'
        FileOutputStream fos = new FileOutputStream("xyz.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a);

        // De-serializing 'a'
        FileInputStream fis = new FileInputStream("xyz.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        A1 b = (A1) ois.readObject();//down-casting object

        System.out.println(b.i + " " + b.s);

        // closing streams
        oos.close();
        ois.close();
    }

    //output:20 GeeksForGeeks
}
