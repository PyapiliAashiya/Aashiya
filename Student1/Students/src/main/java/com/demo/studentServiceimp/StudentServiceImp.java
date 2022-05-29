package com.demo.studentServiceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.studentRepository.StudentRepository;
import com.demo.studentservice.StudentService;

@Service
public class StudentServiceImp  implements StudentService{

	@Autowired
	StudentRepository studentRepository;
	@Override
	//delete by id
public void deleteStudentById(long id) {
		
		studentRepository.deleteById(id); 
	
}
}
