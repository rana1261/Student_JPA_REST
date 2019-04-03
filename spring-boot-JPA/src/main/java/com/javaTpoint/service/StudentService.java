package com.javaTpoint.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaTpoint.model.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	public List<Student>getAllStudent(){
		
		
		List<Student>student = new ArrayList<>();
		studentRepository.findAll().forEach(student::add);
		return student;
	}
	
	 public Optional <Student> getStudent(Long id){  
	     return studentRepository.findById(id);
	    } 
	 
	 public void addStudent(Student student){  
	    studentRepository.save(student); 
	    }
	 
	 public void studentDelete(Long id){  
		 studentRepository.deleteById(id);  
	    }

	 public Optional <Student> studentUpdate(Long id){  
	     return studentRepository.findById(id);
	    }

	 
	
}
