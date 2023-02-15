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
public interface BearKeeper {
// larger interfaces should be split into smaller ones. By doing so, 
// we can ensure that implementing classes only need to be concerned about the methods that are of interest to them.
// we create three differnt interface to impliment this three methods

    void washTheBear();

    void feedTheBear();

    void petTheBear();
}
