package AllPrograms;

public class CharToString {
    public static void main(String[] args){
        char c = 'a';
        // There are to ways of converting character to string
        String s1 = Character.toString(c); //1st Way
        System.out.println("The String 1:"+s1);
        String s2 =String.valueOf(c);//2nd way
        System.out.println("The String 2: "+s2 );
    }
}
