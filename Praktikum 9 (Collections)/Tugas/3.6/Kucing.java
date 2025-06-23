/* Nama File    : Kucing.java
 * Deskripsi    : kelas Kucing yang merupakan subclass dari Anabul
 * Pembuat      : Gian Zidni Ilman/24060123140207
 */

public class Kucing extends Anabul{

    //konstruktor
    public Kucing(){}
    public Kucing(String Nama){
        super(Nama);
    }    //mutator
    @Override
    public void Gerak() {
        System.out.println("Melompat");
    }
    @Override
    public void Bersuara() {
        System.out.println("Meong");
    }
    
}