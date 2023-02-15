/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegularExpression;

import java.util.regex.*;

/**
 *
 * @author glory
 */
public class RegexExample5 {

    public static void main(String args[]) {
        System.out.println("metacharacters d....");//d means digit System
        System.out.println(Pattern.matches("\\d", "abc"));//false (non-digit)  
        System.out.println(Pattern.matches("\\d", "1"));//true (digit and comes once)  
        System.out.println(Pattern.matches("\\d", "4443"));//false (digit but comes more than once)  
        System.out.println(Pattern.matches("\\d", "323abc"));//false (digit and char)  

        System.out.println("metacharacters D....");//D means non - digit  

        System.out.println(Pattern.matches("\\D", "abc"));//false (non-digit but comes more than once)  
        System.out.println(Pattern.matches("\\D", "1"));//false (digit)  
        System.out.println(Pattern.matches("\\D", "4443"));//false (digit)  
        System.out.println(Pattern.matches("\\D", "323abc"));//false (digit and char)  
        System.out.println(Pattern.matches("\\D", "m"));//true (non-digit and comes once)  

        System.out.println("metacharacters D with quantifier....");
        System.out.println(Pattern.matches("\\D*", "mak"));//true (non-digit and may come 0 or more times)  

    }
}
