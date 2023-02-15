package Methods.Overriding;

// A Java program to demonstrate that final methods cannot be overridden
public class Parent2 {

    // Can't be overridden
    final void show() {
    }
}

class Child2 extends Parent2 {
   /**
    // This would produce error
    void show() {
    }
    */
 //output:
    // 13: error: show() in Child cannot override show() in Parent
    //    void show() {  }
    //         ^
    //  overridden method is final
}


