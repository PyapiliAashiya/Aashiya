package com.demo.studentcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.studentservice.StudentService;

@RestController
public class StudentController {
 // inject the dependency of service class into controller
	@Autowired
	
	StudentService studentService;
	
	//delete by id
	@DeleteMapping(value="/deletestudentbyid/{studentid}")
	ResponseEntity<String> deleteStudentBy(@PathVariable long studentid) {
		try {
			if(studentid==0) {
				return ResponseEntity.ok("pls enter in proper id " + studentid);

			}
			
			studentService.deleteStudentById(studentid);
			return ResponseEntity.ok("Sucessfully deleted " + studentid);
        }catch (Exception e) {
        	return ResponseEntity.ok("Product id does not exists " + studentid);
        }
		
		
}
}

