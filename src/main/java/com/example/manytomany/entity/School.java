package com.example.manytomany.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String address;

    @ManyToMany(mappedBy = "schools")
    private List<Student> students = new ArrayList<>();

    public School() {
    }

    public School(String address) {
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
