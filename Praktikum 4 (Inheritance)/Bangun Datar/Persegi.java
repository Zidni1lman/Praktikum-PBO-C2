/* Nama File    : Persegi.java
 * Deskripsi    : Subclass BangunDatar, Persegi
 * Pembuat      : Gian Zidni Ilman/24060123140207
 * Tanggal      : 16 Maret 2025
 */

public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }
}

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getLuas() {
        return sisi * sisi;
    }

    public double getKeliling() {
        return 4 * sisi;
    }
}