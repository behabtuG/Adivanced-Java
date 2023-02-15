/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author glory
 */
//Program to count number of times
//cup appears in a string

public class RegexDemo2 {

    public static void main(String[] args) {
        String text = "This is blue cup. I need red cup";
        String regex = "\\bcup\\b";

        Pattern pt = Pattern.compile(regex);
        Matcher mt = pt.matcher(text);

        int count = 0;
        while (mt.find()) {
            count = count + 1;
            System.out.println("Start index: " + mt.start());
            System.out.println("End index: " + mt.end());
            System.out.println("------------------------");
        }
        System.out.println("Total count: " + count);
    }
}
