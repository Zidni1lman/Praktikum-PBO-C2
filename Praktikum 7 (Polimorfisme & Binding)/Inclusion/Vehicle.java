/* Nama File    : Vehicle.java
 * Deskripsi    : Superclass Vehicle
 * Pembuat      : Gian Zidni Ilman/24060123140207
 * Tanggal      : 23 April 2025
 */

package Inclusion;

public class Vehicle {
    void calRent(int distance, float price) {
        float fare = distance * price;
        System.out.println("vehicle price = " + fare);
    }
}