package com.example.minor1.controllers;

import com.example.minor1.dtos.CreateStudentRequest;
import com.example.minor1.models.Student;
import com.example.minor1.services.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/student")
    public void createStudent(@RequestBody @Valid CreateStudentRequest studentRequest){
        studentService.create(studentRequest.to());
    }


    @GetMapping("/student")
    public Student findStudent(@RequestParam("id") int studentId){
        return studentService.find(studentId);
    }
}
