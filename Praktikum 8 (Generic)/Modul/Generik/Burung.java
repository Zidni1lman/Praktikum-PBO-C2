/* Nama File    : Burung.java
 * Deskripsi    : Class Burung, subclass dari Anabul
 * Pembuat      : Gian Zidni Ilman/24060123140207
 * Tanggal      : 1 Mei 2025
 */

class Burung extends Anabul {
    public Burung() {
        super();
    }

    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println("Burung bersuara: cuit");
    }
    
    @Override
    public void bergerak() {
        System.out.println("Burung bergerak dengan terbang");
    }
}