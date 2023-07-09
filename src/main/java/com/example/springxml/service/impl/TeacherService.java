package com.example.springxml.service.impl;

import com.example.springxml.model.Course;
import com.example.springxml.model.Teacher;
import com.example.springxml.service.Service;

public class TeacherService  implements Service {
    private String defaultTeacherName;

    private final CourseService courseService;

    public TeacherService(CourseService courseService, String teacherDefaultName) {
        this.courseService = courseService;
        this.defaultTeacherName = teacherDefaultName;
    }

    public Teacher getTeacherById(int id) {
        Teacher teacher = new Teacher();
        teacher.setId(id);
        teacher.setName(defaultTeacherName);

        return teacher;
    }


    public Teacher assignCourse(int teacherId, int courseId) {
        Teacher teacherById = getTeacherById(teacherId);
        Course courseById = courseService.getCourseById(courseId);

        teacherById.setCourse(courseById);
        return teacherById;
    }

    public void setDefaultTeacherName(String defaultTeacherName) {
        this.defaultTeacherName = defaultTeacherName;
    }

    @Override
    public String getClassName() {
        return getClass().getName();
    }
}
