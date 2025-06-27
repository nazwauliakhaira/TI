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
public class Mobil extends Kendaraan{
        protected String transmisi;
        protected int jumlahPintu;
        
    public Mobil(String transmisi, int jumlahPintu){
        this.transmisi = transmisi;
        this.jumlahPintu = jumlahPintu;
    }
    public String getTransmisi(){
        return transmisi;
    }
    public void nyalakan(){
        System.out.println("mobil dinyalakan");
    }
    public void matikan(){
        System.out.println("mobil diatikaan");
    }
    public void setjumlahPintu(){
        this.jumlahPintu = jumlahPintu;
    }      
    public int  getjumlahPIntu(){
       return jumlahPintu = jumlahPintu;
    }
    public void settransmisi(){
        this.transmisi = transmisi;
    }
    public String gettransmisi(){
        return transmisi = transmisi;
    }
 
   public void servis(){
       System.out.println("Mobil" + transmisi + ".");
   }
}
   





