/* Nama File    : MapTest.java
 * Deskripsi    : Contoh Penggunaan Map
 * Pembuat      : Gian Zidni Ilman/24060123140207
 */

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        // kunci -> integer, nilai -> string
        Map<Integer, String> map = new HashMap<Integer, String>();

        // menempatkan elemen kunci dan nilai
        map.put(1, "satu");
        map.put(2, "dua");

        // mengambil elemen pertama
        System.out.println(map.get(1));

        // mengambil keseluruhan kunci sebagai objek collection Set
        Set<Integer> key = map.keySet();
    }
}