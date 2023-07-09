package com.example.springxml.service.impl;

import com.example.springxml.model.Student;
import com.example.springxml.service.Service;

public class StudentService implements Service {

    private String defaultStudentName;

    public Student getStudentById(int id) {


        Student student = new Student();
        student.setId(id);
        student.setName("SOME STUDENT NAME BY ID");

        return student;
    }

    public void setDefaultStudentName(String defaultStudentName) {
        this.defaultStudentName = defaultStudentName;
    }

    @Override
    public String getClassName() {
        return getClass().getName();
    }
}
