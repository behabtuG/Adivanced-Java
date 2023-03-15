package Encapsulation;

public class Name {

    private int age; // Private is using to hide the data

    public int getAge() {
        return age;
    } // getter

    public void setAge(int age) {
        this.age = age;
    } // setter
}

class GFG {
    public static void main(String[] args) {

        Name n1 = new Name();

        n1.setAge(19);

        System.out.println("The age of the person is: " + n1.getAge());
    }
   //output:The age of the person is: 19
}
