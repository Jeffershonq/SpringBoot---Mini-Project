package com.jeff_miniproj.controller;

import com.jeff_miniproj.model.Student;
import com.jeff_miniproj.service.StudentSerive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentSerive studentSerive;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentSerive.saveStudent(student);
        return "New Student is added";
    }

    @GetMapping("/GetAll")
    public List<Student> getAllStudents(){
        return studentSerive.getAllStudents();
    }
}
