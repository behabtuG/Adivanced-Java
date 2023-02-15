package SerializationandDeserialization.Serializatio;

import java.io.*;

// Java code for serialization and deserialization of a Java object
public class Solution implements Serializable {

    public int a;
    public String b;

    // Default constructor
    public Solution(int a, String b) {
        this.a = a;
        this.b = b;
    }


    public static void main(String[] args) {
        Solution object = new Solution(1, "geeksforgeeks");
        String filename = "file.ser";

        // Serialization
        try {
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            out.writeObject(object);

            out.close();
            file.close();

            System.out.println("Object has been serialized");

        } catch (IOException ex) {
            System.out.println("IOException is caught");
        }


        Solution object1 = null;

        // Deserialization
        try {
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            object1 = (Solution) in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized ");
            System.out.println("a = " + object1.a);
            System.out.println("b = " + object1.b);
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }

        //output:
        //Object has been serialized
        //Object has been deserialized
        //a = 1
        //b = geeksforgeeks
    }


}
