/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SolidPrinciples.LiskovSubstitution;

/**
 *
 * @author glory
 */
public class ElectricCar implements Car {

    @Override
    public void turnOnEngine() {
        throw new AssertionError("I don't have an engine!");
    }

    @Override
    public void accelerate() {
        //this acceleration is crazy!
    }
}
