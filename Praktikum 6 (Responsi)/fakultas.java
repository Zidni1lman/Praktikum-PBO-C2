/* Nama File    : fakultas.java
 * Deskripsi    : class fakultas
 * Pembuat      : Gian Zidni Ilman/24060123140207
 * Tanggal      : 28 Maret 2025
 */

public class fakultas {
    //atribut
    private univ univ;
    private String nama;
    private double UKT;
    private double gajip;
  
    //konstruktor
    public fakultas(){}
    public fakultas(String nama, double UKT, double gajip){
        this.nama = nama;
        this.UKT = UKT;
        this.gajip = gajip;
    }
    //mutator
    public univ getUniv() {
        return univ;
    }
    public double getGaji() {
        return gajip;
    }
    public String getNama() {
        return nama;
    }
    public double getUKT() {
        return UKT;
    }
    public void setGaji(double gajip) {
        this.gajip = gajip;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setUKT(double uKT) {
        UKT = uKT;
    }
    
}
