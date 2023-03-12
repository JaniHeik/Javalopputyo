/* 
package com.example.JavaTyo.service;

import com.example.JavaTyo.model.Student;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
public class StudentFileService {
    public void writeStudentsToFile(List<Student> students) throws IOException {
        FileWriter fw = new FileWriter(  new File("students.txt"));
    }

    public List<Student> readStudentsFromFile() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("students.txt"));
        List<Student> students = new ArrayList<>();
        //Lue tiedostosta esim. rivi kerrallaan blogit ja luo oliot
        //ja lisää uuteen listaan

        return students;
    }
}
*/