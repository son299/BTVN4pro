
package models;

public class Student {
    private String name;
    private int tuoi;
    private double gpa;


    public Student() {
    }

    public Student(double gpa, int tuoi, String name) {
        this.gpa = gpa;
        this.tuoi = tuoi;
        this.name = name;
    }

    public Student(String duongQuangSon, int i) {

    }


    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", tuoi=" + tuoi +
                ", gpa=" + gpa +
                '}';
    }
}