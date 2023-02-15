package Abstract.Observation8;

public class Child extends Demo {
    public void m1() {
        System.out.print("Hello");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.m1();

        //output: Hello
    }
}
