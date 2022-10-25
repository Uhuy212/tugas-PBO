/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.tugas;

/**
 *
 * @author hp
 */
public class Overloadingberaksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Overloading mtk = new Overloading();
        
        mtk.tambah(20, 20);
        mtk.kurang(10, 5);
        mtk.kali(10, 20);
        mtk.bagi(21.0, 2.0);
        
        mtk.tambah(12.5, 28.7, 14.2);
        mtk.kurang(10, 5);
        mtk.kali(10, 20);
        mtk.bagi(21.0, 2.0);
    }
    
}
