/* Nama File    : dosen.java
 * Deskripsi    : class dosen, subclass dari karyawan
 * Pembuat      : Gian Zidni Ilman/24060123140207
 * Tanggal      : 28 Maret 2025
 */

public class dosen extends karyawan{
    //atribut
    private fakultas fakultas;
    private static int counterDosen;

    //konstruktor
    public dosen(){}
    public dosen(String nama, String email, String NIP, int masaKerja, fakultas fakultas){
        super(nama, email, NIP, masaKerja);
        this.fakultas = fakultas;
        counterDosen ++;
    }

    //mutator
    public fakultas getFakultas() {
        return fakultas;
    }
    public static int getCounterDosen() {
        return counterDosen;
    }
    public double getGajiK() {
        double gaji= getFakultas().getGaji();
        return gaji + (getMasaKerja() * 0.01 * gaji);
    }

    public void printInfo() {
        System.out.println("Dosen: " + getNama() + " (" + getNIP() + ")");
        System.out.println("Email: " + getEmail());
        System.out.println("Fakultas: " + getFakultas().getNama());
        System.out.println("Masa Kerja: " + getMasaKerja() + " tahun");
        System.out.println("Gaji: Rp" + getGajiK());
        System.out.println();
    }   
    
}