package com.university.service;

import java.util.ArrayList;

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
	
	@Override
	public String registerAllTeacher(Iterable<Teacher> teacher) {
		Iterable<Teacher> teach = teacherRepo.saveAll(teacher);
		ArrayList<Integer> arr = new ArrayList<>();
		teach.forEach(x -> arr.add(x.getTeacherId()));
		return arr.toString();
	}
	
	@Override
	public Iterable<Teacher> getAllTeacher() {
		Iterable<Teacher> teach = teacherRepo.findAll();
		return teach;
	}

}
