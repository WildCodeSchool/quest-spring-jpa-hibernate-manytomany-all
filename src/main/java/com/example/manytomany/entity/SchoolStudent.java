package com.example.manytomany.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class SchoolStudent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @JoinColumn(name = "school_id")
    private School school;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    private Date inscription;

    public SchoolStudent() {
    }

    public SchoolStudent(School school, Student student) {
        this.school = school;
        this.student = student;
        inscription = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
