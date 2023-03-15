package SignalCode;

import java.util.*;

public class Solution {
    //method to check whether the price is admissible or not
    public static boolean isAdmissibleOverpayment(float[] prices, String[] notes, float x) {
        float updatedPrice = 0;
        for (int i = 0; i < notes.length; i++) {
            //split the notes into each word
            String[] str = notes[i].split(" ");
            float change = 0;
            //if first word is same then do not update the value of change
            if (str[0].equals("Same")) {
                change = 0;
            } else {
                //for higher price
                if (str[1].equals("higher")) {
                    //use split method to find out the percentage
                    String[] temp = str[0].split("%");
                    change = Float.parseFloat(temp[0]);
                }
                //for lower price
                else {
                    String[] temp = str[0].split("%");
                    change = Float.parseFloat(temp[0]);
                    //convert change to negative to show that it's negative in nature
                    change = change * -1;
                }
            }
            //find the updated change for each price
            updatedPrice += prices[i] - ((prices[i] * 100) / (100 + change));
        }
        //check if overall update change is greater than x or not
        if (updatedPrice > x)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        int length;
        //Create an object of Scanner method to take input from user
        Scanner obj = new Scanner(System.in);
        //Input length from user
        System.out.print("Enter the length of price array: ");
        length = obj.nextInt();
        float prices[] = new float[length];
        float x;
        //Input price from user
        for (int i = 0; i < length; i++) {
            System.out.print("Enter the price of " + i + " product: ");
            prices[i] = obj.nextFloat();
        }
        obj.nextLine();
        String[] notes = new String[length];
        //Input notes from user
        for (int i = 0; i < length; i++) {
            System.out.print("Enter the notes of " + i + " product: ");
            notes[i] = obj.nextLine();
        }
        //Input value of x from user
        System.out.print("Enter the value of x: ");
        x = obj.nextFloat();
        //Call isAdmissibleOverpayment method
        boolean val = isAdmissibleOverpayment(prices, notes, x);
        if (val)
            System.out.println("Overprice is admissible");
        else
            System.out.println("Overprice is not admissible");
    }

  //
}


