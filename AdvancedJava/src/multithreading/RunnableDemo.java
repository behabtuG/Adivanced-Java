/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *
 * @author glory
 */
public class RunnableDemo implements Runnable {
//Java is a multi-threaded programming language 
//which means we can develop multi-threaded program using Java
  /*  A multi-threaded program contains two or more parts that can run concurrently
     and each part can handle a different task at the same time making optimal use of the available resources 
     specially when your computer has multiple CPUs.
     */
    /*
     multitasking is when multiple processes share common processing resources such as a CPU.
     Multi-threading enables you to write in a way where multiple activities can proceed concurrently in the same program.
     */

    private Thread t;
    private String threadName;

    RunnableDemo(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // Let the thread sleep for a while.
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
