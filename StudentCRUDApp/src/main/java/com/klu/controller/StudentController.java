package com.klu.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klu.model.Student;
import com.klu.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentService service;

  
    // CREATE
    @PostMapping("/student/add")
    public Student createStudent(@RequestBody Student student) {
        return service.createStudent(student);
    }

    // GET ALL
    @GetMapping("/student/getall")
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    // GET BY ID
    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable int id) {
        return service.getStudentById(id);
    }

    // UPDATE
    @PutMapping("/student/update/{id}")
    public Student updateStudent(
            @PathVariable int id,
            @RequestBody Student student) {

        return service.updateStudent(id, student);
    }

    // DELETE
    @DeleteMapping("/student/del/{id}")
    public String deleteStudent(@PathVariable int id) {
        return service.deleteStudent(id);
    }

    // SEARCH
    @GetMapping("/student/search")
    public List<Student> searchStudent(
            @RequestParam String name,
            @RequestParam String course) {

        return service.searchStudent(name, course);
    }
}
