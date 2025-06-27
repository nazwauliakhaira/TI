/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasKelompokBagian2;

/**
 *
 * @author DELL
 */
public class Square extends Rectangle {
    public Square() {
        super(1.0, 1.0);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth(); 
        //sqaure harus berbntuk persegi nanntinya
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
//menggunakan Override,subclass menyediakan implementasi
    @Override
    public void setWidth(double side) {
        setSide(side); 
    }

    @Override
    public void setLength(double side) {
        setSide(side); 
    }

    @Override
    public String toString() {
        return "Square[side=" + getSide() + ", color=" + getColor() + ", filled=" + isFilled() + "]";
    }
}


