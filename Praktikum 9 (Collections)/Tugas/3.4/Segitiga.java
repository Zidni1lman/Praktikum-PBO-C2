/*
 * File         : Segitiga.java
 * Deskripsi    : Kelas yang mengimplementasikan interface BangunDatar untuk menghitung luas dan keliling segitiga
 * Pembuat      : Gian Zidni Ilman/24060123140207
 */

 public class Segitiga extends BangunDatar {
    //atribut
    private double alas;
    private double tinggi;
    
    // konstruktor
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    public double hitungKeliling() {
        return 3 * alas; 
    }
    
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
}