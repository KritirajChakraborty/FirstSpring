package com.Kritiraj.hello_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    public Student getStudent(int admno) {
       return studentRepository.getStudent((admno));
    }
    public String postStudent(Student student) {
        return studentRepository.postStudent(student);
    }
}
