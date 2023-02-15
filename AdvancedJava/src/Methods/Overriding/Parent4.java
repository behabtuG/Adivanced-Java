package Methods.Overriding;

//that overridden method can be called from subclass
// Base Class
public class Parent4 {

    void show() {
        System.out.println("Parent's show()");
    }
}

// Inherited class
class Child4 extends Parent4 {

    // This method overrides show() of Parent
    @Override
    void show() {
        super.show();
        System.out.println("Child's show()");
    }
}

class Main4 {
    public static void main(String[] args) {
        Parent4 obj = new Child4();
        obj.show();

        //output:
        //Parent's show()
        //Child's show()
    }
}


