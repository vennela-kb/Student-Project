package com.training.studentproject.services.impl;

import com.training.studentproject.model.Student;
import com.training.studentproject.repository.StuRepository;
import com.training.studentproject.services.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StuImplService implements StuService {
    @Autowired
    private StuRepository stuRepository;
    @Override
    public Student addStudent(Student student) {

        return this.stuRepository.save(student);
    }

    @Override
    public List<Student> getTotalStudents() {

        return this.stuRepository.findAll();
    }

    @Override
    public void deleteStudent(Integer id) {
        this.stuRepository.deleteById(id);
    }

    @Override
    public Student updateStudentData(Integer id, Student student) {
       Student student1 = this.stuRepository.findById(id).get();
       student1.setStuName(student.getStuName());
       student1.setStuDesignation(student.getStuDesignation());
       student1.setStuEmail(student.getStuEmail());
       this.stuRepository.save(student1);
        return student1;
    }

    @Override
    public Student getStuData(Integer id) {
        return this.stuRepository.findById(id).get();
    }
}
