package ClassObject;

//Initialize by using method/function:
public class GFG {

    // sw=software
    static String sw_name;
    static float sw_price;

    static void set(String n, float p) {
        sw_name = n;
        sw_price = p;
    }

    static void get() {
        System.out.println("Software name is: " + sw_name);
        System.out.println("Software price is: " + sw_price);
    }

    public static void main(String args[]) {
        GFG.set("Java", 0.0f);
        GFG.get();

        //output:
        // Software name is: Java
        //Software price is: 0.0
    }
}

