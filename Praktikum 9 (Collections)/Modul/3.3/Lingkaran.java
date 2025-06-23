/*
 * File         : Lingkaran.java
 * Deskripsi    : implementasi Lingkaran sebagai BangunDatar
 * Pembuat      : Gian Zidni Ilman/24060123140207
 */

public class Lingkaran extends BangunDatar {
    //atribut
    private double jejari;
    //konstruktor
    public Lingkaran(double jejari) {
        this.jejari = jejari;
    }

    public double hitungKeliling() {
        return 2 * jejari * 3.14;
    }

    public double hitungLuas() {
        return 3.14 * jejari * jejari;
    }
}