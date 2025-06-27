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
public class MainKendaraan {
    public static void main(String[] args){
        Mobil mobil = new Mobil("Toyotaa Avanza", 2022,4,"Automatic");
        Motor motor =new Motor("Yamaha NMAX", 2023, "FULL Face", 155);
   
        mobil.nyalakan();
        mobil.info();
        mobil.periksaKondisi();
        mobil.servis();
        mobil.matikan();
    
    System.out.println();
    } 
  
}
