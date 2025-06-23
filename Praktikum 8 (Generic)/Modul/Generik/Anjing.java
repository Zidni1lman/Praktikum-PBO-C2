/* Nama File    : Anjing.java
 * Deskripsi    : Class Anjing, subclass dari Anabul
 * Pembuat      : Gian Zidni Ilman/24060123140207
 * Tanggal      : 1 Mei 2025
 */


public class Anjing extends Anabul{
    public Anjing() {
        super();
    }

    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println("Anjing bersuara: guk guk");
    }
    
    @Override
    public void bergerak() {
        System.out.println("Anjing bergerak dengan melata");
    }
}