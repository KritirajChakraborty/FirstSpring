package com.Kritiraj.hello_spring;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StudentRepository {
    Map<Integer,Student> studentDb = new HashMap<>();
    Map<Integer,Teacher> teacherDb = new HashMap<>();
    Map<Integer,List<Integer>> studentTeacherPair = new HashMap<>();

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
    public List<String> getAllStudents() {
        List<String> list = new ArrayList<>();
        for(Map.Entry<Integer,Student> e: studentDb.entrySet()) {
            list.add(e.getValue().getName());
        }
        return list;
    }

    public void deleteTeacherByName(String name) {
        int id = -1;
        for(Integer teacherID : teacherDb.keySet()) {
            if(teacherDb.get(teacherID).getName().equals(name)) {
                id = teacherID;
                break;
            }
        }
        if(id != -1) {
            teacherDb.remove(id);
            studentTeacherPair.remove(id);
        }
        return;
    }

    public void addStudentTeacherPair (int studentID, int teacherID) {

        if(studentDb.containsKey(studentID) && teacherDb.containsKey(teacherID)) {
            if(!studentTeacherPair.containsKey(teacherID)) {
                studentTeacherPair.put(teacherID,new ArrayList<>());
            }
            studentTeacherPair.get(teacherID).add(studentID);
        }

        return;
    }

    public List<String> getStudentsByTeacher(int teacherID) {
        List<Integer> students = studentTeacherPair.get(teacherID);
        List<String> names = new ArrayList<>();
        for(int id : students) {
            names.add(studentDb.get(id).getName());
        }
        return names;
    }
}
