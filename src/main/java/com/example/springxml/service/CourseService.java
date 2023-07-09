package com.example.springxml.service;

import com.example.springxml.model.Course;

public class CourseService {

    public Course getCourseById(int id) {


        Course course = new Course();
        course.setId(id);
        course.setName("SOME COURSE NAME BY ID");

        return course;
    }

}
