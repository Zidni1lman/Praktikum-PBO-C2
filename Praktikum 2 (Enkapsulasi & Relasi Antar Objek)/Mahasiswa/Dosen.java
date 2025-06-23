/* Nama File    : Dosen.java
 * Deskripsi    : Berisi atribut dan method dalam class Dosen
 * Pembuat      : Gian Zidni Ilman/24060123140207
 * Tanggal      : 1 Maret 2025
*/
package Mahasiswa;

public class Dosen {
    //Atribut
    private String nip;
    private String nama;
    private String prodi;

    public Dosen(){
        nip = "";
        nama = "";
        prodi = "";
    }
    
    public Dosen(String Nip, String Nama, String Prodi){
        nip = Nip;
        nama = Nama;
        prodi = Prodi;
    }

    //Selektor
    public String getNip(){
        return nip;
    }
    public String getNama(){
        return nama;
    }
    public String getProdi(){
        return prodi;
    }

    //Mutator
    public void setNip(String Nip){
        nip = Nip;
    }
    public void setNama(String Nama){
        nama = Nama;
    }
    public void setProdi(String Prodi){
        prodi = Prodi;
    }

}