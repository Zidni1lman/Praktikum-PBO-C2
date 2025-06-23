/* Nama File    : mahasiswa.java
 * Deskripsi    : class mahasiswa, subclass dari civitas
 * Pembuat      : Gian Zidni Ilman/24060123140207
 * Tanggal      : 28 Maret 2025
 */

public class mahasiswa extends civitas {
    //atribut
    private String NIM;
    private double Semester;
    private fakultas fakultas;
    private static int counterMahasiswa = 0;
    //konstruktor
    public mahasiswa(){}
    public mahasiswa(String nama, String email, String NIM, double Semester, fakultas fakultas){
        super(nama, email);
        this.NIM = NIM;
        this.Semester = Semester;
        this.fakultas = fakultas;
        counterMahasiswa++;
    }
    //mutator
    public String getNIM() {
        return NIM;
    }
    public fakultas getFakultas() {
        return fakultas;
    }
    public double getSemester() {
        return Semester;
    }
    public void setFakultas(fakultas fakultas) {
        this.fakultas = fakultas;
    }
    public void setNIM(String nIM) {
        NIM = nIM;
    }
    public void setSemester(double semester) {
        Semester = semester;
    }
    public int getCounterMahasiswa() {
        return counterMahasiswa;
    }
    public double getUKT() {
    double ukt = fakultas.getUKT();
    double semester = getSemester() - 1;
    return ukt - (ukt * 0.05 * semester);
    }
    public void printInfo() {
        System.out.println("Mahasiswa: " + getNama() + " (" + NIM + ")");
        System.out.println("Email: " + getEmail());
        System.out.println("Fakultas: " + fakultas.getNama());
        System.out.println("Semester: " + getSemester());
        System.out.println("Biaya UKT: Rp" + getUKT());
        System.out.println();
    }
}
