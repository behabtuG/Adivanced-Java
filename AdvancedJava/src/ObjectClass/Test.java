package ObjectClass;

// Java program to demonstrate working of getClass()
public class Test {

    public static void main(String[] args) {
        Object obj = new String("GeeksForGeeks");
        Class c = obj.getClass();
        System.out.println("Class of Object obj is : " + c.getName());

        //output:Class of Object obj is : java.lang.String
    }

}
