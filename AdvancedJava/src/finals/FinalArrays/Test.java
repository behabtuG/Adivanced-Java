package finals.FinalArrays;

// Program 1
// Main class
public class Test {

    int p = 20;

    public static void main(String args[]) {
        final Test t = new Test();
        t.p = 30;
        System.out.println(t.p);
    }
   //Output: 30
}
