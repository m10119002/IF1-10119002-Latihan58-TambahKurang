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
 * Deskripsi Program : Class untuk objek Selisih Bilangan
 * Pertemuan 5
 * 
 */
public class SelisihBilangan extends Bilangan {
    public void tampilSelisih() {
        int hasil = this.getX() - this.getY();
        System.out.println("Hasil Selisih ".
                concat(Integer.toString(this.getX())).concat(" - ").
                concat(Integer.toString(this.getY())).concat(" = ").
                concat(Integer.toString(hasil)));
    }
}
