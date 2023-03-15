package Strings.String;

//Construct String from subset of char array
public class GFG {

    public static void main(String args[]) {
        byte ascii[] = {71, 70, 71};
        byte country[] = {69, 84, 72, 73, 79, 80, 73, 65};
        String s1 = new String(ascii);
        System.out.println(s1);

        String s2 = new String(ascii, 1, 2);
        System.out.println(s2);

        String s3 = new String(country);
        System.out.println(s3);
    }

    //output:
    //GFG
    //FG
    //ETHIOPIA
}
