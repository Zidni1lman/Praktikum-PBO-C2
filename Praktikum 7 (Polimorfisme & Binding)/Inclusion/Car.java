/* Nama File    : Car.java
 * Deskripsi    : Class Car, subclass Vehicle
 * Pembuat      : Gian Zidni Ilman/24060123140207
 * Tanggal      : 23 April 2025
 */

package Inclusion;

public class Car extends Vehicle {
    @Override
    void calRent(int jarak, float harga) {
        float fare = jarak * harga;
        fare = fare - 100.00f;
        System.out.println("harga sewa mobil = " + fare);
    }
}