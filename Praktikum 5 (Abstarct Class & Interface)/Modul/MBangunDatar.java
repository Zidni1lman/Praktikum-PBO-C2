package Modul;

public class MBangunDatar {
    public static void main(String[] args){

        BangunDatar B1 = new BangunDatar();
        BangunDatar P1 = new Persegi(10);
        Persegi P2 = new Persegi(5);
        BangunDatar L1 = new Lingkaran(7);
        Lingkaran L2 = new Lingkaran (14);

        System.out.println("Luas Persegi P2: " + P2.getLuas());
        System.out.println("Keliling Persegi P2: " + P2.getKeliling());

        System.out.println("Luas Lingkaran L2: " + L2.getLuas());
        System.out.println("Keliling Lingkaran L2: " + L2.getKeliling());

        System.out.println("Luas Persegi P1: " + P1.getLuas());
        System.out.println("Luas Lingkaran L1: " + L1.getLuas());

    }

}
