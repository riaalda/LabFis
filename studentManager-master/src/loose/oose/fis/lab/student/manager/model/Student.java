package loose.oose.fis.lab.student.manager.model;

import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private double meanGrade;
    private int year;
    private Boolean scholarshipEligible;

    public Student(String firstName, String lastName, int age, double meanGrade, int year, Boolean scholarshipEligible) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.meanGrade = meanGrade;
        this.year = year;
        this.scholarshipEligible = scholarshipEligible;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", meanGrade=" + meanGrade +
                ", year=" + year +
                ", scholarshipEligible=" + scholarshipEligible +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Double.compare(student.meanGrade, meanGrade) == 0 &&
                Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName) &&
                year == student.year &&
                Objects.equals(scholarshipEligible, student.scholarshipEligible);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, meanGrade, year, scholarshipEligible);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMeanGrade() {
        return meanGrade;
    }

    public void setMeanGrade(double meanGrade) {
        this.meanGrade = meanGrade;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Boolean getScholarshipEligible() {
        return scholarshipEligible;
    }

    public void setScholarshipEligible(Boolean scholarshipEligible) {
        this.scholarshipEligible = scholarshipEligible;
    }
}
