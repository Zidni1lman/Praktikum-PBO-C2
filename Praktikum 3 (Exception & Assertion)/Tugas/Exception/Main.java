/* Nama File    : Main.java
 * Deskripsi    : Main untuk tes exception menu
 * Pembuat      : Gian Zidni Ilman/24060123140207
 * Tanggal      : 8 Maret 2025
 */

package Tugas.Exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inisialisasi menu
        Menu menu1 = new Menu("Nasi Goreng", 25000, 10);
        Menu menu2 = new Menu("Mie Ayam", 20000, 15);

        Scanner scanner = new Scanner(System.in);

        // Interaksi dengan pengguna
        System.out.println("Menu:");
        System.out.println("1. Nasi Goreng - Rp25000 (Stok: " + menu1.getStok() + ")");
        System.out.println("2. Mie Ayam - Rp20000 (Stok: " + menu2.getStok() + ")");

        try {
            // Meminta input dari pengguna
            System.out.print("Pilih menu (1/2): ");
            int pilihanMenu = scanner.nextInt();

            Menu menu;
            if (pilihanMenu == 1) {
                menu = menu1;
            } else if (pilihanMenu == 2) {
                menu = menu2;
            } else {
                // TO DO 5 & 6: Melempar exception jika menu tidak valid
                throw new MenuTidakTersediaException("Pilihan menu tidak valid. Harap pilih 1 atau 2.");
            }

            System.out.print("Jumlah pesanan: ");
            int jumlahPesanan = scanner.nextInt();

            // TO DO 7: Melempar exception jika jumlah pesanan melebihi stok
            if (jumlahPesanan > menu.getStok()) {
                throw new JumlahPesananMelebihiStokException("Stok tidak mencukupi. Sisa stok: " + menu.getStok());
            }

            // Melakukan pemesanan
            Pesanan pesanan = new Pesanan(menu, jumlahPesanan);
            menu.kurangiStok(jumlahPesanan);

            System.out.println("\nPesanan berhasil dilakukan.");
            System.out.println("Total harga: Rp" + pesanan.getTotal());
            System.out.println("Sisa stok " + menu.getNama() + ": " + menu.getStok());

        } catch (MenuTidakTersediaException | JumlahPesananMelebihiStokException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Harap masukkan angka yang benar.");
        } finally {
            scanner.close();
        }
    }
}