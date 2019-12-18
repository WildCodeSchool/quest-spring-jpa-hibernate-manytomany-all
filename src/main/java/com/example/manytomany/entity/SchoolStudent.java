package com.example.manytomany.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class SchoolStudent {

    @EmbeddedId
    private SchoolStudentId id;

    @ManyToOne
    @MapsId("school_id")
    @JoinColumn(name = "school_id")
    private School school;

    @ManyToOne
    @MapsId("student_id")
    @JoinColumn(name = "student_id")
    private Student student;

    private Date inscription;

    public SchoolStudent() {
    }

    public SchoolStudent(School school, Student student) {
        this.id = new SchoolStudentId(school.getId(), student.getId());
        this.school = school;
        this.student = student;
        this.inscription = new Date();
    }

    public SchoolStudentId getId() {
        return id;
    }

    public void setId(SchoolStudentId id) {
        this.id = id;
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

    public Date getInscription() {
        return inscription;
    }

    public void setInscription(Date inscription) {
        this.inscription = inscription;
    }
}
