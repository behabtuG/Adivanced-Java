package Thread.multithreading;

// Java code for thread creation by implementing
// the Runnable Interface
public class MultithreadingDemo1 implements Runnable {

    public void run() {
        try {
            // Displaying the thread that is running
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}

// Main Class
class Multithread1 {
    public static void main(String[] args) {
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            Thread object = new Thread(new MultithreadingDemo());
            object.start();
        }
    }

    //output:
    //Thread 31 is running
    //Thread 23 is running
    //Thread 25 is running
    //Thread 17 is running
    //Thread 29 is running
    //Thread 21 is running
    //Thread 19 is running
    //Thread 27 is running
}
