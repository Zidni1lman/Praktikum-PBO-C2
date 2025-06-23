/* Nama File    : Anjing.java
 * Deskripsi    : kelas Anjing yang merupakan subclass dari Anabul
 * Pembuat      : Gian Zidni Ilman/24060123140207
 */

public class Anjing extends Anabul{
    //konstruktor
    public Anjing(){}
    public Anjing(String Nama){
        super(Nama);
    }    //mutator
    @Override
    public void Gerak() {
        System.out.println("Berlari");
    }
    @Override
    public void Bersuara() {
        System.out.println("Guk-Guk");
    }
}