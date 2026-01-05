package com.Kritiraj.hello_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    public Student getStudent(int admno) {
       return studentRepository.getStudent((admno));
    }
    public String postStudent(Student student) {
        return studentRepository.postStudent(student);
    }

    //TEACHER SERVICES
    public Teacher getTeacherByName(String name) {
        return studentRepository.getTeacherByName(name);
    }
    public String addTeacher(Teacher teacher) {
        studentRepository.addTeacher(teacher);
        return "Teacher Added Successfully!!!";
    }
}
