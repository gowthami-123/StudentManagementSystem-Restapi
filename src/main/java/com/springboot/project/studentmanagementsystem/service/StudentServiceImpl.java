package com.springboot.project.studentmanagementsystem.service;

import com.springboot.project.studentmanagementsystem.entity.Student;
import com.springboot.project.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{
   private  StudentRepository theStudentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository)
    {
        this.theStudentRepository=studentRepository;
    }
    @Override
    public List<Student> findAll() {
        return  theStudentRepository.findAll();
    }

    @Override
    public Student findStudentById(int theId) {
        Optional<Student> result=theStudentRepository.findById(theId);
        Student student=null;
        if(result.isPresent())
        {
            student=result.get();
        }
        else {
            throw new RuntimeException("Did not find the student id -"+ theId);
        }
        return student;
    }

    @Override
    public Student saveStudent(Student theStudent) {
        return theStudentRepository.save(theStudent);
    }

    @Override
    public void deleteByStudentId(int theId) {
        theStudentRepository.deleteById(theId);

    }
}
