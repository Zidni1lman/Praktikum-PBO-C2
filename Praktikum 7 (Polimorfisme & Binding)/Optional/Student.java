/* Nama File    : Student.java
 * Deskripsi    : Class Student, subclass Person
 * Pembuat      : Gian Zidni Ilman/24060123140207
 * Tanggal      : 23 April 2025
 */

public class Student extends Person {
    public Student(String name) {
        super(name);
    }

    @Override
    public boolean isAsleep(int hr) // override
    {
        return 2 < hr && 8 > hr;
    }
}