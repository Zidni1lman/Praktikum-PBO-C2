/* Nama File    : Kucing.java
 * Deskripsi    : Class Kucing, subclass dari Anabul
 * Pembuat      : Gian Zidni Ilman/24060123140207
 * Tanggal      : 23 April 2025
 */

package Tugas;

public class Kucing extends Anabul{
    
    //konstrtruc
    public Kucing(){}
    public Kucing(String Nama){
        super(Nama);
    }
    //mutator
    @Override
    public void Gerak() {
        System.out.println("Melata");
    }
    @Override
    public void Bersuara() {
        System.out.println("Meong");
    }
    
}