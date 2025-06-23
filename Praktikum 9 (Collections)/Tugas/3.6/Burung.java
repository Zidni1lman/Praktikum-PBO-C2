/* Nama File    : Burung.java
 * Deskripsi    : kelas Burung yang merupakan subclass dari Anabul
 * Pembuat      : Gian Zidni Ilman/24060123140207
 */

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
