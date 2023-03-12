/* 

package com.example.JavaTyo.service;

import com.example.JavaTyo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentFileService myFileService;
    private List<Student> students = new ArrayList<>();


    public StudentService(){
        try {
            students = myFileService.readStudentsFromFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public List<Student> getStudents(){
        return new ArrayList<>(students);
    }

    public List<Student> getStudentsById(Long Id){
        List<Student> foundStudents = new ArrayList<>();

        for(Student b : students){
            if( b.getStudent().equals(Id) ){
                foundStudents.add(b);
            }
        }

        return foundStudents;
    }
}

*/
