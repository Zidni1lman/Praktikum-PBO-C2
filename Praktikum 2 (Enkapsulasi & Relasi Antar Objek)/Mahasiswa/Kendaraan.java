/* Nama File    : Kendaraan.java
 * Deskripsi    : Berisi atribut dan method dalam class Kendaraan
 * Pembuat      : Gian Zidni Ilman/24060123140207
 * Tanggal      : 1 Maret 2025
*/
package Mahasiswa;

public class Kendaraan {
    //Atribut
    private String noPlat;
    private String jenis;

    public Kendaraan(){
        noPlat = "";
        jenis = "";
    }
    
    public Kendaraan(String Plat, String Jenis){
        noPlat = Plat;
        jenis = Jenis;
    }

    //Selektor
    public String getNoPlat(){
        return noPlat;
    }
    public String getJenis(){
        return jenis;
    }

    //Mutator
    public void setNoPlat(String Plat){
        noPlat = Plat;
    }
    public void setJenis(String Jenis){
        jenis = Jenis;
    }


}