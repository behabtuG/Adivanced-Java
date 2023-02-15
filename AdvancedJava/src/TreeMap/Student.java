package TreeMap;

// Java Program to Demonstrate TreeMap using Comparator Constructors.Constructor
// Class 1 Helper class representing Student
public class Student {
    // Attributes of a student
    int roll_no;
    String name, address;

    // Constructors.Constructor
    public Student(int roll_no, String name, String address) {

        // This keyword refers to current object itself
        this.roll_no = roll_no;
        this.name = name;
        this.address = address;
    }

    // Method of this class To print student details
    public String toString() {
        return this.roll_no + " " + this.name + " " + this.address;
    }
}
