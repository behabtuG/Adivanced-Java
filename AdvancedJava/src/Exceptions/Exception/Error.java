/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions.Exception;

/**
 *
 * @author glory
 */
public class Error {

    public static void main(String[] arg) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);//error 
        } catch (Exception e) {
            System.out.println("Something went Wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }

    }
}
