package com.Kritiraj.hello_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

    //this is how IOC works, below is bean(object created and maintained by Spring)
    @Autowired
     StudentService studentService;
    @Autowired
    StudentService studentService1;

    //the above 2 are having the prototype annotation
    //the below 2 are using the default singleton annotation
    //print them both in functions to see
    @Autowired
    StudentRepository sr;
    @Autowired
    StudentRepository sr1;

    // API endpoints

    @GetMapping("/get-student") // www.student-app.com/get-student?id=1000
    public Student getStudentByRequestParam(@RequestParam("id") int admno) {
        System.out.println(String.valueOf(studentService));
        System.out.println(String.valueOf(studentService1));
        System.out.println();
        System.out.println(sr==sr1);
        return studentService.getStudent(admno);
    }

    @GetMapping("/get-student/{id}") // www.student-app.com/get-student/1000
    public Student getStudentByPathVariable(@PathVariable("id") int admno) {
        return studentService.getStudent(admno);
    }

    @PostMapping("/add") //www.student-app.com/add
    public String addStudent(@RequestBody Student student) {
        return studentService.postStudent(student);
    }
}


