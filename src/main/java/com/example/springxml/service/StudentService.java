package com.example.springxml.service;

import com.example.springxml.model.Student;

public class StudentService {


    public Student getStudentById(int id) {


        Student student = new Student();
        student.setId(id);
        student.setName("SOME STUDENT NAME BY ID");

        return student;
    }


}
