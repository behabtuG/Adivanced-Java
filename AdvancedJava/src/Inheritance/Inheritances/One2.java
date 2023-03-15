package Inheritance.Inheritances;

// Java program to illustrate the
// concept of Multiple inheritance
interface One2 {

    public void print_geek();
}

interface two2 {
    public void print_for();
}

interface three2 extends One2, two2 {
    public void print_geek();
}

class child implements three2 {
    @Override
    public void print_geek() {
        System.out.println("Geeks");
    }

    public void print_for() {
        System.out.println("for");
    }
}

// Drived class
class Main2 {
    public static void main(String[] args) {
        child c = new child();
        c.print_geek();
        c.print_for();
        c.print_geek();
    }
    //output:
    //Geeks
    //for
    //Geeks
}
