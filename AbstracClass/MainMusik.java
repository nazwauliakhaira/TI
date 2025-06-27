/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstracClass;

/**
 *
 * @author DELL
 */
public class MainMusik {
    
    public static void main(String[] args){
        //membuat objek statik
        Gitar gitar = new Gitar("Klasik","Petik",6);
        Keyboard keyboard = new Keyboard("yamaha","Elektrik",true);
        
        System.out.println("\n AlatMusik Gitar");
        gitar.info();
        gitar.mainkan();
        gitar.stem();
        
        System.out.println();
        
        System.out.println("\n keyboard");
        keyboard.info();
        keyboard.mainkan();
        keyboard.stem();
    }
}
