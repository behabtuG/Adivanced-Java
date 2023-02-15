package Interfaces;

// Java program to show that interfaces can have methods from JDK 1.8 onwards
public interface In2 {
   final int a = 10;
   default void display(){
       System.out.println("Hello");
   }

   static void display1(){
       System.out.println("Hello 2");
   }
}
