package InterfaceCloneable.InterfaceCloneable;

// Java program to Demonstrate the application of Cloneable interface
public class Solution {


    // attributes of Student class
    String name = null;
    int id = 0;

    // default constructor
    Solution() {
    }

    // parameterized constructor
    Solution(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args) {
        // create an instance of Student
        Solution s1 = new Solution("Ashish", 121);

        // Try to clone s1 and assign the new object to s2
        //Solution s2 = s1.clone();
    }

}


