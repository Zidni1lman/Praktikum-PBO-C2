/* Nama File    : Pegawai.java
 * Deskripsi    : Superclass Pegawai
 * Pembuat      : Gian Zidni Ilman/24060123140207
 * Tanggal      : 23 April 2025
 */

package PostTest;

public class Pegawai {
    private String Nama;
    private int Gaji_Pokok = 5000000;
    //konstrktor
    public Pegawai(String Nama){
        this.Nama = Nama;
    }
    public Pegawai(){}
    //setter getter
    public String getNama() {
        return Nama;
    }
    public void setNama(String nama) {
        Nama = nama;
    }
    public int getGaji_Pokok() {
        return Gaji_Pokok;
    }
    public void tampilData(){
        System.out.println("Nama : "+getNama()+", Gaji Pokok : "+getGaji_Pokok());
    }
}