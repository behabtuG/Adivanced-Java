package Constructors.ConstructorChaining;

public class Temp3 {

    // block to be executed first
    {
        System.out.println("init");
    }

    Temp3() {
        System.out.println("default");
    }

    Temp3(int x) {
        System.out.println(x);
    }

    // block to be executed after the first block which has been defined above.
    {
        System.out.println("second");
    }

    public static void main(String args[]) {
        new Temp3();
        new Temp3(10);

        //output:
        //init
        //second
        //default
        //init
        //second
        //10
    }
}

