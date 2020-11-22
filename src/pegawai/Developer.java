/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pegawai;

/**
 *
 * @author HP
 */
public class Developer extends Pegawai {
    private String status;
    
    public Developer(String nip, String nama, Integer thnMasuk, String status){
        super(nip, nama, thnMasuk);
        
        this.status = status;
    }
    
    public void hitungTunjangan(){
        if ("Senior".equals(this.status)) {
            super.setTunjangan(1000000.0);
        } else if("Junior".equals(this.status)){
            super.setTunjangan(700000.0);
        }
    }
    
    public void infoDeveloper(){
        System.out.println("== INFORMASI DEVELOPER ==");
        System.out.println("NIP : " + super.getNip());
        System.out.println("Nama : " + super.getNama());
        System.out.println("Tahun Masuk : " + super.getThnMasuk());
        System.out.println("Tunjangan : " + super.getTunjangan());
        System.out.println("Total Gaji : "+ super.totalGaji());
    }
}
