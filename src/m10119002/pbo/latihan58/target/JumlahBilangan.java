/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan58.target;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Class untuk objek Jumlah Bilangan
 * Pertemuan 5
 * 
 */
public class JumlahBilangan extends Bilangan {
    public void tampilHasilJumlah() {
        int hasil = this.getX() + this.getY();
        System.out.println("Hasil perjumlahan = ".concat(Integer.toString(hasil)));
    }
}
