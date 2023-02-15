package SerializationandDeserialization.Example;

import java.io.*;

public class SerializationExample {

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Behabtu Getnet");
        emp.setAge(32);
        emp.setDesignation("Manager");
        emp.setSalary(15000);

        try {
            //serialize the object
            FileOutputStream fos = new FileOutputStream("employee.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(emp);
            oos.close();
            fos.close();
            System.out.println("object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            //Deserialize the object
            FileInputStream fis = new FileInputStream("employee.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Employee emp1 = (Employee) ois.readObject();
            ois.close();
            fis.close();
            System.out.println("Object deserialized successfully");
            System.out.println("Name: " + emp1.getName());
            System.out.println("Age: " + emp1.getAge());
            System.out.println("Designation: " + emp1.getDesignation());
            System.out.println("Salary: " + emp1.getSalary());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
