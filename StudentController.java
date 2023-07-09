package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.service.StudentService;

@RestController
@RequestMapping("/")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@GetMapping("/student")
	public String homePage() {
		return "Hello Web Page";
	}
	
	@PostMapping("/save")
	public Student saveData(@RequestBody Student student) {
		return studentService.saveData(student);
	}

	@GetMapping("/get/{id}")
	public Student getStudentById(@PathVariable Integer id) {
		return studentService.getStudentById(id);
		 
	}
	@DeleteMapping("/delete/{id}")
	public String deleteStudentById(@PathVariable Integer id) {
		studentService.deleteStudentById(id);
		return "data deleted.....";
		 
	}

	@GetMapping("/getall")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}


}
