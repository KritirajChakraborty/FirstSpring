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

    // API endpoints

    @GetMapping("/get-student") // www.student-app.com/get-student?id=1000
    public Student getStudentByRequestParam(@RequestParam("id") int admno) {
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


