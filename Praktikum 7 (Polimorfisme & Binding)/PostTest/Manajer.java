/* Nama File    : Manajer.java
 * Deskripsi    : Class Manajer, subclass Pegawai
 * Pembuat      : Gian Zidni Ilman/24060123140207
 * Tanggal      : 23 April 2025
 */

package PostTest;

public class Manajer extends Pegawai{
    private int Tunjangan = 700000;

    //konstruktor
    public Manajer(String Nama){
        super(Nama);
    }
    public Manajer(){}
    
    //setter getter
    public int getTunjangan() {
        return Tunjangan;
    }
    public void setBonus(int bonus) {
        this.Tunjangan = bonus;
    }
    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : "+ getTunjangan());
    }
}