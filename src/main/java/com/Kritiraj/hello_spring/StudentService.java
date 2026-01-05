package com.Kritiraj.hello_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<String> getAllStudents () {
        return studentRepository.getAllStudents();
    }

    public String deleteTeacherByName (String name) {
        studentRepository.deleteTeacherByName(name);
        return "Teacher deleted succesfully!!!";
    }

    public String addStudentTeacherPair(int studentID, int teacherID) {
        studentRepository.addStudentTeacherPair(studentID,teacherID);
        return "Student-Teacher Relation created successfully!!!";
    }

    public List<String> getStudentsByTeacher(int teacherID) {
        return studentRepository.getStudentsByTeacher(teacherID);
    }
}
