package GarbageCollection;

// Correct code to count number of employees excluding interns.
class Employee1 {

    private int ID;
    private String name;
    private int age;
    private static int nextId = 1;

    // it is made static because it is keep common among all and shared by all objects
    public Employee1(String name, int age) {
        this.name = name;
        this.age = age;
        this.ID = nextId++;
    }

    public void show() {
        System.out.println("Id=" + ID + "\nName=" + name
                + "\nAge=" + age);
    }

    public void showNextId() {
        System.out.println("Next employee id will be="
                + nextId);
    }

    protected void finalize() {
        --nextId;
        // In this case, gc will call finalize() for 2 times for 2 objects.
    }
}

public class UseEmployee1 {
    public static void main(String[] args) {
        Employee1 E = new Employee1("GFG1", 56);
        Employee1 F = new Employee1("GFG2", 45);
        Employee1 G = new Employee1("GFG3", 25);
        E.show();
        F.show();
        G.show();
        E.showNextId();
        F.showNextId();
        G.showNextId();

        {
            // It is sub block to keep all those interns.
            Employee1 X = new Employee1("GFG4", 23);
            Employee1 Y = new Employee1("GFG5", 21);
            X.show();
            Y.show();
            X.showNextId();
            Y.showNextId();
            X = Y = null;
            System.gc();
            System.runFinalization();
        }
        E.showNextId();
    }
}


