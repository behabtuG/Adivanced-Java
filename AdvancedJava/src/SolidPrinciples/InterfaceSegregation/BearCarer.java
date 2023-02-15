/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SolidPrinciples.InterfaceSegregation;

/**
 *
 * @author glory
 */
public class BearCarer implements BearCleaner, BearFeeder {
//Now, thanks to interface segregation, we're free to implement only the methods that matter to us
    @Override
    public void washTheBear() {
        //I think we missed a spot...
    }

    @Override
    public void feedTheBear() {
        //Tuna Tuesdays...
    }
}
