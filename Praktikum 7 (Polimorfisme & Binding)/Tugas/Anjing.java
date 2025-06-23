/* Nama File    : Anjing.java
 * Deskripsi    : Class Anjing, subclass dari Anabul
 * Pembuat      : Gian Zidni Ilman/24060123140207
 * Tanggal      : 23 April 2025
 */

package Tugas;

public class Anjing extends Anabul{
    //construk
    public Anjing(){}
    public Anjing(String Nama){
        super(Nama);
    }

    //mutator
    @Override
    public void Gerak() {
        System.out.println("Melata");
    }
    @Override
    public void Bersuara() {
        System.out.println("Guk-Guk");
    }
}