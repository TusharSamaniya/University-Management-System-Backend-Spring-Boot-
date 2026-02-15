package com.university.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.university.entity.Alumini;
import com.university.service.IAluminiService;

@RestController
@RequestMapping("/alumini")
public class AuminiController {
	
	@Autowired
	private IAluminiService aluminiService;
	
	@PostMapping("/registerAlumini")
	public ResponseEntity<Alumini> storeAlumini(@RequestBody Alumini alumini){
		Alumini alum = aluminiService.registerIndividualAlumini(alumini);
		return new ResponseEntity<>(alum, HttpStatus.OK);
	}
	
	@PostMapping("/registerAllAlumini")
	public ResponseEntity<String> storeAllAlumini(@RequestBody Iterable<Alumini> alumini){
		String ids = aluminiService.registerAllAlumini(alumini);
		return new ResponseEntity<>(ids, HttpStatus.OK);
	}
	
	@GetMapping("/getAlumini")
	public ResponseEntity<Iterable<Alumini>> showAlumini(){
		Iterable<Alumini> alumini = aluminiService.getAlumini();
		return new ResponseEntity<>(alumini, HttpStatus.OK);
	}

}
