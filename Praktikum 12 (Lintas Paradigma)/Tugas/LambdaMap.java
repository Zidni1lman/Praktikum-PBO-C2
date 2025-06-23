/* Nama File    : LambdaMap.java
 * Deskripsi    : Contoh penggunaan lambda pada Map di Java
 * Pembuat      : Gian Zidni Ilman/24060123140207
 * Tanggal      : 30 Mei 2025
 */

package Tugas;

import java.util.*;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();

        mahasiswaMap.put("001", "Adi");
        mahasiswaMap.put("002", "Bambang");
        mahasiswaMap.put("003", "Cici");
        mahasiswaMap.put("004", "Didi");

        //lambda digunakan sebagai parameter
        mahasiswaMap.forEach((nim, nama) -> System.out.println(nim + ": " + nama));
    }
}