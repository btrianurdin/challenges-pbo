/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenges2;

import pegawai.Developer;

/**
 *
 * @author HP
 */
public class Challenges2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Developer dev1 = new Developer("83476", "Erwin", 2014, "Senior");
        
        dev1.hitungTunjangan();
        dev1.infoDeveloper();
                
    }
    
}
