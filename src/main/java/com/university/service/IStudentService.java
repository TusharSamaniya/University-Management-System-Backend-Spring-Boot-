package com.university.service;

import com.university.entity.Student;

public interface IStudentService {
	
	public Student registerStudentIndividual(Student student);
	public String registerAllStudents(Iterable<Student> students);
	public Iterable<Student> getAllStudents();

}
