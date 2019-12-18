package com.example.manytomany.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

public class SchoolStudentId implements Serializable {

    private School school;

    private Student student;

    public SchoolStudentId() {
    }

    public SchoolStudentId(School school, Student student) {
        this.school = school;
        this.student = student;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SchoolStudentId that = (SchoolStudentId) o;
        return Objects.equals(school, that.school) &&
                Objects.equals(student, that.student);
    }

    @Override
    public int hashCode() {
        return Objects.hash(school, student);
    }
}
