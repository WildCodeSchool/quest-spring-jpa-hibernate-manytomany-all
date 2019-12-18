package com.example.manytomany.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
@IdClass(SchoolStudentId.class)
public class SchoolStudent {

    @Id
    @ManyToOne
    @JoinColumn(name = "school_id")
    @JsonIgnore
    private School school;

    @Id
    @ManyToOne
    @JoinColumn(name = "student_id")
    @JsonIgnore
    private Student student;

    private Date inscription;

    public SchoolStudent() {
    }

    public SchoolStudent(School school, Student student) {
        this.school = school;
        this.student = student;
        this.inscription = new Date();
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
