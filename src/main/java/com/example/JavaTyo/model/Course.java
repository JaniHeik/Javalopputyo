package com.example.JavaTyo.model;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private long courseId;
    private String courseName;

    private List<Course> schoolCourses = new ArrayList<>();
    private List<Student> schoolStudents = new ArrayList<>();

    public Course() {}
    public Course(long courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public long getId() {
        return courseId;
    }

    public void setId(long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                '}';
    }

    public void addStudent(Student student) {
        schoolStudents.add(student);
    }

    public List<Course> getSchoolCourses(){
        return new ArrayList<>(this.schoolCourses);
    }
}
