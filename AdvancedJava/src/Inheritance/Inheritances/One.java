package Inheritance.Inheritances;

// Java program to illustrate the
// concept of single inheritance
public class One {

    public void print_geek() {
        System.out.println("Geeks");
    }
}

class two extends One {
    public void print_for() {
        System.out.println("for");
    }
}

// Driver class
class Main {
    public static void main(String[] args) {
        two g = new two();
        g.print_geek();
        g.print_for();
        g.print_geek();
    }
    //output:
    //Geeks
    //for
    //Geeks
}
