/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceSerialazeble;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author glory
 */
public class SerializeToFile implements Serializable {

    private double height;
    private double width;

    public SerializeToFile(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double Area() {
        return height * width;
    }

    public double Perimeter() {
        return 2 * (height + width);
    }

    public static void SerializeToFile(Object classObject, String fileName) {
        try {
            // Step 1: Open a file output stream to create a file object on disk.
            // This file object will be used to write the serialized bytes of an object
            FileOutputStream fileStream = new FileOutputStream(fileName);

            // Step 2: Create a ObjectOutputStream, this class takes a files stream.
            // This class is responsible for converting the Object of any type into
            // a byte stream
            ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);

            // Step 3: ObjectOutputStream.writeObject method takes an Object and 
            // converts it into a ByteStream. Then it writes the Byte stream into
            // the file using the File stream that we created in step 1.
            objectStream.writeObject(classObject);

            // Step 4: Gracefully close the streams
            objectStream.close();
            fileStream.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(18, 78);
        SerializeToFile(rect, "rectSerialized");

    }

}
