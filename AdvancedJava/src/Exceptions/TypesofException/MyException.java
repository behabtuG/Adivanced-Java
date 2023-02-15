package Exceptions.TypesofException;
// Java program to demonstrate user defined exception

// This program throws an exception whenever balance
// amount is below Rs 1000
public class MyException extends Exception {


    //store account information
    private static int accno[] = {1001, 1002, 1003, 1004};

    private static String name[] =
            {"Behabtu", "kidest", "Yoni", "Getnet", "Anteneh"};

    private static double bal[] =
            {10000.00, 12000.00, 5600.0, 999.00, 1100.55};

    // default constructor
    MyException() {
    }

    // parameterized constructor
    MyException(String str) {
        super(str);
    }

    // write main()
    public static void main(String[] args) {
        try {
            // display the heading for the table
            System.out.println("ACCNO" + "\t" + "CUSTOMER" + "\t" + "BALANCE");

            // display the actual account information
            for (int i = 0; i < 5; i++) {
                System.out.println(accno[i] + "\t" + name[i] +
                        "\t" + bal[i]);

                // display own exception if balance < 1000
                if (bal[i] < 1000) {
                    MyException me = new MyException("Balance is less than 1000");
                    throw me;
                }
            }
        } //end of try

        catch (MyException e) {
            e.printStackTrace();
        }
    }

    //Runtime Error
    //
    // MyException: Balance is less than 1000
    //    at MyException.main(fileProperty.java:36)
    //
    //Output:
    //
    //ACCNO    CUSTOMER    BALANCE
    //1001    Behabtu    10000.0
    //1002    kidest    12000.0
    //1003    Yoni    5600.0
    //1004    Getnet    999.0

}
