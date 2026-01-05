package com.Kritiraj.hello_spring;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepository {
    Map<Integer,Student> studentDb = new HashMap<>();
    Map<Integer,Teacher> teacherDb = new HashMap<>();

    public Student getStudent(int admno) {
        return studentDb.get(admno);
    }
    public String postStudent(Student student) {
        studentDb.put(student.getAdmissionID(),student);
        return "Student Added Succesfully!!!!!";
    }

    //teacher repo
    public void addTeacher(Teacher teacher) {
        teacherDb.put(teacher.getID(),teacher);
        return;
    }

    public Teacher getTeacherByName(String name) {
        for(Integer teacherID : teacherDb.keySet()) {
            if(teacherDb.get(teacherID).getName().equals(name)) {
                return teacherDb.get(teacherID);
            }
        }
        return null;
    }
}
