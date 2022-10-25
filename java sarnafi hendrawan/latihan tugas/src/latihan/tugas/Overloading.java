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
public class Overloading {
    int tambah(int a, int b){
         int hasil = a + b;
         System.out.println("Hasil = " + hasil);
        return hasil;
     }
     int kurang(int a, int b){
        int hasil = a - b;
         System.out.println("Hasil = " + hasil);
        return hasil;
     }
     int kali(int a, int b){
        int hasil = a * b;
         System.out.println("Hasil = " + hasil);
        return hasil;
     }
     double bagi(double a, double b){
        double hasil = a / b;
         System.out.println("Hasil = " + hasil);
        return hasil;
     }
     double tambah(double a, double b){
         double hasil = a + b;
         System.out.println("Hasil = " + hasil);
        return hasil;
     }
     double kurang(double a, double b){
        double hasil = a - b;
         System.out.println("Hasil = " + hasil);
        return hasil;
     }
     double kali(double a, double b){
        double hasil = a * b;
         System.out.println("Hasil = " + hasil);
        return hasil;
     }
   
      double tambah(double a, double b, double c){
         double hasil = a + b + c;
         System.out.println("Hasil = " + hasil);
        return hasil;
      }
}
