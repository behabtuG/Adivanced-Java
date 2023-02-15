package Modifiers.NonAccess;

public class Counter1 {

    int count;

    synchronized void increment() {
        count++;
    }
}

class GFG908 {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        // Thread 1
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100000; i++) {
                    c.increment();
                }
            }
        });

        // Thread 2
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100000; i++) {
                    c.increment();
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(c.count);
    }

    //output: 163807
}
