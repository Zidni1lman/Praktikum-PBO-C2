/* Nama File    : Menu.java
 * Deskripsi    : class Menu berisi atribut nama, harga, dan stok
 * Pembuat      : Gian Zidni Ilman/24060123140207
 * Tanggal      : 8 Maret 2025
 */

package Tugas.Exception;

public class Menu {
    private String nama;
    private double harga;
    private int stok;

    public Menu(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void kurangiStok(int jumlah) {
        // TO DO 1: Tambahkan metode untuk mengurangi stok
        if (this.stok < jumlah) {
            // Melempar exception jika stok tidak mencukupi
            throw new IllegalArgumentException("Stok untuk " + this.nama + " tidak mencukupi.");
        }
        this.stok -= jumlah;
    }
}