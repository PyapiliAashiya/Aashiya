package amazonapp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RestController;

import amazonapp.beam.Student;
import amazonapp.service.StudentService;

@RestController
public class StudentContoller {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping(value="/addstudent")
	Student addStudent( @RequestAttribute Student student) {
	Student stu =	studentService.addStudent(student);
		return stu;
	}

}
