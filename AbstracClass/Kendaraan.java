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
public class Kendaraan {
    public abstract class kendaraan {
        protected String merk;
        protected int tahun;
        
    public kendaraan(String merk, int tahun){
        this.merk = merk;
        this.tahun = tahun;
    }
    public String getMerek(){
        return merk;
    }
    public void nyalakan(){
        System.out.println("kendaraan dinyalakan");
    }
    public void matikan(){
        System.out.println("kendaraan diatikaan");
    }
    
    public abstract void info();
    public abstract void periksaKondisi();
    public abstract void servis();
    }
}
