package com.university.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.entity.Alumini;
import com.university.repository.IAluminiRepository;

@Service
public class AluminiServiceImple implements IAluminiService {
	
	@Autowired
	private IAluminiRepository aluminiRepo;

	@Override
	public Alumini registerIndividualAlumini(Alumini alumini) {
		Alumini alum = aluminiRepo.save(alumini);
		return alum;
	}

	@Override
	public String registerAllAlumini(Iterable<Alumini> alumini) {
		Iterable<Alumini> alum = aluminiRepo.saveAll(alumini);
		ArrayList<Integer> arr = new ArrayList<>();
		alum.forEach(x -> arr.add(x.getAluminiId()));
		return arr.toString();
	}

	@Override
	public Iterable<Alumini> getAlumini() {
		Iterable<Alumini> alum = aluminiRepo.findAll();
		return alum;
	}

}
