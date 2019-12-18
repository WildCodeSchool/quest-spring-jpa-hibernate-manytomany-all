package com.example.manytomany.repository;

import com.example.manytomany.entity.School;
import com.example.manytomany.entity.SchoolStudent;
import com.example.manytomany.entity.SchoolStudentId;
import com.example.manytomany.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

public interface SchoolStudentRepository extends JpaRepository<SchoolStudent, SchoolStudentId> {

    @Transactional
    void deleteByStudentAndSchool(Student student, School school);
}
