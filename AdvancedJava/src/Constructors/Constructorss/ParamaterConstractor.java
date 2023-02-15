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
public class ParamaterConstractor {

    int x;

    public ParamaterConstractor(int y) {
        x = y;
    }

    public static void main(String[] args) {
        ParamaterConstractor myObj = new ParamaterConstractor(5);
        System.out.println(myObj.x);
    }
}
