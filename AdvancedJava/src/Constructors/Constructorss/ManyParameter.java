/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructors.Constructorss;

/**
 *
 * @author glory
 */
public class ManyParameter {

    int modelYear;
    String modelName;

    public ManyParameter(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        ManyParameter myCar = new ManyParameter(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}
