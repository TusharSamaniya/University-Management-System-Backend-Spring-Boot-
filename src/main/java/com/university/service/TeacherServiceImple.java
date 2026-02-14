package com.university.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.entity.Teacher;
import com.university.repository.ITeacherRepository;

@Service
public class TeacherServiceImple implements ITeacherService {
	
	@Autowired
	private ITeacherRepository teacherRepo;

	@Override
	public Teacher registerIndividual(Teacher teacher) {
		Teacher teach = teacherRepo.save(teacher);
		return teach;
	}

}
