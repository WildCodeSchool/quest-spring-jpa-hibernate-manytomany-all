package com.example.manytomany.controller;

import com.example.manytomany.entity.School;
import com.example.manytomany.entity.Student;
import com.example.manytomany.repository.SchoolRepository;
import com.example.manytomany.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    private SchoolRepository schoolRepository;

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/init")
    @ResponseBody
    public List<Student> init() {

        schoolRepository.deleteAll();
        studentRepository.deleteAll();

        School toulouse = schoolRepository.save(new School("Toulouse"));
        School bordeaux = schoolRepository.save(new School("Bordeaux"));
        School lyon = schoolRepository.save(new School("Lyon"));

        List<Student> students = new ArrayList<>();
        Student charlie = studentRepository.save(new Student("Charlie"));
        Student louison = studentRepository.save(new Student("Louison"));
        Student camille = studentRepository.save(new Student("Camille"));
        Student andrea = studentRepository.save(new Student("Andréa"));
        students.add(charlie);
        students.add(louison);
        students.add(camille);
        students.add(andrea);

        return students;
    }
}
