package Methods.Overloading.OverLoading;

// Java Program to Illustrate Method Overloading By changing the Order of the Parameters
// Class 1 Helper class
public class Student {

    // Method 1
    public void StudentId(String name, int roll_no) {
        System.out.println("Name :" + name + " " + "Roll-No :" + roll_no);
    }

    // Method 2
    public void StudentId(int roll_no, String name) {
        // Again printing name and id of person
        System.out.println("Roll-No :" + roll_no + " " + "Name :" + name);
    }
}

// Class 2
class GFG2 {
    public static void main(String[] args) {

        // Creating object of above class
        Student obj = new Student();

        // Passing name and id
        // Note: Reversing order
        obj.StudentId("Kidest", 1);
        obj.StudentId(2, "Behabtu");

        //output:
        // Name :Kidest Roll-No :1
        //Roll-No :2 Name :Behabtu
    }
}


