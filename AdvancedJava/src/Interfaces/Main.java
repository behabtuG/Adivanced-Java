package Interfaces;

public class Main {
    public static void main(String[] args) {

        //creating an instance of Bicycle doing some operations
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);

        System.out.println("Bicycle present state: ");
        bicycle.printStates();

        //creating instance of the bike.
        Bike bike = new Bike();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrakes(3);

        System.out.println("Bike present state: ");
        bike.printStates();

        //output:
        // Bicycle present state:
        //Speed: 2 gear: 2
        //Bike present state:
        //speed: 1 gear: 1
    }
}
