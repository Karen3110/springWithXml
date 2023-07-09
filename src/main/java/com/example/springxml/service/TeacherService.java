package com.example.springxml.service;

import com.example.springxml.model.Course;
import com.example.springxml.model.Teacher;

public class TeacherService {


    private final CourseService courseService;

    public TeacherService(CourseService courseService) {
        this.courseService = courseService;
    }

    public Teacher getTeacherById(int id) {
        Teacher teacher = new Teacher();
        teacher.setId(id);
        teacher.setName("SOME TEACHER NAME");

        return teacher;
    }


    public Teacher assignCourse(int teacherId, int courseId) {
        Teacher teacherById = getTeacherById(teacherId);
        Course courseById = courseService.getCourseById(courseId);

        teacherById.setCourse(courseById);
        return teacherById;
    }
}
