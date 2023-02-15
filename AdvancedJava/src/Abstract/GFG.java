package Abstract;

public abstract class GFG {
    abstract void printInfo();
}

class employee extends GFG {
    void printInfo() {
        String name = "Behabtu";
        int age = 21;
        float salary = 55552.2F;

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);

    }

}

class base {
    public static void main(String args[]) {
        GFG s = new employee();
        s.printInfo();
    }

    //output:
    //Behabtu
    //21
    //55552.2
    // Consider the following java program, that illustrate the use of abstract keyword with classes and methods.
}


