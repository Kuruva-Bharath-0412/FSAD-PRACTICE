package com.klu.Service;

import java.util.List;
import com.klu.Model.StudentModel;

public interface StudentService {

    String getWelcomeMessage();

    StudentModel createStudent(StudentModel student);

    StudentModel getStudentById(int id);

    List<StudentModel> getAllStudents();

    StudentModel updateStudent(int id, StudentModel student);

    String deleteStudent(int id);

    List<StudentModel> searchStudent(String name, String course);
}
