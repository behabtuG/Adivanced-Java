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
public class RegexExample2 {

    public static void main(String args[]) {
        System.out.println(Pattern.matches(".s", "as"));//true (2nd char is s)  
        System.out.println(Pattern.matches(".s", "mk"));//false (2nd char is not s)  
        System.out.println(Pattern.matches(".s", "mst"));//false (has more than 2 char)  
        System.out.println(Pattern.matches(".s", "amms"));//false (has more than 2 char)  
        System.out.println(Pattern.matches("..s", "mas"));//true (3rd char is s)  
    }
}
