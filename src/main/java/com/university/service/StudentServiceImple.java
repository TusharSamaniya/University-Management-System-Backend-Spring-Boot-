package com.university.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.university.entity.Student;
import com.university.repository.IStudentRepository;

public class StudentServiceImple implements IStudentService {
	
	@Autowired
	private IStudentRepository studentRepo;

	@Override
	public Student registerStudentIndividual(Student student) {
		Student stud = studentRepo.save(student);
		return stud;
	}

}
