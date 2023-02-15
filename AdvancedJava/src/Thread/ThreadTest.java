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
public class ThreadTest {

    public static void main(String[] args) {
        RunableDemo R1 = new RunableDemo("Thread-1");
        R1.start();
        RunableDemo R2 = new RunableDemo("Thread-2");
        R2.start();
    }
}
