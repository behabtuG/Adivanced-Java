package Strings.StringBuffer;

public class Replace {

    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.replace(1, 3, "Java");
        System.out.println(sb);
    }

    //output:HJavalo

}
