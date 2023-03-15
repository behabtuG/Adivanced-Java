package Strings.StringBuffer;

public class Append {

    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Hello ");
        sb.append("Java"); // now original string is changed
        System.out.println(sb);
    }

    //output:Hello Java
}
