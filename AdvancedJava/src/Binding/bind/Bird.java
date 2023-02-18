package Binding.bind;

public class Bird {
    void eat() {
        System.out.println("bird  is eating");
    }
}

class Peacock extends Bird {
    void eat() {
        System.out.println("peacock is eating");
    }

    public static void main(String args[]) {
        Bird b = new Bird();
        b.eat();
       //Explanation :
        //The parent class bird has a method to eat, which prints the bird is eating. The subclass of bird, peacock, extends
        // the parent class bird and overrides the method eat by printing "peacock is eating". In the main method, the object
        // of the bird is created and the method "eat" is called using the reference of the object created.
    }
}