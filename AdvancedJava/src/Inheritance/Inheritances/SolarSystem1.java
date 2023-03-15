package Inheritance.Inheritances;

public class SolarSystem1 {
}

class Earth1 extends SolarSystem1 {
}

class Mars1 extends SolarSystem1 {
}

class Moon1 extends Earth1 {
    public static void main(String args[]) {
        SolarSystem1 s = new SolarSystem1();
        Earth1 e = new Earth1();
        Mars1 m = new Mars1();

        System.out.println(s instanceof SolarSystem1);
        System.out.println(e instanceof Earth1);
        System.out.println(m instanceof SolarSystem1);
    }
    //output:
    //true
    //true
    //true

}
