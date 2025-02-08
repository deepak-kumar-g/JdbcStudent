package com.college.JdbcStudent.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.college.JdbcStudent.model.Student;
import com.college.JdbcStudent.repository.StudentRepository;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	
	@Autowired
	private StudentRepository StudentRepo;
	
	
	//INSERT
	@PostMapping("/add")
    public String addStudent(@RequestBody Student Student) {
        StudentRepo.insertStudent(Student);
        return "Student added successfully!";
    }
	
	//UPDATE
	@PutMapping("/update")
	public String updateStudent(@RequestBody Student Student) {
		StudentRepo.updateStudent(Student);
		return "Student updated successfully";
		
	}
	
	//DELETE
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable Integer id) {
		StudentRepo.deleteStudent(id);
		return "Student deleted successfully";
	}
	
	
}
