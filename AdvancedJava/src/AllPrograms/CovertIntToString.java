package AllPrograms;

public class CovertIntToString {
    public static void main(String[] args) {

        int a = 10;
        // There are 3 ways to converting Integer to string
        String b = Integer.toString(a);//1st Way
        System.out.println("1st way: " + b);
        String c = String.valueOf(a); //2nd way
        System.out.println("2nd way: " + c);
        String d = String.format("%d", a); //3rd way
        System.out.println("3rd way:" + d);
    }

}
