package Modifiers.NonAccess;

import java.util.Scanner;

public class Geeks1 extends Thread {

    volatile boolean running = true;

    @Override
    public void run() {
        while (running) {
            System.out.println("GeeksforGeeks");
        }
    }

    public void shutDown() {
        running = false;
    }
}

class GFG343 {
    public static void main(String[] args) {
        Geeks1 obj = new Geeks1();
        obj.start();
        Scanner input = new Scanner(System.in);
        input.nextLine();
        obj.shutDown();
    }

    //output:
    // GeeksforGeeks
    // GeeksforGeeks
    // GeeksforGeeks
    // GeeksforGeeks
    // GeeksforGeeks
    // GeeksforGeeks
    // GeeksforGeeks


}
