package com.demo.studentRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.studentbean.Student;
@Repository
public interface StudentRepository  extends JpaRepository<Student, Long>{

}
