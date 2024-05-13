package com.springboot.project.studentmanagementsystem.repository;

import com.springboot.project.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
