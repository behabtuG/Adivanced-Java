/*'
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegularExpression;

/**
 *
 * @author glory
 */
public class ValidationUsingRegex {

    public static String NAME_REGEX = "^[A-z]{1}[A-Za-z]{6,}$";
    public static String MOBILENUMBER_REGEX = "^[0-9]{1}[0-9]{9}$";
    public static String EMAIL_REGEX = "^[0-9a-zA-z]+[.+-_]{0,1}[0-9a-zA-Z]+[@]+[a-zA-Z]+[.][a-zA-Z]{2,3}([a-zA-Z]{2,3}){0,1}";
    public static String PASSWORD_REGEX = "^[a-zA-Z0-9]{8,}";

    public void validateFirstName() {

    }
}
