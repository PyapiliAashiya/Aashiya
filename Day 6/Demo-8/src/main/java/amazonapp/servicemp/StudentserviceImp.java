package amazonapp.servicemp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import amazonapp.beam.Student;
import amazonapp.repository.MyLocalRepository;
import amazonapp.service.StudentService;

@Service
public class StudentserviceImp implements StudentService {
	
	@Autowired
	MyLocalRepository mylocalRepository;
	@Override
	public Student addStudent(Student student) {
		Student studentadded=mylocalRepository.save(student);
		return studentadded;
	}
	

}