package Strings.String;

public class StringStorage {

    public static void main(String args[]) {
        String s1 = "TAT";
        String s2 = "TAT";
        String s3 = new String("TAT");
        String s4 = new String("TAT");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }

    //output:
    //TAT
    //TAT
    //TAT
    //TAT
}
