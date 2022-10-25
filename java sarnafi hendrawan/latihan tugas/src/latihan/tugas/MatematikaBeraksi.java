package latihan.tugas;


import latihan.tugas.Matematika;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author hp
 */
public class MatematikaBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matematika mtk = new Matematika();
        
        mtk.tambah(20, 20);
        mtk.kurang(10, 5);
        mtk.kali(10, 20);
        mtk.bagi(21.0, 2.0);
    }
    
}
