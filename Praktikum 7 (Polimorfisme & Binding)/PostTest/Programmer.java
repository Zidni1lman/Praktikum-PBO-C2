/* Nama File    : Programmer.java
 * Deskripsi    : Class Programmer, subclass Pegawai
 * Pembuat      : Gian Zidni Ilman/24060123140207
 * Tanggal      : 23 April 2025
 */

package PostTest;

public class Programmer extends Pegawai {
    private int bonus = 450000;

    //konstruktor
    public Programmer(String Nama){
        super(Nama);
    }
    public Programmer(){}
    
    //setter getter
    public int getBonus() {
        return bonus;
    }
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : "+ getBonus());
    }
    
}