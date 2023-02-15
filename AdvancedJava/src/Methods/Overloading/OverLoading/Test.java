package Methods.Overloading.OverLoading;

// A Java program with overloaded main()
public class Test {


    // Normal main()
    public static void main(String[] args) {
        System.out.println("Hi Geek (from main)");
        Test.main("Geek");
    }

    // Overloaded main methods
    public static void main(String arg1) {
        System.out.println("Hi, " + arg1);
        Test.main("Dear Geek", "My Geek");
    }

    public static void main(String arg1, String arg2) {
        System.out.println("Hi, " + arg1 + ", " + arg2);
    }

    //output:
    // Hi Geek (from main)
    //Hi, Geek
    //Hi, Dear Geek, My Geek

}
