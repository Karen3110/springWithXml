package com.example.springxml;

import com.example.springxml.model.Course;
import com.example.springxml.model.Student;
import com.example.springxml.model.StudentCourse;
import com.example.springxml.model.Teacher;
import com.example.springxml.service.ServiceHolder;
import com.example.springxml.service.impl.CourseService;
import com.example.springxml.service.impl.StudentCourseService;
import com.example.springxml.service.impl.StudentService;
import com.example.springxml.service.impl.TeacherService;
import com.example.springxml.util.ServiceBeanNames;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"beans.xml"});


        StudentService studentService = context.getBean(ServiceBeanNames.STUDENT_SERVICE_NAME, StudentService.class);
        CourseService courseService = context.getBean(ServiceBeanNames.COURSE_SERVICE_NAME, CourseService.class);
        TeacherService teacherService = context.getBean(ServiceBeanNames.TEACHER_SERVICE_NAME, TeacherService.class);
        StudentCourseService studentCourseService = context.getBean(ServiceBeanNames.STUDENT_COURSE_SERVICE, StudentCourseService.class);
        Random random = context.getBean(ServiceBeanNames.RANDOM_NUMBERS_GENERATOR, Random.class);

        System.out.println("---------------------GET STUDENT---------------------");
        Student studentById = studentService.getStudentById(random.nextInt());
        System.out.println(studentById);

        System.out.println("\n---------------------GET TEACHER---------------------");
        Course courseById = courseService.getCourseById(random.nextInt());
        System.out.println(courseById);


        System.out.println("\n---------------------GET TEACHER AND ASSIGN COURSE---------------------");
        Teacher teacherById = teacherService.getTeacherById(random.nextInt());
        teacherById = teacherService.assignCourse(teacherById.getId(), courseById.getId());
        System.out.println(teacherById);


        System.out.println("\n---------------------GET STUDENT AND COURSE MAPPING---------------------");
        StudentCourse studentCourse = studentCourseService.assignStudentToCourse(courseById.getId(), studentById.getId());
        System.out.println(studentCourse);

        System.out.println("\n---------------------GET ALL ACtIVE SERVICES NAMES---------------------");
        ServiceHolder serviceHolder = context.getBean(ServiceBeanNames.SERVICE_HOLDER_NAME, ServiceHolder.class);
        serviceHolder.getServiceNames();

    }
}
