/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SolidPrinciples.SingleResponsibility;

/**
 *
 * @author glory
 */
//SOLID principles form the fundamental guidelines for building object-oriented applications that are 
//robust, extensible, and maintainable.
public class BookPrinter {//every Java class must perform a single functionality.
    //One class should have one and only one responsibility

    // methods for outputting text
    void printTextToConsole(String text) {
        //our code for formatting and printing the text
    }

    void printTextToAnotherMedium(String text) {
        // code for writing to any other location..
    }
}
