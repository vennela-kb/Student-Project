package com.training.studentproject.services;

import com.training.studentproject.model.Student;

import java.util.List;

public interface StuService {
    Student addStudent(Student student);

    List<Student> getTotalStudents();

    void deleteStudent(Integer id);

    Student updateStudentData(Integer id, Student student);

    Student getStuData(Integer id);
}
