package com.example.JavaTyo.controller;

import java.util.ArrayList;
import java.util.List;
import com.example.JavaTyo.model.Course;
import com.example.JavaTyo.model.Student;

public class SchoolController {
    private List<Course> courses = new ArrayList<>();
    private List<Student> students = new ArrayList<>();

    public void addCourse(Long courseId, String courseName){
        this.courses.add(new Course(courseId, courseName));
    }

    public void addStudent(Long Id, String firstName, String lastName){
        this.students.add(new Student(Id, firstName, lastName));
    }

    public Course findCourse(int courseId){
        for (Course c : this.courses){
            if(c.getId()== courseId){
                return c;
            }
        }
        return null;
    }

    public Student findStudent(int Id){
        for (Student s : this.students){
            if(s.getId()== Id){
                return s;
            }
        }
        return null;
    }

    public boolean addStudentCourse(int courseId, int Id){

        Course course = findCourse(courseId);
        Student student = findStudent(Id);

        if(course != null && student != null){
            course.addStudent(student);
            return true;
        }

        return false;
    }

    public List<Course> getCourses(){
        return new ArrayList<>(this.courses);
    }

    public List<Student> getStudents(){
        return new ArrayList<>(this.students);
    }
}

