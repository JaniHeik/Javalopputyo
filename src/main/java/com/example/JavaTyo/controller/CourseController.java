package com.example.JavaTyo.controller;

import com.example.JavaTyo.model.Course;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/courses")
public class CourseController {
    private List<Course> courses = new ArrayList<Course>();

    @RequestMapping()
    public List<Course> getCourseDetails() {

        return courses;
    }

    @GetMapping("/{courseId}")
    public Course getCourse(@PathVariable(name ="courseId") long courseId) {
        Optional<Course> course = courses.stream().filter(e -> e.getId() == courseId).findFirst();


        return course.get();
    }

    @DeleteMapping("/{courseId}")
    public String deleteCourse(@PathVariable(name ="courseId") long courseId) {
        Optional<Course> course = courses.stream().filter(e -> e.getId() == courseId).findFirst();

        if (course.isEmpty()) {
            return "Course with courseId " + courseId + " is not found.";
        }
        System.out.println(course.get());
        courses.remove(course.get());
        System.out.println(courses);
        return "Course with Id " + courseId + " is deleted;";
    }

    @PutMapping
    public String updateCourse(@RequestBody Course course) {
        Optional<Course> courseFound = courses.stream().filter(e -> e.getId() == course.getId()).findFirst();

        if (courseFound.isEmpty()) {
            return "Course with courseId " + course.getId() + " is not found.";
        }
        System.out.println(courseFound.get());
        courses.remove(courseFound.get());
        courses.add(course);
        System.out.println(courses);
        return "Course with Id " + course.getId() + " is updated;";
    }

    @PostMapping
    public List<Course> addCourse(@RequestBody Course course) {
        courses.add(course);
        return courses;
    }
}