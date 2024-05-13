package com.springboot.project.studentmanagementsystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private  String first_name;

    @Column(name="last_name")
    private String last_name;

    @Column(name = "email")
    private String email;

    @Column(name = "mobile_no")
    private long  mobileno;

    @Column(name = "course_name")
    private String course_name;

    public Student()
    {

    }

    public Student(String first_name, String last_name, String email, long mobileno, String course_name) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.mobileno = mobileno;
        this.course_name = course_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMobileno() {
        return mobileno;
    }

    public void setMobileno(long mobileno) {
        this.mobileno = mobileno;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", mobileno=" + mobileno +
                ", course_name='" + course_name + '\'' +
                '}';
    }
}
