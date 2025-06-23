/* Nama File    : MBangunDatar.java
 * Deskripsi    : Main class BangunDatar
 * Pembuat      : Gian Zidni Ilman/24060123140207
 * Tanggal      : 16 Maret 2025
 */

public class MBangunDatar {
    public static void main(String[] args) {
        Persegi P1 = new Persegi(12, "Merah", "Tipis");
        Lingkaran L1 = new Lingkaran(7, "Biru", "Tebal");

        System.out.println("Info Persegi:");
        P1.printInfo();

        System.out.println("\nInfo Lingkaran:");
        L1.printInfo();
        
        System.out.println("");
        BangunDatar.printCounterBangunDatar();
    }
}