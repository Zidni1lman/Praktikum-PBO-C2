/* Nama File    : Datum.java
 * Deskripsi    : Class Datum, class generik
 * Pembuat      : Gian Zidni Ilman/24060123140207
 * Tanggal      : 1 Mei 2025
 */

public class Datum<G> {
    private G isi;

    //metode
    public G getIsi() {
        return isi;
    }
    public void setIsi(G isi) {
        this.isi = isi;
    }

}