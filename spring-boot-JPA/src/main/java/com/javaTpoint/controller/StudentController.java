package com.javaTpoint.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javaTpoint.model.Student;
import com.javaTpoint.service.StudentService;

@RestController
public class StudentController {

	@Autowired
    private StudentService studentService;
	
	@RequestMapping("/")
	public List<Student>getAllStudent(){
		
		return studentService.getAllStudent();
		
	}
	
    @RequestMapping(value="/add-student", method=RequestMethod.POST)  
    public void addStudent(@RequestBody Student student){  
        studentService.addStudent(student);  
    }
    
    @RequestMapping(value="/get-student/{id}", method=RequestMethod.GET)  
    public Optional<Student> getStudent(@PathVariable Long id){  
        return studentService.getStudent(id);  
    } 
    
    @RequestMapping(value="/delete-student/{id}", method=RequestMethod.DELETE)
    public void studentDelete(@PathVariable Long id) {
    	studentService.studentDelete(id);
    };
    
    @RequestMapping(value="/update-student/{id}", method=RequestMethod.PUT)
    public void studentUpdate(@RequestBody Student student, @PathVariable long id){
    	studentService.studentUpdate(id);
    	student.setId(id);
    	studentService.addStudent(student);
 
    }

    
}
