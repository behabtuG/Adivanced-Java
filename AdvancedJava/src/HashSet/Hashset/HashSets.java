/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashSet.Hashset;

import java.util.HashSet;

/**
 *
 * @author glory
 */
//A HashSet is a collection of items where every item is unique
public class HashSets {

    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.contains("Mazda"));//To check whether an item exists in a HashSet, use the contains() method:
        cars.remove("Volvo");//To remove an item, use the remove() method:
        System.out.println(cars);
        cars.clear();//To remove all items, use the clear() method: 
        System.out.println(cars);
        System.out.println(cars.size());//To find out how many items there are, use the size method:
        for (String i : cars) {//Loop through the items of an HashSet with a for-each loop:
            System.out.println(i);
        }
    }
}
