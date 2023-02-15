package AllPrograms;

public class CheckPositiveNegative {
    public static void main(String[] args) {
        double number = 233.8;
        if (number > 0.0) {
            System.out.println(number + " is a positive number");
        } else if (number < 0.0) {
            System.out.println(number + " is a negative number");
        } else {
            System.out.println(number + " is zero");
        }
    }

}
