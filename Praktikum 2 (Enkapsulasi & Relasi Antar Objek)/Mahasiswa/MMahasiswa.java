/* Nama File    : MMahasiswa.java
 * Deskripsi    : Main class Mahasiswa
 * Pembuat      : Gian Zidni Ilman/24060123140207
 * Tanggal      : 1 Maret 2025
*/
package Mahasiswa;

public class MMahasiswa {
    public static void main(String[] args){
        //Inisialisasi Objek
        MataKuliah RPL = new MataKuliah("RPL", "Rekayasa Perangkat Lunak", 3);
        MataKuliah Siscer = new MataKuliah("Siscer", "Sistem Cerdas", 3);
        Mahasiswa M1 = new Mahasiswa("24060123140207", "Gian Zidni IIlman", "Informatika");
        Dosen D1 = new Dosen("123", "Rismiyati", "Informatika");
        Kendaraan K1 = new Kendaraan("H 1111 ABC", "Mobil");
        
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatkul(RPL);
        M1.addMatkul(Siscer);
        M1.printDetailMhs();
        System.out.println("\nJumlah Mata Kuliah = " + M1.getJumlahMatkul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlahSKS());
        
    }
}