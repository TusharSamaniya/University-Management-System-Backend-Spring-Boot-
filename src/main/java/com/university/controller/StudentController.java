package com.university.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.university.entity.Student;
import com.university.service.IStudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private IStudentService studentService;
	
	@PostMapping("/registerStudent")
	public ResponseEntity<Student> storeStudent(@RequestBody Student student){
		Student stud = studentService.registerStudentIndividual(student);
		return new ResponseEntity<>(stud, HttpStatus.OK);
	}
	
	@PostMapping("/registerAllStudent")
	public ResponseEntity<String> storeStudentInBulk(@RequestBody Iterable<Student> student){
		String stud = studentService.registerAllStudents(student);
		return new ResponseEntity<>(stud, HttpStatus.OK);
	}
	
	@GetMapping("/getStudents")
	public ResponseEntity<Iterable<Student>> showStudents(){
		Iterable<Student> stud = studentService.getAllStudents();
		return new ResponseEntity<>(stud, HttpStatus.OK);
	}

}
