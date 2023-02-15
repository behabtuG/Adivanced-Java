package Methods.Overriding;

// to demonstrate application of overriding in Java
// Base Class
public class Employee {

    public static int base = 10000;

    int salary() {
        return base;
    }
}

// Inherited class
class Manager extends Employee {
    // This method overrides salary() of Parent
    int salary() {
        return base + 20000;
    }
}

// Inherited class
class Clerk extends Employee {
    // This method overrides salary() of Parent
    int salary() {
        return base + 10000;
    }
}

// Driver class
class Mains {
    // This method can be used to print the salary of any type of employee using base class reference
    static void printSalary(Employee e) {
        System.out.println(e.salary());
    }

    public static void main(String[] args) {
        Employee obj1 = new Manager();

        // We could also get type of employee using one more overridden method.like getType()
        System.out.print("Manager's salary : ");
        printSalary(obj1);

        Employee obj2 = new Clerk();
        System.out.print("Clerk's salary : ");
        printSalary(obj2);

        //output:
        // Manager's salary : 30000
        //Clerk's salary : 20000
    }
}
