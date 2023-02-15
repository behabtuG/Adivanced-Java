/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SolidPrinciples.DependencyInversion;

import javax.management.monitor.Monitor;

/**
 *
 * @author glory
 */
public class Windows98Machine {
//The principle of dependency inversion refers to the decoupling of software modules. 
//This way, instead of high-level modules depending on low-level modules, both will depend on abstractions.
/*
     public class Windows98Machine {
     private final StandardKeyboard keyboard;
     private final Monitor monitor;

     public Windows98Machine() {
     monitor = new Monitor();
     keyboard = new StandardKeyboard();
     }

     }
     */

    private final Keyboard keyboard;
    private final Monitor monitor;

    public Windows98Machine(Keyboard keyboard, Monitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }
}
