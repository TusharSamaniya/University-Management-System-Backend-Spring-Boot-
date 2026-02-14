package com.university.service;

import com.university.entity.Teacher;

public interface ITeacherService {
	
	public Teacher registerIndividual(Teacher teacher);
	public String registerAllTeacher(Iterable<Teacher> teacher);
	public Iterable<Teacher> getAllTeacher();

}
