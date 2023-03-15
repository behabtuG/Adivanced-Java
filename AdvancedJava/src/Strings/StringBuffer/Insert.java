package Strings.StringBuffer;

public class Insert {

    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Hello ");
        sb.insert(1, "Java");
        // Now original string is changed
        System.out.println(sb);
    }

    //output:HJavaello
}
