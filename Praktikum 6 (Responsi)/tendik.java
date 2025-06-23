/* Nama File    : tendik.java
 * Deskripsi    : class tendik, subclass dari karyawan
 * Pembuat      : Gian Zidni Ilman/24060123140207
 * Tanggal      : 28 Maret 2025
 */

public class tendik extends karyawan{
    //atribut
    private univ univ;
    private static int countTendik;
    private final double gaji = 4000000;
    //konstruktor
    public tendik(){}
    public tendik(String nama, String email, String NIP, int masaKerja){
        super(nama, email, NIP, masaKerja);
        countTendik++;
    }
    //mutator
    public univ getUniv() {
        return univ;
    }
    public static int getCountTendik() {
        return countTendik;
    }
    public double getGajiK() {
        return gaji +(getMasaKerja() * 0.01 * gaji );
    }
    public void printInfo() {
        System.out.println("Tendik: " + getNama()+ " (" +getNIP() + ")");
        System.out.println("Email: " + getEmail());
        System.out.println("Masa Kerja: " + getMasaKerja() + " tahun");
        System.out.println("Gaji: Rp" + getGajiK());
        System.out.println();
    }
}