package Inheritance.Inheritances;

// Java program to illustrate the
// concept of Multilevel inheritance
public class One1 {

    public void print_geek() {
        System.out.println("Geeks");
    }
}

class two1 extends One1 {
    public void print_for() {
        System.out.println("for");
    }
}

class three extends two1 {
    public void print_geek() {
        System.out.println("Geeks");
    }
}

// Drived class
class Main1 {
    public static void main(String[] args) {
        three g = new three();
        g.print_geek();
        g.print_for();
        g.print_geek();
    }
    //output:
    // Geeks
    //for
    //Geeks
}
