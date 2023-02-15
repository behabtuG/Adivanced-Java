/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegularExpression;

import java.util.regex.Pattern;

/**
 *
 * @author glory
 */
/*Create a regular expression that accepts 10 digit numeric characters 
 starting with 7, 8 or 9 only.*/
public class RegexExample7 {

    public static void main(String args[]) {
        System.out.println("by character classes and quantifiers ...");
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));//true  
        System.out.println(Pattern.matches("[789][0-9]{9}", "9953038949"));//true  

        System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490"));//false (11 characters)  
        System.out.println(Pattern.matches("[789][0-9]{9}", "6953038949"));//false (starts from 6)  
        System.out.println(Pattern.matches("[789][0-9]{9}", "8853038949"));//true  

        System.out.println("by metacharacters ...");
        System.out.println(Pattern.matches("[789]{1}\\d{9}", "8853038949"));//true  
        System.out.println(Pattern.matches("[789]{1}\\d{9}", "3853038949"));//false (starts from 3)  

    }
}
