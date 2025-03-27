package loose.oose.fis.lab.student.manager.model;

import java.util.Objects;

public class Profesor {
    private String firstName;
    private String lastName;
    private String subject;

    public Student(String firstName, String lastName, int age, double meanGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", subject=" + subject +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profesor profesor = (Profesor) o;
        return Objects.equals(subject, profesor.subject) &&
                Objects.equals(firstName, profesor.firstName) &&
                Objects.equals(lastName, profesor.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, subject);
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}
