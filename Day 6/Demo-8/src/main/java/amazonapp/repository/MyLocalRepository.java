package amazonapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import amazonapp.beam.Student;
@Repository
public interface MyLocalRepository extends JpaRepository<Student,Long> {

	

}