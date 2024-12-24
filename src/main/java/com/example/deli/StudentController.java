package com.example.deli;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/register")
    public ResponseEntity<Student> registerStudent(@RequestBody Student student){
        Student registeredStudent = studentService.registerStudent(student);
        return ResponseEntity.ok(registeredStudent);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Student>> getAllStudent(){
        List<Student> students = studentService.getAllStudents();
        return ResponseEntity.ok(students);
    }

}
