package chapter6.student;

import java.util.Objects;
import java.util.Random;

/**
 * Abstract class. Parent for entity student.
 *
 * Ahtirskij Yuriy 09.08.2021
 */
public abstract class Student implements IEnrollee{
    private long id;
    private String name;
    private String address;
    private String university;
    private String faculty;
    private String speciality;
    private double average;
    private double znoResult;

    //==================== Constructors ====================
    public Student() {
        this.id=generateID();
    }

    public Student(String name, String address, double znoResult) {
        this.name = name;
        this.address = address;
        this.znoResult = znoResult;
    }

    public Student(String name, String address, String university, String faculty, String speciality, double znoResult) {
        this.name = name;
        this.address = address;
        this.university = university;
        this.faculty = faculty;
        this.speciality = speciality;
        this.znoResult = znoResult;
    }

    //==================== Getters and setters ====================
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public double getZnoResult() {
        return znoResult;
    }

    public void setZnoResult(double znoResult) {
        this.znoResult = znoResult;
    }

    //==================== Overridden methods ====================
    @Override
    public String toString() {
        return "Student: " + name +
                "\naddress: " + address +
                "\nuniversity: " + university +
                "\nfaculty: " + faculty +
                "\nspeciality: " + speciality +
                "\naverage: " + average;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                Double.compare(student.average, average) == 0 &&
                Double.compare(student.znoResult, znoResult) == 0 &&
                Objects.equals(name, student.name) &&
                Objects.equals(address, student.address) &&
                Objects.equals(university, student.university) &&
                Objects.equals(faculty, student.faculty) &&
                Objects.equals(speciality, student.speciality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, university, faculty, speciality, average, znoResult);
    }

    //==================== Abstract methods ====================
    @Override
    public abstract boolean enroll(String university, String faculty, String speciality);

    @Override
    public abstract boolean expel();

    //==================== Helping methods ====================
    /**
     * Generate random id for student.
     *
     * @return - random id.
     */
    private long generateID(){
        Random random=new Random();
        return random.nextLong();
    }
}
