package Constructors.Constructorss;

public class Geek1 {

    // data members of the class.
    String name;
    int id;

    Geek1(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class GFG1 {
    public static void main(String[] args) {
        // This would invoke the parameterized constructor.
        Geek1 geek1 = new Geek1("avinash", 68);
        System.out.println("GeekName :" + geek1.name + " and GeekId :" + geek1.id);

        //output:GeekName :avinash and GeekId :68
    }
}
