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

    @OneToMany(mappedBy = "school", cascade = CascadeType.ALL)
    private List<SchoolStudent> schoolStudents = new ArrayList<>();

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

    public List<SchoolStudent> getSchoolStudents() {
        return schoolStudents;
    }

    public void setSchoolStudents(List<SchoolStudent> schoolStudents) {
        this.schoolStudents = schoolStudents;
    }
}
