package com.springboot.project.studentmanagementsystem.restcontroller;

import com.springboot.project.studentmanagementsystem.entity.Student;
import com.springboot.project.studentmanagementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private StudentService studentService;

    @Autowired
    public StudentRestController(StudentService theStudentService)
    {
     studentService=theStudentService;
    }

    @GetMapping("/students")
    public List<Student> findAll()
    {
        return studentService.findAll();
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId)
    {
        Student theStudent= studentService.findStudentById(studentId);
        if(theStudent==null)
        {
            throw new RuntimeException("Employee id not found -"+ studentId);
        }
        return theStudent;
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student theStudent)
    {
     Student student= studentService.saveStudent(theStudent);
     return student;
    }

    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student)
    {
        Student thestudent= studentService.saveStudent(student);
        return thestudent;
    }

    @DeleteMapping("/students/{studentId}")
    public String deleteStudent(@PathVariable int studentId)
    {
        Student student=studentService.findStudentById(studentId);
        if(student==null)
        {
            throw new RuntimeException("Student  doesn't exist-"+ studentId);
        }

        studentService.deleteByStudentId(studentId);
        return  "Deleted Student  Id: "+studentId;
    }


}
