package com.Kritiraj.hello_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
     StudentService studentService;


    // API endpoints

    @GetMapping("/get-student") // www.student-app.com/student/get-student?id=1000
    public ResponseEntity<Student> getStudentByRequestParam(@RequestParam("id") int admno) {
        Student student = studentService.getStudent(admno);
        return new ResponseEntity<Student>(student, HttpStatus.OK);
    }

    @GetMapping("/get-student/{id}") // www.student-app.com/student/get-student/1000
    public ResponseEntity<Student> getStudentByPathVariable(@PathVariable("id") int admno) {
        Student student = studentService.getStudent(admno);
        return new ResponseEntity<Student>(student,HttpStatus.OK);
    }

    @PostMapping("/add") //www.student-app.com/student/add
    public ResponseEntity<String> addStudent(@RequestBody Student student) {
        String message = studentService.postStudent(student);
        return new ResponseEntity<String>(message,HttpStatus.CREATED);
    }

    //WRITING TEACHER CONTROLLER HERE FOR BETTER SIMPLICITY
    @GetMapping("/get-teacher-by-name")
    public ResponseEntity<Teacher> getTeacher(@RequestParam("name") String name) {
        Teacher teacher = studentService.getTeacherByName(name);
        return new ResponseEntity<Teacher>(teacher,HttpStatus.FOUND);
    }

    @PostMapping("add-teacher")
    public ResponseEntity<String> addTeacher(@RequestBody Teacher teacher) {
        String message = studentService.addTeacher(teacher);
        return new ResponseEntity<String>(message,HttpStatus.CREATED);
    }
}


