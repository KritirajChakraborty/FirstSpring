package com.Kritiraj.hello_spring;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepository {
    Map<Integer,Student> studentDb = new HashMap<>();

    public Student getStudent(int admno) {
        return studentDb.get(admno);
    }
    public String postStudent(Student student) {
        studentDb.put(student.getAdmissionID(),student);
        return "Student Added Succesfully!!!!!";
    }
}
