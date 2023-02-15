package Exceptions.TypesofException.OutOfMemoryErrorException;

// Java program to illustrate
// new native thread error
public class GFG1 {


    public static void main(String args[]) throws Exception {
        while (true) {
            new Thread(new Runnable() {
                public void run() {
                    try {
                        Thread.sleep(1000000000);
                    } catch (InterruptedException e) {
                    }
                }
            }).start();
        }
    }
}

