/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllPrograms.RemoveSpacialCharacter;

/**
 *
 * @author Glory
 */
public class GFG {

    static void removeSpacialCharacter(String S) {
        for (int i = 0; i < S.length(); i++) {
            //Finding the character whose ASCII value fall under this range
            if (S.charAt(i) < 'A' || S.charAt(i) > 'Z'
                    && S.charAt(i) < 'a' || S.charAt(i) > 'z') {
                //erase function to erase the character 
                S = S.substring(0, i) + S.substring(i + 1);
                i--;
            }
        }
        System.out.println(S);
    }

    public static void main(String[] args) {
        String S = "$Gee*k;s..fo, r'Ge^eks?";
        removeSpacialCharacter(S);
    }
}
