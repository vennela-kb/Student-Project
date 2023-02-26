package com.training.studentproject.repository;

import com.training.studentproject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StuRepository extends JpaRepository<Student,Integer> {
}
