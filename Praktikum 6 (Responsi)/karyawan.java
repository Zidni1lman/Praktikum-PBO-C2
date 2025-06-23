/* Nama File    : karyawan.java
 * Deskripsi    : class karyawan, subclass dari civitas, superclass dari dosen dan tendik
 * Pembuat      : Gian Zidni Ilman/24060123140207
 * Tanggal      : 28 Maret 2025
 */

public abstract class karyawan extends civitas{
    //atribut
    private String NIP;
    private int masaKerja;
    private static int counterKaryawan;

    //konstruktor
    public karyawan(){}
    public karyawan(String nama, String email, String NIP, int masaKerja){
        super(nama, email);
        this.NIP = NIP;
        this.masaKerja = masaKerja;
    }
   
    //mutator
    public String getNIP() {
        return NIP;
    }
    public int getMasaKerja() {
        return masaKerja;
    }
    public int getCounterKaryawan() {
        return counterKaryawan;
    }
    public abstract double getGajiK();
}