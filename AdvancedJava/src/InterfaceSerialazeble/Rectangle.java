package InterfaceSerialazeble;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author glory
 */
public class Rectangle {

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double Area() {
        return height * width;
    }

    public double Perimeter() {
        return 2 * (height + width);
    }
}
