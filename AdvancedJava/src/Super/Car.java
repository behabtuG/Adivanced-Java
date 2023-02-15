package Super;

// subclass Car extending vehicle
public class Car extends Vehicle {

    int maxSpeed = 180;

    void display() {
        // print maxSpeed of base class (vehicle)
        System.out.println("Maximum Speed: " + super.maxSpeed);
    }
}

// Driver Program
class Test {
    public static void main(String[] args) {
        Car small = new Car();
        small.display();
    }

    //Output:Maximum Speed: 120
    //In the above example, both base class and subclass have a member maxSpeed. We could access maxSpeed of base class in subclass using
    // super keyword.
}
