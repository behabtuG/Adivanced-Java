package Constructors.TheInitializerBlock;

// Java Program to Illustrate Initializer Block
public class Car {

    // Class member variable
    int speed;

    // Constructor
    Car() {
        // Print statement when constructor is called
        System.out.println("Speed of Car: " + speed);
    }

    // Block
    {
        speed = 60;
    }

    // Class member method
    public static void main(String[] args) {

        Car obj = new Car();

    //output:Speed of Car: 60
    }
}
