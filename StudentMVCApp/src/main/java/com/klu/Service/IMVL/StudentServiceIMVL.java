package com.klu.Service.IMVL;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.klu.Model.StudentModel;
import com.klu.Service.StudentService;

@Service
public class StudentServiceIMVL implements StudentService {

    private List<StudentModel> studentList = new ArrayList<>();

    @Override
    public String getWelcomeMessage() {
        return "Welcome to Student MVC CRUD Operations";
    }

    // CREATE
    @Override
    public StudentModel createStudent(StudentModel student) {
        studentList.add(student);
        return student;
    }

    // READ BY ID
    @Override
    public StudentModel getStudentById(int id) {

        for (StudentModel s : studentList) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    // GET ALL
    @Override
    public List<StudentModel> getAllStudents() {
        return studentList;
    }

    // UPDATE
    @Override
    public StudentModel updateStudent(int id, StudentModel student) {

        for (int i = 0; i < studentList.size(); i++) {

            if (studentList.get(i).getId() == id) {

                student.setId(id);
                studentList.set(i, student);

                return student;
            }
        }

        return null;
    }

    // DELETE
    @Override
    public String deleteStudent(int id) {

        for (int i = 0; i < studentList.size(); i++) {

            if (studentList.get(i).getId() == id) {

                studentList.remove(i);
                return "Student record deleted";
            }
        }

        return "No student record found";
    }

    // SEARCH
    @Override
    public List<StudentModel> searchStudent(String name, String course) {

        List<StudentModel> result = new ArrayList<>();

        for (StudentModel s : studentList) {

            if (s.getName().equalsIgnoreCase(name)
                    && s.getCourse().equalsIgnoreCase(course)) {

                result.add(s);
            }
        }

        return result;
    }
}
