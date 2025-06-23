/* Nama File    : Burung.java
 * Deskripsi    : Class Burung, subclass dari Anabul
 * Pembuat      : Gian Zidni Ilman/24060123140207
 * Tanggal      : 23 April 2025
 */

package Tugas;

public class Burung extends Anabul{
    //construk
    public Burung(){}
    public Burung(String Nama){
        super(Nama);
    }
    //mutator
    @Override
    public void Gerak() {
        System.out.println("Terbang");
    }
    @Override
    public void Bersuara() {
        System.out.println("Cuit");
    }
}