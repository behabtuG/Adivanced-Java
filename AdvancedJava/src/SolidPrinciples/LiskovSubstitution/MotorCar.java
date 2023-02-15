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
public class MotorCar implements Car {
    //if class A is a subtype of class B, we should be able to replace B with A without disrupting the behavior of our program

   private Engine engine;
//
//    public Engine getEngine() {
//        return engine;
//    }
//
//    public void setEngine(Engine engine) {
//        this.engine = engine;
//    }

    //Constructors, getters + setters
    @Override
    public void turnOnEngine() {
        //turn on the engine!
        engine.on();
    }

    @Override
    public void accelerate() {
        //move forward!
        engine.powerOn(1000);
    }
}
