package com.example.springxml.service.impl;

import com.example.springxml.model.Course;
import com.example.springxml.model.Student;
import com.example.springxml.model.StudentCourse;
import com.example.springxml.service.Service;

public class StudentCourseService implements Service {
    private StudentService studentService;
    private CourseService courseService;

    // intialization is going to be using setteer methods
//    public StudentCourseService(StudentService studentService, CourseService courseService) {
//        this.studentService = studentService;
//        this.courseService = courseService;
//    }

    public StudentCourse assignStudentToCourse(int courseId, int studentId) {
        Student studentById = studentService.getStudentById(studentId);
        Course courseById = courseService.getCourseById(courseId);


        StudentCourse studentCourse = new StudentCourse();
        studentCourse.setCourse(courseById);
        studentCourse.setStudent(studentById);

        return studentCourse;
    }

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public void setCourseService(CourseService courseService) {
        this.courseService = courseService;
    }

    @Override
    public String getClassName() {
        return getClass().getName();
    }
}
