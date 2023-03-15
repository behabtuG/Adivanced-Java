package Strings.String;

// Construct one string from another
public class GFG1 {

    public static void main(String args[]) {

        char c[] = {'G', 'f', 'g'};

        String s1 = new String(c);
        String s2 = new String(s1);

        System.out.println(s1);
        System.out.println(s2);


    }

    //output:
    //Gfg
    //Gfg

}
