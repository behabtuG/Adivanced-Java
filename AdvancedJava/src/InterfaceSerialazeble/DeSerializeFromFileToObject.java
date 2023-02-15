/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceSerialazeble;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import static InterfaceSerialazeble.SerializeToFile.SerializeToFile;
import java.io.Serializable;

/**
 *
 * @author glory
 */
public class DeSerializeFromFileToObject implements Serializable{

    private double height;
    private double width;

    public DeSerializeFromFileToObject(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double Area() {
        return height * width;
    }

    public double Perimeter() {
        return 2 * (height + width);
    }

    public static Object DeSerializeFromFileToObject(String fileName) {
        try {

            // Step 1: Create a file input stream to read the serialized content
            // of rectangle class from the file
            FileInputStream fileStream = new FileInputStream(new File(fileName));

            // Step 2: Create an object stream from the file stream. So that the content
            // of the file is converted to the Rectangle Object instance
            ObjectInputStream objectStream = new ObjectInputStream(fileStream);

            // Step 3: Read the content of the stream and convert it into object
            Object deserializeObject = objectStream.readObject();

            // Step 4: Close all the resources
            objectStream.close();
            fileStream.close();

            // return the deserialized object
            return deserializeObject;

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(18, 78);
        SerializeToFile(rect, "rectSerialized");
        Rectangle deSerializedRect = (Rectangle) DeSerializeFromFileToObject("rectSerialized");
        System.out.println("Rect area is " + deSerializedRect.Area());
    }
}
