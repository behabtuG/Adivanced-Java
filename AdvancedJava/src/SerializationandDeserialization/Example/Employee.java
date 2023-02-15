package SerializationandDeserialization.Example;

import java.io.Serializable;

public class Employee implements Serializable {

    String Name;
    int Age;
    String Designation;
    int Salary;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    //public Employee(String name, int age, String designation, int salary) {
    //  Name = name;
    // Age = age;
    //   Designation = designation;
    //   Salary = salary;
    //}
}
