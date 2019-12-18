package com.example.manytomany.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@IdClass(SchoolStudentId.class)
public class SchoolStudent {

    @Id
    @ManyToOne
    @JoinColumn(name = "school_id")
    private School school;

    @Id
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    private Date inscription;

    public SchoolStudent() {
    }

    public SchoolStudent(School school, Student student, Date inscription) {
        this.school = school;
        this.student = student;
        this.inscription = inscription;
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
