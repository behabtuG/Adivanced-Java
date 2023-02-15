package Exceptions.throwandthrows;

// Java program to illustrate error in case of unhandled exception
public class Tst {

    public static void main(String[] args) {
        // Thread.sleep(10000); error
        System.out.println("Hello Geeks");

        //output:error: unreported exception InterruptedException; must be caught or declared to be thrown
    }

    // Explanation: In the above program, we are getting compile time error because there is a chance of exception if the main
    // thread is going to sleep, other threads get the chance to execute main() method which will cause InterruptedException.
    class Tst1 {
        public static void main(String[] args) throws InterruptedException {
            Thread.sleep(10000);
            System.out.println("Hello Geeks");
        }
        //output:Hello Geeks
        //Explanation: In the above program,by using throws keyword we handled the InterruptedException and we will get the output as Hello Geeks
    }
}


