package Modifiers.NonAccess;

import java.util.Scanner;

public class Geeks extends Thread {

    boolean running = true;

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

class GFG1234 {
    public static void main(String[] args) {
        Geeks obj = new Geeks();
        obj.start();
        Scanner input = new Scanner(System.in);
        input.nextLine();
        obj.shutDown();
    }
    //output:
    // forGeeks
    // forGeeks
    // forGeeks
    // forGeeks
    // forGeeks
    // forGeeks
    // forGeeks
    // forGeeks
    // forGeeks
    // forGeeks

}
