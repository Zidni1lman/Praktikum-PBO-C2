/* Nama File    : Anabul.java
 * Deskripsi    : Superclass Anabul
 * Pembuat      : Gian Zidni Ilman/24060123140207
 * Tanggal      : 1 Mei 2025
 */

public abstract class Anabul {
    protected String nama;

    public Anabul() {
        nama = "";
    }

    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Method abstrak
    public abstract void bersuara();
    public abstract void bergerak();
}