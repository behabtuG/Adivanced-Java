package SolidPrinciples.OpenClosed;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glory
 */
public class Guitar {
// classes should be open for extension but closed for modification. 
//In doing so, we stop ourselves from modifying existing code and causing potential new bugs in an otherwise happy application.
//Of course, the one exception to the rule is when fixing bugs in existing code.   

    private String make;
    private String model;
    private int volume;

    //Constructors, getters & setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
