package AllPrograms;

public class CharArrayToString {
    public static void main(String[] args){
       char ch[] = {'B', 'e', 'h', 'a', 'b', 't', 'u'};
        //There are two ways of converting character array to string
        String s1 = String.valueOf(ch); //1st way
        System.out.println("1St way: "+s1);
        String s2 = new String(ch); //2nd way
        System.out.println("2nd way: "+s2);
    }
}
