/* Nama File    : Anabul.java
 * Deskripsi    : kelas Anabul
 * Pembuat      : Gian Zidni Ilman/24060123140207
 */

public class Anabul {
    private String Nama;
    //const
    public Anabul(String Nama){
        this.Nama = Nama;
    }
    public Anabul(){}
    //setter getter
    public String getNama() {
        return Nama;
    }
    public void setNama(String nama) {
        Nama = nama;
    }
    public void Gerak(){
        System.out.println("Joged dieunhaylangla");
    }
    public void Bersuara(){
        System.out.println("Mengucapkan Mohon maaf Lahir Batin");
    }
}