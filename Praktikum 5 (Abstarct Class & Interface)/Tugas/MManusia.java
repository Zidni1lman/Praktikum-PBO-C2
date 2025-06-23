/* Nama File    : MManusia.java
 * Deskripsi    : Main class Manusia
 * Pembuat      : Gian Zidni Ilman/24060123140207
 * Tanggal      : 24 Maret 2025
 */

package Tugas;

import java.time.LocalDate;

public class MManusia {
    public static void main(String[] args) {
        PNS p1 = new PNS("Budi", LocalDate.of(2005, 5, 10), "Jl. Melati No. 5", 15000000, "198302032006041002");
        Pengusaha pe1 = new Pengusaha("Citra", LocalDate.of(1999, 2, 20), "Jl. Sudirman Kav. 1", 55000000, "000-556-773-212-000-5");
        Petani pt1 = new Petani("Dedi", LocalDate.of(1985, 7, 15), "Desa Sukamaju RT 3 RW 1", 5000000, "Boyolali");
        PNS p2 = new PNS("Eka", LocalDate.of(2011, 8, 30), "Jl. Pahlawan No. 112", 10000000, "198004212010041002");

        System.out.println("Jumlah Manusia    = " + (PNS.getCounterPNS() + Pengusaha.getCounterPengusaha() + Petani.getCounterPetani()));
        System.out.println("Jumlah PNS        = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha  = " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani     = " + Petani.getCounterPetani());

        System.out.println("\nPajak PNS p1         = Rp " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1  = Rp " + pe1.hitungPajak());
        System.out.println("Pajak Petani pt1     = Rp " + pt1.hitungPajak());
        System.out.println("Pajak PNS p2         = Rp " + p2.hitungPajak());

        System.out.println("\nMasa Kerja p1  = " + p1.hitungMasaKerja());
        System.out.println("Masa Kerja pe1 = " + pe1.hitungMasaKerja());
        System.out.println("Masa Kerja pt1 = " + pt1.hitungMasaKerja());
        System.out.println("Masa Kerja p2  = " + p2.hitungMasaKerja());

        System.out.println();
        p1.cetakInfo();
        System.out.println();
        pe1.cetakInfo();
        System.out.println();
        pt1.cetakInfo();
        System.out.println();
        p2.cetakInfo();
    }
}