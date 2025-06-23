/* Nama File    : Main.java
 * Deskripsi    : Main class univ
 * Pembuat      : Gian Zidni Ilman/24060123140207
 * Tanggal      : 28 Maret 2025
 */

public class Main {
    public static void main(String[] args) {
        fakultas fib = new fakultas("FIB", 5500000, 8000000);
        fakultas fkm = new fakultas("FKM", 5000000, 7500000);
        
        mahasiswa mhs1 = new mahasiswa("Citra", "citra@pbo.com", "240601", 5, fib);
        mahasiswa mhs2 = new mahasiswa("Doni", "doni@pbo.com", "240602", 3, fkm);

        dosen dosen1 = new dosen("Dr. Ahmad", "ahmad@pbo.com", "198503152010121001", 12, fib);
        tendik tendik1 = new tendik("Ibu Wati", "wati@pbo.com", "199005202015032002", 8);

        mhs1.printInfo();
        mhs2.printInfo();
        dosen1.printInfo();
        tendik1.printInfo();
    }
}
