package com.university.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.university.entity.Teacher;
import com.university.service.ITeacherService;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
	
	@Autowired
	private ITeacherService TeacherService;
	
	@PostMapping("/registerTeacher")
	public ResponseEntity<Teacher> storeIndividualTeacher(@RequestBody Teacher teacher){
		Teacher teach = TeacherService.registerIndividual(teacher);
		return new ResponseEntity<>(teach, HttpStatus.OK);
	}
	
	@PostMapping("/registerAllTeacher")
	public ResponseEntity<String> storeTeacherInBulk(@RequestBody Iterable<Teacher> teachar){
		String ids = TeacherService.registerAllTeacher(teachar);
		return new ResponseEntity<>(ids, HttpStatus.OK);
	}
	
	@GetMapping("/getTeacher")
	public ResponseEntity<Iterable<Teacher>> showAllTeacher(){
		Iterable<Teacher> teach = TeacherService.getAllTeacher();
		return new ResponseEntity<>(teach, HttpStatus.OK);
	}
	
	

}
