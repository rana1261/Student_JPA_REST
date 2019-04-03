package com.javaTpoint.service;

 




import org.springframework.data.jpa.repository.JpaRepository;


import com.javaTpoint.model.Student;

 
public interface StudentRepository extends JpaRepository<Student, Long> {  
	
} 