/* Nama File    : JumlahPesananMelebihiStokException.java
 * Deskripsi    : exception ketika pesanan lebih dari stok
 * Pembuat      : Gian Zidni Ilman/24060123140207
 * Tanggal      : 8 Maret 2025
 */

package Tugas.Exception;

public class JumlahPesananMelebihiStokException extends Exception {
    // TO DO 2: Buat konstructor dengan parameter message dan panggil konstruktor parent dengan keyword super
    public JumlahPesananMelebihiStokException(String message) {
        super(message);
    }
}