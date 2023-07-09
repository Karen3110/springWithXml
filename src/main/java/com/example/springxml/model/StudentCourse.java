package com.example.springxml.model;

public class StudentCourse {

    private Course course;

    private Student student;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "StudentCourse{" +
                "course=" + course +
                ", student=" + student +
                '}';
    }
}
