package com.klu.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klu.Model.StudentModel;
import com.klu.Service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentService service;

    // Welcome
    @GetMapping("/greet")
    public String getWelcomeMessage() {
        return service.getWelcomeMessage();
    }

    // CREATE
    @PostMapping("/student/add")
    public StudentModel createStudent(@RequestBody StudentModel student) {
        return service.createStudent(student);
    }

    // GET ALL
    @GetMapping("/student/getall")
    public List<StudentModel> getAllStudents() {
        return service.getAllStudents();
    }

    // GET BY ID
    @GetMapping("/student/{id}")
    public StudentModel getStudentById(@PathVariable int id) {
        return service.getStudentById(id);
    }

    // UPDATE
    @PutMapping("/student/update/{id}")
    public StudentModel updateStudent(
            @PathVariable int id,
            @RequestBody StudentModel student) {

        return service.updateStudent(id, student);
    }

    // DELETE
    @DeleteMapping("/student/del/{id}")
    public String deleteStudent(@PathVariable int id) {
        return service.deleteStudent(id);
    }

    // SEARCH
    @GetMapping("/student/search")
    public List<StudentModel> searchStudent(
            @RequestParam String name,
            @RequestParam String course) {

        return service.searchStudent(name, course);
    }
}
