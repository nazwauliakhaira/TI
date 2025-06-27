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
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
        new Circle(),new Circle(5.0, "Biru", false),
        new Rectangle(),new Rectangle(4.0, 6.0, "Hijau", true),
        new Square(),new Square(3.0, "kuning", false)
        };

        for (Shape shape : shapes) {
         System.out.println(shape);
            System.out.println("Area: " + shape.getArea());
               System.out.println("Perimeter: " + shape.getPerimeter());
                 System.out.println(); 
        }
    }
}



