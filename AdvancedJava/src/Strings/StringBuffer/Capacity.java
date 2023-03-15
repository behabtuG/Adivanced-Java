package Strings.StringBuffer;

public class Capacity {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity()); // default 16
        sb.append("Hello");
        System.out.println(sb.capacity()); // now 16
        sb.append("java is my favourite language");
        System.out.println(sb.capacity());
        StringBuffer s = new StringBuffer("GeeksforGeeks");
        System.out.println(s);
        StringBuffer s1 = new StringBuffer(20);
        System.out.println(s1.capacity());
        // Now (16*2)+2=34	 i.e (oldcapacity*2)+2
    }

    //output:
    //16
    //16
    //34
    //GeeksforGeeks
    //20
}
