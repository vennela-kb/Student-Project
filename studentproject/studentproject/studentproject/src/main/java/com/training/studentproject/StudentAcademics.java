package com.training.studentproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentAcademics {

    @GetMapping("/")
    public String getStudentsProgress(){
        return "Student has achieved his learning goals";
    }

}
