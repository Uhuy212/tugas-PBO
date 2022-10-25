package latihan.tugas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class Bank {
    
    int saldoAink;
    int total;
    Bank(int saldo){
        saldoAink = saldo;
    }
    
    void getSaldo(){
        System.out.println("Selamat datang di Bank ABC");
        System.out.println("Saldo saat ini : Rp." + saldoAink);
        
    }
    void simpanUang(int simpan){
        total = simpan + saldoAink;
        System.out.println("Simpan uang : " + simpan);
        System.out.println("Saldo saat ini : Rp." + total);
    }
    void ambilUang(int ambil){
        int total2 = total - ambil;
         System.out.println("Ambil uang : " + ambil);
         System.out.println("Saldo saat ini : Rp." + total2);
    }
    
}
