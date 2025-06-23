/*
 * File         : Persegi.java
 * Deskripsi    : Kelas yang mengimplementasikan interface BangunDatar untuk menghitung luas dan keliling persegi
 * Pembuat      : Gian Zidni Ilman/24060123140207
 */

public class Persegi extends BangunDatar {
    //atribut
    private double sisi;
    //konstruktor
    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public double hitungKeliling() {
        return 4 * sisi;
    }

    public double hitungLuas() {
        return sisi * sisi;
    }
}