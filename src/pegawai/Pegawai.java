/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pegawai;

import java.util.Calendar;

/**
 *
 * @author HP
 */
public class Pegawai {
    private String nip;
    private String nama;
    private Integer thnMasuk; 
    private Double tunjangan;
    private Double gajiPokok;
    
    public Pegawai(String nip, String nama, Integer thnMasuk){
        this.nip = nip;
        this.nama = nama;
        this.thnMasuk = thnMasuk;
    }
    
    protected Integer hitungLamaKerja(){
        Calendar thisYear = Calendar.getInstance(); 
        return thisYear.getWeekYear() - this.thnMasuk;
    }
    
    protected void hitungGajiPokok(){
        this.gajiPokok = (this.hitungLamaKerja() >= 4) ? 7000000.0 : 5000000.0;
    }
    
    protected Double totalGaji(){
        this.hitungGajiPokok();
        
        return this.gajiPokok + tunjangan;
    }
     
    public void setTunjangan(Double tunjangan){
        this.tunjangan = tunjangan;
    }
    
    public String getNip(){ return this.nip; }
    public String getNama(){ return this.nama; }
    public Integer getThnMasuk(){ return this.thnMasuk; }
    public Double getTunjangan(){return this.tunjangan; }
    public Double getGajiPokok(){ return this.gajiPokok; }
}
