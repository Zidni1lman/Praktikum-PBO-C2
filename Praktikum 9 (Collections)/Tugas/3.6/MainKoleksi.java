/* Nama File    : MainKoleksi.java
 * Deskripsi    : main kelas koleksi
 * Pembuat      : Gian Zidni Ilman/24060123140207
 */

public class MainKoleksi {
    public static void main(String[] args) {
        KoleksiAnabul<Anabul> koleksi = new KoleksiAnabul<Anabul>();
        koleksi.add(new Anjing("RockRuff"));
        koleksi.add(new Burung("DeliBird"));
        koleksi.add(new Kucing("MewTwo"));
        koleksi.add(new Kucing("Mew"));
        koleksi.add(new Anjing("eevee"));
        koleksi.add(new Burung("Ho-Oh"));
        koleksi.add(new Anjing("Pikachu"));
        koleksi.add(new Burung("Pidgey"));
        koleksi.add(new Kucing("Meowth"));
        koleksi.add(new Anabul("Snorlax"));

        System.out.println("Jumlah Anabul: " + koleksi.getSize());
        System.out.println();

        koleksi.showAll();
        
    }
}