package com.example.springxml.service.impl;

import com.example.springxml.model.Course;
import com.example.springxml.service.Service;

public class CourseService implements Service {

    private String defaultCourseName;

    public Course getCourseById(int id) {


        Course course = new Course();
        course.setId(id);
        course.setName(defaultCourseName);

        return course;
    }

    public void setDefaultCourseName(String defaultCourseName) {
        this.defaultCourseName = defaultCourseName;
    }

    @Override
    public String getClassName() {
        return getClass().getName();
    }
}
