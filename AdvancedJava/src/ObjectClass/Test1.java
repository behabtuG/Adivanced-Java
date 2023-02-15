package ObjectClass;

// Java program to demonstrate working of finalize()
public class Test1 {

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.hashCode());

        t = null;

        // calling garbage collector
        System.gc();

        System.out.println("end");

        //output:
        // 1705736037
        //finalize method called
        //end
    }

    @Override
    protected void finalize() {
        System.out.println("finalize method called");
    }
}
