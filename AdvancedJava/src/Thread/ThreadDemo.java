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
public class ThreadDemo extends Thread {

    private Thread t;
    private String threadName;

    ThreadDemo(String name) {// contractor
        threadName = name;
        System.out.println("Creating" + threadName);
    }

    @Override
    public void run() { // if this thread object was instantiated using a separate runnable tagrget,
        //the run method is invoked on thatrunnable object.
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

    public void start() {//Starts the thread in a separate path of excution, 
        //then invokes the run method on this thread object  
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }

}
