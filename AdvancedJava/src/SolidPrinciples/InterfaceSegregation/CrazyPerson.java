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
public class CrazyPerson implements BearPetter {
//And finally, we can leave the dangerous stuff to the reckless people:
    @Override
    public void petTheBear() {
        //Good luck with that!
    }
}
