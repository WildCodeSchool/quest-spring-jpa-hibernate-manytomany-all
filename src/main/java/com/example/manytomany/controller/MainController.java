package com.example.manytomany.controller;

import com.example.manytomany.entity.School;
import com.example.manytomany.entity.SchoolStudent;
import com.example.manytomany.entity.Student;
import com.example.manytomany.repository.SchoolRepository;
import com.example.manytomany.repository.SchoolStudentRepository;
import com.example.manytomany.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    private SchoolRepository schoolRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private SchoolStudentRepository schoolStudentRepository;

    @GetMapping("/init")
    @ResponseBody
    public String init() {

        School toulouse = schoolRepository.findById(34L).get();
        Student michel = studentRepository.findById(18L).get();

        //schoolStudentRepository.deleteByStudentAndSchool(charlie, toulouse);
        SchoolStudent delete = null;
        for (SchoolStudent schoolStudent : toulouse.getSchoolStudents()) {
            if (schoolStudent.getStudent().equals(michel)) {
                delete = schoolStudent;
                break;
            }
        }
        if (delete != null) {
            toulouse.getSchoolStudents().remove(delete);
        }
        schoolRepository.save(toulouse);

        return "does it works ?";
    }
}