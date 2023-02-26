package com.training.studentproject.controller;

import com.training.studentproject.model.Student;
import com.training.studentproject.services.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/stumanagement")
public class StuController {

    @Autowired
    private StuService stuService;

 //Logger logger = LoggerFactory.getLogger(StuController.class);

    //add student
    @PostMapping("/add")
    public Student addNewStudent(@RequestBody Student student){
        return this.stuService.addStudent(student);
    }

    //get all student
    @GetMapping("/all")
    public List<Student> getAllStudents(){

        return this.stuService.getTotalStudents();
    }

    //delete student
    @DeleteMapping("/all/{id}")
    public void deleteStu(@PathVariable Integer id){
        this.stuService.deleteStudent(id);
    }

    //update existing student
    @PutMapping("/{id}")
    public Student updateStuData(@PathVariable Integer id, @RequestBody Student student){
        return this.stuService.updateStudentData(id,student);
    }
    //get single student
    @GetMapping("/{id}")
    public Student getStudentData(@PathVariable Integer id){
        return this.stuService.getStuData(id);
    }
}
