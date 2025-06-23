/* Nama File    : IDiskon.java
 * Deskripsi    : Interface diskon untuk demonstrasi lambda
 * Pembuat      : Gian Zidni Ilman/24060123140207
 * Tanggal      : 30 Mei 2025
 */

package Modul;

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();

        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        //lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}