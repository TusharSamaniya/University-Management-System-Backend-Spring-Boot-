package com.university.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.entity.Student;
import com.university.repository.IStudentRepository;

@Service
public class StudentServiceImple implements IStudentService {
	
	@Autowired
	private IStudentRepository studentRepo;

	@Override
	public Student registerStudentIndividual(Student student) {
		Student stud = studentRepo.save(student);
		return stud;
	}
	
	@Override
	public Iterable<Student> getAllStudents() {
		Iterable<Student> stud = studentRepo.findAll();
		return stud;
	}
	
	@Override
	public String registerAllStudents(Iterable<Student> students) {
		Iterable<Student> stud = studentRepo.saveAll(students);
		ArrayList<Integer> arr = new ArrayList<>();
		stud.forEach(x -> arr.add(x.getStudentId()));
		return arr.toString();
	}

}
