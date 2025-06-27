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
public class Motor {
    private String jenisHelm;
    private int cc;
    
    public Motor(String merk, int tahun, String jenisHelm, int cc){
        super(merk, tahun);
        this.jenisHelm= jenisHelm;
        this.cc=cc;
    }
    public String getJenisHelm(){
        return jenisHelm;
    }
    public void setCc(int Cc){
        this.cc=Cc;
    }
    public int getCc(){
        return cc;
    }
    public void nyalakan(){
        System.out.println("Motor" + merk + ",Tahun" + tahun + "'" + "CC;"+ cc + ",Helm:" = jenisHelm);
    }
    public void periksaKOndisi(){
        System.out.println("Periksa rantai, oli mesin," + "dan rem motor" + merek + ".");
    }
    public void servis(){
        System.out.println("Motor" + merk + "perlu servis rutin setap 3.00km");
    }
}
