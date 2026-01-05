package com.Kritiraj.hello_spring;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    StudentRepository studentRepository = new StudentRepository();
    public Student getStudent(int admno) {
       return studentRepository.getStudent((admno));
    }
    public String postStudent(Student student) {
        return studentRepository.postStudent(student);
    }
}
