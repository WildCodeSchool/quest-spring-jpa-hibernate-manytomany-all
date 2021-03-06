package com.example.manytomany.controller;

import com.example.manytomany.entity.School;
import com.example.manytomany.entity.Student;
import com.example.manytomany.repository.SchoolRepository;
import com.example.manytomany.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @Autowired
    private SchoolRepository schoolRepository;

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/init")
    @ResponseBody
    public String init() {

        studentRepository.deleteAll();
        schoolRepository.deleteAll();

        School toulouse = schoolRepository.save(new School("Toulouse"));
        School bordeaux = schoolRepository.save(new School("Bordeaux"));
        School lyon = schoolRepository.save(new School("Lyon"));

        Student charlie = studentRepository.save(new Student("Charlie"));

        return charlie.getName();
    }
}