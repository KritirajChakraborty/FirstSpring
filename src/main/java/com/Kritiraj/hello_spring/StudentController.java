package com.Kritiraj.hello_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
     StudentService studentService;


    // API endpoints

    @GetMapping("/get-student") // www.student-app.com/student/get-student?id=1000
    public ResponseEntity getStudentByRequestParam(@RequestParam("id") int admno) {
        Student student = studentService.getStudent(admno);
        return new ResponseEntity(student, HttpStatus.OK);
    }

    @GetMapping("/get-student/{id}") // www.student-app.com/student/get-student/1000
    public ResponseEntity getStudentByPathVariable(@PathVariable("id") int admno) {
        Student student = studentService.getStudent(admno);
        return new ResponseEntity(student,HttpStatus.OK);
    }

    @PostMapping("/add") //www.student-app.com/student/add
    public ResponseEntity addStudent(@RequestBody Student student) {
        String message = studentService.postStudent(student);
        return new ResponseEntity(message,HttpStatus.CREATED);
    }
}


