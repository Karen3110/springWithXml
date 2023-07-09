package com.example.springxml.service;

import com.example.springxml.model.Course;

public class CourseService {

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
}
