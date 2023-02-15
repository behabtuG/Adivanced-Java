/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList.ArrayList;

import java.util.ArrayList;

/**
 *
 * @author glory
 */
public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();// Create an ArrayList object
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.get(0));//To access an element in the ArrayList 
        cars.set(0, "Opel");//To modify an element in the ArrayList 
        System.out.println(cars);
        cars.remove(0);
        System.out.println(cars);//To remove an element in Arrayist
        System.out.println(cars.size());//find the size of arrayList

    }
}
