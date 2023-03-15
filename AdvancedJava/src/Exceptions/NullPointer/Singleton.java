package Exceptions.NullPointer;

import java.util.UUID;

// To use randomUUID function.
public class Singleton {

    // Initializing values of single and ID to null.
    private static Singleton single = null;
    private String ID = null;

    private Singleton() {
		/* Make it private, in order to prevent the
		creation of new instances of the Singleton
		class. */

        // Create a random ID
        ID = UUID.randomUUID().toString();
    }

    public static Singleton getInstance() {
        if (single == null)
            single = new Singleton();
        return single;
    }

    public String getID() {
        return this.ID;
    }
}

// Driver Code
class TestSingleton {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        System.out.println(s.getID());
    }

    //output: 1f56543d-82e1-41a5-b7ab-1b9ddad5de6f

}
