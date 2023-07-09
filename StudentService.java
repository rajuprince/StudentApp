package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.repository.StudentRepo;

@Service
public class StudentService {

	@Autowired
	StudentRepo studentRepository;


	public Student saveData(Student student) {
		return studentRepository.save(student);
	}

	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}
	public Student getStudentById(Integer id) {
	    return  studentRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Student not found with id: " + id));    
	}
	
	public void deleteStudentById(Integer id) {
	 
	    studentRepository.deleteById(id);
	    
	}
	
	
	

}
