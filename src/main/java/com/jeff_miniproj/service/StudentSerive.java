package com.jeff_miniproj.service;

import com.jeff_miniproj.model.Student;

import java.util.List;

public interface StudentSerive {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();

    void deleteStudent(long id);
}
