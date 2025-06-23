/* Nama File    : univ.java
 * Deskripsi    : class univ, superclass dari fakultas
 * Pembuat      : Gian Zidni Ilman/24060123140207
 * Tanggal      : 28 Maret 2025
 */

public class univ {
    //atribut
    private String namaUniv;

    //konstruktor
    public univ(){}
    public univ(String namaUniv){
        this.namaUniv = namaUniv;
    }
    //mutator
    public String getNamaUniv() {
        return namaUniv;
    }
}