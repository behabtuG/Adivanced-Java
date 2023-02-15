/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

/**
 *
 * @author glory
 */
public class RunableDemo implements Runnable {
//The Runnable interface should be implemented by any class whose instances are intended to be executed by a thread. The class must define a method of no arguments called run.
//This interface is designed to provide a common protocol for objects that wish to execute code while they are active. For example, Runnable is implemented by class Thread. Being active simply means that a thread has been started and has not yet been stopped.
//In addition, Runnable provides the means for a class to be active while not subclassing Thread. A class that implements Runnable can run without subclassing Thread by instantiating a Thread instance and passing itself in as the target. In most cases, the Runnable interface should be used if you are only planning to override the run() method and no other Thread methods. This is important because classes should not be subclassed unless the programmer intends on modifying or enhancing the fundamental behavior of the class.

    private Thread t;
    private String threadName;

    RunableDemo(String name) {
        threadName = name;
        System.out.println("Creating" + threadName);
    }

    @Override
    public void run() {
        System.out.println("Runing" + threadName);
        try {
            for (int i = 4; i > 0; i++) {
                System.out.println("Thread" + threadName + "," + i);
                //Let thread sleep for a while 
                Thread.sleep(10);
            }

        } catch (InterruptedException e) {
            System.out.println("Thread" + threadName + "Interrupted.");
        }
        System.out.println("Thread" + threadName + "Exiting");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
