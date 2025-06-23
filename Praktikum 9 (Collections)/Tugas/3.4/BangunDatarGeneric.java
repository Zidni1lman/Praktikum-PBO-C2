/*
 * File         : BangunDatarGeneric.java
 * Deskripsi    : Kelas generic untuk mengelola objek BangunDatar
 * Pembuat      : Gian Zidni Ilman/24060123140207
 */

public class BangunDatarGeneric<T extends BangunDatar> {
    private T bangunDatar;

    public void set(T tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }

    public T get() {
        return bangunDatar;
    }

    public double hitungKeliling() {
        return bangunDatar.hitungKeliling();
    }

    public double hitungLuas(){
        return bangunDatar.hitungLuas();
    }
}