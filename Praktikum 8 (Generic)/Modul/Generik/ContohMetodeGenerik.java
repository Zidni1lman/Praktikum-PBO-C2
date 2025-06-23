/* Nama File    : ContohMetodeGenerik.java
 * Deskripsi    : Class ContohMetodeGenerik, metode generik utk mengendalikan kelas Datum dgn main
 * Pembuat      : Gian Zidni Ilman/24060123140207
 * Tanggal      : 1 Mei 2025
 */

public class ContohMetodeGenerik<T> {
    public <T extends Anabul> void kontrolDanPrintInfo(KontrolSenjata<T> datum) {
        // ambil isi
        T anabul = datum.getIsi();

        if (anabul != null){
            // Menampilkan info dasar
            System.out.println("\n--- Mengendalikan Datum ---");
            System.out.println("Isi Datum adalah objek dari kelas: " + anabul.getClass().getSimpleName());
            System.out.println("Nama Anabul: " + anabul.getNama());

            // Panggil method
            ((Anabul) anabul).bergerak();
            ((Anabul) anabul).bersuara();
            System.out.println("============================");
        } 
        else{
            System.out.println("\n--- Datum Kosong ---");
        }
    }

    // main ContohMetodeGenerik
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        ContohMetodeGenerik controller = new ContohMetodeGenerik();

        // inisialisasi Kucing, Anjing, dan Burung
        Kucing oyen = new Kucing("Oyen");
        Anjing bleki = new Anjing("Bleki");
        Burung cicit = new Burung("Cicit");

        // assign ke datum
        KontrolSenjata<Kucing> datumKucing = new KontrolSenjata<>();
        datumKucing.setIsi(oyen);

        KontrolSenjata<Anjing> datumAnjing = new KontrolSenjata<>();
        datumAnjing.setIsi(bleki);

        KontrolSenjata<Burung> datumBurung = new KontrolSenjata<>();
        datumBurung.setIsi(cicit);

        KontrolSenjata<Anabul> datumCampuran = new KontrolSenjata<>();

        System.out.println("=== Memanggil Metode Generik ===");

        // Kontrol Datum Kucing
        controller.kontrolDanPrintInfo(datumKucing);

        // Kontrol Datum Anjing
        controller.kontrolDanPrintInfo(datumAnjing);

        // Kontrol Datum Burung
        controller.kontrolDanPrintInfo(datumBurung);

        // Kontrol Datum Campuran (kucing and anjing)
        System.out.println("=== Kontrol Datum Campuran ===");
        datumCampuran.setIsi(new Kucing("Teh Anget"));
        controller.kontrolDanPrintInfo(datumCampuran);

        datumCampuran.setIsi(new Anjing("Budi"));
        controller.kontrolDanPrintInfo(datumCampuran);
    }
}