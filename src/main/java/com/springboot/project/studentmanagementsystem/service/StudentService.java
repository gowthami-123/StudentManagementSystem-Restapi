package com.springboot.project.studentmanagementsystem.service;

import com.springboot.project.studentmanagementsystem.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAll();
    Student findStudentById(int theId);

    Student saveStudent(Student theStudent);
    void deleteByStudentId(int theId);
}
