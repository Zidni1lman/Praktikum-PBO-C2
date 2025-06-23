/* Nama File    : MPegawai.java
 * Deskripsi    : Main class Pegawai
 * Pembuat      : Gian Zidni Ilman/24060123140207
 * Tanggal      : 16 Maret 2025
 */

package Latihan;

import java.time.LocalDate;

public class MPegawai {
    public static void main(String[] args) {
        DosenTetap DT1 = new DosenTetap("1573", "M.Renaldi", LocalDate.of(2014, 2, 20),
                LocalDate.of(2020, 7, 2), 7500000, "Sains dan Matematika", "24688759");
        DosenTamu DTam1 = new DosenTamu("1958", "Bunga Cantika", LocalDate.of(2011, 5, 11),
                LocalDate.of(2022, 10, 27), 8500000, "Teknik", "15786137", LocalDate.of(2025, 11, 7));
        Tendik Ten1 = new Tendik("1482", "Reza Arap", LocalDate.of(2015, 6, 15),
                LocalDate.of(2023, 6, 4), 6500000, "Akademik");

        DT1.printInfo();
        System.out.println("\n======================================================\n");
        DTam1.printInfo();
        System.out.println("\n======================================================\n");
        Ten1.printInfo();
    }
}